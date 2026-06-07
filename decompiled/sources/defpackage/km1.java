package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class km1 implements gv, gm1 {
    public static final sl h = new sl(0);
    public final xu e;
    public final km1 f = this;
    public volatile xu g;

    public km1(xu xuVar) {
        this.e = xuVar;
    }

    @Override // defpackage.gv
    public final xu A() {
        xu xuVar;
        xu xuVar2;
        xu xuVar3 = this.g;
        if (xuVar3 == null || xuVar3 == h) {
            bs bsVar = (bs) this.e.H(bs.f);
            if (bsVar != null) {
                xuVar = new jm1(bsVar, this);
            } else {
                xuVar = j60.e;
            }
            synchronized (this.f) {
                try {
                    xu xuVar4 = this.g;
                    if (xuVar4 == null) {
                        xu xuVar5 = this.e;
                        xuVar2 = xuVar5.G(new io0((go0) xuVar5.H(g3.O))).G(j60.e).G(xuVar);
                    } else if (xuVar4 == h) {
                        xu xuVar6 = this.e;
                        io0 io0Var = new io0((go0) xuVar6.H(g3.O));
                        io0Var.u(new wd0(0));
                        xuVar2 = xuVar6.G(io0Var).G(j60.e).G(xuVar);
                    } else {
                        xuVar2 = xuVar4;
                    }
                    this.g = xuVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            xuVar3 = xuVar2;
        }
        xuVar3.getClass();
        return xuVar3;
    }

    @Override // defpackage.gm1
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.f) {
            try {
                xu xuVar = this.g;
                if (xuVar == null) {
                    this.g = h;
                } else {
                    lo.o(xuVar, new wd0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gm1
    public final void d() {
        b();
    }

    @Override // defpackage.gm1
    public final void e() {
    }
}
