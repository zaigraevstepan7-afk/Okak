package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o62 extends g62 {
    public final String b;
    public final int c;
    public final oe0 d;

    public o62(Object obj, String str, int i, oe0 oe0Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = oe0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return l90.o(sb, this.c, ')');
    }
}
