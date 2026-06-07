package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements de0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ l40 f;
    public final /* synthetic */ gv g;

    public /* synthetic */ rd(gv gvVar, l40 l40Var) {
        this.g = gvVar;
        this.f = l40Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        gv gvVar = this.g;
        l40 l40Var = this.f;
        vt vtVar = null;
        switch (i) {
            case 0:
                rx.C(gvVar, null, new ee(l40Var, vtVar, 0), 3);
                return od2.a;
            default:
                if (((Boolean) l40Var.a.invoke(m40.e)).booleanValue()) {
                    rx.C(gvVar, null, new ee(l40Var, vtVar, 2), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ rd(l40 l40Var, gv gvVar) {
        this.f = l40Var;
        this.g = gvVar;
    }
}
