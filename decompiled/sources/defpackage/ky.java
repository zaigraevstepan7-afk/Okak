package defpackage;

import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ky implements rg0 {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ ky(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.rg0
    public final void a() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                int i2 = eg2.a;
                view.performHapticFeedback(9);
                return;
            default:
                int i3 = eg2.a;
                ((q5) view).performHapticFeedback(9);
                return;
        }
    }
}
