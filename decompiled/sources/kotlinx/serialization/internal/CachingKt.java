package kotlinx.serialization.internal;

import defpackage.oe0;
import defpackage.se0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Lkotlin/Function1;", "Lto0;", "Lkotlinx/serialization/KSerializer;", "factory", "Lkotlinx/serialization/internal/SerializerCache;", "createCache", "(Loe0;)Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function2;", "", "", "Lfp0;", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "createParametrizedCache", "(Lse0;)Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "", "useClassValue", "Z", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class CachingKt {
    private static final boolean useClassValue;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        useClassValue = z;
    }

    public static final <T> SerializerCache<T> createCache(oe0 oe0Var) {
        oe0Var.getClass();
        if (useClassValue) {
            return new ClassValueCache(oe0Var);
        }
        return new ConcurrentHashMapCache(oe0Var);
    }

    public static final <T> ParametrizedSerializerCache<T> createParametrizedCache(se0 se0Var) {
        se0Var.getClass();
        if (useClassValue) {
            return new ClassValueParametrizedCache(se0Var);
        }
        return new ConcurrentHashMapParametrizedCache(se0Var);
    }
}
