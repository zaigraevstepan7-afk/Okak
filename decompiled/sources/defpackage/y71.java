package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y71 {
    public d21 a;
    public int b;
    public q41 c;
    public q41 d;
    public boolean e;
    public final /* synthetic */ a81 f;

    public y71(a81 a81Var, d21 d21Var, int i, q41 q41Var, q41 q41Var2, boolean z) {
        this.f = a81Var;
        this.a = d21Var;
        this.b = i;
        this.c = q41Var;
        this.d = q41Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        q41 q41Var = this.c;
        int i3 = this.b;
        c21 c21Var = (c21) q41Var.e[i + i3];
        c21 c21Var2 = (c21) this.d.e[i3 + i2];
        if (sn0.r(c21Var, c21Var2) || c21Var.getClass() == c21Var2.getClass()) {
            return true;
        }
        return false;
    }
}
