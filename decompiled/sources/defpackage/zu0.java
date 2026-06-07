package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zu0 extends kg2 {
    public final p31 b;

    public zu0() {
        p31 p31Var = wm0.a;
        this.b = new p31();
    }

    @Override // defpackage.kg2
    public final void d() {
        p31 p31Var = this.b;
        int[] iArr = p31Var.b;
        Object[] objArr = p31Var.c;
        long[] jArr = p31Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            b41 b41Var = (b41) objArr[i4];
                            Object[] objArr2 = b41Var.a;
                            int i6 = b41Var.b;
                            for (int i7 = 0; i7 < i6; i7++) {
                                yu0 yu0Var = (yu0) objArr2[i7];
                                ql qlVar = yu0Var.d;
                                if (qlVar != null) {
                                    qlVar.cancel();
                                }
                                yu0Var.d = null;
                                jz0 jz0Var = (jz0) yu0Var.a.f;
                                jz0Var.f = true;
                                jz0Var.e = false;
                                jz0Var.a();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
