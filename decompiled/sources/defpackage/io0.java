package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class io0 extends no0 {
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(go0 go0Var) {
        super(true);
        wm wmVar;
        wm wmVar2;
        boolean z = true;
        L(go0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = no0.f;
        vm vmVar = (vm) atomicReferenceFieldUpdater.get(this);
        if (vmVar instanceof wm) {
            wmVar = (wm) vmVar;
        } else {
            wmVar = null;
        }
        if (wmVar != null) {
            no0 j = wmVar.j();
            while (!j.E()) {
                vm vmVar2 = (vm) atomicReferenceFieldUpdater.get(j);
                if (vmVar2 instanceof wm) {
                    wmVar2 = (wm) vmVar2;
                } else {
                    wmVar2 = null;
                }
                if (wmVar2 != null) {
                    j = wmVar2.j();
                }
            }
            this.g = z;
        }
        z = false;
        this.g = z;
    }

    @Override // defpackage.no0
    public final boolean E() {
        return this.g;
    }

    @Override // defpackage.no0
    public final boolean F() {
        return true;
    }
}
