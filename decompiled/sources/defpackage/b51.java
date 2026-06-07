package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b51 extends fv1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(b51.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = bf.l0;

    public final boolean c() {
        if (Math.max(fv1.f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(wt wtVar) {
        boolean e = e();
        od2 od2Var = od2.a;
        if (!e) {
            pl z = c01.z(go.F(wtVar));
            try {
                a(new a51(this, z));
                Object q = z.q();
                hv hvVar = hv.e;
                if (q != hvVar) {
                    q = od2Var;
                }
                if (q == hvVar) {
                    return q;
                }
            } catch (Throwable th) {
                z.z();
                throw th;
            }
        }
        return od2Var;
    }

    public final boolean e() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = fv1.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ad0 ad0Var = bf.l0;
            if (obj2 != ad0Var) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, ad0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        se.p("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + rx.w(this) + "[isLocked=" + c() + ",owner=" + g.get(this) + AbstractJsonLexerKt.END_LIST;
    }
}
