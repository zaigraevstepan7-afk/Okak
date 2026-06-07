package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ci1 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ci1(boolean r2, defpackage.ct1 r3, boolean r4) {
        /*
            r1 = this;
            js r0 = defpackage.c9.a
            if (r2 != 0) goto L8
            r2 = 262152(0x40008, float:3.67353E-40)
            goto La
        L8:
            r2 = 262144(0x40000, float:3.67342E-40)
        La:
            ct1 r0 = defpackage.ct1.f
            if (r3 != r0) goto L10
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L10:
            if (r4 != 0) goto L14
            r2 = r2 | 512(0x200, float:7.17E-43)
        L14:
            ct1 r4 = defpackage.ct1.e
            if (r3 != r4) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci1.<init>(boolean, ct1, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ci1) {
            ci1 ci1Var = (ci1) obj;
            if (this.a == ci1Var.a && this.b == ci1Var.b && this.c == ci1Var.c && this.d == ci1Var.d && this.e == ci1Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + mb2.a(mb2.a(mb2.a(mb2.a(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public ci1(boolean z, int i) {
        this((i & 1) != 0 ? false : z, ct1.e, (i & 8) != 0);
    }

    public ci1(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
    }
}
