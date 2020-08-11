ifndef version
	version=latest
endif

default:
	@echo "make prepare"
	@echo "make protocol"
	@echo "make clean"

prepare:
	bash ./scripts/env.sh prepare

protocol:
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./common/tsl/*.proto
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./common/constant/*.proto
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./common/partner/*.proto
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --grpc-gateway_out=logtostderr=true:./build/go --swagger_out=logtostderr=true:./build/swagger ./gaia/proxy/*.proto

	python -m grpc_tools.protoc --proto_path=. --python_out=./build/python --grpc_python_out=./build/python ./gaia/proxy/gaia_proxy_grpc_service.proto

clean:
	bash ./scripts/env.sh clean
	rm -rf ./build
	mkdir build
	mkdir build/go
	mkdir build/java
	mkdir build/python
	mkdir build/swagger

push:
	aws s3 sync --delete ./build s3://protocols/gaia/protocol/$(version) --exclude *.DS_Store*