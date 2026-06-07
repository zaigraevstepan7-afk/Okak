package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class fr1 {
    public static final float a = 0.38f;
    public static ij0 b;
    public static ij0 c;

    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            ll0.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + AbstractJsonLexerKt.END_LIST);
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = d92.c;
        return j;
    }

    public static final void b(int i, int i2) {
        String i3;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            i3 = "Both size " + i + " and step " + i2 + " must be greater than zero.";
        } else {
            i3 = l90.i("size ", i, " must be greater than zero.");
        }
        se.e(i3);
    }

    public static final long c(int i, long j) {
        int i2;
        int i3 = d92.c;
        int i4 = (int) (j >> 32);
        int i5 = 0;
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i2 > i) {
            i2 = i;
        }
        int i6 = (int) (4294967295L & j);
        if (i6 >= 0) {
            i5 = i6;
        }
        if (i5 <= i) {
            i = i5;
        }
        if (i2 == i4 && i == i6) {
            return j;
        }
        return a(i2, i);
    }

    public static final o41 d(va0 va0Var, Object obj, xu xuVar, ur urVar, int i, int i2) {
        int i3 = 2;
        if ((i2 & 2) != 0) {
            xuVar = j60.e;
        }
        boolean h = urVar.h(xuVar) | urVar.h(va0Var);
        Object L = urVar.L();
        vt vtVar = null;
        Object obj2 = or.a;
        if (h || L == obj2) {
            L = new iu1(xuVar, va0Var, vtVar, i3);
            urVar.h0(L);
        }
        se0 se0Var = (se0) L;
        Object L2 = urVar.L();
        if (L2 == obj2) {
            L2 = k(obj);
            urVar.h0(L2);
        }
        o41 o41Var = (o41) L2;
        boolean h2 = urVar.h(se0Var);
        Object L3 = urVar.L();
        if (h2 || L3 == obj2) {
            L3 = new y02(se0Var, o41Var, vtVar, i3);
            urVar.h0(L3);
        }
        bf.j(va0Var, xuVar, (se0) L3, urVar);
        return o41Var;
    }

    public static final o41 e(p22 p22Var, ur urVar) {
        return d(p22Var, p22Var.getValue(), j60.e, urVar, 0, 0);
    }

    public static x42 f(long j, long j2, long j3, long j4, long j5, long j6, ur urVar) {
        long j7 = co.f;
        long e = oo.e(mp0.t0, urVar);
        long b2 = co.b(oo.e(mp0.W, urVar), mp0.X);
        y22 y22Var = oo.a;
        long t = go.t(b2, ((mo) urVar.j(y22Var)).p);
        long e2 = oo.e(mp0.a0, urVar);
        float f = mp0.b0;
        return new x42(j, j2, j7, j3, j4, j5, e, j6, t, go.t(co.b(e2, f), ((mo) urVar.j(y22Var)).p), j7, go.t(co.b(oo.e(mp0.Y, urVar), mp0.Z), ((mo) urVar.j(y22Var)).p), go.t(co.b(oo.e(mp0.c0, urVar), mp0.d0), ((mo) urVar.j(y22Var)).p), go.t(co.b(oo.e(mp0.g0, urVar), f), ((mo) urVar.j(y22Var)).p), go.t(co.b(oo.e(mp0.h0, urVar), f), ((mo) urVar.j(y22Var)).p), go.t(co.b(oo.e(mp0.e0, urVar), mp0.f0), ((mo) urVar.j(y22Var)).p));
    }

    public static final q41 g() {
        ld ldVar = x02.b;
        q41 q41Var = (q41) ldVar.g();
        if (q41Var == null) {
            q41 q41Var2 = new q41(new tr[0]);
            ldVar.q(q41Var2);
            return q41Var2;
        }
        return q41Var;
    }

    public static final j00 h(de0 de0Var) {
        ld ldVar = x02.a;
        return new j00(de0Var, null);
    }

    public static final j00 i(de0 de0Var, w02 w02Var) {
        ld ldVar = x02.a;
        return new j00(de0Var, w02Var);
    }

    public static final boolean j(jh1 jh1Var) {
        MotionEvent a2;
        List list = jh1Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((qh1) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = jh1Var.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = jh1Var.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static je1 k(Object obj) {
        return new je1(obj, xl1.o);
    }

    public static void l(i82 i82Var, z62 z62Var, w82 w82Var, iq0 iq0Var, r82 r82Var, boolean z, c91 c91Var) {
        pl1 pl1Var;
        if (z) {
            int d = c91Var.d(d92.e(i82Var.b));
            String str = e72.a;
            if (d < w82Var.a.a.f.length()) {
                pl1Var = w82Var.b(d);
            } else if (d != 0) {
                pl1Var = w82Var.b(d - 1);
            } else {
                pl1Var = new pl1(0.0f, 0.0f, 1.0f, (int) (new en0(e72.b(z62Var.b, z62Var.g, z62Var.h)).a & 4294967295L));
            }
            float f = pl1Var.b;
            float f2 = pl1Var.a;
            long Q = iq0Var.Q((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (Q >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (Q & 4294967295L));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = pl1Var.c - f2;
            float f4 = pl1Var.d - f;
            pl1 e = hp.e(floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            if (sn0.r((r82) r82Var.a.b.get(), r82Var)) {
                r82Var.b.g(e);
            }
        }
    }

    public static df2 m(String str) {
        String group;
        String str2;
        if (str != null && !i32.N(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        if (matcher.group(4) != null) {
                            str2 = matcher.group(4);
                        } else {
                            str2 = "";
                        }
                        str2.getClass();
                        return new df2(parseInt, parseInt2, parseInt3, str2);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static LinkedHashSet n(Set set, d51 d51Var) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tz0.c0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(d51Var);
        return linkedHashSet;
    }

    public static final void o(Bundle bundle, String str, List list) {
        ArrayList<String> arrayList;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = new ArrayList<>(list);
        }
        bundle.putStringArrayList(str, arrayList);
    }

    public static final o41 p(Object obj, ur urVar) {
        Object L = urVar.L();
        if (L == or.a) {
            L = k(obj);
            urVar.h0(L);
        }
        o41 o41Var = (o41) L;
        o41Var.setValue(obj);
        return o41Var;
    }

    public static Set q(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(tz0.c0(objArr.length));
                for (Object obj : objArr) {
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(objArr[0]);
            singleton.getClass();
            return singleton;
        }
        return p60.e;
    }

    public static final zf r(de0 de0Var) {
        return new zf(new uw0(de0Var, null), 2);
    }

    public static final hm0 s(yl0 yl0Var) {
        return new hm0(yl0Var.a, yl0Var.b, yl0Var.c, yl0Var.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [oe0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void t(qz qzVar, Object obj, oe0 oe0Var) {
        a81 a81Var;
        boolean z;
        boolean z2;
        if (!((d21) qzVar).e.r) {
            kl0.b("visitAncestors called on an unattached node");
        }
        d21 d21Var = ((d21) qzVar).e.i;
        ar0 M = hp.M(qzVar);
        while (M != null) {
            if ((M.J.f.h & 262144) != 0) {
                while (d21Var != null) {
                    if ((d21Var.g & 262144) != 0) {
                        rz rzVar = d21Var;
                        ?? r4 = 0;
                        while (rzVar != 0) {
                            boolean z3 = true;
                            if (rzVar instanceof ub2) {
                                ub2 ub2Var = (ub2) rzVar;
                                if (obj.equals(ub2Var.m())) {
                                    z3 = ((Boolean) oe0Var.invoke(ub2Var)).booleanValue();
                                }
                                if (!z3) {
                                    return;
                                }
                            } else {
                                if ((rzVar.g & 262144) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && (rzVar instanceof rz)) {
                                    d21 d21Var2 = rzVar.t;
                                    int i = 0;
                                    rzVar = rzVar;
                                    r4 = r4;
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 262144) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            i++;
                                            r4 = r4;
                                            if (i == 1) {
                                                rzVar = d21Var2;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r4.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r4.b(d21Var2);
                                            }
                                        }
                                        d21Var2 = d21Var2.j;
                                        rzVar = rzVar;
                                        r4 = r4;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            rzVar = hp.l(r4);
                        }
                    }
                    d21Var = d21Var.i;
                }
            }
            M = M.v();
            if (M != null && (a81Var = M.J) != null) {
                d21Var = a81Var.e;
            } else {
                d21Var = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ub2, qz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [oe0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [d21] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [d21] */
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
    public static final void u(ub2 ub2Var, oe0 oe0Var) {
        a81 a81Var;
        boolean z;
        boolean z2;
        d21 d21Var = (d21) ub2Var;
        if (!d21Var.e.r) {
            kl0.b("visitAncestors called on an unattached node");
        }
        d21 d21Var2 = d21Var.e.i;
        ar0 M = hp.M(ub2Var);
        while (M != null) {
            if ((M.J.f.h & 262144) != 0) {
                while (d21Var2 != null) {
                    if ((d21Var2.g & 262144) != 0) {
                        rz rzVar = d21Var2;
                        ?? r5 = 0;
                        while (rzVar != 0) {
                            boolean z3 = true;
                            if (rzVar instanceof ub2) {
                                ub2 ub2Var2 = (ub2) rzVar;
                                if (sn0.r(ub2Var.m(), ub2Var2.m()) && ub2Var.getClass() == ub2Var2.getClass()) {
                                    z3 = ((Boolean) oe0Var.invoke(ub2Var2)).booleanValue();
                                }
                                if (!z3) {
                                    return;
                                }
                            } else {
                                if ((rzVar.g & 262144) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && (rzVar instanceof rz)) {
                                    d21 d21Var3 = rzVar.t;
                                    int i = 0;
                                    rzVar = rzVar;
                                    r5 = r5;
                                    while (d21Var3 != null) {
                                        if ((d21Var3.g & 262144) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                rzVar = d21Var3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r5.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r5.b(d21Var3);
                                            }
                                        }
                                        d21Var3 = d21Var3.j;
                                        rzVar = rzVar;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            rzVar = hp.l(r5);
                        }
                    }
                    d21Var2 = d21Var2.i;
                }
            }
            M = M.v();
            if (M != null && (a81Var = M.J) != null) {
                d21Var2 = a81Var.e;
            } else {
                d21Var2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void v(qz qzVar, String str, oe0 oe0Var) {
        tb2 tb2Var;
        if (!((d21) qzVar).e.r) {
            kl0.b("visitSubtreeIf called on an unattached node");
        }
        q41 q41Var = new q41(new d21[16]);
        d21 d21Var = ((d21) qzVar).e;
        d21 d21Var2 = d21Var.j;
        if (d21Var2 == null) {
            hp.i(q41Var, d21Var);
        } else {
            q41Var.b(d21Var2);
        }
        while (true) {
            int i = q41Var.g;
            if (i != 0) {
                d21 d21Var3 = (d21) q41Var.k(i - 1);
                if ((d21Var3.h & 262144) != 0) {
                    for (d21 d21Var4 = d21Var3; d21Var4 != null && d21Var4.r; d21Var4 = d21Var4.j) {
                        if ((d21Var4.g & 262144) != 0) {
                            rz rzVar = d21Var4;
                            ?? r6 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof ub2) {
                                    ub2 ub2Var = (ub2) rzVar;
                                    if (str.equals(ub2Var.m())) {
                                        tb2Var = (tb2) oe0Var.invoke(ub2Var);
                                    } else {
                                        tb2Var = tb2.e;
                                    }
                                    if (tb2Var != tb2.g) {
                                        if (tb2Var == tb2.f) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((rzVar.g & 262144) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var5 = rzVar.t;
                                    int i2 = 0;
                                    rzVar = rzVar;
                                    r6 = r6;
                                    while (d21Var5 != null) {
                                        if ((d21Var5.g & 262144) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                rzVar = d21Var5;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r6.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r6.b(d21Var5);
                                            }
                                        }
                                        d21Var5 = d21Var5.j;
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
                hp.i(q41Var, d21Var3);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void w(ub2 ub2Var, oe0 oe0Var) {
        tb2 tb2Var;
        d21 d21Var = (d21) ub2Var;
        if (!d21Var.e.r) {
            kl0.b("visitSubtreeIf called on an unattached node");
        }
        q41 q41Var = new q41(new d21[16]);
        d21 d21Var2 = d21Var.e;
        d21 d21Var3 = d21Var2.j;
        if (d21Var3 == null) {
            hp.i(q41Var, d21Var2);
        } else {
            q41Var.b(d21Var3);
        }
        while (true) {
            int i = q41Var.g;
            if (i != 0) {
                d21 d21Var4 = (d21) q41Var.k(i - 1);
                if ((d21Var4.h & 262144) != 0) {
                    for (d21 d21Var5 = d21Var4; d21Var5 != null && d21Var5.r; d21Var5 = d21Var5.j) {
                        if ((d21Var5.g & 262144) != 0) {
                            rz rzVar = d21Var5;
                            ?? r7 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof ub2) {
                                    ub2 ub2Var2 = (ub2) rzVar;
                                    if (sn0.r(ub2Var.m(), ub2Var2.m()) && ub2Var.getClass() == ub2Var2.getClass()) {
                                        tb2Var = (tb2) oe0Var.invoke(ub2Var2);
                                    } else {
                                        tb2Var = tb2.e;
                                    }
                                    if (tb2Var != tb2.g) {
                                        if (tb2Var == tb2.f) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((rzVar.g & 262144) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var6 = rzVar.t;
                                    int i2 = 0;
                                    rzVar = rzVar;
                                    r7 = r7;
                                    while (d21Var6 != null) {
                                        if ((d21Var6.g & 262144) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
                                                rzVar = d21Var6;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r7.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r7.b(d21Var6);
                                            }
                                        }
                                        d21Var6 = d21Var6.j;
                                        rzVar = rzVar;
                                        r7 = r7;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                rzVar = hp.l(r7);
                            }
                        }
                    }
                }
                hp.i(q41Var, d21Var4);
            } else {
                return;
            }
        }
    }
}
