package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j) {
        return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object obj, long j) {
        getProtobufList(obj, j).makeImmutable();
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j);
        Internal.ProtobufList protobufList2 = getProtobufList(obj2, j);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        UnsafeUtil.putObject(obj, j, protobufList2);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object obj, long j) {
        int i;
        Internal.ProtobufList protobufList = getProtobufList(obj, j);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(i);
            UnsafeUtil.putObject(obj, j, mutableCopyWithCapacity2);
            return mutableCopyWithCapacity2;
        }
        return protobufList;
    }
}
