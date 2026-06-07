package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qs0 {
    public final Object a;
    public final ss0 b;
    public int d;
    public qs0 e;
    public boolean f;
    public int c = -1;
    public final je1 g = fr1.k(null);

    public qs0(Object obj, ss0 ss0Var) {
        this.a = obj;
        this.b = ss0Var;
    }

    public final qs0 a() {
        if (this.f) {
            nl0.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.e.add(this);
            qs0 qs0Var = (qs0) this.g.getValue();
            if (qs0Var != null) {
                qs0Var.a();
            } else {
                qs0Var = null;
            }
            this.e = qs0Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (!this.f) {
            if (this.d <= 0) {
                nl0.c("Release should only be called once");
            }
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.b.e.remove(this);
                qs0 qs0Var = this.e;
                if (qs0Var != null) {
                    qs0Var.b();
                }
                this.e = null;
            }
        }
    }
}
