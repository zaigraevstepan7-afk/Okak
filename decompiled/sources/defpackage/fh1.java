package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fh1 extends h0 {
    @Override // defpackage.h0
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
