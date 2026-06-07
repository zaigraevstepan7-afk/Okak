package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.sh2;
import defpackage.t80;
import defpackage.ui2;
import defpackage.yq1;
import defpackage.ys;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lys;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lod2;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MulticastConsumer implements ys {
    public final Context a;
    public ui2 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.a = context;
    }

    public final void a(sh2 sh2Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ui2 ui2Var = this.c;
            if (ui2Var != null) {
                sh2Var.accept(ui2Var);
            }
            this.d.add(sh2Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.ys
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ui2 c = t80.c(this.a, value);
            this.c = c;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ys) it.next()).accept(c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
