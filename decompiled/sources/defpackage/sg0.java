package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sg0 {
    public final ej a;
    public final ad0 b;
    public final ad0 c;

    public sg0(ej ejVar, ad0 ad0Var, ad0 ad0Var2) {
        this.a = ejVar;
        this.b = ad0Var;
        this.c = ad0Var2;
        if (ejVar.b() == 0 && ejVar.a() == 0) {
            se.h("Bounds must be non zero");
            throw null;
        }
        if (ejVar.a != 0 && ejVar.b != 0) {
            se.h("Bounding rectangle must start at the top or left window edge for folding features");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (sg0.class.equals(cls)) {
            obj.getClass();
            sg0 sg0Var = (sg0) obj;
            if (this.a.equals(sg0Var.a) && this.b == sg0Var.b && this.c == sg0Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return sg0.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
