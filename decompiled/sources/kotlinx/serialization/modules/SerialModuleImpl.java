package kotlinx.serialization.modules;

import defpackage.cn;
import defpackage.fc2;
import defpackage.oe0;
import defpackage.se;
import defpackage.to0;
import defpackage.yl1;
import defpackage.yq1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u00122\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001cJA\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R@\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "", "Lto0;", "Lkotlinx/serialization/modules/ContextualProvider;", "class2ContextualFactory", "Lkotlinx/serialization/KSerializer;", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "", "T", "baseClass", "value", "getPolymorphic", "(Lto0;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "serializedClassName", "(Lto0;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "kClass", "", "typeArgumentsSerializers", "getContextual", "(Lto0;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "collector", "Lod2;", "dumpTo", "(Lkotlinx/serialization/modules/SerializersModuleCollector;)V", "Ljava/util/Map;", "Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerialModuleImpl extends SerializersModule {
    private final Map<to0, ContextualProvider> class2ContextualFactory;
    private final boolean hasInterfaceContextualSerializers;
    private final Map<to0, oe0> polyBase2DefaultDeserializerProvider;
    private final Map<to0, oe0> polyBase2DefaultSerializerProvider;
    private final Map<to0, Map<String, KSerializer<?>>> polyBase2NamedSerializers;
    public final Map<to0, Map<to0, KSerializer<?>>> polyBase2Serializers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SerialModuleImpl(Map<to0, ? extends ContextualProvider> map, Map<to0, ? extends Map<to0, ? extends KSerializer<?>>> map2, Map<to0, ? extends oe0> map3, Map<to0, ? extends Map<String, ? extends KSerializer<?>>> map4, Map<to0, ? extends oe0> map5, boolean z) {
        super(null);
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.class2ContextualFactory = map;
        this.polyBase2Serializers = map2;
        this.polyBase2DefaultSerializerProvider = map3;
        this.polyBase2NamedSerializers = map4;
        this.polyBase2DefaultDeserializerProvider = map5;
        this.hasInterfaceContextualSerializers = z;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public void dumpTo(SerializersModuleCollector collector) {
        collector.getClass();
        for (Map.Entry<to0, ContextualProvider> entry : this.class2ContextualFactory.entrySet()) {
            to0 key = entry.getKey();
            ContextualProvider value = entry.getValue();
            if (value instanceof ContextualProvider.Argless) {
                key.getClass();
                KSerializer<?> serializer = ((ContextualProvider.Argless) value).getSerializer();
                serializer.getClass();
                collector.contextual(key, serializer);
            } else if (value instanceof ContextualProvider.WithTypeArguments) {
                collector.contextual(key, ((ContextualProvider.WithTypeArguments) value).getProvider());
            } else {
                se.m();
                return;
            }
        }
        for (Map.Entry<to0, Map<to0, KSerializer<?>>> entry2 : this.polyBase2Serializers.entrySet()) {
            to0 key2 = entry2.getKey();
            for (Map.Entry<to0, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                to0 key3 = entry3.getKey();
                KSerializer<?> value2 = entry3.getValue();
                key2.getClass();
                key3.getClass();
                value2.getClass();
                collector.polymorphic(key2, key3, value2);
            }
        }
        for (Map.Entry<to0, oe0> entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            to0 key4 = entry4.getKey();
            oe0 value3 = entry4.getValue();
            key4.getClass();
            value3.getClass();
            fc2.t(1, value3);
            collector.polymorphicDefaultSerializer(key4, value3);
        }
        for (Map.Entry<to0, oe0> entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            to0 key5 = entry5.getKey();
            oe0 value4 = entry5.getValue();
            key5.getClass();
            value4.getClass();
            fc2.t(1, value4);
            collector.polymorphicDefaultDeserializer(key5, value4);
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> KSerializer<T> getContextual(to0 kClass, List<? extends KSerializer<?>> typeArgumentsSerializers) {
        KSerializer<T> kSerializer;
        kClass.getClass();
        typeArgumentsSerializers.getClass();
        ContextualProvider contextualProvider = this.class2ContextualFactory.get(kClass);
        if (contextualProvider != null) {
            kSerializer = (KSerializer<T>) contextualProvider.invoke(typeArgumentsSerializers);
        } else {
            kSerializer = null;
        }
        if (kSerializer instanceof KSerializer) {
            return kSerializer;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    /* renamed from: getHasInterfaceContextualSerializers$kotlinx_serialization_core, reason: from getter */
    public boolean getHasInterfaceContextualSerializers() {
        return this.hasInterfaceContextualSerializers;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> SerializationStrategy<T> getPolymorphic(to0 baseClass, T value) {
        KSerializer<?> kSerializer;
        KSerializer<?> kSerializer2;
        oe0 oe0Var;
        baseClass.getClass();
        value.getClass();
        if (((cn) baseClass).e(value)) {
            Map<to0, KSerializer<?>> map = this.polyBase2Serializers.get(baseClass);
            if (map != null) {
                kSerializer = map.get(yl1.a(value.getClass()));
            } else {
                kSerializer = null;
            }
            if (kSerializer instanceof SerializationStrategy) {
                kSerializer2 = kSerializer;
            } else {
                kSerializer2 = null;
            }
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            oe0 oe0Var2 = this.polyBase2DefaultSerializerProvider.get(baseClass);
            if (fc2.C(1, oe0Var2)) {
                oe0Var = oe0Var2;
            } else {
                oe0Var = null;
            }
            if (oe0Var != null) {
                return (SerializationStrategy) oe0Var.invoke(value);
            }
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> DeserializationStrategy<T> getPolymorphic(to0 baseClass, String serializedClassName) {
        baseClass.getClass();
        Map<String, KSerializer<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        KSerializer<?> kSerializer = map != null ? map.get(serializedClassName) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        oe0 oe0Var = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        oe0 oe0Var2 = fc2.C(1, oe0Var) ? oe0Var : null;
        if (oe0Var2 != null) {
            return (DeserializationStrategy) oe0Var2.invoke(serializedClassName);
        }
        return null;
    }
}
