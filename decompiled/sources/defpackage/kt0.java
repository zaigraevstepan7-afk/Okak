package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kt0 {
    public final p31 a;
    public final jt0 b;
    public final ls0 c;
    public final long d;
    public final /* synthetic */ ls0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ h3 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ st0 l;

    public kt0(long j, jt0 jt0Var, ls0 ls0Var, int i, int i2, h3 h3Var, int i3, int i4, long j2, st0 st0Var) {
        this.e = ls0Var;
        this.f = i;
        this.g = i2;
        this.h = h3Var;
        this.i = i3;
        this.j = i4;
        this.k = j2;
        this.l = st0Var;
        p31 p31Var = wm0.a;
        this.a = new p31();
        this.b = jt0Var;
        this.c = ls0Var;
        this.d = vs.b(us.h(j), Integer.MAX_VALUE, 5);
    }

    public final nt0 a(int i, long j) {
        long j2;
        List list;
        jt0 jt0Var = this.b;
        Object c = jt0Var.c(i);
        Object d = jt0Var.d(i);
        p31 p31Var = this.a;
        List list2 = (List) p31Var.b(i);
        int i2 = 0;
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            List b = this.c.b(i);
            int size = b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((e01) b.get(i3)).x(j));
            }
            j2 = j;
            p31Var.i(i, arrayList);
            list = arrayList;
        }
        if (i != this.f - 1) {
            i2 = this.g;
        }
        return new nt0(i, list, this.h, this.e.f.getLayoutDirection(), this.i, this.j, i2, this.k, c, d, this.l.n, j2);
    }
}
