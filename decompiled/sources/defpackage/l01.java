package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface l01 extends mn0 {
    k01 i0(int i, int i2, Map map, oe0 oe0Var, oe0 oe0Var2);

    default k01 s0(int i, int i2, Map map, oe0 oe0Var) {
        return i0(i, i2, map, null, oe0Var);
    }
}
