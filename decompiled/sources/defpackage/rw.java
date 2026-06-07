package defpackage;

import android.content.Context;
import com.elixir.loader.ElixirApplication;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rw {
    public final nx a;
    public final eb0 b;

    public rw(ElixirApplication elixirApplication) {
        nx nxVar;
        ox oxVar = sw.b;
        ep0 ep0Var = sw.a[0];
        oxVar.getClass();
        ep0Var.getClass();
        nx nxVar2 = oxVar.e;
        vt vtVar = null;
        if (nxVar2 == null) {
            synchronized (oxVar.d) {
                try {
                    if (oxVar.e == null) {
                        Context applicationContext = elixirApplication.getApplicationContext();
                        j91 j91Var = new j91(n90.SYSTEM, oxVar.a, new j1(10, oxVar, applicationContext));
                        oe0 oe0Var = oxVar.b;
                        applicationContext.getClass();
                        List list = (List) oe0Var.invoke(applicationContext);
                        gv gvVar = oxVar.c;
                        list.getClass();
                        oxVar.e = new nx(j91Var, xn.E(new j(list, vtVar, 14)), new wc0(14), gvVar);
                    }
                    nxVar = oxVar.e;
                    nxVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            nxVar2 = nxVar;
        }
        this.a = nxVar2;
        this.b = new eb0(nxVar2.c, new q42(3, null), 1);
    }

    public final Object a(boolean z, xf xfVar) {
        Object i = this.a.i(new ow(z, null), xfVar);
        if (i == hv.e) {
            return i;
        }
        return od2.a;
    }

    public final Object b(String str, q42 q42Var) {
        Object i = this.a.i(new pw(str, null), q42Var);
        if (i == hv.e) {
            return i;
        }
        return od2.a;
    }
}
