package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aZ\u0010\b\u001a\u00028\u0002\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000\"\u0012\b\u0001\u0010\u0003*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004*\u00028\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001af\u0010\u000e\u001a\u00020\r\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\b\b\u0002\u0010\u0005*\u00020\u0004*\u00028\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\f\u001a\u00028\u0002H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aN\u0010\u0012\u001a\u00020\u0011\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000\"\u0012\b\u0001\u0010\u0010*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002*\u00028\u00012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessage;", "M", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;", "MOrBT", "", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;", "B", "value", "Lod2;", "set", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "MorBT", "", "contains", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Z", "java_kotlin-lite-lite_extensions"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, ExtensionLite<M, ?> extensionLite) {
        morbt.getClass();
        extensionLite.getClass();
        return morbt.hasExtension(extensionLite);
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, ExtensionLite<M, T> extensionLite) {
        morbt.getClass();
        extensionLite.getClass();
        T t = (T) morbt.getExtension(extensionLite);
        t.getClass();
        return t;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b, ExtensionLite<M, T> extensionLite, T t) {
        b.getClass();
        extensionLite.getClass();
        t.getClass();
        b.setExtension(extensionLite, t);
    }
}
