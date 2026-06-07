package kotlinx.serialization.internal;

import defpackage.cc2;
import defpackage.hh1;
import defpackage.l90;
import defpackage.od2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/TripleSerializer;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lcc2;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "composite", "decodeSequentially", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Lcc2;", "decodeStructure", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcc2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcc2;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class TripleSerializer<A, B, C> implements KSerializer<cc2> {
    private final KSerializer<A> aSerializer;
    private final KSerializer<B> bSerializer;
    private final KSerializer<C> cSerializer;
    private final SerialDescriptor descriptor;

    public TripleSerializer(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        this.aSerializer = kSerializer;
        this.bSerializer = kSerializer2;
        this.cSerializer = kSerializer3;
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], new hh1(this, 21));
    }

    public static /* synthetic */ od2 a(TripleSerializer tripleSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        return descriptor$lambda$0(tripleSerializer, classSerialDescriptorBuilder);
    }

    private final cc2 decodeSequentially(CompositeDecoder composite) {
        Object decodeSerializableElement$default = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
        Object decodeSerializableElement$default2 = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
        Object decodeSerializableElement$default3 = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
        composite.endStructure(getDescriptor());
        return new cc2(decodeSerializableElement$default, decodeSerializableElement$default2, decodeSerializableElement$default3);
    }

    private final cc2 decodeStructure(CompositeDecoder composite) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        CompositeDecoder compositeDecoder;
        obj = TuplesKt.NULL;
        obj2 = TuplesKt.NULL;
        obj3 = TuplesKt.NULL;
        while (true) {
            int decodeElementIndex = composite.decodeElementIndex(getDescriptor());
            if (decodeElementIndex != -1) {
                if (decodeElementIndex != 0) {
                    if (decodeElementIndex != 1) {
                        if (decodeElementIndex == 2) {
                            obj3 = CompositeDecoder.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
                        } else {
                            throw new SerializationException(l90.g(decodeElementIndex, "Unexpected index "));
                        }
                    } else {
                        compositeDecoder = composite;
                        obj2 = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 1, this.bSerializer, null, 8, null);
                    }
                } else {
                    compositeDecoder = composite;
                    obj = CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 0, this.aSerializer, null, 8, null);
                }
                composite = compositeDecoder;
            } else {
                composite.endStructure(getDescriptor());
                obj4 = TuplesKt.NULL;
                if (obj != obj4) {
                    obj5 = TuplesKt.NULL;
                    if (obj2 != obj5) {
                        obj6 = TuplesKt.NULL;
                        if (obj3 != obj6) {
                            return new cc2(obj, obj2, obj3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
        }
    }

    public static final od2 descriptor$lambda$0(TripleSerializer tripleSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "first", tripleSerializer.aSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "second", tripleSerializer.bSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "third", tripleSerializer.cSerializer.getDescriptor(), null, false, 12, null);
        return od2.a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public cc2 deserialize(Decoder decoder) {
        decoder.getClass();
        CompositeDecoder beginStructure = decoder.beginStructure(getDescriptor());
        if (beginStructure.decodeSequentially()) {
            return decodeSequentially(beginStructure);
        }
        return decodeStructure(beginStructure);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, cc2 value) {
        encoder.getClass();
        value.getClass();
        CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.aSerializer, value.e);
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.bSerializer, value.f);
        beginStructure.encodeSerializableElement(getDescriptor(), 2, this.cSerializer, value.g);
        beginStructure.endStructure(getDescriptor());
    }
}
