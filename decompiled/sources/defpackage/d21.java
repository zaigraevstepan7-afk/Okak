package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class d21 implements qz {
    public ut f;
    public int g;
    public d21 i;
    public d21 j;
    public y81 k;
    public e81 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public f5 q;
    public boolean r;
    public d21 e = this;
    public int h = -1;

    public boolean A0() {
        return !(this instanceof ch);
    }

    public void B0() {
        if (this.r) {
            kl0.b("node attached multiple times");
        }
        if (this.l == null) {
            kl0.b("attach invoked on a node without a coordinator");
        }
        this.r = true;
        this.o = true;
    }

    public void C0() {
        if (!this.r) {
            kl0.b("Cannot detach a node that is not attached");
        }
        if (this.o) {
            kl0.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.p) {
            kl0.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.r = false;
        ut utVar = this.f;
        if (utVar != null) {
            fp.s(utVar, new qg1("The Modifier.Node was detached", 2));
            this.f = null;
        }
    }

    public void G0() {
        if (!this.r) {
            kl0.b("reset() called on an unattached node");
        }
        F0();
    }

    public void H0() {
        if (!this.r) {
            kl0.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.o) {
            kl0.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.o = false;
        D0();
        this.p = true;
    }

    public void I0() {
        if (!this.r) {
            kl0.b("node detached multiple times");
        }
        if (this.l == null) {
            kl0.b("detach invoked on a node without a coordinator");
        }
        if (!this.p) {
            kl0.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.p = false;
        f5 f5Var = this.q;
        if (f5Var != null) {
            f5Var.invoke();
        }
        E0();
    }

    public void J0(d21 d21Var) {
        this.e = d21Var;
    }

    public void K0(e81 e81Var) {
        this.l = e81Var;
    }

    public final gv z0() {
        ut utVar = this.f;
        if (utVar == null) {
            ut b = fp.b(((q5) hp.N(this)).getCoroutineContext().G(new io0((go0) ((q5) hp.N(this)).getCoroutineContext().H(g3.O))));
            this.f = b;
            return b;
        }
        return utVar;
    }

    public void D0() {
    }

    public void E0() {
    }

    public void F0() {
    }
}
