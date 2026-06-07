package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d51 implements uu0, tg2, tg0, cr1 {
    public final y50 e;
    public r51 f;
    public final Bundle g;
    public nu0 h;
    public final k51 i;
    public final String j;
    public final Bundle k;
    public final f51 l = new f51(this);

    public d51(y50 y50Var, r51 r51Var, Bundle bundle, nu0 nu0Var, k51 k51Var, String str, Bundle bundle2) {
        this.e = y50Var;
        this.f = r51Var;
        this.g = bundle;
        this.h = nu0Var;
        this.i = k51Var;
        this.j = str;
        this.k = bundle2;
        new b52(new v3(this, 22));
    }

    public final void a(nu0 nu0Var) {
        f51 f51Var = this.l;
        f51Var.getClass();
        f51Var.k = nu0Var;
        f51Var.b();
    }

    @Override // defpackage.tg0
    public final pg2 c() {
        return this.l.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // defpackage.tg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.k31 d() {
        /*
            r5 = this;
            f51 r0 = r5.l
            r0.getClass()
            k31 r1 = new k31
            r1.<init>()
            wm1 r2 = defpackage.c01.w
            d51 r3 = r0.a
            java.util.LinkedHashMap r4 = r1.a
            r4.put(r2, r3)
            wm1 r2 = defpackage.c01.x
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L23
            wm1 r2 = defpackage.c01.y
            r4.put(r2, r0)
        L23:
            r0 = 0
            y50 r5 = r5.e
            if (r5 == 0) goto L39
            android.content.Context r5 = r5.a
            if (r5 == 0) goto L31
            android.content.Context r5 = r5.getApplicationContext()
            goto L32
        L31:
            r5 = r0
        L32:
            boolean r2 = r5 instanceof android.app.Application
            if (r2 == 0) goto L39
            android.app.Application r5 = (android.app.Application) r5
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r5 == 0) goto L3d
            r0 = r5
        L3d:
            if (r0 == 0) goto L44
            wm1 r5 = defpackage.og2.d
            r4.put(r5, r0)
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d51.d():k31");
    }

    @Override // defpackage.tg2
    public final sg2 e() {
        f51 f51Var = this.l;
        if (f51Var.i) {
            if (f51Var.j.c != nu0.e) {
                k51 k51Var = f51Var.e;
                if (k51Var != null) {
                    String str = f51Var.f;
                    str.getClass();
                    LinkedHashMap linkedHashMap = k51Var.b;
                    sg2 sg2Var = (sg2) linkedHashMap.get(str);
                    if (sg2Var == null) {
                        sg2 sg2Var2 = new sg2();
                        linkedHashMap.put(str, sg2Var2);
                        return sg2Var2;
                    }
                    return sg2Var;
                }
                se.p("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
                return null;
            }
            se.p("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        se.p("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        return null;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof d51)) {
            d51 d51Var = (d51) obj;
            Bundle bundle = d51Var.g;
            if (sn0.r(this.j, d51Var.j) && sn0.r(this.f, d51Var.f) && sn0.r(this.l.j, d51Var.l.j) && sn0.r(f(), d51Var.f())) {
                Bundle bundle2 = this.g;
                if (!sn0.r(bundle2, bundle)) {
                    if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Object obj3 = bundle2.get(str);
                                if (bundle != null) {
                                    obj2 = bundle.get(str);
                                } else {
                                    obj2 = null;
                                }
                                if (!sn0.r(obj3, obj2)) {
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cr1
    public final sl0 f() {
        return (sl0) this.l.h.f;
    }

    @Override // defpackage.uu0
    public final wu0 g() {
        return this.l.j;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = this.f.hashCode() + (this.j.hashCode() * 31);
        Bundle bundle = this.g;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i2 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return f().hashCode() + ((this.l.j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.l.toString();
    }
}
