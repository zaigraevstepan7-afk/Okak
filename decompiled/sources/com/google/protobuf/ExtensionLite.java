package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ExtensionLite<ContainingType extends MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract WireFormat.FieldType getLiteType();

    public abstract MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    public boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
