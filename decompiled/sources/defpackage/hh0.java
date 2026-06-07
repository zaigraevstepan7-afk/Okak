package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.topjohnwu.superuser.nio.FileSystemManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class hh0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ hh0(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        Context context = this.f;
        switch (i) {
            case 0:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/elixir_reborn_community")).addFlags(FileSystemManager.MODE_READ_ONLY));
                return od2.a;
            default:
                return vn.r(context);
        }
    }
}
