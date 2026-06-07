package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class q42 extends wt implements cf0 {
    public final int e;

    public q42(int i, vt vtVar) {
        super(vtVar);
        this.e = i;
    }

    @Override // defpackage.cf0
    public final int getArity() {
        return this.e;
    }

    @Override // defpackage.eh
    public final String toString() {
        if (getCompletion() == null) {
            yl1.a.getClass();
            return zl1.a(this);
        }
        return super.toString();
    }
}
