package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface c21 extends e21 {
    @Override // defpackage.e21
    default Object a(se0 se0Var, Object obj) {
        return se0Var.invoke(obj, this);
    }

    @Override // defpackage.e21
    default boolean c(oe0 oe0Var) {
        return ((Boolean) oe0Var.invoke(this)).booleanValue();
    }
}
