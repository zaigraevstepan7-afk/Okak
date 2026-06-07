package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class js extends xj1 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public js(oe0 oe0Var) {
        super(new h2(15));
        this.c = new ks(oe0Var);
    }

    @Override // defpackage.xj1
    public final zj1 a(Object obj) {
        boolean z;
        boolean z2;
        switch (this.b) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new zj1(this, obj, z, null, true);
            default:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new zj1(this, obj, z2, (w02) this.c, true);
        }
    }

    @Override // defpackage.xj1
    public ge2 b() {
        switch (this.b) {
            case 0:
                return (ks) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(de0 de0Var) {
        super(de0Var);
        xl1 xl1Var = xl1.o;
        this.c = xl1Var;
    }
}
