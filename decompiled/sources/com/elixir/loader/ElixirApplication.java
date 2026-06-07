package com.elixir.loader;

import android.app.Application;
import com.topjohnwu.superuser.Shell;
import defpackage.fp;
import defpackage.go;
import defpackage.gz0;
import defpackage.h42;
import defpackage.jd;
import defpackage.k10;
import defpackage.rx;
import defpackage.ut;
import defpackage.vf;
import defpackage.vt;
import defpackage.vy;
import defpackage.xq1;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/elixir/loader/ElixirApplication;", "Landroid/app/Application;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ElixirApplication extends Application {
    public jd e;
    public final ut f;

    public ElixirApplication() {
        h42 b = xq1.b();
        vy vyVar = k10.a;
        this.f = fp.b(go.M(b, gz0.a));
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        this.e = new jd(this);
        Shell.setDefaultBuilder(Shell.Builder.create().setTimeout(10L));
        rx.C(this.f, null, new vf(this, (vt) null, 2), 3);
    }
}
