package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class l72 implements ia0, bf0 {
    public final /* synthetic */ ps0 a;

    public l72(ps0 ps0Var) {
        this.a = ps0Var;
    }

    @Override // defpackage.bf0
    public final af0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ia0) && (obj instanceof bf0)) {
            return this.a.equals(((bf0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ia0
    public final float invoke() {
        return ((Number) this.a.get()).floatValue();
    }
}
