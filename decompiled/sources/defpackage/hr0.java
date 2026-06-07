package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hr0 implements k01 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ oe0 d;
    public final /* synthetic */ ir0 e;
    public final /* synthetic */ nr0 f;
    public final /* synthetic */ oe0 g;

    public hr0(int i, int i2, Map map, oe0 oe0Var, ir0 ir0Var, nr0 nr0Var, oe0 oe0Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = oe0Var;
        this.e = ir0Var;
        this.f = nr0Var;
        this.g = oe0Var2;
    }

    @Override // defpackage.k01
    public final void a() {
        pl0 pl0Var;
        ar0 ar0Var = this.f.e;
        boolean S = this.e.S();
        oe0 oe0Var = this.g;
        if (S && (pl0Var = ar0Var.J.c.W) != null) {
            oe0Var.invoke(pl0Var.p);
        } else {
            oe0Var.invoke(ar0Var.J.c.p);
        }
    }

    @Override // defpackage.k01
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.k01
    public final int c() {
        return this.b;
    }

    @Override // defpackage.k01
    public final int d() {
        return this.a;
    }

    @Override // defpackage.k01
    public final oe0 e() {
        return this.d;
    }
}
