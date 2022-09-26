package org.apache.skywalking.apm.network.ebpf.profiling.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Define the Rover Process profiling task and upload profiling data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: ebpf/profiling/Profile.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EBPFProfilingServiceGrpc {

  private EBPFProfilingServiceGrpc() {}

  public static final String SERVICE_NAME = "skywalking.v3.EBPFProfilingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery,
      org.apache.skywalking.apm.network.common.v3.Commands> getQueryTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryTasks",
      requestType = org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery,
      org.apache.skywalking.apm.network.common.v3.Commands> getQueryTasksMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery, org.apache.skywalking.apm.network.common.v3.Commands> getQueryTasksMethod;
    if ((getQueryTasksMethod = EBPFProfilingServiceGrpc.getQueryTasksMethod) == null) {
      synchronized (EBPFProfilingServiceGrpc.class) {
        if ((getQueryTasksMethod = EBPFProfilingServiceGrpc.getQueryTasksMethod) == null) {
          EBPFProfilingServiceGrpc.getQueryTasksMethod = getQueryTasksMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new EBPFProfilingServiceMethodDescriptorSupplier("queryTasks"))
              .build();
        }
      }
    }
    return getQueryTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectProfilingDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "collectProfilingData",
      requestType = org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectProfilingDataMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData, org.apache.skywalking.apm.network.common.v3.Commands> getCollectProfilingDataMethod;
    if ((getCollectProfilingDataMethod = EBPFProfilingServiceGrpc.getCollectProfilingDataMethod) == null) {
      synchronized (EBPFProfilingServiceGrpc.class) {
        if ((getCollectProfilingDataMethod = EBPFProfilingServiceGrpc.getCollectProfilingDataMethod) == null) {
          EBPFProfilingServiceGrpc.getCollectProfilingDataMethod = getCollectProfilingDataMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "collectProfilingData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new EBPFProfilingServiceMethodDescriptorSupplier("collectProfilingData"))
              .build();
        }
      }
    }
    return getCollectProfilingDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EBPFProfilingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EBPFProfilingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EBPFProfilingServiceStub>() {
        @java.lang.Override
        public EBPFProfilingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EBPFProfilingServiceStub(channel, callOptions);
        }
      };
    return EBPFProfilingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EBPFProfilingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EBPFProfilingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EBPFProfilingServiceBlockingStub>() {
        @java.lang.Override
        public EBPFProfilingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EBPFProfilingServiceBlockingStub(channel, callOptions);
        }
      };
    return EBPFProfilingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EBPFProfilingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EBPFProfilingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EBPFProfilingServiceFutureStub>() {
        @java.lang.Override
        public EBPFProfilingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EBPFProfilingServiceFutureStub(channel, callOptions);
        }
      };
    return EBPFProfilingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Define the Rover Process profiling task and upload profiling data.
   * </pre>
   */
  public static abstract class EBPFProfilingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Query profiling (start or stop) tasks
     * </pre>
     */
    public void queryTasks(org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * collect profiling data
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData> collectProfilingData(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCollectProfilingDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_QUERY_TASKS)))
          .addMethod(
            getCollectProfilingDataMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_COLLECT_PROFILING_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the Rover Process profiling task and upload profiling data.
   * </pre>
   */
  public static final class EBPFProfilingServiceStub extends io.grpc.stub.AbstractAsyncStub<EBPFProfilingServiceStub> {
    private EBPFProfilingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EBPFProfilingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EBPFProfilingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query profiling (start or stop) tasks
     * </pre>
     */
    public void queryTasks(org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * collect profiling data
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingData> collectProfilingData(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCollectProfilingDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Define the Rover Process profiling task and upload profiling data.
   * </pre>
   */
  public static final class EBPFProfilingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EBPFProfilingServiceBlockingStub> {
    private EBPFProfilingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EBPFProfilingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EBPFProfilingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query profiling (start or stop) tasks
     * </pre>
     */
    public org.apache.skywalking.apm.network.common.v3.Commands queryTasks(org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTasksMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the Rover Process profiling task and upload profiling data.
   * </pre>
   */
  public static final class EBPFProfilingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EBPFProfilingServiceFutureStub> {
    private EBPFProfilingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EBPFProfilingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EBPFProfilingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query profiling (start or stop) tasks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.v3.Commands> queryTasks(
        org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTasksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_TASKS = 0;
  private static final int METHODID_COLLECT_PROFILING_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EBPFProfilingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EBPFProfilingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_TASKS:
          serviceImpl.queryTasks((org.apache.skywalking.apm.network.ebpf.profiling.v3.EBPFProfilingTaskQuery) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands>) responseObserver);
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
        case METHODID_COLLECT_PROFILING_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.collectProfilingData(
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EBPFProfilingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EBPFProfilingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.ebpf.profiling.v3.Profile.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EBPFProfilingService");
    }
  }

  private static final class EBPFProfilingServiceFileDescriptorSupplier
      extends EBPFProfilingServiceBaseDescriptorSupplier {
    EBPFProfilingServiceFileDescriptorSupplier() {}
  }

  private static final class EBPFProfilingServiceMethodDescriptorSupplier
      extends EBPFProfilingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EBPFProfilingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EBPFProfilingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EBPFProfilingServiceFileDescriptorSupplier())
              .addMethod(getQueryTasksMethod())
              .addMethod(getCollectProfilingDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
