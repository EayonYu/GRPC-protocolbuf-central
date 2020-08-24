// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/gaia/proxy/gaia_proxy_grpc_service.proto

package com.tcl.gaia.protocol.proxy;

public final class GaiaProxyGrpcService {
  private GaiaProxyGrpcService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf service {@code protocol.gaia.proxy.GaiaProxyGrpc}
   */
  public static abstract class GaiaProxyGrpc
      implements com.google.protobuf.Service {
    protected GaiaProxyGrpc() {}

    public interface Interface {
      /**
       * <code>rpc Ping(.protocol.gaia.proxy.PingRequest) returns (.protocol.gaia.proxy.PingResponse) { ... }</code>
       */
      public abstract void ping(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.Ping.PingRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.Ping.PingResponse> done);

      /**
       * <pre>
       * partner management
       * </pre>
       *
       * <code>rpc ListPartner(.protocol.gaia.proxy.ListPartnerRequest) returns (.protocol.gaia.proxy.ListPartnerResponse) { ... }</code>
       */
      public abstract void listPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> done);

      /**
       * <code>rpc GetPartner(.protocol.gaia.proxy.GetPartnerRequest) returns (.protocol.gaia.proxy.GetPartnerResponse) { ... }</code>
       */
      public abstract void getPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> done);

      /**
       * <code>rpc AddPartner(.protocol.gaia.proxy.AddPartnerRequest) returns (.protocol.gaia.proxy.AddPartnerResponse) { ... }</code>
       */
      public abstract void addPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> done);

      /**
       * <pre>
       * proxy
       * </pre>
       *
       * <code>rpc GetUserChunks(.protocol.gaia.proxy.GetUserChunksRequest) returns (.protocol.gaia.proxy.GetUserChunksResponse) { ... }</code>
       */
      public abstract void getUserChunks(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse> done);

      /**
       * <code>rpc GetUsers(.protocol.gaia.proxy.GetUsersRequest) returns (.protocol.gaia.proxy.GetUsersResponse) { ... }</code>
       */
      public abstract void getUsers(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new GaiaProxyGrpc() {
        @java.lang.Override
        public  void ping(
            com.google.protobuf.RpcController controller,
            com.tcl.gaia.protocol.proxy.Ping.PingRequest request,
            com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.Ping.PingResponse> done) {
          impl.ping(controller, request, done);
        }

        @java.lang.Override
        public  void listPartner(
            com.google.protobuf.RpcController controller,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request,
            com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> done) {
          impl.listPartner(controller, request, done);
        }

        @java.lang.Override
        public  void getPartner(
            com.google.protobuf.RpcController controller,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request,
            com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> done) {
          impl.getPartner(controller, request, done);
        }

        @java.lang.Override
        public  void addPartner(
            com.google.protobuf.RpcController controller,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request,
            com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> done) {
          impl.addPartner(controller, request, done);
        }

        @java.lang.Override
        public  void getUserChunks(
            com.google.protobuf.RpcController controller,
            com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest request,
            com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse> done) {
          impl.getUserChunks(controller, request, done);
        }

        @java.lang.Override
        public  void getUsers(
            com.google.protobuf.RpcController controller,
            com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest request,
            com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse> done) {
          impl.getUsers(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.ping(controller, (com.tcl.gaia.protocol.proxy.Ping.PingRequest)request);
            case 1:
              return impl.listPartner(controller, (com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest)request);
            case 2:
              return impl.getPartner(controller, (com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest)request);
            case 3:
              return impl.addPartner(controller, (com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest)request);
            case 4:
              return impl.getUserChunks(controller, (com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest)request);
            case 5:
              return impl.getUsers(controller, (com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.tcl.gaia.protocol.proxy.Ping.PingRequest.getDefaultInstance();
            case 1:
              return com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest.getDefaultInstance();
            case 2:
              return com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest.getDefaultInstance();
            case 3:
              return com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest.getDefaultInstance();
            case 4:
              return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest.getDefaultInstance();
            case 5:
              return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.tcl.gaia.protocol.proxy.Ping.PingResponse.getDefaultInstance();
            case 1:
              return com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.getDefaultInstance();
            case 2:
              return com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.getDefaultInstance();
            case 3:
              return com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.getDefaultInstance();
            case 4:
              return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse.getDefaultInstance();
            case 5:
              return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc Ping(.protocol.gaia.proxy.PingRequest) returns (.protocol.gaia.proxy.PingResponse) { ... }</code>
     */
    public abstract void ping(
        com.google.protobuf.RpcController controller,
        com.tcl.gaia.protocol.proxy.Ping.PingRequest request,
        com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.Ping.PingResponse> done);

    /**
     * <pre>
     * partner management
     * </pre>
     *
     * <code>rpc ListPartner(.protocol.gaia.proxy.ListPartnerRequest) returns (.protocol.gaia.proxy.ListPartnerResponse) { ... }</code>
     */
    public abstract void listPartner(
        com.google.protobuf.RpcController controller,
        com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request,
        com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> done);

    /**
     * <code>rpc GetPartner(.protocol.gaia.proxy.GetPartnerRequest) returns (.protocol.gaia.proxy.GetPartnerResponse) { ... }</code>
     */
    public abstract void getPartner(
        com.google.protobuf.RpcController controller,
        com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request,
        com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> done);

    /**
     * <code>rpc AddPartner(.protocol.gaia.proxy.AddPartnerRequest) returns (.protocol.gaia.proxy.AddPartnerResponse) { ... }</code>
     */
    public abstract void addPartner(
        com.google.protobuf.RpcController controller,
        com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request,
        com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> done);

    /**
     * <pre>
     * proxy
     * </pre>
     *
     * <code>rpc GetUserChunks(.protocol.gaia.proxy.GetUserChunksRequest) returns (.protocol.gaia.proxy.GetUserChunksResponse) { ... }</code>
     */
    public abstract void getUserChunks(
        com.google.protobuf.RpcController controller,
        com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest request,
        com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse> done);

    /**
     * <code>rpc GetUsers(.protocol.gaia.proxy.GetUsersRequest) returns (.protocol.gaia.proxy.GetUsersResponse) { ... }</code>
     */
    public abstract void getUsers(
        com.google.protobuf.RpcController controller,
        com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest request,
        com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.ping(controller, (com.tcl.gaia.protocol.proxy.Ping.PingRequest)request,
            com.google.protobuf.RpcUtil.<com.tcl.gaia.protocol.proxy.Ping.PingResponse>specializeCallback(
              done));
          return;
        case 1:
          this.listPartner(controller, (com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest)request,
            com.google.protobuf.RpcUtil.<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse>specializeCallback(
              done));
          return;
        case 2:
          this.getPartner(controller, (com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest)request,
            com.google.protobuf.RpcUtil.<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse>specializeCallback(
              done));
          return;
        case 3:
          this.addPartner(controller, (com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest)request,
            com.google.protobuf.RpcUtil.<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse>specializeCallback(
              done));
          return;
        case 4:
          this.getUserChunks(controller, (com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest)request,
            com.google.protobuf.RpcUtil.<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse>specializeCallback(
              done));
          return;
        case 5:
          this.getUsers(controller, (com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest)request,
            com.google.protobuf.RpcUtil.<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.tcl.gaia.protocol.proxy.Ping.PingRequest.getDefaultInstance();
        case 1:
          return com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest.getDefaultInstance();
        case 2:
          return com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest.getDefaultInstance();
        case 3:
          return com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest.getDefaultInstance();
        case 4:
          return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest.getDefaultInstance();
        case 5:
          return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.tcl.gaia.protocol.proxy.Ping.PingResponse.getDefaultInstance();
        case 1:
          return com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.getDefaultInstance();
        case 2:
          return com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.getDefaultInstance();
        case 3:
          return com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.getDefaultInstance();
        case 4:
          return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse.getDefaultInstance();
        case 5:
          return com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends com.tcl.gaia.protocol.proxy.GaiaProxyGrpcService.GaiaProxyGrpc implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void ping(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.Ping.PingRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.Ping.PingResponse> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.Ping.PingResponse.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.tcl.gaia.protocol.proxy.Ping.PingResponse.class,
            com.tcl.gaia.protocol.proxy.Ping.PingResponse.getDefaultInstance()));
      }

      public  void listPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.class,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.getDefaultInstance()));
      }

      public  void getPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.class,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.getDefaultInstance()));
      }

      public  void addPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.class,
            com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.getDefaultInstance()));
      }

      public  void getUserChunks(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse.class,
            com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse.getDefaultInstance()));
      }

      public  void getUsers(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest request,
          com.google.protobuf.RpcCallback<com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse.class,
            com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public com.tcl.gaia.protocol.proxy.Ping.PingResponse ping(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.Ping.PingRequest request)
          throws com.google.protobuf.ServiceException;

      public com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse listPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request)
          throws com.google.protobuf.ServiceException;

      public com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse getPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request)
          throws com.google.protobuf.ServiceException;

      public com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse addPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request)
          throws com.google.protobuf.ServiceException;

      public com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse getUserChunks(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest request)
          throws com.google.protobuf.ServiceException;

      public com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse getUsers(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public com.tcl.gaia.protocol.proxy.Ping.PingResponse ping(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.Ping.PingRequest request)
          throws com.google.protobuf.ServiceException {
        return (com.tcl.gaia.protocol.proxy.Ping.PingResponse) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.Ping.PingResponse.getDefaultInstance());
      }


      public com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse listPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerRequest request)
          throws com.google.protobuf.ServiceException {
        return (com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.ListPartnerResponse.getDefaultInstance());
      }


      public com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse getPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerRequest request)
          throws com.google.protobuf.ServiceException {
        return (com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.GetPartnerResponse.getDefaultInstance());
      }


      public com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse addPartner(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerRequest request)
          throws com.google.protobuf.ServiceException {
        return (com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.AddPartnerResponse.getDefaultInstance());
      }


      public com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse getUserChunks(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksRequest request)
          throws com.google.protobuf.ServiceException {
        return (com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse) channel.callBlockingMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUserChunksResponse.getDefaultInstance());
      }


      public com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse getUsers(
          com.google.protobuf.RpcController controller,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersRequest request)
          throws com.google.protobuf.ServiceException {
        return (com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse) channel.callBlockingMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          com.tcl.gaia.protocol.proxy.UserOuterClass.GetUsersResponse.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:protocol.gaia.proxy.GaiaProxyGrpc)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1protocol/gaia/proxy/gaia_proxy_grpc_se" +
      "rvice.proto\022\023protocol.gaia.proxy\032\034google" +
      "/api/annotations.proto\032\036protocol/gaia/pr" +
      "oxy/ping.proto\032!protocol/gaia/proxy/part" +
      "ner.proto\032\036protocol/gaia/proxy/user.prot" +
      "o2\347\005\n\rGaiaProxyGrpc\022^\n\004Ping\022 .protocol.g" +
      "aia.proxy.PingRequest\032!.protocol.gaia.pr" +
      "oxy.PingResponse\"\021\202\323\344\223\002\013\022\t/api/ping\022w\n\013L" +
      "istPartner\022\'.protocol.gaia.proxy.ListPar" +
      "tnerRequest\032(.protocol.gaia.proxy.ListPa" +
      "rtnerResponse\"\025\202\323\344\223\002\017\022\r/api/partners\022\201\001\n" +
      "\nGetPartner\022&.protocol.gaia.proxy.GetPar" +
      "tnerRequest\032\'.protocol.gaia.proxy.GetPar" +
      "tnerResponse\"\"\202\323\344\223\002\034\022\032/api/partners/{par" +
      "tner_id}\022w\n\nAddPartner\022&.protocol.gaia.p" +
      "roxy.AddPartnerRequest\032\'.protocol.gaia.p" +
      "roxy.AddPartnerResponse\"\030\202\323\344\223\002\022\"\r/api/pa" +
      "rtners:\001*\022\211\001\n\rGetUserChunks\022).protocol.g" +
      "aia.proxy.GetUserChunksRequest\032*.protoco" +
      "l.gaia.proxy.GetUserChunksResponse\"!\202\323\344\223" +
      "\002\033\"\026/api/proxy/chunks/user:\001*\022t\n\010GetUser" +
      "s\022$.protocol.gaia.proxy.GetUsersRequest\032" +
      "%.protocol.gaia.proxy.GetUsersResponse\"\033" +
      "\202\323\344\223\002\025\"\020/api/proxy/users:\001*B=\n\033com.tcl.g" +
      "aia.protocol.proxyZ\033tcl.com/gaia/protoco" +
      "l/proxy\210\001\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcl.gaia.protocol.proxy.Ping.getDescriptor(),
          com.tcl.gaia.protocol.proxy.PartnerOuterClass.getDescriptor(),
          com.tcl.gaia.protocol.proxy.UserOuterClass.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcl.gaia.protocol.proxy.Ping.getDescriptor();
    com.tcl.gaia.protocol.proxy.PartnerOuterClass.getDescriptor();
    com.tcl.gaia.protocol.proxy.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
