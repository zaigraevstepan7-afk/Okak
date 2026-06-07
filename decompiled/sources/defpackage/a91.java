package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a91 implements ge, se2 {
    public final int e;
    public int f;
    public final Object g;

    public a91(int i, int i2, x40 x40Var) {
        this.e = i;
        this.f = i2;
        this.g = new q4(new la0(i, i2, x40Var));
    }

    @Override // defpackage.ge
    public void c(int i, Object obj) {
        int i2;
        ge geVar = (ge) this.g;
        if (this.f == 0) {
            i2 = this.e;
        } else {
            i2 = 0;
        }
        geVar.c(i + i2, obj);
    }

    @Override // defpackage.ge
    public void d(Object obj) {
        this.f++;
        ((ge) this.g).d(obj);
    }

    @Override // defpackage.ge
    public void e() {
        ((ge) this.g).e();
    }

    @Override // defpackage.ge
    public void f(int i, int i2, int i3) {
        int i4;
        if (this.f == 0) {
            i4 = this.e;
        } else {
            i4 = 0;
        }
        ((ge) this.g).f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ge
    public void g(int i, int i2) {
        int i3;
        ge geVar = (ge) this.g;
        if (this.f == 0) {
            i3 = this.e;
        } else {
            i3 = 0;
        }
        geVar.g(i + i3, i2);
    }

    @Override // defpackage.qe2
    public mc h(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        return ((q4) this.g).h(j, mcVar, mcVar2, mcVar3);
    }

    @Override // defpackage.ge
    public void i() {
        if (this.f <= 0) {
            vr.a("OffsetApplier up called with no corresponding down");
        }
        this.f--;
        ((ge) this.g).i();
    }

    @Override // defpackage.ge
    public void j(int i, Object obj) {
        int i2;
        ge geVar = (ge) this.g;
        if (this.f == 0) {
            i2 = this.e;
        } else {
            i2 = 0;
        }
        geVar.j(i + i2, obj);
    }

    @Override // defpackage.ge
    public Object l() {
        return ((ge) this.g).l();
    }

    @Override // defpackage.se2
    public int m() {
        return this.f;
    }

    @Override // defpackage.ge
    public void n(se0 se0Var, Object obj) {
        ((ge) this.g).n(se0Var, obj);
    }

    @Override // defpackage.se2
    public int o() {
        return this.e;
    }

    @Override // defpackage.qe2
    public mc p(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        return ((q4) this.g).p(j, mcVar, mcVar2, mcVar3);
    }

    public a91(ge geVar, int i) {
        this.g = geVar;
        this.e = i;
    }
}
