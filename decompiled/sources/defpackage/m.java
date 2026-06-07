package defpackage;

import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ long h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(m62 m62Var, long j, q62 q62Var, l62 l62Var, vt vtVar) {
        super(2, vtVar);
        this.f = 3;
        this.i = m62Var;
        this.h = j;
        this.j = q62Var;
        this.k = l62Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                return new m((go0) obj3, this.h, (r31) obj2, vtVar, 0);
            case 1:
                m mVar = new m(this.h, vtVar, (wg1) obj3, (CharSequence) obj2);
                mVar.i = obj;
                return mVar;
            case 2:
                m mVar2 = new m((at1) obj3, this.h, (tl1) obj2, vtVar, 2);
                mVar2.i = obj;
                return mVar2;
            case 3:
                return new m((m62) this.i, this.h, (q62) obj3, (l62) obj2, vtVar);
            default:
                return new m((o41) obj3, this.h, (r31) obj2, vtVar, 4);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((m) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((m) create((TextClassifier) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((m) create((ys1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 3:
                return ((m) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((m) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r10.a(r0, r13) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r10.a(r5, r13) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (new defpackage.v72(r0.h, r13, 0).invokeSuspend(r6) == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0137, code lost:
    
        if (((defpackage.go0) r8).M(r13) == r7) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j, vt vtVar, wg1 wg1Var, CharSequence charSequence) {
        super(2, vtVar);
        this.f = 1;
        this.j = wg1Var;
        this.k = charSequence;
        this.h = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, long j, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.j = obj;
        this.h = j;
        this.k = obj2;
    }
}
