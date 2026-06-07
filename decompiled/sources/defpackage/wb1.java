package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wb1 extends lo {
    public final ip1 e;
    public final n8 f;

    public wb1(ip1 ip1Var) {
        n8 n8Var;
        this.e = ip1Var;
        if (!hp.D(ip1Var)) {
            n8Var = p8.a();
            n8.b(n8Var, ip1Var);
        } else {
            n8Var = null;
        }
        this.f = n8Var;
    }

    @Override // defpackage.lo
    public final pl1 A() {
        ip1 ip1Var = this.e;
        return new pl1(ip1Var.a, ip1Var.b, ip1Var.c, ip1Var.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wb1) {
                if (!this.e.equals(((wb1) obj).e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
