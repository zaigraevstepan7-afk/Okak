package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pd2 extends zu {
    public static final pd2 g = new zu();

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        vy.h.g.c(runnable, true, false);
    }

    @Override // defpackage.zu
    public final zu R(int i) {
        io.o(i);
        if (i >= a62.d) {
            return this;
        }
        return super.R(i);
    }

    @Override // defpackage.zu
    public final String toString() {
        return "Dispatchers.IO";
    }
}
