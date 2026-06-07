package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbh;", "Li21;", "Lch;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class bh extends i21 {
    public final long a;
    public final ck b;
    public final float c;
    public final kw1 d;

    public bh(long j, mv0 mv0Var, kw1 kw1Var, int i) {
        j = (i & 1) != 0 ? co.g : j;
        mv0Var = (i & 2) != 0 ? null : mv0Var;
        this.a = j;
        this.b = mv0Var;
        this.c = 1.0f;
        this.d = kw1Var;
    }

    public final boolean equals(Object obj) {
        bh bhVar;
        if (obj instanceof bh) {
            bhVar = (bh) obj;
        } else {
            bhVar = null;
        }
        if (bhVar == null || !co.c(this.a, bhVar.a) || !sn0.r(this.b, bhVar.b) || this.c != bhVar.c || !sn0.r(this.d, bhVar.d)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, ch] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        d21Var.v = this.d;
        d21Var.w = 9205357640488583168L;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ch chVar = (ch) d21Var;
        chVar.s = this.a;
        chVar.t = this.b;
        chVar.u = this.c;
        kw1 kw1Var = chVar.v;
        kw1 kw1Var2 = this.d;
        if (!sn0.r(kw1Var, kw1Var2)) {
            chVar.v = kw1Var2;
            xp1.m(chVar);
        }
        fp.I(chVar);
    }

    public final int hashCode() {
        int i;
        int i2 = co.h;
        int hashCode = Long.hashCode(this.a) * 31;
        ck ckVar = this.b;
        if (ckVar != null) {
            i = ckVar.hashCode();
        } else {
            i = 0;
        }
        return this.d.hashCode() + l90.a(this.c, (hashCode + i) * 31, 31);
    }
}
