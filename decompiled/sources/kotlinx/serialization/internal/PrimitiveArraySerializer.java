package kotlinx.serialization.internal;

import defpackage.yq1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\u00028\u0001H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00028\u00022\u0006\u0010!\u001a\u00020 H$¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u00102\u0006\u0010%\u001a\u00020)2\u0006\u0010*\u001a\u00028\u0001¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020-¢\u0006\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Element", "Array", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Builder", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "builderSize", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;)I", "toResult", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;)Ljava/lang/Object;", "size", "Lod2;", "checkCapacity", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;I)V", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "insert", "(Lkotlinx/serialization/internal/PrimitiveArrayBuilder;ILjava/lang/Object;)V", "builder", "()Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "empty", "()Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/PrimitiveArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>> extends CollectionLikeSerializer<Element, Array, Builder> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArraySerializer(KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        kSerializer.getClass();
        this.descriptor = new PrimitiveArrayDescriptor(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Builder builder() {
        return (Builder) toBuilder(empty());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Builder builder) {
        builder.getClass();
        return builder.getPosition();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void checkCapacity(Builder builder, int i) {
        builder.getClass();
        builder.ensureCapacity$kotlinx_serialization_core(i);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator<Element> collectionIterator(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.DeserializationStrategy
    public final Array deserialize(Decoder decoder) {
        decoder.getClass();
        return merge(decoder, null);
    }

    public abstract Array empty();

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public final void insert(Builder builder, int i, Element element) {
        builder.getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract void readElement(CompositeDecoder decoder, int index, Builder builder, boolean checkIndex);

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Array value) {
        encoder.getClass();
        int collectionSize = collectionSize(value);
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeEncoder beginCollection = encoder.beginCollection(serialDescriptor, collectionSize);
        writeContent(beginCollection, value, collectionSize);
        beginCollection.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Array toResult(Builder builder) {
        builder.getClass();
        return (Array) builder.build$kotlinx_serialization_core();
    }

    public abstract void writeContent(CompositeEncoder encoder, Array content, int size);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i, Object obj2) {
        insert((PrimitiveArraySerializer<Element, Array, Builder>) obj, i, (int) obj2);
    }
}
