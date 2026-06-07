package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h71 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(g71 g71Var) {
        g71Var.getClass();
        String z = hp.z(g71Var.getClass());
        if (z.length() > 0) {
            LinkedHashMap linkedHashMap = this.a;
            g71 g71Var2 = (g71) linkedHashMap.get(z);
            if (sn0.r(g71Var2, g71Var)) {
                return;
            }
            if (g71Var2 != null && g71Var2.b) {
                y61.o("Navigator ", g71Var, " is replacing an already attached ", g71Var2);
                return;
            } else if (!g71Var.b) {
                return;
            } else {
                y61.n("Navigator ", g71Var, " is already attached to another NavController");
                return;
            }
        }
        se.h("navigator name cannot be an empty string");
    }

    public final g71 b(String str) {
        str.getClass();
        if (str.length() > 0) {
            g71 g71Var = (g71) this.a.get(str);
            if (g71Var != null) {
                return g71Var;
            }
            se.p(l90.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
            return null;
        }
        se.h("navigator name cannot be an empty string");
        return null;
    }
}
