package defpackage;

import kotlinx.serialization.json.JsonElement;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l90 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};

    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, k92 k92Var) {
        return (k92Var.hashCode() + i) * i2;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int e(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mp, java.lang.RuntimeException] */
    public static mp f(String str) {
        kl0.c(str);
        return new RuntimeException();
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(oe1 oe1Var, String str) {
        return str + oe1Var;
    }

    public static String i(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String j(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String k(String str, long j) {
        return str + j;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder q(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void r(int i, int i2, int i3, int i4, int i5) {
        vn.i(i);
        vn.i(i2);
        vn.i(i3);
        vn.i(i4);
        vn.i(i5);
    }

    public static void s(int i, ur urVar, int i2, gb gbVar) {
        urVar.h0(Integer.valueOf(i));
        urVar.b(gbVar, Integer.valueOf(i2));
    }

    public static void t(int i, ur urVar, gb gbVar, ur urVar2, i5 i5Var) {
        op1.l(urVar, Integer.valueOf(i), gbVar);
        op1.o(urVar2, i5Var);
    }

    public static void u(long j, StringBuilder sb, String str) {
        sb.append((Object) co.i(j));
        sb.append(str);
    }

    public static void v(ld ldVar, long j) {
        ldVar.h().p();
        ldVar.u(j);
    }

    public static void w(Class cls, StringBuilder sb, String str, JsonElement jsonElement, String str2) {
        sb.append(yl1.a(cls).d());
        sb.append(str);
        sb.append(yl1.a(jsonElement.getClass()).d());
        sb.append(str2);
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj == null) {
            return;
        }
        se.s();
    }

    public static /* synthetic */ int y(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] z(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
