package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i12 extends ck {
    public final long a;

    public i12(long j) {
        this.a = j;
    }

    @Override // defpackage.ck
    public final void a(float f, long j, f8 f8Var) {
        f8Var.c(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = co.b(j2, co.d(j2) * f);
        }
        f8Var.e(j2);
        if (((Shader) f8Var.c) != null) {
            f8Var.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        if (co.c(this.a, ((i12) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) co.i(this.a)) + ')';
    }
}
