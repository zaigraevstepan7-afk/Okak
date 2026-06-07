package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h7 extends eo1 implements se0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.e = i;
        this.h = obj;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                h7 h7Var = new h7((j7) obj2, vtVar, 0);
                h7Var.g = obj;
                return h7Var;
            case 1:
                h7 h7Var2 = new h7((kh1) obj2, vtVar, 1);
                h7Var2.g = obj;
                return h7Var2;
            default:
                h7 h7Var3 = new h7((f80) obj2, vtVar, 2);
                h7Var3.g = obj;
                return h7Var3;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        v42 v42Var = (v42) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((h7) create(v42Var, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((h7) create(v42Var, vtVar)).invokeSuspend(od2Var);
            default:
                return ((h7) create(v42Var, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r14 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r14 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
    
        if (r14 != r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a8, code lost:
    
        if (r14 == r5) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00bf -> B:34:0x00c3). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
