package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n51 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;

    public /* synthetic */ n51(Bundle bundle, int i) {
        this.e = i;
        this.f = bundle;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        boolean containsKey;
        int i = this.e;
        Bundle bundle = this.f;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
