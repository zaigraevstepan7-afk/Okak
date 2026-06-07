package kotlinx.serialization.descriptors;

import defpackage.cn;
import defpackage.sn0;
import defpackage.to0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010 R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001a\u0010\"\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u0014\u0010(\u001a\u00020%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\t8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\t8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlinx/serialization/descriptors/ContextDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "Lto0;", "kClass", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lto0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "isElementOptional", "(I)Z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lto0;", "serialName", "Ljava/lang/String;", "getSerialName", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "isNullable", "()Z", "isInline", "getElementsCount", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ContextDescriptor implements SerialDescriptor {
    public final to0 kClass;
    private final SerialDescriptor original;
    private final String serialName;

    public ContextDescriptor(SerialDescriptor serialDescriptor, to0 to0Var) {
        serialDescriptor.getClass();
        to0Var.getClass();
        this.original = serialDescriptor;
        this.kClass = to0Var;
        this.serialName = serialDescriptor.getSerialName() + '<' + ((cn) to0Var).d() + '>';
    }

    public boolean equals(Object other) {
        ContextDescriptor contextDescriptor;
        if (other instanceof ContextDescriptor) {
            contextDescriptor = (ContextDescriptor) other;
        } else {
            contextDescriptor = null;
        }
        if (contextDescriptor == null || !sn0.r(this.original, contextDescriptor.original) || !sn0.r(contextDescriptor.kClass, this.kClass)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int index) {
        return this.original.getElementAnnotations(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        return this.original.getElementDescriptor(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        name.getClass();
        return this.original.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int index) {
        return this.original.getElementName(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.original.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (((cn) this.kClass).hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.original.isElementOptional(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public boolean getIsInline() {
        return this.original.getIsInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return this.original.isNullable();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.kClass + ", original: " + this.original + ')';
    }
}
