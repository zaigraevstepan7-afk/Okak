package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.fl0;
import defpackage.gj1;
import defpackage.wc0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements fl0 {
    @Override // defpackage.fl0
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new gj1(this, context.getApplicationContext()));
        return new wc0(26);
    }

    @Override // defpackage.fl0
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
