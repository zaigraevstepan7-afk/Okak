package defpackage;

import java.util.logging.Logger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class zj2 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        boolean z;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z = i32.G(message, "getsockname failed", false);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
