package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class pt1 {
    public static final mt1 a = new mt1(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(mt1 mt1Var) {
        int i;
        mt1Var.getClass();
        if (mt1Var.f == null && mt1Var.g == null) {
            if (!mt1Var.d) {
                AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
                mt1 mt1Var2 = a;
                mt1 mt1Var3 = (mt1) atomicReference.getAndSet(mt1Var2);
                if (mt1Var3 == mt1Var2) {
                    return;
                }
                if (mt1Var3 != null) {
                    i = mt1Var3.c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(mt1Var3);
                    return;
                }
                mt1Var.f = mt1Var3;
                mt1Var.b = 0;
                mt1Var.c = i + SharedConstants.DefaultBufferSize;
                atomicReference.set(mt1Var);
                return;
            }
            return;
        }
        se.h("Failed requirement.");
    }

    public static final mt1 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        mt1 mt1Var = a;
        mt1 mt1Var2 = (mt1) atomicReference.getAndSet(mt1Var);
        if (mt1Var2 == mt1Var) {
            return new mt1();
        }
        if (mt1Var2 == null) {
            atomicReference.set(null);
            return new mt1();
        }
        atomicReference.set(mt1Var2.f);
        mt1Var2.f = null;
        mt1Var2.c = 0;
        return mt1Var2;
    }
}
