package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class w51 extends r51 implements Iterable, xo0 {
    public static final /* synthetic */ int k = 0;
    public final z51 j;

    public w51(b61 b61Var) {
        super(b61Var);
        this.j = new z51(this);
    }

    @Override // defpackage.r51
    public final q51 c(ld ldVar) {
        q51 c = super.c(ldVar);
        z51 z51Var = this.j;
        z51Var.getClass();
        return z51Var.d(c, ldVar, false, z51Var.a);
    }

    public final q51 d(ld ldVar, r51 r51Var) {
        return this.j.d(super.c(ldVar), ldVar, true, r51Var);
    }

    public final q51 e(String str, boolean z, r51 r51Var) {
        q51 q51Var;
        z51 z51Var = this.j;
        z51Var.getClass();
        w51 w51Var = z51Var.a;
        q51 a = w51Var.f.a(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = w51Var.iterator();
        while (true) {
            y51 y51Var = (y51) it;
            q51Var = null;
            if (!y51Var.hasNext()) {
                break;
            }
            r51 r51Var2 = (r51) y51Var.next();
            if (!sn0.r(r51Var2, r51Var)) {
                if (r51Var2 instanceof w51) {
                    q51Var = ((w51) r51Var2).e(str, false, w51Var);
                } else {
                    r51Var2.getClass();
                    q51Var = r51Var2.f.a(str);
                }
            }
            if (q51Var != null) {
                arrayList.add(q51Var);
            }
        }
        q51 q51Var2 = (q51) wn.p0(arrayList);
        w51 w51Var2 = w51Var.g;
        if (w51Var2 != null && z && !w51Var2.equals(r51Var)) {
            q51Var = w51Var2.e(str, true, w51Var);
        }
        return (q51) wn.p0(bf.Q(new q51[]{a, q51Var2, q51Var}));
    }

    @Override // defpackage.r51
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof w51) && super.equals(obj)) {
                z51 z51Var = this.j;
                int e = z51Var.b.e();
                z51 z51Var2 = ((w51) obj).j;
                if (e == z51Var2.b.e() && z51Var.c == z51Var2.c) {
                    o12 o12Var = z51Var.b;
                    o12Var.getClass();
                    Iterator it = ((ts) mv1.E(new y(o12Var, 2))).iterator();
                    while (it.hasNext()) {
                        r51 r51Var = (r51) it.next();
                        if (!r51Var.equals(z51Var2.b.b(r51Var.f.a))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.r51
    public final int hashCode() {
        z51 z51Var = this.j;
        int i = z51Var.c;
        o12 o12Var = z51Var.b;
        int e = o12Var.e();
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 31) + o12Var.c(i2)) * 31) + ((r51) o12Var.f(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        z51 z51Var = this.j;
        z51Var.getClass();
        return new y51(z51Var);
    }

    @Override // defpackage.r51
    public final String toString() {
        r51 r51Var;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        z51 z51Var = this.j;
        String str = z51Var.e;
        z51Var.getClass();
        if (str != null && !i32.N(str)) {
            r51Var = z51Var.b(str, true);
        } else {
            r51Var = null;
        }
        if (r51Var == null) {
            r51Var = z51Var.a(z51Var.c);
        }
        sb.append(" startDestination=");
        if (r51Var == null) {
            String str2 = z51Var.e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = z51Var.d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(z51Var.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(r51Var.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
