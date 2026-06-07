package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class rz0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ KSerializer f;
    public final /* synthetic */ KSerializer g;

    public /* synthetic */ rz0(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this.e = i;
        this.f = kSerializer;
        this.g = kSerializer2;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        KSerializer kSerializer = this.g;
        KSerializer kSerializer2 = this.f;
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
        switch (i) {
            case 0:
                return MapEntrySerializer.a(kSerializer2, kSerializer, classSerialDescriptorBuilder);
            default:
                return PairSerializer.a(kSerializer2, kSerializer, classSerialDescriptorBuilder);
        }
    }
}
