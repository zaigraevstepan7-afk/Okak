package kotlinx.serialization.json.internal;

import defpackage.bd2;
import defpackage.ed2;
import defpackage.fr1;
import defpackage.vc2;
import defpackage.yc2;
import defpackage.yq1;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"unsignedNumberDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "isUnsignedNumber", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnquotedLiteral", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class StreamingJsonEncoderKt {
    private static final Set<SerialDescriptor> unsignedNumberDescriptors = fr1.q(BuiltinSerializersKt.serializer(yc2.f).getDescriptor(), BuiltinSerializersKt.serializer(bd2.f).getDescriptor(), BuiltinSerializersKt.serializer(vc2.f).getDescriptor(), BuiltinSerializersKt.serializer(ed2.f).getDescriptor());

    public static final boolean isUnquotedLiteral(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.getIsInline() && serialDescriptor.equals(JsonElementKt.getJsonUnquotedLiteralDescriptor())) {
            return true;
        }
        return false;
    }

    public static final boolean isUnsignedNumber(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.getIsInline() && unsignedNumberDescriptors.contains(serialDescriptor)) {
            return true;
        }
        return false;
    }
}
