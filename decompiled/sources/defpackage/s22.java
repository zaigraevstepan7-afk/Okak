package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s22 extends r0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.r0
    public final boolean a(q0 q0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(d6.z);
        return true;
    }

    @Override // defpackage.r0
    public final vt[] b(q0 q0Var) {
        this.a.set(null);
        return sn0.a;
    }
}
