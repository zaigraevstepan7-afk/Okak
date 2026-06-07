package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q51 implements Comparable {
    public final r51 e;
    public final Bundle f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public q51(r51 r51Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.e = r51Var;
        this.f = bundle;
        this.g = z;
        this.h = i;
        this.i = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q51 q51Var) {
        q51Var.getClass();
        boolean z = q51Var.i;
        boolean z2 = q51Var.g;
        Bundle bundle = q51Var.f;
        boolean z3 = this.g;
        if (!z3 || z2) {
            if (z3 || !z2) {
                int i = this.h - q51Var.h;
                if (i <= 0) {
                    if (i >= 0) {
                        Bundle bundle2 = this.f;
                        if (bundle2 == null || bundle != null) {
                            if (bundle2 != null || bundle == null) {
                                if (bundle2 != null) {
                                    int size = bundle2.size();
                                    bundle.getClass();
                                    int size2 = size - bundle.size();
                                    if (size2 <= 0) {
                                        if (size2 < 0) {
                                            return -1;
                                        }
                                    } else {
                                        return 1;
                                    }
                                }
                                boolean z4 = this.i;
                                if (z4 && !z) {
                                    return 1;
                                }
                                if (!z4 && z) {
                                    return -1;
                                }
                                return 0;
                            }
                            return -1;
                        }
                        return 1;
                    }
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        return 1;
    }
}
