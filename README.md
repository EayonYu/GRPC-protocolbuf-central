# protocol
This is a basic Proto files project that is dependent on other IoT4.0 projects.

It defines the language-independent objects required by other projects. Whether you use Java, Python or Go, these projects can keep the data structure consistent and exchange data efficiently.
## Doc
- [Partner API Common Objects](https://confluence.tclking.com/display/IoT4/Partner+API+Common+Objects)

## TODO
- [x] write linux/unix's env.sh & Makefile 
- [x] write Windows's env.sh & Makefile 
- [ ] maven library
- [ ] pypi library
- [ ] go package
- [ ] for all the compiled files

## MISC
### about proto version
we ALL use proto2,NOT proto3,please see : [proto version(IoT4.0)](https://confluence.tclking.com/pages/viewpage.action?pageId=20175491)


### copy golang gateway proto files to project path google
now we use github.com/grpc-ecosystem/grpc-gateway v1.14.3
```
cp -r ${GOPATH}/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/google/* ./google
```

## development env problem and solution:
- [IDEA protobuf plguin config](https://confluence.tclking.com/display/IoT4/IDEA+protobuf+plguin+config)
- [Windows&MacOS&Unix like OS env config](https://confluence.tclking.com/pages/viewpage.action?pageId=20172995)