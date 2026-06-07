package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jd2 extends vr1 {
    public final ThreadLocal i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jd2(defpackage.vt r3, defpackage.xu r4) {
        /*
            r2 = this;
            sl r0 = defpackage.sl.g
            vu r1 = r4.H(r0)
            if (r1 != 0) goto Ld
            xu r0 = r4.G(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.i = r0
            xu r3 = r3.getContext()
            g3 r0 = defpackage.g3.y
            vu r3 = r3.H(r0)
            boolean r3 = r3 instanceof defpackage.zu
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.mp0.Q(r4, r3)
            defpackage.mp0.J(r4, r3)
            r2.i0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd2.<init>(vt, xu):void");
    }

    public final boolean h0() {
        boolean z;
        if (this.threadLocalIsSet && this.i.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.i.remove();
        return !z;
    }

    public final void i0(xu xuVar, Object obj) {
        this.threadLocalIsSet = true;
        this.i.set(new xd1(xuVar, obj));
    }

    @Override // defpackage.vr1, defpackage.no0
    public final void n(Object obj) {
        if (this.threadLocalIsSet) {
            xd1 xd1Var = (xd1) this.i.get();
            if (xd1Var != null) {
                mp0.J((xu) xd1Var.e, xd1Var.f);
            }
            this.i.remove();
        }
        Object S = xn.S(obj);
        vt vtVar = this.h;
        xu context = vtVar.getContext();
        jd2 jd2Var = null;
        Object Q = mp0.Q(context, null);
        if (Q != mp0.y0) {
            jd2Var = io.N(vtVar, context, Q);
        }
        try {
            this.h.resumeWith(S);
            if (jd2Var != null && !jd2Var.h0()) {
                return;
            }
            mp0.J(context, Q);
        } catch (Throwable th) {
            if (jd2Var == null || jd2Var.h0()) {
                mp0.J(context, Q);
            }
            throw th;
        }
    }
}
