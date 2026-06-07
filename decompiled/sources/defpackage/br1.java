package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class br1 {
    public final cr1 a;
    public final vm1 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final wm1 c = new wm1(12);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public br1(cr1 cr1Var, vm1 vm1Var) {
        this.a = cr1Var;
        this.b = vm1Var;
    }

    public final void a() {
        cr1 cr1Var = this.a;
        if (cr1Var.g().c == nu0.f) {
            if (!this.e) {
                this.b.invoke();
                cr1Var.g().a(new m1(this, 2));
                this.e = true;
                return;
            }
            se.p("SavedStateRegistry was already attached.");
            return;
        }
        se.p("Restarter must be created only during owner's initialization stage");
    }
}
