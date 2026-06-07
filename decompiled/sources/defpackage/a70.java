package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a70 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a70(b70 b70Var, int i) {
        super(1);
        this.e = i;
        this.f = b70Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        r60 r60Var = r60.g;
        r60 r60Var2 = r60.f;
        r60 r60Var3 = r60.e;
        b70 b70Var = this.f;
        switch (i) {
            case 0:
                ib2 ib2Var = (ib2) obj;
                boolean a = ib2Var.a(r60Var3, r60Var2);
                f22 f22Var = null;
                if (a) {
                    bm bmVar = b70Var.w.a.c;
                    if (bmVar != null) {
                        f22Var = bmVar.c;
                    }
                } else if (ib2Var.a(r60Var2, r60Var)) {
                    bm bmVar2 = b70Var.x.a.c;
                    if (bmVar2 != null) {
                        f22Var = bmVar2.c;
                    }
                } else {
                    f22Var = x60.d;
                }
                if (f22Var == null) {
                    return x60.d;
                }
                return f22Var;
            default:
                ib2 ib2Var2 = (ib2) obj;
                if (ib2Var2.a(r60Var3, r60Var2)) {
                    ly1 ly1Var = b70Var.w.a.b;
                    if (ly1Var != null) {
                        return ly1Var.b;
                    }
                    return x60.c;
                }
                if (ib2Var2.a(r60Var2, r60Var)) {
                    ly1 ly1Var2 = b70Var.x.a.b;
                    if (ly1Var2 != null) {
                        return ly1Var2.b;
                    }
                    return x60.c;
                }
                return x60.c;
        }
    }
}
