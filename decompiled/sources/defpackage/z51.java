package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z51 {
    public final w51 a;
    public final o12 b = new o12();
    public int c;
    public String d;
    public String e;

    public z51(w51 w51Var) {
        this.a = w51Var;
    }

    public final r51 a(int i) {
        return c(i, this.a, null, false);
    }

    public final r51 b(String str, boolean z) {
        Object obj;
        w51 w51Var;
        str.getClass();
        o12 o12Var = this.b;
        o12Var.getClass();
        Iterator it = ((ts) mv1.E(new y(o12Var, 2))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                r51 r51Var = (r51) obj;
                if (p32.x((String) r51Var.f.e, str, false) || r51Var.f.a(str) != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        r51 r51Var2 = (r51) obj;
        if (r51Var2 == null) {
            if (!z || (w51Var = this.a.g) == null) {
                return null;
            }
            z51 z51Var = w51Var.j;
            z51Var.getClass();
            if (i32.N(str)) {
                return null;
            }
            return z51Var.b(str, true);
        }
        return r51Var2;
    }

    public final r51 c(int i, r51 r51Var, r51 r51Var2, boolean z) {
        o12 o12Var = this.b;
        r51 r51Var3 = (r51) o12Var.b(i);
        if (r51Var2 != null) {
            if (sn0.r(r51Var3, r51Var2) && sn0.r(r51Var3.g, r51Var2.g)) {
                return r51Var3;
            }
            r51Var3 = null;
        } else if (r51Var3 != null) {
            return r51Var3;
        }
        w51 w51Var = this.a;
        if (z) {
            Iterator it = ((ts) mv1.E(new y(o12Var, 2))).iterator();
            while (true) {
                if (it.hasNext()) {
                    r51 r51Var4 = (r51) it.next();
                    if ((r51Var4 instanceof w51) && !r51Var4.equals(r51Var)) {
                        r51Var3 = ((w51) r51Var4).j.c(i, w51Var, r51Var2, true);
                    } else {
                        r51Var3 = null;
                    }
                    if (r51Var3 != null) {
                        break;
                    }
                } else {
                    r51Var3 = null;
                    break;
                }
            }
        }
        if (r51Var3 == null) {
            w51 w51Var2 = w51Var.g;
            if (w51Var2 == null || w51Var2.equals(r51Var)) {
                return null;
            }
            w51 w51Var3 = w51Var.g;
            w51Var3.getClass();
            return w51Var3.j.c(i, w51Var, r51Var2, z);
        }
        return r51Var3;
    }

    public final q51 d(q51 q51Var, ld ldVar, boolean z, r51 r51Var) {
        q51 q51Var2;
        ArrayList arrayList = new ArrayList();
        w51 w51Var = this.a;
        Iterator it = w51Var.iterator();
        while (true) {
            y51 y51Var = (y51) it;
            q51Var2 = null;
            if (!y51Var.hasNext()) {
                break;
            }
            r51 r51Var2 = (r51) y51Var.next();
            if (!sn0.r(r51Var2, r51Var)) {
                q51Var2 = r51Var2.c(ldVar);
            }
            if (q51Var2 != null) {
                arrayList.add(q51Var2);
            }
        }
        q51 q51Var3 = (q51) wn.p0(arrayList);
        w51 w51Var2 = w51Var.g;
        if (w51Var2 != null && z && !w51Var2.equals(r51Var)) {
            q51Var2 = w51Var2.d(ldVar, w51Var);
        }
        return (q51) wn.p0(bf.Q(new q51[]{q51Var, q51Var3, q51Var2}));
    }
}
