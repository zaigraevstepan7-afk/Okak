package kotlinx.serialization.internal;

import defpackage.od2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/internal/UnitSerializer;", "Lkotlinx/serialization/KSerializer;", "Lod2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lod2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UnitSerializer implements KSerializer<od2> {
    public static final UnitSerializer INSTANCE = new UnitSerializer();
    private final /* synthetic */ ObjectSerializer<od2> $$delegate_0 = new ObjectSerializer<>("kotlin.Unit", od2.a);

    private UnitSerializer() {
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public void m118deserialize(Decoder decoder) {
        decoder.getClass();
        this.$$delegate_0.deserialize(decoder);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.$$delegate_0.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, od2 value) {
        encoder.getClass();
        value.getClass();
        this.$$delegate_0.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        m118deserialize(decoder);
        return od2.a;
    }
}
