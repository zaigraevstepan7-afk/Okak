package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import com.elixir.loader.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class xq1 {
    public static final void a(e21 e21Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        urVar.Y(-1854833411);
        if (urVar.f(e21Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        int i4 = 0;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            Object L = urVar.L();
            if (L == or.a) {
                L = b7.h;
                urVar.h0(L);
            }
            j01 j01Var = (j01) L;
            int hashCode = Long.hashCode(urVar.T);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, e21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, j01Var);
            op1.q(urVar, kr.e, l);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            fqVar.invoke(urVar, 6);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new xx1(e21Var, i, i4, fqVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h42, io0] */
    public static h42 b() {
        return new io0(null);
    }

    public static final long c(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final wt1 d(cy1 cy1Var, xl1 xl1Var) {
        boolean z;
        qv a = cy1Var.a();
        gf0 gf0Var = (gf0) cy1Var.d;
        if (a == qv.e) {
            z = true;
        } else {
            z = false;
        }
        return new wt1(f(gf0Var, z, true, xl1Var), f(gf0Var, z, false, xl1Var), z);
    }

    public static final vt1 e(final cy1 cy1Var, final gf0 gf0Var, vt1 vt1Var) {
        final int i;
        final int i2;
        qv qvVar;
        boolean z;
        int i3 = gf0Var.c;
        int i4 = gf0Var.b;
        boolean z2 = cy1Var.b;
        if (z2) {
            i = i4;
        } else {
            i = i3;
        }
        w82 w82Var = (w82) gf0Var.e;
        int i5 = gf0Var.d;
        de0 de0Var = new de0() { // from class: xt1
            @Override // defpackage.de0
            public final Object invoke() {
                return Integer.valueOf(((w82) gf0.this.e).b.d(i));
            }
        };
        xt0 xt0Var = xt0.f;
        final rr0 O = lo.O(xt0Var, de0Var);
        if (z2) {
            i2 = i3;
        } else {
            i2 = i4;
        }
        rr0 O2 = lo.O(xt0Var, new de0() { // from class: yt1
            @Override // defpackage.de0
            public final Object invoke() {
                boolean z3;
                gf0 gf0Var2 = gf0.this;
                w82 w82Var2 = (w82) gf0Var2.e;
                int intValue = ((Number) O.getValue()).intValue();
                cy1 cy1Var2 = cy1Var;
                boolean z4 = cy1Var2.b;
                if (cy1Var2.a() == qv.e) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i6 = i;
                long i7 = w82Var2.i(i6);
                g31 g31Var = w82Var2.b;
                int i8 = d92.c;
                int i9 = (int) (i7 >> 32);
                int d = g31Var.d(i9);
                int i10 = g31Var.f;
                if (d != intValue) {
                    if (intValue >= i10) {
                        i9 = w82Var2.f(i10 - 1);
                    } else {
                        i9 = w82Var2.f(intValue);
                    }
                }
                int i11 = (int) (i7 & 4294967295L);
                if (g31Var.d(i11) != intValue) {
                    if (intValue >= i10) {
                        i11 = g31Var.c(i10 - 1, false);
                    } else {
                        i11 = g31Var.c(intValue, false);
                    }
                }
                int i12 = i2;
                if (i9 == i12) {
                    return gf0Var2.a(i11);
                }
                if (i11 == i12) {
                    return gf0Var2.a(i9);
                }
                if (!(z4 ^ z3) ? i6 >= i9 : i6 > i11) {
                    i9 = i11;
                }
                return gf0Var2.a(i9);
            }
        });
        if (1 != vt1Var.c) {
            return (vt1) O2.getValue();
        }
        if (i == i5) {
            return vt1Var;
        }
        if (((Number) O.getValue()).intValue() != w82Var.b.d(i5)) {
            return (vt1) O2.getValue();
        }
        int i6 = vt1Var.b;
        long i7 = w82Var.i(i6);
        if (i5 != -1) {
            if (i != i5) {
                qv qvVar2 = qv.e;
                if (i4 < i3) {
                    qvVar = qv.f;
                } else if (i4 > i3) {
                    qvVar = qvVar2;
                } else {
                    qvVar = qv.g;
                }
                if (qvVar == qvVar2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z ^ z2)) {
                }
            }
            return gf0Var.a(i);
        }
        int i8 = d92.c;
        if (i6 != ((int) (i7 >> 32)) && i6 != ((int) (4294967295L & i7))) {
            return gf0Var.a(i);
        }
        return (vt1) O2.getValue();
    }

    public static final vt1 f(gf0 gf0Var, boolean z, boolean z2, xl1 xl1Var) {
        int i;
        long a;
        long j;
        if (z2) {
            i = gf0Var.b;
        } else {
            i = gf0Var.c;
        }
        switch (xl1Var.e) {
            case 2:
                String str = ((w82) gf0Var.e).a.a.f;
                a = fr1.a(pp1.m(str, i), pp1.l(str, i));
                break;
            default:
                a = ((w82) gf0Var.e).i(i);
                break;
        }
        if (z ^ z2) {
            int i2 = d92.c;
            j = a >> 32;
        } else {
            int i3 = d92.c;
            j = 4294967295L & a;
        }
        return gf0Var.a((int) j);
    }

    public static void g(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final int h(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final vt1 i(vt1 vt1Var, gf0 gf0Var, int i) {
        return new vt1(((w82) gf0Var.e).a(i), i, vt1Var.c);
    }

    public static final cr1 k(View view) {
        cr1 cr1Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof cr1) {
                cr1Var = (cr1) tag;
            } else {
                cr1Var = null;
            }
            if (cr1Var != null) {
                return cr1Var;
            }
            Object k = xp1.k(view);
            if (k instanceof View) {
                view = (View) k;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final ArrayList l(String str, Bundle bundle) {
        ArrayList parcelableArrayList;
        Class b = yl1.a(Bundle.class).b();
        b.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayList = f1.d(bundle, str, b);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList(str);
        }
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        yq1.u(str);
        throw null;
    }

    public static final rc m(i82 i82Var) {
        rc rcVar = i82Var.a;
        long j = i82Var.b;
        rcVar.getClass();
        return rcVar.subSequence(d92.f(j), d92.e(j));
    }

    public static final rc n(i82 i82Var, int i) {
        rc rcVar = i82Var.a;
        rc rcVar2 = i82Var.a;
        long j = i82Var.b;
        int e = d92.e(j);
        int e2 = d92.e(j);
        int i2 = e2 + i;
        if (((i ^ i2) & (e2 ^ i2)) < 0) {
            i2 = rcVar2.f.length();
        }
        return rcVar.subSequence(e, Math.min(i2, rcVar2.f.length()));
    }

    public static final rc o(i82 i82Var, int i) {
        rc rcVar = i82Var.a;
        long j = i82Var.b;
        int f = d92.f(j);
        int i2 = f - i;
        if (((f ^ i2) & (i ^ f)) < 0) {
            i2 = 0;
        }
        return rcVar.subSequence(Math.max(0, i2), d92.f(j));
    }

    public static final w82 p(mu1 mu1Var) {
        oe0 oe0Var;
        ArrayList arrayList = new ArrayList();
        Object g = mu1Var.e.g(lu1.a);
        if (g == null) {
            g = null;
        }
        s0 s0Var = (s0) g;
        if (s0Var == null || (oe0Var = (oe0) s0Var.b) == null || !((Boolean) oe0Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (w82) arrayList.get(0);
    }

    public static final boolean q(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final void r(oa oaVar, int i) {
        Object obj;
        Iterator<T> it = oaVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ar0) ((Map.Entry) obj).getKey()).f == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            se.s();
        }
    }

    public static void s(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & (-257);
        } else {
            i = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z);
    }

    public static final Object t(vr1 vr1Var, vr1 vr1Var2, se0 se0Var) {
        Object lpVar;
        Object S;
        try {
            fc2.t(2, se0Var);
            lpVar = se0Var.invoke(vr1Var2, vr1Var);
        } catch (Throwable th) {
            lpVar = new lp(th, false);
        }
        hv hvVar = hv.e;
        if (lpVar != hvVar && (S = vr1Var.S(lpVar)) != d6.m) {
            if (!(S instanceof lp)) {
                return d6.G(S);
            }
            throw ((lp) S).a;
        }
        return hvVar;
    }

    public static final String u(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public abstract void j();
}
