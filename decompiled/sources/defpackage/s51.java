package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class s51 {
    public final g71 a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();

    public s51(g71 g71Var, String str) {
        this.a = g71Var;
        this.b = str;
    }

    public r51 a() {
        r51 b = b();
        b.getClass();
        u51 u51Var = b.f;
        Iterator it = this.c.entrySet().iterator();
        if (!it.hasNext()) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                final p51 p51Var = (p51) it2.next();
                p51Var.getClass();
                u51Var.getClass();
                final int i = 0;
                ArrayList J = go.J((LinkedHashMap) u51Var.d, new oe0() { // from class: t51
                    @Override // defpackage.oe0
                    public final Object invoke(Object obj) {
                        boolean contains;
                        int i2 = i;
                        p51 p51Var2 = p51Var;
                        String str = (String) obj;
                        switch (i2) {
                            case 0:
                                str.getClass();
                                contains = p51Var2.c().contains(str);
                                break;
                            default:
                                str.getClass();
                                contains = p51Var2.c().contains(str);
                                break;
                        }
                        return Boolean.valueOf(!contains);
                    }
                });
                if (J.isEmpty()) {
                    ((ArrayList) u51Var.c).add(p51Var);
                } else {
                    throw new IllegalArgumentException(("Deep link " + p51Var.a + " can't be used to open destination " + ((r51) u51Var.b) + ".\nFollowing required arguments are missing: " + J).toString());
                }
            }
            Iterator it3 = this.e.entrySet().iterator();
            if (!it3.hasNext()) {
                String str = this.b;
                if (str != null) {
                    u51Var.getClass();
                    if (!i32.N(str)) {
                        String concat = "android-app://androidx.navigation/".concat(str);
                        final p51 p51Var2 = new p51(concat);
                        final int i2 = 1;
                        ArrayList J2 = go.J((LinkedHashMap) u51Var.d, new oe0() { // from class: t51
                            @Override // defpackage.oe0
                            public final Object invoke(Object obj) {
                                boolean contains;
                                int i22 = i2;
                                p51 p51Var22 = p51Var2;
                                String str2 = (String) obj;
                                switch (i22) {
                                    case 0:
                                        str2.getClass();
                                        contains = p51Var22.c().contains(str2);
                                        break;
                                    default:
                                        str2.getClass();
                                        contains = p51Var22.c().contains(str2);
                                        break;
                                }
                                return Boolean.valueOf(!contains);
                            }
                        });
                        if (J2.isEmpty()) {
                            u51Var.f = new b52(new v3(concat, 23));
                            u51Var.a = concat.hashCode();
                            u51Var.e = str;
                        } else {
                            throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + ((r51) u51Var.b) + ". Following required arguments are missing: " + J2).toString());
                        }
                    } else {
                        se.h("Cannot have an empty route");
                        return null;
                    }
                }
                return b;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            ((Number) entry.getKey()).intValue();
            entry.getValue().getClass();
            se.s();
            return null;
        }
        Map.Entry entry2 = (Map.Entry) it.next();
        String str2 = (String) entry2.getKey();
        if (entry2.getValue() != null) {
            se.s();
            return null;
        }
        str2.getClass();
        throw null;
    }

    public r51 b() {
        return this.a.a();
    }
}
