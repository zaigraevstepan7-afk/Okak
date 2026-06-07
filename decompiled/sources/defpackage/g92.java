package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg92;", "Li21;", "Lj92;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class g92 extends i21 {
    public final String a;
    public final k92 b;
    public final cd0 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public g92(String str, k92 k92Var, cd0 cd0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = k92Var;
        this.c = cd0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g92) {
                g92 g92Var = (g92) obj;
                if (sn0.r(this.a, g92Var.a) && sn0.r(this.b, g92Var.b) && sn0.r(this.c, g92Var.c) && this.d == g92Var.d && this.e == g92Var.e && this.f == g92Var.f && this.g == g92Var.g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, j92] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        d21Var.v = this.d;
        d21Var.w = this.e;
        d21Var.x = this.f;
        d21Var.y = this.g;
        return d21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.i21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.d21 r11) {
        /*
            r10 = this;
            j92 r11 = (defpackage.j92) r11
            r11.getClass()
            k92 r0 = r11.t
            r1 = 0
            r2 = 1
            k92 r3 = r10.b
            if (r3 == r0) goto L1a
            m12 r4 = r3.a
            m12 r0 = r0.a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r11.s
            java.lang.String r5 = r10.a
            boolean r4 = defpackage.sn0.r(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r11.s = r5
            r1 = 0
            r11.C = r1
            r1 = r2
        L2f:
            k92 r4 = r11.t
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r11.t = r3
            int r3 = r11.y
            int r5 = r10.g
            if (r3 == r5) goto L41
            r11.y = r5
            r4 = r2
        L41:
            int r3 = r11.x
            int r5 = r10.f
            if (r3 == r5) goto L4a
            r11.x = r5
            r4 = r2
        L4a:
            boolean r3 = r11.w
            boolean r5 = r10.e
            if (r3 == r5) goto L53
            r11.w = r5
            r4 = r2
        L53:
            cd0 r3 = r11.u
            cd0 r5 = r10.c
            boolean r3 = defpackage.sn0.r(r3, r5)
            if (r3 != 0) goto L60
            r11.u = r5
            r4 = r2
        L60:
            int r3 = r11.v
            int r10 = r10.d
            if (r3 != r10) goto L68
            r2 = r4
            goto L6a
        L68:
            r11.v = r10
        L6a:
            if (r1 != 0) goto L6e
            if (r2 == 0) goto L9a
        L6e:
            ce1 r10 = r11.L0()
            java.lang.String r3 = r11.s
            k92 r4 = r11.t
            cd0 r5 = r11.u
            int r6 = r11.v
            boolean r7 = r11.w
            int r8 = r11.x
            int r9 = r11.y
            r10.a = r3
            r10.b = r4
            r10.c = r5
            r10.d = r6
            r10.e = r7
            r10.f = r8
            r10.g = r9
            long r3 = r10.s
            r5 = 2
            long r3 = r3 << r5
            r5 = 2
            long r3 = r3 | r5
            r10.s = r3
            r10.c()
        L9a:
            boolean r10 = r11.r
            if (r10 != 0) goto L9f
            goto Lb9
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            h92 r10 = r11.B
            if (r10 == 0) goto Laa
        La7:
            defpackage.xp1.m(r11)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb4
        Lae:
            defpackage.hp.A(r11)
            defpackage.fp.I(r11)
        Lb4:
            if (r0 == 0) goto Lb9
            defpackage.fp.I(r11)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g92.g(d21):void");
    }

    public final int hashCode() {
        return (((mb2.a(l90.b(this.d, (this.c.hashCode() + l90.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
