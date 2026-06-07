package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mg0 extends zu implements oz {
    public final Handler g;
    public final String h;
    public final boolean i;
    public final mg0 j;

    public mg0(Handler handler, String str, boolean z) {
        mg0 mg0Var;
        this.g = handler;
        this.h = str;
        this.i = z;
        if (z) {
            mg0Var = this;
        } else {
            mg0Var = new mg0(handler, str, true);
        }
        this.j = mg0Var;
    }

    @Override // defpackage.oz
    public final q10 A(long j, final ga2 ga2Var, xu xuVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(ga2Var, j)) {
            return new q10() { // from class: kg0
                @Override // defpackage.q10
                public final void a() {
                    mg0.this.g.removeCallbacks(ga2Var);
                }
            };
        }
        S(xuVar, ga2Var);
        return l81.e;
    }

    @Override // defpackage.oz
    public final void D(long j, pl plVar) {
        lg0 lg0Var = new lg0(plVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(lg0Var, j)) {
            plVar.t(new i(14, this, lg0Var));
        } else {
            S(plVar.i, lg0Var);
        }
    }

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        if (!this.g.post(runnable)) {
            S(xuVar, runnable);
        }
    }

    @Override // defpackage.zu
    public final boolean Q(xu xuVar) {
        if (this.i && sn0.r(Looper.myLooper(), this.g.getLooper())) {
            return false;
        }
        return true;
    }

    public final void S(xu xuVar, Runnable runnable) {
        lo.o(xuVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        vy vyVar = k10.a;
        ny.g.P(xuVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mg0) {
            mg0 mg0Var = (mg0) obj;
            if (mg0Var.g == this.g && mg0Var.i == this.i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.g);
        if (this.i) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.zu
    public final String toString() {
        mg0 mg0Var;
        String str;
        vy vyVar = k10.a;
        mg0 mg0Var2 = gz0.a;
        if (this == mg0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                mg0Var = mg0Var2.j;
            } catch (UnsupportedOperationException unused) {
                mg0Var = null;
            }
            if (this == mg0Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.h;
            if (str2 == null) {
                str2 = this.g.toString();
            }
            if (this.i) {
                return str2 + ".immediate";
            }
            return str2;
        }
        return str;
    }

    public mg0(Handler handler) {
        this(handler, null, false);
    }
}
