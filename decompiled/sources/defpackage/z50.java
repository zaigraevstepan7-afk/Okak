package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z50 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (v50.d()) {
                v50.a().e();
            }
        } finally {
            Trace.endSection();
        }
    }
}
