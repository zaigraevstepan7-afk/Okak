package kotlinx.serialization.descriptors;

import defpackage.l60;
import defpackage.to0;
import defpackage.yn;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "getContextualDescriptor", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getPolymorphicDescriptors", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/List;", "Lto0;", "context", "withContext", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lto0;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCapturedKClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lto0;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "capturedKClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final to0 getCapturedKClass(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof ContextDescriptor) {
            return ((ContextDescriptor) serialDescriptor).kClass;
        }
        if (serialDescriptor instanceof SerialDescriptorForNullable) {
            return getCapturedKClass(((SerialDescriptorForNullable) serialDescriptor).getOriginal());
        }
        return null;
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor getContextualDescriptor(SerializersModule serializersModule, SerialDescriptor serialDescriptor) {
        KSerializer contextual$default;
        serializersModule.getClass();
        serialDescriptor.getClass();
        to0 capturedKClass = getCapturedKClass(serialDescriptor);
        if (capturedKClass == null || (contextual$default = SerializersModule.getContextual$default(serializersModule, capturedKClass, null, 2, null)) == null) {
            return null;
        }
        return contextual$default.getDescriptor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Collection] */
    @ExperimentalSerializationApi
    public static final List<SerialDescriptor> getPolymorphicDescriptors(SerializersModule serializersModule, SerialDescriptor serialDescriptor) {
        l60 l60Var;
        serializersModule.getClass();
        serialDescriptor.getClass();
        to0 capturedKClass = getCapturedKClass(serialDescriptor);
        l60 l60Var2 = l60.e;
        if (capturedKClass == null) {
            return l60Var2;
        }
        Map<to0, KSerializer<?>> map = ((SerialModuleImpl) serializersModule).polyBase2Serializers.get(capturedKClass);
        if (map != null) {
            l60Var = map.values();
        } else {
            l60Var = null;
        }
        if (l60Var != null) {
            l60Var2 = l60Var;
        }
        l60 l60Var3 = l60Var2;
        ArrayList arrayList = new ArrayList(yn.a0(l60Var3, 10));
        Iterator it = l60Var3.iterator();
        while (it.hasNext()) {
            arrayList.add(((KSerializer) it.next()).getDescriptor());
        }
        return arrayList;
    }

    public static final SerialDescriptor withContext(SerialDescriptor serialDescriptor, to0 to0Var) {
        serialDescriptor.getClass();
        to0Var.getClass();
        return new ContextDescriptor(serialDescriptor, to0Var);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getCapturedKClass$annotations(SerialDescriptor serialDescriptor) {
    }
}
