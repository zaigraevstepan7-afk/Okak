package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z62 {
    public final rc a;
    public final k92 b;
    public final boolean e;
    public final c00 g;
    public final cd0 h;
    public qg j;
    public jq0 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = l60.e;

    public z62(rc rcVar, k92 k92Var, boolean z, c00 c00Var, cd0 cd0Var, int i) {
        this.a = rcVar;
        this.b = k92Var;
        this.e = z;
        this.g = c00Var;
        this.h = cd0Var;
    }

    public final void a(jq0 jq0Var) {
        qg qgVar = this.j;
        if (qgVar == null || jq0Var != this.k || qgVar.a()) {
            this.k = jq0Var;
            qgVar = new qg(this.a, op1.p(this.b, jq0Var), this.i, this.g, this.h);
        }
        this.j = qgVar;
    }
}
