package kotlinx.serialization.json.internal;

import defpackage.ef0;
import defpackage.se0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* synthetic */ class JsonElementMarker$origin$1 extends ef0 implements se0 {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, 0, JsonElementMarker.class, obj, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z");
    }

    public final Boolean invoke(SerialDescriptor serialDescriptor, int i) {
        boolean readIfAbsent;
        serialDescriptor.getClass();
        readIfAbsent = ((JsonElementMarker) this.receiver).readIfAbsent(serialDescriptor, i);
        return Boolean.valueOf(readIfAbsent);
    }

    @Override // defpackage.se0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((SerialDescriptor) obj, ((Number) obj2).intValue());
    }
}
