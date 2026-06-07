package defpackage;

import android.os.Trace;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class st0 implements us1 {
    public static final sl0 x = fp.O(new le(25), new mm0(10));
    public final py a;
    public boolean b;
    public mt0 c;
    public boolean d;
    public final xm e;
    public final je1 f;
    public final r31 g;
    public float h;
    public final xy i;
    public final boolean j;
    public ar0 k;
    public final qt0 l;
    public final og m;
    public final fs0 n;
    public final nj o;
    public final vs0 p;
    public final rg2 q;
    public final ss0 r;
    public final o41 s;
    public final je1 t;
    public final je1 u;
    public final o41 v;
    public final sl0 w;

    /* JADX WARN: Type inference failed for: r0v0, types: [py, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [sl0, java.lang.Object] */
    public st0(final int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.d = -1;
        this.a = obj;
        ?? obj2 = new Object();
        obj2.b = new ge1(i);
        obj2.c = new ge1(i2);
        obj2.e = new ms0(i);
        this.e = obj2;
        this.f = new je1(ut0.a, g3.S);
        this.g = new r31();
        this.i = new xy(new r(this, 19));
        this.j = true;
        this.l = new qt0(this, 0);
        this.m = new og();
        this.n = new fs0();
        this.o = new nj(1);
        this.p = new vs0(new oe0(this) { // from class: pt0
            @Override // defpackage.oe0
            public final Object invoke(Object obj3) {
                oe0 oe0Var;
                ts0 ts0Var = (ts0) obj3;
                i02 e = nq1.e();
                if (e != null) {
                    oe0Var = e.e();
                } else {
                    oe0Var = null;
                }
                nq1.o(e, nq1.j(e), oe0Var);
                int i3 = ts0Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    ts0Var.a(i + i4);
                }
                return od2.a;
            }
        });
        this.q = new rg2(this, 16);
        this.r = new ss0();
        this.s = go.u();
        Boolean bool = Boolean.FALSE;
        this.t = fr1.k(bool);
        this.u = fr1.k(bool);
        this.v = go.u();
        ?? obj3 = new Object();
        ec2 ec2Var = f2.A;
        Float valueOf = Float.valueOf(0.0f);
        obj3.f = new hc(ec2Var, valueOf, (mc) ec2Var.a.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.w = obj3;
    }

    @Override // defpackage.us1
    public final boolean a() {
        return this.i.a();
    }

    @Override // defpackage.us1
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r6.i.d(r7, r8, r0) != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6.m.h(r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.us1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.t41 r7, defpackage.se0 r8, defpackage.wt r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.rt0
            if (r0 == 0) goto L13
            r0 = r9
            rt0 r0 = (defpackage.rt0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            rt0 r0 = new rt0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.i
            r2 = 0
            r3 = 2
            r4 = 1
            hv r5 = defpackage.hv.e
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.io.K(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            return r2
        L31:
            q42 r7 = r0.f
            r8 = r7
            se0 r8 = (defpackage.se0) r8
            t41 r7 = r0.e
            defpackage.io.K(r9)
            goto L5b
        L3c:
            defpackage.io.K(r9)
            je1 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            mt0 r1 = defpackage.ut0.a
            if (r9 != r1) goto L5b
            r0.e = r7
            r9 = r8
            q42 r9 = (defpackage.q42) r9
            r0.f = r9
            r0.i = r4
            og r9 = r6.m
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.e = r2
            r0.f = r2
            r0.i = r3
            xy r6 = r6.i
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            od2 r6 = defpackage.od2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st0.d(t41, se0, wt):java.lang.Object");
    }

    @Override // defpackage.us1
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void f(mt0 mt0Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        sl0 sl0Var;
        long j;
        long j2;
        Object obj;
        boolean z4;
        int i2;
        i02 e;
        oe0 oe0Var;
        i02 j3;
        oe0 oe0Var2;
        ec2 ec2Var = f2.A;
        List list = mt0Var.k;
        int i3 = mt0Var.n;
        int i4 = mt0Var.b;
        nt0 nt0Var = mt0Var.a;
        this.p.e = list.size();
        sl0 sl0Var2 = this.w;
        xm xmVar = this.e;
        vt vtVar = null;
        if (!z && this.b) {
            this.c = mt0Var;
            e = nq1.e();
            if (e != null) {
                oe0Var2 = e.e();
            } else {
                oe0Var2 = null;
            }
            j3 = nq1.j(e);
            try {
                if (((Number) ((hc) sl0Var2.f).f.getValue()).floatValue() != 0.0f && nt0Var != null && nt0Var.a == ((ge1) xmVar.b).g() && i4 == ((ge1) xmVar.c).g()) {
                    i22 i22Var = (i22) sl0Var2.e;
                    if (i22Var != null) {
                        i22Var.c(null);
                    }
                    sl0Var2.f = new hc(ec2Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                nq1.o(e, j3, oe0Var);
            }
        }
        boolean z5 = true;
        if (z) {
            this.b = true;
        }
        if (nt0Var != null) {
            i = nt0Var.a;
        } else {
            i = 0;
        }
        if (i == 0 && i4 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.u.setValue(Boolean.valueOf(z3));
        this.t.setValue(Boolean.valueOf(mt0Var.c));
        this.h -= mt0Var.d;
        this.f.setValue(mt0Var);
        if (z2) {
            xmVar.getClass();
            if (i4 < 0.0f) {
                z5 = false;
            }
            if (!z5) {
                nl0.c("scrollOffset should be non-negative");
            }
            ((ge1) xmVar.c).h(i4);
            sl0Var = sl0Var2;
        } else {
            nt0 nt0Var2 = (nt0) wn.h0(list);
            nt0 nt0Var3 = (nt0) wn.o0(list);
            if (nt0Var2 != null) {
                sl0Var = sl0Var2;
                j = nt0Var2.a;
            } else {
                sl0Var = sl0Var2;
                j = -1;
            }
            Trace.setCounter("firstVisibleItem:index", j);
            if (nt0Var3 != null) {
                j2 = nt0Var3.a;
            } else {
                j2 = -1;
            }
            Trace.setCounter("lastVisibleItem:index", j2);
            xmVar.getClass();
            if (nt0Var != null) {
                obj = nt0Var.g;
            } else {
                obj = null;
            }
            xmVar.d = obj;
            if (xmVar.a || i3 > 0) {
                xmVar.a = true;
                if (i4 >= 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    nl0.c("scrollOffset should be non-negative");
                }
                if (nt0Var != null) {
                    i2 = nt0Var.a;
                } else {
                    i2 = 0;
                }
                xmVar.b(i2, i4);
            }
            if (this.j) {
                py pyVar = this.a;
                int i5 = pyVar.a;
                boolean z6 = pyVar.c;
                if (i5 != -1 && !list.isEmpty() && i5 != py.a(mt0Var, z6)) {
                    pyVar.a = -1;
                    us0 us0Var = pyVar.b;
                    if (us0Var != null) {
                        us0Var.cancel();
                    }
                    pyVar.b = null;
                }
                int i6 = pyVar.d;
                if (i6 != -1 && pyVar.e != 0.0f && i6 != i3 && !list.isEmpty()) {
                    if (pyVar.e >= 0.0f) {
                        z5 = false;
                    }
                    int a = py.a(mt0Var, z5);
                    if (a >= 0 && a < i3) {
                        pyVar.a = a;
                        pyVar.b = rg2.A(this.q, a);
                    }
                }
                pyVar.d = i3;
            }
        }
        if (z) {
            float f = mt0Var.f;
            c00 c00Var = mt0Var.i;
            gv gvVar = mt0Var.h;
            sl0Var.getClass();
            if (f > c00Var.W(1.0f)) {
                e = nq1.e();
                if (e != null) {
                    oe0Var = e.e();
                } else {
                    oe0Var = null;
                }
                j3 = nq1.j(e);
                sl0 sl0Var3 = sl0Var;
                try {
                    float floatValue = ((Number) ((hc) sl0Var3.f).f.getValue()).floatValue();
                    i22 i22Var2 = (i22) sl0Var3.e;
                    if (i22Var2 != null) {
                        i22Var2.c(null);
                    }
                    hc hcVar = (hc) sl0Var3.f;
                    if (hcVar.j) {
                        sl0Var3.f = c01.r(hcVar, floatValue - f, 0.0f, 30);
                    } else {
                        sl0Var3.f = new hc(ec2Var, Float.valueOf(-f), null, 60);
                    }
                    sl0Var3.e = rx.C(gvVar, null, new vf(sl0Var3, vtVar, 5), 3);
                } finally {
                }
            }
        }
    }

    public final int g() {
        return ((ge1) this.e.b).g();
    }

    public final int h() {
        return ((ge1) this.e.c).g();
    }

    public final mt0 i() {
        return (mt0) this.f.getValue();
    }

    public final void j(float f, mt0 mt0Var) {
        boolean z;
        us0 us0Var;
        us0 us0Var2;
        if (this.j) {
            boolean isEmpty = mt0Var.k.isEmpty();
            py pyVar = this.a;
            if (!isEmpty) {
                if (f < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                int a = py.a(mt0Var, z);
                if (a >= 0 && a < mt0Var.n) {
                    if (a != pyVar.a) {
                        if (pyVar.c != z) {
                            pyVar.a = -1;
                            us0 us0Var3 = pyVar.b;
                            if (us0Var3 != null) {
                                us0Var3.cancel();
                            }
                            pyVar.b = null;
                        }
                        pyVar.c = z;
                        pyVar.a = a;
                        pyVar.b = rg2.A(this.q, a);
                    }
                    List list = mt0Var.k;
                    if (z) {
                        nt0 nt0Var = (nt0) wn.n0(list);
                        if (((nt0Var.j + nt0Var.k) + mt0Var.q) - mt0Var.m < (-f) && (us0Var2 = pyVar.b) != null) {
                            us0Var2.a();
                        }
                    } else if (mt0Var.l - ((nt0) wn.g0(list)).j < f && (us0Var = pyVar.b) != null) {
                        us0Var.a();
                    }
                }
            }
            pyVar.e = f;
        }
    }

    public final void k(int i) {
        xm xmVar = this.e;
        if (((ge1) xmVar.b).g() != i || ((ge1) xmVar.c).g() != 0) {
            fs0 fs0Var = this.n;
            fs0Var.c();
            fs0Var.b = null;
        }
        xmVar.b(i, 0);
        xmVar.d = null;
        ar0 ar0Var = this.k;
        if (ar0Var != null) {
            ar0Var.k();
        }
    }
}
