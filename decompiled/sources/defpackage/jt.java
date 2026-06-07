package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jt extends d21 implements es, gq0 {
    public boolean A;
    public sb1 s;
    public final at1 t;
    public boolean u;
    public xj v;
    public final ps1 w;
    public boolean y;
    public final nj x = new nj(0);
    public long z = 0;

    public jt(sb1 sb1Var, at1 at1Var, boolean z, xj xjVar, ps1 ps1Var) {
        this.s = sb1Var;
        this.t = at1Var;
        this.u = z;
        this.v = xjVar;
        this.w = ps1Var;
    }

    public static final float L0(jt jtVar, xj xjVar, long j) {
        float f;
        pl1 pl1Var;
        int compare;
        if (en0.a(jtVar.z, 0L)) {
            return 0.0f;
        }
        q41 q41Var = jtVar.x.a;
        int i = q41Var.g - 1;
        Object[] objArr = q41Var.e;
        pl1 pl1Var2 = null;
        if (i < objArr.length) {
            pl1Var = null;
            while (true) {
                if (i >= 0) {
                    pl1 pl1Var3 = (pl1) ((ft) objArr[i]).a.invoke();
                    if (pl1Var3 != null) {
                        long c = pl1Var3.c();
                        long O = vn.O(jtVar.z);
                        f = 0.0f;
                        int ordinal = jtVar.s.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                compare = Float.compare(Float.intBitsToFloat((int) (c >> 32)), Float.intBitsToFloat((int) (O >> 32)));
                            } else {
                                se.m();
                                return 0.0f;
                            }
                        } else {
                            compare = Float.compare(Float.intBitsToFloat((int) (c & 4294967295L)), Float.intBitsToFloat((int) (O & 4294967295L)));
                        }
                        if (compare <= 0) {
                            pl1Var = pl1Var3;
                        } else if (pl1Var == null) {
                            pl1Var = pl1Var3;
                        }
                    }
                    i--;
                } else {
                    f = 0.0f;
                    break;
                }
            }
        } else {
            f = 0.0f;
            pl1Var = null;
        }
        if (pl1Var == null) {
            if (jtVar.y) {
                pl1Var2 = (pl1) jtVar.w.invoke();
            }
            if (pl1Var2 == null) {
                return f;
            }
            pl1Var = pl1Var2;
        }
        long O2 = vn.O(jtVar.z);
        int ordinal2 = jtVar.s.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                float f2 = pl1Var.a;
                return xjVar.a(f2 - ((int) (j >> 32)), pl1Var.c - f2, Float.intBitsToFloat((int) (O2 >> 32)));
            }
            se.m();
            return f;
        }
        float f3 = pl1Var.b;
        return xjVar.a(f3 - ((int) (j & 4294967295L)), pl1Var.d - f3, Float.intBitsToFloat((int) (O2 & 4294967295L)));
    }

    public static boolean M0(jt jtVar, pl1 pl1Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = jtVar.z;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long O0 = jtVar.O0(pl1Var, j3, j2);
        if (Math.abs(Float.intBitsToFloat((int) (O0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (O0 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    public final void N0(long j) {
        xj xjVar = this.v;
        if (xjVar == null) {
            xjVar = (xj) hp.s(this, zj.a);
        }
        xj xjVar2 = xjVar;
        if (this.A) {
            nl0.c("launchAnimation called when previous animation was running");
        }
        xj xjVar3 = this.v;
        if (xjVar3 == null) {
            xjVar3 = (xj) hp.s(this, zj.a);
        }
        xjVar3.getClass();
        xj.a.getClass();
        rx.C(z0(), null, new ht(this, new wd2(wj.b), xjVar2, j, null), 1);
    }

    public final long O0(pl1 pl1Var, long j, long j2) {
        long O = vn.O(j);
        int ordinal = this.s.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                xj xjVar = this.v;
                if (xjVar == null) {
                    xjVar = (xj) hp.s(this, zj.a);
                }
                float f = pl1Var.a;
                return (Float.floatToRawIntBits(xjVar.a(f - ((int) (j2 >> 32)), pl1Var.c - f, Float.intBitsToFloat((int) (O >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            }
            se.m();
            return 0L;
        }
        xj xjVar2 = this.v;
        if (xjVar2 == null) {
            xjVar2 = (xj) hp.s(this, zj.a);
        }
        float f2 = pl1Var.b;
        float a = xjVar2.a(f2 - ((int) (j2 & 4294967295L)), pl1Var.d - f2, Float.intBitsToFloat((int) (O & 4294967295L)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
    }

    @Override // defpackage.gq0
    public final void o(long j) {
        int B;
        long j2;
        long j3 = this.z;
        this.z = j;
        int ordinal = this.s.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                B = sn0.B((int) (j >> 32), (int) (j3 >> 32));
            } else {
                se.m();
                return;
            }
        } else {
            B = sn0.B((int) (j & 4294967295L), (int) (j3 & 4294967295L));
        }
        if (B < 0) {
            if (!this.u) {
                if (this.s == sb1.e) {
                    j2 = (((int) (j3 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L;
                } else {
                    j2 = (((int) (j3 >> 32)) - ((int) (j >> 32))) << 32;
                }
            } else {
                j2 = 0;
            }
            long j4 = j2;
            pl1 pl1Var = (pl1) this.w.invoke();
            if (pl1Var != null && !this.A && !this.y && M0(this, pl1Var, j3, 0L, 2) && !M0(this, pl1Var, 0L, j4, 1)) {
                this.y = true;
                N0(j4);
            }
        }
    }
}
