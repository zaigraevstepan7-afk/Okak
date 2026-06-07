package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j6 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration e;
    public final /* synthetic */ lj0 f;

    public j6(Configuration configuration, lj0 lj0Var) {
        this.e = configuration;
        this.f = lj0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.e;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f.a.entrySet().iterator();
        while (it.hasNext()) {
            jj0 jj0Var = (jj0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (jj0Var == null || Configuration.needNewResources(updateFrom, jj0Var.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f.a.clear();
    }
}
