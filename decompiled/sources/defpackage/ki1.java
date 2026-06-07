package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ki1 implements us0 {
    public final int a;
    public final ld b;
    public final oe0 c;
    public us d;
    public z32 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public Object i;
    public boolean j;
    public ji1 k;
    public boolean l;
    public long m;
    public long n;
    public long o;
    public final /* synthetic */ dq0 p;

    public ki1(dq0 dq0Var, int i, ld ldVar, oe0 oe0Var) {
        this.p = dq0Var;
        this.a = i;
        this.b = ldVar;
        this.c = oe0Var;
        int i2 = j21.b;
        this.o = System.nanoTime() - j21.a;
    }

    @Override // defpackage.us0
    public final void a() {
        this.l = true;
    }

    public final void b() {
        z32 z32Var = this.e;
        if (z32Var != null) {
            z32Var.a();
        }
        this.e = null;
        this.k = null;
    }

    public final boolean c(e9 e9Var) {
        boolean d;
        if (!this.p.a) {
            return false;
        }
        if (this.l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(e9Var);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(e9Var);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return d;
    }

    @Override // defpackage.us0
    public final void cancel() {
        if (!this.g) {
            this.g = true;
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x014a, code lost:
    
        if (e() == false) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, mg] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, wl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.e9 r20) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki1.d(e9):boolean");
    }

    public final boolean e() {
        if (!this.h) {
            return false;
        }
        return true;
    }

    public final boolean f(long j, long j2) {
        if (this.l) {
            j2 = 0;
        }
        if (j > j2) {
            return true;
        }
        return false;
    }

    public final void g() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = j21.b;
        long nanoTime = System.nanoTime() - j21.a;
        long j5 = this.o;
        long j6 = 0;
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j5) {
                r40 r40Var = s40.f;
            } else {
                if (j5 < 0) {
                    j4 = s40.h;
                } else {
                    j4 = s40.g;
                }
                j6 = s40.g(j4);
            }
        } else if ((1 | (nanoTime - 1)) == Long.MAX_VALUE) {
            if (nanoTime < 0) {
                j2 = s40.h;
            } else {
                j2 = s40.g;
            }
            j6 = j2;
        } else {
            long j7 = nanoTime - j5;
            long j8 = (j7 ^ nanoTime) & (~(j7 ^ j5));
            v40 v40Var = v40.NANOSECONDS;
            if (j8 < 0) {
                v40 v40Var2 = v40.MILLISECONDS;
                if (v40Var.compareTo(v40Var2) < 0) {
                    long j9 = (nanoTime / 1000000) - (j5 / 1000000);
                    long j10 = (nanoTime % 1000000) - (j5 % 1000000);
                    r40 r40Var2 = s40.f;
                    j6 = s40.e(vn.N(j9, v40Var2), vn.N(j10, v40Var));
                } else {
                    if (j7 < 0) {
                        j = s40.h;
                    } else {
                        j = s40.g;
                    }
                    j6 = s40.g(j);
                }
            } else {
                j6 = vn.N(j7, v40Var);
            }
        }
        long j11 = j6 >> 1;
        r40 r40Var3 = s40.f;
        if ((1 & ((int) j6)) == 0) {
            j3 = j11;
        } else if (j11 > 9223372036854L) {
            j3 = Long.MAX_VALUE;
        } else if (j11 < -9223372036854L) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = j11 * 1000000;
        }
        this.n = j3;
        long j12 = this.m - j3;
        this.m = j12;
        this.o = nanoTime;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j12);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.f + ", isCanceled = " + this.g + " }";
    }
}
