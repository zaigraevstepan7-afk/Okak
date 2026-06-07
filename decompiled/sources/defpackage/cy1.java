package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cy1 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final Object d;

    public cy1(boolean z, wt1 wt1Var, gf0 gf0Var) {
        this.a = 0;
        this.b = z;
        this.c = wt1Var;
        this.d = gf0Var;
    }

    public qv a() {
        gf0 gf0Var = (gf0) this.d;
        int i = gf0Var.b;
        int i2 = gf0Var.c;
        if (i < i2) {
            return qv.f;
        }
        if (i > i2) {
            return qv.e;
        }
        return qv.g;
    }

    public void b() {
        if (this.b) {
            b82.b((b82) this.d, (d92) this.c);
        }
    }

    public long c(i82 i82Var, long j, boolean z, y61 y61Var) {
        jg0 jg0Var;
        b82 b82Var = (b82) this.d;
        long c = b82.c(b82Var, i82Var, j, z, false, y61Var, false);
        if (!d92.a((d92) this.c, c)) {
            this.b = false;
        }
        if (d92.c(c)) {
            jg0Var = jg0.g;
        } else {
            jg0Var = jg0.f;
        }
        b82Var.q(jg0Var);
        return c;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + a() + ", info=\n\t" + ((gf0) this.d) + ')';
            default:
                return super.toString();
        }
    }

    public cy1(b82 b82Var) {
        this.a = 1;
        this.d = b82Var;
        this.b = true;
    }
}
