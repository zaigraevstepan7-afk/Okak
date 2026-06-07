package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class xj2 implements se0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ wl1 f;
    public final /* synthetic */ bl1 g;
    public final /* synthetic */ wl1 h;
    public final /* synthetic */ wl1 i;

    public /* synthetic */ xj2(bl1 bl1Var, wl1 wl1Var, wl1 wl1Var2, wl1 wl1Var3) {
        this.g = bl1Var;
        this.f = wl1Var;
        this.h = wl1Var2;
        this.i = wl1Var3;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.e;
        od2 od2Var = od2.a;
        wl1 wl1Var = this.i;
        wl1 wl1Var2 = this.h;
        bl1 bl1Var = this.g;
        wl1 wl1Var3 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    long j = 1;
                    if (longValue >= 1) {
                        byte readByte = bl1Var.readByte();
                        boolean z3 = false;
                        if ((readByte & 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((readByte & 2) == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((readByte & 4) == 4) {
                            z3 = true;
                        }
                        if (z) {
                            j = 5;
                        }
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue >= j) {
                            if (z) {
                                wl1Var3.e = Integer.valueOf(bl1Var.c());
                            }
                            if (z2) {
                                wl1Var2.e = Integer.valueOf(bl1Var.c());
                            }
                            if (z3) {
                                wl1Var.e = Integer.valueOf(bl1Var.c());
                                return od2Var;
                            }
                            return od2Var;
                        }
                        se.w("bad zip: extended timestamp extra too short");
                    } else {
                        se.w("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return od2Var;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (wl1Var3.e == null) {
                        if (longValue2 == 24) {
                            wl1Var3.e = Long.valueOf(bl1Var.g());
                            wl1Var2.e = Long.valueOf(bl1Var.g());
                            wl1Var.e = Long.valueOf(bl1Var.g());
                            return od2Var;
                        }
                        se.w("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    } else {
                        se.w("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    return null;
                }
                return od2Var;
        }
    }

    public /* synthetic */ xj2(wl1 wl1Var, bl1 bl1Var, wl1 wl1Var2, wl1 wl1Var3) {
        this.f = wl1Var;
        this.g = bl1Var;
        this.h = wl1Var2;
        this.i = wl1Var3;
    }
}
