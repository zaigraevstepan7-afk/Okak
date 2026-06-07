package defpackage;

import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nr0 implements yq {
    public final ar0 e;
    public xr f;
    public e42 g;
    public int h;
    public int i;
    public final i41 j;
    public final i41 k;
    public final ir0 l;
    public final fr0 m;
    public final i41 n;
    public final d42 o;
    public final i41 p;
    public final q41 q;
    public int r;
    public int s;
    public final String t;

    public nr0(ar0 ar0Var, e42 e42Var) {
        this.e = ar0Var;
        this.g = e42Var;
        long[] jArr = sr1.a;
        this.j = new i41();
        this.k = new i41();
        this.l = new ir0(this);
        this.m = new fr0(this);
        this.n = new i41();
        this.o = new d42();
        this.p = new i41();
        this.q = new q41(new Object[16]);
        this.t = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(gr0 gr0Var) {
        j41 j41Var;
        lf1 lf1Var = gr0Var.f;
        if (lf1Var != null) {
            lf1Var.h.set(nf1.f);
            fm1 fm1Var = lf1Var.k;
            if (fm1Var.d.h()) {
                j41Var = fm1Var.d;
                j41 j41Var2 = tr1.a;
                fm1Var.d = new j41();
                fm1Var.c.g();
            } else {
                j41Var = null;
            }
            fm1Var.b();
            ds dsVar = lf1Var.a;
            dsVar.u = null;
            if (j41Var != null) {
                dsVar.y.k = j41Var;
                dsVar.A = 2;
            }
            gr0Var.f = null;
            ds dsVar2 = gr0Var.c;
            if (dsVar2 != null) {
                dsVar2.m();
            }
            gr0Var.c = null;
        }
    }

    @Override // defpackage.yq
    public final void a() {
        ds dsVar;
        ar0 ar0Var = this.e;
        ar0Var.u = true;
        i41 i41Var = this.j;
        Object[] objArr = i41Var.c;
        long[] jArr = i41Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (dsVar = ((gr0) objArr[(i << 3) + i3]).c) != null) {
                            dsVar.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ar0Var.R();
        ar0Var.u = false;
        i41Var.a();
        this.k.a();
        this.s = 0;
        this.r = 0;
        this.n.a();
        g();
    }

    @Override // defpackage.yq
    public final void b() {
        h(true);
    }

    public final void c(gr0 gr0Var, boolean z) {
        oe0 oe0Var;
        lf1 lf1Var = gr0Var.f;
        if (lf1Var != null) {
            i02 e = nq1.e();
            if (e != null) {
                oe0Var = e.e();
            } else {
                oe0Var = null;
            }
            i02 j = nq1.j(e);
            try {
                ar0 ar0Var = this.e;
                ar0Var.u = true;
                if (z) {
                    while (!lf1Var.c()) {
                        try {
                            lf1Var.e(new se(26));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                lf1Var.a();
                gr0Var.f = null;
                ar0Var.u = false;
            } finally {
                nq1.o(e, j, oe0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [z32, java.lang.Object] */
    public final z32 e(Object obj) {
        if (!this.e.H()) {
            return new Object();
        }
        return new mr0(this, obj);
    }

    public final void f(int i) {
        boolean z;
        oe0 oe0Var;
        boolean z2 = false;
        this.r = 0;
        List o = this.e.o();
        z31 z31Var = (z31) o;
        int i2 = (((q41) z31Var.f).g - this.s) - 1;
        if (i <= i2) {
            this.o.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.j.g((ar0) z31Var.get(i3));
                    g.getClass();
                    ((c41) this.o.f).a(((gr0) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.g.b(this.o);
            i02 e = nq1.e();
            if (e != null) {
                oe0Var = e.e();
            } else {
                oe0Var = null;
            }
            i02 j = nq1.j(e);
            z = false;
            while (i2 >= i) {
                try {
                    ar0 ar0Var = (ar0) ((z31) o).get(i2);
                    Object g2 = this.j.g(ar0Var);
                    g2.getClass();
                    gr0 gr0Var = (gr0) g2;
                    Object obj = gr0Var.a;
                    if (((c41) this.o.f).c(obj)) {
                        this.r++;
                        if (((Boolean) gr0Var.g.getValue()).booleanValue()) {
                            er0 er0Var = ar0Var.K;
                            i01 i01Var = er0Var.p;
                            yq0 yq0Var = yq0.g;
                            i01Var.p = yq0Var;
                            zy0 zy0Var = er0Var.q;
                            if (zy0Var != null) {
                                zy0Var.n = yq0Var;
                            }
                            j(gr0Var, false);
                            if (gr0Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        ar0 ar0Var2 = this.e;
                        ar0Var2.u = true;
                        this.j.k(ar0Var);
                        ds dsVar = gr0Var.c;
                        if (dsVar != null) {
                            dsVar.m();
                        }
                        this.e.S(i2, 1);
                        ar0Var2.u = false;
                    }
                    this.k.k(obj);
                    i2--;
                } catch (Throwable th) {
                    nq1.o(e, j, oe0Var);
                    throw th;
                }
            }
            nq1.o(e, j, oe0Var);
        } else {
            z = false;
        }
        if (z) {
            synchronized (q02.c) {
                j41 j41Var = q02.j.h;
                if (j41Var != null) {
                    if (j41Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                q02.a();
            }
        }
        g();
    }

    public final void g() {
        int i = ((q41) ((z31) this.e.o()).f).g;
        i41 i41Var = this.j;
        if (i41Var.e != i) {
            kl0.a("Inconsistency between the count of nodes tracked by the state (" + i41Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.r) - this.s < 0) {
            StringBuilder q = l90.q("Incorrect state. Total children ", i, ". Reusable children ");
            q.append(this.r);
            q.append(". Precomposed children ");
            q.append(this.s);
            kl0.a(q.toString());
        }
        i41 i41Var2 = this.n;
        if (i41Var2.e == this.s) {
            return;
        }
        kl0.a("Incorrect state. Precomposed children " + this.s + ". Map size " + i41Var2.e);
    }

    public final void h(boolean z) {
        oe0 oe0Var;
        this.s = 0;
        this.n.a();
        List o = this.e.o();
        int i = ((q41) ((z31) o).f).g;
        if (this.r != i) {
            this.r = i;
            i02 e = nq1.e();
            if (e != null) {
                oe0Var = e.e();
            } else {
                oe0Var = null;
            }
            i02 j = nq1.j(e);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    ar0 ar0Var = (ar0) ((z31) o).get(i2);
                    gr0 gr0Var = (gr0) this.j.g(ar0Var);
                    if (gr0Var != null && ((Boolean) gr0Var.g.getValue()).booleanValue()) {
                        er0 er0Var = ar0Var.K;
                        i01 i01Var = er0Var.p;
                        yq0 yq0Var = yq0.g;
                        i01Var.p = yq0Var;
                        zy0 zy0Var = er0Var.q;
                        if (zy0Var != null) {
                            zy0Var.n = yq0Var;
                        }
                        j(gr0Var, z);
                        gr0Var.a = bf.g1;
                    }
                } catch (Throwable th) {
                    nq1.o(e, j, oe0Var);
                    throw th;
                }
            }
            nq1.o(e, j, oe0Var);
            this.k.a();
        }
        g();
    }

    public final void i(int i, int i2) {
        ar0 ar0Var = this.e;
        ar0Var.u = true;
        ar0Var.L(i, i2, 1);
        ar0Var.u = false;
    }

    public final void j(gr0 gr0Var, boolean z) {
        ds dsVar;
        if (!z && gr0Var.h) {
            gr0Var.g.setValue(Boolean.FALSE);
        } else {
            gr0Var.g = fr1.k(Boolean.FALSE);
        }
        if (gr0Var.f != null) {
            d(gr0Var);
            return;
        }
        if (z) {
            ds dsVar2 = gr0Var.c;
            if (dsVar2 != null) {
                dsVar2.l();
                return;
            }
            return;
        }
        tb1 m295getOutOfFrameExecutor = ((q5) dr0.a(this.e)).m295getOutOfFrameExecutor();
        if (m295getOutOfFrameExecutor != null) {
            s8 s8Var = new s8(gr0Var, 6);
            q5 q5Var = (q5) m295getOutOfFrameExecutor;
            te teVar = q5Var.l;
            boolean isEmpty = teVar.isEmpty();
            teVar.addLast(s8Var);
            if (isEmpty) {
                Handler handler = q5Var.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(q5Var.m);
                    return;
                } else {
                    se.h("schedule is called when outOfFrameExecutor is not available (view is detached)");
                    return;
                }
            }
            return;
        }
        if (!gr0Var.h && (dsVar = gr0Var.c) != null) {
            dsVar.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010c, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x0109, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0116, B:67:0x0120), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010c, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x0109, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0116, B:67:0x0120), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010c, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x0109, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0116, B:67:0x0120), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010c, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x0109, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0116, B:67:0x0120), top: B:36:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gr0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.ar0 r10, java.lang.Object r11, boolean r12, defpackage.se0 r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr0.k(ar0, java.lang.Object, boolean, se0):void");
    }

    public final ar0 l(Object obj) {
        i41 i41Var;
        int i;
        if (this.r != 0) {
            z31 z31Var = (z31) this.e.o();
            int i2 = ((q41) z31Var.f).g - this.s;
            int i3 = i2 - this.r;
            int i4 = i2 - 1;
            int i5 = i4;
            while (true) {
                i41Var = this.j;
                if (i5 >= i3) {
                    Object g = i41Var.g((ar0) z31Var.get(i5));
                    g.getClass();
                    if (sn0.r(((gr0) g).a, obj)) {
                        i = i5;
                        break;
                    }
                    i5--;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                while (i4 >= i3) {
                    Object g2 = i41Var.g((ar0) z31Var.get(i4));
                    g2.getClass();
                    gr0 gr0Var = (gr0) g2;
                    Object obj2 = gr0Var.a;
                    if (obj2 != bf.g1 && !this.g.e(obj, obj2)) {
                        i4--;
                    } else {
                        gr0Var.a = obj;
                        i5 = i4;
                        i = i5;
                        break;
                    }
                }
                i5 = i4;
            }
            if (i == -1) {
                return null;
            }
            if (i5 != i3) {
                i(i5, i3);
            }
            this.r--;
            ar0 ar0Var = (ar0) z31Var.get(i3);
            Object g3 = i41Var.g(ar0Var);
            g3.getClass();
            gr0 gr0Var2 = (gr0) g3;
            gr0Var2.g = fr1.k(Boolean.TRUE);
            gr0Var2.e = true;
            gr0Var2.d = true;
            return ar0Var;
        }
        return null;
    }
}
