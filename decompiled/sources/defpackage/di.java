package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class di extends eo1 implements se0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(u7 u7Var, cy1 cy1Var, b72 b72Var, vt vtVar) {
        super(2, vtVar);
        this.e = 2;
        this.h = u7Var;
        this.i = cy1Var;
        this.j = b72Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                di diVar = new di((gv) this.i, (ta2) obj2, vtVar);
                diVar.g = obj;
                return diVar;
            case 1:
                di diVar2 = new di((uy) obj2, vtVar, 1);
                diVar2.g = obj;
                return diVar2;
            case 2:
                di diVar3 = new di((u7) this.h, (cy1) this.i, (b72) obj2, vtVar);
                diVar3.g = obj;
                return diVar3;
            default:
                di diVar4 = new di((s32) obj2, vtVar, 3);
                diVar4.g = obj;
                return diVar4;
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
                ((di) create(v42Var, vtVar)).invokeSuspend(od2Var);
                return hv.e;
            case 1:
                return ((di) create(v42Var, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((di) create(v42Var, vtVar)).invokeSuspend(od2Var);
            default:
                return ((di) create(v42Var, vtVar)).invokeSuspend(od2Var);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0461  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x00cb -> B:30:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x03bd -> B:196:0x03c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0238 -> B:9:0x023c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x042d -> B:218:0x0430). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(gv gvVar, ta2 ta2Var, vt vtVar) {
        super(2, vtVar);
        this.e = 0;
        this.i = gvVar;
        this.j = ta2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.e = i;
        this.j = obj;
    }
}
