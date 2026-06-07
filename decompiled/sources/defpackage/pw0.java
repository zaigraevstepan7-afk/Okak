package defpackage;

import com.elixir.loader.data.api.loader.LoaderApi;
import com.elixir.loader.data.api.loader.LoaderDownloadApi;
import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pw0 {
    public final LoaderApi a;
    public final LoaderDownloadApi b;
    public final String c;
    public final File d;

    public pw0(LoaderApi loaderApi, LoaderDownloadApi loaderDownloadApi, String str, File file) {
        this.a = loaderApi;
        this.b = loaderDownloadApi;
        this.c = str;
        this.d = new File(file, "loader_update.apk");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.hh1 r6, defpackage.wt r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.nw0
            if (r0 == 0) goto L13
            r0 = r7
            nw0 r0 = (defpackage.nw0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            nw0 r0 = new nw0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.io.K(r7)     // Catch: java.lang.Throwable -> L48
            goto L45
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            return r3
        L2c:
            defpackage.io.K(r7)
            vy r7 = defpackage.k10.a     // Catch: java.lang.Throwable -> L48
            ny r7 = defpackage.ny.g     // Catch: java.lang.Throwable -> L48
            j r1 = new j     // Catch: java.lang.Throwable -> L48
            r4 = 25
            r1.<init>(r5, r6, r3, r4)     // Catch: java.lang.Throwable -> L48
            r0.g = r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = defpackage.rx.S(r7, r1, r0)     // Catch: java.lang.Throwable -> L48
            hv r6 = defpackage.hv.e
            if (r5 != r6) goto L45
            return r6
        L45:
            od2 r5 = defpackage.od2.a     // Catch: java.lang.Throwable -> L48
            return r5
        L48:
            r5 = move-exception
            fo1 r6 = new fo1
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw0.a(hh1, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.wt r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ow0
            if (r0 == 0) goto L13
            r0 = r5
            ow0 r0 = (defpackage.ow0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ow0 r0 = new ow0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.io.K(r5)     // Catch: java.lang.Throwable -> L45
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.io.K(r5)
            com.elixir.loader.data.api.loader.LoaderApi r4 = r4.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "apk"
            r0.g = r2     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.getHash(r5, r0)     // Catch: java.lang.Throwable -> L45
            hv r4 = defpackage.hv.e
            if (r5 != r4) goto L3e
            return r4
        L3e:
            com.elixir.loader.data.api.loader.HashResponse r5 = (com.elixir.loader.data.api.loader.HashResponse) r5     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r5.getHash()     // Catch: java.lang.Throwable -> L45
            return r4
        L45:
            r4 = move-exception
            fo1 r5 = new fo1
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw0.b(wt):java.io.Serializable");
    }
}
