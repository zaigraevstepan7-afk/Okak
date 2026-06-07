package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v8 extends cq0 implements oe0 {
    public final /* synthetic */ ai1 e;
    public final /* synthetic */ de0 f;
    public final /* synthetic */ ci1 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ jq0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(ai1 ai1Var, de0 de0Var, ci1 ci1Var, String str, jq0 jq0Var) {
        super(1);
        this.e = ai1Var;
        this.f = de0Var;
        this.g = ci1Var;
        this.h = str;
        this.i = jq0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        ai1 ai1Var = this.e;
        ai1Var.s.addView(ai1Var, ai1Var.t);
        ai1Var.l(this.f, this.g, this.h, this.i);
        return new m2(ai1Var, 3);
    }
}
