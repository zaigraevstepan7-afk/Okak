package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b71 {
    public final r22 a = d6.j(c71.c);
    public final r22 b;
    public final yk1 c;
    public final te d;
    public final te e;
    public x61 f;
    public int g;
    public a71 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public b71() {
        r22 j = d6.j(new z61());
        this.b = j;
        this.c = new yk1(j);
        this.d = new te();
        this.e = new te();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(q4 q4Var, a71 a71Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        q4Var.getClass();
        if (a71Var.a == null) {
            if (i != 0) {
                if (i != 1) {
                    linkedHashSet = this.i;
                } else {
                    linkedHashSet = this.j;
                }
            } else {
                linkedHashSet = this.k;
            }
            linkedHashSet.add(a71Var);
            a71Var.a = q4Var;
            ((z61) this.c.e.getValue()).getClass();
            if (i != 0) {
                if (i != 1) {
                    z = this.n;
                } else {
                    z = this.l;
                }
            } else {
                z = this.m;
            }
            a71Var.b(z);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(a71Var);
        q4 q4Var2 = a71Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(q4Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z61 z61Var;
        boolean z6 = true;
        te teVar = this.d;
        if (teVar == null || !teVar.isEmpty()) {
            Iterator it = teVar.iterator();
            while (it.hasNext()) {
                if (((x61) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        te teVar2 = this.e;
        if (teVar2 == null || !teVar2.isEmpty()) {
            Iterator it2 = teVar2.iterator();
            while (it2.hasNext()) {
                if (((x61) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.m != z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.l != z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.n == z3) {
            z6 = false;
        }
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((a71) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((a71) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((a71) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        x61 x61Var = this.f;
        if (x61Var == null) {
            x61Var = c(0);
        }
        x61 x61Var2 = this.f;
        if (x61Var2 == null) {
            x61Var2 = c(0);
        }
        if (sn0.r(x61Var2, x61Var)) {
            if (x61Var2 == null) {
                z61Var = new z61();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = teVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((x61) it6.next()).b;
                }
                Iterator<E> it7 = teVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((x61) it7.next()).b;
                }
                lo loVar = x61Var2.a;
                vv0 v = xn.v();
                wn.d0(arrayList, v);
                v.add(loVar);
                wn.d0(l60.e, v);
                z61Var = new z61(arrayList.size(), xn.s(v));
            }
            r22 r22Var = this.b;
            if (!sn0.r((z61) r22Var.getValue(), z61Var)) {
                r22Var.k(null, z61Var);
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    ((a71) it8.next()).getClass();
                }
                Iterator it9 = linkedHashSet2.iterator();
                while (it9.hasNext()) {
                    ((a71) it9.next()).getClass();
                }
                Iterator it10 = linkedHashSet3.iterator();
                while (it10.hasNext()) {
                    ((a71) it10.next()).getClass();
                }
            }
        }
    }

    public final x61 c(int i) {
        Object obj;
        Object obj2;
        te teVar = this.e;
        te teVar2 = this.d;
        Object obj3 = null;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    Iterator it = teVar2.iterator();
                    while (it.hasNext()) {
                        ((x61) it.next()).getClass();
                    }
                    Iterator it2 = teVar.iterator();
                    while (it2.hasNext()) {
                        ((x61) it2.next()).getClass();
                    }
                    return null;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = teVar2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (((x61) obj2).b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            x61 x61Var = (x61) obj2;
            if (x61Var == null) {
                Iterator it4 = teVar.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((x61) next).b) {
                        obj3 = next;
                        break;
                    }
                }
                return (x61) obj3;
            }
            return x61Var;
        }
        Iterator it5 = teVar2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj = it5.next();
                if (((x61) obj).b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        x61 x61Var2 = (x61) obj;
        if (x61Var2 == null) {
            Iterator it6 = teVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next2 = it6.next();
                if (((x61) next2).b) {
                    obj3 = next2;
                    break;
                }
            }
            return (x61) obj3;
        }
        return x61Var2;
    }
}
