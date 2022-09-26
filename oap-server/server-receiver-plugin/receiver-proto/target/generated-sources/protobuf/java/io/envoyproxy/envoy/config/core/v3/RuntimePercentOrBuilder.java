// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

public interface RuntimePercentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.RuntimePercent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default value if runtime value is not available.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent default_value = 1;</code>
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   * <pre>
   * Default value if runtime value is not available.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent default_value = 1;</code>
   * @return The defaultValue.
   */
  io.envoyproxy.envoy.type.v3.Percent getDefaultValue();
  /**
   * <pre>
   * Default value if runtime value is not available.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent default_value = 1;</code>
   */
  io.envoyproxy.envoy.type.v3.PercentOrBuilder getDefaultValueOrBuilder();

  /**
   * <pre>
   * Runtime key to get value for comparison. This value is used if defined.
   * </pre>
   *
   * <code>string runtime_key = 2 [(.validate.rules) = { ... }</code>
   * @return The runtimeKey.
   */
  java.lang.String getRuntimeKey();
  /**
   * <pre>
   * Runtime key to get value for comparison. This value is used if defined.
   * </pre>
   *
   * <code>string runtime_key = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for runtimeKey.
   */
  com.google.protobuf.ByteString
      getRuntimeKeyBytes();
}