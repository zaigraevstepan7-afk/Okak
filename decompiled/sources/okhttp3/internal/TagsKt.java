package okhttp3.internal;

import defpackage.de0;
import defpackage.to0;
import defpackage.yq1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "Lto0;", "type", "Lkotlin/Function0;", "compute", "computeIfAbsent", "(Ljava/util/concurrent/atomic/AtomicReference;Lto0;Lde0;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class TagsKt {
    public static final <T> T computeIfAbsent(AtomicReference<Tags> atomicReference, to0 to0Var, de0 de0Var) {
        atomicReference.getClass();
        to0Var.getClass();
        de0Var.getClass();
        T t = null;
        while (true) {
            Tags tags = atomicReference.get();
            T t2 = (T) tags.get(to0Var);
            if (t2 != null) {
                return t2;
            }
            if (t == null) {
                t = (T) de0Var.invoke();
            }
            Tags plus = tags.plus(to0Var, t);
            while (!atomicReference.compareAndSet(tags, plus)) {
                if (atomicReference.get() != tags) {
                    break;
                }
            }
            return t;
        }
    }
}
