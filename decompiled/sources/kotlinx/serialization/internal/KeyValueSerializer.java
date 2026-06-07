package kotlinx.serialization.internal;

import defpackage.l90;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class KeyValueSerializer<K, V, R> implements KSerializer<R> {
    private final KSerializer<K> keySerializer;
    private final KSerializer<V> valueSerializer;

    private KeyValueSerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.DeserializationStrategy
    public R deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        R r;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (!beginStructure.decodeSequentially()) {
            obj = TuplesKt.NULL;
            obj2 = TuplesKt.NULL;
            Object obj5 = obj2;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    obj3 = TuplesKt.NULL;
                    if (obj != obj3) {
                        obj4 = TuplesKt.NULL;
                        if (obj5 != obj4) {
                            r = (R) toResult(obj, obj5);
                        } else {
                            throw new SerializationException("Element 'value' is missing");
                        }
                    } else {
                        throw new SerializationException("Element 'key' is missing");
                    }
                } else if (decodeElementIndex != 0) {
                    if (decodeElementIndex == 1) {
                        obj5 = CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null);
                    } else {
                        throw new SerializationException(l90.g(decodeElementIndex, "Invalid index: "));
                    }
                } else {
                    obj = CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null);
                }
            }
        } else {
            r = (R) toResult(CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null), CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null));
        }
        beginStructure.endStructure(descriptor);
        return r;
    }

    public abstract K getKey(R r);

    public final KSerializer<K> getKeySerializer() {
        return this.keySerializer;
    }

    public abstract V getValue(R r);

    public final KSerializer<V> getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, R value) {
        encoder.getClass();
        CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, getKey(value));
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, getValue(value));
        beginStructure.endStructure(getDescriptor());
    }

    public abstract R toResult(K key, V value);

    public /* synthetic */ KeyValueSerializer(KSerializer kSerializer, KSerializer kSerializer2, yx yxVar) {
        this(kSerializer, kSerializer2);
    }
}
