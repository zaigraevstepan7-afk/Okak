package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class bv {
    public static final List a;

    static {
        try {
            a = mv1.H(mv1.E(Arrays.asList(new l7()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
