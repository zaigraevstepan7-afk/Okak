package kotlinx.serialization.descriptors;

import defpackage.sn0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\n8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0012\u0010\"\u001a\u00020#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlinx/serialization/descriptors/WrappedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "original", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getSerialName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "getElementAnnotations", "", "", "index", "getElementDescriptor", "getElementIndex", "name", "getElementName", "isElementOptional", "annotations", "getAnnotations", "()Ljava/util/List;", "elementsCount", "getElementsCount", "()I", "isInline", "()Z", "isNullable", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class WrappedSerialDescriptor implements SerialDescriptor {
    private final SerialDescriptor original;
    private final String serialName;

    public WrappedSerialDescriptor(String str, SerialDescriptor serialDescriptor) {
        str.getClass();
        serialDescriptor.getClass();
        this.serialName = str;
        this.original = serialDescriptor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrappedSerialDescriptor)) {
            return false;
        }
        WrappedSerialDescriptor wrappedSerialDescriptor = (WrappedSerialDescriptor) other;
        if (sn0.r(getSerialName(), wrappedSerialDescriptor.getSerialName()) && sn0.r(this.original, wrappedSerialDescriptor.original)) {
            return true;
        }
        return false;
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
        return this.original.hashCode() + (getSerialName().hashCode() * 31);
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
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }
}
