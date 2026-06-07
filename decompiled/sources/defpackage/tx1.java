package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.ld;
import defpackage.px1;
import defpackage.tx1;
import defpackage.ui2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tx1 implements l80 {
    public final SidecarInterface a;
    public final px1 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public ld e;

    public tx1(Context context) {
        SidecarInterface a = rx1.a(context);
        px1 px1Var = new px1();
        this.a = a;
        this.b = px1Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final ui2 a(Activity activity) {
        IBinder iBinder;
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
        if (window != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        } else {
            iBinder = null;
        }
        if (iBinder == null) {
            return new ui2(l60.e);
        }
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.b.c(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void b(Activity activity) {
        IBinder iBinder;
        boolean z;
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
            }
            LinkedHashMap linkedHashMap = this.d;
            ys ysVar = (ys) linkedHashMap.get(activity);
            if (ysVar != null) {
                if (activity instanceof yp) {
                    ((yp) activity).m.remove(ysVar);
                }
                linkedHashMap.remove(activity);
            }
            ld ldVar = this.e;
            if (ldVar != null) {
                ReentrantLock reentrantLock = (ReentrantLock) ldVar.g;
                reentrantLock.lock();
                try {
                    ((WeakHashMap) ldVar.h).put(activity, null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            LinkedHashMap linkedHashMap2 = this.c;
            if (linkedHashMap2.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMap2.remove(iBinder);
            if (z && (sidecarInterface = this.a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void c(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ld ldVar = this.e;
        if (ldVar != null) {
            ldVar.o(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof yp)) {
            ys ysVar = new ys() { // from class: qx1
                @Override // defpackage.ys
                public final void accept(Object obj) {
                    tx1 tx1Var = tx1.this;
                    ld ldVar2 = tx1Var.e;
                    if (ldVar2 != null) {
                        Activity activity2 = activity;
                        ldVar2.o(activity2, tx1Var.a(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, ysVar);
            ((yp) activity).m.add(ysVar);
        }
    }

    public final void d(ov1 ov1Var) {
        this.e = new ld(ov1Var);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    IBinder iBinder;
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    newDeviceState.getClass();
                    Collection<Activity> values = tx1.this.c.values();
                    tx1 tx1Var = tx1.this;
                    for (Activity activity : values) {
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                            iBinder = attributes.token;
                        } else {
                            iBinder = null;
                        }
                        if (iBinder != null && (sidecarInterface2 = tx1Var.a) != null) {
                            sidecarWindowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        ld ldVar = tx1Var.e;
                        if (ldVar != null) {
                            ldVar.o(activity, tx1Var.b.c(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    SidecarDeviceState sidecarDeviceState;
                    windowToken.getClass();
                    newLayout.getClass();
                    Activity activity = (Activity) tx1.this.c.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    tx1 tx1Var = tx1.this;
                    px1 px1Var = tx1Var.b;
                    SidecarInterface sidecarInterface2 = tx1Var.a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    ui2 c = px1Var.c(newLayout, sidecarDeviceState);
                    ld ldVar = tx1.this.e;
                    if (ldVar != null) {
                        ldVar.o(activity, c);
                    }
                }
            }));
        }
    }

    public final boolean e() {
        Method method;
        Class<?> cls;
        Method method2;
        Class<?> cls2;
        Method method3;
        Class<?> cls3;
        Method method4;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        Class<?> cls7;
        Class<?> cls8;
        try {
            SidecarInterface sidecarInterface = this.a;
            if (sidecarInterface != null && (cls8 = sidecarInterface.getClass()) != null) {
                method = cls8.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            } else {
                method = null;
            }
            if (method != null) {
                cls = method.getReturnType();
            } else {
                cls = null;
            }
            Class cls9 = Void.TYPE;
            if (sn0.r(cls, cls9)) {
                SidecarInterface sidecarInterface2 = this.a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.a;
                if (sidecarInterface4 != null && (cls7 = sidecarInterface4.getClass()) != null) {
                    method2 = cls7.getMethod("getWindowLayoutInfo", IBinder.class);
                } else {
                    method2 = null;
                }
                if (method2 != null) {
                    cls2 = method2.getReturnType();
                } else {
                    cls2 = null;
                }
                if (sn0.r(cls2, SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface5 = this.a;
                    if (sidecarInterface5 != null && (cls6 = sidecarInterface5.getClass()) != null) {
                        method3 = cls6.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                    } else {
                        method3 = null;
                    }
                    if (method3 != null) {
                        cls3 = method3.getReturnType();
                    } else {
                        cls3 = null;
                    }
                    if (sn0.r(cls3, cls9)) {
                        SidecarInterface sidecarInterface6 = this.a;
                        if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                            method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        } else {
                            method4 = null;
                        }
                        if (method4 != null) {
                            cls4 = method4.getReturnType();
                        } else {
                            cls4 = null;
                        }
                        if (sn0.r(cls4, cls9)) {
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                invoke.getClass();
                                if (((Integer) invoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            rect.getClass();
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                                return true;
                            } catch (NoSuchFieldError unused2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                invoke2.getClass();
                                if (arrayList.equals((List) invoke2)) {
                                    return true;
                                }
                                throw new Exception("Invalid display feature getter/setter");
                            }
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + cls4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + cls3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + cls2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + cls);
        } catch (Throwable unused3) {
            return false;
        }
    }
}
