package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface ib2 {
    default boolean a(Enum r2, Enum r3) {
        if (r2.equals(b()) && r3.equals(c())) {
            return true;
        }
        return false;
    }

    Object b();

    Object c();
}
