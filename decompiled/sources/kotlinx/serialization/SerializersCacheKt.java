package kotlinx.serialization;

import defpackage.fp0;
import defpackage.ir1;
import defpackage.nv1;
import defpackage.to0;
import defpackage.uo0;
import defpackage.yd;
import defpackage.yq1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\"\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u0000H\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\"(\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\"\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u0012\u0004\b\u0019\u0010\u0017\"\"\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0017\"\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u0012\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lto0;", "", "clazz", "", "isNullable", "Lkotlinx/serialization/KSerializer;", "findCachedSerializer", "(Lto0;Z)Lkotlinx/serialization/KSerializer;", "", "Lfp0;", "types", "Lgo1;", "findParametrizedCachedSerializer", "(Lto0;Ljava/util/List;Z)Ljava/lang/Object;", "Lkotlinx/serialization/PolymorphicSerializer;", "polymorphicIfInterface", "(Lto0;)Lkotlinx/serialization/PolymorphicSerializer;", "Lkotlinx/serialization/internal/SerializerCache;", "SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/SerializerCache;", "getSERIALIZERS_CACHE", "()Lkotlinx/serialization/internal/SerializerCache;", "getSERIALIZERS_CACHE$annotations", "()V", "SERIALIZERS_CACHE_NULLABLE", "getSERIALIZERS_CACHE_NULLABLE$annotations", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "PARAMETRIZED_SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerializersCacheKt {
    private static final SerializerCache<? extends Object> SERIALIZERS_CACHE = CachingKt.createCache(new nv1(2));
    private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(new nv1(3));
    private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(new ir1(20));
    private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(new ir1(21));

    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(to0 to0Var, List list) {
        to0Var.getClass();
        list.getClass();
        List<KSerializer<Object>> serializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), list, true);
        serializersForParameters.getClass();
        return SerializersKt.parametrizedSerializerOrNull(to0Var, serializersForParameters, new yd(4, list));
    }

    public static final uo0 PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List list) {
        return ((fp0) list.get(0)).getClassifier();
    }

    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(to0 to0Var, List list) {
        KSerializer nullable;
        to0Var.getClass();
        list.getClass();
        List<KSerializer<Object>> serializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), list, true);
        serializersForParameters.getClass();
        KSerializer<? extends Object> parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(to0Var, serializersForParameters, new yd(5, list));
        if (parametrizedSerializerOrNull != null && (nullable = BuiltinSerializersKt.getNullable(parametrizedSerializerOrNull)) != null) {
            return nullable;
        }
        return null;
    }

    public static final uo0 PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List list) {
        return ((fp0) list.get(0)).getClassifier();
    }

    public static final KSerializer SERIALIZERS_CACHE$lambda$0(to0 to0Var) {
        to0Var.getClass();
        KSerializer serializerOrNull = SerializersKt.serializerOrNull(to0Var);
        if (serializerOrNull == null) {
            if (PlatformKt.isInterface(to0Var)) {
                return new PolymorphicSerializer(to0Var);
            }
            return null;
        }
        return serializerOrNull;
    }

    public static final KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(to0 to0Var) {
        KSerializer nullable;
        to0Var.getClass();
        KSerializer serializerOrNull = SerializersKt.serializerOrNull(to0Var);
        if (serializerOrNull == null) {
            if (PlatformKt.isInterface(to0Var)) {
                serializerOrNull = new PolymorphicSerializer(to0Var);
            } else {
                serializerOrNull = null;
            }
        }
        if (serializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(serializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    public static final KSerializer<Object> findCachedSerializer(to0 to0Var, boolean z) {
        to0Var.getClass();
        if (!z) {
            KSerializer<? extends Object> kSerializer = SERIALIZERS_CACHE.get(to0Var);
            if (kSerializer != null) {
                return kSerializer;
            }
            return null;
        }
        return SERIALIZERS_CACHE_NULLABLE.get(to0Var);
    }

    public static final Object findParametrizedCachedSerializer(to0 to0Var, List<? extends fp0> list, boolean z) {
        to0Var.getClass();
        list.getClass();
        if (!z) {
            return PARAMETRIZED_SERIALIZERS_CACHE.mo80getgIAlus(to0Var, list);
        }
        return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo80getgIAlus(to0Var, list);
    }

    public static final SerializerCache<? extends Object> getSERIALIZERS_CACHE() {
        return SERIALIZERS_CACHE;
    }

    public static final PolymorphicSerializer<? extends Object> polymorphicIfInterface(to0 to0Var) {
        to0Var.getClass();
        if (PlatformKt.isInterface(to0Var)) {
            return new PolymorphicSerializer<>(to0Var);
        }
        return null;
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }
}
