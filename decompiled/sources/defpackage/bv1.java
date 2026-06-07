package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bv1 implements Comparator {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Comparator b;

    public bv1(bv1 bv1Var) {
        this.b = bv1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Comparator comparator = this.b;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare == 0) {
                    return ar0.V.compare(((ru1) obj).c, ((ru1) obj2).c);
                }
                return compare;
            default:
                int compare2 = ((bv1) comparator).compare(obj, obj2);
                if (compare2 == 0) {
                    return hp.p(Integer.valueOf(((ru1) obj).g), Integer.valueOf(((ru1) obj2).g));
                }
                return compare2;
        }
    }

    public bv1(Comparator comparator) {
        this.b = comparator;
    }
}
