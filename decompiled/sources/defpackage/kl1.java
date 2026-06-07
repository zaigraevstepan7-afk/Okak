package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kl1 implements ge {
    public final o31 e = new o31();
    public final b41 f = new b41();
    public final Object g;

    public kl1(Object obj) {
        this.g = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0017. Please report as an issue. */
    public final void a(gd2 gd2Var, fm1 fm1Var) {
        Exception exc;
        o31 o31Var = this.e;
        int i = o31Var.b;
        b41 b41Var = new b41();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            b41 b41Var2 = this.f;
            if (i2 < i) {
                int i4 = i2 + 1;
                try {
                    try {
                        switch (o31Var.c(i2)) {
                            case 0:
                                gd2Var.i();
                                i2 = i4;
                            case 1:
                                int i5 = i3 + 1;
                                gd2Var.d(b41Var2.f(i3));
                                i3 = i5;
                                i2 = i4;
                            case 2:
                                int i6 = i2 + 2;
                                i2 += 3;
                                gd2Var.g(o31Var.c(i4), o31Var.c(i6));
                            case 3:
                                int i7 = i2 + 2;
                                try {
                                    int i8 = i2 + 3;
                                    try {
                                        i2 += 4;
                                        gd2Var.f(o31Var.c(i4), o31Var.c(i7), o31Var.c(i8));
                                    } catch (Exception e) {
                                        exc = e;
                                        i2 = i8;
                                        break;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    i2 = i7;
                                    break;
                                }
                            case 4:
                                gd2Var.a();
                                i2 = i4;
                            case 5:
                                i2 += 2;
                                int i9 = i3 + 1;
                                gd2Var.c(o31Var.c(i4), b41Var2.f(i3));
                                i3 = i9;
                            case 6:
                                i2 += 2;
                                try {
                                    o31Var.c(i4);
                                    int i10 = i3 + 1;
                                    i3 = i10;
                                } catch (Exception e3) {
                                    exc = e3;
                                    break;
                                }
                            case 7:
                                int i11 = i3 + 1;
                                Object f = b41Var2.f(i3);
                                f.getClass();
                                fc2.t(2, f);
                                i3 += 2;
                                gd2Var.n((se0) f, b41Var2.f(i11));
                                i2 = i4;
                            case 8:
                                Object obj = gd2Var.g;
                                if (obj instanceof yq) {
                                    yq yqVar = (yq) obj;
                                    if (fm1Var.f.j(yqVar)) {
                                        yqVar.b();
                                    }
                                }
                                b41Var.a(obj);
                                gd2Var.e();
                                i2 = i4;
                            default:
                                i2 = i4;
                        }
                    } catch (Throwable th) {
                        gd2Var.k();
                        throw th;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } else {
                if (i3 != b41Var2.b) {
                    vr.a("Applier operation size mismatch");
                }
                b41Var2.d();
                o31Var.b = 0;
                gd2Var.k();
                return;
            }
            exc = e3;
            throw new ar(b41Var2, b41Var, o31Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.ge
    public final void c(int i, Object obj) {
        o31 o31Var = this.e;
        o31Var.a(5);
        o31Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.ge
    public final void d(Object obj) {
        this.e.a(1);
        this.f.a(obj);
    }

    @Override // defpackage.ge
    public final void e() {
        this.e.a(8);
    }

    @Override // defpackage.ge
    public final void f(int i, int i2, int i3) {
        o31 o31Var = this.e;
        o31Var.a(3);
        o31Var.a(i);
        o31Var.a(i2);
        o31Var.a(i3);
    }

    @Override // defpackage.ge
    public final void g(int i, int i2) {
        o31 o31Var = this.e;
        o31Var.a(2);
        o31Var.a(i);
        o31Var.a(i2);
    }

    @Override // defpackage.ge
    public final void i() {
        this.e.a(0);
    }

    @Override // defpackage.ge
    public final void j(int i, Object obj) {
        o31 o31Var = this.e;
        o31Var.a(6);
        o31Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.ge
    public final Object l() {
        return this.g;
    }

    @Override // defpackage.ge
    public final void n(se0 se0Var, Object obj) {
        this.e.a(7);
        b41 b41Var = this.f;
        b41Var.a(se0Var);
        b41Var.a(obj);
    }
}
