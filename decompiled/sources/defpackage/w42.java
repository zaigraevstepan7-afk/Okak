package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w42 extends d21 implements uh1, c00, th1 {
    public jh1 A;
    public long B;
    public Object s;
    public Object t;
    public PointerInputEventHandler u;
    public i22 v;
    public jh1 w = s42.a;
    public final q41 x;
    public final q41 y;
    public final q41 z;

    public w42(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.s = obj;
        this.t = obj2;
        this.u = pointerInputEventHandler;
        q41 q41Var = new q41(new v42[16]);
        this.x = q41Var;
        this.y = q41Var;
        this.z = new q41(new v42[16]);
        this.B = 0L;
    }

    @Override // defpackage.th1
    public final void E() {
        jh1 jh1Var = this.A;
        if (jh1Var != null) {
            List list = jh1Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((qh1) list.get(i)).d) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        qh1 qh1Var = (qh1) list.get(i2);
                        long j = qh1Var.a;
                        long j2 = qh1Var.c;
                        long j3 = qh1Var.b;
                        float f = qh1Var.e;
                        boolean z = qh1Var.d;
                        arrayList.add(new qh1(j, j3, j2, false, f, j3, j2, z, z, qh1Var.i, 0L));
                    }
                    jh1 jh1Var2 = new jh1(arrayList, null);
                    this.w = jh1Var2;
                    M0(jh1Var2, kh1.e);
                    M0(jh1Var2, kh1.f);
                    M0(jh1Var2, kh1.g);
                    this.A = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.d21
    public final void E0() {
        N0();
    }

    public final Object L0(se0 se0Var, vt vtVar) {
        pl plVar = new pl(1, go.F(vtVar));
        plVar.r();
        v42 v42Var = new v42(this, plVar);
        synchronized (this.y) {
            this.x.b(v42Var);
            new cq1(go.F(go.w(v42Var, v42Var, se0Var))).resumeWith(od2.a);
        }
        plVar.t(new n3(v42Var, 27));
        return plVar.q();
    }

    public final void M0(jh1 jh1Var, kh1 kh1Var) {
        pl plVar;
        pl plVar2;
        synchronized (this.y) {
            q41 q41Var = this.z;
            q41Var.c(q41Var.g, this.x);
        }
        try {
            int ordinal = kh1Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    q41 q41Var2 = this.z;
                    int i = q41Var2.g - 1;
                    Object[] objArr = q41Var2.e;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            v42 v42Var = (v42) objArr[i];
                            if (kh1Var == v42Var.h && (plVar2 = v42Var.g) != null) {
                                v42Var.g = null;
                                plVar2.resumeWith(jh1Var);
                            }
                            i--;
                        }
                    }
                    this.z.g();
                }
            }
            q41 q41Var3 = this.z;
            Object[] objArr2 = q41Var3.e;
            int i2 = q41Var3.g;
            for (int i3 = 0; i3 < i2; i3++) {
                v42 v42Var2 = (v42) objArr2[i3];
                if (kh1Var == v42Var2.h && (plVar = v42Var2.g) != null) {
                    v42Var2.g = null;
                    plVar.resumeWith(jh1Var);
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }

    public final void N0() {
        i22 i22Var = this.v;
        if (i22Var != null) {
            i22Var.v(new qg1("Pointer input was reset", 2));
            this.v = null;
        }
    }

    @Override // defpackage.c00
    public final float P() {
        return hp.M(this).C.P();
    }

    @Override // defpackage.c00
    public final float a() {
        return hp.M(this).C.a();
    }

    @Override // defpackage.qz
    public final void c() {
        N0();
    }

    @Override // defpackage.th1
    public final void p0() {
        N0();
    }

    @Override // defpackage.th1
    public final void u(jh1 jh1Var, kh1 kh1Var, long j) {
        this.B = j;
        if (kh1Var == kh1.e) {
            this.w = jh1Var;
        }
        vt vtVar = null;
        if (this.v == null) {
            this.v = rx.C(z0(), null, new vf(this, vtVar, 13), 1);
        }
        M0(jh1Var, kh1Var);
        List list = jh1Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!qo.q((qh1) list.get(i))) {
                    break;
                } else {
                    i++;
                }
            } else {
                jh1Var = null;
                break;
            }
        }
        this.A = jh1Var;
    }
}
