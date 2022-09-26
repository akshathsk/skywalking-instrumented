package org.apache.skywalking.satellite.envoy.accesslog.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The new Envoy ALS protocol, work for satellite transmit the ALS message to oap.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: satellite/envoy/accesslog/v3/als.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SatelliteAccessLogServiceGrpc {

  private SatelliteAccessLogServiceGrpc() {}

  public static final String SERVICE_NAME = "satellite.envoy.accesslog.v3.SatelliteAccessLogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage,
      io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> getStreamAccessLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAccessLogs",
      requestType = io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage.class,
      responseType = io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage,
      io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> getStreamAccessLogsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage, io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> getStreamAccessLogsMethod;
    if ((getStreamAccessLogsMethod = SatelliteAccessLogServiceGrpc.getStreamAccessLogsMethod) == null) {
      synchronized (SatelliteAccessLogServiceGrpc.class) {
        if ((getStreamAccessLogsMethod = SatelliteAccessLogServiceGrpc.getStreamAccessLogsMethod) == null) {
          SatelliteAccessLogServiceGrpc.getStreamAccessLogsMethod = getStreamAccessLogsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage, io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAccessLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SatelliteAccessLogServiceMethodDescriptorSupplier("StreamAccessLogs"))
              .build();
        }
      }
    }
    return getStreamAccessLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SatelliteAccessLogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SatelliteAccessLogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SatelliteAccessLogServiceStub>() {
        @java.lang.Override
        public SatelliteAccessLogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SatelliteAccessLogServiceStub(channel, callOptions);
        }
      };
    return SatelliteAccessLogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SatelliteAccessLogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SatelliteAccessLogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SatelliteAccessLogServiceBlockingStub>() {
        @java.lang.Override
        public SatelliteAccessLogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SatelliteAccessLogServiceBlockingStub(channel, callOptions);
        }
      };
    return SatelliteAccessLogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SatelliteAccessLogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SatelliteAccessLogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SatelliteAccessLogServiceFutureStub>() {
        @java.lang.Override
        public SatelliteAccessLogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SatelliteAccessLogServiceFutureStub(channel, callOptions);
        }
      };
    return SatelliteAccessLogServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The new Envoy ALS protocol, work for satellite transmit the ALS message to oap.
   * </pre>
   */
  public static abstract class SatelliteAccessLogServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Use the same parameters to transmit access log messages.
     * The only difference is that the identity information (StreamAccessLogsMessage#identity) may occur on each message.
     * Rely on the streaming messages are orderly, so there will be no problems with message processing.
     * Therefore, when the satellite transmits the ALS message, it does not need to open, send and close the stream for each different identity (envoy).
     * As a result, unnecessary streaming operation requests could be reduced, and the satellite becomes more stable when the satellite sends requests to the upstream.
     * Especially when the number of envoys increases, the optimization becomes more obvious.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage> streamAccessLogs(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamAccessLogsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamAccessLogsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage,
                io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse>(
                  this, METHODID_STREAM_ACCESS_LOGS)))
          .build();
    }
  }

  /**
   * <pre>
   * The new Envoy ALS protocol, work for satellite transmit the ALS message to oap.
   * </pre>
   */
  public static final class SatelliteAccessLogServiceStub extends io.grpc.stub.AbstractAsyncStub<SatelliteAccessLogServiceStub> {
    private SatelliteAccessLogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SatelliteAccessLogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SatelliteAccessLogServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Use the same parameters to transmit access log messages.
     * The only difference is that the identity information (StreamAccessLogsMessage#identity) may occur on each message.
     * Rely on the streaming messages are orderly, so there will be no problems with message processing.
     * Therefore, when the satellite transmits the ALS message, it does not need to open, send and close the stream for each different identity (envoy).
     * As a result, unnecessary streaming operation requests could be reduced, and the satellite becomes more stable when the satellite sends requests to the upstream.
     * Especially when the number of envoys increases, the optimization becomes more obvious.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage> streamAccessLogs(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamAccessLogsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The new Envoy ALS protocol, work for satellite transmit the ALS message to oap.
   * </pre>
   */
  public static final class SatelliteAccessLogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SatelliteAccessLogServiceBlockingStub> {
    private SatelliteAccessLogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SatelliteAccessLogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SatelliteAccessLogServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The new Envoy ALS protocol, work for satellite transmit the ALS message to oap.
   * </pre>
   */
  public static final class SatelliteAccessLogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SatelliteAccessLogServiceFutureStub> {
    private SatelliteAccessLogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SatelliteAccessLogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SatelliteAccessLogServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_ACCESS_LOGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SatelliteAccessLogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SatelliteAccessLogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_ACCESS_LOGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamAccessLogs(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SatelliteAccessLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SatelliteAccessLogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.satellite.envoy.accesslog.v3.SatelliteAlsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SatelliteAccessLogService");
    }
  }

  private static final class SatelliteAccessLogServiceFileDescriptorSupplier
      extends SatelliteAccessLogServiceBaseDescriptorSupplier {
    SatelliteAccessLogServiceFileDescriptorSupplier() {}
  }

  private static final class SatelliteAccessLogServiceMethodDescriptorSupplier
      extends SatelliteAccessLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SatelliteAccessLogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SatelliteAccessLogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SatelliteAccessLogServiceFileDescriptorSupplier())
              .addMethod(getStreamAccessLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
