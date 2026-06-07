package defpackage;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class gr implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i22) obj).c(null);
                return;
            default:
                b82 b82Var = (b82) obj;
                if (b82Var != null) {
                    gu0 gu0Var = b82Var.d;
                    if (gu0Var != null) {
                        gu0Var.e(d92.b);
                    }
                    gu0 gu0Var2 = b82Var.d;
                    if (gu0Var2 != null) {
                        gu0Var2.f(d92.b);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
