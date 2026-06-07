package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nt0 {
    public final int a;
    public final List b;
    public final h3 c;
    public final jq0 d;
    public final int e;
    public final long f;
    public final Object g;
    public final Object h;
    public final fs0 i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;
    public int o = Integer.MIN_VALUE;
    public final int[] p;

    public nt0(int i, List list, h3 h3Var, jq0 jq0Var, int i2, int i3, int i4, long j, Object obj, Object obj2, fs0 fs0Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = h3Var;
        this.d = jq0Var;
        this.e = i4;
        this.f = j;
        this.g = obj;
        this.h = obj2;
        this.i = fs0Var;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            ig1 ig1Var = (ig1) list.get(i7);
            i5 += ig1Var.f;
            i6 = Math.max(i6, ig1Var.e);
        }
        this.k = i5;
        int i8 = i5 + this.e;
        this.l = i8 >= 0 ? i8 : 0;
        this.m = i6;
        this.p = new int[this.b.size() * 2];
    }

    public final long a(int i) {
        if (i == 0 && this.b.size() == 0) {
            return this.j & 4294967295L;
        }
        int[] iArr = this.p;
        return (iArr[r5 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    public final void b(hg1 hg1Var) {
        if (this.o == Integer.MIN_VALUE) {
            nl0.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ig1 ig1Var = (ig1) list.get(i);
            int i2 = ig1Var.f;
            long a = a(i);
            l90.x(this.i.a.g(this.g));
            hg1.n(hg1Var, ig1Var, xm0.c(a, this.f));
        }
    }

    public final void c(int i, int i2, int i3) {
        this.j = i;
        this.o = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ig1 ig1Var = (ig1) list.get(i4);
            int i5 = i4 * 2;
            h3 h3Var = this.c;
            if (h3Var != null) {
                int a = h3Var.a(ig1Var.e, i2, this.d);
                int[] iArr = this.p;
                iArr[i5] = a;
                iArr[i5 + 1] = i;
                i += ig1Var.f;
            } else {
                nl0.b("null horizontalAlignment when isVertical == true");
                se.c();
                return;
            }
        }
    }
}
