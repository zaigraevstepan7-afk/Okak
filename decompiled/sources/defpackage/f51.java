package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f51 {
    public final d51 a;
    public final r51 b;
    public final Bundle c;
    public nu0 d;
    public final k51 e;
    public final String f;
    public final Bundle g;
    public final sl0 h;
    public boolean i;
    public final wu0 j;
    public nu0 k;
    public final dr1 l;
    public final b52 m;

    public f51(d51 d51Var) {
        this.a = d51Var;
        this.b = d51Var.f;
        this.c = d51Var.g;
        this.d = d51Var.h;
        this.e = d51Var.i;
        this.f = d51Var.j;
        this.g = d51Var.k;
        this.h = new sl0(new br1(d51Var, new vm1(d51Var, 5)));
        b52 b52Var = new b52(new ax0(10));
        this.j = new wu0(d51Var, true);
        this.k = nu0.f;
        this.l = (dr1) b52Var.getValue();
        this.m = new b52(new ax0(11));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
        v.putAll(bundle);
        return v;
    }

    public final void b() {
        if (!this.i) {
            sl0 sl0Var = this.h;
            ((br1) sl0Var.e).a();
            this.i = true;
            if (this.e != null) {
                c01.v(this.a);
            }
            sl0Var.x(this.g);
        }
        int ordinal = this.d.ordinal();
        int ordinal2 = this.k.ordinal();
        wu0 wu0Var = this.j;
        if (ordinal < ordinal2) {
            nu0 nu0Var = this.d;
            wu0Var.getClass();
            nu0Var.getClass();
            wu0Var.c("setCurrentState");
            wu0Var.e(nu0Var);
            return;
        }
        nu0 nu0Var2 = this.k;
        wu0Var.getClass();
        nu0Var2.getClass();
        wu0Var.c("setCurrentState");
        wu0Var.e(nu0Var2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(yl1.a(d51.class).d());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
