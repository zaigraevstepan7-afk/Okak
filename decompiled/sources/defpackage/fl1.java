package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fl1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fl1(o72 o72Var, kb2 kb2Var, o41 o41Var) {
        this.e = 4;
        this.f = kb2Var;
        this.g = o41Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        long a;
        int i = 3;
        boolean z = true;
        switch (this.e) {
            case 0:
                jl1 jl1Var = (jl1) this.f;
                Throwable th = (Throwable) this.g;
                Throwable th2 = (Throwable) obj;
                synchronized (jl1Var.c) {
                    if (th != null) {
                        if (th2 != null) {
                            try {
                                if (th2 instanceof CancellationException) {
                                    th2 = null;
                                }
                                if (th2 != null) {
                                    qo.g(th, th2);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    jl1Var.e = th;
                    r22 r22Var = jl1Var.u;
                    gl1 gl1Var = gl1.e;
                    r22Var.getClass();
                    r22Var.k(null, gl1Var);
                }
                return od2.a;
            case 1:
                ((s41) this.f).a.setValue(new r70((th2) this.g, (th2) obj));
                return od2.a;
            case 2:
                ys1 ys1Var = (ys1) this.f;
                at1 at1Var = (at1) this.g;
                w20 w20Var = (w20) obj;
                if (w20Var.b) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                long j = w20Var.a;
                if (at1Var.d == sb1.f) {
                    a = z81.a(j, 0.0f, 1);
                } else {
                    a = z81.a(j, 0.0f, 2);
                }
                long f2 = z81.f(a, f);
                at1 at1Var2 = ys1Var.a;
                at1Var2.j = 1;
                j7 j7Var = at1Var2.b;
                if (j7Var != null && (at1Var2.a.c() || at1Var2.a.b())) {
                    j7Var.c(f2, at1Var2.j, at1Var2.m);
                } else {
                    at1Var2.c(at1Var2.k, f2, 1);
                }
                return od2.a;
            case 3:
                qo.A((c40) obj, (lo) this.f, ((d72) this.g).a());
                return od2.a;
            case 4:
                o22 o22Var = (o22) this.f;
                o41 o41Var = (o41) this.g;
                fy1 fy1Var = (fy1) obj;
                float floatValue = ((Number) o22Var.getValue()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (fy1Var.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (fy1Var.a & 4294967295L)) * floatValue;
                if (Float.intBitsToFloat((int) (((fy1) o41Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((fy1) o41Var.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    o41Var.setValue(new fy1((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
                }
                return od2.a;
            case 5:
                dl dlVar = (dl) obj;
                return dlVar.b(new n3(new fl1(i, ((kw1) this.f).a(dlVar.e.d(), dlVar.e.getLayoutDirection(), dlVar), (d72) this.g), 7));
            case 6:
                return new h6(8, (o41) this.f, (r31) this.g);
            case 7:
                de0 de0Var = (de0) this.f;
                de0 de0Var2 = (de0) this.g;
                t62 t62Var = (t62) obj;
                de0Var.invoke();
                if (de0Var2 != null) {
                    z = ((Boolean) de0Var2.invoke()).booleanValue();
                }
                if (z) {
                    t62Var.close();
                }
                return od2.a;
            case 8:
                o22 o22Var2 = (o22) this.f;
                o22 o22Var3 = (o22) this.g;
                io1 io1Var = (io1) obj;
                io1Var.j(((Number) o22Var2.getValue()).floatValue());
                io1Var.k(((Number) o22Var2.getValue()).floatValue());
                io1Var.c(((Number) o22Var3.getValue()).floatValue());
                return od2.a;
            case 9:
                rx.C((gv) this.f, null, new h61((lb2) this.g, null), 1);
                return new x8(3);
            case 10:
                lb2 lb2Var = (lb2) this.f;
                lb2 lb2Var2 = (lb2) this.g;
                lb2Var.j.add(lb2Var2);
                return new h6(9, lb2Var, lb2Var2);
            case 11:
                return new h6(10, (lb2) this.f, (hb2) this.g);
            case 12:
                lb2 lb2Var3 = (lb2) this.f;
                kb2 kb2Var = (kb2) this.g;
                lb2Var3.i.add(kb2Var);
                return new h6(11, lb2Var3, kb2Var);
            case 13:
                wd2 wd2Var = (wd2) this.f;
                oe0 oe0Var = (oe0) this.g;
                ((Long) obj).getClass();
                float f3 = wd2Var.e;
                wd2Var.e = 0.0f;
                oe0Var.invoke(Float.valueOf(f3));
                return od2.a;
            default:
                pi2 pi2Var = (pi2) this.f;
                View view = (View) this.g;
                pi2Var.a(view);
                return new h6(12, pi2Var, view);
        }
    }

    public /* synthetic */ fl1(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
