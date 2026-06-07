package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fj2 extends ContentObserver {
    public final /* synthetic */ lk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj2(lk lkVar, Handler handler) {
        super(handler);
        this.a = lkVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.j(od2.a);
    }
}
