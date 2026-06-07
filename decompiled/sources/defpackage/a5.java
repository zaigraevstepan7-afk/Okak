package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        b41 b41Var = q5.O0;
        synchronized (b41Var) {
            Object[] objArr = b41Var.a;
            int i = b41Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                q5.m(((q5) objArr[i2]).getRoot());
            }
        }
    }
}
