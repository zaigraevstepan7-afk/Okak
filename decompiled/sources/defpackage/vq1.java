package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vq1 implements ar1 {
    public final sl0 a;
    public boolean b;
    public Bundle c;
    public final b52 d;

    public vq1(sl0 sl0Var, tg2 tg2Var) {
        sl0Var.getClass();
        this.a = sl0Var;
        this.d = new b52(new vm1(tg2Var, 4));
    }

    @Override // defpackage.ar1
    public final Bundle a() {
        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            v.putAll(bundle);
        }
        for (Map.Entry entry : ((wq1) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((rp) ((sq1) entry.getValue()).b.e).a();
            if (!a.isEmpty()) {
                str.getClass();
                v.putBundle(str, a);
            }
        }
        this.b = false;
        return v;
    }

    public final void b() {
        if (!this.b) {
            Bundle q = this.a.q("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
            Bundle bundle = this.c;
            if (bundle != null) {
                v.putAll(bundle);
            }
            if (q != null) {
                v.putAll(q);
            }
            this.c = v;
            this.b = true;
        }
    }
}
