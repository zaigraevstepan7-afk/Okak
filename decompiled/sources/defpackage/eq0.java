package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class eq0 implements gm1, av {
    public final xu e;
    public final se0 f;
    public final ut g;
    public i22 h;

    public eq0(xu xuVar, se0 se0Var) {
        this.e = xuVar;
        this.f = se0Var;
        this.g = fp.b(xuVar.G(this));
    }

    @Override // defpackage.xu
    public final xu G(xu xuVar) {
        return go.M(this, xuVar);
    }

    @Override // defpackage.xu
    public final vu H(wu wuVar) {
        return go.D(this, wuVar);
    }

    @Override // defpackage.gm1
    public final void a() {
        i22 i22Var = this.h;
        if (i22Var != null) {
            i22Var.v(new wd0(1));
        }
        this.h = null;
    }

    @Override // defpackage.gm1
    public final void d() {
        i22 i22Var = this.h;
        if (i22Var != null) {
            i22Var.v(new wd0(1));
        }
        this.h = null;
    }

    @Override // defpackage.gm1
    public final void e() {
        i22 i22Var = this.h;
        if (i22Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            i22Var.c(cancellationException);
        }
        this.h = rx.C(this.g, null, this.f, 3);
    }

    @Override // defpackage.vu
    public final wu getKey() {
        return g3.z;
    }

    @Override // defpackage.av
    public final void k(xu xuVar, Throwable th) {
        bs bsVar = (bs) xuVar.H(bs.f);
        if (bsVar != null) {
            qo.e0(th, new j1(9, bsVar, this));
        }
        av avVar = (av) this.e.H(g3.z);
        if (avVar != null) {
            avVar.k(xuVar, th);
            return;
        }
        throw th;
    }

    @Override // defpackage.xu
    public final Object p(se0 se0Var, Object obj) {
        return se0Var.invoke(obj, this);
    }

    @Override // defpackage.xu
    public final xu s(wu wuVar) {
        return go.I(this, wuVar);
    }
}
