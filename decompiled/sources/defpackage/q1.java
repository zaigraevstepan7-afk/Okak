package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;

    public /* synthetic */ q1(int i, Collection collection) {
        this.e = 2;
        this.g = i;
        this.f = collection;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj2 = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                hg1.i((hg1) obj, (ig1) obj2, -i2, 0);
                return od2Var;
            case 1:
                hg1.i((hg1) obj, (ig1) obj2, 0, -i2);
                return od2Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ q1(int i, int i2, ig1 ig1Var) {
        this.e = i2;
        this.f = ig1Var;
        this.g = i;
    }
}
