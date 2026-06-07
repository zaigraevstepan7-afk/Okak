package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hs0 {
    public final lq1 a;
    public final z9 b;
    public final i41 c;

    public hs0(lq1 lq1Var, z9 z9Var) {
        this.a = lq1Var;
        this.b = z9Var;
        long[] jArr = sr1.a;
        this.c = new i41();
    }

    public final se0 a(int i, Object obj, Object obj2) {
        i41 i41Var = this.c;
        gs0 gs0Var = (gs0) i41Var.g(obj);
        int i2 = 17;
        if (gs0Var != null && gs0Var.c == i && sn0.r(gs0Var.b, obj2)) {
            fq fqVar = gs0Var.d;
            if (fqVar == null) {
                fq fqVar2 = new fq(818252804, true, new u2(i2, gs0Var.e, gs0Var));
                gs0Var.d = fqVar2;
                return fqVar2;
            }
            return fqVar;
        }
        gs0 gs0Var2 = new gs0(this, i, obj, obj2);
        i41Var.m(obj, gs0Var2);
        fq fqVar3 = gs0Var2.d;
        if (fqVar3 == null) {
            fq fqVar4 = new fq(818252804, true, new u2(i2, this, gs0Var2));
            gs0Var2.d = fqVar4;
            return fqVar4;
        }
        return fqVar3;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            gs0 gs0Var = (gs0) this.c.g(obj);
            if (gs0Var != null) {
                return gs0Var.b;
            }
            is0 is0Var = (is0) this.b.invoke();
            int e = is0Var.e(obj);
            if (e != -1) {
                return is0Var.d(e);
            }
            return null;
        }
        return null;
    }
}
