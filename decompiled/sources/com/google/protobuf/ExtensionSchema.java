package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    public abstract FieldSet<T> getExtensions(Object obj);

    public abstract FieldSet<T> getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(MessageLite messageLite);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema);

    public abstract void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet);

    public abstract void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet);

    public abstract void serializeExtension(Writer writer, Map.Entry<?, ?> entry);

    public abstract void setExtensions(Object obj, FieldSet<T> fieldSet);
}
