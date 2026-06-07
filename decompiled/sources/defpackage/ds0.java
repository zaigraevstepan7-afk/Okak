package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ds0 extends d21 implements b40 {
    public fs0 s;

    @Override // defpackage.d21
    public final void D0() {
        this.s.getClass();
    }

    @Override // defpackage.d21
    public final void E0() {
        fs0 fs0Var = this.s;
        fs0Var.c();
        fs0Var.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ds0) && sn0.r(this.s, ((ds0) obj).s)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        ArrayList arrayList = this.s.h;
        if (arrayList.size() <= 0) {
            cr0Var.b();
        } else {
            l90.x(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.s + ')';
    }
}
