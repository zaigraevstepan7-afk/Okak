package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jp {
    public final Object a;
    public final kl b;
    public final te0 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ jp(java.lang.Object r3, defpackage.kl r4, defpackage.te0 r5, java.lang.Throwable r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp.<init>(java.lang.Object, kl, te0, java.lang.Throwable, int):void");
    }

    public static jp a(jp jpVar, kl klVar, Throwable th, int i) {
        Object obj = jpVar.a;
        if ((i & 2) != 0) {
            klVar = jpVar.b;
        }
        kl klVar2 = klVar;
        te0 te0Var = jpVar.c;
        Object obj2 = jpVar.d;
        if ((i & 16) != 0) {
            th = jpVar.e;
        }
        return new jp(obj, klVar2, te0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        if (sn0.r(this.a, jpVar.a) && sn0.r(this.b, jpVar.b) && sn0.r(this.c, jpVar.c) && sn0.r(this.d, jpVar.d) && sn0.r(this.e, jpVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        kl klVar = this.b;
        if (klVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = klVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        te0 te0Var = this.c;
        if (te0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = te0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public jp(Object obj, kl klVar, te0 te0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = klVar;
        this.c = te0Var;
        this.d = obj2;
        this.e = th;
    }
}
