package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hc implements o22 {
    public final ec2 e;
    public final je1 f;
    public mc g;
    public long h;
    public long i;
    public boolean j;

    public hc(ec2 ec2Var, Object obj, mc mcVar, long j, long j2, boolean z) {
        mc mcVar2;
        this.e = ec2Var;
        this.f = fr1.k(obj);
        if (mcVar != null) {
            mcVar2 = fc2.v(mcVar);
        } else {
            mcVar2 = (mc) ec2Var.a.invoke(obj);
            mcVar2.d();
        }
        this.g = mcVar2;
        this.h = j;
        this.i = j2;
        this.j = z;
    }

    public final Object a() {
        return this.e.b.invoke(this.g);
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return this.f.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f.getValue() + ", velocity=" + a() + ", isRunning=" + this.j + ", lastFrameTimeNanos=" + this.h + ", finishedTimeNanos=" + this.i + ')';
    }

    public /* synthetic */ hc(ec2 ec2Var, Object obj, mc mcVar, int i) {
        this(ec2Var, obj, (i & 4) != 0 ? null : mcVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
