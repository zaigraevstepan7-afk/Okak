package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a0 extends b0 implements RandomAccess {
    public final b0 e;
    public final int f;
    public final int g;

    public a0(b0 b0Var, int i, int i2) {
        this.e = b0Var;
        this.f = i;
        bf.w(i, i2, b0Var.a());
        this.g = i2 - i;
    }

    @Override // defpackage.s
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return this.e.get(this.f + i);
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // defpackage.b0, java.util.List
    public final List subList(int i, int i2) {
        bf.w(i, i2, this.g);
        int i3 = this.f;
        return new a0(this.e, i + i3, i3 + i2);
    }
}
