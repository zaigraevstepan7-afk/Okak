package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nl1 implements ar1 {
    public final LinkedHashSet a = new LinkedHashSet();

    public nl1(sl0 sl0Var) {
        sl0Var.z("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.ar1
    public final Bundle a() {
        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
        fr1.o(v, "classes_to_restore", wn.A0(this.a));
        return v;
    }
}
