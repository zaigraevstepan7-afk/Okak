package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class em0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;

    public /* synthetic */ em0(int i, int i2, ig1 ig1Var) {
        this.e = 1;
        this.f = i;
        this.g = ig1Var;
        this.h = i2;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        int i2 = this.h;
        int i3 = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                hg1.i((hg1) obj, (ig1) obj2, i3, i2);
                return od2Var;
            case 1:
                hg1.i((hg1) obj, (ig1) obj2, c01.R((i3 - r8.e) / 2.0f), c01.R((i2 - r8.f) / 2.0f));
                return od2Var;
            case 2:
                hg1.i((hg1) obj, (ig1) obj2, i3, i2);
                return od2Var;
            default:
                n8 n8Var = (n8) obj2;
                zd1 zd1Var = (zd1) obj;
                i8 i8Var = zd1Var.a;
                int d = zd1Var.d(i3);
                int d2 = zd1Var.d(i2);
                CharSequence charSequence = i8Var.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    ll0.a("start(" + d + ") or end(" + d2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                u82 u82Var = i8Var.d;
                u82Var.f.getSelectionPath(d, d2, path);
                int i4 = u82Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                n8 n8Var2 = new n8(path);
                float f = zd1Var.f;
                n8Var2.k((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                n8.a(n8Var, n8Var2);
                return od2Var;
        }
    }

    public /* synthetic */ em0(Object obj, int i, int i2, int i3) {
        this.e = i3;
        this.g = obj;
        this.f = i;
        this.h = i2;
    }
}
