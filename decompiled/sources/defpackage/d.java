package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d extends eo1 implements se0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                d dVar = new d((n90) this.h, (oe1) obj2, vtVar, 0);
                dVar.g = obj;
                return dVar;
            case 1:
                d dVar2 = new d((xu) this.h, (se0) obj2, vtVar, 1);
                dVar2.g = obj;
                return dVar2;
            case 2:
                d dVar3 = new d((b72) obj2, vtVar, 2);
                dVar3.g = obj;
                return dVar3;
            default:
                d dVar4 = new d((v3) obj2, vtVar, 3);
                dVar4.h = obj;
                return dVar4;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((d) create((lv1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((d) create((v42) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((d) create((v42) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((d) create((lv1) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r4 != r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007d, code lost:
    
        if (r3 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0118, code lost:
    
        if (r0 != r8) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0129, code lost:
    
        if (r0 == r8) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102 A[Catch: CancellationException -> 0x00e9, TRY_ENTER, TryCatch #0 {CancellationException -> 0x00e9, blocks: (B:56:0x0102, B:61:0x0110, B:68:0x00e5, B:70:0x00f0), top: B:47:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:7:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0096 -> B:21:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0118 -> B:46:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0129 -> B:46:0x00fc). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.e = i;
        this.i = obj;
    }
}
