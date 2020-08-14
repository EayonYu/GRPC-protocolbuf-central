package com.tcl.gaia.protocol.mirror;

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
    comments = "Source: protocol/gaia/mirror/gaia_mirror_grpc_service.proto")
public final class MirrorGrpc {

  private MirrorGrpc() {}

  public static final String SERVICE_NAME = "protocol.gaia.mirror.Mirror";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest,
      com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest.class,
      responseType = com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest,
      com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest, com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse> getPingMethod;
    if ((getPingMethod = MirrorGrpc.getPingMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getPingMethod = MirrorGrpc.getPingMethod) == null) {
          MirrorGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest, com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest,
      com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse> getGetUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserList",
      requestType = com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest.class,
      responseType = com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest,
      com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse> getGetUserListMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest, com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse> getGetUserListMethod;
    if ((getGetUserListMethod = MirrorGrpc.getGetUserListMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getGetUserListMethod = MirrorGrpc.getGetUserListMethod) == null) {
          MirrorGrpc.getGetUserListMethod = getGetUserListMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest, com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("GetUserList"))
              .build();
        }
      }
    }
    return getGetUserListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse> getGetDevicesByPartnerUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevicesByPartnerUser",
      requestType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest.class,
      responseType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse> getGetDevicesByPartnerUserMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse> getGetDevicesByPartnerUserMethod;
    if ((getGetDevicesByPartnerUserMethod = MirrorGrpc.getGetDevicesByPartnerUserMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getGetDevicesByPartnerUserMethod = MirrorGrpc.getGetDevicesByPartnerUserMethod) == null) {
          MirrorGrpc.getGetDevicesByPartnerUserMethod = getGetDevicesByPartnerUserMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevicesByPartnerUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("GetDevicesByPartnerUser"))
              .build();
        }
      }
    }
    return getGetDevicesByPartnerUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse> getGetPartnerDevicesByIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPartnerDevicesByIds",
      requestType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest.class,
      responseType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse> getGetPartnerDevicesByIdsMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse> getGetPartnerDevicesByIdsMethod;
    if ((getGetPartnerDevicesByIdsMethod = MirrorGrpc.getGetPartnerDevicesByIdsMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getGetPartnerDevicesByIdsMethod = MirrorGrpc.getGetPartnerDevicesByIdsMethod) == null) {
          MirrorGrpc.getGetPartnerDevicesByIdsMethod = getGetPartnerDevicesByIdsMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPartnerDevicesByIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("GetPartnerDevicesByIds"))
              .build();
        }
      }
    }
    return getGetPartnerDevicesByIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest,
      com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse> getGetUsersRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersRange",
      requestType = com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest.class,
      responseType = com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest,
      com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse> getGetUsersRangeMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest, com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse> getGetUsersRangeMethod;
    if ((getGetUsersRangeMethod = MirrorGrpc.getGetUsersRangeMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getGetUsersRangeMethod = MirrorGrpc.getGetUsersRangeMethod) == null) {
          MirrorGrpc.getGetUsersRangeMethod = getGetUsersRangeMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest, com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsersRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("GetUsersRange"))
              .build();
        }
      }
    }
    return getGetUsersRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse> getGetDevicesRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevicesRange",
      requestType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest.class,
      responseType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse> getGetDevicesRangeMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse> getGetDevicesRangeMethod;
    if ((getGetDevicesRangeMethod = MirrorGrpc.getGetDevicesRangeMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getGetDevicesRangeMethod = MirrorGrpc.getGetDevicesRangeMethod) == null) {
          MirrorGrpc.getGetDevicesRangeMethod = getGetDevicesRangeMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevicesRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("GetDevicesRange"))
              .build();
        }
      }
    }
    return getGetDevicesRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse> getGetUserDevicesRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserDevicesRange",
      requestType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest.class,
      responseType = com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest,
      com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse> getGetUserDevicesRangeMethod() {
    io.grpc.MethodDescriptor<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse> getGetUserDevicesRangeMethod;
    if ((getGetUserDevicesRangeMethod = MirrorGrpc.getGetUserDevicesRangeMethod) == null) {
      synchronized (MirrorGrpc.class) {
        if ((getGetUserDevicesRangeMethod = MirrorGrpc.getGetUserDevicesRangeMethod) == null) {
          MirrorGrpc.getGetUserDevicesRangeMethod = getGetUserDevicesRangeMethod =
              io.grpc.MethodDescriptor.<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest, com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserDevicesRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MirrorMethodDescriptorSupplier("GetUserDevicesRange"))
              .build();
        }
      }
    }
    return getGetUserDevicesRangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MirrorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MirrorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MirrorStub>() {
        @java.lang.Override
        public MirrorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MirrorStub(channel, callOptions);
        }
      };
    return MirrorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MirrorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MirrorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MirrorBlockingStub>() {
        @java.lang.Override
        public MirrorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MirrorBlockingStub(channel, callOptions);
        }
      };
    return MirrorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MirrorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MirrorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MirrorFutureStub>() {
        @java.lang.Override
        public MirrorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MirrorFutureStub(channel, callOptions);
        }
      };
    return MirrorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MirrorImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void getUserList(com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserListMethod(), responseObserver);
    }

    /**
     */
    public void getDevicesByPartnerUser(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDevicesByPartnerUserMethod(), responseObserver);
    }

    /**
     */
    public void getPartnerDevicesByIds(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPartnerDevicesByIdsMethod(), responseObserver);
    }

    /**
     */
    public void getUsersRange(com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersRangeMethod(), responseObserver);
    }

    /**
     */
    public void getDevicesRange(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDevicesRangeMethod(), responseObserver);
    }

    /**
     */
    public void getUserDevicesRange(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserDevicesRangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest,
                com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getGetUserListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest,
                com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse>(
                  this, METHODID_GET_USER_LIST)))
          .addMethod(
            getGetDevicesByPartnerUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest,
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse>(
                  this, METHODID_GET_DEVICES_BY_PARTNER_USER)))
          .addMethod(
            getGetPartnerDevicesByIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest,
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse>(
                  this, METHODID_GET_PARTNER_DEVICES_BY_IDS)))
          .addMethod(
            getGetUsersRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest,
                com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse>(
                  this, METHODID_GET_USERS_RANGE)))
          .addMethod(
            getGetDevicesRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest,
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse>(
                  this, METHODID_GET_DEVICES_RANGE)))
          .addMethod(
            getGetUserDevicesRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest,
                com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse>(
                  this, METHODID_GET_USER_DEVICES_RANGE)))
          .build();
    }
  }

  /**
   */
  public static final class MirrorStub extends io.grpc.stub.AbstractAsyncStub<MirrorStub> {
    private MirrorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MirrorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MirrorStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserList(com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDevicesByPartnerUser(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDevicesByPartnerUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPartnerDevicesByIds(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPartnerDevicesByIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersRange(com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDevicesRange(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDevicesRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDevicesRange(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest request,
        io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserDevicesRangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MirrorBlockingStub extends io.grpc.stub.AbstractBlockingStub<MirrorBlockingStub> {
    private MirrorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MirrorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MirrorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse ping(com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse getUserList(com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse getDevicesByPartnerUser(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDevicesByPartnerUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse getPartnerDevicesByIds(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPartnerDevicesByIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse getUsersRange(com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse getDevicesRange(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDevicesRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse getUserDevicesRange(com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserDevicesRangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MirrorFutureStub extends io.grpc.stub.AbstractFutureStub<MirrorFutureStub> {
    private MirrorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MirrorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MirrorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse> ping(
        com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse> getUserList(
        com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse> getDevicesByPartnerUser(
        com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDevicesByPartnerUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse> getPartnerDevicesByIds(
        com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPartnerDevicesByIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse> getUsersRange(
        com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse> getDevicesRange(
        com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDevicesRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse> getUserDevicesRange(
        com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserDevicesRangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_USER_LIST = 1;
  private static final int METHODID_GET_DEVICES_BY_PARTNER_USER = 2;
  private static final int METHODID_GET_PARTNER_DEVICES_BY_IDS = 3;
  private static final int METHODID_GET_USERS_RANGE = 4;
  private static final int METHODID_GET_DEVICES_RANGE = 5;
  private static final int METHODID_GET_USER_DEVICES_RANGE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MirrorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MirrorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.PingResponse>) responseObserver);
          break;
        case METHODID_GET_USER_LIST:
          serviceImpl.getUserList((com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUserListResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICES_BY_PARTNER_USER:
          serviceImpl.getDevicesByPartnerUser((com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesByPartnerUserResponse>) responseObserver);
          break;
        case METHODID_GET_PARTNER_DEVICES_BY_IDS:
          serviceImpl.getPartnerDevicesByIds((com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetPartnerDevicesByIdsResponse>) responseObserver);
          break;
        case METHODID_GET_USERS_RANGE:
          serviceImpl.getUsersRange((com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.UserOuterClass.GetUsersRangeResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICES_RANGE:
          serviceImpl.getDevicesRange((com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetDevicesRangeResponse>) responseObserver);
          break;
        case METHODID_GET_USER_DEVICES_RANGE:
          serviceImpl.getUserDevicesRange((com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcl.gaia.protocol.mirror.DeviceOuterClass.GetUserDevicesRangeResponse>) responseObserver);
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

  private static abstract class MirrorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MirrorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcl.gaia.protocol.mirror.GaiaMirrorGrpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Mirror");
    }
  }

  private static final class MirrorFileDescriptorSupplier
      extends MirrorBaseDescriptorSupplier {
    MirrorFileDescriptorSupplier() {}
  }

  private static final class MirrorMethodDescriptorSupplier
      extends MirrorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MirrorMethodDescriptorSupplier(String methodName) {
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
      synchronized (MirrorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MirrorFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getGetUserListMethod())
              .addMethod(getGetDevicesByPartnerUserMethod())
              .addMethod(getGetPartnerDevicesByIdsMethod())
              .addMethod(getGetUsersRangeMethod())
              .addMethod(getGetDevicesRangeMethod())
              .addMethod(getGetUserDevicesRangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
