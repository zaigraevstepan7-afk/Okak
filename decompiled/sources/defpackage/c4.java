package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c4 implements wa0 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;
    public final Object h;

    public c4(wa0 wa0Var, xu xuVar) {
        this.e = 6;
        this.f = xuVar;
        this.g = mp0.N(xuVar);
        this.h = new b31(wa0Var, null, 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vt r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r6.g
            h32 r1 = (defpackage.h32) r1
            boolean r2 = r7 instanceof defpackage.rn1
            if (r2 == 0) goto L1b
            r2 = r7
            rn1 r2 = (defpackage.rn1) r2
            int r3 = r2.g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.g = r3
            goto L20
        L1b:
            rn1 r2 = new rn1
            r2.<init>(r6, r7)
        L20:
            java.lang.Object r7 = r2.e
            int r3 = r2.g
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            defpackage.io.K(r7)
            goto L6e
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            r6 = 0
            return r6
        L34:
            defpackage.io.K(r7)
            java.lang.Object r6 = r6.f
            sz1 r6 = (defpackage.sz1) r6
            int r7 = r1.a
            switch(r7) {
                case 0: goto L4c;
                case 1: goto L49;
                case 2: goto L46;
                case 3: goto L43;
                default: goto L40;
            }
        L40:
            java.lang.String r7 = "权限被拒绝"
            goto L4e
        L43:
            java.lang.String r7 = "Дозвіл відхилено"
            goto L4e
        L46:
            java.lang.String r7 = "Разрешение отклонено"
            goto L4e
        L49:
            java.lang.String r7 = "Permissão negada"
            goto L4e
        L4c:
            java.lang.String r7 = "Permission denied"
        L4e:
            int r1 = r1.a
            switch(r1) {
                case 0: goto L5f;
                case 1: goto L5c;
                case 2: goto L59;
                case 3: goto L56;
                default: goto L53;
            }
        L53:
            java.lang.String r1 = "打开设置"
            goto L61
        L56:
            java.lang.String r1 = "Відкрити налаштування"
            goto L61
        L59:
            java.lang.String r1 = "Открыть настройки"
            goto L61
        L5c:
            java.lang.String r1 = "Abrir configurações"
            goto L61
        L5f:
            java.lang.String r1 = "Open Settings"
        L61:
            r2.g = r4
            r3 = 12
            java.lang.Object r7 = defpackage.sz1.b(r6, r7, r1, r2, r3)
            hv r6 = defpackage.hv.e
            if (r7 != r6) goto L6e
            return r6
        L6e:
            xz1 r7 = (defpackage.xz1) r7
            xz1 r6 = defpackage.xz1.f
            if (r7 != r6) goto L9c
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r6.<init>(r7)
            java.lang.String r7 = r0.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "package:"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            r6.setData(r7)
            r7 = 268435456(0x10000000, float:2.524355E-29)
            r6.addFlags(r7)
            r0.startActivity(r6)
        L9c:
            od2 r6 = defpackage.od2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4.a(vt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    @Override // defpackage.wa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r22, defpackage.vt r23) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4.b(java.lang.Object, vt):java.lang.Object");
    }

    public /* synthetic */ c4(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
