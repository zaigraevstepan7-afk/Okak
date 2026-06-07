package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cs1 implements kc1 {
    public final int e;
    public final List f;
    public Float g = null;
    public Float h = null;
    public xr1 i = null;
    public xr1 j = null;

    public cs1(ArrayList arrayList, int i) {
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.kc1
    public final boolean r() {
        return this.f.contains(this);
    }
}
