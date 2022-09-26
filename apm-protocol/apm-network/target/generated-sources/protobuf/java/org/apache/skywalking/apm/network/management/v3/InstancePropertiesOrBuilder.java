// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: management/Management.proto

package org.apache.skywalking.apm.network.management.v3;

public interface InstancePropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.InstanceProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string service = 1;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <code>string service = 1;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <code>string serviceInstance = 2;</code>
   * @return The serviceInstance.
   */
  java.lang.String getServiceInstance();
  /**
   * <code>string serviceInstance = 2;</code>
   * @return The bytes for serviceInstance.
   */
  com.google.protobuf.ByteString
      getServiceInstanceBytes();

  /**
   * <code>repeated .skywalking.v3.KeyStringValuePair properties = 3;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.common.v3.KeyStringValuePair> 
      getPropertiesList();
  /**
   * <code>repeated .skywalking.v3.KeyStringValuePair properties = 3;</code>
   */
  org.apache.skywalking.apm.network.common.v3.KeyStringValuePair getProperties(int index);
  /**
   * <code>repeated .skywalking.v3.KeyStringValuePair properties = 3;</code>
   */
  int getPropertiesCount();
  /**
   * <code>repeated .skywalking.v3.KeyStringValuePair properties = 3;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.common.v3.KeyStringValuePairOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.KeyStringValuePair properties = 3;</code>
   */
  org.apache.skywalking.apm.network.common.v3.KeyStringValuePairOrBuilder getPropertiesOrBuilder(
      int index);

  /**
   * <pre>
   * Instance belong layer name which define in the backend, general is default.
   * </pre>
   *
   * <code>string layer = 4;</code>
   * @return The layer.
   */
  java.lang.String getLayer();
  /**
   * <pre>
   * Instance belong layer name which define in the backend, general is default.
   * </pre>
   *
   * <code>string layer = 4;</code>
   * @return The bytes for layer.
   */
  com.google.protobuf.ByteString
      getLayerBytes();
}