package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mt1 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public mt1 f;
    public mt1 g;

    public mt1(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final mt1 a() {
        mt1 mt1Var = this.f;
        if (mt1Var == this) {
            mt1Var = null;
        }
        mt1 mt1Var2 = this.g;
        mt1Var2.getClass();
        mt1Var2.f = this.f;
        mt1 mt1Var3 = this.f;
        mt1Var3.getClass();
        mt1Var3.g = this.g;
        this.f = null;
        this.g = null;
        return mt1Var;
    }

    public final void b(mt1 mt1Var) {
        mt1Var.getClass();
        mt1Var.g = this;
        mt1Var.f = this.f;
        mt1 mt1Var2 = this.f;
        mt1Var2.getClass();
        mt1Var2.g = mt1Var;
        this.f = mt1Var;
    }

    public final mt1 c() {
        this.d = true;
        return new mt1(this.a, this.b, this.c, true, false);
    }

    public final void d(mt1 mt1Var, int i) {
        mt1Var.getClass();
        byte[] bArr = mt1Var.a;
        if (mt1Var.e) {
            int i2 = mt1Var.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!mt1Var.d) {
                    int i4 = mt1Var.b;
                    if (i3 - i4 <= 8192) {
                        bf.z(bArr, 0, bArr, i4, i2);
                        mt1Var.c -= mt1Var.b;
                        mt1Var.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = mt1Var.c;
            int i6 = this.b;
            bf.z(this.a, i5, bArr, i6, i6 + i);
            mt1Var.c += i;
            this.b += i;
            return;
        }
        se.p("only owner can write");
    }

    public mt1() {
        this.a = new byte[SharedConstants.DefaultBufferSize];
        this.e = true;
        this.d = false;
    }
}
