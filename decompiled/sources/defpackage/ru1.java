package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ru1 {
    public final d21 a;
    public final boolean b;
    public final ar0 c;
    public final mu1 d;
    public boolean e;
    public ru1 f;
    public final int g;

    public ru1(d21 d21Var, boolean z, ar0 ar0Var, mu1 mu1Var) {
        this.a = d21Var;
        this.b = z;
        this.c = ar0Var;
        this.d = mu1Var;
        this.g = ar0Var.f;
    }

    public static /* synthetic */ List j(int i, ru1 ru1Var) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = !ru1Var.b;
        } else {
            z = false;
        }
        if ((i & 2) == 0) {
            z2 = true;
        }
        return ru1Var.i(z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final pl1 a(e81 e81Var) {
        rz rzVar;
        ru1 l = l();
        if (l == null) {
            return pl1.e;
        }
        d21 d21Var = l.c.J.f;
        e81 e81Var2 = null;
        if ((d21Var.h & 8) != 0) {
            loop0: while (d21Var != null) {
                if ((d21Var.g & 8) != 0) {
                    rzVar = d21Var;
                    ?? r5 = 0;
                    while (rzVar != 0) {
                        if (rzVar instanceof pu1) {
                            if (rzVar.i()) {
                                break loop0;
                            }
                        } else if ((rzVar.g & 8) != 0 && (rzVar instanceof rz)) {
                            d21 d21Var2 = rzVar.t;
                            int i = 0;
                            rzVar = rzVar;
                            r5 = r5;
                            while (d21Var2 != null) {
                                if ((d21Var2.g & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        rzVar = d21Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new q41(new d21[16]);
                                        }
                                        if (rzVar != 0) {
                                            r5.b(rzVar);
                                            rzVar = 0;
                                        }
                                        r5.b(d21Var2);
                                    }
                                }
                                d21Var2 = d21Var2.j;
                                rzVar = rzVar;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        rzVar = hp.l(r5);
                    }
                }
                if ((d21Var.h & 8) == 0) {
                    break;
                }
                d21Var = d21Var.j;
            }
        }
        rzVar = 0;
        pu1 pu1Var = (pu1) rzVar;
        if (pu1Var != null) {
            e81Var2 = hp.K(pu1Var, 8);
        }
        if (e81Var2 == null) {
            return l.a(e81Var);
        }
        return e81Var2.O(e81Var, true);
    }

    public final ru1 b(ap1 ap1Var, oe0 oe0Var) {
        int i;
        mu1 mu1Var = new mu1();
        mu1Var.g = false;
        mu1Var.h = false;
        oe0Var.invoke(mu1Var);
        qu1 qu1Var = new qu1(oe0Var);
        int i2 = this.g;
        if (ap1Var != null) {
            i = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        } else {
            i = 2000000000;
        }
        ru1 ru1Var = new ru1(qu1Var, false, new ar0(true, i2 + i), mu1Var);
        ru1Var.e = true;
        ru1Var.f = this;
        return ru1Var;
    }

    public final void c(ar0 ar0Var, ArrayList arrayList) {
        q41 y = ar0Var.y();
        Object[] objArr = y.e;
        int i = y.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            if (ar0Var2.H() && !ar0Var2.S) {
                if (ar0Var2.J.d(8)) {
                    arrayList.add(nq1.a(ar0Var2, this.b));
                } else {
                    c(ar0Var2, arrayList);
                }
            }
        }
    }

    public final e81 d() {
        if (this.e) {
            ru1 l = l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        pu1 f = f();
        if (f != null) {
            return hp.K(f, 8);
        }
        return this.c.J.c;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ru1 ru1Var = (ru1) arrayList.get(size2);
            if (ru1Var.m()) {
                arrayList2.add(ru1Var);
            } else if (!ru1Var.d.h) {
                ru1Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v14, types: [pu1] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public final pu1 f() {
        d21 d21Var;
        boolean z = this.d.g;
        Object obj = null;
        ar0 ar0Var = this.c;
        if (z) {
            d21 d21Var2 = ar0Var.J.f;
            if ((d21Var2.h & 8) != 0) {
                d21Var = null;
                while (d21Var2 != null) {
                    if ((d21Var2.g & 8) != 0) {
                        rz rzVar = d21Var2;
                        ?? r6 = 0;
                        while (rzVar != 0) {
                            if (rzVar instanceof pu1) {
                                ?? r5 = (pu1) rzVar;
                                if (r5.i()) {
                                    if (r5.w0()) {
                                        return r5;
                                    }
                                    if (d21Var == null) {
                                        d21Var = r5;
                                    }
                                }
                            } else if ((rzVar.g & 8) != 0 && (rzVar instanceof rz)) {
                                d21 d21Var3 = rzVar.t;
                                int i = 0;
                                rzVar = rzVar;
                                r6 = r6;
                                while (d21Var3 != null) {
                                    if ((d21Var3.g & 8) != 0) {
                                        i++;
                                        r6 = r6;
                                        if (i == 1) {
                                            rzVar = d21Var3;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new q41(new d21[16]);
                                            }
                                            if (rzVar != 0) {
                                                r6.b(rzVar);
                                                rzVar = 0;
                                            }
                                            r6.b(d21Var3);
                                        }
                                    }
                                    d21Var3 = d21Var3.j;
                                    rzVar = rzVar;
                                    r6 = r6;
                                }
                                if (i == 1) {
                                }
                            }
                            rzVar = hp.l(r6);
                        }
                    }
                    if ((d21Var2.h & 8) == 0) {
                        break;
                    }
                    d21Var2 = d21Var2.j;
                }
                obj = d21Var;
            }
            return (pu1) obj;
        }
        d21 d21Var4 = ar0Var.J.f;
        if ((d21Var4.h & 8) != 0) {
            loop3: while (d21Var4 != null) {
                if ((d21Var4.g & 8) != 0) {
                    d21Var = d21Var4;
                    q41 q41Var = null;
                    while (d21Var != null) {
                        if (d21Var instanceof pu1) {
                            if (((pu1) d21Var).i()) {
                                obj = d21Var;
                            }
                        } else if ((d21Var.g & 8) != 0 && (d21Var instanceof rz)) {
                            int i2 = 0;
                            for (d21 d21Var5 = ((rz) d21Var).t; d21Var5 != null; d21Var5 = d21Var5.j) {
                                if ((d21Var5.g & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        d21Var = d21Var5;
                                    } else {
                                        if (q41Var == null) {
                                            q41Var = new q41(new d21[16]);
                                        }
                                        if (d21Var != null) {
                                            q41Var.b(d21Var);
                                            d21Var = null;
                                        }
                                        q41Var.b(d21Var5);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        d21Var = hp.l(q41Var);
                    }
                }
                if ((d21Var4.h & 8) == 0) {
                    break;
                }
                d21Var4 = d21Var4.j;
            }
        }
        return (pu1) obj;
    }

    public final pl1 g() {
        e81 d = d();
        if (d != null) {
            if (!d.V0().r) {
                d = null;
            }
            if (d != null) {
                return qo.D(d).O(d, true);
            }
        }
        return pl1.e;
    }

    public final pl1 h() {
        e81 d = d();
        if (d != null) {
            if (!d.V0().r) {
                d = null;
            }
            if (d != null) {
                return qo.j(d, true);
            }
        }
        return pl1.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.h) {
            return l60.e;
        }
        ArrayList arrayList = new ArrayList();
        if (m()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return p(arrayList, z2);
    }

    public final mu1 k() {
        boolean m = m();
        mu1 mu1Var = this.d;
        if (m) {
            mu1 b = mu1Var.b();
            o(new ArrayList(), b);
            return b;
        }
        return mu1Var;
    }

    public final ru1 l() {
        ar0 ar0Var;
        ru1 ru1Var = this.f;
        if (ru1Var != null) {
            return ru1Var;
        }
        ar0 ar0Var2 = this.c;
        boolean z = this.b;
        if (z) {
            ar0Var = ar0Var2.v();
            while (ar0Var != null) {
                mu1 x = ar0Var.x();
                if (x != null && x.g) {
                    break;
                }
                ar0Var = ar0Var.v();
            }
        }
        ar0Var = null;
        if (ar0Var == null) {
            ar0 v = ar0Var2.v();
            while (true) {
                if (v != null) {
                    if (v.J.d(8)) {
                        ar0Var = v;
                        break;
                    }
                    v = v.v();
                } else {
                    ar0Var = null;
                    break;
                }
            }
        }
        if (ar0Var == null) {
            return null;
        }
        return nq1.a(ar0Var, z);
    }

    public final boolean m() {
        if (this.b && this.d.g) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.e && j(4, this).isEmpty()) {
            ar0 v = this.c.v();
            while (true) {
                if (v != null) {
                    mu1 x = v.x();
                    if (x != null && x.g) {
                        break;
                    }
                    v = v.v();
                } else {
                    v = null;
                    break;
                }
            }
            if (v == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(ArrayList arrayList, mu1 mu1Var) {
        if (!this.d.h) {
            p(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                ru1 ru1Var = (ru1) arrayList.get(size2);
                if (!ru1Var.m()) {
                    mu1Var.d(ru1Var.d);
                    ru1Var.o(arrayList, mu1Var);
                }
            }
        }
    }

    public final List p(ArrayList arrayList, boolean z) {
        String str;
        if (this.e) {
            return l60.e;
        }
        c(this.c, arrayList);
        if (z) {
            mu1 mu1Var = this.d;
            i41 i41Var = mu1Var.e;
            Object g = i41Var.g(vu1.y);
            if (g == null) {
                g = null;
            }
            ap1 ap1Var = (ap1) g;
            if (ap1Var != null && mu1Var.g && !arrayList.isEmpty()) {
                arrayList.add(b(ap1Var, new n3(ap1Var, 22)));
            }
            zu1 zu1Var = vu1.a;
            if (i41Var.c(zu1Var) && !arrayList.isEmpty() && mu1Var.g) {
                Object g2 = i41Var.g(zu1Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null) {
                    str = (String) wn.h0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new n3(str, 23)));
                }
            }
        }
        return arrayList;
    }
}
