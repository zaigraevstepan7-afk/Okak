package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class xo implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ xo(ig1[] ig1VarArr, yo yoVar, int i, l01 l01Var, int[] iArr) {
        this.e = 0;
        this.g = ig1VarArr;
        this.h = yoVar;
        this.f = i;
        this.i = l01Var;
        this.j = iArr;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        sp1 sp1Var;
        int a;
        pl1 pl1Var;
        int i;
        Object value;
        int i2 = this.e;
        od2 od2Var = od2.a;
        int i3 = 0;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        int i4 = this.f;
        Object obj5 = this.g;
        switch (i2) {
            case 0:
                ig1[] ig1VarArr = (ig1[]) obj5;
                yo yoVar = (yo) obj4;
                l01 l01Var = (l01) obj3;
                int[] iArr = (int[]) obj2;
                hg1 hg1Var = (hg1) obj;
                int length = ig1VarArr.length;
                int i5 = 0;
                while (i3 < length) {
                    ig1 ig1Var = ig1VarArr[i3];
                    int i6 = i5 + 1;
                    ig1Var.getClass();
                    Object C = ig1Var.C();
                    ov ovVar = null;
                    if (C instanceof sp1) {
                        sp1Var = (sp1) C;
                    } else {
                        sp1Var = null;
                    }
                    jq0 layoutDirection = l01Var.getLayoutDirection();
                    if (sp1Var != null) {
                        ovVar = sp1Var.c;
                    }
                    if (ovVar != null) {
                        a = ovVar.b.a(ig1Var.e, i4, layoutDirection);
                    } else {
                        a = yoVar.b.a(ig1Var.e, i4, layoutDirection);
                    }
                    hg1.i(hg1Var, ig1Var, a, iArr[i5]);
                    i3++;
                    i5 = i6;
                }
                return od2Var;
            case 1:
                o41 o41Var = (o41) obj4;
                ge1 ge1Var = (ge1) obj2;
                iq0 iq0Var = (iq0) obj;
                o41Var.setValue(iq0Var);
                ((ge1) obj3).h((int) (iq0Var.m() >> 32));
                View view = ((nh2) obj5).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i7 = rect.top;
                int i8 = rect.bottom;
                iq0 iq0Var2 = (iq0) o41Var.getValue();
                if (iq0Var2 != null && iq0Var2.j()) {
                    pl1Var = hp.e(iq0Var2.e(0L), vn.O(iq0Var2.m()));
                } else {
                    pl1Var = pl1.e;
                }
                int i9 = i7 + i4;
                int i10 = i8 - i4;
                float f = pl1Var.b;
                if (f <= i8) {
                    float f2 = pl1Var.d;
                    if (f2 >= i7) {
                        i = c01.R(Math.max(f - i9, i10 - f2));
                        ge1Var.h(Math.max(i, 0));
                        return od2Var;
                    }
                }
                i = i10 - i9;
                ge1Var.h(Math.max(i, 0));
                return od2Var;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                o41 o41Var2 = (o41) obj3;
                fe1 fe1Var = (fe1) obj2;
                hg1 hg1Var2 = (hg1) obj;
                n4 n4Var = ((l40) obj5).b;
                cy c = n4Var.c();
                j00 j00Var = n4Var.i;
                fe1 fe1Var2 = n4Var.j;
                m40 m40Var = m40.e;
                float f3 = c.f(m40Var);
                float f4 = -i4;
                dc2 dc2Var = u61.a;
                if (!((Boolean) o41Var2.getValue()).booleanValue() || f3 != f4) {
                    if (!((Boolean) o41Var2.getValue()).booleanValue()) {
                        o41Var2.setValue(Boolean.TRUE);
                    }
                    fe1Var.h(f4);
                    sl0 sl0Var = new sl0(6);
                    sl0Var.p(m40Var, fe1Var.g());
                    sl0Var.p(m40.f, 0.0f);
                    ArrayList arrayList2 = (ArrayList) sl0Var.e;
                    float[] fArr = (float[]) sl0Var.f;
                    int size = arrayList2.size();
                    fArr.getClass();
                    bf.J(size, fArr.length);
                    float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    copyOfRange.getClass();
                    cy cyVar = new cy(arrayList2, copyOfRange);
                    if (!Float.isNaN(fe1Var2.g())) {
                        value = cyVar.a(fe1Var2.g());
                        if (value == null) {
                            value = j00Var.getValue();
                        }
                    } else {
                        value = j00Var.getValue();
                    }
                    n4Var.h(cyVar, value);
                }
                float g = fe1Var.g();
                if (go.o((n4Var.f() - g) / (0.0f - g), 0.0f, 1.0f) != 0.0f) {
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        hg1.k(hg1Var2, (ig1) arrayList.get(i11), 0, 0);
                    }
                }
                return od2Var;
        }
    }

    public /* synthetic */ xo(Object obj, int i, Object obj2, o41 o41Var, v22 v22Var, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
        this.i = o41Var;
        this.j = v22Var;
    }
}
