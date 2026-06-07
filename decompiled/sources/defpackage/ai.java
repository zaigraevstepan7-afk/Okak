package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ai extends eo1 implements se0 {
    public r22 e;
    public kh1 f;
    public long g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ gv j;
    public final /* synthetic */ ta2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(gv gvVar, ta2 ta2Var, vt vtVar) {
        super(2, vtVar);
        this.j = gvVar;
        this.k = ta2Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        ai aiVar = new ai(this.j, this.k, vtVar);
        aiVar.i = obj;
        return aiVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((v42) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c2 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:9:0x00be, B:11:0x00c2), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
