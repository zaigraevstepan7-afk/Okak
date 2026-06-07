package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hz0 implements bi1 {
    public final rg2 e;
    public en0 f;
    public jq0 g;
    public en0 h;
    public xm0 i;

    public hz0(rg2 rg2Var) {
        this.e = rg2Var;
    }

    @Override // defpackage.bi1
    public final long c(bn0 bn0Var, long j, jq0 jq0Var, long j2) {
        boolean a;
        xm0 xm0Var = this.i;
        if (xm0Var != null) {
            en0 en0Var = this.f;
            boolean z = false;
            if (en0Var == null) {
                a = false;
            } else {
                a = en0.a(en0Var.a, j);
            }
            if (a && this.g == jq0Var) {
                en0 en0Var2 = this.h;
                if (en0Var2 != null) {
                    z = en0.a(en0Var2.a, j2);
                }
                if (z) {
                    return xm0Var.a;
                }
            }
        }
        long c = this.e.c(bn0Var, j, jq0Var, j2);
        this.f = new en0(j);
        this.g = jq0Var;
        this.h = new en0(j2);
        this.i = new xm0(c);
        return c;
    }
}
