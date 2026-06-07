package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class li extends ud1 {
    public final t7 e;
    public final long f;
    public int g = 1;
    public final long h;
    public float i;
    public ni j;

    public li(t7 t7Var, long j) {
        int i;
        this.e = t7Var;
        this.f = j;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0 && i2 <= t7Var.a.getWidth() && i <= t7Var.a.getHeight()) {
            this.h = j;
            this.i = 1.0f;
        } else {
            se.h("Failed requirement.");
            throw null;
        }
    }

    @Override // defpackage.ud1
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.ud1
    public final void b(ni niVar) {
        this.j = niVar;
    }

    @Override // defpackage.ud1
    public final long d() {
        return vn.O(this.h);
    }

    @Override // defpackage.ud1
    public final void e(cr0 cr0Var) {
        vl vlVar = cr0Var.e;
        c40.w(cr0Var, this.e, this.f, (Math.round(Float.intBitsToFloat((int) (vlVar.d() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (vlVar.d() & 4294967295L))) & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof li) {
                li liVar = (li) obj;
                if (sn0.r(this.e, liVar.e) && xm0.a(0L, 0L) && en0.a(this.f, liVar.f) && this.g == liVar.g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + l90.e(this.f, l90.e(0L, this.e.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append((Object) xm0.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) en0.b(this.f));
        sb.append(", filterQuality=");
        int i = this.g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else if (i == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
