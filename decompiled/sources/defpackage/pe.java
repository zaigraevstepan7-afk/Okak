package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pe implements oe, qe {
    public final float e;
    public final boolean f;
    public final se0 g;
    public final float h;

    public pe(float f, boolean z, le leVar) {
        this.e = f;
        this.f = z;
        this.g = leVar;
        this.h = f;
    }

    @Override // defpackage.oe, defpackage.qe
    public final float a() {
        return this.h;
    }

    @Override // defpackage.oe
    public final void b(c00 c00Var, int i, int[] iArr, jq0 jq0Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length != 0) {
            int j0 = c00Var.j0(this.e);
            if (this.f && jq0Var == jq0.f) {
                int length = iArr.length - 1;
                i2 = 0;
                i3 = 0;
                while (-1 < length) {
                    int i4 = iArr[length];
                    int min = Math.min(i2, i - i4);
                    iArr2[length] = min;
                    int min2 = Math.min(j0, (i - min) - i4);
                    int i5 = iArr2[length] + i4 + min2;
                    length--;
                    i3 = min2;
                    i2 = i5;
                }
            } else {
                int length2 = iArr.length;
                i2 = 0;
                i3 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr[i6];
                    int min3 = Math.min(i2, i - i8);
                    iArr2[i7] = min3;
                    int min4 = Math.min(j0, (i - min3) - i8);
                    int i9 = iArr2[i7] + i8 + min4;
                    i6++;
                    i3 = min4;
                    i2 = i9;
                    i7++;
                }
            }
            int i10 = i2 - i3;
            se0 se0Var = this.g;
            if (se0Var != null && i10 < i) {
                int intValue = ((Number) se0Var.invoke(Integer.valueOf(i - i10), jq0Var)).intValue();
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + intValue;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pe) {
                pe peVar = (pe) obj;
                if (!f20.b(this.e, peVar.e) || this.f != peVar.f || !sn0.r(this.g, peVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qe
    public final void h(c00 c00Var, int i, int[] iArr, int[] iArr2) {
        b(c00Var, i, iArr, jq0.e, iArr2);
    }

    public final int hashCode() {
        int hashCode;
        int a = mb2.a(Float.hashCode(this.e) * 31, 31, this.f);
        se0 se0Var = this.g;
        if (se0Var == null) {
            hashCode = 0;
        } else {
            hashCode = se0Var.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb.append(str);
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) f20.c(this.e));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
