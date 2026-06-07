package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x41 extends q42 implements se0 {
    public b51 f;
    public Object g;
    public Object h;
    public y41 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t41 l;
    public final /* synthetic */ y41 m;
    public final /* synthetic */ se0 n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(t41 t41Var, y41 y41Var, se0 se0Var, Object obj, vt vtVar) {
        super(2, vtVar);
        this.l = t41Var;
        this.m = y41Var;
        this.n = se0Var;
        this.o = obj;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        x41 x41Var = new x41(this.l, this.m, this.n, this.o, vtVar);
        x41Var.k = obj;
        return x41Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((x41) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
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
    @Override // defpackage.eh
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.j
            r1 = 2
            r2 = 1
            r3 = 0
            hv r4 = defpackage.hv.e
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.g
            y41 r0 = (defpackage.y41) r0
            b51 r1 = r8.f
            java.lang.Object r8 = r8.k
            v41 r8 = (defpackage.v41) r8
            defpackage.io.K(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            return r3
        L25:
            y41 r0 = r8.i
            java.lang.Object r2 = r8.h
            java.lang.Object r5 = r8.g
            se0 r5 = (defpackage.se0) r5
            b51 r6 = r8.f
            java.lang.Object r7 = r8.k
            v41 r7 = (defpackage.v41) r7
            defpackage.io.K(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.io.K(r9)
            java.lang.Object r9 = r8.k
            gv r9 = (defpackage.gv) r9
            v41 r0 = new v41
            xu r9 = r9.A()
            g3 r5 = defpackage.g3.O
            vu r9 = r9.H(r5)
            r9.getClass()
            go0 r9 = (defpackage.go0) r9
            t41 r5 = r8.l
            r0.<init>(r5, r9)
            y41 r9 = r8.m
            defpackage.y41.a(r9, r0)
            b51 r5 = r9.b
            r8.k = r0
            r8.f = r5
            se0 r6 = r8.n
            r8.g = r6
            java.lang.Object r7 = r8.o
            r8.h = r7
            r8.i = r9
            r8.j = r2
            java.lang.Object r2 = r5.d(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.k = r0     // Catch: java.lang.Throwable -> La5
            r8.f = r5     // Catch: java.lang.Throwable -> La5
            r8.g = r9     // Catch: java.lang.Throwable -> La5
            r8.h = r3     // Catch: java.lang.Throwable -> La5
            r8.i = r3     // Catch: java.lang.Throwable -> La5
            r8.j = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.f(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.f(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x41.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
