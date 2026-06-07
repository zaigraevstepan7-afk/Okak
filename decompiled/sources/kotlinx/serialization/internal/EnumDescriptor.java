package kotlinx.serialization.internal;

import defpackage.b52;
import defpackage.g70;
import defpackage.rr0;
import defpackage.sn0;
import defpackage.wn;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "", "elementDescriptors$delegate", "Lrr0;", "getElementDescriptors", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: elementDescriptors$delegate, reason: from kotlin metadata */
    private final rr0 elementDescriptors;
    private final SerialKind kind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String str, int i) {
        super(str, null, i, 2, null);
        str.getClass();
        this.kind = SerialKind.ENUM.INSTANCE;
        this.elementDescriptors = new b52(new g70(i, str, this));
    }

    public static final SerialDescriptor[] elementDescriptors_delegate$lambda$0(int i, String str, EnumDescriptor enumDescriptor) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
        for (int i2 = 0; i2 < i; i2++) {
            serialDescriptorArr[i2] = SerialDescriptorsKt.buildSerialDescriptor$default(str + '.' + enumDescriptor.getElementName(i2), StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    private final SerialDescriptor[] getElementDescriptors() {
        return (SerialDescriptor[]) this.elementDescriptors.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        if (serialDescriptor.getKind() == SerialKind.ENUM.INSTANCE && sn0.r(getSerialName(), serialDescriptor.getSerialName()) && sn0.r(Platform_commonKt.cachedSerialNames(this), Platform_commonKt.cachedSerialNames(serialDescriptor))) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        return getElementDescriptors()[index];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int i;
        int hashCode = getSerialName().hashCode();
        int i2 = 1;
        for (String str : SerialDescriptorKt.getElementNames(this)) {
            int i3 = i2 * 31;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return wn.m0(SerialDescriptorKt.getElementNames(this), ", ", getSerialName() + '(', ")", null, 56);
    }
}
