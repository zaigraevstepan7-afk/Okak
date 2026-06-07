package defpackage;

import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cj {
    public static final cj a = new Object();
    public static final float b = 640.0f;
    public static final float c = 56.0f;
    public static final float d = 125.0f;

    public final void a(e21 e21Var, float f, float f2, kw1 kw1Var, long j, ur urVar, final int i) {
        boolean z;
        final e21 e21Var2;
        final float f3;
        final float f4;
        final kw1 kw1Var2;
        final long j2;
        long e;
        final float f5;
        final float f6;
        kw1 kw1Var3;
        e21 e21Var3;
        urVar.Y(-1364277227);
        int i2 = i | 9654;
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                e21Var3 = e21Var;
                f5 = f;
                f6 = f2;
                kw1Var3 = kw1Var;
                e = j;
            } else {
                float f7 = f2.x;
                float f8 = f2.w;
                kp1 kp1Var = ((ow1) urVar.j(pw1.a)).e;
                e = oo.e(f2.v, urVar);
                f5 = f7;
                f6 = f8;
                kw1Var3 = kp1Var;
                e21Var3 = b21.a;
            }
            urVar.q();
            String g = nq1.g(R.string.m3c_bottom_sheet_drag_handle_description, urVar);
            dc2 dc2Var = bx1.a;
            e21 M = sn0.M(e21Var3, 0.0f, 22.0f, 1);
            boolean f9 = urVar.f(g);
            Object L = urVar.L();
            if (f9 || L == or.a) {
                L = new wh(g, 1);
                urVar.h0(L);
            }
            long j3 = e;
            l42.a(ou1.a(M, false, (oe0) L), kw1Var3, j3, 0L, 0.0f, 0.0f, go.N(-1039573072, new se0() { // from class: aj
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    ur urVar2 = (ur) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (urVar2.O(intValue & 1, z2)) {
                        hj.a(hy1.g(b21.a, f5, f6), urVar2, 0);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, 12582912, 120);
            kw1Var2 = kw1Var3;
            j2 = j3;
            e21Var2 = e21Var3;
            f3 = f5;
            f4 = f6;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            f3 = f;
            f4 = f2;
            kw1Var2 = kw1Var;
            j2 = j;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(e21Var2, f3, f4, kw1Var2, j2, i) { // from class: bj
                public final /* synthetic */ e21 f;
                public final /* synthetic */ float g;
                public final /* synthetic */ float h;
                public final /* synthetic */ kw1 i;
                public final /* synthetic */ long j;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(196609);
                    cj.this.a(this.f, this.g, this.h, this.i, this.j, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }
}
