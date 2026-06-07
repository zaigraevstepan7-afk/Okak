package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bm {
    public final ki a;
    public final oe0 b;
    public final f22 c;

    public bm(ki kiVar, oe0 oe0Var, f22 f22Var) {
        this.a = kiVar;
        this.b = oe0Var;
        this.c = f22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bm) {
            bm bmVar = (bm) obj;
            if (this.a.equals(bmVar.a) && this.b.equals(bmVar.b) && this.c.equals(bmVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
