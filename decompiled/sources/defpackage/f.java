package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class f {
    public static final bl a;
    public static final bl b;
    public static final bl c;
    public static final bl d;
    public static final bl e;

    static {
        bl blVar = bl.h;
        a = xl1.p("/");
        b = xl1.p("\\");
        c = xl1.p("/\\");
        d = xl1.p(".");
        e = xl1.p("..");
    }

    public static final int a(oe1 oe1Var) {
        bl blVar = oe1Var.e;
        if (blVar.d() != 0) {
            if (blVar.i(0) != 47) {
                if (blVar.i(0) == 92) {
                    if (blVar.d() > 2 && blVar.i(1) == 92) {
                        bl blVar2 = b;
                        blVar2.getClass();
                        int f = blVar.f(blVar2.h(), 2);
                        if (f == -1) {
                            return blVar.d();
                        }
                        return f;
                    }
                } else if (blVar.d() > 2 && blVar.i(1) == 58 && blVar.i(2) == 92) {
                    char i = (char) blVar.i(0);
                    if ('a' > i || i >= '{') {
                        if ('A' <= i && i < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
    public static final oe1 b(oe1 oe1Var, oe1 oe1Var2, boolean z) {
        oe1Var2.getClass();
        if (a(oe1Var2) != -1) {
            return oe1Var2;
        }
        if (oe1Var2.h() != null) {
            return oe1Var2;
        }
        bl c2 = c(oe1Var);
        if (c2 == null && (c2 = c(oe1Var2)) == null) {
            c2 = f(oe1.f);
        }
        ?? obj = new Object();
        obj.P(oe1Var.e);
        if (obj.f > 0) {
            obj.P(c2);
        }
        obj.P(oe1Var2.e);
        return d(obj, z);
    }

    public static final bl c(oe1 oe1Var) {
        bl blVar = oe1Var.e;
        bl blVar2 = a;
        if (bl.g(blVar, blVar2) != -1) {
            return blVar2;
        }
        bl blVar3 = oe1Var.e;
        bl blVar4 = b;
        if (bl.g(blVar3, blVar4) != -1) {
            return blVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[EDGE_INSN: B:68:0x0110->B:69:0x0110 BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v0, types: [hk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.oe1 d(defpackage.hk r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.d(hk, boolean):oe1");
    }

    public static final bl e(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return b;
            }
            se.h(l90.g(b2, "not a directory separator: "));
            return null;
        }
        return a;
    }

    public static final bl f(String str) {
        if (sn0.r(str, "/")) {
            return a;
        }
        if (sn0.r(str, "\\")) {
            return b;
        }
        se.h(l90.l("not a directory separator: ", str));
        return null;
    }
}
