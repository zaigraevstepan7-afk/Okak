package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g31 {
    public final qg a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public g31(qg qgVar, long j, int i, int i2) {
        boolean z;
        pl1 pl1Var;
        int i3;
        int g;
        int i4;
        this.a = qgVar;
        this.b = i;
        if (us.j(j) != 0 || us.i(j) != 0) {
            ll0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) qgVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            ae1 ae1Var = (ae1) arrayList2.get(i5);
            m8 m8Var = ae1Var.a;
            int h = us.h(j);
            if (us.c(j)) {
                i3 = i5;
                g = us.g(j) - ((int) Math.ceil(f));
                if (g < 0) {
                    g = 0;
                }
            } else {
                i3 = i5;
                g = us.g(j);
            }
            i8 i8Var = new i8(m8Var, this.b - i6, i2, vs.b(h, g, 5));
            float b = i8Var.b() + f;
            u82 u82Var = i8Var.d;
            int i7 = i6 + u82Var.g;
            arrayList.add(new zd1(i8Var, ae1Var.b, ae1Var.c, i6, i7, f, b));
            if (!u82Var.d) {
                if (i7 == this.b) {
                    i4 = i3;
                    if (i4 != xn.A((ArrayList) this.a.e)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i7;
                f = b;
            }
            z = true;
            i6 = i7;
            f = b;
            break;
        }
        z = false;
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = us.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            zd1 zd1Var = (zd1) arrayList.get(i8);
            List list = zd1Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                pl1 pl1Var2 = (pl1) list.get(i9);
                if (pl1Var2 != null) {
                    pl1Var = zd1Var.a(pl1Var2);
                } else {
                    pl1Var = null;
                }
                arrayList4.add(pl1Var);
            }
            wn.d0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = wn.q0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public static void i(g31 g31Var, tl tlVar, ck ckVar, float f, hw1 hw1Var, x62 x62Var, d40 d40Var) {
        tlVar.h();
        ArrayList arrayList = g31Var.h;
        if (arrayList.size() <= 1) {
            c01.u(g31Var, tlVar, ckVar, f, hw1Var, x62Var, d40Var);
        } else if (ckVar instanceof i12) {
            c01.u(g31Var, tlVar, ckVar, f, hw1Var, x62Var, d40Var);
        } else if (ckVar instanceof fw1) {
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                zd1 zd1Var = (zd1) arrayList.get(i);
                f3 += zd1Var.a.b();
                f2 = Math.max(f2, zd1Var.a.d());
            }
            Shader b = ((fw1) ckVar).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                i8 i8Var = ((zd1) arrayList.get(i2)).a;
                i8Var.g(tlVar, new dk(b), f, hw1Var, x62Var, d40Var);
                tlVar.o(0.0f, i8Var.b());
                matrix.setTranslate(0.0f, -i8Var.b());
                b.setLocalMatrix(matrix);
            }
        } else {
            se.m();
            return;
        }
        tlVar.p();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ul1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [tl1, java.lang.Object] */
    public final void a(long j, float[] fArr) {
        j(d92.f(j));
        k(d92.e(j));
        ?? obj = new Object();
        obj.e = 0;
        vn.A(this.h, j, new wi(j, fArr, obj, new Object()));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.y(i, arrayList));
        i8 i8Var = zd1Var.a;
        return i8Var.d.e(i - zd1Var.d) + zd1Var.f;
    }

    public final int c(int i, boolean z) {
        int f;
        l(i);
        ArrayList arrayList = this.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.y(i, arrayList));
        i8 i8Var = zd1Var.a;
        int i2 = i - zd1Var.d;
        u82 u82Var = i8Var.d;
        if (z) {
            Layout layout = u82Var.f;
            ThreadLocal threadLocal = y82.a;
            if (layout.getEllipsisCount(i2) > 0 && u82Var.b == TextUtils.TruncateAt.END) {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            } else {
                qg c = u82Var.c();
                Layout layout2 = (Layout) c.a;
                f = c.k(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            }
        } else {
            f = u82Var.f(i2);
        }
        return f + zd1Var.b;
    }

    public final int d(int i) {
        int x;
        int length = ((rc) this.a.a).f.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            x = xn.A(arrayList);
        } else if (i < 0) {
            x = 0;
        } else {
            x = vn.x(i, arrayList);
        }
        zd1 zd1Var = (zd1) arrayList.get(x);
        i8 i8Var = zd1Var.a;
        return i8Var.d.f.getLineForOffset(zd1Var.d(i)) + zd1Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.z(arrayList, f));
        int i = zd1Var.c - zd1Var.b;
        int i2 = zd1Var.d;
        if (i == 0) {
            return i2;
        }
        i8 i8Var = zd1Var.a;
        float f2 = f - zd1Var.f;
        u82 u82Var = i8Var.d;
        return u82Var.f.getLineForVertical(((int) f2) - u82Var.h) + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.y(i, arrayList));
        i8 i8Var = zd1Var.a;
        return i8Var.d.g(i - zd1Var.d) + zd1Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        zd1 zd1Var = (zd1) arrayList.get(vn.z(arrayList, intBitsToFloat));
        int i2 = zd1Var.c;
        int i3 = zd1Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        i8 i8Var = zd1Var.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - zd1Var.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        u82 u82Var = i8Var.d;
        int lineForVertical = u82Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - u82Var.h);
        return u82Var.f.getOffsetForHorizontal(lineForVertical, (u82Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final long h(pl1 pl1Var, int i, y61 y61Var) {
        long j;
        long j2;
        float f = pl1Var.b;
        ArrayList arrayList = this.h;
        int z = vn.z(arrayList, f);
        float f2 = ((zd1) arrayList.get(z)).g;
        float f3 = pl1Var.d;
        if (f2 < f3 && z != xn.A(arrayList)) {
            int z2 = vn.z(arrayList, f3);
            long j3 = d92.b;
            while (true) {
                j = d92.b;
                if (!d92.b(j3, j) || z > z2) {
                    break;
                }
                zd1 zd1Var = (zd1) arrayList.get(z);
                j3 = zd1Var.b(zd1Var.a.c(zd1Var.c(pl1Var), i, y61Var), true);
                z++;
            }
            if (d92.b(j3, j)) {
                return j;
            }
            while (true) {
                j2 = d92.b;
                if (!d92.b(j, j2) || z > z2) {
                    break;
                }
                zd1 zd1Var2 = (zd1) arrayList.get(z2);
                j = zd1Var2.b(zd1Var2.a.c(zd1Var2.c(pl1Var), i, y61Var), true);
                z2--;
            }
            if (d92.b(j, j2)) {
                return j3;
            }
            return fr1.a((int) (j3 >> 32), (int) (4294967295L & j));
        }
        zd1 zd1Var3 = (zd1) arrayList.get(z);
        return zd1Var3.b(zd1Var3.a.c(zd1Var3.c(pl1Var), i, y61Var), true);
    }

    public final void j(int i) {
        rc rcVar = (rc) this.a.a;
        if (i >= 0 && i < rcVar.f.length()) {
            return;
        }
        StringBuilder q = l90.q("offset(", i, ") is out of bounds [0, ");
        q.append(rcVar.f.length());
        q.append(')');
        ll0.a(q.toString());
    }

    public final void k(int i) {
        rc rcVar = (rc) this.a.a;
        if (i >= 0 && i <= rcVar.f.length()) {
            return;
        }
        StringBuilder q = l90.q("offset(", i, ") is out of bounds [0, ");
        q.append(rcVar.f.length());
        q.append(AbstractJsonLexerKt.END_LIST);
        ll0.a(q.toString());
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            ll0.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
        }
    }
}
