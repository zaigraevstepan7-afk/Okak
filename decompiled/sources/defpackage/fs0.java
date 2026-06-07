package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fs0 {
    public final i41 a;
    public u7 b;
    public final j41 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final e21 i;

    public fs0() {
        long[] jArr = sr1.a;
        this.a = new i41();
        j41 j41Var = tr1.a;
        this.c = new j41();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new cs0(this);
    }

    public static int e(int[] iArr, nt0 nt0Var) {
        nt0Var.getClass();
        int i = iArr[0] + nt0Var.l;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long a() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        l90.x(arrayList.get(0));
        throw null;
    }

    public final void b(int i, int i2, ArrayList arrayList, u7 u7Var, kt0 kt0Var, boolean z, boolean z2, int i3, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        j41 j41Var;
        u7 u7Var2 = this.b;
        this.b = u7Var;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            nt0 nt0Var = (nt0) arrayList.get(i12);
            int size2 = nt0Var.b.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((ig1) nt0Var.b.get(i13)).C();
            }
        }
        i41 i41Var = this.a;
        if (i41Var.i()) {
            c();
            return;
        }
        if (!z && z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        Object[] objArr = i41Var.b;
        long[] jArr = i41Var.a;
        int length = jArr.length - 2;
        j41 j41Var2 = this.c;
        int i14 = 8;
        boolean z4 = z3;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j = jArr[i15];
                j41 j41Var3 = j41Var2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    long j2 = j;
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j2 & 255) < 128) {
                            j41Var = j41Var3;
                            j41Var.a(objArr[(i15 << 3) + i17]);
                        } else {
                            j41Var = j41Var3;
                        }
                        j2 >>= 8;
                        i17++;
                        j41Var3 = j41Var;
                    }
                    j41Var2 = j41Var3;
                    if (i16 != 8) {
                        break;
                    }
                } else {
                    j41Var2 = j41Var3;
                }
                if (i15 == length) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i18 = 0; i18 < size3; i18++) {
            nt0 nt0Var2 = (nt0) arrayList.get(i18);
            Object obj = nt0Var2.g;
            List list = nt0Var2.b;
            j41Var2.l(obj);
            int size4 = list.size();
            for (int i19 = 0; i19 < size4; i19++) {
                ((ig1) list.get(i19)).C();
            }
            l90.x(i41Var.k(nt0Var2.g));
        }
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        if (z4 && u7Var2 != null) {
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    ao.c0(arrayList3, new es0(u7Var2, 2));
                }
                if (arrayList3.size() <= 0) {
                    i11 = 0;
                    Arrays.fill(iArr, 0, 1, 0);
                } else {
                    nt0 nt0Var3 = (nt0) arrayList3.get(0);
                    e(iArr, nt0Var3);
                    Object g = i41Var.g(nt0Var3.g);
                    g.getClass();
                    l90.x(g);
                    nt0Var3.a(0);
                    throw null;
                }
            } else {
                i11 = 0;
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    ao.c0(arrayList2, new es0(u7Var2, i11));
                }
                if (arrayList2.size() <= 0) {
                    Arrays.fill(iArr, i11, 1, i11);
                } else {
                    nt0 nt0Var4 = (nt0) arrayList2.get(i11);
                    e(iArr, nt0Var4);
                    Object g2 = i41Var.g(nt0Var4.g);
                    g2.getClass();
                    l90.x(g2);
                    nt0Var4.a(i11);
                    throw null;
                }
            }
        }
        Object[] objArr2 = j41Var2.b;
        long[] jArr2 = j41Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j3 = jArr2[i20];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                    int i22 = 0;
                    while (i22 < i21) {
                        if ((j3 & 255) < 128) {
                            i10 = i14;
                            l90.x(i41Var.g(objArr2[(i20 << 3) + i22]));
                        } else {
                            i10 = i14;
                        }
                        j3 >>= i10;
                        i22++;
                        i14 = i10;
                    }
                    i9 = i14;
                    if (i21 != i9) {
                        break;
                    }
                } else {
                    i9 = i14;
                }
                if (i20 == length2) {
                    break;
                }
                i20++;
                i14 = i9;
            }
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                ao.c0(arrayList4, new es0(u7Var, 3));
            }
            int size5 = arrayList4.size();
            for (int i23 = 0; i23 < size5; i23++) {
                nt0 nt0Var5 = (nt0) arrayList4.get(i23);
                Object g3 = i41Var.g(nt0Var5.g);
                g3.getClass();
                l90.x(g3);
                int e = e(iArr, nt0Var5);
                if (z) {
                    i8 = (int) (4294967295L & ((nt0) wn.g0(arrayList)).a(0));
                } else {
                    i8 = 0;
                }
                nt0Var5.c(i8 - e, i, i2);
                if (z4) {
                    d(nt0Var5, true);
                    throw null;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        } else {
            i5 = i;
            i6 = i2;
            i7 = 1;
        }
        ArrayList arrayList5 = this.g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i7) {
                ao.c0(arrayList5, new es0(u7Var, i7));
            }
            int size6 = arrayList5.size();
            for (int i24 = 0; i24 < size6; i24++) {
                nt0 nt0Var6 = (nt0) arrayList5.get(i24);
                Object g4 = i41Var.g(nt0Var6.g);
                g4.getClass();
                l90.x(g4);
                nt0Var6.c((0 - nt0Var6.l) + e(iArr, nt0Var6), i5, i6);
                if (z4) {
                    d(nt0Var6, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        j41Var2.b();
    }

    public final void c() {
        i41 i41Var = this.a;
        if (i41Var.j()) {
            Object[] objArr = i41Var.c;
            long[] jArr = i41Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) >= 128) {
                                j >>= 8;
                            } else {
                                l90.x(objArr[(i << 3) + i3]);
                                throw null;
                            }
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i41Var.a();
        }
    }

    public final void d(nt0 nt0Var, boolean z) {
        Object g = this.a.g(nt0Var.g);
        g.getClass();
        l90.x(g);
        throw null;
    }
}
