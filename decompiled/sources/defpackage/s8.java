package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s8 extends cq0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8(Object obj, int i) {
        super(0);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        ds dsVar;
        int i = this.e;
        iq0 iq0Var = null;
        boolean z = false;
        od2 od2Var = od2.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                fp.s(((t8) obj).g, null);
                return od2Var;
            case 1:
                return od2Var;
            case 2:
                lb2 lb2Var = (lb2) obj;
                Object c = lb2Var.a.c();
                r60 r60Var = r60.g;
                if (c == r60Var && lb2Var.d.getValue() == r60Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                ((tc0) obj).N0();
                return od2Var;
            case 4:
                Object systemService = ((View) ((ld) obj).f).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 5:
                er0 er0Var = ((ar0) obj).K;
                er0Var.p.D = true;
                zy0 zy0Var = er0Var.q;
                if (zy0Var != null) {
                    zy0Var.x = true;
                }
                return od2Var;
            case 6:
                gr0 gr0Var = (gr0) obj;
                if (!((Boolean) gr0Var.g.getValue()).booleanValue() && (dsVar = gr0Var.c) != null) {
                    dsVar.l();
                }
                return od2Var;
            case 7:
                jz0 jz0Var = (jz0) ((yu0) obj).a.f;
                if (!jz0Var.f) {
                    if (jz0Var.g) {
                        fi1.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    jz0Var.a();
                    jz0Var.g = true;
                }
                return od2Var;
            case 8:
                return (gv) ((q4) obj).i;
            case 9:
                return ((r71) obj).L0();
            case 10:
                ai1 ai1Var = (ai1) obj;
                iq0 j = ai1.j(ai1Var);
                if (j != null && j.j()) {
                    iq0Var = j;
                }
                if (iq0Var != null && ai1Var.m0getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                rl1 rl1Var = (rl1) obj;
                rl1Var.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rl1Var.a();
                    return od2Var;
                } finally {
                    Trace.endSection();
                }
            case 12:
                nr0 a = ((b42) obj).a();
                ar0 ar0Var = a.e;
                if (a.r != ((q41) ((z31) ar0Var.o()).f).g) {
                    i41 i41Var = a.j;
                    Object[] objArr = i41Var.c;
                    long[] jArr = i41Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j2 = jArr[i2];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j2) < 128) {
                                        ((gr0) objArr[(i2 << 3) + i4]).d = true;
                                    }
                                    j2 >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (ar0Var.m != null) {
                        if (!ar0Var.K.e) {
                            ar0.V(ar0Var, false, 7);
                        }
                    } else if (!ar0Var.q()) {
                        ar0.X(ar0Var, false, 7);
                    }
                }
                return od2Var;
            case 13:
                return new BaseInputConnection(((p82) obj).a, false);
            default:
                ((oe2) obj).h.setValue(od2Var);
                return od2Var;
        }
    }
}
