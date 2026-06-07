package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r50 extends hp {
    public final /* synthetic */ s50 b;

    public r50(s50 s50Var) {
        this.b = s50Var;
    }

    @Override // defpackage.hp
    public final void F(Throwable th) {
        this.b.a.f(th);
    }

    @Override // defpackage.hp
    public final void G(q4 q4Var) {
        Set<int[]> B;
        s50 s50Var = this.b;
        s50Var.c = q4Var;
        q4 q4Var2 = s50Var.c;
        v50 v50Var = s50Var.a;
        xl1 xl1Var = v50Var.g;
        jy jyVar = v50Var.i;
        if (Build.VERSION.SDK_INT >= 34) {
            B = b60.a();
        } else {
            B = vn.B();
        }
        s50Var.b = new ld(q4Var2, xl1Var, jyVar, B);
        v50 v50Var2 = s50Var.a;
        ArrayList arrayList = new ArrayList();
        v50Var2.a.writeLock().lock();
        try {
            v50Var2.c = 1;
            arrayList.addAll(v50Var2.b);
            v50Var2.b.clear();
            v50Var2.a.writeLock().unlock();
            v50Var2.d.post(new t50(arrayList, v50Var2.c, null));
        } catch (Throwable th) {
            v50Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
