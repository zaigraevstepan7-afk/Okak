package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z60 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b70 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z60(b70 b70Var, long j, int i) {
        super(1);
        this.e = i;
        this.f = b70Var;
        this.g = j;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int ordinal;
        long j;
        long j2;
        int i = this.e;
        long j3 = 0;
        long j4 = this.g;
        b70 b70Var = this.f;
        switch (i) {
            case 0:
                int ordinal2 = ((r60) obj).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            bm bmVar = b70Var.x.a.c;
                            if (bmVar != null) {
                                j4 = ((en0) bmVar.b.invoke(new en0(j4))).a;
                            }
                        } else {
                            se.m();
                            return null;
                        }
                    }
                } else {
                    bm bmVar2 = b70Var.w.a.c;
                    if (bmVar2 != null) {
                        j4 = ((en0) bmVar2.b.invoke(new en0(j4))).a;
                    }
                }
                return new en0(j4);
            case 1:
                r60 r60Var = (r60) obj;
                if (b70Var.B != null && b70Var.L0() != null && !sn0.r(b70Var.B, b70Var.L0()) && (ordinal = r60Var.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        bm bmVar3 = b70Var.x.a.c;
                        if (bmVar3 != null) {
                            oe0 oe0Var = bmVar3.b;
                            long j5 = this.g;
                            long j6 = ((en0) oe0Var.invoke(new en0(j5))).a;
                            i3 L0 = b70Var.L0();
                            L0.getClass();
                            jq0 jq0Var = jq0.e;
                            long a = ((ki) L0).a(j5, j6, jq0Var);
                            i3 i3Var = b70Var.B;
                            i3Var.getClass();
                            j3 = xm0.b(a, i3Var.a(j5, j6, jq0Var));
                        }
                    } else {
                        se.m();
                        return null;
                    }
                }
                return new xm0(j3);
            default:
                r60 r60Var2 = (r60) obj;
                ly1 ly1Var = b70Var.w.a.b;
                if (ly1Var != null) {
                    j = ((xm0) ly1Var.a.invoke(new en0(j4))).a;
                } else {
                    j = 0;
                }
                ly1 ly1Var2 = b70Var.x.a.b;
                if (ly1Var2 != null) {
                    j2 = ((xm0) ly1Var2.a.invoke(new en0(j4))).a;
                } else {
                    j2 = 0;
                }
                int ordinal3 = r60Var2.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 == 2) {
                            j3 = j2;
                        } else {
                            se.m();
                            return null;
                        }
                    }
                } else {
                    j3 = j;
                }
                return new xm0(j3);
        }
    }
}
