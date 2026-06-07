package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g11 extends d21 implements es, rq0 {
    public LinkedHashMap s;

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        boolean z;
        int i;
        float f = ((f20) hp.s(this, kn0.c)).e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        ig1 x = e01Var.x(j);
        int i2 = 0;
        if (this.r && !Float.isNaN(f) && f20.a(f, 0.0f) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!Float.isNaN(f)) {
            i = l01Var.j0(f);
        } else {
            i = 0;
        }
        int i3 = x.e;
        if (z) {
            i3 = Math.max(i3, i);
        }
        int i4 = x.f;
        if (z) {
            i4 = Math.max(i4, i);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.s;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.s = linkedHashMap;
            }
            wf2 wf2Var = kn0.b;
            int round = Math.round((i - x.e) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(wf2Var, Integer.valueOf(round));
            ei0 ei0Var = kn0.a;
            int round2 = Math.round((i - x.f) / 2.0f);
            if (round2 >= 0) {
                i2 = round2;
            }
            linkedHashMap.put(ei0Var, Integer.valueOf(i2));
        }
        Map map = this.s;
        if (map == null) {
            map = m60.e;
        }
        return l01Var.s0(i3, i4, map, new em0(i3, i4, x));
    }
}
