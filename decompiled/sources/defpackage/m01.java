package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m01 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final h3 e;
    public final jq0 f;
    public final boolean g = true;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public m01(int i, int i2, List list, long j, Object obj, h3 h3Var, jq0 jq0Var) {
        int i3;
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = h3Var;
        this.f = jq0Var;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            ig1 ig1Var = (ig1) list.get(i5);
            if (!this.g) {
                i3 = ig1Var.f;
            } else {
                i3 = ig1Var.e;
            }
            i4 = Math.max(i4, i3);
        }
        this.h = i4;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        int i5;
        this.j = i;
        boolean z = this.g;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.k = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ig1 ig1Var = (ig1) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.i;
            if (z) {
                h3 h3Var = this.e;
                if (h3Var != null) {
                    iArr[i7] = h3Var.a(ig1Var.e, i2, this.f);
                    iArr[i7 + 1] = i;
                    i5 = ig1Var.f;
                } else {
                    nl0.b("null horizontalAlignment");
                    se.c();
                    return;
                }
            } else {
                iArr[i7] = i;
                iArr[i7 + 1] = Math.round((1.0f + 0.0f) * ((i3 - ig1Var.f) / 2.0f));
                i5 = ig1Var.e;
            }
            i += i5;
        }
    }
}
