package kotlinx.serialization.internal;

import defpackage.cn;
import defpackage.fp0;
import defpackage.gp0;
import defpackage.oe0;
import defpackage.to0;
import defpackage.uo0;
import defpackage.y61;
import defpackage.yq1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\nH\u0081\b¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\rH\u0081\b¢\u0006\u0004\b\u000b\u0010\u000e\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\u000fH\u0081\b¢\u0006\u0004\b\u000b\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u0019*\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "cachedSerialNames", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Set;", "", "", "compactArray", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "Lkotlinx/serialization/KSerializer;", "cast", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Lkotlinx/serialization/DeserializationStrategy;", "Lto0;", "", "serializerNotRegistered", "(Lto0;)Ljava/lang/Void;", "notRegisteredMessage", "(Lto0;)Ljava/lang/String;", "className", "(Ljava/lang/String;)Ljava/lang/String;", "Lfp0;", "", "kclass", "(Lfp0;)Lto0;", "Lgp0;", "typeOrThrow", "(Lgp0;)Lfp0;", "K", "", "Lkotlin/Function1;", "selector", "", "elementsHashCodeBy", "(Ljava/lang/Iterable;Loe0;)I", "EMPTY_DESCRIPTOR_ARRAY", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Platform_commonKt {
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    public static final Set<String> cachedSerialNames(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).getSerialNames();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.add(serialDescriptor.getElementName(i));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> DeserializationStrategy<T> cast(DeserializationStrategy<?> deserializationStrategy) {
        deserializationStrategy.getClass();
        return deserializationStrategy;
    }

    public static final SerialDescriptor[] compactArray(List<? extends SerialDescriptor> list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null && (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) != null) {
            return serialDescriptorArr;
        }
        return EMPTY_DESCRIPTOR_ARRAY;
    }

    public static final <T, K> int elementsHashCodeBy(Iterable<? extends T> iterable, oe0 oe0Var) {
        int i;
        iterable.getClass();
        oe0Var.getClass();
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 * 31;
            Object invoke = oe0Var.invoke(it.next());
            if (invoke != null) {
                i = invoke.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public static final to0 kclass(fp0 fp0Var) {
        fp0Var.getClass();
        uo0 classifier = fp0Var.getClassifier();
        if (classifier instanceof to0) {
            return (to0) classifier;
        }
        y61.u(classifier, "Only KClass supported as classifier, got ");
        return null;
    }

    public static final String notRegisteredMessage(String str) {
        str.getClass();
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final Void serializerNotRegistered(to0 to0Var) {
        to0Var.getClass();
        throw new SerializationException(notRegisteredMessage(to0Var));
    }

    public static final fp0 typeOrThrow(gp0 gp0Var) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> KSerializer<T> cast(KSerializer<?> kSerializer) {
        kSerializer.getClass();
        return kSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> SerializationStrategy<T> cast(SerializationStrategy<?> serializationStrategy) {
        serializationStrategy.getClass();
        return serializationStrategy;
    }

    public static final String notRegisteredMessage(to0 to0Var) {
        to0Var.getClass();
        String d = ((cn) to0Var).d();
        if (d == null) {
            d = "<local class name not available>";
        }
        return notRegisteredMessage(d);
    }
}
