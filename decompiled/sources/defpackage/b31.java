package defpackage;

import android.view.View;
import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b31 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b31(Object obj, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = obj;
        this.h = obj2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new b31((at1) this.i, (se0) obj2, vtVar, 0);
            case 1:
                return new b31((TextClassifier) this.i, (se0) obj2, vtVar, 1);
            case 2:
                b31 b31Var = new b31((se0) obj2, vtVar, 2);
                b31Var.i = obj;
                return b31Var;
            case 3:
                b31 b31Var2 = new b31((co1) obj2, vtVar, 3);
                b31Var2.i = obj;
                return b31Var2;
            case 4:
                b31 b31Var3 = new b31((g9) obj2, vtVar, 4);
                b31Var3.i = obj;
                return b31Var3;
            case 5:
                return new b31((y20) this.i, (ts1) obj2, vtVar, 5);
            case 6:
                return new b31((q4) obj2, vtVar, 6);
            case 7:
                return new b31((dz1) this.i, (l) obj2, vtVar, 7);
            case 8:
                return new b31((pz1) this.i, (b1) obj2, vtVar, 8);
            case 9:
                return new b31((xm) this.i, (gc) obj2, vtVar, 9);
            case 10:
                return new b31((go0) this.i, (qi1) obj2, vtVar, 10);
            case 11:
                b31 b31Var4 = new b31((wa0) obj2, vtVar, 11);
                b31Var4.i = obj;
                return b31Var4;
            case 12:
                return new b31((vf2) obj2, vtVar, 12);
            case 13:
                return new b31((ef2) this.i, (vf2) obj2, vtVar, 13);
            case 14:
                return new b31((jl1) this.i, (View) obj2, vtVar, 14);
            default:
                return new b31((p22) this.i, (m21) obj2, vtVar, 15);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 3:
                return ((b31) create((zm1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 4:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 5:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 6:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 7:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 8:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 9:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 10:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 11:
                return ((b31) create(obj, (vt) obj2)).invokeSuspend(od2Var);
            case 12:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 13:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 14:
                return ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                ((b31) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return hv.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a0, code lost:
    
        if (r0.M(r17) == r8) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02e4, code lost:
    
        if (r1 != r8) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02ef, code lost:
    
        if (r0.invoke(r1, r17) == r8) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        if (r2.b(r0, r17) != r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ec, code lost:
    
        if (r2 == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        if (r1 == r8) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0244  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x02ef -> B:163:0x02f3). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b31.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b31(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
    }
}
