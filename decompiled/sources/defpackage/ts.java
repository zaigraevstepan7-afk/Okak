package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ts implements kv1 {
    public final AtomicReference a;

    public ts(kv1 kv1Var) {
        this.a = new AtomicReference(kv1Var);
    }

    @Override // defpackage.kv1
    public final Iterator iterator() {
        kv1 kv1Var = (kv1) this.a.getAndSet(null);
        if (kv1Var != null) {
            return kv1Var.iterator();
        }
        se.p("This sequence can be consumed only once.");
        return null;
    }
}
