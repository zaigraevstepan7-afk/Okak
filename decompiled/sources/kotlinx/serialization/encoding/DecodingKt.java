package kotlinx.serialization.encoding;

import defpackage.de0;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"", "T", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlin/Function0;", "block", "decodeIfNullable", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/DeserializationStrategy;Lde0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeStructure", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Loe0;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class DecodingKt {
    public static final <T> T decodeIfNullable(Decoder decoder, DeserializationStrategy<? extends T> deserializationStrategy, de0 de0Var) {
        decoder.getClass();
        deserializationStrategy.getClass();
        de0Var.getClass();
        if (!deserializationStrategy.getDescriptor().isNullable() && !decoder.decodeNotNullMark()) {
            return (T) decoder.decodeNull();
        }
        return (T) de0Var.invoke();
    }

    public static final <T> T decodeStructure(Decoder decoder, SerialDescriptor serialDescriptor, oe0 oe0Var) {
        decoder.getClass();
        serialDescriptor.getClass();
        oe0Var.getClass();
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        T t = (T) oe0Var.invoke(beginStructure);
        beginStructure.endStructure(serialDescriptor);
        return t;
    }
}
