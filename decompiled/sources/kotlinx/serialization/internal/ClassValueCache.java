package kotlinx.serialization.internal;

import defpackage.bn;
import defpackage.de0;
import defpackage.fp;
import defpackage.oe0;
import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR/\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/internal/ClassValueCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lto0;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(Loe0;)V", "", "key", "get", "(Lto0;)Lkotlinx/serialization/KSerializer;", "", "isStored", "(Lto0;)Z", "Loe0;", "getCompute", "()Loe0;", "Lkotlinx/serialization/internal/ClassValueReferences;", "Lkotlinx/serialization/internal/CacheEntry;", "classValue", "Lkotlinx/serialization/internal/ClassValueReferences;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ClassValueCache<T> implements SerializerCache<T> {
    private final ClassValueReferences<CacheEntry<T>> classValue;
    private final oe0 compute;

    public ClassValueCache(oe0 oe0Var) {
        oe0Var.getClass();
        this.compute = oe0Var;
        this.classValue = new ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer<T> get(final to0 key) {
        Object obj;
        key.getClass();
        ClassValueReferences<CacheEntry<T>> classValueReferences = this.classValue;
        Class b = ((bn) key).b();
        b.getClass();
        obj = classValueReferences.get(b);
        obj.getClass();
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        T t = mutableSoftReference.reference.get();
        if (t == null) {
            t = (T) mutableSoftReference.getOrSetWithLock(new de0() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlinx.serialization.internal.CacheEntry] */
                @Override // defpackage.de0
                public final T invoke() {
                    return new CacheEntry((KSerializer) ClassValueCache.this.getCompute().invoke(key));
                }
            });
        }
        return t.serializer;
    }

    public final oe0 getCompute() {
        return this.compute;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(to0 key) {
        key.getClass();
        return this.classValue.isStored(fp.D(key));
    }
}
