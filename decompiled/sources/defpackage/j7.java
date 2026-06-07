package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j7 {
    public final c00 a;
    public long b = 9205357640488583168L;
    public final a50 c;
    public final je1 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final rz i;

    public j7(Context context, c00 c00Var, long j, pc1 pc1Var) {
        rf0 rf0Var;
        this.a = c00Var;
        a50 a50Var = new a50(context, go.U(j));
        this.c = a50Var;
        this.d = new je1(od2.a, g3.S);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        i7 i7Var = new i7(this, 0);
        jh1 jh1Var = s42.a;
        w42 w42Var = new w42(null, null, i7Var);
        if (Build.VERSION.SDK_INT >= 31) {
            rf0Var = new rf0(w42Var, this, a50Var);
        } else {
            rf0Var = new rf0(w42Var, this, a50Var, pc1Var);
        }
        this.i = rf0Var;
    }

    public final void a() {
        boolean z;
        a50 a50Var = this.c;
        EdgeEffect edgeEffect = a50Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = a50Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect3 = a50Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect4 = a50Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, defpackage.se0 r21, defpackage.wt r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j7.b(long, se0, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(long r20, int r22, defpackage.oe0 r23) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j7.c(long, int, oe0):long");
    }

    public final long d() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = yq1.p(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void e() {
        if (this.e) {
            this.d.setValue(od2.a);
        }
    }

    public final float f(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (d() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f2 = -intBitsToFloat2;
        float f3 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = xc.d(b, f2, f3);
        } else {
            b.onPull(f2, f3);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f2);
        if (i2 >= 31) {
            f = xc.c(b);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (d() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = xc.d(c, intBitsToFloat2, f2);
        } else {
            c.onPull(intBitsToFloat2, f2);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = xc.c(c);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (d() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f2 = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = xc.d(d, f2, intBitsToFloat);
        } else {
            d.onPull(f2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * (-f2);
        if (i2 >= 31) {
            f = xc.c(d);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (d() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = xc.d(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = xc.c(e);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean a = fy1.a(this.g, 0L);
        boolean a2 = fy1.a(j, this.g);
        this.g = j;
        if (!a2) {
            long R = (c01.R(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (c01.R(Float.intBitsToFloat((int) (j >> 32))) << 32);
            a50 a50Var = this.c;
            a50Var.c = R;
            EdgeEffect edgeEffect = a50Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (R >> 32), (int) (R & 4294967295L));
            }
            EdgeEffect edgeEffect2 = a50Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (R >> 32), (int) (R & 4294967295L));
            }
            EdgeEffect edgeEffect3 = a50Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (R & 4294967295L), (int) (R >> 32));
            }
            EdgeEffect edgeEffect4 = a50Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (R & 4294967295L), (int) (R >> 32));
            }
            EdgeEffect edgeEffect5 = a50Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (R >> 32), (int) (R & 4294967295L));
            }
            EdgeEffect edgeEffect6 = a50Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (R >> 32), (int) (R & 4294967295L));
            }
            EdgeEffect edgeEffect7 = a50Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (R & 4294967295L), (int) (R >> 32));
            }
            EdgeEffect edgeEffect8 = a50Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & R), (int) (R >> 32));
            }
        }
        if (!a && !a2) {
            a();
        }
    }
}
