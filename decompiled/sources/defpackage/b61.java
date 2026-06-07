package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@f71("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb61;", "Lg71;", "Lw51;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class b61 extends g71 {
    public final h71 c;

    public b61(h71 h71Var) {
        h71Var.getClass();
        this.c = h71Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, wl1] */
    @Override // defpackage.g71
    public final void d(List list, l61 l61Var) {
        r51 r51Var;
        Bundle bundle;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d51 d51Var = (d51) it.next();
            r51 r51Var2 = d51Var.f;
            r51Var2.getClass();
            w51 w51Var = (w51) r51Var2;
            u51 u51Var = w51Var.f;
            ?? obj = new Object();
            obj.e = d51Var.l.a();
            z51 z51Var = w51Var.j;
            int i = z51Var.c;
            String str = z51Var.e;
            if (i == 0 && str == null) {
                u51Var.getClass();
                String valueOf = String.valueOf(u51Var.a);
                valueOf.getClass();
                if (z51Var.a.f.a == 0) {
                    valueOf = "the root navigation";
                }
                y61.f("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            int i2 = 0;
            if (str != null) {
                r51Var = z51Var.b(str, false);
            } else {
                r51Var = (r51) z51Var.b.b(i);
            }
            if (r51Var == null) {
                if (z51Var.d == null) {
                    String str2 = z51Var.e;
                    if (str2 == null) {
                        str2 = String.valueOf(z51Var.c);
                    }
                    z51Var.d = str2;
                }
                String str3 = z51Var.d;
                str3.getClass();
                se.h(l90.m("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            u51 u51Var2 = r51Var.f;
            if (str != null) {
                if (!str.equals((String) u51Var2.e)) {
                    q51 a = u51Var2.a(str);
                    if (a != null) {
                        bundle = a.f;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                        v.putAll(bundle);
                        Bundle bundle2 = (Bundle) obj.e;
                        if (bundle2 != null) {
                            v.putAll(bundle2);
                        }
                        obj.e = v;
                    }
                }
                if (r51Var.b().isEmpty()) {
                    continue;
                } else {
                    ArrayList J = go.J(r51Var.b(), new a61(obj, i2));
                    if (!J.isEmpty()) {
                        se.q("Cannot navigate to startDestination ", r51Var, ". Missing required arguments [", J, 93);
                        return;
                    }
                }
            }
            this.c.b(r51Var.e).d(xn.E(b().b(r51Var, r51Var.a((Bundle) obj.e))), l61Var);
        }
    }

    @Override // defpackage.g71
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public w51 a() {
        return new w51(this);
    }
}
