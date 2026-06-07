package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class d8 {
    static {
        js jsVar = c9.a;
    }

    public static final void a(fq fqVar, de0 de0Var, e21 e21Var, se0 se0Var, boolean z, s01 s01Var, pc1 pc1Var, ur urVar, int i, int i2) {
        int i3;
        se0 se0Var2;
        int i4;
        int i5;
        boolean z2;
        e21 e21Var2;
        boolean z3;
        s01 s01Var2;
        pc1 pc1Var2;
        se0 se0Var3;
        int i6;
        s01 s01Var3;
        pc1 pc1Var3;
        s01 s01Var4;
        se0 se0Var4;
        int i7;
        e21 e21Var3;
        boolean z4;
        urVar.Y(-532959117);
        if (urVar.h(de0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i | i3;
        int i9 = i8 | 3456;
        int i10 = i2 & 16;
        if (i10 != 0) {
            i5 = i8 | 28032;
            se0Var2 = se0Var;
        } else {
            se0Var2 = se0Var;
            if (urVar.h(se0Var2)) {
                i4 = 16384;
            } else {
                i4 = SharedConstants.DefaultBufferSize;
            }
            i5 = i9 | i4;
        }
        int i11 = i5 | 113967104;
        if ((38347923 & i11) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i11 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                z4 = z;
                s01Var4 = s01Var;
                pc1Var3 = pc1Var;
                se0Var4 = se0Var2;
                i7 = i11 & (-3670017);
                e21Var3 = e21Var;
            } else {
                if (i10 != 0) {
                    se0Var2 = null;
                }
                float f = r01.a;
                mo moVar = (mo) urVar.j(oo.a);
                s01 s01Var5 = moVar.e0;
                if (s01Var5 == null) {
                    i6 = -3670017;
                    s01Var3 = new s01(oo.d(moVar, bf.Q), oo.d(moVar, bf.S), oo.d(moVar, bf.g0), co.b(oo.d(moVar, bf.G), bf.H), co.b(oo.d(moVar, bf.I), bf.J), co.b(oo.d(moVar, bf.O), bf.P));
                    moVar.e0 = s01Var3;
                } else {
                    i6 = -3670017;
                    s01Var3 = s01Var5;
                }
                pc1Var3 = r01.b;
                s01Var4 = s01Var3;
                se0Var4 = se0Var2;
                i7 = i11 & i6;
                e21Var3 = b21.a;
                z4 = true;
            }
            urVar.q();
            w01.b(fqVar, de0Var, e21Var3, se0Var4, z4, s01Var4, pc1Var3, urVar, 268435454 & i7);
            s01Var2 = s01Var4;
            pc1Var2 = pc1Var3;
            se0Var3 = se0Var4;
            z3 = z4;
            e21Var2 = e21Var3;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            z3 = z;
            s01Var2 = s01Var;
            pc1Var2 = pc1Var;
            se0Var3 = se0Var2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new c8(fqVar, de0Var, e21Var2, se0Var3, z3, s01Var2, pc1Var2, i, i2);
        }
    }
}
