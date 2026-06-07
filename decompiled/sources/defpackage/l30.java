package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l30 extends q42 implements se0 {
    public final /* synthetic */ int f = 1;
    public wl1 g;
    public wl1 h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(wl1 wl1Var, m30 m30Var, vt vtVar) {
        super(2, vtVar);
        this.h = wl1Var;
        this.k = m30Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        m30 m30Var = this.k;
        switch (i) {
            case 0:
                l30 l30Var = new l30(this.h, m30Var, vtVar);
                l30Var.j = obj;
                return l30Var;
            default:
                l30 l30Var2 = new l30(m30Var, vtVar);
                l30Var2.j = obj;
                return l30Var2;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((l30) create((oe0) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((l30) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r5.S0(r9, r8) != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (defpackage.m30.O0(r5, r8) == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (defpackage.m30.O0(r5, r8) != r4) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Path cross not found for [B:32:0x00ca, B:29:0x00b8], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, wl1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c5 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cc -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d9 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e7 -> B:9:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0133 -> B:60:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:61:0x0139). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l30.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(m30 m30Var, vt vtVar) {
        super(2, vtVar);
        this.k = m30Var;
    }
}
