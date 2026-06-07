package com.topjohnwu.superuser.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.FileObserver;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.IRootServiceManager;
import com.topjohnwu.superuser.internal.RootServiceServer;
import com.topjohnwu.superuser.ipc.RootService;
import defpackage.fp1;
import defpackage.gp1;
import defpackage.r5;
import defpackage.se;
import defpackage.wp;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class RootServiceServer extends IRootServiceManager.Stub implements Runnable {
    private static RootServiceServer mInstance;
    private final boolean isDaemon;
    private final FileObserver observer;
    private final Map<ComponentName, ServiceRecord> services = new ArrayMap();
    private final SparseArray<ClientProcess> clients = new SparseArray<>();

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class AppObserver extends FileObserver {
        private final String name;

        public AppObserver(File file) {
            super(file.getParent(), 1984);
            file.getParent();
            this.name = file.getName();
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if (i == 1024 || this.name.equals(str)) {
                RootServiceServer.this.exit("Package updated");
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class ClientProcess extends BinderHolder {
        final Messenger m;
        final int uid;

        public ClientProcess(IBinder iBinder, int i) {
            super(iBinder);
            this.m = new Messenger(iBinder);
            this.uid = i;
        }

        @Override // com.topjohnwu.superuser.internal.BinderHolder
        public void onBinderDied() {
            RootServiceServer.this.clients.remove(this.uid);
            RootServiceServer.this.unbindServices(this.uid);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ServiceRecord {
        IBinder binder;
        Intent intent;
        boolean rebind;
        final RootService service;
        final Set<Integer> users = Utils.newArraySet();

        public ServiceRecord(RootService rootService) {
            this.service = rootService;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RootServiceServer(Context context) {
        boolean z;
        if (System.getenv("LIBSU_VERBOSE_LOGGING") != null) {
            z = true;
        } else {
            z = false;
        }
        Shell.enableVerboseLogging = z;
        Utils.context = context;
        if (System.getenv("LIBSU_DEBUGGER") != null) {
            HiddenAPIs.setAppName(context.getPackageName() + ":root");
            while (true) {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                }
            }
        } else {
            AppObserver appObserver = new AppObserver(new File(context.getPackageCodePath()));
            this.observer = appObserver;
            appObserver.startWatching();
            if (context instanceof Callable) {
                try {
                    Object[] objArr = (Object[]) ((Callable) context).call();
                    boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                    this.isDaemon = booleanValue;
                    if (booleanValue) {
                        HiddenAPIs.addService(RootServerMain.getServiceName(context.getPackageName()), this);
                    }
                    broadcast(((Integer) objArr[0]).intValue());
                    if (!booleanValue) {
                        UiThreadHandler.handler.postDelayed(this, 10000L);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            se.h("Expected Context to be Callable");
            throw null;
        }
    }

    private IBinder bindInternal(int i, Intent intent) {
        if (this.clients.get(i) == null) {
            return null;
        }
        ComponentName component = intent.getComponent();
        ServiceRecord serviceRecord = this.services.get(component);
        if (serviceRecord == null) {
            Context context = Utils.context;
            Constructor<?> declaredConstructor = context.getClassLoader().loadClass(component.getClassName()).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            HiddenAPIs.attachBaseContext(declaredConstructor.newInstance(null), context);
            serviceRecord = this.services.get(component);
            if (serviceRecord == null) {
                return null;
            }
        }
        if (serviceRecord.binder != null) {
            component.getClassName();
            if (serviceRecord.rebind) {
                serviceRecord.service.onRebind(serviceRecord.intent);
            }
        } else {
            component.getClassName();
            serviceRecord.binder = serviceRecord.service.onBind(intent);
            serviceRecord.intent = intent.cloneFilter();
        }
        serviceRecord.users.add(Integer.valueOf(i));
        return serviceRecord.binder;
    }

    /* renamed from: connectInternal */
    public void lambda$connect$0(int i, IBinder iBinder) {
        if (this.clients.get(i) != null) {
            return;
        }
        try {
            this.clients.put(i, new ClientProcess(iBinder, i));
            UiThreadHandler.handler.removeCallbacks(this);
        } catch (RemoteException e) {
            Utils.err("IPC", e);
        }
    }

    public void exit(String str) {
        System.exit(0);
    }

    public static RootServiceServer getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new RootServiceServer(context);
        }
        return mInstance;
    }

    public /* synthetic */ void lambda$bind$1(IBinder[] iBinderArr, int i, Intent intent) {
        try {
            iBinderArr[0] = bindInternal(i, intent);
        } catch (Exception e) {
            Utils.err("IPC", e);
        }
    }

    public /* synthetic */ void lambda$selfStop$4(ComponentName componentName) {
        componentName.getClassName();
        unbindService(-1, componentName);
    }

    public /* synthetic */ void lambda$stop$3(ComponentName componentName, int i) {
        componentName.getClassName();
        unbindService(-1, componentName);
        broadcast(i);
    }

    public /* synthetic */ void lambda$unbind$2(ComponentName componentName, int i) {
        componentName.getClassName();
        unbindService(i, componentName);
    }

    public /* synthetic */ void lambda$unbindService$5(ComponentName componentName) {
        this.services.remove(componentName);
    }

    private void unbindInternal(ServiceRecord serviceRecord, int i, Runnable runnable) {
        boolean isEmpty = serviceRecord.users.isEmpty();
        serviceRecord.users.remove(Integer.valueOf(i));
        if (i < 0 || serviceRecord.users.isEmpty()) {
            if (!isEmpty) {
                serviceRecord.rebind = serviceRecord.service.onUnbind(serviceRecord.intent);
            }
            if (i < 0 || !this.isDaemon) {
                serviceRecord.service.onDestroy();
                runnable.run();
                Iterator<Integer> it = serviceRecord.users.iterator();
                while (it.hasNext()) {
                    ClientProcess clientProcess = this.clients.get(it.next().intValue());
                    if (clientProcess != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.arg1 = this.isDaemon ? 1 : 0;
                        obtain.obj = serviceRecord.intent.getComponent();
                        try {
                            try {
                                clientProcess.m.send(obtain);
                            } catch (RemoteException e) {
                                Utils.err("IPC", e);
                            }
                        } finally {
                            obtain.recycle();
                        }
                    }
                }
            }
        }
        if (this.services.isEmpty()) {
            exit("No active services");
        }
    }

    private void unbindService(int i, ComponentName componentName) {
        ServiceRecord serviceRecord = this.services.get(componentName);
        if (serviceRecord == null) {
            return;
        }
        unbindInternal(serviceRecord, i, new gp1(this, componentName, 1));
    }

    public void unbindServices(int i) {
        Iterator<Map.Entry<ComponentName, ServiceRecord>> it = this.services.entrySet().iterator();
        while (it.hasNext()) {
            ServiceRecord value = it.next().getValue();
            if (i < 0) {
                value.users.clear();
            }
            unbindInternal(value, i, new r5(it, 10));
        }
    }

    @Override // com.topjohnwu.superuser.internal.IRootServiceManager
    public IBinder bind(final Intent intent) {
        final IBinder[] iBinderArr = new IBinder[1];
        final int callingUid = Binder.getCallingUid();
        UiThreadHandler.runAndWait(new Runnable() { // from class: hp1
            @Override // java.lang.Runnable
            public final void run() {
                RootServiceServer.this.lambda$bind$1(iBinderArr, callingUid, intent);
            }
        });
        return iBinderArr[0];
    }

    @Override // com.topjohnwu.superuser.internal.IRootServiceManager
    public void broadcast(int i) {
        if (Binder.getCallingUid() != 0) {
            i = Binder.getCallingUid();
        }
        Utils.context.sendBroadcastAsUser(RootServiceManager.getBroadcastIntent(this, this.isDaemon), UserHandle.getUserHandleForUid(i));
    }

    @Override // com.topjohnwu.superuser.internal.IRootServiceManager
    public void connect(IBinder iBinder) {
        UiThreadHandler.run(new wp(this, Binder.getCallingUid(), 3, iBinder));
    }

    public void register(RootService rootService) {
        this.services.put(rootService.getComponentName(), new ServiceRecord(rootService));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.clients.size() == 0) {
            exit("No active clients");
        }
    }

    public void selfStop(ComponentName componentName) {
        UiThreadHandler.run(new gp1(this, componentName, 0));
    }

    @Override // com.topjohnwu.superuser.internal.IRootServiceManager
    public void stop(ComponentName componentName, int i) {
        if (Binder.getCallingUid() != 0) {
            i = Binder.getCallingUid();
        }
        UiThreadHandler.run(new fp1(this, componentName, i, 1));
    }

    @Override // com.topjohnwu.superuser.internal.IRootServiceManager
    public void unbind(ComponentName componentName) {
        UiThreadHandler.run(new fp1(this, componentName, Binder.getCallingUid(), 0));
    }
}
