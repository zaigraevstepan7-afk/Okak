package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fm1 {
    public Set a;
    public bs b;
    public final q41 c;
    public j41 d;
    public q41 e;
    public final q41 f;
    public final q41 g;
    public j41 h;
    public i41 i;
    public ArrayList j;
    public j41 k;

    public fm1() {
        q41 q41Var = new q41(new hm1[16]);
        this.c = q41Var;
        j41 j41Var = tr1.a;
        this.d = new j41();
        this.e = q41Var;
        this.f = new q41(new Object[16]);
        this.g = new q41(new de0[16]);
    }

    public static final boolean f(hm1 hm1Var, q41 q41Var) {
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            gm1 gm1Var = ((hm1) objArr[i2]).a;
            if (gm1Var instanceof mf1) {
                q41 q41Var2 = ((mf1) gm1Var).f;
                if (q41Var2.j(hm1Var) || f(hm1Var, q41Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        q41 q41Var = this.c;
        q41Var.g();
        this.d.b();
        this.e = q41Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    gm1 gm1Var = (gm1) it.next();
                    it.remove();
                    gm1Var.a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void c() {
        Set set = this.a;
        if (set != null) {
            this.k = null;
            q41 q41Var = this.f;
            int i = 9;
            if (q41Var.g != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    j41 j41Var = this.h;
                    int i2 = q41Var.g;
                    while (true) {
                        i2--;
                        if (-1 >= i2) {
                            break;
                        }
                        Object obj = q41Var.e[i2];
                        try {
                            if (obj instanceof hm1) {
                                gm1 gm1Var = ((hm1) obj).a;
                                set.remove(gm1Var);
                                gm1Var.d();
                            }
                            if (obj instanceof yq) {
                                if (j41Var != null && j41Var.c(obj)) {
                                    ((yq) obj).a();
                                } else {
                                    ((yq) obj).b();
                                }
                            }
                        } catch (Throwable th) {
                            bs bsVar = this.b;
                            if (bsVar != null) {
                                qo.e0(th, new j1(i, bsVar, obj));
                            }
                            throw th;
                        }
                    }
                } finally {
                }
            }
            q41 q41Var2 = this.c;
            if (q41Var2.g != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = this.a;
                    if (set2 != null) {
                        Object[] objArr = q41Var2.e;
                        int i3 = q41Var2.g;
                        for (int i4 = 0; i4 < i3; i4++) {
                            hm1 hm1Var = (hm1) objArr[i4];
                            gm1 gm1Var2 = hm1Var.a;
                            set2.remove(gm1Var2);
                            try {
                                gm1Var2.e();
                            } catch (Throwable th2) {
                                bs bsVar2 = this.b;
                                if (bsVar2 != null) {
                                    qo.e0(th2, new j1(i, bsVar2, hm1Var));
                                }
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void d() {
        q41 q41Var = this.g;
        if (q41Var.g != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = q41Var.e;
                int i = q41Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    ((de0) objArr[i2]).invoke();
                }
                q41Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(hm1 hm1Var) {
        if (this.d.c(hm1Var)) {
            this.d.l(hm1Var);
            if (!this.e.j(hm1Var)) {
                q41 q41Var = this.c;
                if (!q41Var.j(hm1Var)) {
                    f(hm1Var, q41Var);
                }
            }
            Set set = this.a;
            if (set != null) {
                set.add(hm1Var.a);
                return;
            }
            return;
        }
        j41 j41Var = this.k;
        if (j41Var != null && j41Var.c(hm1Var)) {
            return;
        }
        this.f.b(hm1Var);
    }

    public final void g(Set set, bs bsVar) {
        a();
        this.a = set;
        this.b = bsVar;
    }
}
