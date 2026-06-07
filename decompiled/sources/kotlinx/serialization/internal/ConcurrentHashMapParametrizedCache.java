package kotlinx.serialization.internal;

import defpackage.bn;
import defpackage.fo1;
import defpackage.fp0;
import defpackage.go1;
import defpackage.se0;
import defpackage.to0;
import defpackage.yn;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R*\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "Lkotlin/Function2;", "Lto0;", "", "", "Lfp0;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(Lse0;)V", "key", "types", "Lgo1;", "get-gIAlu-s", "(Lto0;Ljava/util/List;)Ljava/lang/Object;", "get", "Lse0;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache;
    private final se0 compute;

    public ConcurrentHashMapParametrizedCache(se0 se0Var) {
        se0Var.getClass();
        this.compute = se0Var;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public Object mo80getgIAlus(to0 key, List<? extends fp0> types) {
        Object fo1Var;
        ParametrizedCacheEntry<T> putIfAbsent;
        key.getClass();
        types.getClass();
        ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> concurrentHashMap = this.cache;
        Class b = ((bn) key).b();
        b.getClass();
        ParametrizedCacheEntry<T> parametrizedCacheEntry = concurrentHashMap.get(b);
        if (parametrizedCacheEntry == null && (putIfAbsent = concurrentHashMap.putIfAbsent(b, (parametrizedCacheEntry = new ParametrizedCacheEntry<>()))) != null) {
            parametrizedCacheEntry = putIfAbsent;
        }
        ParametrizedCacheEntry<T> parametrizedCacheEntry2 = parametrizedCacheEntry;
        ArrayList arrayList = new ArrayList(yn.a0(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((fp0) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = ((ParametrizedCacheEntry) parametrizedCacheEntry2).serializers;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                fo1Var = (KSerializer) this.compute.invoke(key, types);
            } catch (Throwable th) {
                fo1Var = new fo1(th);
            }
            go1 go1Var = new go1(fo1Var);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, go1Var);
            if (putIfAbsent2 == null) {
                obj = go1Var;
            } else {
                obj = putIfAbsent2;
            }
        }
        return ((go1) obj).e;
    }
}
