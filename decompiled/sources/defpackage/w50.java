package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w50 implements qy {
    public final /* synthetic */ wu0 e;

    public w50(EmojiCompatInitializer emojiCompatInitializer, wu0 wu0Var) {
        this.e = wu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.qy
    public final void i(uu0 uu0Var) {
        ms.a(Looper.getMainLooper()).postDelayed(new Object(), 500L);
        this.e.f(this);
    }
}
