package kotlinx.serialization.modules;

import defpackage.f00;
import defpackage.oe0;
import defpackage.to0;
import defpackage.y61;
import defpackage.yq1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.modules.ContextualProvider;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062 \u0010\u000f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\rH\u0016¢\u0006\u0004\b\u000b\u0010\u0010JM\u0010\u0016\u001a\u00020\n\"\b\b\u0000\u0010\u0011*\u00020\u0004\"\b\b\u0001\u0010\u0012*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001a\u001a\u00020\n\"\b\b\u0000\u0010\u0011*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00180\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0010JE\u0010\u001e\u001a\u00020\n\"\b\b\u0000\u0010\u0011*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001c\u0010\u001d\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c0\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J9\u0010'\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000f\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b'\u0010(JK\u0010)\u001a\u00020\n\"\b\b\u0000\u0010\u0011*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00180\r2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b)\u0010*JM\u0010+\u001a\u00020\n\"\b\b\u0000\u0010\u0011*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001c\u0010\u001d\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c0\r2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b+\u0010*JW\u0010.\u001a\u00020\n\"\b\b\u0000\u0010\u0011*\u00020\u0004\"\b\b\u0001\u0010\u0012*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\b\b\u0002\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0001¢\u0006\u0004\b0\u00101R$\u00103\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020$028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R8\u00105\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b02028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R<\u00107\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00180\rj\u0006\u0012\u0002\b\u0003`6028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R4\u00108\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b02028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R@\u0010:\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001c0\rj\u0006\u0012\u0002\b\u0003`9028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010;\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "<init>", "()V", "", "T", "Lto0;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "Lod2;", "contextual", "(Lto0;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "provider", "(Lto0;Loe0;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lto0;Lto0;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "Lkotlinx/serialization/modules/SerializersModule;", "module", "include", "(Lkotlinx/serialization/modules/SerializersModule;)V", "forClass", "Lkotlinx/serialization/modules/ContextualProvider;", "", "allowOverwrite", "registerSerializer", "(Lto0;Lkotlinx/serialization/modules/ContextualProvider;Z)V", "registerDefaultPolymorphicSerializer", "(Lto0;Loe0;Z)V", "registerDefaultPolymorphicDeserializer", "concreteClass", "concreteSerializer", "registerPolymorphicSerializer", "(Lto0;Lto0;Lkotlinx/serialization/KSerializer;Z)V", "build", "()Lkotlinx/serialization/modules/SerializersModule;", "", "class2ContextualProvider", "Ljava/util/Map;", "polyBase2Serializers", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "hasInterfaceContextualSerializers", "Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerializersModuleBuilder implements SerializersModuleCollector {
    private boolean hasInterfaceContextualSerializers;
    private final Map<to0, ContextualProvider> class2ContextualProvider = new HashMap();
    private final Map<to0, Map<to0, KSerializer<?>>> polyBase2Serializers = new HashMap();
    private final Map<to0, oe0> polyBase2DefaultSerializerProvider = new HashMap();
    private final Map<to0, Map<String, KSerializer<?>>> polyBase2NamedSerializers = new HashMap();
    private final Map<to0, oe0> polyBase2DefaultDeserializerProvider = new HashMap();

    public static /* synthetic */ void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder, to0 to0Var, to0 to0Var2, KSerializer kSerializer, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerPolymorphicSerializer(to0Var, to0Var2, kSerializer, z);
    }

    public static /* synthetic */ void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder, to0 to0Var, ContextualProvider contextualProvider, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerSerializer(to0Var, contextualProvider, z);
    }

    public final SerializersModule build() {
        return new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(to0 kClass, KSerializer<T> serializer) {
        kClass.getClass();
        serializer.getClass();
        registerSerializer$default(this, kClass, new ContextualProvider.Argless(serializer), false, 4, null);
    }

    public final void include(SerializersModule module) {
        module.getClass();
        module.dumpTo(this);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(to0 baseClass, to0 actualClass, KSerializer<Sub> actualSerializer) {
        baseClass.getClass();
        actualClass.getClass();
        actualSerializer.getClass();
        registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    @f00
    public <Base> void polymorphicDefault(to0 to0Var, oe0 oe0Var) {
        super.polymorphicDefault(to0Var, oe0Var);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultDeserializer(to0 baseClass, oe0 defaultDeserializerProvider) {
        baseClass.getClass();
        defaultDeserializerProvider.getClass();
        registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(to0 baseClass, oe0 defaultSerializerProvider) {
        baseClass.getClass();
        defaultSerializerProvider.getClass();
        registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
    }

    public final <Base> void registerDefaultPolymorphicDeserializer(to0 baseClass, oe0 defaultDeserializerProvider, boolean allowOverwrite) {
        baseClass.getClass();
        defaultDeserializerProvider.getClass();
        oe0 oe0Var = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        if (oe0Var != null && !oe0Var.equals(defaultDeserializerProvider) && !allowOverwrite) {
            y61.v("Default deserializers provider for ", baseClass, " is already registered: ", oe0Var);
        } else {
            this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
        }
    }

    public final <Base> void registerDefaultPolymorphicSerializer(to0 baseClass, oe0 defaultSerializerProvider, boolean allowOverwrite) {
        baseClass.getClass();
        defaultSerializerProvider.getClass();
        oe0 oe0Var = this.polyBase2DefaultSerializerProvider.get(baseClass);
        if (oe0Var != null && !oe0Var.equals(defaultSerializerProvider) && !allowOverwrite) {
            y61.v("Default serializers provider for ", baseClass, " is already registered: ", oe0Var);
        } else {
            this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
        }
    }

    public final <Base, Sub extends Base> void registerPolymorphicSerializer(to0 baseClass, to0 concreteClass, KSerializer<Sub> concreteSerializer, boolean allowOverwrite) {
        Object obj;
        to0 to0Var;
        baseClass.getClass();
        concreteClass.getClass();
        concreteSerializer.getClass();
        String serialName = concreteSerializer.getDescriptor().getSerialName();
        Map<to0, Map<to0, KSerializer<?>>> map = this.polyBase2Serializers;
        Map<to0, KSerializer<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(baseClass, map2);
        }
        Map<to0, KSerializer<?>> map3 = map2;
        Map<to0, Map<String, KSerializer<?>>> map4 = this.polyBase2NamedSerializers;
        Map<String, KSerializer<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(baseClass, map5);
        }
        Map<String, KSerializer<?>> map6 = map5;
        KSerializer<?> kSerializer = map3.get(concreteClass);
        if (kSerializer != null && !kSerializer.equals(concreteSerializer)) {
            if (allowOverwrite) {
                map6.remove(kSerializer.getDescriptor().getSerialName());
            } else {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
        }
        KSerializer<?> kSerializer2 = map6.get(serialName);
        if (kSerializer2 != null && !kSerializer2.equals(concreteSerializer)) {
            Set<Map.Entry<to0, KSerializer<?>>> entrySet = map3.entrySet();
            entrySet.getClass();
            Iterator<T> it = entrySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == kSerializer2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null && (to0Var = (to0) entry.getKey()) != null) {
                if (allowOverwrite) {
                    map3.remove(to0Var);
                } else {
                    throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + serialName + "': " + concreteSerializer + " for '" + concreteClass + "' and " + kSerializer2 + " for '" + to0Var + '\'');
                }
            } else {
                throw new IllegalStateException(("Name " + serialName + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
        }
        map3.put(concreteClass, concreteSerializer);
        map6.put(serialName, concreteSerializer);
    }

    public final <T> void registerSerializer(to0 forClass, ContextualProvider provider, boolean allowOverwrite) {
        ContextualProvider contextualProvider;
        forClass.getClass();
        provider.getClass();
        if (!allowOverwrite && (contextualProvider = this.class2ContextualProvider.get(forClass)) != null && !contextualProvider.equals(provider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        this.class2ContextualProvider.put(forClass, provider);
        if (PlatformKt.isInterface(forClass)) {
            this.hasInterfaceContextualSerializers = true;
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(to0 kClass, oe0 provider) {
        kClass.getClass();
        provider.getClass();
        registerSerializer$default(this, kClass, new ContextualProvider.WithTypeArguments(provider), false, 4, null);
    }
}
