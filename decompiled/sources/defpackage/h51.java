package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h51 {
    public final wm1 a;
    public final r22 b;
    public final r22 c;
    public boolean d;
    public final yk1 e;
    public final yk1 f;
    public final g71 g;
    public final /* synthetic */ c61 h;

    public h51(c61 c61Var, g71 g71Var) {
        g71Var.getClass();
        this.h = c61Var;
        this.a = new wm1(11);
        r22 j = d6.j(l60.e);
        this.b = j;
        r22 j2 = d6.j(p60.e);
        this.c = j2;
        this.e = new yk1(j);
        this.f = new yk1(j2);
        this.g = g71Var;
    }

    public final void a(d51 d51Var) {
        d51Var.getClass();
        synchronized (this.a) {
            r22 r22Var = this.b;
            r22Var.k(null, wn.r0((Collection) r22Var.getValue(), d51Var));
        }
    }

    public final d51 b(r51 r51Var, Bundle bundle) {
        j51 j51Var = this.h.b;
        j51Var.getClass();
        return wc0.g(j51Var.a.c, r51Var, bundle, j51Var.h(), j51Var.o);
    }

    public final void c(d51 d51Var) {
        k51 k51Var;
        d51Var.getClass();
        j51 j51Var = this.h.b;
        r22 r22Var = j51Var.h;
        String str = d51Var.j;
        LinkedHashMap linkedHashMap = j51Var.w;
        boolean r = sn0.r(linkedHashMap.get(d51Var), Boolean.TRUE);
        r22 r22Var2 = this.c;
        Set set = (Set) r22Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tz0.c0(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && sn0.r(obj, d51Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        r22Var2.k(null, linkedHashSet);
        linkedHashMap.remove(d51Var);
        te teVar = j51Var.f;
        if (!teVar.contains(d51Var)) {
            j51Var.q(d51Var);
            if (d51Var.l.j.c.compareTo(nu0.g) >= 0) {
                d51Var.a(nu0.e);
            }
            if (!teVar.isEmpty()) {
                Iterator it = teVar.iterator();
                while (it.hasNext()) {
                    if (sn0.r(((d51) it.next()).j, str)) {
                        break;
                    }
                }
            }
            if (!r && (k51Var = j51Var.o) != null) {
                str.getClass();
                sg2 sg2Var = (sg2) k51Var.b.remove(str);
                if (sg2Var != null) {
                    sg2Var.a();
                }
            }
            j51Var.r();
            ArrayList o = j51Var.o();
            r22Var.getClass();
            r22Var.k(null, o);
            return;
        }
        if (!this.d) {
            j51Var.r();
            r22 r22Var3 = j51Var.g;
            ArrayList arrayList = new ArrayList(teVar);
            r22Var3.getClass();
            r22Var3.k(null, arrayList);
            ArrayList o2 = j51Var.o();
            r22Var.getClass();
            r22Var.k(null, o2);
        }
    }

    public final void d(d51 d51Var, boolean z) {
        j51 j51Var = this.h.b;
        j1 j1Var = new j1(this, d51Var, z);
        j51Var.getClass();
        g71 b = j51Var.s.b(d51Var.f.e);
        j51Var.w.put(d51Var, Boolean.valueOf(z));
        if (b.equals(this.g)) {
            t01 t01Var = j51Var.v;
            if (t01Var != null) {
                t01Var.invoke(d51Var);
                j1Var.invoke();
                return;
            }
            te teVar = j51Var.f;
            int indexOf = teVar.indexOf(d51Var);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + d51Var + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            if (i != teVar.g) {
                j51Var.l(((d51) teVar.get(i)).f.f.a, true, false);
            }
            j51.n(j51Var, d51Var);
            j1Var.invoke();
            j51Var.b.invoke();
            j51Var.b();
            return;
        }
        Object obj = j51Var.t.get(b);
        obj.getClass();
        ((h51) obj).d(d51Var, z);
    }

    public final void e(d51 d51Var, boolean z) {
        Object obj;
        r22 r22Var = this.c;
        Iterable iterable = (Iterable) r22Var.getValue();
        boolean z2 = iterable instanceof Collection;
        yk1 yk1Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((d51) it.next()) == d51Var) {
                    Iterable iterable2 = (Iterable) yk1Var.e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((d51) it2.next()) == d51Var) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        r22Var.k(null, fr1.n((Set) r22Var.getValue(), d51Var));
        r22 r22Var2 = yk1Var.e;
        r22 r22Var3 = yk1Var.e;
        List list = (List) r22Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                d51 d51Var2 = (d51) obj;
                if (!sn0.r(d51Var2, d51Var) && ((List) r22Var3.getValue()).lastIndexOf(d51Var2) < ((List) r22Var3.getValue()).lastIndexOf(d51Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        d51 d51Var3 = (d51) obj;
        if (d51Var3 != null) {
            r22Var.k(null, fr1.n((Set) r22Var.getValue(), d51Var3));
        }
        d(d51Var, z);
    }

    public final void f(d51 d51Var) {
        d51Var.getClass();
        j51 j51Var = this.h.b;
        j51Var.getClass();
        g71 b = j51Var.s.b(d51Var.f.e);
        if (b.equals(this.g)) {
            oe0 oe0Var = j51Var.u;
            if (oe0Var != null) {
                oe0Var.invoke(d51Var);
                a(d51Var);
                return;
            } else {
                Log.i("NavController", "Ignoring add of destination " + d51Var.f + " outside of the call to navigate(). ");
                return;
            }
        }
        Object obj = j51Var.t.get(b);
        if (obj != null) {
            ((h51) obj).f(d51Var);
        } else {
            y61.f(l90.p(new StringBuilder("NavigatorBackStack for "), d51Var.f.e, " should already be created"));
        }
    }
}
