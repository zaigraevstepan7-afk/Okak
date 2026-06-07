package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nb2 {
    public final w80 a;
    public final ly1 b;
    public final bm c;
    public final qr1 d;
    public final boolean e;
    public final Map f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ nb2(defpackage.w80 r3, defpackage.ly1 r4, defpackage.bm r5, defpackage.qr1 r6, java.util.LinkedHashMap r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r8 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r8 & 4
            if (r0 == 0) goto L10
            r5 = r1
        L10:
            r0 = r8 & 8
            if (r0 == 0) goto L15
            r6 = r1
        L15:
            r0 = r8 & 32
            if (r0 == 0) goto L1b
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            r8 = r8 & 64
            if (r8 == 0) goto L22
            m60 r7 = defpackage.m60.e
        L22:
            r8 = r7
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.<init>(w80, ly1, bm, qr1, java.util.LinkedHashMap, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb2)) {
            return false;
        }
        nb2 nb2Var = (nb2) obj;
        if (sn0.r(this.a, nb2Var.a) && sn0.r(this.b, nb2Var.b) && sn0.r(this.c, nb2Var.c) && sn0.r(this.d, nb2Var.d) && this.e == nb2Var.e && sn0.r(this.f, nb2Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        w80 w80Var = this.a;
        if (w80Var == null) {
            hashCode = 0;
        } else {
            hashCode = w80Var.hashCode();
        }
        int i2 = hashCode * 31;
        ly1 ly1Var = this.b;
        if (ly1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ly1Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        bm bmVar = this.c;
        if (bmVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bmVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        qr1 qr1Var = this.d;
        if (qr1Var != null) {
            i = qr1Var.hashCode();
        }
        return this.f.hashCode() + mb2.a((i4 + i) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public nb2(w80 w80Var, ly1 ly1Var, bm bmVar, qr1 qr1Var, boolean z, Map map) {
        this.a = w80Var;
        this.b = ly1Var;
        this.c = bmVar;
        this.d = qr1Var;
        this.e = z;
        this.f = map;
    }
}
