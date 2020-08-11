ifndef action
	action=pull
endif

ifndef version
	version=latest
endif

default:
	@echo "make prepare"
	@echo "make protocol"

prepare:
	bash ./scripts/env.sh prepare

protocol:
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./common/tsl/*.proto
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./common/constant/*.proto
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./common/partner/*.proto
	protoc --proto_path=. --python_out=./build/python --java_out=./build/java --go_out=./build/go --swagger_out=logtostderr=true:./build/swagger ./gaia/proxy/*.proto

clean:
	bash ./scripts/env.sh clean
	rm -rf ./build
	mkdir build
	mkdir build/go
	mkdir build/java
	mkdir build/python
	mkdir build/swagger

proto:
	[ ! $(action) == "pull" ] || python .grpc.py --pull
	[ ! $(action) == "clean" ] || python .grpc.py --clean
	[ ! $(action) == "compile" ] || python .grpc.py --compile
	[ ! $(action) == "push" ] || python .grpc.py --push
	#  --grpc_out=./python --plugin=protoc-gen-grpc=`which grpc_python_plugin`
	# cd ./build/gaia/proxy && sed -i "" -E 's/import (.+_pb2.*)/from . import \1/g' *_pb2*.py


test:
	cd protocol && protoc \
	--plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java \
	-I/usr/local/include \
	-I. \
	-I$(GOPATH)/src \
	-I$(GOPATH)/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
	--go_out=plugins=grpc:../gateway/partnerproxy \
	--grpc-java_out=../src/main/java \
	--java_out=../src/main/java \
	*.proto

	cd protocol && protoc \
	-I/usr/local/include \
	-I. \
	-I$(GOPATH)/src \
	-I$(GOPATH)/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
	--go_out=plugins=grpc:./go \
	*.proto

	cd protocol && protoc \
	  -I/usr/local/include \
	  -I. \
      -I$(GOPATH)/src \
      -I$(GOPATH)/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
      --grpc-gateway_out=logtostderr=true:../gateway/partnerproxy \
      *.proto

	cd protocol && protoc \
	  -I/usr/local/include \
	  -I. \
      -I$(GOPATH)/src \
      -I$(GOPATH)/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
      --swagger_out=logtostderr=true:./swagger \
      *.proto

image:
	mvn clean package -Dmaven.test.skip=true
	cd gateway && CGO_ENABLED=0 GOOS=linux GOARCH=amd64 go build -a -ldflags '-extldflags "-static"' -o ./gateway proxy.go
	docker build -t partnerproxy:$(version) .
	docker tag partnerproxy:$(version) 836317673605.dkr.ecr.cn-north-1.amazonaws.com.cn/partnerproxy:$(version)
	aws ecr get-login-password --region cn-north-1 | docker login --username AWS --password-stdin 836317673605.dkr.ecr.cn-north-1.amazonaws.com.cn
	docker push 836317673605.dkr.ecr.cn-north-1.amazonaws.com.cn/partnerproxy:$(version)

.PHONY: default