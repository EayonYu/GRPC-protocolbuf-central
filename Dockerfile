FROM golang:1.14.7
ENV GOPATH /go

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

RUN ["apt-get", "update"]
RUN ["apt-get", "install", "zip", "unzip"]
RUN ["apt-get", "install", "-y", "python-pip"]

RUN ["wget", "-O", "protoc.zip", "https://github.com/protocolbuffers/protobuf/releases/download/v3.12.4/protoc-3.12.4-linux-x86_64.zip"]
RUN ["unzip", "-o", "protoc.zip", "-d", "_tmp_protoc/"]
RUN ["cp", "-r", "_tmp_protoc/include/", "/usr/local/include/"]
RUN ["cp", "-r", "_tmp_protoc/bin/", "/usr/local/bin/"]
RUN ["rm", "-f", "protoc.zip"]
RUN ["rm", "-rf", "_tmp_protoc/"]

RUN ["rm", "-rf", "/go/src/github.com/golang/protobuf"]
RUN ["go", "get", "-v", "-d", "-u", "github.com/golang/protobuf/protoc-gen-go"]
RUN ["git", "-C", "/go/src/github.com/golang/protobuf", "checkout", "v1.4.2"]
RUN ["go", "install", "github.com/golang/protobuf/protoc-gen-go"]

RUN ["pip", "install", "grpcio-tools==1.31.0", "-i", "https://mirrors.aliyun.com/pypi/simple"]

RUN ["curl", "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip", "-o", "awscliv2.zip"]
RUN ["unzip", "awscliv2.zip"]
RUN ["sh", "./aws/install"]