package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class p80 extends o80 {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public p80(WindowLayoutComponent windowLayoutComponent, bt btVar) {
        super(windowLayoutComponent, btVar);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // defpackage.o80, defpackage.m80, defpackage.mh2
    public final void a(Context context, ej1 ej1Var, sh2 sh2Var) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            j31 j31Var = (j31) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (j31Var != null) {
                j31Var.a(sh2Var);
                linkedHashMap2.put(sh2Var, context);
            } else {
                j31 j31Var2 = new j31(context);
                linkedHashMap.put(context, j31Var2);
                linkedHashMap2.put(sh2Var, context);
                j31Var2.a(sh2Var);
                this.a.addWindowLayoutInfoListener(context, j31Var2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.o80, defpackage.m80, defpackage.mh2
    public final void b(sh2 sh2Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(sh2Var);
            if (context == null) {
                return;
            }
            j31 j31Var = (j31) linkedHashMap.get(context);
            if (j31Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = j31Var.b;
            reentrantLock2.lock();
            try {
                j31Var.d.remove(sh2Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(sh2Var);
                if (j31Var.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(j31Var);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
