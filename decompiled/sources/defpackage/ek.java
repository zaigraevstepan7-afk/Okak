package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ek implements k82 {
    public final fw1 a;
    public final float b;

    public ek(fw1 fw1Var, float f) {
        this.a = fw1Var;
        this.b = f;
    }

    @Override // defpackage.k82
    public final long a() {
        int i = co.h;
        return co.g;
    }

    @Override // defpackage.k82
    public final ck b() {
        return this.a;
    }

    @Override // defpackage.k82
    public final float c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj;
        if (sn0.r(this.a, ekVar.a) && Float.compare(this.b, ekVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return l90.n(sb, this.b, ')');
    }
}
