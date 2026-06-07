package defpackage;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h80 {
    public final /* synthetic */ oc0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ o41 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ f12 g;
    public final /* synthetic */ o41 h;
    public final /* synthetic */ oe0 i;
    public final /* synthetic */ ge1 j;
    public final /* synthetic */ ge1 k;

    public h80(oc0 oc0Var, boolean z, o41 o41Var, String str, String str2, String str3, f12 f12Var, o41 o41Var2, oe0 oe0Var, ge1 ge1Var, ge1 ge1Var2) {
        this.a = oc0Var;
        this.b = z;
        this.c = o41Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = f12Var;
        this.h = o41Var2;
        this.i = oe0Var;
        this.j = ge1Var;
        this.k = ge1Var2;
    }

    public final void a(final boolean z, final de0 de0Var, e21 e21Var, fs1 fs1Var, boolean z2, kw1 kw1Var, long j, float f, final fq fqVar, ur urVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        final e21 e21Var2;
        final fs1 fs1Var2;
        final boolean z4;
        final kw1 kw1Var2;
        final long j2;
        final float f2;
        int i5;
        fs1 fs1Var3;
        e21 e21Var3;
        boolean z5;
        boolean z6;
        boolean z7;
        p41 p41Var;
        int i6;
        final fs1 fs1Var4;
        final e21 e21Var4;
        final boolean z8;
        int i7;
        urVar.Y(-126848451);
        int i8 = 2;
        if (urVar.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i | i3;
        int i10 = 16;
        if ((i & 48) == 0) {
            if (urVar.h(de0Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i9 |= i7;
        }
        int i11 = i9 | 919168384;
        if ((i2 & 6) == 0) {
            if (urVar.h(fqVar)) {
                i8 = 4;
            }
            i4 = i2 | i8;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.f(this)) {
                i10 = 32;
            }
            i4 |= i10;
        }
        if ((306783379 & i11) == 306783378 && (i4 & 19) == 18) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (urVar.O(i11 & 1, z3)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i5 = i11 & (-4135937);
                e21Var3 = e21Var;
                fs1Var3 = fs1Var;
                z5 = z2;
                kw1Var2 = kw1Var;
                j2 = j;
                f2 = f;
            } else {
                fs1 K = rx.K(urVar);
                float f3 = r01.a;
                kw1 b = pw1.b(d6.u, urVar);
                long e = oo.e(d6.s, urVar);
                i5 = i11 & (-4135937);
                float f4 = r01.a;
                fs1Var3 = K;
                e21Var3 = b21.a;
                j2 = e;
                f2 = f4;
                kw1Var2 = b;
                z5 = true;
            }
            int i12 = i5;
            urVar.q();
            Object L = urVar.L();
            Object obj = or.a;
            if (L == obj) {
                Object je1Var = new je1(od2.a, g3.S);
                urVar.h0(je1Var);
                L = je1Var;
            }
            o41 o41Var = (o41) L;
            c00 c00Var = (c00) urVar.j(is.h);
            WeakHashMap weakHashMap = pi2.w;
            int i13 = wm1.j(urVar).f.e().b;
            e21 e21Var5 = e21Var3;
            if (z) {
                urVar.X(629975788);
                Object L2 = urVar.L();
                if (L2 == obj) {
                    z6 = z5;
                    L2 = new z9(o41Var, 3);
                    urVar.h0(L2);
                } else {
                    z6 = z5;
                }
                hp.d((de0) L2, urVar, 6);
                z7 = false;
            } else {
                z6 = z5;
                z7 = false;
                urVar.X(614559333);
            }
            urVar.p(z7);
            Object L3 = urVar.L();
            if (L3 == obj) {
                L3 = new p41(Boolean.FALSE);
                urVar.h0(L3);
            }
            p41 p41Var2 = (p41) L3;
            fs1 fs1Var5 = fs1Var3;
            p41Var2.c.setValue(Boolean.valueOf(z));
            if (!((Boolean) p41Var2.b.getValue()).booleanValue() && !((Boolean) p41Var2.c.getValue()).booleanValue()) {
                urVar.X(614559333);
                urVar.p(false);
                e21Var4 = e21Var5;
                z8 = z6;
                fs1Var4 = fs1Var5;
            } else {
                urVar.X(630380617);
                Object L4 = urVar.L();
                if (L4 == obj) {
                    p41Var = p41Var2;
                    L4 = fr1.k(new cb2(cb2.b));
                    urVar.h0(L4);
                } else {
                    p41Var = p41Var2;
                }
                final o41 o41Var2 = (o41) L4;
                boolean f5 = urVar.f(c00Var) | urVar.d(i13);
                Object L5 = urVar.L();
                if (f5 || L5 == obj) {
                    L5 = new i80(c00Var, i13, o41Var, new y70(o41Var2, 0));
                    urVar.h0(L5);
                }
                i80 i80Var = (i80) L5;
                ((x70) this.h.getValue()).getClass();
                ((Boolean) this.c.getValue()).getClass();
                if (!((Boolean) c01.P(0, 7, urVar).getValue()).booleanValue()) {
                    i6 = 393248;
                } else {
                    i6 = 393216;
                }
                final p41 p41Var3 = p41Var;
                fs1Var4 = fs1Var5;
                e21Var4 = e21Var5;
                z8 = z6;
                c9.a(i80Var, de0Var, new ci1(i6, true), go.N(2063119149, new se0() { // from class: z70
                    @Override // defpackage.se0
                    public final Object invoke(Object obj2, Object obj3) {
                        boolean z9;
                        ur urVar2 = (ur) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        int i14 = 0;
                        if ((intValue & 3) != 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (urVar2.O(intValue & 1, z9)) {
                            h80 h80Var = h80.this;
                            w01.a(mp0.D(e21Var4, new g80(i14, h80Var.j, h80Var.k, z8)), p41Var3, o41Var2, fs1Var4, kw1Var2, j2, f2, fqVar, urVar2, 384);
                        } else {
                            urVar2.R();
                        }
                        return od2.a;
                    }
                }, urVar), urVar, (i12 & 112) | 3072, 0);
                urVar.p(false);
            }
            e21Var2 = e21Var4;
            fs1Var2 = fs1Var4;
            z4 = z8;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            fs1Var2 = fs1Var;
            z4 = z2;
            kw1Var2 = kw1Var;
            j2 = j;
            f2 = f;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: a80
                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int b0 = lo.b0(i | 1);
                    int b02 = lo.b0(i2);
                    h80.this.a(z, de0Var, e21Var2, fs1Var2, z4, kw1Var2, j2, f2, fqVar, (ur) obj2, b0, b02);
                    return od2.a;
                }
            };
        }
    }

    public final e21 b(e21 e21Var) {
        e21 y = fc2.y(e21Var, this.a);
        o41 o41Var = this.h;
        e21 d = y.d(new v70(new z9(o41Var, 4)));
        oe0 oe0Var = this.i;
        boolean z = this.b;
        f80 f80Var = new f80(o41Var, oe0Var, z);
        return d.d(ou1.a(rx.H(s42.a(b21.a, f80Var, new i7(f80Var, 2)), new ou(f80Var, z, this.c)), false, new i(z, this.d, this.e, this.f, f80Var, this.g)));
    }
}
