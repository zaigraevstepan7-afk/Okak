package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sd0 implements Comparable {
    public static final sd0 f;
    public static final sd0 g;
    public static final sd0 h;
    public static final sd0 i;
    public static final sd0 j;
    public static final List k;
    public final int e;

    static {
        sd0 sd0Var = new sd0(100);
        sd0 sd0Var2 = new sd0(200);
        sd0 sd0Var3 = new sd0(300);
        sd0 sd0Var4 = new sd0(400);
        sd0 sd0Var5 = new sd0(500);
        sd0 sd0Var6 = new sd0(600);
        f = sd0Var6;
        sd0 sd0Var7 = new sd0(700);
        sd0 sd0Var8 = new sd0(800);
        sd0 sd0Var9 = new sd0(DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
        g = sd0Var4;
        h = sd0Var5;
        i = sd0Var6;
        j = sd0Var7;
        k = xn.F(sd0Var, sd0Var2, sd0Var3, sd0Var4, sd0Var5, sd0Var6, sd0Var7, sd0Var8, sd0Var9);
    }

    public sd0(int i2) {
        this.e = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (!z) {
            ll0.a("Font weight can be in range [1, 1000]. Current value: " + i2);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return sn0.B(this.e, ((sd0) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd0)) {
            return false;
        }
        if (this.e == ((sd0) obj).e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return l90.o(new StringBuilder("FontWeight(weight="), this.e, ')');
    }
}
