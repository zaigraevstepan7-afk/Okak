package defpackage;

import android.text.SegmentFinder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ad extends SegmentFinder {
    public final /* synthetic */ h12 a;

    public ad(h12 h12Var) {
        this.a = h12Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.l(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.f(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.g(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.k(i);
    }
}
