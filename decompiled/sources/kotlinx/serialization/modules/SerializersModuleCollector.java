package kotlinx.serialization.modules;

import defpackage.f00;
import defpackage.hh1;
import defpackage.oe0;
import defpackage.to0;
import defpackage.yq1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJI\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010\f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\b\u0010\rJM\u0010\u0013\u001a\u00020\u0007\"\b\b\u0000\u0010\u000e*\u00020\u0001\"\b\b\u0001\u0010\u000f*\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0017\u001a\u00020\u0007\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00150\nH&¢\u0006\u0004\b\u0017\u0010\rJE\u0010\u001b\u001a\u00020\u0007\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u001a\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00190\nH&¢\u0006\u0004\b\u001b\u0010\rJE\u0010\u001c\u001a\u00020\u0007\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u001a\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00190\nH\u0017¢\u0006\u0004\b\u001c\u0010\r¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "T", "Lto0;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "Lod2;", "contextual", "(Lto0;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "provider", "(Lto0;Loe0;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lto0;Lto0;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "polymorphicDefault", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public interface SerializersModuleCollector {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> void contextual(SerializersModuleCollector serializersModuleCollector, to0 to0Var, KSerializer<T> kSerializer) {
            to0Var.getClass();
            kSerializer.getClass();
            SerializersModuleCollector.super.contextual(to0Var, kSerializer);
        }

        @f00
        @Deprecated
        public static <Base> void polymorphicDefault(SerializersModuleCollector serializersModuleCollector, to0 to0Var, oe0 oe0Var) {
            to0Var.getClass();
            oe0Var.getClass();
            SerializersModuleCollector.super.polymorphicDefault(to0Var, oe0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static KSerializer contextual$lambda$0(KSerializer kSerializer, List list) {
        list.getClass();
        return kSerializer;
    }

    default <T> void contextual(to0 kClass, KSerializer<T> serializer) {
        kClass.getClass();
        serializer.getClass();
        contextual(kClass, new hh1(serializer, 11));
    }

    <T> void contextual(to0 kClass, oe0 provider);

    <Base, Sub extends Base> void polymorphic(to0 baseClass, to0 actualClass, KSerializer<Sub> actualSerializer);

    @f00
    default <Base> void polymorphicDefault(to0 baseClass, oe0 defaultDeserializerProvider) {
        baseClass.getClass();
        defaultDeserializerProvider.getClass();
        polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
    }

    <Base> void polymorphicDefaultDeserializer(to0 baseClass, oe0 defaultDeserializerProvider);

    <Base> void polymorphicDefaultSerializer(to0 baseClass, oe0 defaultSerializerProvider);
}
