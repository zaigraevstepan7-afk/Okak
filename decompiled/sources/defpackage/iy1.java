package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class iy1 extends d21 implements rq0 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L0(defpackage.l01 r7) {
        /*
            r6 = this;
            float r0 = r6.u
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.u
            int r0 = r7.j0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.v
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.v
            int r3 = r7.j0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.s
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.s
            int r4 = r7.j0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.t
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.t
            int r6 = r7.j0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.vs.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy1.L0(l01):long");
    }

    @Override // defpackage.rq0
    public final int Q(ty0 ty0Var, e01 e01Var, int i) {
        long L0 = L0(ty0Var);
        if (us.e(L0)) {
            return us.g(L0);
        }
        if (!this.w) {
            i = vs.g(i, L0);
        }
        return vs.f(e01Var.c(i), L0);
    }

    @Override // defpackage.rq0
    public final int a0(ty0 ty0Var, e01 e01Var, int i) {
        long L0 = L0(ty0Var);
        if (us.e(L0)) {
            return us.g(L0);
        }
        if (!this.w) {
            i = vs.g(i, L0);
        }
        return vs.f(e01Var.Y(i), L0);
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a;
        long L0 = L0(l01Var);
        if (this.w) {
            a = vs.e(j, L0);
        } else {
            if (!Float.isNaN(this.s)) {
                j2 = us.j(L0);
            } else {
                j2 = us.j(j);
                int h2 = us.h(L0);
                if (j2 > h2) {
                    j2 = h2;
                }
            }
            if (!Float.isNaN(this.u)) {
                h = us.h(L0);
            } else {
                h = us.h(j);
                int j3 = us.j(L0);
                if (h < j3) {
                    h = j3;
                }
            }
            if (!Float.isNaN(this.t)) {
                i = us.i(L0);
            } else {
                i = us.i(j);
                int g2 = us.g(L0);
                if (i > g2) {
                    i = g2;
                }
            }
            if (!Float.isNaN(this.v)) {
                g = us.g(L0);
            } else {
                g = us.g(j);
                int i2 = us.i(L0);
                if (g < i2) {
                    g = i2;
                }
            }
            a = vs.a(j2, h, i, g);
        }
        ig1 x = e01Var.x(a);
        return l01Var.s0(x.e, x.f, m60.e, new df(x, 5));
    }

    @Override // defpackage.rq0
    public final int e(ty0 ty0Var, e01 e01Var, int i) {
        long L0 = L0(ty0Var);
        if (us.f(L0)) {
            return us.h(L0);
        }
        if (!this.w) {
            i = vs.f(i, L0);
        }
        return vs.g(e01Var.s(i), L0);
    }

    @Override // defpackage.rq0
    public final int k0(ty0 ty0Var, e01 e01Var, int i) {
        long L0 = L0(ty0Var);
        if (us.f(L0)) {
            return us.h(L0);
        }
        if (!this.w) {
            i = vs.f(i, L0);
        }
        return vs.g(e01Var.n(i), L0);
    }
}
