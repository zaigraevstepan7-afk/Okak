package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sd2 implements rr0, Serializable {
    public de0 e;
    public Object f;

    @Override // defpackage.rr0
    public final Object getValue() {
        if (this.f == xl1.s) {
            de0 de0Var = this.e;
            de0Var.getClass();
            this.f = de0Var.invoke();
            this.e = null;
        }
        return this.f;
    }

    public final String toString() {
        if (this.f != xl1.s) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
