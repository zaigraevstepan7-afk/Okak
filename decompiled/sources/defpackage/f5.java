package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f5 extends cq0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5(int i, Object obj, Object obj2) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [d21] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [d21] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.de0
    public final Object invoke() {
        float f;
        float f2;
        ru1 ru1Var;
        ar0 ar0Var;
        pl1 pl1Var;
        boolean z;
        int i = this.e;
        boolean z2 = false;
        od2 od2Var = od2.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj));
            case 2:
                w5 w5Var = (w5) obj;
                cs1 cs1Var = (cs1) obj2;
                xr1 xr1Var = cs1Var.i;
                xr1 xr1Var2 = cs1Var.j;
                Float f3 = cs1Var.g;
                Float f4 = cs1Var.h;
                if (xr1Var != null && f3 != null) {
                    f = ((Number) xr1Var.a.invoke()).floatValue() - f3.floatValue();
                } else {
                    f = 0.0f;
                }
                if (xr1Var2 != null && f4 != null) {
                    f2 = ((Number) xr1Var2.a.invoke()).floatValue() - f4.floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (f != 0.0f || f2 != 0.0f) {
                    int s = w5Var.s(cs1Var.e);
                    tu1 tu1Var = (tu1) w5Var.k().b(w5Var.p);
                    if (tu1Var != null) {
                        try {
                            h1 h1Var = w5Var.r;
                            if (h1Var != null) {
                                h1Var.a.setBoundsInScreen(w5Var.c(tu1Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    tu1 tu1Var2 = (tu1) w5Var.k().b(w5Var.q);
                    if (tu1Var2 != null) {
                        try {
                            h1 h1Var2 = w5Var.s;
                            if (h1Var2 != null) {
                                h1Var2.a.setBoundsInScreen(w5Var.c(tu1Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    w5Var.h.invalidate();
                    tu1 tu1Var3 = (tu1) w5Var.k().b(s);
                    if (tu1Var3 != null && (ru1Var = tu1Var3.a) != null && (ar0Var = ru1Var.c) != null) {
                        if (xr1Var != null) {
                            w5Var.u.i(s, xr1Var);
                        }
                        if (xr1Var2 != null) {
                            w5Var.v.i(s, xr1Var2);
                        }
                        w5Var.o(ar0Var);
                    }
                }
                if (xr1Var != null) {
                    cs1Var.g = (Float) xr1Var.a.invoke();
                }
                if (xr1Var2 != null) {
                    cs1Var.h = (Float) xr1Var2.a.invoke();
                }
                return od2Var;
            case 3:
                de0 de0Var = (de0) obj2;
                if (de0Var != null && (pl1Var = (pl1) de0Var.invoke()) != null) {
                    return pl1Var;
                }
                e81 e81Var = (e81) obj;
                if (!e81Var.V0().r) {
                    e81Var = null;
                }
                if (e81Var == null) {
                    return null;
                }
                return hp.e(0L, vn.O(e81Var.g));
            case 4:
                ((cl) obj2).u.invoke((dl) obj);
                return od2Var;
            case 5:
                ((wl1) obj2).e = ((tc0) obj).N0();
                return od2Var;
            case 6:
                ((zg0) obj2).d((d21) obj);
                return od2Var;
            case 7:
                a81 a81Var = ((ar0) obj2).J;
                wl1 wl1Var = (wl1) obj;
                if ((a81Var.f.h & 8) != 0) {
                    for (d21 d21Var = a81Var.e; d21Var != null; d21Var = d21Var.i) {
                        if ((d21Var.g & 8) != 0) {
                            rz rzVar = d21Var;
                            ?? r6 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof pu1) {
                                    pu1 pu1Var = (pu1) rzVar;
                                    if (pu1Var.F()) {
                                        mu1 mu1Var = new mu1();
                                        wl1Var.e = mu1Var;
                                        mu1Var.h = true;
                                    }
                                    if (pu1Var.w0()) {
                                        ((mu1) wl1Var.e).g = true;
                                    }
                                    pu1Var.u0((av1) wl1Var.e);
                                } else if ((rzVar.g & 8) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var2 = rzVar.t;
                                    int i2 = 0;
                                    rzVar = rzVar;
                                    r6 = r6;
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 8) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                rzVar = d21Var2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r6.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r6.b(d21Var2);
                                            }
                                        }
                                        d21Var2 = d21Var2.j;
                                        rzVar = rzVar;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                rzVar = hp.l(r6);
                            }
                        }
                    }
                }
                return od2Var;
            default:
                io1 io1Var = e81.Q;
                ((oe0) obj2).invoke(io1Var);
                e81 e81Var2 = (e81) obj;
                kw1 kw1Var = e81Var2.H;
                kw1 kw1Var2 = io1Var.p;
                if (kw1Var != kw1Var2) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = e81Var2.I;
                boolean z4 = io1Var.q;
                if (z3 != z4) {
                    z2 = true;
                }
                if (z || z2) {
                    e81Var2.H = kw1Var2;
                    e81Var2.I = z4;
                    if (e81Var2.J && (z2 || (z4 && z))) {
                        e81Var2.s.F();
                    }
                }
                e81Var2.J = true;
                io1Var.v = io1Var.p.a(io1Var.r, io1Var.t, io1Var.s);
                return od2Var;
        }
    }
}
