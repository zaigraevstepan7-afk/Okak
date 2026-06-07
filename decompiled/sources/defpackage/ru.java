package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ru implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ su f;

    public /* synthetic */ ru(su suVar, av1 av1Var) {
        this.e = 3;
        this.f = suVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        CharSequence charSequence = null;
        StringBuilder sb = null;
        boolean z = true;
        su suVar = this.f;
        switch (i) {
            case 0:
                je1 je1Var = suVar.w.t;
                Boolean bool = Boolean.TRUE;
                je1Var.setValue(bool);
                suVar.w.s.setValue(bool);
                gu0 gu0Var = suVar.w;
                AutofillValue autofillValue = ((m7) obj).a;
                if (autofillValue.isText()) {
                    charSequence = autofillValue.getTextValue();
                }
                charSequence.getClass();
                su.O0(gu0Var, (String) charSequence, suVar.x, suVar.y);
                return bool;
            case 1:
                List list = (List) obj;
                if (suVar.w.d() != null) {
                    x82 d = suVar.w.d();
                    d.getClass();
                    list.add(d.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                su.O0(suVar.w, ((rc) obj).f, suVar.x, suVar.y);
                return Boolean.TRUE;
            default:
                rc rcVar = (rc) obj;
                if (!suVar.x && suVar.y) {
                    r82 r82Var = suVar.w.e;
                    if (r82Var != null) {
                        List F = xn.F(new Object(), new dp(rcVar, 1));
                        gu0 gu0Var2 = suVar.w;
                        sl0 sl0Var = gu0Var2.d;
                        fu fuVar = gu0Var2.v;
                        i82 o = sl0Var.o(F);
                        r82Var.a(null, o);
                        fuVar.invoke(o);
                    } else {
                        i82 i82Var = suVar.v;
                        String str = i82Var.a.f;
                        long j = i82Var.b;
                        int i2 = d92.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        rcVar.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) rcVar);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            y61.l("End index (", i4, i3, ") is less than start index (");
                        }
                        String obj2 = sb.toString();
                        int length = rcVar.f.length() + ((int) (suVar.v.b >> 32));
                        suVar.w.v.invoke(new i82(4, obj2, fr1.a(length, length)));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ru(su suVar, int i) {
        this.e = i;
        this.f = suVar;
    }
}
