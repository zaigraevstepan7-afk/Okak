package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h10 extends vr1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(h10.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.vr1, defpackage.no0
    public final void m(Object obj) {
        n(obj);
    }

    @Override // defpackage.vr1, defpackage.no0
    public final void n(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 1) {
                    mp0.K(go.F(this.h), xn.S(obj));
                    return;
                } else {
                    se.p("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
