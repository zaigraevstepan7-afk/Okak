package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e70 extends eo1 implements se0 {
    public final /* synthetic */ int e;
    public long[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e70(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.e = i;
        this.o = obj;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.e;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                e70 e70Var = new e70((f70) obj2, vtVar, 0);
                e70Var.m = obj;
                return e70Var;
            case 1:
                e70 e70Var2 = new e70((f70) obj2, vtVar, 1);
                e70Var2.m = obj;
                return e70Var2;
            case 2:
                e70 e70Var3 = new e70((ur1) obj2, vtVar, 2);
                e70Var3.m = obj;
                return e70Var3;
            default:
                e70 e70Var4 = new e70((d42) obj2, vtVar, 3);
                e70Var4.m = obj;
                return e70Var4;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        lv1 lv1Var = (lv1) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((e70) create(lv1Var, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((e70) create(lv1Var, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((e70) create(lv1Var, vtVar)).invokeSuspend(od2Var);
            default:
                return ((e70) create(lv1Var, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0084 -> B:7:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:16:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:8:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0117 -> B:29:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fe -> B:37:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0100 -> B:30:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01a9 -> B:50:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0190 -> B:58:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0192 -> B:51:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x023b -> B:71:0x0266). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0221 -> B:79:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0223 -> B:72:0x0235). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
