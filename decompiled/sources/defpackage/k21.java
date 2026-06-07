package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k21 {
    public final ArrayList a;

    public k21(np1 np1Var, np1 np1Var2) {
        xd1 xd1Var;
        Throwable th;
        float d;
        float f;
        float H;
        xd1 xd1Var2;
        xd1 xd1Var3;
        o01 E = hp.E(new ua(np1Var.b, np1Var.c), np1Var);
        o01 E2 = hp.E(new ua(np1Var2.b, np1Var2.c), np1Var2);
        List list = E.g;
        List list2 = E2.g;
        list.getClass();
        list2.getClass();
        vv0 v = xn.v();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((rj1) list.get(i)).b instanceof c90) {
                v.add(list.get(i));
            }
        }
        vv0 s = xn.s(v);
        vv0 v2 = xn.v();
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((rj1) list2.get(i2)).b instanceof c90) {
                v2.add(list2.get(i2));
            }
        }
        vv0 s2 = xn.s(v2);
        if (s.a() > s2.a()) {
            xd1Var = new xd1(vn.s(s2, s), s2);
        } else {
            xd1Var = new xd1(s, vn.s(s, s2));
        }
        List list3 = (List) xd1Var.e;
        List list4 = (List) xd1Var.f;
        vv0 v3 = xn.v();
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3 && i3 != list4.size(); i3++) {
            v3.add(new xd1(Float.valueOf(((rj1) list3.get(i3)).a), Float.valueOf(((rj1) list4.get(i3)).a)));
        }
        xd1[] xd1VarArr = (xd1[]) xn.s(v3).toArray(new xd1[0]);
        c20 c20Var = new c20((xd1[]) Arrays.copyOf(xd1VarArr, xd1VarArr.length));
        m31 m31Var = c20Var.a;
        m31 m31Var2 = c20Var.b;
        float H2 = go.H(m31Var, m31Var2, 0.0f);
        ArrayList arrayList = E2.f;
        if (0.0f <= H2 && H2 <= 1.0f) {
            if (H2 < 1.0E-4f) {
                th = null;
            } else {
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        n01 n01Var = (n01) it.next();
                        float f2 = n01Var.c;
                        if (H2 <= n01Var.d && f2 <= H2) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                xd1 a = ((n01) arrayList.get(i4)).a(H2);
                n01 n01Var2 = (n01) a.e;
                ArrayList G = xn.G(((n01) a.f).a);
                int size4 = arrayList.size();
                for (int i5 = 1; i5 < size4; i5++) {
                    G.add(((n01) arrayList.get((i5 + i4) % arrayList.size())).a);
                }
                th = null;
                G.add(n01Var2.a);
                m31 m31Var3 = new m31(arrayList.size() + 2);
                int size5 = arrayList.size() + 2;
                for (int i6 = 0; i6 < size5; i6++) {
                    if (i6 == 0) {
                        d = 0.0f;
                    } else if (i6 == arrayList.size() + 1) {
                        d = 1.0f;
                    } else {
                        d = be2.d(((n01) arrayList.get(((i4 + i6) - 1) % arrayList.size())).d - H2, 1.0f);
                    }
                    m31Var3.a(d);
                }
                vv0 v4 = xn.v();
                int size6 = list2.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    v4.add(new rj1(be2.d(((rj1) list2.get(i7)).a - H2, 1.0f), ((rj1) list2.get(i7)).b));
                }
                E2 = new o01(E2.e, xn.s(v4), G, m31Var3);
            }
            ArrayList arrayList2 = new ArrayList();
            n01 n01Var3 = (n01) wn.i0(0, E);
            n01 n01Var4 = (n01) wn.i0(0, E2);
            int i8 = 1;
            int i9 = 1;
            while (n01Var3 != null && n01Var4 != null) {
                if (i9 == E.f.size()) {
                    f = 1.0f;
                } else {
                    f = n01Var3.d;
                }
                if (i8 == E2.f.size()) {
                    H = 1.0f;
                } else {
                    H = go.H(m31Var2, m31Var, be2.d(n01Var4.d + H2, 1.0f));
                }
                float min = Math.min(f, H);
                float f3 = 1.0E-6f + min;
                if (f > f3) {
                    xd1Var2 = n01Var3.a(min);
                } else {
                    xd1 xd1Var4 = new xd1(n01Var3, wn.i0(i9, E));
                    i9++;
                    xd1Var2 = xd1Var4;
                }
                n01 n01Var5 = (n01) xd1Var2.e;
                n01Var3 = (n01) xd1Var2.f;
                if (H > f3) {
                    xd1Var3 = n01Var4.a(be2.d(go.H(m31Var, m31Var2, min) - H2, 1.0f));
                } else {
                    xd1 xd1Var5 = new xd1(n01Var4, wn.i0(i8, E2));
                    i8++;
                    xd1Var3 = xd1Var5;
                }
                n01 n01Var6 = (n01) xd1Var3.e;
                n01Var4 = (n01) xd1Var3.f;
                arrayList2.add(new xd1(n01Var5.a, n01Var6.a));
            }
            if (n01Var3 == null && n01Var4 == null) {
                this.a = arrayList2;
                return;
            } else {
                se.h("Expected both Polygon's Cubic to be fully matched");
                throw th;
            }
        }
        se.h("Cutting point is expected to be between 0 and 1");
        throw null;
    }
}
