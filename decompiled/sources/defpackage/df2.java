package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class df2 implements Comparable {
    public static final df2 j;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final b52 i = new b52(new vm1(this, 17));

    static {
        new df2(0, 0, 0, "");
        j = new df2(0, 1, 0, "");
        new df2(1, 0, 0, "");
    }

    public df2(int i, int i2, int i3, String str) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        df2 df2Var = (df2) obj;
        df2Var.getClass();
        Object value = this.i.getValue();
        value.getClass();
        Object value2 = df2Var.i.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof df2)) {
            return false;
        }
        df2 df2Var = (df2) obj;
        if (this.e != df2Var.e || this.f != df2Var.f || this.g != df2Var.g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.e) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        String str;
        String str2 = this.h;
        if (!i32.N(str2)) {
            str = "-".concat(str2);
        } else {
            str = "";
        }
        return this.e + '.' + this.f + '.' + this.g + str;
    }
}
