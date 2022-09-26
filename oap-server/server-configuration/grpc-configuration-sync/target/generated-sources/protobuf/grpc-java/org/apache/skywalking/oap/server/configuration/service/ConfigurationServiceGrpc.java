package org.apache.skywalking.oap.server.configuration.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: configuration-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConfigurationServiceGrpc {

  private ConfigurationServiceGrpc() {}

  public static final String SERVICE_NAME = "ConfigurationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest,
      org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse> getCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "call",
      requestType = org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest.class,
      responseType = org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest,
      org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse> getCallMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest, org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse> getCallMethod;
    if ((getCallMethod = ConfigurationServiceGrpc.getCallMethod) == null) {
      synchronized (ConfigurationServiceGrpc.class) {
        if ((getCallMethod = ConfigurationServiceGrpc.getCallMethod) == null) {
          ConfigurationServiceGrpc.getCallMethod = getCallMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest, org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "call"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigurationServiceMethodDescriptorSupplier("call"))
              .build();
        }
      }
    }
    return getCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest,
      org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse> getCallGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "callGroup",
      requestType = org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest.class,
      responseType = org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest,
      org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse> getCallGroupMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest, org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse> getCallGroupMethod;
    if ((getCallGroupMethod = ConfigurationServiceGrpc.getCallGroupMethod) == null) {
      synchronized (ConfigurationServiceGrpc.class) {
        if ((getCallGroupMethod = ConfigurationServiceGrpc.getCallGroupMethod) == null) {
          ConfigurationServiceGrpc.getCallGroupMethod = getCallGroupMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest, org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "callGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigurationServiceMethodDescriptorSupplier("callGroup"))
              .build();
        }
      }
    }
    return getCallGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigurationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceStub>() {
        @java.lang.Override
        public ConfigurationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigurationServiceStub(channel, callOptions);
        }
      };
    return ConfigurationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigurationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceBlockingStub>() {
        @java.lang.Override
        public ConfigurationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigurationServiceBlockingStub(channel, callOptions);
        }
      };
    return ConfigurationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigurationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfigurationServiceFutureStub>() {
        @java.lang.Override
        public ConfigurationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfigurationServiceFutureStub(channel, callOptions);
        }
      };
    return ConfigurationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConfigurationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void call(org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallMethod(), responseObserver);
    }

    /**
     */
    public void callGroup(org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest,
                org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse>(
                  this, METHODID_CALL)))
          .addMethod(
            getCallGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest,
                org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse>(
                  this, METHODID_CALL_GROUP)))
          .build();
    }
  }

  /**
   */
  public static final class ConfigurationServiceStub extends io.grpc.stub.AbstractAsyncStub<ConfigurationServiceStub> {
    private ConfigurationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigurationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigurationServiceStub(channel, callOptions);
    }

    /**
     */
    public void call(org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callGroup(org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConfigurationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConfigurationServiceBlockingStub> {
    private ConfigurationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigurationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigurationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse call(org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse callGroup(org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConfigurationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConfigurationServiceFutureStub> {
    private ConfigurationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigurationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfigurationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse> call(
        org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse> callGroup(
        org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL = 0;
  private static final int METHODID_CALL_GROUP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigurationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigurationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL:
          serviceImpl.call((org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.configuration.service.ConfigurationResponse>) responseObserver);
          break;
        case METHODID_CALL_GROUP:
          serviceImpl.callGroup((org.apache.skywalking.oap.server.configuration.service.ConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.configuration.service.GroupConfigurationResponse>) responseObserver);
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

  private static abstract class ConfigurationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigurationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.oap.server.configuration.service.ConfigurationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConfigurationService");
    }
  }

  private static final class ConfigurationServiceFileDescriptorSupplier
      extends ConfigurationServiceBaseDescriptorSupplier {
    ConfigurationServiceFileDescriptorSupplier() {}
  }

  private static final class ConfigurationServiceMethodDescriptorSupplier
      extends ConfigurationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigurationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConfigurationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigurationServiceFileDescriptorSupplier())
              .addMethod(getCallMethod())
              .addMethod(getCallGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
