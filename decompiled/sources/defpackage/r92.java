package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class r92 {
    public static final ThreadLocal a = new ThreadLocal();

    public static l70 a() {
        ThreadLocal threadLocal = a;
        l70 l70Var = (l70) threadLocal.get();
        if (l70Var == null) {
            ri riVar = new ri(Thread.currentThread());
            threadLocal.set(riVar);
            return riVar;
        }
        return l70Var;
    }
}
