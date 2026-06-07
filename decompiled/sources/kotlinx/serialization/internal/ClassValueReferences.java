package kotlinx.serialization.internal;

import defpackage.de0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ/\u0010\r\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00062\u000e\b\u0004\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/internal/ClassValueReferences;", "T", "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/MutableSoftReference;", "<init>", "()V", "Ljava/lang/Class;", "type", "computeValue", "(Ljava/lang/Class;)Lkotlinx/serialization/internal/MutableSoftReference;", "key", "Lkotlin/Function0;", "factory", "getOrSet", "(Ljava/lang/Class;Lde0;)Ljava/lang/Object;", "", "isStored", "(Ljava/lang/Class;)Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public MutableSoftReference<T> computeValue(Class<?> type) {
        type.getClass();
        return new MutableSoftReference<>();
    }

    public final T getOrSet(Class<?> key, final de0 factory) {
        Object obj;
        key.getClass();
        factory.getClass();
        obj = get(key);
        obj.getClass();
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        T t = mutableSoftReference.reference.get();
        if (t != null) {
            return t;
        }
        return (T) mutableSoftReference.getOrSetWithLock(new de0() { // from class: kotlinx.serialization.internal.ClassValueReferences$getOrSet$2
            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // defpackage.de0
            public final T invoke() {
                return de0.this.invoke();
            }
        });
    }

    public final boolean isStored(Class<?> key) {
        Object obj;
        key.getClass();
        obj = get(key);
        if (((MutableSoftReference) obj).reference.get() != null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
        return computeValue((Class<?>) cls);
    }
}
