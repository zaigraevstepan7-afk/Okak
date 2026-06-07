package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class tj1 extends gl implements ep0 {
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tj1(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj1.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.gl
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ep0 getReflected() {
        if (!this.e) {
            so0 compute = compute();
            if (compute != this) {
                return (ep0) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        se.v("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override // defpackage.gl
    public final so0 compute() {
        if (this.e) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tj1) {
            tj1 tj1Var = (tj1) obj;
            if (getOwner().equals(tj1Var.getOwner()) && getName().equals(tj1Var.getName()) && getSignature().equals(tj1Var.getSignature()) && sn0.r(getBoundReceiver(), tj1Var.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof ep0)) {
            return false;
        }
        return obj.equals(compute());
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        so0 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
