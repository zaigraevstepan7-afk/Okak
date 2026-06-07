package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hq1 implements rr0, Serializable {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(hq1.class, Object.class, "f");
    public volatile de0 e;
    public volatile Object f;

    @Override // defpackage.rr0
    public final Object getValue() {
        Object obj = this.f;
        xl1 xl1Var = xl1.s;
        if (obj != xl1Var) {
            return obj;
        }
        de0 de0Var = this.e;
        if (de0Var != null) {
            Object invoke = de0Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xl1Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != xl1Var) {
                }
            }
            this.e = null;
            return invoke;
        }
        return this.f;
    }

    public final String toString() {
        if (this.f != xl1.s) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
