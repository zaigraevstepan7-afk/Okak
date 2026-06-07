package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class np1 {
    public final List a;
    public final float b;
    public final float c;
    public final vv0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public np1(AbstractList abstractList, float f, float f2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        char c;
        uv uvVar;
        uv uvVar2;
        List list;
        char c2;
        abstractList.getClass();
        this.a = abstractList;
        this.b = f;
        this.c = f2;
        vv0 v = xn.v();
        char c3 = 3;
        if (abstractList.size() > 0 && ((e90) abstractList.get(0)).a.size() == 3) {
            xd1 d = ((uv) ((e90) abstractList.get(0)).a.get(1)).d(0.5f);
            uv uvVar3 = (uv) d.e;
            uv uvVar4 = (uv) d.f;
            arrayList2 = xn.G(((e90) abstractList.get(0)).a.get(0), uvVar3);
            arrayList = xn.G(uvVar4, ((e90) abstractList.get(0)).a.get(2));
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            uvVar = null;
            uvVar2 = null;
            while (true) {
                if (i == 0 && arrayList != null) {
                    list = arrayList;
                } else if (i == this.a.size()) {
                    if (arrayList2 == null) {
                        c = c3;
                        break;
                    }
                    list = arrayList2;
                } else {
                    list = ((e90) this.a.get(i)).a;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    uv uvVar5 = (uv) list.get(i2);
                    if (!uvVar5.f()) {
                        if (uvVar2 != null) {
                            v.add(uvVar2);
                        }
                        c2 = c3;
                        if (uvVar == null) {
                            uvVar = uvVar5;
                            uvVar2 = uvVar;
                        } else {
                            uvVar2 = uvVar5;
                        }
                    } else {
                        c2 = c3;
                        if (uvVar2 != null) {
                            float[] fArr = uvVar2.a;
                            fArr[6] = uvVar5.a();
                            fArr[7] = uvVar5.b();
                        }
                    }
                    i2++;
                    c3 = c2;
                }
                c = c3;
                if (i == size) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 3;
            uvVar = null;
            uvVar2 = null;
        }
        if (uvVar2 != null && uvVar != null) {
            float[] fArr2 = uvVar2.a;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = fArr2[2];
            float f6 = fArr2[c];
            float f7 = fArr2[4];
            float f8 = fArr2[5];
            float[] fArr3 = uvVar.a;
            v.add(xn.a(f3, f4, f5, f6, f7, f8, fArr3[0], fArr3[1]));
        }
        vv0 s = xn.s(v);
        this.d = s;
        Object obj = s.get(s.a() - 1);
        int a = s.a();
        int i3 = 0;
        while (i3 < a) {
            uv uvVar6 = (uv) this.d.get(i3);
            uv uvVar7 = (uv) obj;
            if (Math.abs(uvVar6.a[0] - uvVar7.a()) <= 1.0E-4f && Math.abs(uvVar6.a[1] - uvVar7.b()) <= 1.0E-4f) {
                i3++;
                obj = uvVar6;
            } else {
                se.h("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
        }
    }

    public static float[] a(np1 np1Var, float[] fArr, int i) {
        float[] fArr2;
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 1;
        char c6 = 4;
        if ((i & 1) != 0) {
            fArr2 = new float[4];
        } else {
            fArr2 = fArr;
        }
        vv0 vv0Var = np1Var.d;
        if (fArr2.length >= 4) {
            int a = vv0Var.a();
            float f = Float.MIN_VALUE;
            char c7 = 0;
            float f2 = Float.MAX_VALUE;
            float f3 = Float.MAX_VALUE;
            int i2 = 0;
            float f4 = Float.MIN_VALUE;
            while (i2 < a) {
                uv uvVar = (uv) vv0Var.get(i2);
                uvVar.getClass();
                boolean f5 = uvVar.f();
                float[] fArr3 = uvVar.a;
                if (f5) {
                    fArr2[c7] = fArr3[c7];
                    fArr2[c5] = fArr3[c5];
                    fArr2[2] = fArr3[c7];
                    fArr2[3] = fArr3[c5];
                    c = c5;
                    c2 = c6;
                    c3 = c7;
                    c4 = 2;
                } else {
                    c = c5;
                    float min = Math.min(fArr3[c7], uvVar.a());
                    c2 = c6;
                    float min2 = Math.min(fArr3[c], uvVar.b());
                    c3 = c7;
                    float max = Math.max(fArr3[c7], uvVar.a());
                    float max2 = Math.max(fArr3[c], uvVar.b());
                    c4 = 2;
                    fArr2[c3] = Math.min(min, Math.min(fArr3[2], fArr3[c2]));
                    fArr2[c] = Math.min(min2, Math.min(fArr3[3], fArr3[5]));
                    fArr2[2] = Math.max(max, Math.max(fArr3[2], fArr3[c2]));
                    fArr2[3] = Math.max(max2, Math.max(fArr3[3], fArr3[5]));
                }
                f2 = Math.min(f2, fArr2[c3]);
                f3 = Math.min(f3, fArr2[c]);
                f = Math.max(f, fArr2[c4]);
                f4 = Math.max(f4, fArr2[3]);
                i2++;
                c7 = c3;
                c6 = c2;
                c5 = c;
            }
            fArr2[c7] = f2;
            fArr2[c5] = f3;
            fArr2[2] = f;
            fArr2[3] = f4;
            return fArr2;
        }
        se.h("Required bounds size of 4");
        return null;
    }

    public final np1 b() {
        float[] a = a(this, null, 3);
        float f = a[2] - a[0];
        float f2 = a[3] - a[1];
        float max = Math.max(f, f2);
        return c(new mp1(((max - f) / 2.0f) - a[0], max, ((max - f2) / 2.0f) - a[1]));
    }

    public final np1 c(ih1 ih1Var) {
        long a0 = lo.a0(ha0.a(this.b, this.c), ih1Var);
        vv0 v = xn.v();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v.add(((e90) list.get(i)).a(ih1Var));
        }
        return new np1(xn.s(v), lo.G(a0), lo.H(a0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np1)) {
            return false;
        }
        return sn0.r(this.a, ((np1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + wn.m0(this.d, null, null, null, null, 63) + " || Features = " + wn.m0(this.a, null, null, null, null, 63) + " || Center = (" + this.b + ", " + this.c + ")]";
    }
}
