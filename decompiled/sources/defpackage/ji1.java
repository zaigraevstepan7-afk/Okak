package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ji1 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ ki1 f;

    public ji1(ki1 ki1Var, List list) {
        this.f = ki1Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            nl0.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
