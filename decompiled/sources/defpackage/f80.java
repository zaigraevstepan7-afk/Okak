package defpackage;

import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class f80 implements de0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f80(o41 o41Var, oe0 oe0Var, boolean z) {
        this.g = o41Var;
        this.h = oe0Var;
        this.f = z;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        od2 od2Var;
        int i = this.e;
        od2 od2Var2 = od2.a;
        int i2 = 1;
        Object obj = this.h;
        Object obj2 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                ((o41) obj2).setValue(new Object());
                ((oe0) obj).invoke(Boolean.valueOf(!z));
                return od2Var2;
            case 1:
                od2Var = Http2Connection.ReaderRunnable.settings$lambda$0((Http2Connection.ReaderRunnable) obj2, z, (Settings) obj);
                return od2Var;
            default:
                l40 l40Var = (l40) obj2;
                gv gvVar = (gv) obj;
                if (z && ((Boolean) l40Var.a.invoke(m40.e)).booleanValue()) {
                    rx.C(gvVar, null, new ee(l40Var, null, i2), 3);
                }
                return od2Var2;
        }
    }

    public /* synthetic */ f80(Http2Connection.ReaderRunnable readerRunnable, boolean z, Settings settings) {
        this.g = readerRunnable;
        this.f = z;
        this.h = settings;
    }

    public /* synthetic */ f80(boolean z, l40 l40Var, gv gvVar) {
        this.f = z;
        this.g = l40Var;
        this.h = gvVar;
    }
}
