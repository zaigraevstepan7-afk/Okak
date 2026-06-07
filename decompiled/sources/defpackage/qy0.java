package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qy0 implements c00 {
    public boolean e;
    public long f = 9223372034707292159L;
    public long g = 0;
    public final /* synthetic */ ty0 h;

    public qy0(ty0 ty0Var) {
        this.h = ty0Var;
    }

    @Override // defpackage.c00
    public final float P() {
        return this.h.P();
    }

    @Override // defpackage.c00
    public final float a() {
        return this.h.a();
    }

    public final void b(hi0 hi0Var, float f) {
        ty0 ty0Var = this.h;
        u51 u51Var = ty0Var.q;
        if (u51Var == null) {
            u51Var = new u51();
            ty0Var.q = u51Var;
        }
        int X = bf.X((hi0[]) u51Var.b, hi0Var);
        if (X < 0) {
            int i = u51Var.a;
            hi0[] hi0VarArr = (hi0[]) u51Var.b;
            if (i == hi0VarArr.length) {
                int i2 = i * 2;
                u51Var.b = (hi0[]) Arrays.copyOf(hi0VarArr, i2);
                u51Var.c = Arrays.copyOf((float[]) u51Var.c, i2);
                u51Var.d = Arrays.copyOf((byte[]) u51Var.d, i2);
            }
            ((hi0[]) u51Var.b)[i] = hi0Var;
            ((byte[]) u51Var.d)[i] = 3;
            ((float[]) u51Var.c)[i] = f;
            u51Var.a++;
            return;
        }
        float[] fArr = (float[]) u51Var.c;
        if (fArr[X] == f) {
            byte[] bArr = (byte[]) u51Var.d;
            if (bArr[X] == 2) {
                bArr[X] = 0;
                return;
            }
            return;
        }
        fArr[X] = f;
        ((byte[]) u51Var.d)[X] = 1;
    }
}
