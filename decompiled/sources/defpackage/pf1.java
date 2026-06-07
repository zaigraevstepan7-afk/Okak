package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pf1 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final p31 e;
    public final b52 f;

    public pf1(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            ei1.a("Invalid start index");
        }
        this.d = new ArrayList();
        p31 p31Var = new p31();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            np0 np0Var = (np0) this.a.get(i3);
            int i4 = np0Var.c;
            int i5 = np0Var.d;
            p31Var.i(i4, new zf0(i3, i2, i5));
            i2 += i5;
        }
        this.e = p31Var;
        this.f = new b52(new bz(this, 1));
    }

    public final boolean a(int i, int i2) {
        zf0 zf0Var;
        int i3;
        int i4;
        p31 p31Var = this.e;
        zf0 zf0Var2 = (zf0) p31Var.b(i);
        if (zf0Var2 == null) {
            return false;
        }
        int i5 = zf0Var2.b;
        int i6 = i2 - zf0Var2.c;
        zf0Var2.c = i2;
        if (i6 != 0) {
            Object[] objArr = p31Var.c;
            long[] jArr = p31Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j) < 128 && (i3 = (zf0Var = (zf0) objArr[(i7 << 3) + i9]).b) >= i5 && zf0Var != zf0Var2 && (i4 = i3 + i6) >= 0) {
                                zf0Var.b = i4;
                            }
                            j >>= 8;
                        }
                        if (i8 != 8) {
                            return true;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
