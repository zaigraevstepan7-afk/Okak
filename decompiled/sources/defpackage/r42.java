package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr42;", "Li21;", "Lw42;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class r42 extends i21 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public r42(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r42) {
                r42 r42Var = (r42) obj;
                if (sn0.r(this.a, r42Var.a) && sn0.r(this.b, r42Var.b) && this.c == r42Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new w42(this.a, this.b, this.c);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        w42 w42Var = (w42) d21Var;
        Object obj = w42Var.s;
        Object obj2 = this.a;
        boolean z = true;
        boolean z2 = !sn0.r(obj, obj2);
        w42Var.s = obj2;
        Object obj3 = w42Var.t;
        Object obj4 = this.b;
        if (!sn0.r(obj3, obj4)) {
            z2 = true;
        }
        w42Var.t = obj4;
        Class<?> cls = w42Var.u.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass()) {
            z = z2;
        }
        if (z) {
            w42Var.N0();
        }
        w42Var.u = pointerInputEventHandler;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return this.c.hashCode() + ((i3 + i2) * 961);
    }
}
