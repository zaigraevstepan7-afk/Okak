package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b52 implements rr0, Serializable {
    public de0 e;
    public volatile Object f;
    public final Object g;

    public b52(de0 de0Var) {
        de0Var.getClass();
        this.e = de0Var;
        this.f = xl1.s;
        this.g = this;
    }

    @Override // defpackage.rr0
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f;
        xl1 xl1Var = xl1.s;
        if (obj2 != xl1Var) {
            return obj2;
        }
        synchronized (this.g) {
            obj = this.f;
            if (obj == xl1Var) {
                de0 de0Var = this.e;
                de0Var.getClass();
                obj = de0Var.invoke();
                this.f = obj;
                this.e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f != xl1.s) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
