package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class v22 implements u22 {
    public final mf e = new AtomicInteger(0);

    public final boolean e(int i) {
        if ((this.e.get() & i) != 0) {
            return true;
        }
        return false;
    }

    public final void f(int i) {
        mf mfVar;
        int i2;
        do {
            mfVar = this.e;
            i2 = mfVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!mfVar.compareAndSet(i2, i2 | i));
    }
}
