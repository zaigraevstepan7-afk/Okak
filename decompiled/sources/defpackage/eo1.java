package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class eo1 extends do1 implements cf0 {
    private final int arity;

    public eo1(int i, vt vtVar) {
        super(vtVar);
        this.arity = i;
    }

    @Override // defpackage.cf0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.eh
    public String toString() {
        if (getCompletion() == null) {
            yl1.a.getClass();
            return zl1.a(this);
        }
        return super.toString();
    }
}
