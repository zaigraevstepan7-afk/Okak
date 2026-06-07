package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class jo0 extends lx0 implements q10, rj0 {
    public no0 h;

    @Override // defpackage.q10
    public final void a() {
        no0 j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = no0.e;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof jo0) {
                if (obj == this) {
                    g60 g60Var = d6.r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, g60Var)) {
                        if (atomicReferenceFieldUpdater.get(j) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof rj0) || ((rj0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = lx0.e;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (!(obj2 instanceof lm1)) {
                    if (obj2 == this) {
                        return;
                    }
                    obj2.getClass();
                    lx0 lx0Var = (lx0) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = lx0.g;
                    lm1 lm1Var = (lm1) atomicReferenceFieldUpdater3.get(lx0Var);
                    if (lm1Var == null) {
                        lm1Var = new lm1(lx0Var);
                        atomicReferenceFieldUpdater3.set(lx0Var, lm1Var);
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, lm1Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    lx0Var.f();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.rj0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.rj0
    public final g81 d() {
        return null;
    }

    public go0 getParent() {
        return j();
    }

    public final no0 j() {
        no0 no0Var = this.h;
        if (no0Var != null) {
            return no0Var;
        }
        sn0.V("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.lx0
    public final String toString() {
        return getClass().getSimpleName() + '@' + rx.w(this) + "[job@" + rx.w(j()) + AbstractJsonLexerKt.END_LIST;
    }
}
