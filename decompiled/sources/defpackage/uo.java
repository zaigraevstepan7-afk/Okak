package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uo implements k82 {
    public final long a;

    public uo(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        ll0.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.k82
    public final long a() {
        return this.a;
    }

    @Override // defpackage.k82
    public final ck b() {
        return null;
    }

    @Override // defpackage.k82
    public final float c() {
        return co.d(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uo) && co.c(this.a, ((uo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) co.i(this.a)) + ')';
    }
}
