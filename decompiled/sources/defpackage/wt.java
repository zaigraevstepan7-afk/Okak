package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class wt extends eh {
    private final xu _context;
    private transient vt<Object> intercepted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wt(defpackage.vt r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            xu r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt.<init>(vt):void");
    }

    @Override // defpackage.vt
    public xu getContext() {
        xu xuVar = this._context;
        xuVar.getClass();
        return xuVar;
    }

    public final vt<Object> intercepted() {
        vt<Object> vtVar;
        vt<Object> vtVar2 = this.intercepted;
        if (vtVar2 == null) {
            zu zuVar = (zu) getContext().H(g3.y);
            if (zuVar != null) {
                vtVar = new g10(zuVar, this);
            } else {
                vtVar = this;
            }
            this.intercepted = vtVar;
            return vtVar;
        }
        return vtVar2;
    }

    @Override // defpackage.eh
    public void releaseIntercepted() {
        pl plVar;
        vt<Object> vtVar = this.intercepted;
        if (vtVar != null && vtVar != this) {
            vu H = getContext().H(g3.y);
            H.getClass();
            g10 g10Var = (g10) vtVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g10.l;
            do {
            } while (atomicReferenceFieldUpdater.get(g10Var) == mp0.p);
            Object obj = atomicReferenceFieldUpdater.get(g10Var);
            if (obj instanceof pl) {
                plVar = (pl) obj;
            } else {
                plVar = null;
            }
            if (plVar != null) {
                plVar.n();
            }
        }
        this.intercepted = kp.f;
    }

    public wt(vt vtVar, xu xuVar) {
        super(vtVar);
        this._context = xuVar;
    }
}
