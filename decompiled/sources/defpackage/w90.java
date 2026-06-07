package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w90 extends zd0 {
    public final long e;
    public final boolean f;
    public long g;

    public w90(k12 k12Var, long j, boolean z) {
        super(k12Var);
        this.e = j;
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [hk, java.lang.Object] */
    @Override // defpackage.zd0, defpackage.k12
    public final long read(hk hkVar, long j) {
        hkVar.getClass();
        long j2 = this.g;
        long j3 = this.e;
        if (j2 > j3) {
            j = 0;
        } else if (this.f) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(hkVar, j);
        if (read != -1) {
            this.g += read;
        }
        long j5 = this.g;
        if ((j5 < j3 && read == -1) || j5 > j3) {
            if (read > 0 && j5 > j3) {
                long j6 = hkVar.f - (j5 - j3);
                ?? obj = new Object();
                obj.l(hkVar);
                hkVar.write(obj, j6);
                obj.b();
            }
            throw new IOException("expected " + j3 + " bytes but got " + this.g);
        }
        return read;
    }
}
