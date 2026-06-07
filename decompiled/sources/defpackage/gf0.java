package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gf0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public gf0(int i, int i2, int i3, w82 w82Var) {
        this.a = 2;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = w82Var;
    }

    public vt1 a(int i) {
        return new vt1(op1.j((w82) this.e, i), i, 1L);
    }

    public int b() {
        return this.d - this.c;
    }

    public int c(int i) {
        return ((pb1) this.e).f[this.c + i];
    }

    public Object d(int i) {
        return ((pb1) this.e).h[this.d + i];
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "";
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                w82 w82Var = (w82) this.e;
                sb.append(op1.j(w82Var, i));
                sb.append(AbstractJsonLexerKt.COMMA);
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(op1.j(w82Var, i2));
                sb.append("), prevOffset=");
                return l90.o(sb, this.d, ')');
        }
    }

    public gf0(pb1 pb1Var) {
        this.a = 1;
        this.e = pb1Var;
    }

    public /* synthetic */ gf0(int i) {
        this.a = i;
    }
}
