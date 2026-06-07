package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface e21 {
    Object a(se0 se0Var, Object obj);

    boolean c(oe0 oe0Var);

    default e21 d(e21 e21Var) {
        if (e21Var == b21.a) {
            return this;
        }
        return new bp(this, e21Var);
    }
}
