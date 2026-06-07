package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class iz0 extends d6 {
    public final g2 I;

    public iz0(g2 g2Var) {
        this.I = g2Var;
    }

    public final void H(Serializable serializable) {
        j2 j2Var = this.I.a;
        if (j2Var != null) {
            xp xpVar = j2Var.I;
            LinkedHashMap linkedHashMap = xpVar.b;
            ArrayList arrayList = xpVar.d;
            String str = j2Var.J;
            Object obj = linkedHashMap.get(str);
            f2 f2Var = j2Var.K;
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                arrayList.add(str);
                try {
                    xpVar.b(intValue, f2Var, serializable);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + f2Var + " and input " + serializable + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        se.p("Launcher has not been initialized");
    }
}
