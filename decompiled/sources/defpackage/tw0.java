package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class tw0 implements se0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ tw0(se0 se0Var, fq fqVar, se0 se0Var2, long j, long j2) {
        this.h = se0Var;
        this.i = fqVar;
        this.j = se0Var2;
        this.f = j;
        this.g = j2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sn0.d((e21) obj5, this.f, this.g, (kw1) obj4, (List) obj3, (ur) obj, lo.b0(1));
                return od2Var;
            default:
                se0 se0Var = (se0) obj5;
                fq fqVar = (fq) obj4;
                se0 se0Var2 = (se0) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(1 & intValue, z)) {
                    vn.b(t82.a.a(rc2.a(mp0.T, urVar)), go.N(969655473, new vz1(se0Var, fqVar, se0Var2, rc2.a(mp0.N, urVar), this.f, this.g), urVar), urVar, 56);
                } else {
                    urVar.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ tw0(e21 e21Var, long j, long j2, kw1 kw1Var, List list, int i) {
        this.h = e21Var;
        this.f = j;
        this.g = j2;
        this.i = kw1Var;
        this.j = list;
    }
}
