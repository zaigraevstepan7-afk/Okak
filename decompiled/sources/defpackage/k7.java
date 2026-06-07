package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k7 {
    public final Context a;
    public final c00 b;
    public final long c;
    public final pc1 d;

    public k7(Context context, c00 c00Var, long j, pc1 pc1Var) {
        this.a = context;
        this.b = c00Var;
        this.c = j;
        this.d = pc1Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!k7.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        k7 k7Var = (k7) obj;
        if (sn0.r(this.a, k7Var.a) && sn0.r(this.b, k7Var.b) && co.c(this.c, k7Var.c) && sn0.r(this.d, k7Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = co.h;
        return this.d.hashCode() + l90.e(this.c, hashCode, 31);
    }
}
