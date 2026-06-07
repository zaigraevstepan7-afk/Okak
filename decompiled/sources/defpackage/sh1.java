package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sh1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public sh1(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sh1) {
                sh1 sh1Var = (sh1) obj;
                if (hp.v(this.a, sh1Var.a) && this.b == sh1Var.b && z81.b(this.c, sh1Var.c) && z81.b(this.d, sh1Var.d) && this.e == sh1Var.e && Float.compare(this.f, sh1Var.f) == 0 && this.g == sh1Var.g && this.h == sh1Var.h && this.i.equals(sh1Var.i) && z81.b(this.j, sh1Var.j) && z81.b(this.k, sh1Var.k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + l90.e(this.j, (this.i.hashCode() + mb2.a(l90.b(this.g, l90.a(this.f, mb2.a(l90.e(this.d, l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31), 31, this.h)) * 31, 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) hp.S(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) z81.g(this.c)) + ", position=" + ((Object) z81.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) wh1.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) z81.g(this.j)) + ", originalEventPosition=" + ((Object) z81.g(this.k)) + ')';
    }
}
