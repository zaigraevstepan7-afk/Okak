package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import defpackage.se;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final FieldSet<?> DEFAULT_INSTANCE = new FieldSet<>(true);
    private final SmallSortedMap<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: com.google.protobuf.FieldSet$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        void internalMergeFrom(Object obj, Object obj2);

        boolean internalMessageIsImmutable(Object obj);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet(boolean z) {
        this(SmallSortedMap.newFieldMap());
        makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> SmallSortedMap<T, Object> cloneAllFieldsMap(SmallSortedMap<T, Object> smallSortedMap, boolean z, boolean z2) {
        SmallSortedMap<T, Object> newFieldMap = SmallSortedMap.newFieldMap();
        int numArrayEntries = smallSortedMap.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            cloneFieldEntry(newFieldMap, smallSortedMap.getArrayEntryAt(i), z, z2);
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, it.next(), z, z2);
        }
        return newFieldMap;
    }

    private static <T extends FieldDescriptorLite<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z, boolean z2) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof LazyField)) {
            map.put(key, ((LazyField) value).getValue());
        } else if (z && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int computeElementSize(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    public static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (obj instanceof LazyField) {
                    return ((LazyField) obj).computeSizeNoTag();
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i2 = 0;
                while (i < size) {
                    i2 += computeElementSizeNoTag(liteType, list.get(i));
                    i++;
                }
                return CodedOutputStream.computeUInt32SizeNoTag(i2) + CodedOutputStream.computeTagSize(number) + i2;
            }
            int i3 = 0;
            while (i < size) {
                i3 += computeElementSize(liteType, number, list.get(i));
                i++;
            }
            return i3;
        }
        return computeElementSize(liteType, number, obj);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return (FieldSet<T>) DEFAULT_INSTANCE;
    }

    private int getMessageSetSerializedSize(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof LazyField) {
                return ((LazyField) value).computeMessageSetExtensionSize(entry.getKey().getNumber());
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (MessageLite) value);
        }
        return computeFieldSize(key, value);
    }

    public static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!isMessageFieldValueInitialized(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return isMessageFieldValueInitialized(entry.getValue());
        }
        return true;
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        se.h("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof LazyField;
        if (key.isRepeated()) {
            if (!z) {
                Object field = getField(key);
                List list = (List) value;
                int size = list.size();
                if (field == null) {
                    field = new ArrayList(size);
                }
                List list2 = (List) field;
                for (int i = 0; i < size; i++) {
                    list2.add(cloneIfMutable(list.get(i)));
                }
                this.fields.put((SmallSortedMap<T, Object>) key, (T) field);
                return;
            }
            se.p("Lazy fields can not be repeated");
            return;
        }
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object field2 = getField(key);
            if (field2 == null) {
                this.fields.put((SmallSortedMap<T, Object>) key, (T) cloneIfMutable(value));
                if (z) {
                    this.hasLazyField = true;
                    return;
                }
                return;
            }
            if (z) {
                value = ((LazyField) value).getValue();
            }
            if (key.internalMessageIsImmutable(field2)) {
                MessageLite.Builder builder = ((MessageLite) field2).toBuilder();
                key.internalMergeFrom(builder, value);
                this.fields.put((SmallSortedMap<T, Object>) key, (T) builder.build());
                return;
            }
            key.internalMergeFrom(field2, value);
            return;
        }
        if (!z) {
            this.fields.put((SmallSortedMap<T, Object>) key, (T) cloneIfMutable(value));
        } else {
            se.p("Lazy fields must be message-valued");
        }
    }

    public static <T extends FieldDescriptorLite<T>> Builder<T> newBuilder() {
        return new Builder<>((AnonymousClass1) null);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return codedInputStream.readPrimitiveField(fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return codedInputStream.readPrimitiveField(fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    private void verifyType(T t, Object obj) {
        if (isValidType(t.getLiteType(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    public static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                if (!list.isEmpty()) {
                    codedOutputStream.writeTag(number, 2);
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        i2 += computeElementSizeNoTag(liteType, list.get(i3));
                    }
                    codedOutputStream.writeUInt32NoTag(i2);
                    while (i < size) {
                        writeElementNoTag(codedOutputStream, liteType, list.get(i));
                        i++;
                    }
                    return;
                }
                return;
            }
            while (i < size) {
                writeElement(codedOutputStream, liteType, number, list.get(i));
                i++;
            }
            return;
        }
        if (obj instanceof LazyField) {
            writeElement(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    private void writeMessageSetTo(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                codedOutputStream.writeRawMessageSetExtension(entry.getKey().getNumber(), ((LazyField) value).toByteString());
                return;
            } else {
                codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (MessageLite) value);
                return;
            }
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    public void addRepeatedField(T t, Object obj) {
        List list;
        if (t.isRepeated()) {
            verifyType(t, obj);
            Object field = getField(t);
            if (field == null) {
                list = new ArrayList();
                this.fields.put((SmallSortedMap<T, Object>) t, (T) list);
            } else {
                list = (List) field;
            }
            list.add(obj);
            return;
        }
        se.h("addRepeatedField() can only be called on repeated fields.");
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(T t) {
        this.fields.remove(t);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> m38clone() {
        SmallSortedMap<T, Object> smallSortedMap;
        FieldSet<T> newFieldSet = newFieldSet();
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        while (true) {
            smallSortedMap = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            Map.Entry<T, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i);
            newFieldSet.setField(arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : smallSortedMap.getOverflowEntries()) {
            newFieldSet.setField(entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    public Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.hasLazyField;
        SmallSortedMap<T, Object> smallSortedMap = this.fields;
        if (z) {
            return new LazyField.LazyIterator(smallSortedMap.descendingEntrySet().iterator());
        }
        return smallSortedMap.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.fields.equals(((FieldSet) obj).fields);
    }

    public Map<T, Object> getAllFields() {
        boolean z = this.hasLazyField;
        SmallSortedMap<T, Object> smallSortedMap = this.fields;
        if (z) {
            SmallSortedMap cloneAllFieldsMap = cloneAllFieldsMap(smallSortedMap, false, true);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
            }
            return cloneAllFieldsMap;
        }
        boolean isImmutable = smallSortedMap.isImmutable();
        SmallSortedMap<T, Object> smallSortedMap2 = this.fields;
        if (isImmutable) {
            return smallSortedMap2;
        }
        return Collections.unmodifiableMap(smallSortedMap2);
    }

    public Object getField(T t) {
        Object obj = this.fields.get(t);
        if (obj instanceof LazyField) {
            return ((LazyField) obj).getValue();
        }
        return obj;
    }

    public Object getRepeatedField(T t, int i) {
        if (t.isRepeated()) {
            Object field = getField(t);
            if (field != null) {
                return ((List) field).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        se.h("getRepeatedField() can only be called on repeated fields.");
        return null;
    }

    public int getRepeatedFieldCount(T t) {
        if (t.isRepeated()) {
            Object field = getField(t);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        se.h("getRepeatedField() can only be called on repeated fields.");
        return 0;
    }

    public int getSerializedSize() {
        SmallSortedMap<T, Object> smallSortedMap;
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        int i2 = 0;
        while (true) {
            smallSortedMap = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            Map.Entry<T, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i);
            i2 += computeFieldSize(arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : smallSortedMap.getOverflowEntries()) {
            i2 += computeFieldSize(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public boolean hasField(T t) {
        if (!t.isRepeated()) {
            if (this.fields.get(t) == null) {
                return false;
            }
            return true;
        }
        se.h("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        if (isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.hasLazyField;
        SmallSortedMap<T, Object> smallSortedMap = this.fields;
        if (z) {
            return new LazyField.LazyIterator(smallSortedMap.entrySet().iterator());
        }
        return smallSortedMap.entrySet().iterator();
    }

    public boolean lazyFieldCorrupted(T t) {
        Object obj = this.fields.get(t);
        if ((obj instanceof LazyField) && ((LazyField) obj).isCorrupted()) {
            return true;
        }
        return false;
    }

    public void makeImmutable() {
        SmallSortedMap<T, Object> smallSortedMap;
        if (this.isImmutable) {
            return;
        }
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        while (true) {
            smallSortedMap = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            Object value = smallSortedMap.getArrayEntryAt(i).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).makeImmutable();
            }
            i++;
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value2).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(FieldSet<T> fieldSet) {
        SmallSortedMap<T, Object> smallSortedMap;
        int numArrayEntries = fieldSet.fields.getNumArrayEntries();
        int i = 0;
        while (true) {
            smallSortedMap = fieldSet.fields;
            if (i >= numArrayEntries) {
                break;
            }
            mergeFromField(smallSortedMap.getArrayEntryAt(i));
            i++;
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(T t, Object obj) {
        if (t.isRepeated()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    verifyType(t, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                se.h("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            verifyType(t, obj);
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((SmallSortedMap<T, Object>) t, (T) obj);
    }

    public void setRepeatedField(T t, int i, Object obj) {
        if (t.isRepeated()) {
            Object field = getField(t);
            if (field != null) {
                verifyType(t, obj);
                ((List) field).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        se.h("getRepeatedField() can only be called on repeated fields.");
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        SmallSortedMap<T, Object> smallSortedMap;
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        while (true) {
            smallSortedMap = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            Map.Entry<T, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i);
            writeField(arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
            i++;
        }
        for (Map.Entry<T, Object> entry : smallSortedMap.getOverflowEntries()) {
            writeField(entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Builder<T extends FieldDescriptorLite<T>> {
        private SmallSortedMap<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        private Builder(SmallSortedMap<T, Object> smallSortedMap) {
            this.fields = smallSortedMap;
            this.isMutable = true;
        }

        private FieldSet<T> buildImpl(boolean z) {
            if (this.fields.isEmpty()) {
                return FieldSet.emptySet();
            }
            this.isMutable = false;
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMap = FieldSet.cloneAllFieldsMap(smallSortedMap, false, false);
                replaceBuilders(smallSortedMap, z);
            }
            FieldSet<T> fieldSet = new FieldSet<>(smallSortedMap, null);
            ((FieldSet) fieldSet).hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private void ensureIsMutable() {
            if (!this.isMutable) {
                this.fields = FieldSet.cloneAllFieldsMap(this.fields, true, false);
                this.isMutable = true;
            }
        }

        public static <T extends FieldDescriptorLite<T>> Builder<T> fromFieldSet(FieldSet<T> fieldSet) {
            Builder<T> builder = new Builder<>(FieldSet.cloneAllFieldsMap(((FieldSet) fieldSet).fields, true, false));
            ((Builder) builder).hasLazyField = ((FieldSet) fieldSet).hasLazyField;
            return builder;
        }

        private void mergeFromField(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            boolean z = value instanceof LazyField;
            if (key.isRepeated()) {
                if (!z) {
                    List list = (List) getFieldAllowBuilders(key);
                    List list2 = (List) value;
                    int size = list2.size();
                    if (list == null) {
                        list = new ArrayList(size);
                        this.fields.put((SmallSortedMap<T, Object>) key, (T) list);
                    }
                    for (int i = 0; i < size; i++) {
                        list.add(FieldSet.cloneIfMutable(list2.get(i)));
                    }
                    return;
                }
                se.p("Lazy fields can not be repeated");
                return;
            }
            if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
                Object fieldAllowBuilders = getFieldAllowBuilders(key);
                if (fieldAllowBuilders == null) {
                    this.fields.put((SmallSortedMap<T, Object>) key, (T) FieldSet.cloneIfMutable(value));
                    if (z) {
                        this.hasLazyField = true;
                        return;
                    }
                    return;
                }
                if (z) {
                    value = ((LazyField) value).getValue();
                }
                if (key.internalMessageIsImmutable(fieldAllowBuilders)) {
                    MessageLite.Builder builder = ((MessageLite) fieldAllowBuilders).toBuilder();
                    key.internalMergeFrom(builder, value);
                    this.fields.put((SmallSortedMap<T, Object>) key, (T) builder.build());
                    return;
                }
                key.internalMergeFrom(fieldAllowBuilders, value);
                return;
            }
            if (!z) {
                this.fields.put((SmallSortedMap<T, Object>) key, (T) FieldSet.cloneIfMutable(value));
            } else {
                se.p("Lazy fields must be message-valued");
            }
        }

        private static Object replaceBuilder(Object obj, boolean z) {
            if (!(obj instanceof MessageLite.Builder)) {
                return obj;
            }
            MessageLite.Builder builder = (MessageLite.Builder) obj;
            if (z) {
                return builder.buildPartial();
            }
            return builder.build();
        }

        private static <T extends FieldDescriptorLite<T>> Object replaceBuilders(T t, Object obj, boolean z) {
            if (obj == null) {
                return obj;
            }
            if (t.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
                if (t.isRepeated()) {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        for (int i = 0; i < list.size(); i++) {
                            Object obj2 = list.get(i);
                            Object replaceBuilder = replaceBuilder(obj2, z);
                            if (replaceBuilder != obj2) {
                                if (list == obj) {
                                    list = new ArrayList(list);
                                }
                                list.set(i, replaceBuilder);
                            }
                        }
                        return list;
                    }
                    se.g(obj.getClass(), "Repeated field should contains a List but actually contains type: ");
                    return null;
                }
                return replaceBuilder(obj, z);
            }
            return obj;
        }

        private void verifyType(T t, Object obj) {
            if (!FieldSet.isValidType(t.getLiteType(), obj)) {
                if (t.getLiteType().getJavaType() == WireFormat.JavaType.MESSAGE && (obj instanceof MessageLite.Builder)) {
                } else {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
                }
            }
        }

        public void addRepeatedField(T t, Object obj) {
            boolean z;
            List list;
            ensureIsMutable();
            if (t.isRepeated()) {
                if (!this.hasNestedBuilders && !(obj instanceof MessageLite.Builder)) {
                    z = false;
                } else {
                    z = true;
                }
                this.hasNestedBuilders = z;
                verifyType(t, obj);
                Object fieldAllowBuilders = getFieldAllowBuilders(t);
                if (fieldAllowBuilders == null) {
                    list = new ArrayList();
                    this.fields.put((SmallSortedMap<T, Object>) t, (T) list);
                } else {
                    list = (List) fieldAllowBuilders;
                }
                list.add(obj);
                return;
            }
            se.h("addRepeatedField() can only be called on repeated fields.");
        }

        public FieldSet<T> build() {
            return buildImpl(false);
        }

        public FieldSet<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(T t) {
            ensureIsMutable();
            this.fields.remove(t);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<T, Object> getAllFields() {
            boolean z = this.hasLazyField;
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (z) {
                SmallSortedMap cloneAllFieldsMap = FieldSet.cloneAllFieldsMap(smallSortedMap, false, true);
                if (this.fields.isImmutable()) {
                    cloneAllFieldsMap.makeImmutable();
                    return cloneAllFieldsMap;
                }
                replaceBuilders(cloneAllFieldsMap, true);
                return cloneAllFieldsMap;
            }
            boolean isImmutable = smallSortedMap.isImmutable();
            SmallSortedMap<T, Object> smallSortedMap2 = this.fields;
            if (isImmutable) {
                return smallSortedMap2;
            }
            return Collections.unmodifiableMap(smallSortedMap2);
        }

        public Object getField(T t) {
            return replaceBuilders(t, getFieldAllowBuilders(t), true);
        }

        public Object getFieldAllowBuilders(T t) {
            Object obj = this.fields.get(t);
            if (obj instanceof LazyField) {
                return ((LazyField) obj).getValue();
            }
            return obj;
        }

        public Object getRepeatedField(T t, int i) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t, i), true);
        }

        public Object getRepeatedFieldAllowBuilders(T t, int i) {
            if (t.isRepeated()) {
                Object fieldAllowBuilders = getFieldAllowBuilders(t);
                if (fieldAllowBuilders != null) {
                    return ((List) fieldAllowBuilders).get(i);
                }
                throw new IndexOutOfBoundsException();
            }
            se.h("getRepeatedField() can only be called on repeated fields.");
            return null;
        }

        public int getRepeatedFieldCount(T t) {
            if (t.isRepeated()) {
                Object fieldAllowBuilders = getFieldAllowBuilders(t);
                if (fieldAllowBuilders == null) {
                    return 0;
                }
                return ((List) fieldAllowBuilders).size();
            }
            se.h("getRepeatedFieldCount() can only be called on repeated fields.");
            return 0;
        }

        public boolean hasField(T t) {
            if (!t.isRepeated()) {
                if (this.fields.get(t) == null) {
                    return false;
                }
                return true;
            }
            se.h("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public boolean isInitialized() {
            int numArrayEntries = this.fields.getNumArrayEntries();
            int i = 0;
            while (true) {
                SmallSortedMap<T, Object> smallSortedMap = this.fields;
                if (i < numArrayEntries) {
                    if (!FieldSet.isInitialized(smallSortedMap.getArrayEntryAt(i))) {
                        return false;
                    }
                    i++;
                } else {
                    Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
                    while (it.hasNext()) {
                        if (!FieldSet.isInitialized(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        public void mergeFrom(FieldSet<T> fieldSet) {
            ensureIsMutable();
            int numArrayEntries = ((FieldSet) fieldSet).fields.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                mergeFromField(((FieldSet) fieldSet).fields.getArrayEntryAt(i));
            }
            Iterator it = ((FieldSet) fieldSet).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(T t, Object obj) {
            boolean z;
            ensureIsMutable();
            boolean z2 = false;
            if (t.isRepeated()) {
                if (obj instanceof List) {
                    ArrayList arrayList = new ArrayList((List) obj);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj2 = arrayList.get(i);
                        verifyType(t, obj2);
                        if (!this.hasNestedBuilders && !(obj2 instanceof MessageLite.Builder)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.hasNestedBuilders = z;
                    }
                    obj = arrayList;
                } else {
                    se.h("Wrong object type used with protocol message reflection.");
                    return;
                }
            } else {
                verifyType(t, obj);
            }
            if (obj instanceof LazyField) {
                this.hasLazyField = true;
            }
            if (this.hasNestedBuilders || (obj instanceof MessageLite.Builder)) {
                z2 = true;
            }
            this.hasNestedBuilders = z2;
            this.fields.put((SmallSortedMap<T, Object>) t, (T) obj);
        }

        public void setRepeatedField(T t, int i, Object obj) {
            boolean z;
            ensureIsMutable();
            if (t.isRepeated()) {
                if (!this.hasNestedBuilders && !(obj instanceof MessageLite.Builder)) {
                    z = false;
                } else {
                    z = true;
                }
                this.hasNestedBuilders = z;
                Object fieldAllowBuilders = getFieldAllowBuilders(t);
                if (fieldAllowBuilders != null) {
                    verifyType(t, obj);
                    ((List) fieldAllowBuilders).set(i, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            se.h("getRepeatedField() can only be called on repeated fields.");
        }

        private Builder() {
            this(SmallSortedMap.newFieldMap());
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean z) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z));
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(SmallSortedMap<T, Object> smallSortedMap, boolean z) {
            int numArrayEntries = smallSortedMap.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                replaceBuilders(smallSortedMap.getArrayEntryAt(i), z);
            }
            Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders(it.next(), z);
            }
        }
    }

    private FieldSet() {
        this.fields = SmallSortedMap.newFieldMap();
    }

    public /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    private FieldSet(SmallSortedMap<T, Object> smallSortedMap) {
        this.fields = smallSortedMap;
        makeImmutable();
    }

    public boolean isInitialized() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        while (true) {
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (i < numArrayEntries) {
                if (!isInitialized(smallSortedMap.getArrayEntryAt(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!isInitialized(it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public int getMessageSetSerializedSize() {
        SmallSortedMap<T, Object> smallSortedMap;
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        int i2 = 0;
        while (true) {
            smallSortedMap = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            i2 += getMessageSetSerializedSize(smallSortedMap.getArrayEntryAt(i));
            i++;
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i2 += getMessageSetSerializedSize(it.next());
        }
        return i2;
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) {
        SmallSortedMap<T, Object> smallSortedMap;
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        while (true) {
            smallSortedMap = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            writeMessageSetTo(smallSortedMap.getArrayEntryAt(i), codedOutputStream);
            i++;
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), codedOutputStream);
        }
    }
}
