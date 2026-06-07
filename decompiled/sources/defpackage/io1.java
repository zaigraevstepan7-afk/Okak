package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class io1 implements c00 {
    public int e;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i;
    public float j;
    public long k;
    public long l;
    public float m;
    public float n;
    public long o;
    public kw1 p;
    public boolean q;
    public long r;
    public c00 s;
    public jq0 t;
    public int u;
    public lo v;

    public io1() {
        long j = wf0.a;
        this.k = j;
        this.l = j;
        this.n = 8.0f;
        this.o = cb2.b;
        this.p = d6.w;
        this.r = 9205357640488583168L;
        this.s = io.a();
        this.t = jq0.e;
        this.u = 3;
    }

    @Override // defpackage.c00
    public final float P() {
        return this.s.P();
    }

    @Override // defpackage.c00
    public final float a() {
        return this.s.a();
    }

    public final void b() {
        j(1.0f);
        k(1.0f);
        c(1.0f);
        r(0.0f);
        l(0.0f);
        long j = wf0.a;
        e(j);
        n(j);
        i(0.0f);
        if (this.n != 8.0f) {
            this.e |= 2048;
            this.n = 8.0f;
        }
        o(cb2.b);
        m(d6.w);
        h(false);
        if (this.u != 3) {
            this.e |= 524288;
            this.u = 3;
        }
        this.r = 9205357640488583168L;
        this.v = null;
        this.e = 0;
    }

    public final void c(float f) {
        if (this.h == f) {
            return;
        }
        this.e |= 4;
        this.h = f;
    }

    public final void e(long j) {
        if (!co.c(this.k, j)) {
            this.e |= 64;
            this.k = j;
        }
    }

    public final void h(boolean z) {
        if (this.q != z) {
            this.e |= 16384;
            this.q = z;
        }
    }

    public final void i(float f) {
        if (this.m == f) {
            return;
        }
        this.e |= 1024;
        this.m = f;
    }

    public final void j(float f) {
        if (this.f == f) {
            return;
        }
        this.e |= 1;
        this.f = f;
    }

    public final void k(float f) {
        if (this.g == f) {
            return;
        }
        this.e |= 2;
        this.g = f;
    }

    public final void l(float f) {
        if (this.j == f) {
            return;
        }
        this.e |= 32;
        this.j = f;
    }

    public final void m(kw1 kw1Var) {
        if (!sn0.r(this.p, kw1Var)) {
            this.e |= SharedConstants.DefaultBufferSize;
            this.p = kw1Var;
        }
    }

    public final void n(long j) {
        if (!co.c(this.l, j)) {
            this.e |= 128;
            this.l = j;
        }
    }

    public final void o(long j) {
        if (!cb2.a(this.o, j)) {
            this.e |= 4096;
            this.o = j;
        }
    }

    public final void r(float f) {
        if (this.i == f) {
            return;
        }
        this.e |= 16;
        this.i = f;
    }
}
