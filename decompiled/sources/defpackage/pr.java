package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pr {
    public final ur a;
    public am b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final fn0 d = new fn0();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public pr(ur urVar, am amVar) {
        this.a = urVar;
        this.b = amVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.g++;
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            pb1 pb1Var = this.b.d;
            pb1Var.e0(lb1.c);
            pb1Var.f[pb1Var.g - pb1Var.d[pb1Var.e - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            am amVar = this.b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            amVar.getClass();
            if (size != 0) {
                pb1 pb1Var2 = amVar.d;
                pb1Var2.e0(oa1.c);
                vn.K(pb1Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                pb1 pb1Var = this.b.d;
                pb1Var.e0(db1.c);
                int i3 = pb1Var.g - pb1Var.d[pb1Var.e - 1].a;
                int[] iArr = pb1Var.f;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                pb1 pb1Var2 = this.b.d;
                pb1Var2.e0(za1.c);
                int i6 = pb1Var2.g - pb1Var2.d[pb1Var2.e - 1].a;
                int[] iArr2 = pb1Var2.f;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        int i;
        fz1 fz1Var = this.a.G;
        if (z) {
            i = fz1Var.i;
        } else {
            i = fz1Var.g;
        }
        int i2 = i - this.f;
        if (i2 < 0) {
            vr.a("Tried to seek backward");
        }
        if (i2 > 0) {
            pb1 pb1Var = this.b.d;
            pb1Var.e0(ha1.c);
            pb1Var.f[pb1Var.g - pb1Var.d[pb1Var.e - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                vr.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
