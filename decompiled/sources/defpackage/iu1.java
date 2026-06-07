package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class iu1 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu1(uh1 uh1Var, r31 r31Var, dz1 dz1Var, vt vtVar) {
        super(2, vtVar);
        this.f = 1;
        this.h = uh1Var;
        this.i = r31Var;
        this.j = dz1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                iu1 iu1Var = new iu1((o22) this.i, (ya) obj2, vtVar, 0);
                iu1Var.h = obj;
                return iu1Var;
            case 1:
                return new iu1((uh1) this.h, (r31) this.i, (dz1) obj2, vtVar);
            case 2:
                iu1 iu1Var2 = new iu1((xu) this.i, (va0) obj2, vtVar, 2);
                iu1Var2.h = obj;
                return iu1Var2;
            case 3:
                iu1 iu1Var3 = new iu1((go0) this.i, (se0) obj2, vtVar, 3);
                iu1Var3.h = obj;
                return iu1Var3;
            case 4:
                return new iu1((w62) this.i, (q62) obj2, vtVar, 4);
            case 5:
                return new iu1((ir) obj2, vtVar);
            default:
                iu1 iu1Var4 = new iu1((ov1) this.i, (Context) obj2, vtVar, 6);
                iu1Var4.h = obj;
                return iu1Var4;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((iu1) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((iu1) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((iu1) create((cj1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 3:
                return ((iu1) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 4:
                return ((iu1) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 5:
                return ((iu1) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((iu1) create((dj1) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (((defpackage.q62) r4).a(r0, r11) == r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0155, code lost:
    
        if (r12.M(r11) == r6) goto L81;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu1(ir irVar, vt vtVar) {
        super(2, vtVar);
        this.f = 5;
        this.j = irVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iu1(Object obj, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = obj;
        this.j = obj2;
    }
}
