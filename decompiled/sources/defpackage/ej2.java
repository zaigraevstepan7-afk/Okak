package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ej2 implements su0 {
    public final /* synthetic */ ut e;
    public final /* synthetic */ ja f;
    public final /* synthetic */ jl1 g;
    public final /* synthetic */ wl1 h;
    public final /* synthetic */ View i;

    public ej2(ut utVar, ja jaVar, jl1 jl1Var, wl1 wl1Var, View view) {
        this.e = utVar;
        this.f = jaVar;
        this.g = jl1Var;
        this.h = wl1Var;
        this.i = view;
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        boolean z;
        nl nlVar = null;
        switch (dj2.a[mu0Var.ordinal()]) {
            case 1:
                rx.C(this.e, null, new za(this.h, this.g, uu0Var, this, this.i, (vt) null), 1);
                return;
            case 2:
                ja jaVar = this.f;
                if (jaVar != null) {
                    dq0 dq0Var = (dq0) jaVar.g;
                    synchronized (dq0Var.b) {
                        try {
                            synchronized (dq0Var.b) {
                                z = dq0Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) dq0Var.c;
                                dq0Var.c = (ArrayList) dq0Var.d;
                                dq0Var.d = arrayList;
                                dq0Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((vt) arrayList.get(i)).resumeWith(od2.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                jl1 jl1Var = this.g;
                synchronized (jl1Var.c) {
                    if (jl1Var.t) {
                        jl1Var.t = false;
                        nlVar = jl1Var.y();
                    }
                }
                if (nlVar != null) {
                    ((pl) nlVar).resumeWith(od2.a);
                    return;
                }
                return;
            case 3:
                jl1 jl1Var2 = this.g;
                synchronized (jl1Var2.c) {
                    jl1Var2.t = true;
                }
                return;
            case 4:
                this.g.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                se.m();
                return;
        }
    }
}
