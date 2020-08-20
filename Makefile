ifndef version
	version=latest
endif

ifndef profile
	profile=default
endif

ifndef grpc-java-plugin
	grpc-java-plugin=./scripts/protoc-gen-grpc-java-macos
endif

.PHONY: protocol

default:
	@echo "make prepare"
	@echo "make protocol"
	@echo "make clean"

prepare:
	bash ./scripts/env.sh prepare

protocol:
	protoc --proto_path=. --python_out=./build/python --plugin=protoc-gen-grpc-java=$(grpc-java-plugin) --java_out=./build/java --grpc-java_out=./build/java --go_out=plugins=grpc:./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/common/tsl/*.proto
	protoc --proto_path=. --python_out=./build/python --plugin=protoc-gen-grpc-java=$(grpc-java-plugin) --java_out=./build/java --grpc-java_out=./build/java --go_out=plugins=grpc:./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/common/constant/*.proto
	protoc --proto_path=. --python_out=./build/python --plugin=protoc-gen-grpc-java=$(grpc-java-plugin) --java_out=./build/java --grpc-java_out=./build/java --go_out=plugins=grpc:./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/common/partner/*.proto
	protoc --proto_path=. --python_out=./build/python --plugin=protoc-gen-grpc-java=$(grpc-java-plugin) --java_out=./build/java --grpc-java_out=./build/java --go_out=plugins=grpc:./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/common/partner/china_http_api/*.proto
	protoc --proto_path=. --python_out=./build/python --plugin=protoc-gen-grpc-java=$(grpc-java-plugin) --java_out=./build/java --grpc-java_out=./build/java --go_out=plugins=grpc:./build/go --grpc-gateway_out=logtostderr=true:./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/gaia/proxy/*.proto
	protoc --proto_path=. --python_out=./build/python --plugin=protoc-gen-grpc-java=$(grpc-java-plugin) --java_out=./build/java --grpc-java_out=./build/java --go_out=plugins=grpc:./build/go --grpc-gateway_out=logtostderr=true:./build/go --swagger_out=logtostderr=true:./build/swagger ./protocol/gaia/mirror/*.proto

	python -m grpc_tools.protoc --proto_path=. --python_out=./build/python --grpc_python_out=./build/python ./protocol/gaia/proxy/gaia_proxy_grpc_service.proto
	python -m grpc_tools.protoc --proto_path=. --python_out=./build/python --grpc_python_out=./build/python ./protocol/gaia/mirror/gaia_mirror_grpc_service.proto

	cd ./build/go/tcl.com/gaia/protocol && rm -rf go.mod && go mod init tcl.com/gaia/protocol && touch version.$(version)
	cd ./build/java/com/tcl/gaia/protocol && touch version.$(version)
	cd ./build/python/protocol && touch version.$(version)
	cd ./build/swagger/protocol && touch version.$(version)

	#bash ./scripts/add_init_file.sh ./build/python/protocol
	python ./scripts/add_init_file.py  ./build/python/protocol/

clean:
	bash ./scripts/env.sh clean
	rm -rf ./build
	mkdir build
	mkdir build/go
	mkdir build/java
	mkdir build/python
	mkdir build/swagger

push:
	aws s3 sync --delete ./build s3://protocols/gaia/protocol/$(version) --exclude *.DS_Store* --region cn-north-1 --profile $(profile)
	aws s3 sync --delete ./protocol s3://protocols/gaia/protocol/$(version)/proto --exclude *.DS_Store* --region cn-north-1 --profile $(profile)