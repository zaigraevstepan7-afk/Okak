package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nb extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ob f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb(ob obVar, long j, int i) {
        super(1);
        this.e = i;
        this.f = obVar;
        this.g = j;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        u90 u90Var;
        int i = this.e;
        long j = 0;
        long j2 = this.g;
        ob obVar = this.f;
        switch (i) {
            case 0:
                ib2 ib2Var = (ib2) obj;
                if (sn0.r(ib2Var.b(), obVar.u.b())) {
                    if (!en0.a(obVar.v, -9223372034707292160L)) {
                        j2 = obVar.v;
                    }
                } else {
                    o22 o22Var = (o22) obVar.u.d.g(ib2Var.b());
                    if (o22Var != null) {
                        j2 = ((en0) o22Var.getValue()).a;
                    } else {
                        j2 = 0;
                    }
                }
                o22 o22Var2 = (o22) obVar.u.d.g(ib2Var.c());
                if (o22Var2 != null) {
                    j = ((en0) o22Var2.getValue()).a;
                }
                jy1 jy1Var = (jy1) obVar.t.getValue();
                if (jy1Var == null || (u90Var = (u90) jy1Var.a.invoke(new en0(j2), new en0(j))) == null) {
                    return mp0.M(0.0f, 400.0f, null, 5);
                }
                return u90Var;
            default:
                if (sn0.r(obj, obVar.u.b())) {
                    if (en0.a(obVar.v, -9223372034707292160L)) {
                        j = j2;
                    } else {
                        j = obVar.v;
                    }
                } else {
                    o22 o22Var3 = (o22) obVar.u.d.g(obj);
                    if (o22Var3 != null) {
                        j = ((en0) o22Var3.getValue()).a;
                    }
                }
                return new en0(j);
        }
    }
}
