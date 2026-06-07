package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ql0 extends e81 {
    public static final f8 X;
    public final n52 V;
    public pl0 W;

    static {
        f8 j = fc2.j();
        int i = co.h;
        j.e(co.d);
        j.k(1.0f);
        j.l(1);
        X = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [d21, n52] */
    /* JADX WARN: Type inference failed for: r3v4, types: [vy0] */
    public ql0(ar0 ar0Var) {
        super(ar0Var);
        pl0 pl0Var;
        ?? d21Var = new d21();
        d21Var.h = 0;
        this.V = d21Var;
        d21Var.l = this;
        if (ar0Var.m != null) {
            pl0Var = new vy0(this);
        } else {
            pl0Var = null;
        }
        this.W = pl0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [pl0, vy0] */
    @Override // defpackage.e81
    public final void Q0() {
        if (this.W == null) {
            this.W = new vy0(this);
        }
    }

    @Override // defpackage.e81
    public final vy0 T0() {
        return this.W;
    }

    @Override // defpackage.e81
    public final d21 V0() {
        return this.V;
    }

    @Override // defpackage.e01
    public final int Y(int i) {
        sl0 u = this.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.e(ar0Var.J.d, ar0Var.m(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [q41] */
    @Override // defpackage.e81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b1(defpackage.wc0 r18, long r19, defpackage.ch0 r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql0.b1(wc0, long, ch0, int, boolean):void");
    }

    @Override // defpackage.e01
    public final int c(int i) {
        sl0 u = this.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.d(ar0Var.J.d, ar0Var.m(), i);
    }

    @Override // defpackage.e81
    public final void k1(tl tlVar, tf0 tf0Var) {
        ar0 ar0Var = this.s;
        jc1 a = dr0.a(ar0Var);
        q41 y = ar0Var.y();
        Object[] objArr = y.e;
        int i = y.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            if (ar0Var2.I()) {
                ar0Var2.i(tlVar, tf0Var);
            }
        }
        if (((q5) a).getShowLayoutBounds()) {
            long j = this.g;
            tlVar.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, X);
        }
    }

    @Override // defpackage.ig1
    public final void m0(long j, float f, oe0 oe0Var) {
        l1(j, f, oe0Var);
        if (this.n) {
            return;
        }
        this.s.K.p.A0();
    }

    @Override // defpackage.e01
    public final int n(int i) {
        sl0 u = this.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.c(ar0Var.J.d, ar0Var.m(), i);
    }

    @Override // defpackage.e01
    public final int s(int i) {
        sl0 u = this.s.u();
        j01 u2 = u.u();
        ar0 ar0Var = (ar0) u.e;
        return u2.a(ar0Var.J.d, ar0Var.m(), i);
    }

    @Override // defpackage.ty0
    public final int u0(j3 j3Var) {
        pl0 pl0Var = this.W;
        if (pl0Var != null) {
            return pl0Var.u0(j3Var);
        }
        i01 i01Var = this.s.K.p;
        br0 br0Var = i01Var.B;
        if (!i01Var.q) {
            if (i01Var.j.d == wq0.e) {
                br0Var.f = true;
                if (br0Var.b) {
                    i01Var.z = true;
                    i01Var.A = true;
                }
            } else {
                br0Var.g = true;
            }
        }
        ql0 h = i01Var.h();
        boolean z = h.o;
        h.o = true;
        i01Var.H();
        h.o = z;
        Integer num = (Integer) br0Var.i.get(j3Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.e01
    public final ig1 x(long j) {
        p0(j);
        ar0 ar0Var = this.s;
        q41 z = ar0Var.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ar0) objArr[i2]).K.p.p = yq0.g;
        }
        o1(ar0Var.A.b(this, ar0Var.m(), j));
        f1();
        return this;
    }
}
