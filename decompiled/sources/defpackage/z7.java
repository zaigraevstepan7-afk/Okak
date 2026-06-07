package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z7 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(uh1 uh1Var, te0 te0Var, oe0 oe0Var, qi1 qi1Var, vt vtVar) {
        super(2, vtVar);
        this.f = 10;
        this.i = uh1Var;
        this.k = te0Var;
        this.j = oe0Var;
        this.l = qi1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                z7 z7Var = new z7((t8) this.i, (oe0) this.j, (b8) obj3, (bu0) obj2, vtVar, 0);
                z7Var.h = obj;
                return z7Var;
            case 1:
                return new z7((gu0) this.h, (o41) this.i, (n82) this.j, (b82) obj3, (nj0) obj2, vtVar, 1);
            case 2:
                return new z7((qj) this.h, (i82) this.i, (gu0) this.j, (x82) obj3, (c91) obj2, vtVar, 2);
            case 3:
                z7 z7Var2 = new z7((List) obj3, (ArrayList) obj2, vtVar);
                z7Var2.j = obj;
                return z7Var2;
            case 4:
                z7 z7Var3 = new z7((wu0) this.i, (nu0) this.j, (xu) obj3, (va0) obj2, vtVar, 4);
                z7Var3.h = obj;
                return z7Var3;
            case 5:
                z7 z7Var4 = new z7((bi0) this.j, (ResponseBody) obj3, (String) obj2, vtVar, 5);
                z7Var4.h = obj;
                return z7Var4;
            case 6:
                return new z7((ya) this.h, (f22) this.i, (List) this.j, (ge1) obj3, (fe1) obj2, vtVar, 6);
            case 7:
                z7 z7Var5 = new z7((wq) this.i, (o41) this.j, (fe1) obj3, (o41) obj2, vtVar, 7);
                z7Var5.h = obj;
                return z7Var5;
            case 8:
                z7 z7Var6 = new z7((jl1) this.j, (il1) obj3, (ja) obj2, vtVar, 8);
                z7Var6.h = obj;
                return z7Var6;
            case 9:
                return new z7((lt1) obj3, this.h, (lb2) obj2, vtVar);
            default:
                z7 z7Var7 = new z7((uh1) this.i, (te0) obj3, (oe0) this.j, (qi1) obj2, vtVar);
                z7Var7.h = obj;
                return z7Var7;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return hv.e;
            case 1:
                return ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 3:
                return ((z7) create(obj, (vt) obj2)).invokeSuspend(od2Var);
            case 4:
                return ((z7) create((cj1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 5:
                return ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 6:
                return ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 7:
                return ((z7) create((va0) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 8:
                return ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 9:
                return ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((z7) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0484, code lost:
    
        if (r0.f(r24, r1) == r6) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0454, code lost:
    
        if (r0 == r6) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d6, code lost:
    
        if (defpackage.lt1.j(r7, r24) == r6) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        if (defpackage.lt1.l(r15, r24) == r6) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        if (r8 == r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0108, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0109, code lost:
    
        if (r8 != r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        if (r8 == r6) goto L46;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Type inference failed for: r1v44, types: [int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [l2, java.lang.Object] */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 2014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(lt1 lt1Var, Object obj, lb2 lb2Var, vt vtVar) {
        super(2, vtVar);
        this.f = 9;
        this.k = lt1Var;
        this.h = obj;
        this.l = lb2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7(Object obj, Object obj2, Object obj3, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7(Object obj, Object obj2, Object obj3, Object obj4, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(List list, ArrayList arrayList, vt vtVar) {
        super(2, vtVar);
        this.f = 3;
        this.k = list;
        this.l = arrayList;
    }
}
