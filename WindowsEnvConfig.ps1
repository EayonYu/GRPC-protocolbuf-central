# auto config windows env
. ./scripts/env.ps1 prepare
Write-Output "Your protoc_release_version is :$protoc_release_version"

if([String]::IsNullOrEmpty($protoc_release_version)){
    mkdir build
    mkdir build/go
    mkdir build/java
    mkdir build/python
    mkdir build/swagger
}


# use protoc to compile proto files
protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/common/tsl/*.proto
protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/common/constant/*.proto
protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/common/partner/*.proto
protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --grpc-gateway_out=logtostderr=true:./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/gaia/proxy/*.proto

python -m grpc_tools.protoc --proto_path=. --python_out=./build/python --grpc_python_out=./build/python ./protocol/gaia/proxy/gaia_proxy_grpc_service.proto

# clean window env
. ./scripts/env.ps1 clean

# upload file to aws s3
if([String]::IsNullOrEmpty($protoc_release_version)){
    $protoc_release_version = "latest"
}
Write-Output "Your protoc_release_version is :$protoc_release_version"
aws s3 sync --delete ./build "s3://protocols/gaia/protocol/$protoc_release_version" --exclude *.DS_Store*

# Remove-Item -Force -Recurse ./build