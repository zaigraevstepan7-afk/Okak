package com.google.protobuf;

import defpackage.se;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
final class StructuralMessageInfo implements MessageInfo {
    private final int[] checkInitialized;
    private final MessageLite defaultInstance;
    private final FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final ProtoSyntax syntax;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.syntax = protoSyntax;
        this.messageSetWireFormat = z;
        this.checkInitialized = iArr;
        this.fields = fieldInfoArr;
        this.defaultInstance = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public FieldInfo[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static Builder newBuilder(int i) {
        return new Builder(i);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<FieldInfo> fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (!this.wasBuilt) {
                if (this.syntax != null) {
                    this.wasBuilt = true;
                    Collections.sort(this.fields);
                    return new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (FieldInfo[]) this.fields.toArray(new FieldInfo[0]), this.defaultInstance);
                }
                se.p("Must specify a proto syntax");
                return null;
            }
            se.p("Builder can only build once");
            return null;
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (!this.wasBuilt) {
                this.fields.add(fieldInfo);
            } else {
                se.p("Builder can only build once");
            }
        }

        public void withMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i);
        }
    }
}
