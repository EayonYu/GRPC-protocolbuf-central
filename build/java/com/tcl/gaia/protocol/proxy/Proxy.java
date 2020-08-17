// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/gaia/proxy/proxy.proto

package com.tcl.gaia.protocol.proxy;

public final class Proxy {
  private Proxy() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProxyRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.gaia.proxy.ProxyRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code protocol.gaia.proxy.ProxyRequest}
   */
  public static final class ProxyRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.gaia.proxy.ProxyRequest)
      ProxyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProxyRequest.newBuilder() to construct.
    private ProxyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProxyRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ProxyRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ProxyRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.class, com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest)) {
        return super.equals(obj);
      }
      com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest other = (com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.gaia.proxy.ProxyRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.gaia.proxy.ProxyRequest)
        com.tcl.gaia.protocol.proxy.Proxy.ProxyRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.class, com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.Builder.class);
      }

      // Construct using com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyRequest_descriptor;
      }

      @java.lang.Override
      public com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest getDefaultInstanceForType() {
        return com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest build() {
        com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest buildPartial() {
        com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest result = new com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest) {
          return mergeFrom((com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest other) {
        if (other == com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.gaia.proxy.ProxyRequest)
    }

    // @@protoc_insertion_point(class_scope:protocol.gaia.proxy.ProxyRequest)
    private static final com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest();
    }

    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ProxyRequest>
        PARSER = new com.google.protobuf.AbstractParser<ProxyRequest>() {
      @java.lang.Override
      public ProxyRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProxyRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ProxyRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProxyRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.tcl.gaia.protocol.proxy.Proxy.ProxyRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ProxyResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.gaia.proxy.ProxyResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code protocol.gaia.proxy.ProxyResponse}
   */
  public static final class ProxyResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.gaia.proxy.ProxyResponse)
      ProxyResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProxyResponse.newBuilder() to construct.
    private ProxyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProxyResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ProxyResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ProxyResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.class, com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse)) {
        return super.equals(obj);
      }
      com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse other = (com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.gaia.proxy.ProxyResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.gaia.proxy.ProxyResponse)
        com.tcl.gaia.protocol.proxy.Proxy.ProxyResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.class, com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.Builder.class);
      }

      // Construct using com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.tcl.gaia.protocol.proxy.Proxy.internal_static_protocol_gaia_proxy_ProxyResponse_descriptor;
      }

      @java.lang.Override
      public com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse getDefaultInstanceForType() {
        return com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse build() {
        com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse buildPartial() {
        com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse result = new com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse) {
          return mergeFrom((com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse other) {
        if (other == com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.gaia.proxy.ProxyResponse)
    }

    // @@protoc_insertion_point(class_scope:protocol.gaia.proxy.ProxyResponse)
    private static final com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse();
    }

    public static com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ProxyResponse>
        PARSER = new com.google.protobuf.AbstractParser<ProxyResponse>() {
      @java.lang.Override
      public ProxyResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProxyResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ProxyResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProxyResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.tcl.gaia.protocol.proxy.Proxy.ProxyResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_gaia_proxy_ProxyRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_gaia_proxy_ProxyRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_gaia_proxy_ProxyResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_gaia_proxy_ProxyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037protocol/gaia/proxy/proxy.proto\022\023proto" +
      "col.gaia.proxy\"\016\n\014ProxyRequest\"\017\n\rProxyR" +
      "esponseB:\n\033com.tcl.gaia.protocol.proxyZ\033" +
      "tcl.com/gaia/protocol/proxy"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protocol_gaia_proxy_ProxyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_gaia_proxy_ProxyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_gaia_proxy_ProxyRequest_descriptor,
        new java.lang.String[] { });
    internal_static_protocol_gaia_proxy_ProxyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protocol_gaia_proxy_ProxyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_gaia_proxy_ProxyResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
