package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uw0 extends q42 implements se0 {
    public final /* synthetic */ int f = 3;
    public Object g;
    public int h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(ContentResolver contentResolver, Uri uri, fj2 fj2Var, lk lkVar, Context context, vt vtVar) {
        super(2, vtVar);
        this.j = contentResolver;
        this.k = uri;
        this.l = fj2Var;
        this.m = lkVar;
        this.n = context;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                uw0 uw0Var = new uw0((ya) this.k, (List) this.l, (ge1) this.m, (fe1) obj2, vtVar);
                uw0Var.g = obj;
                return uw0Var;
            case 1:
                uw0 uw0Var2 = new uw0((t41) this.l, (y41) this.m, (oe0) obj2, vtVar);
                uw0Var2.k = obj;
                return uw0Var2;
            case 2:
                uw0 uw0Var3 = new uw0((de0) obj2, vtVar);
                uw0Var3.m = obj;
                return uw0Var3;
            default:
                uw0 uw0Var4 = new uw0((ContentResolver) this.j, (Uri) this.k, (fj2) this.l, (lk) this.m, (Context) obj2, vtVar);
                uw0Var4.g = obj;
                return uw0Var4;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        hv hvVar = hv.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                ((uw0) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return hvVar;
            case 1:
                return ((uw0) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                ((uw0) create((wa0) obj, (vt) obj2)).invokeSuspend(od2Var);
                return hvVar;
            default:
                return ((uw0) create((wa0) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x02e5, code lost:
    
        if (r3.d(r22) == r2) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r5.b(r9, r22) == r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0237, code lost:
    
        r8 = r23;
        r2 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #9 {all -> 0x002a, blocks: (B:9:0x0025, B:11:0x0059, B:17:0x0066, B:19:0x006e, B:27:0x003b, B:30:0x0050), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d A[Catch: all -> 0x00c7, TryCatch #7 {all -> 0x00c7, blocks: (B:41:0x00c1, B:44:0x0172, B:49:0x0188, B:51:0x018d, B:53:0x0195, B:55:0x01aa, B:57:0x01b8, B:59:0x01c2, B:64:0x01eb, B:69:0x01fa, B:75:0x0214, B:77:0x021d, B:87:0x0248, B:88:0x024b, B:91:0x01d3, B:100:0x01de, B:107:0x00e7, B:110:0x0104, B:117:0x0141, B:123:0x0158, B:132:0x025b, B:133:0x025e, B:71:0x0209, B:74:0x0211, B:83:0x0244, B:84:0x0247, B:73:0x020d, B:119:0x014d, B:122:0x0155, B:129:0x0257, B:130:0x025a, B:121:0x0151), top: B:35:0x00a3, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024c A[LOOP:0: B:50:0x018b->B:66:0x024c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, hv, b51] */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v18, types: [l2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v27, types: [l2] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x03c9 -> B:179:0x0378). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:11:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0236 -> B:41:0x0237). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(de0 de0Var, vt vtVar) {
        super(2, vtVar);
        this.n = de0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(t41 t41Var, y41 y41Var, oe0 oe0Var, vt vtVar) {
        super(2, vtVar);
        this.l = t41Var;
        this.m = y41Var;
        this.n = oe0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(ya yaVar, List list, ge1 ge1Var, fe1 fe1Var, vt vtVar) {
        super(2, vtVar);
        this.k = yaVar;
        this.l = list;
        this.m = ge1Var;
        this.n = fe1Var;
    }
}
