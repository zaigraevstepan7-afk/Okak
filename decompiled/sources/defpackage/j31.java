package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j31 implements ys, Consumer2 {
    public final Context a;
    public ui2 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public j31(Context context) {
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
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            ui2 c = t80.c(this.a, windowLayoutInfo);
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
