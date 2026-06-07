package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e extends eo1 implements se0 {
    public te e;
    public Iterator f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ oe1 i;
    public final /* synthetic */ n90 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(oe1 oe1Var, n90 n90Var, boolean z, vt vtVar) {
        super(2, vtVar);
        this.i = oe1Var;
        this.j = n90Var;
        this.k = z;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        e eVar = new e(this.i, this.j, this.k, vtVar);
        eVar.h = obj;
        return eVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((lv1) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0053 -> B:5:0x0056). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.h
            r1 = r0
            lv1 r1 = (defpackage.lv1) r1
            int r0 = r9.g
            n90 r2 = r9.j
            r8 = 1
            if (r0 == 0) goto L1e
            if (r0 != r8) goto L17
            java.util.Iterator r0 = r9.f
            te r3 = r9.e
            defpackage.io.K(r10)
            r7 = r9
            goto L56
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            r9 = 0
            return r9
        L1e:
            defpackage.io.K(r10)
            te r10 = new te
            r10.<init>()
            oe1 r0 = r9.i
            r10.addLast(r0)
            java.util.List r0 = r2.list(r0)
            java.util.Iterator r0 = r0.iterator()
            r3 = r10
        L34:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L58
            java.lang.Object r10 = r0.next()
            r4 = r10
            oe1 r4 = (defpackage.oe1) r4
            r9.h = r1
            r9.e = r3
            r9.f = r0
            r9.g = r8
            boolean r5 = r9.k
            r6 = 0
            r7 = r9
            java.lang.Object r9 = defpackage.f2.t(r1, r2, r3, r4, r5, r6, r7)
            hv r10 = defpackage.hv.e
            if (r9 != r10) goto L56
            return r10
        L56:
            r9 = r7
            goto L34
        L58:
            od2 r9 = defpackage.od2.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
