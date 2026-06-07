package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.fl0;
import defpackage.ld;
import defpackage.md0;
import defpackage.uu0;
import defpackage.v50;
import defpackage.w50;
import defpackage.wu0;
import defpackage.y50;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements fl0 {
    @Override // defpackage.fl0
    public final Object create(Context context) {
        Object obj;
        md0 md0Var = new md0(new y50(context, 0));
        md0Var.b = 1;
        if (v50.k == null) {
            synchronized (v50.j) {
                try {
                    if (v50.k == null) {
                        v50.k = new v50(md0Var);
                    }
                } finally {
                }
            }
        }
        ld j = ld.j(context);
        j.getClass();
        synchronized (ld.j) {
            try {
                obj = ((HashMap) j.f).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = j.f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        wu0 g = ((uu0) obj).g();
        g.a(new w50(this, g));
        return Boolean.TRUE;
    }

    @Override // defpackage.fl0
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
