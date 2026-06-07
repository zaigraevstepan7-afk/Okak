package kotlinx.serialization.modules;

import defpackage.f00;
import defpackage.m60;
import defpackage.oe0;
import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.ContextualProvider;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0003\" \u0010\u0005\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b*>\b\u0000\u0010\u000f\u001a\u0004\b\u0000\u0010\u000b\"\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\f2\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\f*:\b\u0000\u0010\u0011\u001a\u0004\b\u0000\u0010\u000b\"\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00100\f2\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00100\f¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "other", "plus", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/modules/SerializersModule;", "overwriteWith", "EmptySerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule$annotations", "()V", "Base", "Lkotlin/Function1;", "", "Lkotlinx/serialization/DeserializationStrategy;", "PolymorphicDeserializerProvider", "Lkotlinx/serialization/SerializationStrategy;", "PolymorphicSerializerProvider", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerializersModuleKt {
    private static final SerializersModule EmptySerializersModule;

    static {
        m60 m60Var = m60.e;
        EmptySerializersModule = new SerialModuleImpl(m60Var, m60Var, m60Var, m60Var, m60Var, false);
    }

    public static final SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }

    public static final SerializersModule overwriteWith(SerializersModule serializersModule, SerializersModule serializersModule2) {
        serializersModule.getClass();
        serializersModule2.getClass();
        final SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        serializersModule2.dumpTo(new SerializersModuleCollector() { // from class: kotlinx.serialization.modules.SerializersModuleKt$overwriteWith$1$1
            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(to0 kClass, KSerializer<T> serializer) {
                kClass.getClass();
                serializer.getClass();
                SerializersModuleBuilder.this.registerSerializer(kClass, new ContextualProvider.Argless(serializer), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base, Sub extends Base> void polymorphic(to0 baseClass, to0 actualClass, KSerializer<Sub> actualSerializer) {
                baseClass.getClass();
                actualClass.getClass();
                actualSerializer.getClass();
                SerializersModuleBuilder.this.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true);
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
                SerializersModuleBuilder.this.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base> void polymorphicDefaultSerializer(to0 baseClass, oe0 defaultSerializerProvider) {
                baseClass.getClass();
                defaultSerializerProvider.getClass();
                SerializersModuleBuilder.this.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(to0 kClass, oe0 provider) {
                kClass.getClass();
                provider.getClass();
                SerializersModuleBuilder.this.registerSerializer(kClass, new ContextualProvider.WithTypeArguments(provider), true);
            }
        });
        return serializersModuleBuilder.build();
    }

    public static final SerializersModule plus(SerializersModule serializersModule, SerializersModule serializersModule2) {
        serializersModule.getClass();
        serializersModule2.getClass();
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        serializersModuleBuilder.include(serializersModule2);
        return serializersModuleBuilder.build();
    }

    @f00
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }
}
