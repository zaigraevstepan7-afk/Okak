package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class db extends cq0 implements te0 {
    public final /* synthetic */ a12 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ pb g;
    public final /* synthetic */ fq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(a12 a12Var, Object obj, pb pbVar, fq fqVar) {
        super(3);
        this.e = a12Var;
        this.f = obj;
        this.g = pbVar;
        this.h = fqVar;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        int i;
        zb zbVar = (zb) obj;
        ur urVar = (ur) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                h = urVar.f(zbVar);
            } else {
                h = urVar.h(zbVar);
            }
            if (h) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(intValue & 1, z)) {
            a12 a12Var = this.e;
            boolean f = urVar.f(a12Var);
            Object obj4 = this.f;
            boolean h2 = f | urVar.h(obj4);
            pb pbVar = this.g;
            boolean h3 = h2 | urVar.h(pbVar);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (h3 || L == xl1Var) {
                L = new cb(a12Var, obj4, pbVar, 0);
                urVar.h0(L);
            }
            bf.d(zbVar, (oe0) L, urVar);
            i41 i41Var = pbVar.d;
            zbVar.getClass();
            i41Var.m(obj4, ((ac) zbVar).a);
            Object L2 = urVar.L();
            if (L2 == xl1Var) {
                L2 = new Object();
                urVar.h0(L2);
            }
            this.h.c((jb) L2, obj4, urVar, 0);
        } else {
            urVar.R();
        }
        return od2.a;
    }
}
