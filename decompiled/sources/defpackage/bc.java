package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface bc {
    boolean a();

    long b();

    ec2 c();

    mc d(long j);

    default boolean e(long j) {
        if (j >= b()) {
            return true;
        }
        return false;
    }

    Object f(long j);

    Object g();
}
