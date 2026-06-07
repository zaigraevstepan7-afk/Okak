package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n4 {
    public final oe0 a;
    public p1 b;
    public v3 c;
    public gc d;
    public tx e;
    public final je1 g;
    public final je1 h;
    public final fe1 k;
    public final je1 l;
    public final je1 m;
    public final m4 n;
    public final y41 f = new y41();
    public final j00 i = fr1.h(new i4(this, 0));
    public final fe1 j = new fe1(Float.NaN);

    public n4(Enum r4, oe0 oe0Var) {
        this.a = new p1(5);
        this.g = fr1.k(r4);
        this.h = fr1.k(r4);
        fr1.i(new i4(this, 1), xl1.o);
        this.k = new fe1(0.0f);
        this.l = fr1.k(null);
        this.m = fr1.k(new cy(l60.e, new float[0]));
        this.n = new m4(this);
        this.a = oe0Var;
    }

    public static Object b(n4 n4Var, te0 te0Var, wt wtVar) {
        y41 y41Var = n4Var.f;
        j4 j4Var = new j4(n4Var, te0Var, null, 0);
        y41Var.getClass();
        Object u = fp.u(new uw0(t41.e, y41Var, j4Var, null), wtVar);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r11, defpackage.t41 r12, defpackage.ue0 r13, defpackage.wt r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.k4
            if (r0 == 0) goto L13
            r0 = r14
            k4 r0 = (defpackage.k4) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            k4 r0 = new k4
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.e
            int r1 = r0.g
            je1 r2 = r10.l
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            defpackage.io.K(r14)     // Catch: java.lang.Throwable -> L28
            goto L5d
        L28:
            r0 = move-exception
            r10 = r0
            goto L61
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r10)
            r10 = 0
            return r10
        L32:
            defpackage.io.K(r14)
            cy r14 = r10.c()
            boolean r14 = r14.c(r11)
            if (r14 == 0) goto L65
            y41 r14 = r10.f     // Catch: java.lang.Throwable -> L28
            l4 r4 = new l4     // Catch: java.lang.Throwable -> L28
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            r0.g = r3     // Catch: java.lang.Throwable -> L28
            r14.getClass()     // Catch: java.lang.Throwable -> L28
            uw0 r10 = new uw0     // Catch: java.lang.Throwable -> L28
            r10.<init>(r12, r14, r4, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = defpackage.fp.u(r10, r0)     // Catch: java.lang.Throwable -> L28
            hv r11 = defpackage.hv.e
            if (r10 != r11) goto L5d
            return r11
        L5d:
            r2.setValue(r8)
            goto L7d
        L61:
            r2.setValue(r8)
            throw r10
        L65:
            r5 = r10
            r6 = r11
            oe0 r10 = r5.a
            java.lang.Object r10 = r10.invoke(r6)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            je1 r10 = r5.h
            r10.setValue(r6)
            r5.g(r6)
        L7d:
            od2 r10 = defpackage.od2.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4.a(java.lang.Object, t41, ue0, wt):java.lang.Object");
    }

    public final cy c() {
        return (cy) this.m.getValue();
    }

    public final boolean d() {
        if (this.b != null && this.c != null && this.d != null && this.e != null) {
            return true;
        }
        return false;
    }

    public final float e(float f) {
        float g;
        fe1 fe1Var = this.j;
        if (Float.isNaN(fe1Var.g())) {
            g = 0.0f;
        } else {
            g = fe1Var.g();
        }
        return go.o(g + f, c().e(), c().d());
    }

    public final float f() {
        fe1 fe1Var = this.j;
        if (Float.isNaN(fe1Var.g())) {
            nl0.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return fe1Var.g();
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }

    public final void h(cy cyVar, Object obj) {
        if (!sn0.r(c(), cyVar)) {
            this.m.setValue(cyVar);
            y41 y41Var = this.f;
            b51 b51Var = y41Var.b;
            b51 b51Var2 = y41Var.b;
            boolean e = b51Var.e();
            je1 je1Var = this.l;
            if (e) {
                try {
                    m4 m4Var = this.n;
                    float f = c().f(obj);
                    if (!Float.isNaN(f)) {
                        m4Var.a(f, 0.0f);
                        je1Var.setValue(null);
                    }
                    g(obj);
                    this.h.setValue(obj);
                    b51Var2.f(null);
                } catch (Throwable th) {
                    b51Var2.f(null);
                    throw th;
                }
            }
            if (!e) {
                je1Var.setValue(obj);
            }
        }
    }
}
