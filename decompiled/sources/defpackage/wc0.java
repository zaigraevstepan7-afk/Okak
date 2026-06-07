package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wc0 implements c91, tg1, fj1 {
    public final /* synthetic */ int e;

    public /* synthetic */ wc0(int i) {
        this.e = i;
    }

    public static final float e(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f;
        }
        if (i2 == -1) {
            float f9 = fArr[0];
            f4 = fArr2[0];
            f5 = f9;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f10 = fArr[i2];
            float f11 = fArr[i];
            f2 = fArr2[i2];
            f3 = f10;
            f4 = fArr2[i];
            f5 = f11;
        }
        if (f3 == f5) {
            f6 = 0.0f;
        } else {
            f6 = (abs - f3) / (f5 - f3);
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f6))) + f2) * signum;
    }

    public static final void f(wc0 wc0Var) {
        r22 r22Var;
        bg1 bg1Var;
        int i;
        Object obj;
        bg1 bg1Var2;
        r22 r22Var2 = jl1.z;
        do {
            r22Var = jl1.z;
            bg1Var = (bg1) r22Var.getValue();
            tf1 tf1Var = bg1Var.g;
            tv0 tv0Var = (tv0) tf1Var.get(wc0Var);
            if (tv0Var == null) {
                bg1Var2 = bg1Var;
            } else {
                Object obj2 = tv0Var.a;
                Object obj3 = tv0Var.b;
                yb2 yb2Var = tf1Var.e;
                if (wc0Var != null) {
                    i = wc0Var.hashCode();
                } else {
                    i = 0;
                }
                yb2 v = yb2Var.v(wc0Var, i, 0);
                if (yb2Var != v) {
                    if (v == null) {
                        tf1Var = tf1.g;
                    } else {
                        tf1Var = new tf1(v, tf1Var.f - 1);
                    }
                }
                g3 g3Var = g3.J;
                if (obj2 != g3Var) {
                    Object obj4 = tf1Var.get(obj2);
                    obj4.getClass();
                    tf1Var = tf1Var.a(obj2, new tv0(((tv0) obj4).a, obj3));
                }
                if (obj3 != g3Var) {
                    Object obj5 = tf1Var.get(obj3);
                    obj5.getClass();
                    tf1Var = tf1Var.a(obj3, new tv0(obj2, ((tv0) obj5).b));
                }
                if (obj2 != g3Var) {
                    obj = bg1Var.e;
                } else {
                    obj = obj3;
                }
                if (obj3 != g3Var) {
                    obj2 = bg1Var.f;
                }
                bg1Var2 = new bg1(obj, obj2, tf1Var);
            }
            if (bg1Var == bg1Var2) {
                return;
            }
        } while (!r22Var.i(bg1Var, bg1Var2));
    }

    public static d51 g(y50 y50Var, r51 r51Var, Bundle bundle, nu0 nu0Var, k51 k51Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        r51Var.getClass();
        nu0Var.getClass();
        return new d51(y50Var, r51Var, bundle, nu0Var, k51Var, uuid, null);
    }

    public static Typeface h(String str, sd0 sd0Var, int i) {
        Typeface create;
        if (i == 0 && sn0.r(sd0Var, sd0.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        boolean z = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i2 = sd0Var.e;
        if (i == 1) {
            z = true;
        }
        return Typeface.create(create, i2, z);
    }

    public static np1 i(wc0 wc0Var, List list, int i, int i2) {
        boolean z;
        char c;
        long j;
        List list2;
        long j2;
        float floatValue;
        float f;
        ArrayList arrayList;
        char c2 = ' ';
        long j3 = 4294967295L;
        long floatToRawIntBits = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
        if ((i2 & 8) != 0) {
            z = false;
        } else {
            z = true;
        }
        wc0Var.getClass();
        float f2 = 360.0f;
        if (z) {
            vv0 v = xn.v();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                char c3 = c2;
                xz0 xz0Var = (xz0) list.get(i3);
                wc0 wc0Var2 = yz0.a;
                long d = z81.d(xz0Var.a, floatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (d & r18)), Float.intBitsToFloat((int) (d >> c3)))) * 180.0f) / 3.1415927f));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j = j3;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(z81.c(z81.d(((xz0) list.get(i4)).a, floatToRawIntBits))));
            }
            int i5 = i * 2;
            float f3 = 360.0f / i5;
            for (int i6 = 0; i6 < i5; i6++) {
                Iterator it = xn.z(list).iterator();
                while (((zm0) it).g) {
                    int nextInt = ((tm0) it).nextInt();
                    int i7 = i6 % 2;
                    if (i7 != 0) {
                        nextInt = (list.size() - 1) - nextInt;
                    }
                    if (nextInt <= 0 && i7 != 0) {
                        f = f2;
                        arrayList = arrayList2;
                    } else {
                        wc0 wc0Var3 = yz0.a;
                        float f4 = i6 * f3;
                        if (i7 == 0) {
                            floatValue = ((Number) arrayList2.get(nextInt)).floatValue();
                        } else {
                            floatValue = (((Number) arrayList2.get(0)).floatValue() * 2.0f) + (f3 - ((Number) arrayList2.get(nextInt)).floatValue());
                        }
                        double d2 = ((f4 + floatValue) / f2) * 2.0f * 3.1415927f;
                        f = f2;
                        arrayList = arrayList2;
                        float cos = (float) Math.cos(d2);
                        float sin = (float) Math.sin(d2);
                        v.add(new xz0(z81.e(z81.f((Float.floatToRawIntBits(sin) & j) | (Float.floatToRawIntBits(cos) << c), ((Number) arrayList3.get(nextInt)).floatValue()), floatToRawIntBits), ((xz0) list.get(nextInt)).b));
                    }
                    f2 = f;
                    arrayList2 = arrayList;
                }
            }
            list2 = xn.s(v);
        } else {
            c = ' ';
            j = 4294967295L;
            float f5 = 3.1415927f;
            int size3 = list.size();
            an0 X = go.X(0, size3 * i);
            ArrayList arrayList4 = new ArrayList(yn.a0(X, 10));
            Iterator it2 = X.iterator();
            while (((zm0) it2).g) {
                int nextInt2 = ((tm0) it2).nextInt();
                wc0 wc0Var4 = yz0.a;
                int i8 = nextInt2 % size3;
                long d3 = z81.d(((xz0) list.get(i8)).a, floatToRawIntBits);
                int i9 = (int) (d3 >> 32);
                double d4 = ((((nextInt2 / size3) * 360.0f) / i) / 360.0f) * 2.0f * f5;
                long j4 = floatToRawIntBits;
                int i10 = (int) (d3 & 4294967295L);
                float intBitsToFloat = (Float.intBitsToFloat(i9) * ((float) Math.cos(d4))) - (Float.intBitsToFloat(i10) * ((float) Math.sin(d4)));
                float intBitsToFloat2 = (Float.intBitsToFloat(i10) * ((float) Math.cos(d4))) + (Float.intBitsToFloat(i9) * ((float) Math.sin(d4)));
                arrayList4.add(new xz0(z81.e((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), j4), ((xz0) list.get(i8)).b));
                floatToRawIntBits = j4;
                f5 = 3.1415927f;
            }
            list2 = arrayList4;
        }
        long j5 = floatToRawIntBits;
        int size4 = list2.size() * 2;
        float[] fArr = new float[size4];
        for (int i11 = 0; i11 < size4; i11++) {
            long j6 = ((xz0) list2.get(i11 / 2)).a;
            if (i11 % 2 == 0) {
                j2 = j6 >> c;
            } else {
                j2 = j6 & j;
            }
            fArr[i11] = Float.intBitsToFloat((int) j2);
        }
        vv0 v2 = xn.v();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            v2.add(((xz0) it3.next()).b);
        }
        return op1.a(fArr, tu.b, xn.s(v2), Float.intBitsToFloat((int) (j5 >> c)), Float.intBitsToFloat((int) (j5 & j)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hk, java.lang.Object] */
    public static oe1 k(String str, boolean z) {
        str.getClass();
        bl blVar = f.a;
        ?? obj = new Object();
        obj.Y(str);
        return f.d(obj, z);
    }

    public static oe1 l(File file) {
        String str = oe1.f;
        String file2 = file.toString();
        file2.getClass();
        return k(file2, false);
    }

    public static oe1 m(Path path) {
        String str = oe1.f;
        path.getClass();
        return k(path.toString(), false);
    }

    public static np1 n() {
        np1 np1Var = yz0.m;
        if (np1Var == null) {
            np1 b = xp1.p(9, yz0.c).c(new p2(yz0.e, 2)).b();
            yz0.m = b;
            return b;
        }
        return np1Var;
    }

    @Override // defpackage.fj1
    public void a() {
        switch (this.e) {
            case 24:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    @Override // defpackage.fj1
    public void b(int i, Object obj) {
        String str;
        switch (this.e) {
            case 24:
                return;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    return;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    return;
                }
        }
    }

    public int j() {
        switch (this.e) {
            case 15:
                return 16;
            default:
                return 8;
        }
    }

    public np1 o() {
        np1 np1Var = yz0.n;
        if (np1Var == null) {
            np1 b = i(this, xn.F(new xz0((Float.floatToRawIntBits(0.193f) << 32) | (Float.floatToRawIntBits(0.277f) & 4294967295L), new tu(2, 0.053f)), new xz0((Float.floatToRawIntBits(0.176f) << 32) | (Float.floatToRawIntBits(0.055f) & 4294967295L), new tu(2, 0.053f))), 10, 12).b();
            yz0.n = b;
            return b;
        }
        return np1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ad, code lost:
    
        if (defpackage.jp0.a(defpackage.vn.i(r9.getKeyCode()), defpackage.jp0.o) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0286, code lost:
    
        if (defpackage.jp0.a(r8, defpackage.jp0.x) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
    
        if (defpackage.jp0.a(r4, defpackage.jp0.w) != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kp0 p(android.view.KeyEvent r9) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc0.p(android.view.KeyEvent):kp0");
    }

    private final void q() {
    }

    @Override // defpackage.c91
    public int c(int i) {
        return i;
    }

    @Override // defpackage.c91
    public int d(int i) {
        return i;
    }

    private final void r(int i, Object obj) {
    }
}
