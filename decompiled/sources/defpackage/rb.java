package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rb implements kw1 {
    public final je1 a = fr1.k(new rn(0.0f, 1.0f));
    public final /* synthetic */ ub b;

    public rb(ub ubVar) {
        this.b = ubVar;
    }

    @Override // defpackage.kw1
    public final lo a(long j, jq0 jq0Var, c00 c00Var) {
        ub ubVar = this.b;
        kp1 kp1Var = ubVar.a;
        ubVar.c = j;
        rn rnVar = new rn(0.0f, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f);
        je1 je1Var = this.a;
        je1Var.setValue(rnVar);
        long j2 = ubVar.c;
        c00 c00Var2 = ubVar.d;
        ya yaVar = ubVar.e;
        if (yaVar == null) {
            yaVar = fc2.a(kp1Var.a.a(j2, c00Var2));
            ubVar.e = yaVar;
        }
        float floatValue = ((Number) go.r(Float.valueOf(((Number) yaVar.d()).floatValue()), (rn) je1Var.getValue())).floatValue();
        long j3 = ubVar.c;
        c00 c00Var3 = ubVar.d;
        ya yaVar2 = ubVar.f;
        if (yaVar2 == null) {
            yaVar2 = fc2.a(kp1Var.b.a(j3, c00Var3));
            ubVar.f = yaVar2;
        }
        float floatValue2 = ((Number) go.r(Float.valueOf(((Number) yaVar2.d()).floatValue()), (rn) je1Var.getValue())).floatValue();
        long j4 = ubVar.c;
        c00 c00Var4 = ubVar.d;
        ya yaVar3 = ubVar.g;
        if (yaVar3 == null) {
            yaVar3 = fc2.a(kp1Var.d.a(j4, c00Var4));
            ubVar.g = yaVar3;
        }
        float floatValue3 = ((Number) go.r(Float.valueOf(((Number) yaVar3.d()).floatValue()), (rn) je1Var.getValue())).floatValue();
        long j5 = ubVar.c;
        c00 c00Var5 = ubVar.d;
        ya yaVar4 = ubVar.h;
        if (yaVar4 == null) {
            yaVar4 = fc2.a(kp1Var.c.a(j5, c00Var5));
            ubVar.h = yaVar4;
        }
        float floatValue4 = ((Number) go.r(Float.valueOf(((Number) yaVar4.d()).floatValue()), (rn) je1Var.getValue())).floatValue();
        kp1 kp1Var2 = lp1.a;
        return new kp1(new rk1(floatValue), new rk1(floatValue2), new rk1(floatValue4), new rk1(floatValue3)).a(j, jq0Var, c00Var);
    }
}
