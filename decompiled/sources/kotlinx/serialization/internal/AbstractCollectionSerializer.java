package kotlinx.serialization.internal;

import defpackage.se;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00028\u0001H$¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\t\u001a\u00028\u0002H$¢\u0006\u0004\b\t\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\n*\u00028\u0002H$¢\u0006\u0004\b\u0013\u0010\u000eJ\u0013\u0010\u0014\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0018*\u00028\u00022\u0006\u0010\u0017\u001a\u00020\nH$¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0001H&¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J1\u0010)\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010(\u001a\u00020'H$¢\u0006\u0004\b)\u0010*J/\u0010,\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010+\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH$¢\u0006\u0004\b,\u0010-\u0082\u0001\u0002./¨\u00060"}, d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "", "readSize", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;)I", "collectionSize", "(Ljava/lang/Object;)I", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "()Ljava/lang/Object;", "builderSize", "toResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBuilder", "size", "Lod2;", "checkCapacity", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "previous", "merge", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "index", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "startIndex", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@InternalSerializationApi
/* loaded from: classes.dex */
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ AbstractCollectionSerializer(yx yxVar) {
        this();
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 8) != 0) {
                z = true;
            }
            abstractCollectionSerializer.readElement(compositeDecoder, i, obj, z);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int readSize(CompositeDecoder decoder, Builder builder) {
        int decodeCollectionSize = decoder.decodeCollectionSize(getDescriptor());
        checkCapacity(builder, decodeCollectionSize);
        return decodeCollectionSize;
    }

    public abstract Builder builder();

    public abstract int builderSize(Builder builder);

    public abstract void checkCapacity(Builder builder, int i);

    public abstract Iterator<Element> collectionIterator(Collection collection);

    public abstract int collectionSize(Collection collection);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(Decoder decoder) {
        decoder.getClass();
        return merge(decoder, null);
    }

    @InternalSerializationApi
    public final Collection merge(Decoder decoder, Collection previous) {
        Builder builder;
        decoder.getClass();
        if (previous == null || (builder = toBuilder(previous)) == null) {
            builder = builder();
        }
        Builder builder2 = builder;
        int builderSize = builderSize(builder2);
        CompositeDecoder beginStructure = decoder.beginStructure(getDescriptor());
        if (!beginStructure.decodeSequentially()) {
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    break;
                }
                readElement$default(this, beginStructure, builderSize + decodeElementIndex, builder2, false, 8, null);
            }
        } else {
            readAll(beginStructure, builder2, builderSize, readSize(beginStructure, builder2));
        }
        beginStructure.endStructure(getDescriptor());
        return toResult(builder2);
    }

    public abstract void readAll(CompositeDecoder decoder, Builder builder, int startIndex, int size);

    public abstract void readElement(CompositeDecoder decoder, int index, Builder builder, boolean checkIndex);

    @Override // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(Encoder encoder, Collection value);

    public abstract Builder toBuilder(Collection collection);

    public abstract Collection toResult(Builder builder);

    private AbstractCollectionSerializer() {
    }
}
