package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kq1 implements gm1 {
    public gr1 e;
    public oq1 f;
    public String g;
    public Object h;
    public Object[] i;
    public ld j;
    public final vm1 k = new vm1(this, 2);

    public kq1(gr1 gr1Var, oq1 oq1Var, String str, Object obj, Object[] objArr) {
        this.e = gr1Var;
        this.f = oq1Var;
        this.g = str;
        this.h = obj;
        this.i = objArr;
    }

    @Override // defpackage.gm1
    public final void a() {
        ld ldVar = this.j;
        if (ldVar != null) {
            ldVar.v();
        }
    }

    public final void b() {
        String C;
        oq1 oq1Var = this.f;
        if (this.j == null) {
            if (oq1Var != null) {
                vm1 vm1Var = this.k;
                Object invoke = vm1Var.invoke();
                if (invoke != null && !oq1Var.c(invoke)) {
                    if (invoke instanceof u02) {
                        u02 u02Var = (u02) invoke;
                        if (u02Var.c() != g3.S && u02Var.c() != xl1.o && u02Var.c() != xl1.f) {
                            C = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            C = "MutableState containing " + u02Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        C = go.C(invoke);
                    }
                    throw new IllegalArgumentException(C);
                }
                this.j = oq1Var.a(this.g, vm1Var);
                return;
            }
            return;
        }
        y61.r("entry(", this.j, ") is not null");
    }

    @Override // defpackage.gm1
    public final void d() {
        ld ldVar = this.j;
        if (ldVar != null) {
            ldVar.v();
        }
    }

    @Override // defpackage.gm1
    public final void e() {
        b();
    }
}
