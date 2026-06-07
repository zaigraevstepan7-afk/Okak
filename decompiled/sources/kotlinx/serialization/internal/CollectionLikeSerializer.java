package kotlinx.serialization.internal;

import defpackage.se;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0001\u0003$%&¨\u0006'"}, d2 = {"Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Lkotlinx/serialization/KSerializer;", "elementSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "index", "element", "Lod2;", "insert", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "startIndex", "size", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/internal/CollectionSerializer;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlinx/serialization/internal/ReferenceArraySerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {
    private final KSerializer<Element> elementSerializer;

    private CollectionLikeSerializer(KSerializer<Element> kSerializer) {
        super(null);
        this.elementSerializer = kSerializer;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    public abstract void insert(Builder builder, int i, Element element);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        decoder.getClass();
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                readElement(decoder, startIndex + i, builder, false);
            }
            return;
        }
        se.h("Size must be known in advance when using READ_ALL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        decoder.getClass();
        insert(builder, index, CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), index, this.elementSerializer, null, 8, null));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Collection value) {
        encoder.getClass();
        int collectionSize = collectionSize(value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginCollection = encoder.beginCollection(descriptor, collectionSize);
        Iterator<Element> collectionIterator = collectionIterator(value);
        for (int i = 0; i < collectionSize; i++) {
            beginCollection.encodeSerializableElement(getDescriptor(), i, this.elementSerializer, collectionIterator.next());
        }
        beginCollection.endStructure(descriptor);
    }

    public /* synthetic */ CollectionLikeSerializer(KSerializer kSerializer, yx yxVar) {
        this(kSerializer);
    }
}
