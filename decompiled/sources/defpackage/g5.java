package defpackage;

import android.content.res.Resources;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class g5 extends ef0 implements te0 {
    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            q5 q5Var = (q5) this.receiver;
            Resources resources = q5Var.getContext().getResources();
            return Boolean.valueOf(y5.a.a(q5Var, null, new sq(new d00(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((fy1) obj2).a, (oe0) obj3)));
        }
        se.s();
        return null;
    }
}
