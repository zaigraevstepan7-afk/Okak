package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qn1 implements ue0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ oe0 k;
    public final /* synthetic */ oe0 l;
    public final /* synthetic */ oe0 m;

    public qn1(List list, String str, boolean z, float f, int i, int i2, oe0 oe0Var, oe0 oe0Var2, oe0 oe0Var3) {
        this.e = list;
        this.f = str;
        this.g = z;
        this.h = f;
        this.i = i;
        this.j = i2;
        this.k = oe0Var;
        this.l = oe0Var2;
        this.m = oe0Var3;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj5 = (tr0) obj;
        int intValue = ((Number) obj2).intValue();
        ur urVar = (ur) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (urVar.f(obj5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i = i5 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (urVar.d(intValue)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i |= i4;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i & 1, z)) {
            zm1 zm1Var = (zm1) this.e.get(intValue);
            urVar.X(712193618);
            boolean equals = zm1Var.c.equals(this.f);
            if (equals && this.g) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (equals) {
                f = this.h;
            } else {
                f = 0.0f;
            }
            float f2 = f;
            if (equals) {
                i2 = this.i;
            } else {
                i2 = 0;
            }
            if (equals) {
                i3 = this.j;
            } else {
                i3 = 0;
            }
            oe0 oe0Var = this.k;
            boolean f3 = urVar.f(oe0Var) | urVar.f(zm1Var);
            Object L = urVar.L();
            Object obj6 = or.a;
            if (f3 || L == obj6) {
                L = new nn1(0, oe0Var, zm1Var);
                urVar.h0(L);
            }
            de0 de0Var = (de0) L;
            oe0 oe0Var2 = this.m;
            boolean f4 = urVar.f(oe0Var2) | urVar.f(zm1Var);
            Object L2 = urVar.L();
            if (f4 || L2 == obj6) {
                L2 = new nn1(1, oe0Var2, zm1Var);
                urVar.h0(L2);
            }
            bf.q(zm1Var, equals, z2, f2, i2, i3, de0Var, this.l, (de0) L2, urVar, 0);
            urVar.p(false);
        } else {
            urVar.R();
        }
        return od2.a;
    }
}
