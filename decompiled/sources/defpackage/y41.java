package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y41 {
    public final AtomicReference a = new AtomicReference(null);
    public final b51 b = new b51();

    public static final void a(y41 y41Var, v41 v41Var) {
        AtomicReference atomicReference = y41Var.a;
        while (true) {
            v41 v41Var2 = (v41) atomicReference.get();
            if (v41Var2 != null && v41Var.a.compareTo(v41Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(v41Var2, v41Var)) {
                if (atomicReference.get() != v41Var2) {
                    break;
                }
            }
            if (v41Var2 != null) {
                v41Var2.b.c(new qg1("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
