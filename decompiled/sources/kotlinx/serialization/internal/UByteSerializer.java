package kotlinx.serialization.internal;

import defpackage.al;
import defpackage.vc2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/UByteSerializer;", "Lkotlinx/serialization/KSerializer;", "Lvc2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize-EK-6454", "(Lkotlinx/serialization/encoding/Encoder;B)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-Wa3L5BU", "(Lkotlinx/serialization/encoding/Decoder;)B", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UByteSerializer implements KSerializer<vc2> {
    public static final UByteSerializer INSTANCE = new UByteSerializer();
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UByte", BuiltinSerializersKt.serializer(al.a));

    private UByteSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new vc2(m92deserializeWa3L5BU(decoder));
    }

    /* renamed from: deserialize-Wa3L5BU, reason: not valid java name */
    public byte m92deserializeWa3L5BU(Decoder decoder) {
        decoder.getClass();
        return decoder.decodeInline(getDescriptor()).decodeByte();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m93serializeEK6454(encoder, ((vc2) obj).e);
    }

    /* renamed from: serialize-EK-6454, reason: not valid java name */
    public void m93serializeEK6454(Encoder encoder, byte value) {
        encoder.getClass();
        encoder.encodeInline(getDescriptor()).encodeByte(value);
    }
}
