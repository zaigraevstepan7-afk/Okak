package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ dd1(ArrayList arrayList, int i) {
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i;
        m01 m01Var;
        od2 od2Var;
        ArrayList arrayList;
        hg1 hg1Var;
        int i2 = this.e;
        od2 od2Var2 = od2.a;
        int i3 = 0;
        ArrayList arrayList2 = this.f;
        switch (i2) {
            case 0:
                hg1 hg1Var2 = (hg1) obj;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    m01 m01Var2 = (m01) arrayList2.get(i4);
                    List list = m01Var2.b;
                    boolean z = m01Var2.g;
                    if (m01Var2.k == Integer.MIN_VALUE) {
                        nl0.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i5 = i3;
                    while (i5 < size2) {
                        ig1 ig1Var = (ig1) list.get(i5);
                        int i6 = size;
                        long c = xm0.c((r12[r13 + 1] & 4294967295L) | (m01Var2.i[i5 * 2] << 32), m01Var2.c);
                        if (z) {
                            hg1.n(hg1Var2, ig1Var, c);
                            hg1Var = hg1Var2;
                            i = i4;
                            m01Var = m01Var2;
                            od2Var = od2Var2;
                            arrayList = arrayList2;
                        } else {
                            int i7 = jg1.b;
                            x81 x81Var = x81.n;
                            if (hg1Var2.e() == jq0.e || hg1Var2.h() == 0) {
                                i = i4;
                                m01Var = m01Var2;
                                od2Var = od2Var2;
                                hg1.b(hg1Var2, ig1Var);
                                arrayList = arrayList2;
                                hg1Var = hg1Var2;
                                ig1Var.m0(xm0.c(c, ig1Var.i), 0.0f, x81Var);
                            } else {
                                i = i4;
                                m01Var = m01Var2;
                                int h = (hg1Var2.h() - ig1Var.e) - ((int) (c >> 32));
                                od2Var = od2Var2;
                                hg1.b(hg1Var2, ig1Var);
                                ig1Var.m0(xm0.c((((int) (c & 4294967295L)) & 4294967295L) | (h << 32), ig1Var.i), 0.0f, x81Var);
                                arrayList = arrayList2;
                                hg1Var = hg1Var2;
                            }
                        }
                        i5++;
                        size = i6;
                        hg1Var2 = hg1Var;
                        arrayList2 = arrayList;
                        od2Var2 = od2Var;
                        i4 = i;
                        m01Var2 = m01Var;
                    }
                    i4++;
                    od2Var2 = od2Var2;
                    i3 = 0;
                }
                return od2Var2;
            default:
                hg1 hg1Var3 = (hg1) obj;
                int size3 = arrayList2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    hg1.i(hg1Var3, (ig1) arrayList2.get(i8), 0, 0);
                }
                return od2Var2;
        }
    }
}
