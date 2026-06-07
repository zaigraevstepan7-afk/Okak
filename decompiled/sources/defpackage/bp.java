package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bp implements e21 {
    public final e21 a;
    public final e21 b;

    public bp(e21 e21Var, e21 e21Var2) {
        this.a = e21Var;
        this.b = e21Var2;
    }

    @Override // defpackage.e21
    public final Object a(se0 se0Var, Object obj) {
        return this.b.a(se0Var, this.a.a(se0Var, obj));
    }

    @Override // defpackage.e21
    public final boolean c(oe0 oe0Var) {
        if (this.a.c(oe0Var) && this.b.c(oe0Var)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bp) {
            bp bpVar = (bp) obj;
            if (this.a.equals(bpVar.a) && sn0.r(this.b, bpVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) a(gb.h, "")) + AbstractJsonLexerKt.END_LIST;
    }
}
