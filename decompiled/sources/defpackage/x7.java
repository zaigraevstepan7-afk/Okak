package defpackage;

import android.os.Build;
import android.view.View;
import com.elixir.loader.UserSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x7 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x7(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.wa0
    public final Object b(Object obj, vt vtVar) {
        Object e;
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                sl0 sl0Var = (sl0) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    sl0Var.t().startStylusHandwriting((View) sl0Var.e);
                }
                return od2Var;
            case 1:
                nx nxVar = (nx) obj2;
                if (!(nxVar.g.k() instanceof s90) && (e = nx.e(nxVar, true, vtVar)) == hv.e) {
                    return e;
                }
                return od2Var;
            case 2:
                ((wl1) obj2).e = obj;
                throw new g(this);
            case 3:
                UserSettings userSettings = (UserSettings) obj;
                String savedKey = userSettings.getSavedKey();
                savedKey.getClass();
                zd2 zd2Var = new zd2(savedKey, userSettings.getExpiresAt(), userSettings.getIsLifetime());
                el0 el0Var = (el0) obj2;
                kd kdVar = el0Var.h;
                if (kdVar == null) {
                    kdVar = el0.e(el0Var, el0Var.f, "Standoff 2");
                }
                kd kdVar2 = el0Var.i;
                if (kdVar2 == null) {
                    kdVar2 = el0.e(el0Var, el0Var.g, "Elixir Loader");
                }
                r22 r22Var = el0Var.d;
                bl0 bl0Var = new bl0(zd2Var, kdVar, kdVar2);
                r22Var.getClass();
                r22Var.k(null, bl0Var);
                return od2Var;
            default:
                ((m21) obj2).e.h(((Number) obj).floatValue());
                return od2Var;
        }
    }
}
