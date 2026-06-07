package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class i02 {
    public o02 a;
    public long b;
    public boolean c;
    public int d;

    public i02(long j, o02 o02Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = o02Var;
        this.b = j;
        nv1 nv1Var = q02.a;
        if (j != 0) {
            o02 d = d();
            long j2 = d.g;
            long[] jArr = d.h;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.f;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.e;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (q02.c) {
                i = q02.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(i02 i02Var) {
        q02.b.q(i02Var);
    }

    public final void a() {
        synchronized (q02.c) {
            b();
            p();
        }
    }

    public void b() {
        q02.d = q02.d.b(g());
    }

    public abstract void c();

    public o02 d() {
        return this.a;
    }

    public abstract oe0 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract oe0 i();

    public final i02 j() {
        ld ldVar = q02.b;
        i02 i02Var = (i02) ldVar.g();
        ldVar.q(this);
        return i02Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(u22 u22Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            q02.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(o02 o02Var) {
        this.a = o02Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract i02 u(oe0 oe0Var);
}
