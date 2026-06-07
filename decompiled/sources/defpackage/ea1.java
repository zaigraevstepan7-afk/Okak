package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ea1 extends d21 implements gq0 {
    public oe0 s;
    public long t;

    @Override // defpackage.d21
    public final boolean A0() {
        return true;
    }

    @Override // defpackage.gq0
    public final void o(long j) {
        if (!en0.a(this.t, j)) {
            this.s.invoke(new en0(j));
            this.t = j;
        }
    }
}
