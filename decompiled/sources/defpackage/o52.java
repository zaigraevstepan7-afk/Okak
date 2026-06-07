package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o52 implements kv1 {
    public final /* synthetic */ int a;
    public final kv1 b;
    public final oe0 c;

    public o52(kv1 kv1Var, oe0 oe0Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                kv1Var.getClass();
                this.b = kv1Var;
                this.c = oe0Var;
                return;
            default:
                this.b = kv1Var;
                this.c = oe0Var;
                return;
        }
    }

    @Override // defpackage.kv1
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new r90(this);
            default:
                return new eb2(this);
        }
    }
}
