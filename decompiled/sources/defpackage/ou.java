package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ou implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public ou(jc0 jc0Var, gu0 gu0Var) {
        this.e = 9;
        this.g = jc0Var;
        this.f = gu0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        long j;
        vt vtVar = null;
        int i = 3;
        boolean z = false;
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((lp0) obj).a;
                if (((gu0) this.f).a() == jg0.f && keyEvent.getKeyCode() == 4 && mp0.w(keyEvent) == 1) {
                    ((b82) this.g).g(null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent2 = ((lp0) obj).a;
                o41 o41Var = (o41) this.g;
                f80 f80Var = (f80) this.f;
                if (mp0.w(keyEvent2) == 1) {
                    long v = mp0.v(keyEvent2);
                    int i2 = jp0.F;
                    if (jp0.a(v, jp0.h) || jp0.a(v, jp0.r) || jp0.a(v, jp0.E)) {
                        z = true;
                    }
                    if (z || jp0.a(vn.i(keyEvent2.getKeyCode()), jp0.q)) {
                        f80Var.invoke();
                    }
                }
                Boolean bool = Boolean.FALSE;
                o41Var.setValue(bool);
                return bool;
            case 2:
                o02 o02Var = (o02) obj;
                synchronized (q02.c) {
                    j = q02.e;
                    q02.e = 1 + j;
                }
                return new n41(j, o02Var, (oe0) this.f, (oe0) this.g);
            case 3:
                int intValue = ((Number) obj).intValue();
                return ((le) this.f).invoke(Integer.valueOf(intValue), ((List) this.g).get(intValue));
            case 4:
                dq0 dq0Var = (dq0) this.f;
                Object obj2 = dq0Var.b;
                pl plVar = (pl) this.g;
                synchronized (obj2) {
                    ((ArrayList) dq0Var.c).remove(plVar);
                }
                return od2.a;
            case 5:
                KeyEvent keyEvent3 = ((lp0) obj).a;
                l40 l40Var = (l40) this.f;
                if (l40Var.c() && mp0.w(keyEvent3) == 1 && jp0.a(vn.i(keyEvent3.getKeyCode()), jp0.u)) {
                    rx.C((gv) this.g, null, new ee(l40Var, vtVar, i), 3);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 6:
                return ((v51) this.f).invoke(((ArrayList) this.g).get(((Number) obj).intValue()));
            case 7:
                return ((v51) this.f).invoke(((List) this.g).get(((Number) obj).intValue()));
            case 8:
                return ((v51) this.f).invoke(((List) this.g).get(((Number) obj).intValue()));
            case 9:
                KeyEvent keyEvent4 = ((lp0) obj).a;
                jc0 jc0Var = (jc0) this.g;
                InputDevice device = keyEvent4.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent4.getSource() == 33554433) && mp0.w(keyEvent4) == 2 && keyEvent4.getSource() != 257)) {
                    if (op1.e(19, keyEvent4)) {
                        z = ((mc0) jc0Var).g(5, true);
                    } else if (op1.e(20, keyEvent4)) {
                        z = ((mc0) jc0Var).g(6, true);
                    } else if (op1.e(21, keyEvent4)) {
                        z = ((mc0) jc0Var).g(3, true);
                    } else if (op1.e(22, keyEvent4)) {
                        z = ((mc0) jc0Var).g(4, true);
                    } else if (op1.e(23, keyEvent4)) {
                        f12 f12Var = ((gu0) this.f).c;
                        if (f12Var != null) {
                            ((sz) f12Var).b();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return ((ke2) this.f).invoke(((ArrayList) this.g).get(((Number) obj).intValue()));
        }
    }

    public ou(f80 f80Var, boolean z, o41 o41Var) {
        this.e = 1;
        this.f = f80Var;
        this.g = o41Var;
    }

    public /* synthetic */ ou(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
