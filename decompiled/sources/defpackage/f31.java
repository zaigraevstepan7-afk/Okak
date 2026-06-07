package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f31 implements j01 {
    public final e31 a;

    public f31(e31 e31Var) {
        this.a = e31Var;
    }

    @Override // defpackage.j01
    public final int a(mn0 mn0Var, List list, int i) {
        return this.a.a(mn0Var, fp.y(mn0Var), i);
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        return this.a.b(l01Var, fp.y(l01Var), j);
    }

    @Override // defpackage.j01
    public final int c(mn0 mn0Var, List list, int i) {
        return this.a.c(mn0Var, fp.y(mn0Var), i);
    }

    @Override // defpackage.j01
    public final int d(mn0 mn0Var, List list, int i) {
        return this.a.d(mn0Var, fp.y(mn0Var), i);
    }

    @Override // defpackage.j01
    public final int e(mn0 mn0Var, List list, int i) {
        return this.a.e(mn0Var, fp.y(mn0Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f31) && sn0.r(this.a, ((f31) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
