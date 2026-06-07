package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a8 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(m22 m22Var, va0 va0Var, r22 r22Var, Object obj, vt vtVar) {
        super(2, vtVar);
        this.f = 5;
        this.i = m22Var;
        this.j = va0Var;
        this.k = r22Var;
        this.h = obj;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                a8 a8Var = new a8((oe0) this.i, (b8) obj3, (bu0) obj2, vtVar, 0);
                a8Var.h = obj;
                return a8Var;
            case 1:
                return new a8(this.h, (ya) this.i, (o41) obj3, (o41) obj2, vtVar, 1);
            case 2:
                a8 a8Var2 = new a8((dm) obj3, (ub) obj2, vtVar, 2);
                a8Var2.h = obj;
                return a8Var2;
            case 3:
                return new a8((fr) this.h, (ScrollCaptureSession) this.i, (Rect) obj3, (Consumer) obj2, vtVar, 3);
            case 4:
                a8 a8Var3 = new a8((va0) this.i, (r22) obj3, this.k, vtVar, 4);
                a8Var3.h = obj;
                return a8Var3;
            case 5:
                return new a8((m22) this.i, (va0) obj3, (r22) obj2, this.h, vtVar);
            case 6:
                a8 a8Var4 = new a8((o41) obj3, (uk0) obj2, vtVar, 6);
                a8Var4.h = obj;
                return a8Var4;
            case 7:
                a8 a8Var5 = new a8((lt1) this.i, (d51) obj3, (lb2) obj2, vtVar, 7);
                a8Var5.h = obj;
                return a8Var5;
            case 8:
                return new a8((wg1) obj3, (se0) obj2, vtVar, 8);
            case 9:
                return new a8((b51) obj3, (l) obj2, vtVar, 9);
            case 10:
                a8 a8Var6 = new a8((wu0) this.i, (nu0) obj3, (l) obj2, vtVar, 10);
                a8Var6.h = obj;
                return a8Var6;
            case 11:
                return new a8((co1) this.h, (sz1) this.i, (h32) obj3, (Context) obj2, vtVar, 11);
            case 12:
                return new a8((co1) this.h, (an1) this.i, (Context) obj3, (Uri) obj2, vtVar, 12);
            case 13:
                a8 a8Var7 = new a8((oe0) this.i, (AtomicReference) obj3, (se0) obj2, vtVar, 13);
                a8Var7.h = obj;
                return a8Var7;
            default:
                a8 a8Var8 = new a8((uh1) obj3, (te0) obj2, (oe0) this.i, vtVar);
                a8Var8.h = obj;
                return a8Var8;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        hv hvVar = hv.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                ((a8) create((t8) obj, (vt) obj2)).invokeSuspend(od2Var);
                return hvVar;
            case 1:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 3:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 4:
                return ((a8) create((uw1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 5:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 6:
                ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return hvVar;
            case 7:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 8:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 9:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 10:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 11:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 12:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 13:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((a8) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0207, code lost:
    
        if (defpackage.fp.u(r2, r21) == r8) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0254, code lost:
    
        if (r1.d(r21) == r8) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0352, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03f6, code lost:
    
        if (defpackage.qo.E(r0, r1, r21) == r8) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [q42, se0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [tl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [q42, se0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x04f8 -> B:229:0x04fc). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(uh1 uh1Var, te0 te0Var, oe0 oe0Var, vt vtVar) {
        super(2, vtVar);
        this.f = 14;
        this.j = uh1Var;
        this.k = te0Var;
        this.i = oe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(Object obj, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(Object obj, Object obj2, Object obj3, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(Object obj, Object obj2, Object obj3, Object obj4, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
    }
}
