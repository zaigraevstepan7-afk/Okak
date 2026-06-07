package kotlinx.serialization.internal;

import defpackage.bd2;
import defpackage.fy0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/ULongSerializer;", "Lkotlinx/serialization/KSerializer;", "Lbd2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize-2TYgG_w", "(Lkotlinx/serialization/encoding/Encoder;J)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-I7RO_PI", "(Lkotlinx/serialization/encoding/Decoder;)J", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ULongSerializer implements KSerializer<bd2> {
    public static final ULongSerializer INSTANCE = new ULongSerializer();
    private static final SerialDescriptor descriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.ULong", BuiltinSerializersKt.serializer(fy0.a));

    private ULongSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new bd2(m108deserializeI7RO_PI(decoder));
    }

    /* renamed from: deserialize-I7RO_PI, reason: not valid java name */
    public long m108deserializeI7RO_PI(Decoder decoder) {
        decoder.getClass();
        return decoder.decodeInline(getDescriptor()).decodeLong();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m109serialize2TYgG_w(encoder, ((bd2) obj).e);
    }

    /* renamed from: serialize-2TYgG_w, reason: not valid java name */
    public void m109serialize2TYgG_w(Encoder encoder, long value) {
        encoder.getClass();
        encoder.encodeInline(getDescriptor()).encodeLong(value);
    }
}
