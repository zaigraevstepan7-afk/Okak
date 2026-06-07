package defpackage;

import com.google.android.filament.Engine;
import com.google.android.filament.LightManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q60 {
    public final /* synthetic */ int a;
    public final long b;

    public /* synthetic */ q60(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                long j = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Engine.nDestroyBuilder(j);
                return;
            default:
                long j2 = this.b;
                try {
                    super.finalize();
                } catch (Throwable unused2) {
                }
                LightManager.nDestroyBuilder(j2);
                return;
        }
    }
}
