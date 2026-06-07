package kotlinx.serialization.modules;

import defpackage.od2;
import defpackage.oe0;
import defpackage.sn0;
import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0012\u001a\u00020\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a]\u0010\u0018\u001a\u00020\f\"\b\b\u0000\u0010\u0014*\u00020\u0000*\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\f0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"", "T", "Lto0;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModuleOf", "(Lto0;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/modules/SerializersModule;", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lod2;", "builderAction", "SerializersModule", "(Loe0;)Lkotlinx/serialization/modules/SerializersModule;", "EmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "contextual", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;Lkotlinx/serialization/KSerializer;)V", "Base", "baseClass", "baseSerializer", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "polymorphic", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;Lto0;Lkotlinx/serialization/KSerializer;Loe0;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerializersModuleBuildersKt {
    public static final SerializersModule EmptySerializersModule() {
        return SerializersModuleKt.getEmptySerializersModule();
    }

    public static final SerializersModule SerializersModule(oe0 oe0Var) {
        oe0Var.getClass();
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        oe0Var.invoke(serializersModuleBuilder);
        return serializersModuleBuilder.build();
    }

    public static final /* synthetic */ <T> void contextual(SerializersModuleBuilder serializersModuleBuilder, KSerializer<T> kSerializer) {
        serializersModuleBuilder.getClass();
        kSerializer.getClass();
        sn0.R();
        throw null;
    }

    public static final <Base> void polymorphic(SerializersModuleBuilder serializersModuleBuilder, to0 to0Var, KSerializer<Base> kSerializer, oe0 oe0Var) {
        serializersModuleBuilder.getClass();
        to0Var.getClass();
        oe0Var.getClass();
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(to0Var, kSerializer);
        oe0Var.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static /* synthetic */ void polymorphic$default(SerializersModuleBuilder serializersModuleBuilder, to0 to0Var, KSerializer kSerializer, oe0 oe0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            kSerializer = null;
        }
        if ((i & 4) != 0) {
            oe0Var = new oe0() { // from class: kotlinx.serialization.modules.SerializersModuleBuildersKt$polymorphic$1
                @Override // defpackage.oe0
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PolymorphicModuleBuilder) obj2);
                    return od2.a;
                }

                public final void invoke(PolymorphicModuleBuilder polymorphicModuleBuilder) {
                    polymorphicModuleBuilder.getClass();
                }
            };
        }
        serializersModuleBuilder.getClass();
        to0Var.getClass();
        oe0Var.getClass();
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(to0Var, kSerializer);
        oe0Var.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static final <T> SerializersModule serializersModuleOf(to0 to0Var, KSerializer<T> kSerializer) {
        to0Var.getClass();
        kSerializer.getClass();
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.contextual(to0Var, kSerializer);
        return serializersModuleBuilder.build();
    }

    public static final /* synthetic */ <T> SerializersModule serializersModuleOf(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        sn0.R();
        throw null;
    }
}
