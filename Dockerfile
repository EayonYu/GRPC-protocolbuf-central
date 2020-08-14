FROM ubuntu:18.04

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

# apt-get
RUN apt-get update
RUN apt-get install -y unzip wget autoconf automake libtool curl make g++

# protoc
RUN wget -O protobuf-all-3.12.4.tar.gz https://github.com/protocolbuffers/protobuf/releases/download/v3.12.4/protobuf-all-3.12.4.tar.gz
RUN tar xzf protobuf-all-3.12.4.tar.gz
WORKDIR protobuf-3.12.4
RUN ./configure
RUN make
RUN make install
RUN ldconfig

# java
RUN apt-get install -y openjdk-8-jdk
WORKDIR /
RUN wget -O grpc-java.zip https://github.com/grpc/grpc-java/archive/v1.30.2.zip
RUN unzip -o grpc-java.zip -d grpc-java/
WORKDIR grpc-java/grpc-java-1.30.2/compiler
ENV CPLUS_INCLUDE_PATH="/protobuf-3.12.4/src/google/protobuf/io:${CPLUS_INCLUDE_PATH}"
ENV LD_LIBRARY_PATH="/protobuf-3.12.4/src/google/protobuf/io:${LD_LIBRARY_PATH}"
RUN ../gradlew java_pluginExecutable -PskipAndroid=true
RUN cp /grpc-java/grpc-java-1.30.2/compiler/build/exe/java_plugin/protoc-gen-grpc-java /

# python
WORKDIR /
RUN apt-get install -y python-pip
RUN pip install grpcio-tools==1.31.0 -i https://mirrors.aliyun.com/pypi/simple

# go
WORKDIR /
RUN wget -O go1.14.7.linux-amd64.tar.gz https://golang.org/dl/go1.14.7.linux-amd64.tar.gz
RUN tar -C /usr/local -xzf go1.14.7.linux-amd64.tar.gz
ENV PATH="/usr/local/go/bin:${PATH}"
ENV GOPATH="/root/go:${GOPATH}"
RUN apt-get install -y git
RUN rm -rf /root/go/src/github.com/golang/protobuf
RUN go get -v -d -u github.com/golang/protobuf/protoc-gen-go
RUN git -C /root/go/src/github.com/golang/protobuf checkout v1.4.2
RUN go install github.com/golang/protobuf/protoc-gen-go
RUN go get github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
RUN go get github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger

# aws
RUN curl https://s3.amazonaws.com/aws-cli/awscli-bundle.zip -o awscli-bundle.zip
RUN unzip awscli-bundle.zip
RUN ./awscli-bundle/install -i /usr/local/aws -b /usr/local/bin/aws

RUN cp /grpc-java/grpc-java-1.30.2/compiler/build/exe/java_plugin/protoc-gen-grpc-java /usr/local/bin/