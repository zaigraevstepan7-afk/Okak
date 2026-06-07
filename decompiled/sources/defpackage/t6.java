package defpackage;

import com.topjohnwu.superuser.nio.FileSystemManager;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ t6(long j, qc2 qc2Var, se0 se0Var, int i) {
        this.e = 3;
        this.f = j;
        this.g = qc2Var;
        this.h = se0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        boolean z = false;
        int i2 = 3;
        od2 od2Var = od2.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                x6.a((d91) obj4, (e21) obj3, this.f, (ur) obj, lo.b0(1));
                return od2Var;
            case 1:
                rc1 rc1Var = (rc1) obj4;
                fq fqVar = (fq) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (urVar.O(intValue & 1, z)) {
                    xn.i(this.f, ((pc2) urVar.j(rc2.a)).m, go.N(-2115100680, new u2(4, rc1Var, fqVar), urVar), urVar, 384);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 2:
                pc1 pc1Var = (pc1) obj4;
                fq fqVar2 = (fq) obj3;
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    xn.i(this.f, ((pc2) urVar2.j(rc2.a)).m, go.N(417635459, new u2(i2, pc1Var, fqVar2), urVar2), urVar2, 384);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 3:
                ((Integer) obj2).getClass();
                cw0.c(this.f, (qc2) obj4, (se0) obj3, (ur) obj, lo.b0(49));
                return od2Var;
            case 4:
                ((Integer) obj2).getClass();
                sn0.h((e21) obj3, this.f, (List) obj4, (ur) obj, lo.b0(7));
                return od2Var;
            case 5:
                pz1 pz1Var = (pz1) obj4;
                String str = (String) obj3;
                ur urVar3 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (urVar3.O(intValue3 & 1, z)) {
                    rc1 rc1Var2 = sk.a;
                    long j = co.g;
                    rk a = sk.d((mo) urVar3.j(oo.a)).a(j, this.f, j, j);
                    boolean f = urVar3.f(pz1Var);
                    Object L = urVar3.L();
                    if (f || L == or.a) {
                        L = new nz1(pz1Var, 1);
                        urVar3.h0(L);
                    }
                    sn0.o((de0) L, null, false, null, a, null, go.N(521110564, new zx0(str, i2), urVar3), urVar3, FileSystemManager.MODE_READ_WRITE, 494);
                } else {
                    urVar3.R();
                }
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                d6.m((ij0) obj4, (String) obj3, this.f, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ t6(long j, Object obj, Object obj2, int i) {
        this.e = i;
        this.f = j;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ t6(e21 e21Var, long j, List list, int i) {
        this.e = 4;
        this.h = e21Var;
        this.f = j;
        this.g = list;
    }

    public /* synthetic */ t6(Object obj, Object obj2, long j, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.f = j;
    }
}
