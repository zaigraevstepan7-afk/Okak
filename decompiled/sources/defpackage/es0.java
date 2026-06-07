package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class es0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;

    public /* synthetic */ es0(u7 u7Var, int i) {
        this.a = i;
        this.b = u7Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        u7 u7Var = this.b;
        switch (i) {
            case 0:
                return hp.p(Integer.valueOf(u7Var.c(((nt0) obj).g)), Integer.valueOf(u7Var.c(((nt0) obj2).g)));
            case 1:
                return hp.p(Integer.valueOf(u7Var.c(((nt0) obj).g)), Integer.valueOf(u7Var.c(((nt0) obj2).g)));
            case 2:
                return hp.p(Integer.valueOf(u7Var.c(((nt0) obj2).g)), Integer.valueOf(u7Var.c(((nt0) obj).g)));
            default:
                return hp.p(Integer.valueOf(u7Var.c(((nt0) obj2).g)), Integer.valueOf(u7Var.c(((nt0) obj).g)));
        }
    }
}
