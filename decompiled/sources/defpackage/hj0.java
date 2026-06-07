package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hj0 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final gj0 j;
    public boolean k;

    public hj0(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2;
        int i3;
        boolean z2;
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 32) != 0) {
            j2 = co.g;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            i3 = 5;
        } else {
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        gj0 gj0Var = new gj0(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = gj0Var;
        arrayList.add(gj0Var);
    }

    public static void a(hj0 hj0Var, ArrayList arrayList, i12 i12Var) {
        if (hj0Var.k) {
            kl0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((gj0) hj0Var.i.get(r0.size() - 1)).j.add(new pe2("", arrayList, 0, i12Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final ij0 b() {
        if (this.k) {
            kl0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() > 1) {
                if (this.k) {
                    kl0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                gj0 gj0Var = (gj0) arrayList.remove(arrayList.size() - 1);
                ((gj0) arrayList.get(arrayList.size() - 1)).j.add(new le2(gj0Var.a, gj0Var.b, gj0Var.c, gj0Var.d, gj0Var.e, gj0Var.f, gj0Var.g, gj0Var.h, gj0Var.i, gj0Var.j));
            } else {
                gj0 gj0Var2 = this.j;
                ij0 ij0Var = new ij0(this.a, this.b, this.c, this.d, this.e, new le2(gj0Var2.a, gj0Var2.b, gj0Var2.c, gj0Var2.d, gj0Var2.e, gj0Var2.f, gj0Var2.g, gj0Var2.h, gj0Var2.i, gj0Var2.j), this.f, this.g, this.h);
                this.k = true;
                return ij0Var;
            }
        }
    }
}
