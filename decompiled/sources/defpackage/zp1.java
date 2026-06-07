package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zp1 extends wt implements wa0 {
    public final wa0 e;
    public final xu f;
    public final int g;
    public xu h;
    public vt i;

    public zp1(wa0 wa0Var, xu xuVar) {
        super(kp.g, j60.e);
        this.e = wa0Var;
        this.f = xuVar;
        this.g = ((Number) xuVar.p(new p11(10), 0)).intValue();
    }

    @Override // defpackage.wa0
    public final Object b(Object obj, vt vtVar) {
        try {
            Object g = g(vtVar, obj);
            if (g == hv.e) {
                return g;
            }
            return od2.a;
        } catch (Throwable th) {
            this.h = new e20(vtVar.getContext(), th);
            throw th;
        }
    }

    public final Object g(vt vtVar, Object obj) {
        xu context = vtVar.getContext();
        lo.u(context);
        xu xuVar = this.h;
        if (xuVar != context) {
            if (!(xuVar instanceof e20)) {
                if (((Number) context.p(new h8(this, 15), 0)).intValue() == this.g) {
                    this.h = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(j32.s("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((e20) xuVar).f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.i = vtVar;
        te0 te0Var = bq1.a;
        wa0 wa0Var = this.e;
        wa0Var.getClass();
        Object invoke = te0Var.invoke(wa0Var, obj, this);
        if (!sn0.r(invoke, hv.e)) {
            this.i = null;
        }
        return invoke;
    }

    @Override // defpackage.eh, defpackage.iv
    public final iv getCallerFrame() {
        vt vtVar = this.i;
        if (vtVar instanceof iv) {
            return (iv) vtVar;
        }
        return null;
    }

    @Override // defpackage.wt, defpackage.vt
    public final xu getContext() {
        xu xuVar = this.h;
        if (xuVar == null) {
            return j60.e;
        }
        return xuVar;
    }

    @Override // defpackage.eh
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Throwable a = go1.a(obj);
        if (a != null) {
            this.h = new e20(getContext(), a);
        }
        vt vtVar = this.i;
        if (vtVar != null) {
            vtVar.resumeWith(obj);
        }
        return hv.e;
    }
}
