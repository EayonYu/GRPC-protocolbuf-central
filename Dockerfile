FROM golang:1.14.7
ENV GOPATH /go

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

CMD ["wget", "-O", "protoc.zip", "https://github.com/protocolbuffers/protobuf/releases/download/v3.12.4/protoc-3.12.4-linux-x86_64.zip"]
CMD ["unzip", "-o", "protoc.zip", "-d", "_tmp_protoc/"]
CMD ["cp", "-r", "_tmp_protoc/include/", "/usr/local/include/"]
CMD ["cp", "-r", "_tmp_protoc/bin/", "/usr/local/bin/"]
CMD ["rm", "-f", "protoc.zip"]
CMD ["rm", "-rf", "_tmp_protoc/"]

CMD ["rm", "-rf", "/go/src/github.com/golang/protobuf"]
CMD ["go", "get", "-v", "-d", "-u", "github.com/golang/protobuf/protoc-gen-go"]
CMD ["git", "-C", "/go/src/github.com/golang/protobuf", "checkout", "v1.4.2"]
CMD ["go", "install", "github.com/golang/protobuf/protoc-gen-go"]

CMD ["pip", "install", "--force-reinstall", "grpcio-tools==1.31.0"]

CMD ["curl", "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip", "-o", "awscliv2.zip"]
CMD ["unzip", "awscliv2.zip"]
CMD ["sh", "./aws/install"]