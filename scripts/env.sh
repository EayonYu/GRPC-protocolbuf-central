#!/usr/bin/env bash

protoc_release_version="3.12.4"
GOPATH=$(go env GOPATH)
protobuf_go_version="v1.4.2"


function prepare() {
    if [[ $(uname -s) == "Darwin"* ]]; then
        protoc_release_file=protoc-${protoc_release_version}-osx-x86_64.zip
    elif [[ $(uname -s) == "Linux"* ]]; then
        protoc_release_file=protoc-${protoc_release_version}-linux-x86_64.zip
    else
        echo "todo with your OS"
        exit
    fi

    wget -O protoc.zip https://github.com/protocolbuffers/protobuf/releases/download/v${protoc_release_version}/${protoc_release_file}
    unzip -o protoc.zip -d _tmp_protoc/
    cp -r _tmp_protoc/include/ /usr/local/include/
    cp -r _tmp_protoc/bin/ /usr/local/bin/
    rm -f protoc.zip
    rm -rf _tmp_protoc/

    rm -rf "${GOPATH}"/src/github.com/golang/protobuf
    go get -v -d -u github.com/golang/protobuf/protoc-gen-go
    git -C "${GOPATH}"/src/github.com/golang/protobuf checkout "${protobuf_go_version}"
    go install github.com/golang/protobuf/protoc-gen-go
}

function clean() {
    rm -f protoc.zip
    rm -rf _tmp_protoc/
}


if [[ "$1" == "prepare" ]]; then
    prepare
elif [[ "$1" == "clean" ]]; then
    clean
else
    echo "todo"
fi
