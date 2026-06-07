package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class am0 extends d21 implements ub2 {
    public th2 s;
    public th2 t;

    public am0() {
        v90 v90Var = bf.i1;
        this.s = v90Var;
        this.t = v90Var;
    }

    @Override // defpackage.d21
    public void D0() {
        fr1.t(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zl0(this, 1));
        M0();
    }

    @Override // defpackage.d21
    public void E0() {
        this.t = this.s;
        fr1.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zl0(this, 0));
    }

    @Override // defpackage.d21
    public final void F0() {
        this.s = bf.i1;
    }

    public abstract th2 L0(th2 th2Var);

    public void M0() {
        this.t = L0(this.s);
        fr1.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zl0(this, 0));
    }

    @Override // defpackage.ub2
    public final Object m() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
