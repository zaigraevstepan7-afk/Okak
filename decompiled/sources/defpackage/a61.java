package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a61 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ wl1 f;

    public /* synthetic */ a61(wl1 wl1Var, int i) {
        this.e = i;
        this.f = wl1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.e;
        wl1 wl1Var = this.f;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = wl1Var.e;
                if (obj2 == null || !((Bundle) obj2).containsKey(str)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ub2 ub2Var = (ub2) obj;
                ub2Var.getClass();
                vs0 vs0Var = ((wb2) ub2Var).s;
                List list = (List) wl1Var.e;
                if (list != null) {
                    list.add(vs0Var);
                } else {
                    list = xn.G(vs0Var);
                }
                wl1Var.e = list;
                return tb2.f;
            default:
                return TreeJsonEncoderKt.a(wl1Var, (JsonElement) obj);
        }
    }
}
