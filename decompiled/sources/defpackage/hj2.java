package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hj2 {
    public static final List c;
    public static final List d;
    public static final List e;
    public final int a;
    public final int b;

    static {
        wm1 wm1Var = new wm1(25);
        List F = xn.F(0, 600, 840);
        c = F;
        ArrayList q0 = wn.q0(xn.F(1200, 1600), F);
        List F2 = xn.F(0, 480, Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
        d = F2;
        e = F2;
        wm1.c(wm1Var, F, F2);
        wm1.c(wm1Var, q0, F2);
    }

    public hj2(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                return;
            }
            se.d(i2, "Expected minHeightDp to be at least 0, minHeightDp: ");
            throw null;
        }
        se.d(i, "Expected minWidthDp to be at least 0, minWidthDp: ");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj2.class != obj.getClass()) {
            return false;
        }
        hj2 hj2Var = (hj2) obj;
        if (this.a == hj2Var.a && this.b == hj2Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.a);
        sb.append(", minHeightDp=");
        return l90.o(sb, this.b, ')');
    }
}
