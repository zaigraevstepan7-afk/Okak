package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c20 {
    public final m31 a;
    public final m31 b;

    static {
        Float valueOf = Float.valueOf(0.0f);
        xd1 xd1Var = new xd1(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        new c20(xd1Var, new xd1(valueOf2, valueOf2));
    }

    public c20(xd1... xd1VarArr) {
        this.a = new m31(xd1VarArr.length);
        this.b = new m31(xd1VarArr.length);
        int length = xd1VarArr.length;
        int i = 0;
        while (true) {
            m31 m31Var = this.a;
            if (i < length) {
                m31Var.a(((Number) xd1VarArr[i].e).floatValue());
                this.b.a(((Number) xd1VarArr[i].f).floatValue());
                i++;
            } else {
                go.Y(m31Var);
                go.Y(this.b);
                return;
            }
        }
    }
}
