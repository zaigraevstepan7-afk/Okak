package defpackage;

import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class bt1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ SealedClassSerializer f;

    public /* synthetic */ bt1(SealedClassSerializer sealedClassSerializer, int i) {
        this.e = i;
        this.f = sealedClassSerializer;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        SealedClassSerializer sealedClassSerializer = this.f;
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
        switch (i) {
            case 0:
                return SealedClassSerializer.a(sealedClassSerializer, classSerialDescriptorBuilder);
            default:
                return SealedClassSerializer.b(sealedClassSerializer, classSerialDescriptorBuilder);
        }
    }
}
