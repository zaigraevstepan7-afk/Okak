package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f7 implements View.OnDragListener, m20 {
    public final o20 a;
    public final af b;
    public final e7 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, o20] */
    public f7() {
        ?? d21Var = new d21();
        d21Var.u = 0L;
        this.a = d21Var;
        this.b = new af();
        this.c = new e7(this);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [sl1, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        rg2 rg2Var = new rg2(dragEvent, 13);
        int action = dragEvent.getAction();
        tb2 tb2Var = tb2.e;
        af afVar = this.b;
        o20 o20Var = this.a;
        switch (action) {
            case 1:
                ?? obj = new Object();
                n20 n20Var = new n20(rg2Var, o20Var, obj);
                if (n20Var.invoke(o20Var) == tb2Var) {
                    fr1.w(o20Var, n20Var);
                }
                boolean z = obj.e;
                afVar.getClass();
                ve veVar = new ve(afVar);
                while (veVar.hasNext()) {
                    ((o20) veVar.next()).P0();
                }
                return z;
            case 2:
                o20Var.O0(rg2Var);
                return false;
            case 3:
                return o20Var.L0();
            case 4:
                n3 n3Var = new n3(rg2Var, 12);
                if (n3Var.invoke(o20Var) == tb2Var) {
                    fr1.w(o20Var, n3Var);
                }
                afVar.clear();
                return false;
            case 5:
                o20Var.M0();
                return false;
            case 6:
                o20Var.N0();
                return false;
            default:
                return false;
        }
    }
}
