package okhttp3.internal.platform;

import android.content.Context;
import defpackage.fl0;
import defpackage.l60;
import defpackage.yq1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lfl0;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lokhttp3/internal/platform/Platform;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PlatformInitializer implements fl0 {
    @Override // defpackage.fl0
    public Platform create(Context context) {
        context.getClass();
        PlatformRegistry.INSTANCE.setApplicationContext(context);
        return Platform.INSTANCE.get();
    }

    @Override // defpackage.fl0
    public List<Class<fl0>> dependencies() {
        return l60.e;
    }
}
