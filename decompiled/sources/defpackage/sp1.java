package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sp1 {
    public float a = 0.0f;
    public boolean b = true;
    public ov c = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sp1) {
                sp1 sp1Var = (sp1) obj;
                if (Float.compare(this.a, sp1Var.a) != 0 || this.b != sp1Var.b || !sn0.r(this.c, sp1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = mb2.a(Float.hashCode(this.a) * 31, 31, this.b);
        ov ovVar = this.c;
        if (ovVar == null) {
            hashCode = 0;
        } else {
            hashCode = ovVar.b.hashCode();
        }
        return (a + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
