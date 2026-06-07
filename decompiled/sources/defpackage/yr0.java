package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yr0 extends d21 implements rq0 {
    public static final wr0 v = new Object();
    public zr0 s;
    public nj t;
    public sb1 u;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.u == defpackage.sb1.e) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.u == defpackage.sb1.f) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L0(defpackage.ur0 r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L6
            goto L9
        L6:
            r0 = 6
            if (r6 != r0) goto L10
        L9:
            sb1 r0 = r4.u
            sb1 r3 = defpackage.sb1.f
            if (r0 != r3) goto L24
            goto L3b
        L10:
            r0 = 3
            if (r6 != r0) goto L14
            goto L17
        L14:
            r0 = 4
            if (r6 != r0) goto L1e
        L17:
            sb1 r0 = r4.u
            sb1 r3 = defpackage.sb1.e
            if (r0 != r3) goto L24
            goto L3b
        L1e:
            if (r6 != r2) goto L21
            goto L24
        L21:
            r0 = 2
            if (r6 != r0) goto L3c
        L24:
            boolean r6 = r4.M0(r6)
            if (r6 == 0) goto L36
            int r5 = r5.b
            zr0 r4 = r4.s
            int r4 = r4.a()
            int r4 = r4 - r2
            if (r5 >= r4) goto L3b
            goto L3a
        L36:
            int r4 = r5.a
            if (r4 <= 0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        L3c:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            defpackage.se.p(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr0.L0(ur0, int):boolean");
    }

    public final boolean M0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = hp.M(this).D.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            se.m();
            return false;
        }
        if (i == 4) {
            int ordinal2 = hp.M(this).D.ordinal();
            if (ordinal2 == 0) {
                return true;
            }
            if (ordinal2 == 1) {
                return false;
            }
            se.m();
            return false;
        }
        se.p("Lazy list does not support beyond bounds layout for the specified direction");
        return false;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        ig1 x = e01Var.x(j);
        return l01Var.s0(x.e, x.f, m60.e, new df(x, 4));
    }
}
