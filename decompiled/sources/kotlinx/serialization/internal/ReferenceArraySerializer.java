package kotlinx.serialization.internal;

import defpackage.to0;
import defpackage.y;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lkotlinx/serialization/internal/ReferenceArraySerializer;", "", "ElementKlass", "Element", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lto0;", "kClass", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lto0;Lkotlinx/serialization/KSerializer;)V", "", "collectionSize", "([Ljava/lang/Object;)I", "", "collectionIterator", "([Ljava/lang/Object;)Ljava/util/Iterator;", "builder", "()Ljava/util/ArrayList;", "builderSize", "(Ljava/util/ArrayList;)I", "toResult", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "toBuilder", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "Lod2;", "checkCapacity", "(Ljava/util/ArrayList;I)V", "index", "element", "insert", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lto0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {
    private final SerialDescriptor descriptor;
    private final to0 kClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(to0 to0Var, KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        to0Var.getClass();
        kSerializer.getClass();
        this.kClass = to0Var;
        this.descriptor = new ArrayClassDesc(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<Element> builder() {
        return new ArrayList<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(ArrayList<Element> arrayList) {
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(ArrayList<Element> arrayList, int i) {
        arrayList.getClass();
        arrayList.ensureCapacity(i);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<Element> collectionIterator(Element[] elementArr) {
        elementArr.getClass();
        return new y(elementArr);
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public void insert(ArrayList<Element> arrayList, int i, Element element) {
        arrayList.getClass();
        arrayList.add(i, element);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public ArrayList<Element> toBuilder(Element[] elementArr) {
        elementArr.getClass();
        List asList = Arrays.asList(elementArr);
        asList.getClass();
        return new ArrayList<>(asList);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Element[] toResult(ArrayList<Element> arrayList) {
        arrayList.getClass();
        return (Element[]) PlatformKt.toNativeArrayImpl(arrayList, this.kClass);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Element[] elementArr) {
        elementArr.getClass();
        return elementArr.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i, Object obj2) {
        insert((ArrayList<int>) obj, i, (int) obj2);
    }
}
