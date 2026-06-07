package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ji2 {
    public static final ni2 b;
    public final ni2 a;

    static {
        bi2 yh2Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            yh2Var = new ai2();
        } else if (i >= 31) {
            yh2Var = new zh2();
        } else {
            yh2Var = new yh2();
        }
        b = yh2Var.b().a.a().a.b().a.c();
    }

    public ji2(ni2 ni2Var) {
        this.a = ni2Var;
    }

    public ni2 a() {
        return this.a;
    }

    public ni2 b() {
        return this.a;
    }

    public ni2 c() {
        return this.a;
    }

    public l10 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        if (l() == ji2Var.l() && k() == ji2Var.k() && Objects.equals(i(), ji2Var.i()) && Objects.equals(h(), ji2Var.h()) && Objects.equals(e(), ji2Var.e())) {
            return true;
        }
        return false;
    }

    public yl0 f(int i) {
        return yl0.e;
    }

    public yl0 g(int i) {
        if ((i & 8) == 0) {
            return yl0.e;
        }
        se.h("Unable to query the maximum insets for IME");
        return null;
    }

    public yl0 h() {
        return yl0.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), h(), e());
    }

    public yl0 i() {
        return yl0.e;
    }

    public ni2 j(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void n(yl0[] yl0VarArr) {
    }

    public void o(ni2 ni2Var) {
    }

    public void p(int i) {
    }
}
