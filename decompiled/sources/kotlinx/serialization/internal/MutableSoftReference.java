package kotlinx.serialization.internal;

import defpackage.de0;
import defpackage.yq1;
import java.lang.ref.SoftReference;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/serialization/internal/MutableSoftReference;", "T", "", "<init>", "()V", "Lkotlin/Function0;", "factory", "getOrSetWithLock", "(Lde0;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", "reference", "Ljava/lang/ref/SoftReference;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
final class MutableSoftReference<T> {
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    public final synchronized T getOrSetWithLock(de0 factory) {
        factory.getClass();
        T t = this.reference.get();
        if (t != null) {
            return t;
        }
        T t2 = (T) factory.invoke();
        this.reference = new SoftReference<>(t2);
        return t2;
    }
}
