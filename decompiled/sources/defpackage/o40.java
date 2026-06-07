package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o40 implements kv1, p40 {
    public final kv1 a;
    public final int b;

    public o40(kv1 kv1Var, int i) {
        kv1Var.getClass();
        this.a = kv1Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        se.d(i, "count must be non-negative, but was ");
        throw null;
    }

    @Override // defpackage.p40
    public final kv1 a(int i) {
        int i2 = this.b + i;
        if (i2 < 0) {
            return new o40(this, i);
        }
        return new o40(this.a, i2);
    }

    @Override // defpackage.kv1
    public final Iterator iterator() {
        return new n40(this);
    }
}
