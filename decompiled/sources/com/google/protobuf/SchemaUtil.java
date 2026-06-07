package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import defpackage.se;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
public final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite, Schema schema) {
        return (CodedOutputStream.computeTagSize(i) * 2) + computeGroupSizeNoTag(messageLite, schema);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    public static int computeMessageSize(int i, AbstractMessageLite abstractMessageLite, Schema schema) {
        return CodedOutputStream.computeTagSize(i) + computeMessageSizeNoTag(abstractMessageLite, schema);
    }

    public static int computeMessageSizeNoTag(AbstractMessageLite abstractMessageLite, Schema schema) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(abstractMessageLite.getSerializedSize(schema));
    }

    public static int computeSizeBoolList(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(size) + CodedOutputStream.computeTagSize(i);
        }
        return CodedOutputStream.computeBoolSize(i, true) * size;
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            computeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i2));
        }
        return computeTagSize;
    }

    public static int computeSizeEnumList(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * size) + computeSizeEnumListNoTag;
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeEnumSizeNoTag(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static int computeSizeFixed32List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) + CodedOutputStream.computeTagSize(i);
        }
        return CodedOutputStream.computeFixed32Size(i, 0) * size;
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) + CodedOutputStream.computeTagSize(i);
        }
        return CodedOutputStream.computeFixed64Size(i, 0L) * size;
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.computeGroupSize(i, list.get(i3));
        }
        return i2;
    }

    public static int computeSizeInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * size) + computeSizeInt32ListNoTag;
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt32SizeNoTag(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static int computeSizeInt64List(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * list.size()) + computeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt64SizeNoTag(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static int computeSizeMessage(int i, Object obj, Schema<?> schema) {
        if (obj instanceof LazyFieldLite) {
            return ((LazyFieldLite) obj).computeSize(i);
        }
        return computeMessageSize(i, (AbstractMessageLite) obj, schema);
    }

    public static int computeSizeMessageList(int i, List<?> list) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof LazyFieldLite) {
                computeMessageSizeNoTag = ((LazyFieldLite) obj).computeSizeNoTag();
            } else {
                computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            }
            computeTagSize = computeMessageSizeNoTag + computeTagSize;
        }
        return computeTagSize;
    }

    public static int computeSizeSInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * size) + computeSizeSInt32ListNoTag;
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static int computeSizeSInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * size) + computeSizeSInt64ListNoTag;
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static int computeSizeStringList(int i, List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < size) {
                Object raw = lazyStringList.getRaw(i2);
                if (raw instanceof ByteString) {
                    computeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                } else {
                    computeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                computeTagSize = computeStringSizeNoTag2 + computeTagSize;
                i2++;
            }
            return computeTagSize;
        }
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof ByteString) {
                computeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
            } else {
                computeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
            }
            computeTagSize = computeStringSizeNoTag + computeTagSize;
            i2++;
        }
        return computeTagSize;
    }

    public static int computeSizeUInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * size) + computeSizeUInt32ListNoTag;
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i).intValue());
            i++;
        }
        return i3;
    }

    public static int computeSizeUInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * size) + computeSizeUInt64ListNoTag;
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i).longValue());
            i++;
        }
        return i3;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int intValue = num.intValue();
                if (enumLiteMap.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, intValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (enumLiteMap.findValueByNumber(intValue2) == null) {
                ub = (UB) storeUnknownEnum(obj, i, intValue2, ub, unknownFieldSchema);
                it.remove();
            }
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        if (Android.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        if (Android.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t, T t2) {
        FieldSet<FT> extensions = extensionSchema.getExtensions(t2);
        if (!extensions.isEmpty()) {
            extensionSchema.getMutableExtensions(t).mergeFrom(extensions);
        }
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t, T t2, long j) {
        UnsafeUtil.putObject(t, j, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t, j), UnsafeUtil.getObject(t2, j)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, T t2) {
        unknownFieldSchema.setToMessage(t, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t), unknownFieldSchema.getFromMessage(t2)));
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && !Android.assumeLiteRuntime && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            se.h("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i2 - i;
        long j2 = i3;
        if (j + 10 <= ((j2 + 3) * 3) + (2 * j2) + 3) {
            return true;
        }
        return false;
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub, i, i2);
        return ub;
    }

    public static String toCamelCase(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ('a' <= charAt && charAt <= 'z') {
                if (z) {
                    sb.append((char) (charAt - ' '));
                } else {
                    sb.append(charAt);
                }
            } else if ('A' <= charAt && charAt <= 'Z') {
                if (i == 0 && !z) {
                    sb.append((char) (charAt + ' '));
                } else {
                    sb.append(charAt);
                }
            } else {
                if ('0' <= charAt && charAt <= '9') {
                    sb.append(charAt);
                }
                z = true;
            }
            z = false;
        }
        return sb.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i, boolean z, Writer writer) {
        if (z) {
            writer.writeBool(i, true);
        }
    }

    public static void writeBoolList(int i, List<Boolean> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeBoolList(i, list, z);
        }
    }

    public static void writeBytes(int i, ByteString byteString, Writer writer) {
        if (byteString != null && !byteString.isEmpty()) {
            writer.writeBytes(i, byteString);
        }
    }

    public static void writeBytesList(int i, List<ByteString> list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.writeBytesList(i, list);
        }
    }

    public static void writeDouble(int i, double d, Writer writer) {
        if (Double.doubleToRawLongBits(d) != 0) {
            writer.writeDouble(i, d);
        }
    }

    public static void writeDoubleList(int i, List<Double> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeDoubleList(i, list, z);
        }
    }

    public static void writeEnum(int i, int i2, Writer writer) {
        if (i2 != 0) {
            writer.writeEnum(i, i2);
        }
    }

    public static void writeEnumList(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeEnumList(i, list, z);
        }
    }

    public static void writeFixed32(int i, int i2, Writer writer) {
        if (i2 != 0) {
            writer.writeFixed32(i, i2);
        }
    }

    public static void writeFixed32List(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeFixed32List(i, list, z);
        }
    }

    public static void writeFixed64(int i, long j, Writer writer) {
        if (j != 0) {
            writer.writeFixed64(i, j);
        }
    }

    public static void writeFixed64List(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeFixed64List(i, list, z);
        }
    }

    public static void writeFloat(int i, float f, Writer writer) {
        if (Float.floatToRawIntBits(f) != 0) {
            writer.writeFloat(i, f);
        }
    }

    public static void writeFloatList(int i, List<Float> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeFloatList(i, list, z);
        }
    }

    public static void writeGroupList(int i, List<?> list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.writeGroupList(i, list);
        }
    }

    public static void writeInt32(int i, int i2, Writer writer) {
        if (i2 != 0) {
            writer.writeInt32(i, i2);
        }
    }

    public static void writeInt32List(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeInt32List(i, list, z);
        }
    }

    public static void writeInt64(int i, long j, Writer writer) {
        if (j != 0) {
            writer.writeInt64(i, j);
        }
    }

    public static void writeInt64List(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeInt64List(i, list, z);
        }
    }

    public static void writeLazyFieldList(int i, List<?> list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((LazyFieldLite) it.next()).writeTo(writer, i);
            }
        }
    }

    public static void writeMessage(int i, Object obj, Writer writer) {
        if (obj != null) {
            writer.writeMessage(i, obj);
        }
    }

    public static void writeMessageList(int i, List<?> list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.writeMessageList(i, list);
        }
    }

    public static void writeSFixed32(int i, int i2, Writer writer) {
        if (i2 != 0) {
            writer.writeSFixed32(i, i2);
        }
    }

    public static void writeSFixed32List(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeSFixed32List(i, list, z);
        }
    }

    public static void writeSFixed64(int i, long j, Writer writer) {
        if (j != 0) {
            writer.writeSFixed64(i, j);
        }
    }

    public static void writeSFixed64List(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeSFixed64List(i, list, z);
        }
    }

    public static void writeSInt32(int i, int i2, Writer writer) {
        if (i2 != 0) {
            writer.writeSInt32(i, i2);
        }
    }

    public static void writeSInt32List(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeSInt32List(i, list, z);
        }
    }

    public static void writeSInt64(int i, long j, Writer writer) {
        if (j != 0) {
            writer.writeSInt64(i, j);
        }
    }

    public static void writeSInt64List(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeSInt64List(i, list, z);
        }
    }

    public static void writeString(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writeStringInternal(i, (String) obj, writer);
        } else {
            writeBytes(i, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i, String str, Writer writer) {
        if (str != null && !str.isEmpty()) {
            writer.writeString(i, str);
        }
    }

    public static void writeStringList(int i, List<String> list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.writeStringList(i, list);
        }
    }

    public static void writeUInt32(int i, int i2, Writer writer) {
        if (i2 != 0) {
            writer.writeUInt32(i, i2);
        }
    }

    public static void writeUInt32List(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeUInt32List(i, list, z);
        }
    }

    public static void writeUInt64(int i, long j, Writer writer) {
        if (j != 0) {
            writer.writeUInt64(i, j);
        }
    }

    public static void writeUInt64List(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.writeUInt64List(i, list, z);
        }
    }

    public static void writeGroupList(int i, List<?> list, Writer writer, Schema<?> schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i, list, schema);
    }

    public static void writeMessageList(int i, List<?> list, Writer writer, Schema<?> schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i, list, schema);
    }

    public static int computeSizeGroupList(int i, List<MessageLite> list, Schema<?> schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += computeGroupSize(i, list.get(i3), schema);
        }
        return i2;
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    public static int computeSizeMessageList(int i, List<?> list, Schema<?> schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof LazyFieldLite) {
                computeTagSize = ((LazyFieldLite) obj).computeSizeNoTag() + computeTagSize;
            } else {
                computeTagSize += computeMessageSizeNoTag((AbstractMessageLite) obj, schema);
            }
        }
        return computeTagSize;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, intValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(intValue2)) {
                ub = (UB) storeUnknownEnum(obj, i, intValue2, ub, unknownFieldSchema);
                it.remove();
            }
        }
        return ub;
    }
}
