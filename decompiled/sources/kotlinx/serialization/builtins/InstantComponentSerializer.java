package kotlinx.serialization.builtins;

import defpackage.km0;
import defpackage.l60;
import defpackage.l90;
import defpackage.lm0;
import defpackage.mm0;
import defpackage.od2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.LongSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/builtins/InstantComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Llm0;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Llm0;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Llm0;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class InstantComponentSerializer implements KSerializer<lm0> {
    public static final InstantComponentSerializer INSTANCE = new InstantComponentSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.serialization.InstantComponentSerializer", new SerialDescriptor[0], new mm0(0));

    private InstantComponentSerializer() {
    }

    public static final od2 descriptor$lambda$0(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        SerialDescriptor descriptor2 = longSerializer.getDescriptor();
        l60 l60Var = l60.e;
        classSerialDescriptorBuilder.element("epochSeconds", descriptor2, l60Var, false);
        classSerialDescriptorBuilder.element("nanosecondsOfSecond", longSerializer.getDescriptor(), l60Var, true);
        return od2.a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public lm0 deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        long j = 0;
        boolean z = true;
        int i = 0;
        while (true) {
            InstantComponentSerializer instantComponentSerializer = INSTANCE;
            int decodeElementIndex = beginStructure.decodeElementIndex(instantComponentSerializer.getDescriptor());
            if (decodeElementIndex != -1) {
                if (decodeElementIndex != 0) {
                    if (decodeElementIndex == 1) {
                        i = beginStructure.decodeIntElement(instantComponentSerializer.getDescriptor(), 1);
                    } else {
                        throw new SerializationException(l90.g(decodeElementIndex, "Unexpected index: "));
                    }
                } else {
                    j = beginStructure.decodeLongElement(instantComponentSerializer.getDescriptor(), 0);
                    z = false;
                }
            } else {
                if (!z) {
                    km0 km0Var = lm0.g;
                    lm0 a = km0.a(i, j);
                    beginStructure.endStructure(descriptor2);
                    return a;
                }
                throw new MissingFieldException("epochSeconds", instantComponentSerializer.getDescriptor().getSerialName());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, lm0 value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        InstantComponentSerializer instantComponentSerializer = INSTANCE;
        beginStructure.encodeLongElement(instantComponentSerializer.getDescriptor(), 0, value.e);
        int i = value.f;
        if (i != 0 || beginStructure.shouldEncodeElementDefault(instantComponentSerializer.getDescriptor(), 1)) {
            beginStructure.encodeIntElement(instantComponentSerializer.getDescriptor(), 1, i);
        }
        beginStructure.endStructure(descriptor2);
    }
}
