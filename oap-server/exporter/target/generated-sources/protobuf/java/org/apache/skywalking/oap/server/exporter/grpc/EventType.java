// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metric-exporter.proto

package org.apache.skywalking.oap.server.exporter.grpc;

/**
 * Protobuf enum {@code EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The metrics aggregated in this bulk, not include the existing persistent data.
   * </pre>
   *
   * <code>INCREMENT = 0;</code>
   */
  INCREMENT(0),
  /**
   * <pre>
   * Final result of the metrics at this moment.
   * </pre>
   *
   * <code>TOTAL = 1;</code>
   */
  TOTAL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The metrics aggregated in this bulk, not include the existing persistent data.
   * </pre>
   *
   * <code>INCREMENT = 0;</code>
   */
  public static final int INCREMENT_VALUE = 0;
  /**
   * <pre>
   * Final result of the metrics at this moment.
   * </pre>
   *
   * <code>TOTAL = 1;</code>
   */
  public static final int TOTAL_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return INCREMENT;
      case 1: return TOTAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.apache.skywalking.oap.server.exporter.grpc.MetricExporter.getDescriptor().getEnumTypes().get(1);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:EventType)
}

