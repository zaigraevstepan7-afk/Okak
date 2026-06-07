package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fd1 implements k01 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final sb1 e;
    public final int f;
    public final int g;
    public final int h;
    public final m01 i;
    public final m01 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final xl1 n;
    public final k01 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final gv s;
    public final c00 t;
    public final long u;

    public fd1(List list, int i, int i2, int i3, sb1 sb1Var, int i4, int i5, int i6, m01 m01Var, m01 m01Var2, float f, int i7, boolean z, xl1 xl1Var, k01 k01Var, boolean z2, List list2, List list3, gv gvVar, c00 c00Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = sb1Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = m01Var;
        this.j = m01Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = xl1Var;
        this.o = k01Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = gvVar;
        this.t = c00Var;
        this.u = j;
    }

    @Override // defpackage.k01
    public final void a() {
        this.o.a();
    }

    @Override // defpackage.k01
    public final Map b() {
        return this.o.b();
    }

    @Override // defpackage.k01
    public final int c() {
        return this.o.c();
    }

    @Override // defpackage.k01
    public final int d() {
        return this.o.d();
    }

    @Override // defpackage.k01
    public final oe0 e() {
        return this.o.e();
    }

    public final fd1 f(int i) {
        int i2;
        float f;
        int i3 = this.b + this.c;
        if (!this.p) {
            List list = this.a;
            if (!list.isEmpty() && this.i != null && (i2 = this.l - i) >= 0 && i2 < i3) {
                if (i3 != 0) {
                    f = i / i3;
                } else {
                    f = 0.0f;
                }
                float f2 = this.k - f;
                if (this.j != null && f2 < 0.5f && f2 > -0.5f) {
                    m01 m01Var = (m01) wn.g0(list);
                    m01 m01Var2 = (m01) wn.n0(list);
                    int i4 = this.g;
                    int i5 = this.f;
                    if (i < 0) {
                        if (Math.min((m01Var.j + i3) - i5, (m01Var2.j + i3) - i4) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(i5 - m01Var.j, i4 - m01Var2.j) <= i) {
                        return null;
                    }
                    int size = list.size();
                    boolean z = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        ((m01) list.get(i6)).a(i);
                    }
                    List list2 = this.q;
                    int size2 = list2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((m01) list2.get(i7)).a(i);
                    }
                    List list3 = this.r;
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        ((m01) list3.get(i8)).a(i);
                    }
                    if (this.m || i > 0) {
                        z = true;
                    }
                    return new fd1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f2, i2, z, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long g() {
        k01 k01Var = this.o;
        return (k01Var.d() << 32) | (k01Var.c() & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ fd1(int r24, int r25, int r26, defpackage.sb1 r27, int r28, int r29, int r30, defpackage.xl1 r31, defpackage.k01 r32, defpackage.gv r33, defpackage.c00 r34, long r35) {
        /*
            r23 = this;
            r13 = 0
            r16 = 0
            l60 r1 = defpackage.l60.e
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r14 = r31
            r15 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd1.<init>(int, int, int, sb1, int, int, int, xl1, k01, gv, c00, long):void");
    }
}
