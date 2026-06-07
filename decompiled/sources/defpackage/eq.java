package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class eq extends q2 implements se0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.l;
        od2 od2Var = od2.a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                fq fqVar = (fq) obj3;
                fqVar.b(((Number) obj2).intValue(), (ur) obj);
                return od2Var;
            default:
                long j = ((ye2) obj).a;
                ts1 ts1Var = (ts1) obj3;
                gv gvVar = (gv) ((de0) ts1Var.O.h).invoke();
                if (gvVar != null) {
                    rx.C(gvVar, null, new rs1(ts1Var, j, null, 1), 3);
                    return od2Var;
                }
                se.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                return null;
        }
    }
}
