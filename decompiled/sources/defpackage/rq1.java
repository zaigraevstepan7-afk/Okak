package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rq1 implements oq1, cr1 {
    public final /* synthetic */ pq1 e;
    public wu0 f;
    public sl0 g;

    public rq1(pq1 pq1Var) {
        Bundle bundle;
        this.e = pq1Var;
        Object e = pq1Var.e("androidx.savedstate.SavedStateRegistry");
        if (e instanceof Bundle) {
            bundle = (Bundle) e;
        } else {
            bundle = null;
        }
        if (bundle != null && this.g == null) {
            sl0 sl0Var = new sl0(new br1(this, new vm1(this, 5)));
            this.g = sl0Var;
            sl0Var.x(bundle);
        }
        pq1Var.a("androidx.savedstate.SavedStateRegistry", new vm1(this, 3));
    }

    @Override // defpackage.oq1
    public final ld a(String str, de0 de0Var) {
        return this.e.a(str, de0Var);
    }

    @Override // defpackage.oq1
    public final boolean c(Object obj) {
        return this.e.c(obj);
    }

    @Override // defpackage.oq1
    public final Map d() {
        return this.e.d();
    }

    @Override // defpackage.oq1
    public final Object e(String str) {
        return this.e.e(str);
    }

    @Override // defpackage.cr1
    public final sl0 f() {
        sl0 sl0Var = this.g;
        if (sl0Var == null) {
            sl0 sl0Var2 = new sl0(new br1(this, new vm1(this, 5)));
            this.g = sl0Var2;
            sl0Var2.x(null);
            sl0Var = sl0Var2;
        }
        return (sl0) sl0Var.f;
    }

    @Override // defpackage.uu0
    public final wu0 g() {
        wu0 wu0Var = this.f;
        if (wu0Var == null) {
            wu0 wu0Var2 = new wu0(this, false);
            this.f = wu0Var2;
            return wu0Var2;
        }
        return wu0Var;
    }
}
