package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class cl1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cl1(yf2 yf2Var, ig1 ig1Var, int i) {
        this.e = 2;
        this.g = yf2Var;
        this.h = ig1Var;
        this.f = i;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        wr wrVar;
        od2 od2Var;
        wr wrVar2;
        od2 od2Var2;
        int i;
        boolean z;
        int i2;
        w82 w82Var;
        int i3 = this.e;
        od2 od2Var3 = od2.a;
        int i4 = 0;
        int i5 = this.f;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i3) {
            case 0:
                dl1 dl1Var = (dl1) obj3;
                x31 x31Var = (x31) obj2;
                wr wrVar3 = (wr) obj;
                if (dl1Var.e == i5 && sn0.r(x31Var, dl1Var.f) && (wrVar3 instanceof ds)) {
                    long[] jArr = x31Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr[i6];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8;
                                int i8 = 8 - ((~(i6 - length)) >>> 31);
                                int i9 = i4;
                                while (i9 < i8) {
                                    if ((255 & j) < 128) {
                                        int i10 = (i6 << 3) + i9;
                                        Object obj4 = x31Var.b[i10];
                                        if (x31Var.c[i10] != i5) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            i = i7;
                                            ds dsVar = (ds) wrVar3;
                                            wrVar2 = wrVar3;
                                            i41 i41Var = dsVar.k;
                                            rp1.r(i41Var, obj4, dl1Var);
                                            od2Var2 = od2Var3;
                                            if (obj4 instanceof j00) {
                                                j00 j00Var = (j00) obj4;
                                                if (!i41Var.c(j00Var)) {
                                                    rp1.s(dsVar.n, j00Var);
                                                }
                                                i41 i41Var2 = dl1Var.g;
                                                if (i41Var2 != null) {
                                                    i41Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            wrVar2 = wrVar3;
                                            od2Var2 = od2Var3;
                                            i = i7;
                                        }
                                        if (z) {
                                            x31Var.f(i10);
                                        }
                                    } else {
                                        wrVar2 = wrVar3;
                                        od2Var2 = od2Var3;
                                        i = i7;
                                    }
                                    j >>= i;
                                    i9++;
                                    i7 = i;
                                    wrVar3 = wrVar2;
                                    od2Var3 = od2Var2;
                                }
                                wrVar = wrVar3;
                                od2Var = od2Var3;
                                if (i8 != i7) {
                                    return od2Var;
                                }
                            } else {
                                wrVar = wrVar3;
                                od2Var = od2Var3;
                            }
                            if (i6 != length) {
                                i6++;
                                wrVar3 = wrVar;
                                od2Var3 = od2Var;
                                i4 = 0;
                            } else {
                                return od2Var;
                            }
                        }
                    }
                }
                return od2Var3;
            case 1:
                bs1 bs1Var = (bs1) obj3;
                ig1 ig1Var = (ig1) obj2;
                hg1 hg1Var = (hg1) obj;
                int g = bs1Var.s.a.g();
                if (g < 0) {
                    g = 0;
                }
                if (g <= i5) {
                    i5 = g;
                }
                int i11 = -i5;
                boolean z2 = bs1Var.t;
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = i11;
                }
                if (!z2) {
                    i11 = 0;
                }
                hg1Var.e = true;
                hg1.l(hg1Var, ig1Var, i2, i11);
                hg1Var.e = false;
                return od2Var3;
            default:
                yf2 yf2Var = (yf2) obj3;
                ig1 ig1Var2 = (ig1) obj2;
                hg1 hg1Var2 = (hg1) obj;
                int i12 = yf2Var.b;
                u72 u72Var = yf2Var.a;
                db2 db2Var = yf2Var.c;
                x82 x82Var = (x82) yf2Var.d.invoke();
                if (x82Var != null) {
                    w82Var = x82Var.a;
                } else {
                    w82Var = null;
                }
                u72Var.a(sb1.e, rp1.d(hg1Var2, i12, db2Var, w82Var, false, ig1Var2.e), i5, ig1Var2.f);
                hg1.k(hg1Var2, ig1Var2, 0, Math.round(-u72Var.a.g()));
                return od2Var3;
        }
    }

    public /* synthetic */ cl1(Object obj, int i, int i2, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }
}
