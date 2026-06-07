package defpackage;

import com.elixir.loader.data.api.releases.ReleasesApi;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kf2 {
    public final ReleasesApi a;
    public final ReleasesApi b;

    public kf2(ReleasesApi releasesApi, ReleasesApi releasesApi2) {
        this.a = releasesApi;
        this.b = releasesApi2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.wt r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to download file: "
            boolean r1 = r7 instanceof defpackage.if2
            if (r1 == 0) goto L15
            r1 = r7
            if2 r1 = (defpackage.if2) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1a
        L15:
            if2 r1 = new if2
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.e
            int r2 = r1.g
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.io.K(r7)     // Catch: java.lang.Throwable -> L65
            goto L3e
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.io.K(r7)
            com.elixir.loader.data.api.releases.ReleasesApi r5 = r5.b     // Catch: java.lang.Throwable -> L65
            r1.g = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r7 = r5.downloadBinary(r6, r1)     // Catch: java.lang.Throwable -> L65
            hv r5 = defpackage.hv.e
            if (r7 != r5) goto L3e
            return r5
        L3e:
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Throwable -> L65
            java.lang.Object r5 = r7.body()     // Catch: java.lang.Throwable -> L65
            okhttp3.ResponseBody r5 = (okhttp3.ResponseBody) r5     // Catch: java.lang.Throwable -> L65
            boolean r6 = r7.isSuccessful()     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L4f
            if (r5 == 0) goto L4f
            return r5
        L4f:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L65
            int r6 = r7.code()     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L65
            r7.append(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L65
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r5     // Catch: java.lang.Throwable -> L65
        L65:
            r5 = move-exception
            fo1 r6 = new fo1
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf2.a(java.lang.String, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r5, java.lang.String r6, defpackage.wt r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.jf2
            if (r0 == 0) goto L13
            r0 = r7
            jf2 r0 = (defpackage.jf2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            jf2 r0 = new jf2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.io.K(r7)     // Catch: java.lang.Throwable -> L3f
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.io.K(r7)
            com.elixir.loader.data.api.releases.ReleasesApi r4 = r4.a     // Catch: java.lang.Throwable -> L3f
            r0.g = r2     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r7 = r4.getHistory(r5, r6, r0)     // Catch: java.lang.Throwable -> L3f
            hv r4 = defpackage.hv.e
            if (r7 != r4) goto L3c
            return r4
        L3c:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L3f
            return r7
        L3f:
            r4 = move-exception
            fo1 r5 = new fo1
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf2.b(boolean, java.lang.String, wt):java.lang.Object");
    }
}
