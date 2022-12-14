// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Process.proto

package org.apache.skywalking.apm.network.ebpf.profiling.process.v3;

public interface EBPFProcessEntityMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.EBPFProcessEntityMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [required] Process belong layer name which define in the backend
   * </pre>
   *
   * <code>string layer = 1;</code>
   * @return The layer.
   */
  java.lang.String getLayer();
  /**
   * <pre>
   * [required] Process belong layer name which define in the backend
   * </pre>
   *
   * <code>string layer = 1;</code>
   * @return The bytes for layer.
   */
  com.google.protobuf.ByteString
      getLayerBytes();

  /**
   * <pre>
   * [required] Process belong service name
   * </pre>
   *
   * <code>string serviceName = 2;</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * [required] Process belong service name
   * </pre>
   *
   * <code>string serviceName = 2;</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * [required] Process belong service instance name
   * </pre>
   *
   * <code>string instanceName = 3;</code>
   * @return The instanceName.
   */
  java.lang.String getInstanceName();
  /**
   * <pre>
   * [required] Process belong service instance name
   * </pre>
   *
   * <code>string instanceName = 3;</code>
   * @return The bytes for instanceName.
   */
  com.google.protobuf.ByteString
      getInstanceNameBytes();

  /**
   * <pre>
   * [required] Process name
   * </pre>
   *
   * <code>string processName = 4;</code>
   * @return The processName.
   */
  java.lang.String getProcessName();
  /**
   * <pre>
   * [required] Process name
   * </pre>
   *
   * <code>string processName = 4;</code>
   * @return The bytes for processName.
   */
  com.google.protobuf.ByteString
      getProcessNameBytes();

  /**
   * <pre>
   * Process labels for aggregate from service
   * </pre>
   *
   * <code>repeated string labels = 5;</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Process labels for aggregate from service
   * </pre>
   *
   * <code>repeated string labels = 5;</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <pre>
   * Process labels for aggregate from service
   * </pre>
   *
   * <code>repeated string labels = 5;</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * Process labels for aggregate from service
   * </pre>
   *
   * <code>repeated string labels = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);
}
