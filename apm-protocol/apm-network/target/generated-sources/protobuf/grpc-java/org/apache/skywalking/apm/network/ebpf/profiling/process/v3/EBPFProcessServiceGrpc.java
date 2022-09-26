package org.apache.skywalking.apm.network.ebpf.profiling.process.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Define the detected processes and report them.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: ebpf/profiling/Process.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EBPFProcessServiceGrpc {

  private EBPFProcessServiceGrpc() {}

  public static final String SERVICE_NAME = "skywalking.v3.EBPFProcessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList,
      org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream> getReportProcessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reportProcesses",
      requestType = org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList.class,
      responseType = org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList,
      org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream> getReportProcessesMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream> getReportProcessesMethod;
    if ((getReportProcessesMethod = EBPFProcessServiceGrpc.getReportProcessesMethod) == null) {
      synchronized (EBPFProcessServiceGrpc.class) {
        if ((getReportProcessesMethod = EBPFProcessServiceGrpc.getReportProcessesMethod) == null) {
          EBPFProcessServiceGrpc.getReportProcessesMethod = getReportProcessesMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reportProcesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.getDefaultInstance()))
              .setSchemaDescriptor(new EBPFProcessServiceMethodDescriptorSupplier("reportProcesses"))
              .build();
        }
      }
    }
    return getReportProcessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList,
      org.apache.skywalking.apm.network.common.v3.Commands> getKeepAliveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "keepAlive",
      requestType = org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList,
      org.apache.skywalking.apm.network.common.v3.Commands> getKeepAliveMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList, org.apache.skywalking.apm.network.common.v3.Commands> getKeepAliveMethod;
    if ((getKeepAliveMethod = EBPFProcessServiceGrpc.getKeepAliveMethod) == null) {
      synchronized (EBPFProcessServiceGrpc.class) {
        if ((getKeepAliveMethod = EBPFProcessServiceGrpc.getKeepAliveMethod) == null) {
          EBPFProcessServiceGrpc.getKeepAliveMethod = getKeepAliveMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "keepAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new EBPFProcessServiceMethodDescriptorSupplier("keepAlive"))
              .build();
        }
      }
    }
    return getKeepAliveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EBPFProcessServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EBPFProcessServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EBPFProcessServiceStub>() {
        @java.lang.Override
        public EBPFProcessServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EBPFProcessServiceStub(channel, callOptions);
        }
      };
    return EBPFProcessServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EBPFProcessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EBPFProcessServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EBPFProcessServiceBlockingStub>() {
        @java.lang.Override
        public EBPFProcessServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EBPFProcessServiceBlockingStub(channel, callOptions);
        }
      };
    return EBPFProcessServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EBPFProcessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EBPFProcessServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EBPFProcessServiceFutureStub>() {
        @java.lang.Override
        public EBPFProcessServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EBPFProcessServiceFutureStub(channel, callOptions);
        }
      };
    return EBPFProcessServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Define the detected processes and report them.
   * </pre>
   */
  public static abstract class EBPFProcessServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Report discovered process in Rover
     * </pre>
     */
    public void reportProcesses(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportProcessesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Keep the process alive in the backend.
     * </pre>
     */
    public void keepAlive(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeepAliveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReportProcessesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList,
                org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream>(
                  this, METHODID_REPORT_PROCESSES)))
          .addMethod(
            getKeepAliveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_KEEP_ALIVE)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the detected processes and report them.
   * </pre>
   */
  public static final class EBPFProcessServiceStub extends io.grpc.stub.AbstractAsyncStub<EBPFProcessServiceStub> {
    private EBPFProcessServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EBPFProcessServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EBPFProcessServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Report discovered process in Rover
     * </pre>
     */
    public void reportProcesses(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportProcessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Keep the process alive in the backend.
     * </pre>
     */
    public void keepAlive(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeepAliveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the detected processes and report them.
   * </pre>
   */
  public static final class EBPFProcessServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EBPFProcessServiceBlockingStub> {
    private EBPFProcessServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EBPFProcessServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EBPFProcessServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Report discovered process in Rover
     * </pre>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream reportProcesses(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportProcessesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Keep the process alive in the backend.
     * </pre>
     */
    public org.apache.skywalking.apm.network.common.v3.Commands keepAlive(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeepAliveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the detected processes and report them.
   * </pre>
   */
  public static final class EBPFProcessServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EBPFProcessServiceFutureStub> {
    private EBPFProcessServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EBPFProcessServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EBPFProcessServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Report discovered process in Rover
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream> reportProcesses(
        org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportProcessesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Keep the process alive in the backend.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.v3.Commands> keepAlive(
        org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeepAliveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPORT_PROCESSES = 0;
  private static final int METHODID_KEEP_ALIVE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EBPFProcessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EBPFProcessServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REPORT_PROCESSES:
          serviceImpl.reportProcesses((org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessReportList) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream>) responseObserver);
          break;
        case METHODID_KEEP_ALIVE:
          serviceImpl.keepAlive((org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgList) request,
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EBPFProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EBPFProcessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.ebpf.profiling.process.v3.Process.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EBPFProcessService");
    }
  }

  private static final class EBPFProcessServiceFileDescriptorSupplier
      extends EBPFProcessServiceBaseDescriptorSupplier {
    EBPFProcessServiceFileDescriptorSupplier() {}
  }

  private static final class EBPFProcessServiceMethodDescriptorSupplier
      extends EBPFProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EBPFProcessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EBPFProcessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EBPFProcessServiceFileDescriptorSupplier())
              .addMethod(getReportProcessesMethod())
              .addMethod(getKeepAliveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
