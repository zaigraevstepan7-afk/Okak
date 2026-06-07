package defpackage;

import android.content.Context;
import com.google.protobuf.DescriptorProtos;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i5 extends cq0 implements oe0 {
    public static final i5 A;
    public static final i5 B;
    public static final i5 C;
    public static final i5 D;
    public static final i5 E;
    public static final i5 F;
    public static final i5 G;
    public static final i5 H;
    public static final i5 I;
    public static final i5 f;
    public static final i5 g;
    public static final i5 h;
    public static final i5 i;
    public static final i5 j;
    public static final i5 k;
    public static final i5 l;
    public static final i5 m;
    public static final i5 n;
    public static final i5 o;
    public static final i5 p;
    public static final i5 q;
    public static final i5 r;
    public static final i5 s;
    public static final i5 t;
    public static final i5 u;
    public static final i5 v;
    public static final i5 w;
    public static final i5 x;
    public static final i5 y;
    public static final i5 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 1;
        f = new i5(i2, 0);
        g = new i5(i2, 1);
        h = new i5(i2, 2);
        i = new i5(i2, 3);
        j = new i5(i2, 4);
        k = new i5(i2, 5);
        l = new i5(i2, 6);
        m = new i5(i2, 7);
        n = new i5(i2, 8);
        o = new i5(i2, 9);
        p = new i5(i2, 10);
        q = new i5(i2, 11);
        r = new i5(i2, 12);
        s = new i5(i2, 13);
        t = new i5(i2, 14);
        u = new i5(i2, 15);
        v = new i5(i2, 16);
        w = new i5(i2, 17);
        x = new i5(i2, 18);
        y = new i5(i2, 19);
        z = new i5(i2, 20);
        A = new i5(i2, 21);
        B = new i5(i2, 22);
        C = new i5(i2, 23);
        D = new i5(i2, 24);
        E = new i5(i2, 25);
        F = new i5(i2, 26);
        G = new i5(i2, 27);
        H = new i5(i2, 28);
        I = new i5(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        ar0 ar0Var;
        int i2 = this.e;
        od2 od2Var = od2.a;
        switch (i2) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(((ru1) obj).k().e.c(vu1.A));
            case 2:
                sf1 sf1Var = (sf1) obj;
                js jsVar = l6.a;
                sf1Var.getClass();
                xn.M(sf1Var, jsVar);
                return ((Context) xn.M(sf1Var, l6.b)).getResources();
            case 3:
                return Boolean.valueOf(((ru1) obj).k().e.c(vu1.A));
            case 4:
                ep0[] ep0VarArr = xu1.a;
                ((av1) obj).a(vu1.x, od2Var);
                return od2Var;
            case 5:
                ((Number) obj).longValue();
                return od2Var;
            case 6:
                return od2Var;
            case 7:
                ep0[] ep0VarArr2 = xu1.a;
                ((av1) obj).a(vu1.w, od2Var);
                return od2Var;
            case 8:
                return od2Var;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 10:
                long a = co.a(((co) obj).a, so.x);
                return new lc(co.d(a), co.h(a), co.g(a), co.e(a));
            case 11:
                ((Number) obj).longValue();
                return od2Var;
            case 12:
                lr lrVar = (lr) obj;
                if (lrVar instanceof ar0) {
                    ar0Var = (ar0) lrVar;
                } else {
                    ar0Var = null;
                }
                if (ar0Var != null && ar0Var.S) {
                    se.o(lrVar, "Apply is called on deactivated node ");
                    return null;
                }
                return od2Var;
            case 13:
                return Boolean.valueOf(!(((c21) obj) instanceof nr));
            case 14:
                return obj;
            case 15:
                float[] fArr = ((d01) obj).a;
                return od2Var;
            case 16:
                float[] fArr2 = ((d01) obj).a;
                return od2Var;
            case 17:
                return Boolean.valueOf(c01.q(obj));
            case 18:
                long j2 = ((cb2) obj).a;
                return new jc(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                jc jcVar = (jc) obj;
                return new cb2(yq1.a(jcVar.a, jcVar.b));
            case 20:
                return mp0.M(0.0f, 0.0f, null, 7);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                ((Number) obj).intValue();
                return 0;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                ((Number) obj).intValue();
                return 0;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return x60.c;
            case 24:
                return od2Var;
            case 25:
                return od2Var;
            case 26:
                return od2Var;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                kg1 kg1Var = (kg1) obj;
                if (kg1Var.r()) {
                    ty0 ty0Var = kg1Var.f;
                    if (!ty0Var.o) {
                        oe0 e = kg1Var.e.e();
                        i41 i41Var = ty0Var.r;
                        if (e == null) {
                            if (i41Var != null) {
                                Object[] objArr = i41Var.c;
                                long[] jArr = i41Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j3 = jArr[i3];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((255 & j3) < 128) {
                                                    ty0Var.I0((j41) objArr[(i3 << 3) + i5]);
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i4 != 8) {
                                            }
                                        }
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                }
                                i41Var.a();
                            }
                        } else {
                            ty0Var.w0(kg1Var, 9223372034707292159L, 0L);
                            ty0Var.k = e;
                        }
                    }
                }
                return od2Var;
            case 28:
                ic1 ic1Var = ((e81) obj).P;
                if (ic1Var != null) {
                    ((vf0) ic1Var).c();
                }
                return od2Var;
            default:
                e81 e81Var = (e81) obj;
                ar0 ar0Var2 = e81Var.s;
                try {
                    if (e81Var.r()) {
                        e81Var.u1(true);
                    }
                    return od2Var;
                } catch (Throwable th) {
                    ar0Var2.a0(th);
                    throw null;
                }
        }
    }
}
