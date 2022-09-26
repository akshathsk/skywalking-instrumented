// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/accesslog/v3/als.proto

package io.envoyproxy.envoy.service.accesslog.v3;

/**
 * <pre>
 * Service for streaming access logs from Envoy to an access log server.
 * </pre>
 *
 * Protobuf service {@code envoy.service.accesslog.v3.AccessLogService}
 */
public  abstract class AccessLogService
    implements com.google.protobuf.Service {
  protected AccessLogService() {}

  public interface Interface {
    /**
     * <pre>
     * Envoy will connect and send StreamAccessLogsMessage messages forever. It does not expect any
     * response to be sent as nothing would be done in the case of failure. The server should
     * disconnect if it expects Envoy to reconnect. In the future we may decide to add a different
     * API for "critical" access logs in which Envoy will buffer access logs for some period of time
     * until it gets an ACK so it could then retry. This API is designed for high throughput with the
     * expectation that it might be lossy.
     * </pre>
     *
     * <code>rpc StreamAccessLogs(stream .envoy.service.accesslog.v3.StreamAccessLogsMessage) returns (.envoy.service.accesslog.v3.StreamAccessLogsResponse);</code>
     */
    public abstract void streamAccessLogs(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new AccessLogService() {
      @java.lang.Override
      public  void streamAccessLogs(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> done) {
        impl.streamAccessLogs(controller, request, done);
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
            return impl.streamAccessLogs(controller, (io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage)request);
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
            return io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage.getDefaultInstance();
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
            return io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   * Envoy will connect and send StreamAccessLogsMessage messages forever. It does not expect any
   * response to be sent as nothing would be done in the case of failure. The server should
   * disconnect if it expects Envoy to reconnect. In the future we may decide to add a different
   * API for "critical" access logs in which Envoy will buffer access logs for some period of time
   * until it gets an ACK so it could then retry. This API is designed for high throughput with the
   * expectation that it might be lossy.
   * </pre>
   *
   * <code>rpc StreamAccessLogs(stream .envoy.service.accesslog.v3.StreamAccessLogsMessage) returns (.envoy.service.accesslog.v3.StreamAccessLogsResponse);</code>
   */
  public abstract void streamAccessLogs(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.accesslog.v3.AlsProto.getDescriptor().getServices().get(0);
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
        this.streamAccessLogs(controller, (io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse>specializeCallback(
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
        return io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage.getDefaultInstance();
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
        return io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends io.envoyproxy.envoy.service.accesslog.v3.AccessLogService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void streamAccessLogs(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.class,
          io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse streamAccessLogs(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse streamAccessLogs(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:envoy.service.accesslog.v3.AccessLogService)
}
