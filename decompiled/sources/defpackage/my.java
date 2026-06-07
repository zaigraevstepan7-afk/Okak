package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class my implements e01 {
    public final /* synthetic */ int e;
    public final e01 f;
    public final Enum g;
    public final Enum h;

    public /* synthetic */ my(e01 e01Var, Enum r2, Enum r3, int i) {
        this.e = i;
        this.f = e01Var;
        this.g = r2;
        this.h = r3;
    }

    @Override // defpackage.e01
    public final Object C() {
        switch (this.e) {
            case 0:
                return this.f.C();
            case 1:
                return this.f.C();
            default:
                return this.f.C();
        }
    }

    @Override // defpackage.e01
    public final int Y(int i) {
        switch (this.e) {
            case 0:
                return this.f.Y(i);
            case 1:
                return this.f.Y(i);
            default:
                return this.f.Y(i);
        }
    }

    @Override // defpackage.e01
    public final int c(int i) {
        switch (this.e) {
            case 0:
                return this.f.c(i);
            case 1:
                return this.f.c(i);
            default:
                return this.f.c(i);
        }
    }

    @Override // defpackage.e01
    public final int n(int i) {
        switch (this.e) {
            case 0:
                return this.f.n(i);
            case 1:
                return this.f.n(i);
            default:
                return this.f.n(i);
        }
    }

    @Override // defpackage.e01
    public final int s(int i) {
        switch (this.e) {
            case 0:
                return this.f.s(i);
            case 1:
                return this.f.s(i);
            default:
                return this.f.s(i);
        }
    }

    @Override // defpackage.e01
    public final ig1 x(long j) {
        int Y;
        int n;
        int Y2;
        int n2;
        int Y3;
        int n3;
        int i = this.e;
        Enum r1 = this.g;
        Enum r2 = this.h;
        e01 e01Var = this.f;
        int i2 = 32767;
        switch (i) {
            case 0:
                qn0 qn0Var = (qn0) r2;
                nn0 nn0Var = (nn0) r1;
                nn0 nn0Var2 = nn0.f;
                if (qn0Var == qn0.e) {
                    if (nn0Var == nn0Var2) {
                        n = e01Var.s(us.g(j));
                    } else {
                        n = e01Var.n(us.g(j));
                    }
                    if (us.c(j)) {
                        i2 = us.g(j);
                    }
                    return new x90(n, i2, 0);
                }
                if (nn0Var == nn0Var2) {
                    Y = e01Var.c(us.h(j));
                } else {
                    Y = e01Var.Y(us.h(j));
                }
                if (us.d(j)) {
                    i2 = us.h(j);
                }
                return new x90(i2, Y, 0);
            case 1:
                q01 q01Var = (q01) r2;
                p01 p01Var = (p01) r1;
                p01 p01Var2 = p01.f;
                if (q01Var == q01.e) {
                    if (p01Var == p01Var2) {
                        n2 = e01Var.s(us.g(j));
                    } else {
                        n2 = e01Var.n(us.g(j));
                    }
                    if (us.c(j)) {
                        i2 = us.g(j);
                    }
                    return new x90(n2, i2, 1);
                }
                if (p01Var == p01Var2) {
                    Y2 = e01Var.c(us.h(j));
                } else {
                    Y2 = e01Var.Y(us.h(j));
                }
                if (us.d(j)) {
                    i2 = us.h(j);
                }
                return new x90(i2, Y2, 1);
            default:
                i81 i81Var = (i81) r2;
                h81 h81Var = (h81) r1;
                h81 h81Var2 = h81.f;
                if (i81Var == i81.e) {
                    if (h81Var == h81Var2) {
                        n3 = e01Var.s(us.g(j));
                    } else {
                        n3 = e01Var.n(us.g(j));
                    }
                    if (us.c(j)) {
                        i2 = us.g(j);
                    }
                    return new x90(n3, i2, 2);
                }
                if (h81Var == h81Var2) {
                    Y3 = e01Var.c(us.h(j));
                } else {
                    Y3 = e01Var.Y(us.h(j));
                }
                if (us.d(j)) {
                    i2 = us.h(j);
                }
                return new x90(i2, Y3, 2);
        }
    }
}
