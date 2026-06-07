package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ad0 implements c60 {
    public static final ad0 g;
    public static final ad0 h;
    public static final ad0 i;
    public static final ad0 j;
    public static final ad0 k;
    public static final ad0 l;
    public static final ad0 m;
    public static final ad0 n;
    public final /* synthetic */ int e;
    public final String f;

    static {
        int i2 = 0;
        g = new ad0("NONE", i2);
        h = new ad0("FULL", i2);
        int i3 = 1;
        i = new ad0("VERTICAL", i3);
        j = new ad0("HORIZONTAL", i3);
        int i4 = 2;
        k = new ad0("FLAT", i4);
        l = new ad0("HALF_OPENED", i4);
        int i5 = 3;
        m = new ad0("FOLD", i5);
        n = new ad0("HINGE", i5);
    }

    public /* synthetic */ ad0(String str, int i2) {
        this.e = i2;
        this.f = str;
    }

    @Override // defpackage.c60
    public boolean m(CharSequence charSequence, int i2, int i3, kc2 kc2Var) {
        if (TextUtils.equals(charSequence.subSequence(i2, i3), this.f)) {
            kc2Var.c = (kc2Var.c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        int i2 = this.e;
        String str = this.f;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return str;
            case 4:
            default:
                return super.toString();
            case 5:
                return "<" + str + '>';
        }
    }

    @Override // defpackage.c60
    public Object i() {
        return this;
    }
}
