package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class nb1 {
    public final int a;
    public final int b;

    public /* synthetic */ nb1(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(gf0 gf0Var, ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var);

    public p3 b(gf0 gf0Var) {
        return null;
    }

    public final String toString() {
        String d = yl1.a(getClass()).d();
        if (d == null) {
            return "";
        }
        return d;
    }

    public nb1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
