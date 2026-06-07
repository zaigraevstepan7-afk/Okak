package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class er0 {
    public final ar0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public zy0 q;
    public wq0 d = wq0.i;
    public final i01 p = new i01(this);

    public er0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    public final e81 a() {
        return this.a.J.d;
    }

    public final void b() {
        wq0 wq0Var = this.a.K.d;
        wq0 wq0Var2 = wq0.g;
        wq0 wq0Var3 = wq0.h;
        if (wq0Var == wq0Var2 || wq0Var == wq0Var3) {
            if (this.p.E) {
                g(true);
            } else {
                f(true);
            }
        }
        if (wq0Var == wq0Var3) {
            zy0 zy0Var = this.q;
            if (zy0Var != null && zy0Var.y) {
                i(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(long j) {
        zy0 zy0Var = this.q;
        if (zy0Var != null) {
            er0 er0Var = zy0Var.j;
            er0Var.d = wq0.f;
            ar0 ar0Var = er0Var.a;
            er0Var.e = false;
            zy0Var.C = j;
            lc1 snapshotObserver = ((q5) dr0.a(ar0Var)).getSnapshotObserver();
            yy0 yy0Var = zy0Var.D;
            snapshotObserver.a.c(ar0Var, snapshotObserver.b, yy0Var);
            er0Var.f = true;
            er0Var.g = true;
            boolean F = vn.F(ar0Var);
            i01 i01Var = er0Var.p;
            if (F) {
                i01Var.z = true;
                i01Var.A = true;
            } else {
                i01Var.y = true;
            }
            er0Var.d = wq0.i;
        }
    }

    public final void d(int i) {
        boolean z;
        er0 er0Var;
        int i2 = this.l;
        this.l = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            ar0 v = this.a.v();
            if (v != null) {
                er0Var = v.K;
            } else {
                er0Var = null;
            }
            if (er0Var != null) {
                int i3 = er0Var.l;
                if (i == 0) {
                    er0Var.d(i3 - 1);
                } else {
                    er0Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        boolean z;
        er0 er0Var;
        int i2 = this.o;
        this.o = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            ar0 v = this.a.v();
            if (v != null) {
                er0Var = v.K;
            } else {
                er0Var = null;
            }
            if (er0Var != null) {
                int i3 = er0Var.o;
                if (i == 0) {
                    er0Var.e(i3 - 1);
                } else {
                    er0Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else if (!z && !this.j) {
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else if (!z && !this.k) {
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else if (!z && !this.m) {
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else if (!z && !this.n) {
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        i01 i01Var = this.p;
        er0 er0Var = i01Var.j;
        Object obj = i01Var.v;
        ar0 ar0Var = this.a;
        if ((obj != null || er0Var.a().C() != null) && i01Var.u) {
            i01Var.u = false;
            i01Var.v = er0Var.a().C();
            ar0 v = ar0Var.v();
            if (v != null) {
                ar0.X(v, false, 7);
            }
        }
        zy0 zy0Var = this.q;
        if (zy0Var != null) {
            er0 er0Var2 = zy0Var.j;
            if (zy0Var.B == null) {
                vy0 T0 = er0Var2.a().T0();
                T0.getClass();
                if (T0.s.C() == null) {
                    return;
                }
            }
            if (zy0Var.A) {
                zy0Var.A = false;
                vy0 T02 = er0Var2.a().T0();
                T02.getClass();
                zy0Var.B = T02.s.C();
                if (vn.F(ar0Var)) {
                    ar0 v2 = ar0Var.v();
                    if (v2 != null) {
                        ar0.X(v2, false, 7);
                        return;
                    }
                    return;
                }
                ar0 v3 = ar0Var.v();
                if (v3 != null) {
                    ar0.V(v3, false, 7);
                }
            }
        }
    }
}
