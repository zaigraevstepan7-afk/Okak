package kotlinx.serialization.internal;

import defpackage.fp;
import defpackage.oe0;
import defpackage.to0;
import defpackage.yq1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R*\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lto0;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(Loe0;)V", "", "key", "get", "(Lto0;)Lkotlinx/serialization/KSerializer;", "", "isStored", "(Lto0;)Z", "Loe0;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/CacheEntry;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ConcurrentHashMapCache<T> implements SerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, CacheEntry<T>> cache;
    private final oe0 compute;

    public ConcurrentHashMapCache(oe0 oe0Var) {
        oe0Var.getClass();
        this.compute = oe0Var;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer<T> get(to0 key) {
        CacheEntry<T> putIfAbsent;
        key.getClass();
        ConcurrentHashMap<Class<?>, CacheEntry<T>> concurrentHashMap = this.cache;
        Class<?> D = fp.D(key);
        CacheEntry<T> cacheEntry = concurrentHashMap.get(D);
        if (cacheEntry == null && (putIfAbsent = concurrentHashMap.putIfAbsent(D, (cacheEntry = new CacheEntry<>((KSerializer) this.compute.invoke(key))))) != null) {
            cacheEntry = putIfAbsent;
        }
        return cacheEntry.serializer;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(to0 key) {
        key.getClass();
        return this.cache.containsKey(fp.D(key));
    }
}
