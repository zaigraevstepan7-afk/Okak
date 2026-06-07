package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uz implements jo {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jo
    public final long a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vz vzVar = (vz) obj;
                long a = vzVar.x.a();
                if (a == 16) {
                    uo1 uo1Var = (uo1) hp.s(vzVar, xo1.a);
                    if (uo1Var != null) {
                        long j = uo1Var.a;
                        if (j != 16) {
                            return j;
                        }
                    }
                    return ((co) hp.s(vzVar, et.a)).a;
                }
                return a;
            default:
                return ((zo1) obj).c;
        }
    }
}
