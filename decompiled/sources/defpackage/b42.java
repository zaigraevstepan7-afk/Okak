package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b42 {
    public final e42 a;
    public nr0 b;
    public final a42 c = new a42(this, 2);
    public final a42 d = new a42(this, 0);
    public final a42 e = new a42(this, 1);

    public b42(e42 e42Var) {
        this.a = e42Var;
    }

    public final nr0 a() {
        nr0 nr0Var = this.b;
        if (nr0Var != null) {
            return nr0Var;
        }
        se.h("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
