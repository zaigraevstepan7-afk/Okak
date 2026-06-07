package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class o80 extends m80 {
    public final WindowLayoutComponent a;
    public final bt b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public o80(WindowLayoutComponent windowLayoutComponent, bt btVar) {
        this.a = windowLayoutComponent;
        this.b = btVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n80, df0] */
    @Override // defpackage.m80, defpackage.mh2
    public void a(Context context, ej1 ej1Var, sh2 sh2Var) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(sh2Var);
                linkedHashMap2.put(sh2Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(sh2Var, context);
                multicastConsumer2.a(sh2Var);
                if (context instanceof Activity) {
                    this.f.put(multicastConsumer2, this.b.a(this.a, yl1.a(WindowLayoutInfo.class), (Activity) context, new df0(1, 0, MulticastConsumer.class, multicastConsumer2, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V")));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(l60.e));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.m80, defpackage.mh2
    public void b(sh2 sh2Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(sh2Var);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(sh2Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(sh2Var);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    at atVar = (at) this.f.remove(multicastConsumer);
                    if (atVar != null) {
                        atVar.a.invoke(atVar.b, atVar.c);
                    }
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
