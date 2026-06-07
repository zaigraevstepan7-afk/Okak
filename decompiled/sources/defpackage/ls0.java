package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ls0 implements l01 {
    public final hs0 e;
    public final c42 f;
    public final is0 g;
    public final p31 h;

    public ls0(hs0 hs0Var, c42 c42Var) {
        this.e = hs0Var;
        this.f = c42Var;
        this.g = (is0) hs0Var.b.invoke();
        wm0.a();
        this.h = new p31();
    }

    @Override // defpackage.c00
    public final long G(float f) {
        return this.f.G(f);
    }

    @Override // defpackage.c00
    public final float K(int i) {
        return this.f.K(i);
    }

    @Override // defpackage.c00
    public final float M(float f) {
        return this.f.M(f);
    }

    @Override // defpackage.c00
    public final float P() {
        return this.f.P();
    }

    @Override // defpackage.mn0
    public final boolean S() {
        return this.f.S();
    }

    @Override // defpackage.c00
    public final float W(float f) {
        return this.f.W(f);
    }

    @Override // defpackage.c00
    public final float a() {
        return this.f.a();
    }

    public final List b(int i) {
        p31 p31Var = this.h;
        List list = (List) p31Var.b(i);
        if (list != null) {
            return list;
        }
        is0 is0Var = this.g;
        Object c = is0Var.c(i);
        List t = this.f.t(this.e.a(i, c, is0Var.d(i)), c);
        p31Var.i(i, t);
        return t;
    }

    @Override // defpackage.c00
    public final int d0(long j) {
        return this.f.d0(j);
    }

    @Override // defpackage.mn0
    public final jq0 getLayoutDirection() {
        return this.f.getLayoutDirection();
    }

    @Override // defpackage.l01
    public final k01 i0(int i, int i2, Map map, oe0 oe0Var, oe0 oe0Var2) {
        return this.f.i0(i, i2, map, oe0Var, oe0Var2);
    }

    @Override // defpackage.c00
    public final int j0(float f) {
        return this.f.j0(f);
    }

    @Override // defpackage.c00
    public final long n0(long j) {
        return this.f.n0(j);
    }

    @Override // defpackage.c00
    public final long p(float f) {
        return this.f.p(f);
    }

    @Override // defpackage.c00
    public final long q(long j) {
        return this.f.q(j);
    }

    @Override // defpackage.c00
    public final float r0(long j) {
        return this.f.r0(j);
    }

    @Override // defpackage.l01
    public final k01 s0(int i, int i2, Map map, oe0 oe0Var) {
        return this.f.s0(i, i2, map, oe0Var);
    }

    @Override // defpackage.c00
    public final float v(long j) {
        return this.f.v(j);
    }
}
