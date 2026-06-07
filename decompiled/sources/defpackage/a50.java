package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a50 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public a50(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f;
        boolean z = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f = xc.c(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            z = true;
        }
        return !z;
    }

    public final EdgeEffect a(sb1 sb1Var) {
        EdgeEffect qf0Var;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 31) {
            qf0Var = xc.a(context);
        } else {
            qf0Var = new qf0(context);
        }
        qf0Var.setColor(this.b);
        if (!en0.a(this.c, 0L)) {
            long j = this.c;
            if (sb1Var == sb1.e) {
                qf0Var.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return qf0Var;
            }
            qf0Var.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return qf0Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            EdgeEffect a = a(sb1.e);
            this.e = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect == null) {
            EdgeEffect a = a(sb1.f);
            this.f = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect == null) {
            EdgeEffect a = a(sb1.f);
            this.g = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect == null) {
            EdgeEffect a = a(sb1.e);
            this.d = a;
            return a;
        }
        return edgeEffect;
    }
}
