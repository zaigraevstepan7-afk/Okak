package defpackage;

import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class za extends q42 implements se0 {
    public final /* synthetic */ int f;
    public Object g;
    public int h;
    public Object i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(wl1 wl1Var, jl1 jl1Var, uu0 uu0Var, ej2 ej2Var, View view, vt vtVar) {
        super(2, vtVar);
        this.f = 3;
        this.i = wl1Var;
        this.j = jl1Var;
        this.k = uu0Var;
        this.l = ej2Var;
        this.m = view;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                za zaVar = new za((dm) this.j, (ya) this.k, (o41) obj3, (o41) obj2, vtVar, 0);
                zaVar.g = obj;
                return zaVar;
            case 1:
                za zaVar2 = new za((z41) obj3, (oe0) obj2, vtVar);
                zaVar2.k = obj;
                return zaVar2;
            case 2:
                return new za((wu0) this.j, (nu0) this.k, (gv) obj3, (l) obj2, vtVar, 2);
            default:
                za zaVar3 = new za((wl1) this.i, (jl1) this.j, (uu0) this.k, (ej2) obj3, (View) obj2, vtVar);
                zaVar3.g = obj;
                return zaVar3;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        gv gvVar = (gv) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((za) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((za) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((za) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((za) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x02ac -> B:147:0x02b0). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(z41 z41Var, oe0 oe0Var, vt vtVar) {
        super(2, vtVar);
        this.f = 1;
        this.l = z41Var;
        this.m = oe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za(Object obj, Object obj2, Object obj3, Object obj4, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
    }
}
