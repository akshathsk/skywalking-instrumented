// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: management/Management.proto

package org.apache.skywalking.apm.network.management.v3;

public final class Management {
  private Management() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_InstanceProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_InstanceProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_InstancePingPkg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_InstancePingPkg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033management/Management.proto\022\rskywalkin" +
      "g.v3\032\023common/Common.proto\"\204\001\n\022InstancePr" +
      "operties\022\017\n\007service\030\001 \001(\t\022\027\n\017serviceInst" +
      "ance\030\002 \001(\t\0225\n\nproperties\030\003 \003(\0132!.skywalk" +
      "ing.v3.KeyStringValuePair\022\r\n\005layer\030\004 \001(\t" +
      "\"J\n\017InstancePingPkg\022\017\n\007service\030\001 \001(\t\022\027\n\017" +
      "serviceInstance\030\002 \001(\t\022\r\n\005layer\030\003 \001(\t2\265\001\n" +
      "\021ManagementService\022X\n\030reportInstanceProp" +
      "erties\022!.skywalking.v3.InstancePropertie" +
      "s\032\027.skywalking.v3.Commands\"\000\022F\n\tkeepAliv" +
      "e\022\036.skywalking.v3.InstancePingPkg\032\027.skyw" +
      "alking.v3.Commands\"\000B\213\001\n/org.apache.skyw" +
      "alking.apm.network.management.v3P\001Z6skyw" +
      "alking.apache.org/repo/goapi/collect/man" +
      "agement/v3\252\002\035SkyWalking.NetworkProtocol." +
      "V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
        });
    internal_static_skywalking_v3_InstanceProperties_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_skywalking_v3_InstanceProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_InstanceProperties_descriptor,
        new java.lang.String[] { "Service", "ServiceInstance", "Properties", "Layer", });
    internal_static_skywalking_v3_InstancePingPkg_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_skywalking_v3_InstancePingPkg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_InstancePingPkg_descriptor,
        new java.lang.String[] { "Service", "ServiceInstance", "Layer", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
