package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x51 extends s51 {
    public final h71 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(h71 h71Var, String str) {
        super(h71Var.b(hp.z(b61.class)), null);
        h71Var.getClass();
        this.h = new ArrayList();
        this.f = h71Var;
        this.g = str;
    }

    public final w51 c() {
        int hashCode;
        w51 w51Var = (w51) super.a();
        ArrayList arrayList = this.h;
        arrayList.getClass();
        z51 z51Var = w51Var.j;
        z51Var.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r51 r51Var = (r51) it.next();
            if (r51Var != null) {
                o12 o12Var = z51Var.b;
                w51 w51Var2 = z51Var.a;
                u51 u51Var = w51Var2.f;
                u51 u51Var2 = r51Var.f;
                int i = u51Var2.a;
                String str = (String) u51Var2.e;
                if (i == 0 && str == null) {
                    se.h("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) u51Var.e;
                if (str2 != null && sn0.r(str, str2)) {
                    y61.s("Destination ", r51Var, " cannot have the same route as graph ", w51Var2);
                    return null;
                }
                if (i != u51Var.a) {
                    r51 r51Var2 = (r51) o12Var.b(i);
                    if (r51Var2 == r51Var) {
                        continue;
                    } else if (r51Var.g == null) {
                        if (r51Var2 != null) {
                            r51Var2.g = null;
                        }
                        r51Var.g = w51Var2;
                        o12Var.d(u51Var2.a, r51Var);
                    } else {
                        se.p("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                } else {
                    y61.s("Destination ", r51Var, " cannot have the same id as graph ", w51Var2);
                    return null;
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (this.b != null) {
                se.p("You must set a start destination route");
                return null;
            }
            se.p("You must set a start destination id");
            return null;
        }
        w51 w51Var3 = z51Var.a;
        if (str3 == null) {
            hashCode = 0;
        } else {
            if (!str3.equals((String) w51Var3.f.e)) {
                if (!i32.N(str3)) {
                    int i2 = r51.i;
                    hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
                } else {
                    se.h("Cannot have an empty start destination route");
                }
            } else {
                y61.s("Start destination ", str3, " cannot use the same route as the graph ", w51Var3);
            }
            return w51Var;
        }
        z51Var.c = hashCode;
        z51Var.e = str3;
        return w51Var;
    }
}
