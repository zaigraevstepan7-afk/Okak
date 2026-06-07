package defpackage;

import android.graphics.Bitmap;
import com.google.protobuf.DescriptorProtos;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r31 r31Var, pa0 pa0Var, vt vtVar) {
        super(2, vtVar);
        this.f = 16;
        this.h = r31Var;
        this.j = pa0Var;
    }

    private final Object g(Object obj) {
        Object obj2;
        cj1 cj1Var = (cj1) this.h;
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            se0 se0Var = (se0) this.i;
            zm1 zm1Var = (zm1) this.j;
            this.h = cj1Var;
            this.g = 1;
            obj = se0Var.invoke(zm1Var, this);
            hv hvVar = hv.e;
            if (obj == hvVar) {
                return hvVar;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            obj2 = new kg(new t7(bitmap));
        } else {
            obj2 = ig.a;
        }
        cj1Var.setValue(obj2);
        return od2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.j
            co1 r0 = (defpackage.co1) r0
            zu r1 = r0.c
            r22 r2 = r0.d
            int r3 = r10.g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            hv r8 = defpackage.hv.e
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L38
            if (r3 == r5) goto L2d
            if (r3 != r4) goto L27
            java.lang.Object r0 = r10.i
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r10 = r10.h
            java.util.List r10 = (java.util.List) r10
            defpackage.io.K(r11)     // Catch: java.lang.Exception -> L24
            goto L80
        L24:
            r10 = move-exception
            goto L8e
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r10)
            return r7
        L2d:
            java.lang.Object r3 = r10.h
            java.util.List r3 = (java.util.List) r3
            defpackage.io.K(r11)     // Catch: java.lang.Exception -> L24
            r9 = r3
            r3 = r11
            r11 = r9
            goto L67
        L38:
            defpackage.io.K(r11)     // Catch: java.lang.Exception -> L24
            goto L55
        L3c:
            defpackage.io.K(r11)
            r2.getClass()
            wn1 r11 = defpackage.wn1.a
            r2.k(r7, r11)
            ao1 r11 = new ao1     // Catch: java.lang.Exception -> L24
            r11.<init>(r0, r7, r5)     // Catch: java.lang.Exception -> L24
            r10.g = r6     // Catch: java.lang.Exception -> L24
            java.lang.Object r11 = defpackage.rx.S(r1, r11, r10)     // Catch: java.lang.Exception -> L24
            if (r11 != r8) goto L55
            goto L7b
        L55:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L24
            ao1 r3 = new ao1     // Catch: java.lang.Exception -> L24
            r3.<init>(r0, r7, r6)     // Catch: java.lang.Exception -> L24
            r10.h = r11     // Catch: java.lang.Exception -> L24
            r10.g = r5     // Catch: java.lang.Exception -> L24
            java.lang.Object r3 = defpackage.rx.S(r1, r3, r10)     // Catch: java.lang.Exception -> L24
            if (r3 != r8) goto L67
            goto L7b
        L67:
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L24
            ao1 r5 = new ao1     // Catch: java.lang.Exception -> L24
            r6 = 0
            r5.<init>(r0, r7, r6)     // Catch: java.lang.Exception -> L24
            r10.h = r11     // Catch: java.lang.Exception -> L24
            r10.i = r3     // Catch: java.lang.Exception -> L24
            r10.g = r4     // Catch: java.lang.Exception -> L24
            java.lang.Object r10 = defpackage.rx.S(r1, r5, r10)     // Catch: java.lang.Exception -> L24
            if (r10 != r8) goto L7c
        L7b:
            return r8
        L7c:
            r0 = r11
            r11 = r10
            r10 = r0
            r0 = r3
        L80:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L24
            un1 r1 = new un1     // Catch: java.lang.Exception -> L24
            r1.<init>(r10, r0, r11)     // Catch: java.lang.Exception -> L24
            r2.getClass()     // Catch: java.lang.Exception -> L24
            r2.k(r7, r1)     // Catch: java.lang.Exception -> L24
            goto La1
        L8e:
            vn1 r11 = new vn1
            java.lang.String r10 = r10.getMessage()
            if (r10 != 0) goto L98
            java.lang.String r10 = "Unknown error"
        L98:
            r11.<init>(r10)
            r2.getClass()
            r2.k(r7, r11)
        La1:
            od2 r10 = defpackage.od2.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new l((r31) this.h, (ri1) this.i, (q10) obj2, vtVar, 0);
            case 1:
                return new l((se0) this.h, this.i, (gv) obj2, vtVar, 1);
            case 2:
                l lVar = new l((de0) this.i, (se0) obj2, vtVar, 2);
                lVar.h = obj;
                return lVar;
            case 3:
                l lVar2 = new l((te0) this.i, (n4) obj2, vtVar, 3);
                lVar2.h = obj;
                return lVar2;
            case 4:
                l lVar3 = new l((ue0) this.i, (n4) obj2, vtVar, 4);
                lVar3.h = obj;
                return lVar3;
            case 5:
                l lVar4 = new l((lb2) this.i, (o41) obj2, vtVar, 5);
                lVar4.h = obj;
                return lVar4;
            case 6:
                return new l((r22) this.i, (ta2) obj2, vtVar, 6);
            case 7:
                return new l((sc0) this.h, (o41) this.i, (ta2) obj2, vtVar, 7);
            case 8:
                return new l((uj) this.h, (e81) this.i, (f5) obj2, vtVar, 8);
            case 9:
                l lVar5 = new l((wa0) this.i, (fm) obj2, vtVar, 9);
                lVar5.h = obj;
                return lVar5;
            case 10:
                l lVar6 = new l((nx) obj2, vtVar, 10);
                lVar6.i = obj;
                return lVar6;
            case 11:
                l lVar7 = new l((nx) this.i, (se0) obj2, vtVar, 11);
                lVar7.h = obj;
                return lVar7;
            case 12:
                l lVar8 = new l((xy) this.i, (se0) obj2, vtVar, 12);
                lVar8.h = obj;
                return lVar8;
            case 13:
                return new l((xy) this.h, (t41) this.i, (se0) obj2, vtVar, 13);
            case 14:
                l lVar9 = new l((l30) this.i, (w30) obj2, vtVar, 14);
                lVar9.h = obj;
                return lVar9;
            case 15:
                l lVar10 = new l((w30) this.i, (y20) obj2, vtVar, 15);
                lVar10.h = obj;
                return lVar10;
            case 16:
                l lVar11 = new l((r31) this.h, (pa0) obj2, vtVar);
                lVar11.i = obj;
                return lVar11;
            case 17:
                return new l((xu) this.h, (va0) this.i, (cj1) obj2, vtVar, 17);
            case 18:
                return new l((r31) this.h, (hn0) this.i, (q10) obj2, vtVar, 18);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return new l((lk) obj2, vtVar, 19);
            case 20:
                return new l((st0) this.h, (o22) this.i, (o22) obj2, vtVar, 20);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                l lVar12 = new l((bi0) this.i, (String) obj2, vtVar, 21);
                lVar12.h = obj;
                return lVar12;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return new l((bi0) obj2, vtVar, 22);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new l((el0) this.h, (kd) this.i, (kd) obj2, vtVar, 23);
            case 24:
                return new l((lt1) this.h, (o41) this.i, (fe1) obj2, vtVar, 24);
            case 25:
                l lVar13 = new l((il1) this.i, (ja) obj2, vtVar, 25);
                lVar13.h = obj;
                return lVar13;
            case 26:
                l lVar14 = new l((se0) this.i, (zm1) obj2, vtVar, 26);
                lVar14.h = obj;
                return lVar14;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new l((co1) obj2, vtVar, 27);
            case 28:
                l lVar15 = new l((l30) this.i, (at1) obj2, vtVar, 28);
                lVar15.h = obj;
                return lVar15;
            default:
                l lVar16 = new l((at1) this.i, (se0) obj2, vtVar, 29);
                lVar16.h = obj;
                return lVar16;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 3:
                return ((l) create((cy) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 4:
                return ((l) create((xd1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 5:
                return ((l) create((cj1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 6:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 7:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 8:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 9:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 10:
                return ((l) create((wa0) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 11:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 12:
                return ((l) create((ds1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 13:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 14:
                return ((l) create((cz1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 15:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 16:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 17:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 18:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 20:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 24:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 25:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 26:
                return ((l) create((cj1) obj, (vt) obj2)).invokeSuspend(od2Var);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return ((l) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 28:
                return ((l) create((ys1) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((l) create((ds1) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x031d, code lost:
    
        if (r11.b(r2, r25) == r12) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01bc, code lost:
    
        if (r2 == r12) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0372, code lost:
    
        if (defpackage.fp.w(2000, r25) == r6) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x038e, code lost:
    
        if (r8 == r6) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03aa, code lost:
    
        if (r1 == r6) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0570, code lost:
    
        if (r2.a(r3, r25) == r4) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x057f, code lost:
    
        if (defpackage.rx.S(r3, r6, r25) == r4) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0822, code lost:
    
        if (r0 == r6) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x07bf, code lost:
    
        if (r9 == r6) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0965, code lost:
    
        if (r1 == r3) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0a21, code lost:
    
        if (defpackage.qo.v(r2, r0, r25) == r6) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0a3d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0a0d, code lost:
    
        if (r4.c(r0, r25) == r6) goto L516;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ba A[Catch: all -> 0x048d, TryCatch #4 {all -> 0x048d, blocks: (B:232:0x0487, B:234:0x04b2, B:236:0x04ba, B:237:0x04c8, B:245:0x04d9, B:247:0x04a3, B:251:0x04dc, B:255:0x04e1, B:256:0x04e2, B:263:0x049e, B:239:0x04c9, B:241:0x04cf), top: B:227:0x047a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ff  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v37, types: [dm] */
    /* JADX WARN: Type inference failed for: r3v39, types: [lk] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [dm] */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x038e -> B:164:0x0391). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x04ae -> B:202:0x04b2). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }
}
