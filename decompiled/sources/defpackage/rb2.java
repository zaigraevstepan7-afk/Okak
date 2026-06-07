package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rb2 extends n41 {
    public final n41 o;
    public final boolean p;
    public final boolean q;
    public oe0 r;
    public oe0 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rb2(defpackage.n41 r8, defpackage.oe0 r9, defpackage.oe0 r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            nv1 r0 = defpackage.q02.a
            if (r8 == 0) goto La
            oe0 r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            of0 r0 = defpackage.q02.j
            oe0 r0 = r0.e
        Le:
            oe0 r5 = defpackage.q02.k(r9, r0, r11)
            if (r8 == 0) goto L1a
            oe0 r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            of0 r9 = defpackage.q02.j
            oe0 r9 = r9.f
        L1e:
            oe0 r6 = defpackage.q02.l(r10, r9)
            r2 = 0
            o02 r4 = defpackage.o02.i
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.o = r8
            r1.p = r11
            r1.q = r12
            oe0 r7 = r1.e
            r1.r = r7
            oe0 r7 = r1.f
            r1.s = r7
            long r7 = defpackage.rp1.g()
            r1.t = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb2.<init>(n41, oe0, oe0, boolean, boolean):void");
    }

    @Override // defpackage.n41
    public final void B(j41 j41Var) {
        op1.r();
        throw null;
    }

    @Override // defpackage.n41
    public final n41 C(oe0 oe0Var, oe0 oe0Var2) {
        oe0 k = q02.k(oe0Var, this.r, true);
        oe0 l = q02.l(oe0Var2, this.s);
        if (!this.p) {
            return new rb2(D().C(null, l), k, l, false, true);
        }
        return D().C(k, l);
    }

    public final n41 D() {
        n41 n41Var = this.o;
        if (n41Var == null) {
            return q02.j;
        }
        return n41Var;
    }

    @Override // defpackage.n41, defpackage.i02
    public final void c() {
        n41 n41Var;
        this.c = true;
        if (this.q && (n41Var = this.o) != null) {
            n41Var.c();
        }
    }

    @Override // defpackage.i02
    public final o02 d() {
        return D().d();
    }

    @Override // defpackage.n41, defpackage.i02
    public final oe0 e() {
        return this.r;
    }

    @Override // defpackage.n41, defpackage.i02
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.i02
    public final long g() {
        return D().g();
    }

    @Override // defpackage.n41, defpackage.i02
    public final int h() {
        return D().h();
    }

    @Override // defpackage.n41, defpackage.i02
    public final oe0 i() {
        return this.s;
    }

    @Override // defpackage.n41, defpackage.i02
    public final void k() {
        op1.r();
        throw null;
    }

    @Override // defpackage.n41, defpackage.i02
    public final void l() {
        op1.r();
        throw null;
    }

    @Override // defpackage.n41, defpackage.i02
    public final void m() {
        D().m();
    }

    @Override // defpackage.n41, defpackage.i02
    public final void n(u22 u22Var) {
        D().n(u22Var);
    }

    @Override // defpackage.i02
    public final void r(o02 o02Var) {
        op1.r();
        throw null;
    }

    @Override // defpackage.i02
    public final void s(long j) {
        op1.r();
        throw null;
    }

    @Override // defpackage.n41, defpackage.i02
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.n41, defpackage.i02
    public final i02 u(oe0 oe0Var) {
        oe0 k = q02.k(oe0Var, this.r, true);
        if (!this.p) {
            return q02.g(D().u(null), k, true);
        }
        return D().u(k);
    }

    @Override // defpackage.n41
    public final xq1 w() {
        return D().w();
    }

    @Override // defpackage.n41
    public final j41 x() {
        return D().x();
    }

    @Override // defpackage.n41
    /* renamed from: y */
    public final oe0 e() {
        return this.r;
    }
}
