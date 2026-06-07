package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class gp implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (oe0 oe0Var : (oe0[]) obj3) {
                    int p = hp.p((Comparable) oe0Var.invoke(obj), (Comparable) oe0Var.invoke(obj2));
                    if (p != 0) {
                        return p;
                    }
                }
                return 0;
            default:
                return ((Number) ((se0) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
