package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c30 extends eo1 implements se0 {
    public jh1 e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ sl1 i;
    public final /* synthetic */ wl1 j;
    public final /* synthetic */ wl1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(sl1 sl1Var, wl1 wl1Var, wl1 wl1Var2, vt vtVar) {
        super(2, vtVar);
        this.i = sl1Var;
        this.j = wl1Var;
        this.k = wl1Var2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        c30 c30Var = new c30(this.i, this.j, this.k, vtVar);
        c30Var.h = obj;
        return c30Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((c30) create((v42) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r8 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce A[EDGE_INSN: B:70:0x00ce->B:13:0x00ce BREAK  A[LOOP:0: B:7:0x00bb->B:10:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00af -> B:6:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
