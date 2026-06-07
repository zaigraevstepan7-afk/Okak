package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c90 extends e90 {
    public final long b;
    public final long c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c90(List list, long j, long j2, boolean z) {
        super(list);
        list.getClass();
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.e90
    public final e90 a(ih1 ih1Var) {
        vv0 v = xn.v();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v.add(((uv) list.get(i)).e(ih1Var));
        }
        return new c90(xn.s(v), lo.a0(this.b, ih1Var), lo.a0(this.c, ih1Var), this.d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) ha0.b(this.b)) + ", center=" + ((Object) ha0.b(this.c)) + ", convex=" + this.d;
    }
}
