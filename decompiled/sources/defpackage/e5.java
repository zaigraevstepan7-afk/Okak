package defpackage;

import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 extends ef0 implements de0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        a81 a81Var;
        boolean S0;
        int i = this.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                View view = (View) this.receiver;
                view.setImportantForContentCapture(1);
                ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
                if (contentCaptureSession == null) {
                    return null;
                }
                return new sl0((Object) contentCaptureSession, view);
            case 1:
                return ((i62) this.receiver).data();
            case 2:
                hc0 hc0Var = (hc0) this.receiver;
                j41 j41Var = hc0Var.c;
                j41 j41Var2 = hc0Var.d;
                mc0 mc0Var = hc0Var.a;
                tc0 f = mc0Var.f();
                sc0 sc0Var = sc0.g;
                if (f == null) {
                    Object[] objArr = j41Var2.b;
                    long[] jArr = j41Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            int i3 = length;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i2 - i3)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((bc0) objArr[(i2 << 3) + i5]).A(sc0Var);
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i2 != i3) {
                                i2++;
                                length = i3;
                            }
                        }
                    }
                } else if (f.r) {
                    if (j41Var.c(f)) {
                        f.R0();
                    }
                    sc0 Q0 = f.Q0();
                    if (!f.e.r) {
                        kl0.b("visitAncestors called on an unattached node");
                    }
                    d21 d21Var = f.e;
                    ar0 M = hp.M(f);
                    int i6 = 0;
                    while (M != null) {
                        if ((M.J.f.h & 5120) != 0) {
                            while (d21Var != null) {
                                int i7 = d21Var.g;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((d21Var instanceof bc0) && j41Var2.c(d21Var)) {
                                        if (i6 <= 1) {
                                            ((bc0) d21Var).A(Q0);
                                        } else {
                                            ((bc0) d21Var).A(sc0.f);
                                        }
                                        j41Var2.l(d21Var);
                                    }
                                }
                                d21Var = d21Var.i;
                            }
                        }
                        M = M.v();
                        if (M != null && (a81Var = M.J) != null) {
                            d21Var = a81Var.e;
                        } else {
                            d21Var = null;
                        }
                    }
                    Object[] objArr2 = j41Var2.b;
                    long[] jArr2 = j41Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((bc0) objArr2[(i8 << 3) + i10]).A(sc0Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (mc0Var.f() == null || mc0Var.c.Q0() == sc0Var) {
                    mc0Var.c();
                }
                j41Var.b();
                j41Var2.b();
                hc0Var.e = false;
                return od2Var;
            case 3:
                S0 = ((yc0) this.receiver).z.S0(7);
                return Boolean.valueOf(S0);
            case 4:
                ag agVar = (ag) this.receiver;
                r22 r22Var = agVar.u;
                Boolean bool = Boolean.FALSE;
                r22Var.getClass();
                r22Var.k(null, bool);
                agVar.g(true);
                return od2Var;
            default:
                ag agVar2 = (ag) this.receiver;
                r22 r22Var2 = agVar2.u;
                Boolean bool2 = Boolean.FALSE;
                r22Var2.getClass();
                r22Var2.k(null, bool2);
                r22 r22Var3 = agVar2.f;
                r22Var3.getClass();
                r22Var3.k(null, rf.a);
                return od2Var;
        }
    }
}
