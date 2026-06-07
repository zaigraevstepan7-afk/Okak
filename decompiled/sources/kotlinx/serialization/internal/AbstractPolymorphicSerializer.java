package kotlinx.serialization.internal;

import defpackage.se;
import defpackage.to0;
import defpackage.y61;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0017\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "compositeDecoder", "decodeSequentially", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "Lto0;", "getBaseClass", "()Lto0;", "baseClass", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@InternalSerializationApi
/* loaded from: classes.dex */
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T decodeSequentially(CompositeDecoder compositeDecoder) {
        return (T) CompositeDecoder.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 1, PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder, compositeDecoder.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        T t;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            t = (T) decodeSequentially(beginStructure);
        } else {
            Object obj = null;
            String str = null;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex != 0) {
                        if (decodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(decodeElementIndex);
                            throw new SerializationException(sb.toString());
                        }
                        if (str != null) {
                            obj = CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), decodeElementIndex, PolymorphicSerializerKt.findPolymorphicSerializer(this, beginStructure, str), null, 8, null);
                        } else {
                            se.h("Cannot read polymorphic value before its type token");
                            return null;
                        }
                    } else {
                        str = beginStructure.decodeStringElement(getDescriptor(), decodeElementIndex);
                    }
                } else if (obj != null) {
                    t = (T) obj;
                } else {
                    y61.q(str, "Polymorphic value has not been read for class ");
                    return null;
                }
            }
        }
        beginStructure.endStructure(descriptor);
        return t;
    }

    @InternalSerializationApi
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        encoder.getClass();
        value.getClass();
        return encoder.getSerializersModule().getPolymorphic(getBaseClass(), (to0) value);
    }

    public abstract to0 getBaseClass();

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, T value) {
        encoder.getClass();
        value.getClass();
        SerializationStrategy<? super T> findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        beginStructure.encodeStringElement(getDescriptor(), 0, findPolymorphicSerializer.getDescriptor().getSerialName());
        beginStructure.encodeSerializableElement(getDescriptor(), 1, findPolymorphicSerializer, value);
        beginStructure.endStructure(descriptor);
    }

    @InternalSerializationApi
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String klassName) {
        decoder.getClass();
        return decoder.getSerializersModule().getPolymorphic(getBaseClass(), klassName);
    }
}
