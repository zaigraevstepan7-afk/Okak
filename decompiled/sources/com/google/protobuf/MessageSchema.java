package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import defpackage.y61;
import defpackage.yq1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
public final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z2;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        if (extensionSchema != null && extensionSchema.hasExtensions(messageLite)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasExtensions = z2;
        this.useCachedSizeField = z;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
        if (isFieldPresent(t, i) == isFieldPresent(t2, i)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t, long j) {
        return UnsafeUtil.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        y61.u(obj, "Mutating immutable message: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) {
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i3 = registers.int1;
        if (i3 >= 0 && i3 <= i2 - decodeVarint32) {
            int i4 = decodeVarint32 + i3;
            Object obj = metadata.defaultKey;
            Object obj2 = metadata.defaultValue;
            while (decodeVarint32 < i4) {
                int i5 = decodeVarint32 + 1;
                int i6 = bArr[decodeVarint32];
                if (i6 < 0) {
                    i5 = ArrayDecoders.decodeVarint32(i6, bArr, i5, registers);
                    i6 = registers.int1;
                }
                int i7 = i5;
                int i8 = i6 >>> 3;
                int i9 = i6 & 7;
                if (i8 != 1) {
                    if (i8 == 2 && i9 == metadata.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i7, i2, metadata.valueType, metadata.defaultValue.getClass(), registers);
                        obj2 = registers.object1;
                    }
                    decodeVarint32 = ArrayDecoders.skipField(i6, bArr, i7, i2, registers);
                } else if (i9 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i7, i2, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    decodeVarint32 = ArrayDecoders.skipField(i6, bArr, i7, i2, registers);
                }
            }
            if (decodeVarint32 == i4) {
                map.put(obj, obj2);
                return i4;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) {
        boolean z;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                if (registers.long1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                registers.object1 = Boolean.valueOf(z);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i, i2, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return UnsafeUtil.getDouble(t, j);
    }

    private boolean equals(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t, t2, i) || Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(t2, offset))) {
                    return false;
                }
                return true;
            case 1:
                if (!arePresentForEquals(t, t2, i) || Float.floatToIntBits(UnsafeUtil.getFloat(t, offset)) != Float.floatToIntBits(UnsafeUtil.getFloat(t2, offset))) {
                    return false;
                }
                return true;
            case 2:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                    return false;
                }
                return true;
            case 3:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                    return false;
                }
                return true;
            case 4:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                    return false;
                }
                return true;
            case 5:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                    return false;
                }
                return true;
            case 6:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                    return false;
                }
                return true;
            case 7:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getBoolean(t, offset) != UnsafeUtil.getBoolean(t2, offset)) {
                    return false;
                }
                return true;
            case 8:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                    return false;
                }
                return true;
            case 9:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                    return false;
                }
                return true;
            case 10:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                    return false;
                }
                return true;
            case 11:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                    return false;
                }
                return true;
            case 12:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                    return false;
                }
                return true;
            case 13:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                    return false;
                }
                return true;
            case 14:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                    return false;
                }
                return true;
            case 15:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                    return false;
                }
                return true;
            case 16:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                    return false;
                }
                return true;
            case 17:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                    return false;
                }
                return true;
            case 18:
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
            case 20:
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case yq1.f /* 48 */:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        if (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) {
            return ub;
        }
        return (UB) filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return UnsafeUtil.getFloat(t, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t));
    }

    private static <T> int intAt(T t, long j) {
        return UnsafeUtil.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private boolean isFieldPresent(T t, int i) {
        boolean equals;
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            int typeAndOffsetAt = typeAndOffsetAt(i);
            long offset = offset(typeAndOffsetAt);
            switch (type(typeAndOffsetAt)) {
                case 0:
                    if (Double.doubleToRawLongBits(UnsafeUtil.getDouble(t, offset)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.getFloat(t, offset)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (UnsafeUtil.getLong(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (UnsafeUtil.getLong(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (UnsafeUtil.getInt(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (UnsafeUtil.getLong(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (UnsafeUtil.getInt(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return UnsafeUtil.getBoolean(t, offset);
                case 8:
                    Object object = UnsafeUtil.getObject(t, offset);
                    if (object instanceof String) {
                        equals = ((String) object).isEmpty();
                        break;
                    } else if (object instanceof ByteString) {
                        equals = ByteString.EMPTY.equals(object);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (UnsafeUtil.getObject(t, offset) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t, offset));
                    break;
                case 11:
                    if (UnsafeUtil.getInt(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (UnsafeUtil.getInt(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (UnsafeUtil.getInt(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (UnsafeUtil.getLong(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (UnsafeUtil.getInt(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (UnsafeUtil.getLong(t, offset) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (UnsafeUtil.getObject(t, offset) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if (((1 << (presenceMaskAndOffsetAt >>> 20)) & UnsafeUtil.getInt(t, j)) == 0) {
            return false;
        }
        return true;
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        if ((i & LEGACY_ENUM_IS_CLOSED_MASK) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? r4 = 0;
        for (Object obj : forMapData.values()) {
            r4 = r4;
            if (r4 == 0) {
                r4 = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!r4.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        if (UnsafeUtil.getInt(t, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t2, presenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        if (UnsafeUtil.getInt(t, presenceMaskAndOffsetAt(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean isRequired(int i) {
        if ((i & 268435456) != 0) {
            return true;
        }
        return false;
    }

    private static <T> long longAt(T t, long j) {
        return UnsafeUtil.getLong(t, j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) {
        /*
            Method dump skipped, instructions count: 2036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, offset);
        MapFieldSchema mapFieldSchema = this.mapFieldSchema;
        if (object == null) {
            object = mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t, T t2, int i) {
        if (!isFieldPresent(t2, i)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t2, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                }
                setFieldPresent(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t, T t2, int i) {
        int numberAt = numberAt(i);
        if (!isOneofPresent(t2, numberAt, i)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t2, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t, numberAt, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                }
                setOneofPresent(t, numberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
    }

    private void mergeSingleField(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putDouble(t, offset, UnsafeUtil.getDouble(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putFloat(t, offset, UnsafeUtil.getFloat(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putBoolean(t, offset, UnsafeUtil.getBoolean(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 9:
                mergeMessage(t, t2, i);
                return;
            case 10:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 17:
                mergeMessage(t, t2, i);
                return;
            case 18:
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
            case 20:
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 42:
            case 43:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case yq1.f /* 48 */:
            case 49:
                this.listFieldSchema.mergeListsAt(t, t2, offset);
                return;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t, t2, offset);
                return;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t2, numberAt, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, numberAt, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long offset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t, int i, int i2) {
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(t, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        int[] iArr2;
        int i;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr3 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr4 = null;
        if (i2 > 0) {
            iArr = new int[i2];
        } else {
            iArr = null;
        }
        if (i3 > 0) {
            iArr4 = new int[i3];
        }
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr3, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr4[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr == null) {
            iArr = EMPTY_INT_ARRAY;
        }
        if (iArr4 == null) {
            iArr4 = EMPTY_INT_ARRAY;
        }
        int length2 = checkInitialized.length + iArr.length + iArr4.length;
        if (length2 > 0) {
            iArr2 = new int[length2];
            System.arraycopy(checkInitialized, 0, iArr2, 0, checkInitialized.length);
            System.arraycopy(iArr, 0, iArr2, checkInitialized.length, iArr.length);
            System.arraycopy(iArr4, 0, iArr2, checkInitialized.length + iArr.length, iArr4.length);
        } else {
            iArr2 = EMPTY_INT_ARRAY;
        }
        return new MessageSchema<>(iArr3, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), true, iArr2, checkInitialized.length, checkInitialized.length + iArr.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo r31, com.google.protobuf.NewInstanceSchema r32, com.google.protobuf.ListFieldSchema r33, com.google.protobuf.UnknownFieldSchema<?, ?> r34, com.google.protobuf.ExtensionSchema<?> r35, com.google.protobuf.MapFieldSchema r36) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) UnsafeUtil.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) UnsafeUtil.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) UnsafeUtil.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) UnsafeUtil.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) UnsafeUtil.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t, j, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        boolean z = true;
        switch (i7) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, Long.valueOf(registers.long1));
                unsafe.putInt(t, j2, i4);
                return decodeVarint64;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t, j, Integer.valueOf(registers.int1));
                unsafe.putInt(t, j2, i4);
                return decodeVarint32;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                if (registers.long1 == 0) {
                    z = false;
                }
                unsafe.putObject(t, j, Boolean.valueOf(z));
                unsafe.putInt(t, j2, i4);
                return decodeVarint642;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i13 = registers.int1;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, decodeVarint322, i13, Internal.UTF_8));
                    decodeVarint322 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return decodeVarint322;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t, i4, i8);
                int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, registers);
                storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge);
                return mergeMessageField;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int decodeBytes = ArrayDecoders.decodeBytes(bArr, i, registers);
                unsafe.putObject(t, j, registers.object1);
                unsafe.putInt(t, j2, i4);
                return decodeBytes;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i14 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i14)) {
                    getMutableUnknownFields(t).storeField(i3, Long.valueOf(i14));
                    return decodeVarint323;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                unsafe.putInt(t, j2, i4);
                return decodeVarint323;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t, j, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t, j2, i4);
                return decodeVarint324;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t, j2, i4);
                return decodeVarint643;
            case 68:
                if (i5 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t, i4, i8);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufList.isModifiable()) {
            protobufList = protobufList.mutableCopyWithCapacity2(protobufList.size() * 2);
            unsafe.putObject(t, j2, protobufList);
        }
        Internal.ProtobufList protobufList2 = protobufList;
        switch (i7) {
            case 18:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i, protobufList2, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeDoubleList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i, protobufList2, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFloatList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 20:
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint64List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
            case 29:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 32:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case 46:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i, protobufList2, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeFixed64List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 24:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i, protobufList2, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFixed32List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeBoolList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return ArrayDecoders.decodeStringList(i3, bArr, i, i2, protobufList2, registers);
                    }
                    return ArrayDecoders.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i5 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return ArrayDecoders.decodeBytesList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 30:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 == 2) {
                    decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList2, registers);
                } else {
                    if (i5 == 0) {
                        decodeVarint32List = ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList2, registers);
                    }
                    return i;
                }
                SchemaUtil.filterUnknownEnumList((Object) t, i4, (List<Integer>) protobufList2, getEnumFieldVerifier(i6), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt32List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 34:
            case yq1.f /* 48 */:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt64List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i >= this.minFieldNumber && i <= this.maxFieldNumber) {
            return slowPositionForFieldNumber(i, 0);
        }
        return -1;
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) {
        boolean isEnforceUtf8 = isEnforceUtf8(i);
        ListFieldSchema listFieldSchema = this.listFieldSchema;
        if (isEnforceUtf8) {
            reader.readStringListRequireUtf8(listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private void setFieldPresent(T t, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t, j));
    }

    private void setOneofPresent(T t, int i, int i2) {
        UnsafeUtil.putInt(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Laf:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            return
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Lc9:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t, int i, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t, i);
    }

    private void storeOneofMessageField(T t, int i, int i2, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i2)), obj);
        setOneofPresent(t, i, i2);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x008c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrder(T r19, com.google.protobuf.Writer r20) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x005b. Please report as an issue. */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t) {
        int i;
        int computeDoubleSize;
        int computeFloatSize;
        int computeInt64Size;
        int computeStringSize;
        int computeSizeMessage;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        int computeStringSize2;
        MessageSchema<T> messageSchema = this;
        T t2 = t;
        Unsafe unsafe = UNSAFE;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < messageSchema.buffer.length) {
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i3);
            int type = type(typeAndOffsetAt);
            int numberAt = messageSchema.numberAt(i3);
            int i7 = messageSchema.buffer[i3 + 2];
            int i8 = i7 & i2;
            if (type <= 17) {
                if (i8 != i6) {
                    if (i8 == i2) {
                        i4 = 0;
                    } else {
                        i4 = unsafe.getInt(t2, i8);
                    }
                    i6 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = i5;
            long offset = offset(typeAndOffsetAt);
            if (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) {
                i8 = 0;
            }
            switch (type) {
                case 0:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, offset);
                        if (object instanceof ByteString) {
                            computeStringSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeStringSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i5 = computeStringSize + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = i9 + computeSizeMessage;
                        break;
                    }
                    i5 = i9;
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeSizeMessage = SchemaUtil.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = i9 + computeSizeMessage;
                        break;
                    }
                    i5 = i9;
                    break;
                case 18:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 20:
                    computeSizeMessage = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                    computeSizeMessage = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                    computeSizeMessage = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 24:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 25:
                    computeSizeMessage = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 26:
                    computeSizeMessage = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t2, offset));
                    i5 = i9 + computeSizeMessage;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    computeSizeMessage = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 28:
                    computeSizeMessage = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t2, offset));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 29:
                    computeSizeMessage = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 30:
                    computeSizeMessage = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 32:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 33:
                    computeSizeMessage = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 34:
                    computeSizeMessage = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case yq1.f /* 48 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 49:
                    computeSizeMessage = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 50:
                    computeSizeMessage = messageSchema.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t2, offset), messageSchema.getMapFieldDefaultEntry(i3));
                    i5 = i9 + computeSizeMessage;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        Object object2 = unsafe.getObject(t2, offset);
                        if (object2 instanceof ByteString) {
                            computeStringSize2 = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeStringSize2 = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i5 = computeStringSize2 + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = i9 + computeSizeMessage;
                        break;
                    }
                    i5 = i9;
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeSizeMessage = SchemaUtil.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = i9 + computeSizeMessage;
                        break;
                    }
                    i5 = i9;
                    break;
                default:
                    i5 = i9;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        int unknownFieldsSerializedSize = i5 + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t2);
        if (messageSchema.hasExtensions) {
            return unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t2).getSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // com.google.protobuf.Schema
    public int hashCode(T t) {
        int i;
        int hashLong;
        int i2;
        int i3;
        int length = this.buffer.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i5);
            int numberAt = numberAt(i5);
            long offset = offset(typeAndOffsetAt);
            int i6 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)));
                    i4 = hashLong + i;
                    break;
                case 1:
                    i = i4 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t, offset));
                    i4 = hashLong + i;
                    break;
                case 2:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 3:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 4:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 5:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 6:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 7:
                    i = i4 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t, offset));
                    i4 = hashLong + i;
                    break;
                case 8:
                    i = i4 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                    i4 = hashLong + i;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t, offset);
                    if (object != null) {
                        i6 = object.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 10:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case 11:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 12:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 13:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 14:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 15:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 16:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t, offset);
                    if (object2 != null) {
                        i6 = object2.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 18:
                case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                case 20:
                case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case 42:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case yq1.f /* 48 */:
                case 49:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case 50:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t, offset)));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.unknownFieldSchema.getFromMessage(t).hashCode() + (i4 * 53);
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.checkInitializedCount) {
            int i6 = this.intArray[i4];
            int numberAt = this.numberAt(i6);
            int typeAndOffsetAt = this.typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = UNSAFE.getInt(t, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            MessageSchema<T> messageSchema = this;
            T t2 = t;
            if (isRequired(typeAndOffsetAt) && !messageSchema.isFieldPresent(t2, i6, i, i2, i9)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type != 60 && type != 68) {
                        if (type != 49) {
                            if (type == 50 && !messageSchema.isMapInitialized(t2, typeAndOffsetAt, i6)) {
                                return false;
                            }
                        }
                    } else if (messageSchema.isOneofPresent(t2, numberAt, i6) && !isInitialized(t2, typeAndOffsetAt, messageSchema.getMessageFieldSchema(i6))) {
                        return false;
                    }
                }
                if (!messageSchema.isListInitialized(t2, typeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (messageSchema.isFieldPresent(t2, i6, i, i2, i9) && !isInitialized(t2, typeAndOffsetAt, messageSchema.getMessageFieldSchema(i6))) {
                return false;
            }
            i4++;
            this = messageSchema;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        MessageSchema<T> messageSchema2 = this;
        T t3 = t;
        if (messageSchema2.hasExtensions && !messageSchema2.extensionSchema.getExtensions(t3).isInitialized()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t) {
        if (isMutable(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i = 0; i < length; i += 3) {
                int typeAndOffsetAt = typeAndOffsetAt(i);
                long offset = offset(typeAndOffsetAt);
                int type = type(typeAndOffsetAt);
                if (type != 9) {
                    if (type != 60 && type != 68) {
                        switch (type) {
                            case 18:
                            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                            case 20:
                            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case 30:
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            case 38:
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            case 42:
                            case 43:
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case yq1.f /* 48 */:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t, offset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t, offset);
                                if (object != null) {
                                    unsafe.putObject(t, offset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (isOneofPresent(t, numberAt(i), i)) {
                        getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, offset));
                    }
                }
                if (isFieldPresent(t, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, offset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        checkMutable(t);
        t2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0422  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else {
            writeFieldsInAscendingOrder(t, writer);
        }
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        checkMutable(t);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) {
        parseMessage(t, bArr, i, i2, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(t, i);
        }
        return (i3 & i4) != 0;
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t, t2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }
}
