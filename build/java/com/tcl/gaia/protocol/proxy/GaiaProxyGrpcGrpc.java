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
  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse> getPingMethod;
    if ((getPingMethod = GaiaProxyGrpcGrpc.getPingMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getPingMethod = GaiaProxyGrpcGrpc.getPingMethod) == null) {
          GaiaProxyGrpcGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest,
      com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse> getListPartnerConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPartnerConfig",
      requestType = com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest,
      com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse> getListPartnerConfigMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest, com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse> getListPartnerConfigMethod;
    if ((getListPartnerConfigMethod = GaiaProxyGrpcGrpc.getListPartnerConfigMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getListPartnerConfigMethod = GaiaProxyGrpcGrpc.getListPartnerConfigMethod) == null) {
          GaiaProxyGrpcGrpc.getListPartnerConfigMethod = getListPartnerConfigMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest, com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPartnerConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("ListPartnerConfig"))
              .build();
        }
      }
    }
    return getListPartnerConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest,
      com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse> getGetPartnerConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPartnerConfig",
      requestType = com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest,
      com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse> getGetPartnerConfigMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest, com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse> getGetPartnerConfigMethod;
    if ((getGetPartnerConfigMethod = GaiaProxyGrpcGrpc.getGetPartnerConfigMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetPartnerConfigMethod = GaiaProxyGrpcGrpc.getGetPartnerConfigMethod) == null) {
          GaiaProxyGrpcGrpc.getGetPartnerConfigMethod = getGetPartnerConfigMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest, com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPartnerConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetPartnerConfig"))
              .build();
        }
      }
    }
    return getGetPartnerConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest,
      com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse> getAddPartnerConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPartnerConfig",
      requestType = com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest,
      com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse> getAddPartnerConfigMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest, com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse> getAddPartnerConfigMethod;
    if ((getAddPartnerConfigMethod = GaiaProxyGrpcGrpc.getAddPartnerConfigMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getAddPartnerConfigMethod = GaiaProxyGrpcGrpc.getAddPartnerConfigMethod) == null) {
          GaiaProxyGrpcGrpc.getAddPartnerConfigMethod = getAddPartnerConfigMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest, com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPartnerConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("AddPartnerConfig"))
              .build();
        }
      }
    }
    return getAddPartnerConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse> getSetACMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAC",
      requestType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse> getSetACMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse> getSetACMethod;
    if ((getSetACMethod = GaiaProxyGrpcGrpc.getSetACMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getSetACMethod = GaiaProxyGrpcGrpc.getSetACMethod) == null) {
          GaiaProxyGrpcGrpc.getSetACMethod = getSetACMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("SetAC"))
              .build();
        }
      }
    }
    return getSetACMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest,
      com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse> getGetPartnerResourceIdRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPartnerResourceIdRange",
      requestType = com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest,
      com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse> getGetPartnerResourceIdRangeMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest, com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse> getGetPartnerResourceIdRangeMethod;
    if ((getGetPartnerResourceIdRangeMethod = GaiaProxyGrpcGrpc.getGetPartnerResourceIdRangeMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetPartnerResourceIdRangeMethod = GaiaProxyGrpcGrpc.getGetPartnerResourceIdRangeMethod) == null) {
          GaiaProxyGrpcGrpc.getGetPartnerResourceIdRangeMethod = getGetPartnerResourceIdRangeMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest, com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPartnerResourceIdRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetPartnerResourceIdRange"))
              .build();
        }
      }
    }
    return getGetPartnerResourceIdRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsers",
      requestType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse> getGetUsersMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse> getGetUsersMethod;
    if ((getGetUsersMethod = GaiaProxyGrpcGrpc.getGetUsersMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetUsersMethod = GaiaProxyGrpcGrpc.getGetUsersMethod) == null) {
          GaiaProxyGrpcGrpc.getGetUsersMethod = getGetUsersMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetUsers"))
              .build();
        }
      }
    }
    return getGetUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse> getGetDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevices",
      requestType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse> getGetDevicesMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse> getGetDevicesMethod;
    if ((getGetDevicesMethod = GaiaProxyGrpcGrpc.getGetDevicesMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetDevicesMethod = GaiaProxyGrpcGrpc.getGetDevicesMethod) == null) {
          GaiaProxyGrpcGrpc.getGetDevicesMethod = getGetDevicesMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetDevices"))
              .build();
        }
      }
    }
    return getGetDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse> getGetUserDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserDevice",
      requestType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest.class,
      responseType = com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest,
      com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse> getGetUserDeviceMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse> getGetUserDeviceMethod;
    if ((getGetUserDeviceMethod = GaiaProxyGrpcGrpc.getGetUserDeviceMethod) == null) {
      synchronized (GaiaProxyGrpcGrpc.class) {
        if ((getGetUserDeviceMethod = GaiaProxyGrpcGrpc.getGetUserDeviceMethod) == null) {
          GaiaProxyGrpcGrpc.getGetUserDeviceMethod = getGetUserDeviceMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest, com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GaiaProxyGrpcMethodDescriptorSupplier("GetUserDevice"))
              .build();
        }
      }
    }
    return getGetUserDeviceMethod;
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
    public void ping(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void listPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPartnerConfigMethod(), responseObserver);
    }

    /**
     */
    public void getPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPartnerConfigMethod(), responseObserver);
    }

    /**
     */
    public void addPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPartnerConfigMethod(), responseObserver);
    }

    /**
     */
    public void setAC(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetACMethod(), responseObserver);
    }

    /**
     * <pre>
     * for sync
     * </pre>
     */
    public void getPartnerResourceIdRange(com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPartnerResourceIdRangeMethod(), responseObserver);
    }

    /**
     */
    public void getUsers(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    /**
     */
    public void getDevices(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDevicesMethod(), responseObserver);
    }

    /**
     */
    public void getUserDevice(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserDeviceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest,
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getListPartnerConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest,
                com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse>(
                  this, METHODID_LIST_PARTNER_CONFIG)))
          .addMethod(
            getGetPartnerConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest,
                com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse>(
                  this, METHODID_GET_PARTNER_CONFIG)))
          .addMethod(
            getAddPartnerConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest,
                com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse>(
                  this, METHODID_ADD_PARTNER_CONFIG)))
          .addMethod(
            getSetACMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest,
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse>(
                  this, METHODID_SET_AC)))
          .addMethod(
            getGetPartnerResourceIdRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest,
                com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse>(
                  this, METHODID_GET_PARTNER_RESOURCE_ID_RANGE)))
          .addMethod(
            getGetUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest,
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse>(
                  this, METHODID_GET_USERS)))
          .addMethod(
            getGetDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest,
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse>(
                  this, METHODID_GET_DEVICES)))
          .addMethod(
            getGetUserDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest,
                com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse>(
                  this, METHODID_GET_USER_DEVICE)))
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
    public void ping(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPartnerConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPartnerConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPartnerConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAC(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetACMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * for sync
     * </pre>
     */
    public void getPartnerResourceIdRange(com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPartnerResourceIdRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsers(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDevices(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDevice(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserDeviceMethod(), getCallOptions()), request, responseObserver);
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
    public com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse ping(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse listPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPartnerConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse getPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPartnerConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse addPartnerConfig(com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPartnerConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse setAC(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetACMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * for sync
     * </pre>
     */
    public com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse getPartnerResourceIdRange(com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPartnerResourceIdRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse getUsers(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse getDevices(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDevicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse getUserDevice(com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserDeviceMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse> ping(
        com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse> listPartnerConfig(
        com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPartnerConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse> getPartnerConfig(
        com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPartnerConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse> addPartnerConfig(
        com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPartnerConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse> setAC(
        com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetACMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * for sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse> getPartnerResourceIdRange(
        com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPartnerResourceIdRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse> getUsers(
        com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse> getDevices(
        com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse> getUserDevice(
        com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_LIST_PARTNER_CONFIG = 1;
  private static final int METHODID_GET_PARTNER_CONFIG = 2;
  private static final int METHODID_ADD_PARTNER_CONFIG = 3;
  private static final int METHODID_SET_AC = 4;
  private static final int METHODID_GET_PARTNER_RESOURCE_ID_RANGE = 5;
  private static final int METHODID_GET_USERS = 6;
  private static final int METHODID_GET_DEVICES = 7;
  private static final int METHODID_GET_USER_DEVICE = 8;

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
          serviceImpl.ping((com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.PingResponse>) responseObserver);
          break;
        case METHODID_LIST_PARTNER_CONFIG:
          serviceImpl.listPartnerConfig((com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigListResponse>) responseObserver);
          break;
        case METHODID_GET_PARTNER_CONFIG:
          serviceImpl.getPartnerConfig((com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigGetResponse>) responseObserver);
          break;
        case METHODID_ADD_PARTNER_CONFIG:
          serviceImpl.addPartnerConfig((com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerConfigOuterClass.PartnerConfigAddResponse>) responseObserver);
          break;
        case METHODID_SET_AC:
          serviceImpl.setAC((com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.SetACResponse>) responseObserver);
          break;
        case METHODID_GET_PARTNER_RESOURCE_ID_RANGE:
          serviceImpl.getPartnerResourceIdRange((com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.PartnerResource.GetPartnerResourceIdRangeResponse>) responseObserver);
          break;
        case METHODID_GET_USERS:
          serviceImpl.getUsers((com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUsersResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICES:
          serviceImpl.getDevices((com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetDevicesResponse>) responseObserver);
          break;
        case METHODID_GET_USER_DEVICE:
          serviceImpl.getUserDevice((com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GetUserDeviceResponse>) responseObserver);
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
              .addMethod(getListPartnerConfigMethod())
              .addMethod(getGetPartnerConfigMethod())
              .addMethod(getAddPartnerConfigMethod())
              .addMethod(getSetACMethod())
              .addMethod(getGetPartnerResourceIdRangeMethod())
              .addMethod(getGetUsersMethod())
              .addMethod(getGetDevicesMethod())
              .addMethod(getGetUserDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
