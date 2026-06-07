package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a00 implements kv1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final af0 c;

    public a00(CharSequence charSequence, h8 h8Var) {
        this.a = 0;
        charSequence.getClass();
        this.b = charSequence;
        this.c = h8Var;
    }

    @Override // defpackage.kv1
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new zz(this);
            case 1:
                return new r90(this);
            default:
                return new if0(this);
        }
    }

    public /* synthetic */ a00(int i, oe0 oe0Var, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = oe0Var;
    }
}
