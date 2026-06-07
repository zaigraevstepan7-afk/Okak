package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fs1 implements us1 {
    public static final sl0 j = new sl0(new ir1(19), new hr1(25));
    public final ge1 a;
    public float f;
    public final j00 h;
    public final j00 i;
    public final ge1 b = new ge1(0);
    public final ge1 c = new ge1(0);
    public final r31 d = new r31();
    public final ge1 e = new ge1(Integer.MAX_VALUE);
    public final xy g = new xy(new hh1(this, 7));

    public fs1(int i) {
        this.a = new ge1(i);
        final int i2 = 0;
        this.h = fr1.h(new de0(this) { // from class: es1
            public final /* synthetic */ fs1 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i3 = i2;
                boolean z = false;
                fs1 fs1Var = this.f;
                switch (i3) {
                    case 0:
                        if (fs1Var.a.g() < fs1Var.e.g()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (fs1Var.a.g() > 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i3 = 1;
        this.i = fr1.h(new de0(this) { // from class: es1
            public final /* synthetic */ fs1 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i32 = i3;
                boolean z = false;
                fs1 fs1Var = this.f;
                switch (i32) {
                    case 0:
                        if (fs1Var.a.g() < fs1Var.e.g()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (fs1Var.a.g() > 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.us1
    public final boolean a() {
        return this.g.a();
    }

    @Override // defpackage.us1
    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final Object d(t41 t41Var, se0 se0Var, wt wtVar) {
        Object d = this.g.d(t41Var, se0Var, wtVar);
        if (d == hv.e) {
            return d;
        }
        return od2.a;
    }

    @Override // defpackage.us1
    public final float e(float f) {
        return this.g.e(f);
    }
}
