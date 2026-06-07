package kotlinx.serialization.internal;

import defpackage.yq1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/internal/ArrayListSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "builder", "()Ljava/util/ArrayList;", "", "builderSize", "(Ljava/util/ArrayList;)I", "toResult", "(Ljava/util/ArrayList;)Ljava/util/List;", "toBuilder", "(Ljava/util/List;)Ljava/util/ArrayList;", "size", "Lod2;", "checkCapacity", "(Ljava/util/ArrayList;I)V", "index", "insert", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@InternalSerializationApi
/* loaded from: classes.dex */
public final class ArrayListSerializer<E> extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayListSerializer(KSerializer<E> kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.descriptor = new ArrayListClassDesc(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<E> builder() {
        return new ArrayList<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(ArrayList<E> arrayList) {
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(ArrayList<E> arrayList, int i) {
        arrayList.getClass();
        arrayList.ensureCapacity(i);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public void insert(ArrayList<E> arrayList, int i, E e) {
        arrayList.getClass();
        arrayList.add(i, e);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<E> toBuilder(List<? extends E> list) {
        ArrayList<E> arrayList;
        list.getClass();
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList<>(list);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i, Object obj2) {
        insert((ArrayList<int>) obj, i, (int) obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public List<E> toResult(ArrayList<E> arrayList) {
        arrayList.getClass();
        return arrayList;
    }
}
