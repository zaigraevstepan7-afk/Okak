package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tj extends q42 implements se0 {
    public final /* synthetic */ int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj(Object obj, Object obj2, Object obj3, Object obj4, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                tj tjVar = new tj((uj) obj5, (e81) obj4, (f5) obj3, (qd) obj2, vtVar, 0);
                tjVar.g = obj;
                return tjVar;
            default:
                tj tjVar2 = new tj((an1) obj5, (co1) obj4, (Context) obj3, (Uri) obj2, vtVar, 1);
                tjVar2.g = obj;
                return tjVar2;
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
                return ((tj) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((tj) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x009c, code lost:
    
        if (r9 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00bc, code lost:
    
        if (r9 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x005f, code lost:
    
        if (r13 == null) goto L25;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
