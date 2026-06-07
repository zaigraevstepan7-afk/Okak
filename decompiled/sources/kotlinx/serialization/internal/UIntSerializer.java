package kotlinx.serialization.internal;

import defpackage.qm0;
import defpackage.yc2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/UIntSerializer;", "Lkotlinx/serialization/KSerializer;", "Lyc2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize-Qn1smSk", "(Lkotlinx/serialization/encoding/Encoder;I)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-OGnWXxg", "(Lkotlinx/serialization/encoding/Decoder;)I", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UIntSerializer implements KSerializer<yc2> {
    public static final UIntSerializer INSTANCE = new UIntSerializer();
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UInt", BuiltinSerializersKt.serializer(qm0.a));

    private UIntSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new yc2(m100deserializeOGnWXxg(decoder));
    }

    /* renamed from: deserialize-OGnWXxg, reason: not valid java name */
    public int m100deserializeOGnWXxg(Decoder decoder) {
        decoder.getClass();
        return decoder.decodeInline(getDescriptor()).decodeInt();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m101serializeQn1smSk(encoder, ((yc2) obj).e);
    }

    /* renamed from: serialize-Qn1smSk, reason: not valid java name */
    public void m101serializeQn1smSk(Encoder encoder, int value) {
        encoder.getClass();
        encoder.encodeInline(getDescriptor()).encodeInt(value);
    }
}
