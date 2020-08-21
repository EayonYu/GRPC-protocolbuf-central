package com.tcl.gaia.protocol.proxy;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.1)",
    comments = "Source: protocol/gaia/proxy/gaia_proxy_grpc_service.proto")
public final class GaiaProxyGrpcGrpc {

  private GaiaProxyGrpcGrpc() {}

  public static final String SERVICE_NAME = "protocol.gaia.proxy.GaiaProxyGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Ping.PingRequest,
      com.tcl.gaia.protocol.proxy.Ping.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.tcl.gaia.protocol.proxy.Ping.PingRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.Ping.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Ping.PingRequest,
      com.tcl.gaia.protocol.proxy.Ping.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Ping.PingRequest, com.tcl.gaia.protocol.proxy.Ping.PingResponse> getPingMethod;
    if ((getPingMethod = GaiaProxyGrpcGrpc.getPingMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getPingMethod = GaiaProxyGrpcGrpc.getPingMethod) == null) {
          GaiaProxyGrpcGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.Ping.PingRequest, com.tcl.gaia.protocol.proxy.Ping.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Ping.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Ping.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest,
      com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> getListPartnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPartner",
      requestType = com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest,
      com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> getListPartnerMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest, com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> getListPartnerMethod;
    if ((getListPartnerMethod = GaiaProxyGrpcGrpc.getListPartnerMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getListPartnerMethod = GaiaProxyGrpcGrpc.getListPartnerMethod) == null) {
          GaiaProxyGrpcGrpc.getListPartnerMethod = getListPartnerMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest, com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPartner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("ListPartner"))
              .build();
        }
      }
    }
    return getListPartnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest,
      com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> getGetPartnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPartner",
      requestType = com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest,
      com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> getGetPartnerMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest, com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> getGetPartnerMethod;
    if ((getGetPartnerMethod = GaiaProxyGrpcGrpc.getGetPartnerMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetPartnerMethod = GaiaProxyGrpcGrpc.getGetPartnerMethod) == null) {
          GaiaProxyGrpcGrpc.getGetPartnerMethod = getGetPartnerMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest, com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPartner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetPartner"))
              .build();
        }
      }
    }
    return getGetPartnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest,
      com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> getAddPartnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPartner",
      requestType = com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest,
      com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> getAddPartnerMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest, com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> getAddPartnerMethod;
    if ((getAddPartnerMethod = GaiaProxyGrpcGrpc.getAddPartnerMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getAddPartnerMethod = GaiaProxyGrpcGrpc.getAddPartnerMethod) == null) {
          GaiaProxyGrpcGrpc.getAddPartnerMethod = getAddPartnerMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest, com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPartner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("AddPartner"))
              .build();
        }
      }
    }
    return getAddPartnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest,
      com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse> getProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proxy",
      requestType = com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest,
      com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse> getProxyMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest, com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse> getProxyMethod;
    if ((getProxyMethod = GaiaProxyGrpcGrpc.getProxyMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getProxyMethod = GaiaProxyGrpcGrpc.getProxyMethod) == null) {
          GaiaProxyGrpcGrpc.getProxyMethod = getProxyMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest, com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("Proxy"))
              .build();
        }
      }
    }
    return getProxyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest,
      com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse> getGetResourceChunksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResourceChunks",
      requestType = com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest,
      com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse> getGetResourceChunksMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest, com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse> getGetResourceChunksMethod;
    if ((getGetResourceChunksMethod = GaiaProxyGrpcGrpc.getGetResourceChunksMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetResourceChunksMethod = GaiaProxyGrpcGrpc.getGetResourceChunksMethod) == null) {
          GaiaProxyGrpcGrpc.getGetResourceChunksMethod = getGetResourceChunksMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest, com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResourceChunks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetResourceChunks"))
              .build();
        }
      }
    }
    return getGetResourceChunksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest,
      com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse> getGetResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResources",
      requestType = com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest,
      com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse> getGetResourcesMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest, com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse> getGetResourcesMethod;
    if ((getGetResourcesMethod = GaiaProxyGrpcGrpc.getGetResourcesMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetResourcesMethod = GaiaProxyGrpcGrpc.getGetResourcesMethod) == null) {
          GaiaProxyGrpcGrpc.getGetResourcesMethod = getGetResourcesMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest, com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetResources"))
              .build();
        }
      }
    }
    return getGetResourcesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GaiaProxyGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GaiaProxyGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GaiaProxyGrpcStub>() {
        @java.lang.Override
        public GaiaProxyGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GaiaProxyGrpcStub(channel, callOptions);
        }
      };
    return GaiaProxyGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GaiaProxyGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GaiaProxyGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GaiaProxyGrpcBlockingStub>() {
        @java.lang.Override
        public GaiaProxyGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GaiaProxyGrpcBlockingStub(channel, callOptions);
        }
      };
    return GaiaProxyGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GaiaProxyGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GaiaProxyGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GaiaProxyGrpcFutureStub>() {
        @java.lang.Override
        public GaiaProxyGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GaiaProxyGrpcFutureStub(channel, callOptions);
        }
      };
    return GaiaProxyGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GaiaProxyGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.tcl.gaia.protocol.proxy.Ping.PingRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Ping.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * partner management
     * </pre>
     */
    public void listPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPartnerMethod(), responseObserver);
    }

    /**
     */
    public void getPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPartnerMethod(), responseObserver);
    }

    /**
     */
    public void addPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPartnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * proxy
     * </pre>
     */
    public void proxy(com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProxyMethod(), responseObserver);
    }

    /**
     */
    public void getResourceChunks(com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResourceChunksMethod(), responseObserver);
    }

    /**
     */
    public void getResources(com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResourcesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.Ping.PingRequest,
                com.tcl.gaia.protocol.proxy.Ping.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getListPartnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest,
                com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse>(
                  this, METHODID_LIST_PARTNER)))
          .addMethod(
            getGetPartnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest,
                com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse>(
                  this, METHODID_GET_PARTNER)))
          .addMethod(
            getAddPartnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest,
                com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse>(
                  this, METHODID_ADD_PARTNER)))
          .addMethod(
            getProxyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest,
                com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse>(
                  this, METHODID_PROXY)))
          .addMethod(
            getGetResourceChunksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest,
                com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse>(
                  this, METHODID_GET_RESOURCE_CHUNKS)))
          .addMethod(
            getGetResourcesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest,
                com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse>(
                  this, METHODID_GET_RESOURCES)))
          .build();
    }
  }

  /**
   */
  public static final class GaiaProxyGrpcStub extends io.grpc.stub.AbstractAsyncStub<GaiaProxyGrpcStub> {
    private GaiaProxyGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GaiaProxyGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GaiaProxyGrpcStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.tcl.gaia.protocol.proxy.Ping.PingRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Ping.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * partner management
     * </pre>
     */
    public void listPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPartnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPartnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPartnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * proxy
     * </pre>
     */
    public void proxy(com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProxyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResourceChunks(com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResourceChunksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResources(com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResourcesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GaiaProxyGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<GaiaProxyGrpcBlockingStub> {
    private GaiaProxyGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GaiaProxyGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GaiaProxyGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.Ping.PingResponse ping(com.tcl.gaia.protocol.proxy.Ping.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * partner management
     * </pre>
     */
    public com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse listPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPartnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse getPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPartnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse addPartner(com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPartnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * proxy
     * </pre>
     */
    public com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse proxy(com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getProxyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse getResourceChunks(com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetResourceChunksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse getResources(com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetResourcesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GaiaProxyGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<GaiaProxyGrpcFutureStub> {
    private GaiaProxyGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GaiaProxyGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GaiaProxyGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.Ping.PingResponse> ping(
        com.tcl.gaia.protocol.proxy.Ping.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * partner management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> listPartner(
        com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPartnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> getPartner(
        com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPartnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> addPartner(
        com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPartnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse> proxy(
        com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProxyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse> getResourceChunks(
        com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResourceChunksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse> getResources(
        com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResourcesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_LIST_PARTNER = 1;
  private static final int METHODID_GET_PARTNER = 2;
  private static final int METHODID_ADD_PARTNER = 3;
  private static final int METHODID_PROXY = 4;
  private static final int METHODID_GET_RESOURCE_CHUNKS = 5;
  private static final int METHODID_GET_RESOURCES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GaiaProxyGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GaiaProxyGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.tcl.gaia.protocol.proxy.Ping.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Ping.PingResponse>) responseObserver);
          break;
        case METHODID_LIST_PARTNER:
          serviceImpl.listPartner((com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse>) responseObserver);
          break;
        case METHODID_GET_PARTNER:
          serviceImpl.getPartner((com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse>) responseObserver);
          break;
        case METHODID_ADD_PARTNER:
          serviceImpl.addPartner((com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse>) responseObserver);
          break;
        case METHODID_PROXY:
          serviceImpl.proxy((com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_CHUNKS:
          serviceImpl.getResourceChunks((com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.GetResourceChunksResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCES:
          serviceImpl.getResources((com.tcl.gaia.protocol.proxy.Proxy.GetResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.Proxy.GetResourcesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GaiaProxyGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GaiaProxyGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GaiaProxyGrpc");
    }
  }

  private static final class GaiaProxyGrpcFileDescriptorSupplier
      extends GaiaProxyGrpcBaseDescriptorSupplier {
    GaiaProxyGrpcFileDescriptorSupplier() {}
  }

  private static final class GaiaProxyGrpcMethodDescriptorSupplier
      extends GaiaProxyGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GaiaProxyGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GaiaProxyGrpcFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getListPartnerMethod())
              .addMethod(getGetPartnerMethod())
              .addMethod(getAddPartnerMethod())
              .addMethod(getProxyMethod())
              .addMethod(getGetResourceChunksMethod())
              .addMethod(getGetResourcesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
