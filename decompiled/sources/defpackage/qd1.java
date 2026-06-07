package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class qd1 {
    public static final pd1 a;
    public static final fd1 b;

    static {
        pd1 pd1Var = new pd1(0);
        a = pd1Var;
        xl1 xl1Var = xl1.n;
        tt0 tt0Var = new tt0(1);
        ut b2 = fp.b(j60.e);
        long b3 = vs.b(0, 0, 15);
        b = new fd1(0, 0, 0, sb1.f, 0, 0, 0, xl1Var, tt0Var, b2, pd1Var, b3);
    }

    public static final long a(fd1 fd1Var, int i) {
        long g;
        long j = (((i * (fd1Var.b + r0)) + (-fd1Var.f)) + fd1Var.d) - fd1Var.c;
        if (fd1Var.e == sb1.f) {
            g = fd1Var.g() >> 32;
        } else {
            g = fd1Var.g() & 4294967295L;
        }
        int i2 = (int) g;
        fd1Var.n.getClass();
        long p = j - (i2 - go.p(0, 0, i2));
        if (p < 0) {
            return 0L;
        }
        return p;
    }
}
