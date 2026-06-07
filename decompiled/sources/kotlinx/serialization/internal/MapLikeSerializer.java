package kotlinx.serialization.internal;

import defpackage.go;
import defpackage.l90;
import defpackage.se;
import defpackage.tz0;
import defpackage.ym0;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u0011*\u00028\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H$¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0001\u0002+,¨\u0006-"}, d2 = {"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "", "index", "key", "value", "Lod2;", "insertKeyValuePair", "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "startIndex", "size", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/util/Map;II)V", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@InternalSerializationApi
/* loaded from: classes.dex */
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final KSerializer<Key> keySerializer;
    private final KSerializer<Value> valueSerializer;

    private MapLikeSerializer(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    public final KSerializer<Key> getKeySerializer() {
        return this.keySerializer;
    }

    public final KSerializer<Value> getValueSerializer() {
        return this.valueSerializer;
    }

    public abstract void insertKeyValuePair(Builder builder, int i, Key key, Value value);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        decoder.getClass();
        builder.getClass();
        if (size >= 0) {
            ym0 T = go.T(go.X(0, size * 2), 2);
            int i = T.e;
            int i2 = T.f;
            int i3 = T.g;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                readElement(decoder, startIndex + i, (int) builder, false);
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        } else {
            se.h("Size must be known in advance when using READ_ALL");
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        int i;
        Object decodeSerializableElement$default;
        decoder.getClass();
        builder.getClass();
        Object decodeSerializableElement$default2 = CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            i = decoder.decodeElementIndex(getDescriptor());
            if (i != index + 1) {
                se.e(l90.j("Value must follow key in a map, index for key: ", index, ", returned index for value: ", i));
                return;
            }
        } else {
            i = index + 1;
        }
        int i2 = i;
        if (builder.containsKey(decodeSerializableElement$default2) && !(this.valueSerializer.getDescriptor().getKind() instanceof PrimitiveKind)) {
            decodeSerializableElement$default = decoder.decodeSerializableElement(getDescriptor(), i2, this.valueSerializer, tz0.b0(decodeSerializableElement$default2, builder));
        } else {
            decodeSerializableElement$default = CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), i2, this.valueSerializer, null, 8, null);
        }
        builder.put(decodeSerializableElement$default2, decodeSerializableElement$default);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Collection value) {
        encoder.getClass();
        int collectionSize = collectionSize(value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginCollection = encoder.beginCollection(descriptor, collectionSize);
        Iterator<Map.Entry<? extends Key, ? extends Value>> collectionIterator = collectionIterator(value);
        int i = 0;
        while (collectionIterator.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = collectionIterator.next();
            Key key = next.getKey();
            Value value2 = next.getValue();
            int i2 = i + 1;
            beginCollection.encodeSerializableElement(getDescriptor(), i, getKeySerializer(), key);
            i += 2;
            beginCollection.encodeSerializableElement(getDescriptor(), i2, getValueSerializer(), value2);
        }
        beginCollection.endStructure(descriptor);
    }

    public /* synthetic */ MapLikeSerializer(KSerializer kSerializer, KSerializer kSerializer2, yx yxVar) {
        this(kSerializer, kSerializer2);
    }
}
