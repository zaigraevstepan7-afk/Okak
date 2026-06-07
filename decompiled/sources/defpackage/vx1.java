package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vx1 implements mh2 {
    public static volatile vx1 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final l80 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public vx1(tx1 tx1Var) {
        this.a = tx1Var;
        if (tx1Var != null) {
            tx1Var.d(new ov1(this, 1));
        }
    }

    @Override // defpackage.mh2
    public final void a(Context context, ej1 ej1Var, sh2 sh2Var) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        ui2 ui2Var = null;
        r1 = null;
        IBinder iBinder = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        l60 l60Var = l60.e;
        if (activity != null) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                l80 l80Var = this.a;
                if (l80Var == null) {
                    sh2Var.accept(new ui2(l60Var));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((ux1) it.next()).a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                ux1 ux1Var = new ux1(activity, ej1Var, sh2Var);
                copyOnWriteArrayList.add(ux1Var);
                if (!z) {
                    tx1 tx1Var = (tx1) l80Var;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        tx1Var.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new sx1(tx1Var, activity));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (activity.equals(((ux1) obj).a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    ux1 ux1Var2 = (ux1) obj;
                    if (ux1Var2 != null) {
                        ui2Var = ux1Var2.c;
                    }
                    if (ui2Var != null) {
                        ux1Var.c = ui2Var;
                        ux1Var.b.accept(ui2Var);
                    }
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        sh2Var.accept(new ui2(l60Var));
    }

    @Override // defpackage.mh2
    public final void b(sh2 sh2Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    ux1 ux1Var = (ux1) it.next();
                    if (ux1Var.b == sh2Var) {
                        arrayList.add(ux1Var);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((ux1) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((ux1) it3.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    l80 l80Var = this.a;
                    if (l80Var != null) {
                        ((tx1) l80Var).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
