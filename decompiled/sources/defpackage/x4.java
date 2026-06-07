package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x4 implements on {
    public final ClipboardManager a;

    public x4(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.a = (ClipboardManager) systemService;
    }
}
