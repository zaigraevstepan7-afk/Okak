package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z72 implements b72 {
    public d92 b;
    public final /* synthetic */ b82 d;
    public boolean a = true;
    public y61 c = xl1.j;

    public z72(b82 b82Var) {
        this.d = b82Var;
    }

    @Override // defpackage.b72
    public final void a() {
        f();
    }

    @Override // defpackage.b72
    public final void d(long j, y61 y61Var) {
        long j2;
        x82 d;
        x82 d2;
        b82 b82Var = this.d;
        je1 je1Var = b82Var.q;
        if (b82Var.k() && ((hg0) je1Var.getValue()) == null) {
            je1Var.setValue(hg0.g);
            b82Var.s = -1;
            this.a = true;
            this.c = y61Var;
            b82Var.o();
            gu0 gu0Var = b82Var.d;
            if (gu0Var != null && (d2 = gu0Var.d()) != null && d2.c(j)) {
                if (b82Var.n().a.f.length() != 0) {
                    b82Var.h(false);
                    long c = b82.c(b82Var, i82.a(b82Var.n(), null, d92.b, 5), j, true, false, this.c, true);
                    j2 = j;
                    b82Var.o = new d92(c);
                    this.b = new d92(c);
                } else {
                    return;
                }
            } else {
                j2 = j;
                gu0 gu0Var2 = b82Var.d;
                if (gu0Var2 != null && (d = gu0Var2.d()) != null) {
                    int c2 = b82Var.b.c(d.b(j2, true));
                    i82 e = b82.e(b82Var.n().a, fr1.a(c2, c2));
                    b82Var.h(false);
                    rg0 rg0Var = b82Var.j;
                    if (rg0Var != null) {
                        rg0Var.a();
                    }
                    b82Var.c.invoke(e);
                    b82Var.v = new d92(e.b);
                }
                this.a = false;
            }
            b82Var.q(jg0.e);
            b82Var.n = j2;
            b82Var.r.setValue(new z81(j2));
            b82Var.p = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    @Override // defpackage.b72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r9) {
        /*
            r8 = this;
            b82 r0 = r8.d
            boolean r1 = r0.k()
            if (r1 == 0) goto Ldd
            i82 r1 = r0.n()
            rc r1 = r1.a
            java.lang.String r1 = r1.f
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Ldd
        L18:
            long r1 = r0.p
            long r9 = defpackage.z81.e(r1, r9)
            r0.p = r9
            gu0 r9 = r0.d
            r10 = 0
            if (r9 == 0) goto Lda
            x82 r9 = r9.d()
            if (r9 == 0) goto Lda
            long r1 = r0.n
            long r3 = r0.p
            long r1 = defpackage.z81.e(r1, r3)
            z81 r3 = new z81
            r3.<init>(r1)
            je1 r1 = r0.r
            r1.setValue(r3)
            d92 r1 = r0.o
            if (r1 != 0) goto L8e
            z81 r1 = r0.i()
            r1.getClass()
            long r1 = r1.a
            boolean r1 = r9.c(r1)
            if (r1 != 0) goto L8e
            c91 r1 = r0.b
            long r2 = r0.n
            r4 = 1
            int r2 = r9.b(r2, r4)
            int r1 = r1.c(r2)
            c91 r2 = r0.b
            z81 r3 = r0.i()
            r3.getClass()
            long r5 = r3.a
            int r9 = r9.b(r5, r4)
            int r9 = r2.c(r9)
            if (r1 != r9) goto L76
            y61 r9 = defpackage.xl1.j
        L74:
            r6 = r9
            goto L79
        L76:
            y61 r9 = defpackage.xl1.k
            goto L74
        L79:
            i82 r1 = r0.n()
            z81 r9 = r0.i()
            r9.getClass()
            long r2 = r9.a
            r5 = 0
            r7 = 1
            r4 = 0
            long r1 = defpackage.b82.c(r0, r1, r2, r4, r5, r6, r7)
            goto Lc9
        L8e:
            d92 r1 = r0.o
            if (r1 == 0) goto L99
            long r1 = r1.a
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            goto L9f
        L99:
            long r1 = r0.n
            int r1 = r9.b(r1, r10)
        L9f:
            z81 r2 = r0.i()
            r2.getClass()
            long r2 = r2.a
            int r9 = r9.b(r2, r10)
            d92 r2 = r0.o
            if (r2 != 0) goto Lb3
            if (r1 != r9) goto Lb3
            goto Ldd
        Lb3:
            i82 r1 = r0.n()
            z81 r9 = r0.i()
            r9.getClass()
            long r2 = r9.a
            y61 r6 = r8.c
            r7 = 1
            r4 = 0
            r5 = 0
            long r1 = defpackage.b82.c(r0, r1, r2, r4, r5, r6, r7)
        Lc9:
            d92 r9 = new d92
            r9.<init>(r1)
            r8.b = r9
            d92 r9 = r0.o
            boolean r9 = defpackage.d92.a(r9, r1)
            if (r9 != 0) goto Lda
            r8.a = r10
        Lda:
            r0.t(r10)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z72.e(long):void");
    }

    public final void f() {
        long j;
        jg0 jg0Var;
        boolean z;
        boolean z2;
        b82 b82Var = this.d;
        b82Var.q.setValue(null);
        b82Var.r.setValue(null);
        this.c = xl1.j;
        boolean z3 = true;
        b82Var.t(true);
        d92 d92Var = this.b;
        if (d92Var != null) {
            j = d92Var.a;
        } else {
            j = b82Var.n().b;
        }
        boolean c = d92.c(j);
        if (c) {
            jg0Var = jg0.g;
        } else {
            jg0Var = jg0.f;
        }
        b82Var.q(jg0Var);
        gu0 gu0Var = b82Var.d;
        if (gu0Var != null) {
            if (!c && nq1.i(b82Var, true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            gu0Var.m.setValue(Boolean.valueOf(z2));
        }
        gu0 gu0Var2 = b82Var.d;
        if (gu0Var2 != null) {
            if (!c && nq1.i(b82Var, false)) {
                z = true;
            } else {
                z = false;
            }
            gu0Var2.n.setValue(Boolean.valueOf(z));
        }
        gu0 gu0Var3 = b82Var.d;
        if (gu0Var3 != null) {
            if (!c || !nq1.i(b82Var, true)) {
                z3 = false;
            }
            gu0Var3.o.setValue(Boolean.valueOf(z3));
        }
        if (this.a) {
            b82.b(b82Var, b82Var.o);
        }
        b82Var.o = null;
    }

    @Override // defpackage.b72
    public final void onCancel() {
        f();
    }

    @Override // defpackage.b72
    public final void b() {
    }

    @Override // defpackage.b72
    public final void c() {
    }
}
