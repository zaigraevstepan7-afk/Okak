package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import defpackage.se;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
final class MessageSetSchema<T> implements Schema<T> {
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSizeAsMessageSet(unknownFieldSchema.getFromMessage(t));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        UnknownFieldSchema<UT, UB> unknownFieldSchema2;
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(t);
        FieldSet<ET> mutableExtensions = extensionSchema.getMutableExtensions(t);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                MessageSetSchema<T> messageSetSchema = this;
                unknownFieldSchema2 = unknownFieldSchema;
                ExtensionSchema<ET> extensionSchema2 = extensionSchema;
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                try {
                    if (messageSetSchema.parseMessageSetItemOrUnknownField(reader2, extensionRegistryLite2, extensionSchema2, mutableExtensions, unknownFieldSchema2, builderFromMessage)) {
                        this = messageSetSchema;
                        reader = reader2;
                        extensionRegistryLite = extensionRegistryLite2;
                        extensionSchema = extensionSchema2;
                        unknownFieldSchema = unknownFieldSchema2;
                    } else {
                        unknownFieldSchema2.setBuilderToMessage(t, builderFromMessage);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    unknownFieldSchema2.setBuilderToMessage(t, builderFromMessage);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                unknownFieldSchema2 = unknownFieldSchema;
            }
        }
        unknownFieldSchema.setBuilderToMessage(t, builderFromMessage);
    }

    public static <T> MessageSetSchema<T> newSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub) {
        int tag = reader.getTag();
        int i = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) == 2) {
                Object findExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
                if (findExtensionByNumber != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, findExtensionByNumber, extensionRegistryLite, fieldSet);
                    return true;
                }
                return unknownFieldSchema.mergeOneFieldFrom(ub, reader, 0);
            }
            return reader.skipField();
        }
        Object obj = null;
        ByteString byteString = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = reader.readUInt32();
                obj = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, i);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (obj != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, obj, extensionRegistryLite, fieldSet);
                } else {
                    byteString = reader.readBytes();
                }
            } else if (tag2 == WireFormat.MESSAGE_SET_ITEM_END_TAG || !reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            if (byteString != null) {
                if (obj != null) {
                    extensionSchema.parseMessageSetItem(byteString, obj, extensionRegistryLite, fieldSet);
                } else {
                    unknownFieldSchema.addLengthDelimited(ub, i, byteString);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    private <UT, UB> void writeUnknownFieldsHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t, T t2) {
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getMessageSetSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t) {
        int hashCode = this.unknownFieldSchema.getFromMessage(t).hashCode();
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t) {
        return this.extensionSchema.getExtensions(t).isInitialized();
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t) {
        this.unknownFieldSchema.makeImmutable(t);
        this.extensionSchema.makeImmutable(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf A[EDGE_INSN: B:24:0x00cf->B:25:0x00cf BREAK  A[LOOP:1: B:10:0x006f->B:18:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, com.google.protobuf.ArrayDecoders.Registers r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSetSchema.mergeFrom(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):void");
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        if (messageLite instanceof GeneratedMessageLite) {
            return (T) ((GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t, Writer writer) {
        Iterator<Map.Entry<?, Object>> it = this.extensionSchema.getExtensions(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
                if (next instanceof LazyField.LazyEntry) {
                    writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.LazyEntry) next).getField().toByteString());
                } else {
                    writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), next.getValue());
                }
            } else {
                se.p("Found invalid MessageSet item.");
                return;
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t, writer);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }
}
