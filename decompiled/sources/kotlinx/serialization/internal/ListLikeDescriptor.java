package kotlinx.serialization.internal;

import defpackage.l60;
import defpackage.l90;
import defpackage.p32;
import defpackage.se;
import defpackage.sn0;
import defpackage.y61;
import defpackage.yq1;
import defpackage.yx;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0013\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0005\u001e\u001f !\"¨\u0006#"}, d2 = {"Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getElementDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "elementsCount", "", "getElementsCount", "()I", "getElementName", "", "index", "getElementIndex", "name", "isElementOptional", "", "getElementAnnotations", "", "", "equals", "other", "", "hashCode", "toString", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public abstract class ListLikeDescriptor implements SerialDescriptor {
    private final SerialDescriptor elementDescriptor;
    private final int elementsCount;

    private ListLikeDescriptor(SerialDescriptor serialDescriptor) {
        this.elementDescriptor = serialDescriptor;
        this.elementsCount = 1;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListLikeDescriptor)) {
            return false;
        }
        ListLikeDescriptor listLikeDescriptor = (ListLikeDescriptor) other;
        if (sn0.r(this.elementDescriptor, listLikeDescriptor.elementDescriptor) && sn0.r(getSerialName(), listLikeDescriptor.getSerialName())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int index) {
        if (index >= 0) {
            return l60.e;
        }
        y61.p(l90.q("Illegal index ", index, ", "), getSerialName(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        if (index >= 0) {
            return this.elementDescriptor;
        }
        y61.p(l90.q("Illegal index ", index, ", "), getSerialName(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        name.getClass();
        Integer E = p32.E(name);
        if (E != null) {
            return E.intValue();
        }
        se.h(name.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int index) {
        return String.valueOf(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.LIST.INSTANCE;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (this.elementDescriptor.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        if (index >= 0) {
            return false;
        }
        y61.p(l90.q("Illegal index ", index, ", "), getSerialName(), " expects only non-negative indices");
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public boolean getIsInline() {
        return super.getIsInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return super.isNullable();
    }

    public String toString() {
        return getSerialName() + '(' + this.elementDescriptor + ')';
    }

    public /* synthetic */ ListLikeDescriptor(SerialDescriptor serialDescriptor, yx yxVar) {
        this(serialDescriptor);
    }

    public final SerialDescriptor getElementDescriptor() {
        return this.elementDescriptor;
    }
}
