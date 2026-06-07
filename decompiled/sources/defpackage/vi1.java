package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vi1 {
    public int a;
    public kf[] b;

    public final void a(kf kfVar, int i) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            kf kfVar2 = this.b[i2];
            kfVar2.getClass();
            if (sn0.C(0L, kfVar.getTimeoutAt$okio() - kfVar2.getTimeoutAt$okio()) <= 0) {
                break;
            }
            kfVar2.index = i;
            this.b[i] = kfVar2;
            i = i2;
        }
        this.b[i] = kfVar;
        kfVar.index = i;
    }

    public final void b(kf kfVar) {
        kf kfVar2;
        int i = kfVar.index;
        if (i != -1) {
            int i2 = this.a;
            kf kfVar3 = this.b[i2];
            kfVar3.getClass();
            kfVar.index = -1;
            this.b[i2] = null;
            this.a = i2 - 1;
            if (kfVar == kfVar3) {
                return;
            }
            int C = sn0.C(0L, kfVar3.getTimeoutAt$okio() - kfVar.getTimeoutAt$okio());
            if (C == 0) {
                this.b[i] = kfVar3;
                kfVar3.index = i;
                return;
            }
            if (C < 0) {
                while (true) {
                    int i3 = i << 1;
                    int i4 = i3 + 1;
                    int i5 = this.a;
                    if (i4 <= i5) {
                        kfVar2 = this.b[i3];
                        kfVar2.getClass();
                        kf kfVar4 = this.b[i4];
                        kfVar4.getClass();
                        if (sn0.C(0L, kfVar4.getTimeoutAt$okio() - kfVar2.getTimeoutAt$okio()) >= 0) {
                            kfVar2 = kfVar4;
                        }
                    } else {
                        if (i3 > i5) {
                            break;
                        }
                        kfVar2 = this.b[i3];
                        kfVar2.getClass();
                    }
                    if (sn0.C(0L, kfVar2.getTimeoutAt$okio() - kfVar3.getTimeoutAt$okio()) <= 0) {
                        break;
                    }
                    int i6 = kfVar2.index;
                    kfVar2.index = i;
                    this.b[i] = kfVar2;
                    i = i6;
                }
                this.b[i] = kfVar3;
                kfVar3.index = i;
                return;
            }
            a(kfVar3, i);
            return;
        }
        se.h("Failed requirement.");
    }
}
