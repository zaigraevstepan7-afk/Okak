package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f22 implements u90 {
    public final float a;
    public final float b;
    public final Object c;

    public f22(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.gc
    public final qe2 a(ec2 ec2Var) {
        mc mcVar;
        Object obj = this.c;
        if (obj == null) {
            mcVar = null;
        } else {
            mcVar = (mc) ec2Var.a.invoke(obj);
        }
        return new ov1(this.a, this.b, mcVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f22) {
            f22 f22Var = (f22) obj;
            if (f22Var.a == this.a && f22Var.b == this.b && sn0.r(f22Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + l90.a(this.a, i * 31, 31);
    }

    public /* synthetic */ f22(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
