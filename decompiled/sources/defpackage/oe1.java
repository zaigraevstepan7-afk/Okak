package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class oe1 implements Comparable {
    public static final String f;
    public final bl e;

    static {
        String str = File.separator;
        str.getClass();
        f = str;
    }

    public oe1(bl blVar) {
        blVar.getClass();
        this.e = blVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = f.a(this);
        bl blVar = this.e;
        if (a == -1) {
            a = 0;
        } else if (a < blVar.d() && blVar.i(a) == 92) {
            a++;
        }
        int d = blVar.d();
        int i = a;
        while (a < d) {
            if (blVar.i(a) == 47 || blVar.i(a) == 92) {
                arrayList.add(blVar.o(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < blVar.d()) {
            arrayList.add(blVar.o(i, blVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        bl blVar = f.a;
        bl blVar2 = this.e;
        int k = bl.k(blVar2, blVar);
        if (k == -1) {
            k = bl.k(blVar2, f.b);
        }
        if (k != -1) {
            blVar2 = bl.p(blVar2, k + 1, 0, 2);
        } else if (h() != null && blVar2.d() == 2) {
            blVar2 = bl.h;
        }
        return blVar2.r();
    }

    public final oe1 c() {
        bl blVar = f.d;
        bl blVar2 = this.e;
        if (!sn0.r(blVar2, blVar)) {
            bl blVar3 = f.a;
            if (!sn0.r(blVar2, blVar3)) {
                bl blVar4 = f.b;
                if (!sn0.r(blVar2, blVar4)) {
                    bl blVar5 = f.e;
                    blVar2.getClass();
                    blVar5.getClass();
                    int d = blVar2.d();
                    byte[] bArr = blVar5.e;
                    if (!blVar2.l(d - bArr.length, blVar5, bArr.length) || (blVar2.d() != 2 && !blVar2.l(blVar2.d() - 3, blVar3, 1) && !blVar2.l(blVar2.d() - 3, blVar4, 1))) {
                        int k = bl.k(blVar2, blVar3);
                        if (k == -1) {
                            k = bl.k(blVar2, blVar4);
                        }
                        if (k == 2 && h() != null) {
                            if (blVar2.d() != 3) {
                                return new oe1(bl.p(blVar2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k == 1) {
                            blVar4.getClass();
                            if (blVar2.l(0, blVar4, blVar4.d())) {
                                return null;
                            }
                        }
                        if (k == -1 && h() != null) {
                            if (blVar2.d() != 2) {
                                return new oe1(bl.p(blVar2, 0, 2, 1));
                            }
                            return null;
                        }
                        if (k == -1) {
                            return new oe1(blVar);
                        }
                        if (k == 0) {
                            return new oe1(bl.p(blVar2, 0, 1, 1));
                        }
                        return new oe1(bl.p(blVar2, 0, k, 1));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oe1 oe1Var = (oe1) obj;
        oe1Var.getClass();
        return this.e.compareTo(oe1Var.e);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [hk, java.lang.Object] */
    public final oe1 d(oe1 oe1Var) {
        oe1 oe1Var2;
        oe1 oe1Var3;
        oe1Var.getClass();
        bl blVar = oe1Var.e;
        int a = f.a(this);
        bl blVar2 = this.e;
        if (a == -1) {
            oe1Var2 = null;
        } else {
            oe1Var2 = new oe1(blVar2.o(0, a));
        }
        int a2 = f.a(oe1Var);
        if (a2 == -1) {
            oe1Var3 = null;
        } else {
            oe1Var3 = new oe1(blVar.o(0, a2));
        }
        if (sn0.r(oe1Var2, oe1Var3)) {
            ArrayList a3 = a();
            ArrayList a4 = oe1Var.a();
            int min = Math.min(a3.size(), a4.size());
            int i = 0;
            while (i < min && sn0.r(a3.get(i), a4.get(i))) {
                i++;
            }
            if (i == min && blVar2.d() == blVar.d()) {
                return wc0.k(".", false);
            }
            if (a4.subList(i, a4.size()).indexOf(f.e) == -1) {
                if (sn0.r(blVar, f.d)) {
                    return this;
                }
                ?? obj = new Object();
                bl c = f.c(oe1Var);
                if (c == null && (c = f.c(this)) == null) {
                    c = f.f(f);
                }
                int size = a4.size();
                for (int i2 = i; i2 < size; i2++) {
                    obj.P(f.e);
                    obj.P(c);
                }
                int size2 = a3.size();
                while (i < size2) {
                    obj.P((bl) a3.get(i));
                    obj.P(c);
                    i++;
                }
                return f.d(obj, false);
            }
            y61.s("Impossible relative path to resolve: ", this, " and ", oe1Var);
            return null;
        }
        y61.s("Paths of different roots cannot be relative to each other: ", this, " and ", oe1Var);
        return null;
    }

    public final oe1 e(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        return f.b(this, oe1Var, z);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof oe1) && sn0.r(((oe1) obj).e, this.e)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hk, java.lang.Object] */
    public final oe1 f(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.Y(str);
        return f.b(this, f.d(obj, false), false);
    }

    public final Path g() {
        Path path = Paths.get(this.e.r(), new String[0]);
        path.getClass();
        return path;
    }

    public final Character h() {
        bl blVar = f.a;
        bl blVar2 = this.e;
        if (bl.g(blVar2, blVar) == -1 && blVar2.d() >= 2 && blVar2.i(1) == 58) {
            char i = (char) blVar2.i(0);
            if (('a' <= i && i < '{') || ('A' <= i && i < '[')) {
                return Character.valueOf(i);
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final File toFile() {
        return new File(this.e.r());
    }

    public final String toString() {
        return this.e.r();
    }
}
