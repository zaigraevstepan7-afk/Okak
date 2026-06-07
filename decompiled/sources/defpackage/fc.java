package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fc {
    public final ec2 a;
    public final Object b;
    public final long c;
    public final de0 d;
    public final je1 e;
    public mc f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final je1 i = fr1.k(Boolean.TRUE);

    public fc(Object obj, ec2 ec2Var, mc mcVar, long j, Object obj2, long j2, de0 de0Var) {
        this.a = ec2Var;
        this.b = obj2;
        this.c = j2;
        this.d = de0Var;
        this.e = fr1.k(obj);
        this.f = fc2.v(mcVar);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.a.b.invoke(this.f);
    }
}
