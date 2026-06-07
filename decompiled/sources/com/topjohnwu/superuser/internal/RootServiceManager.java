package com.topjohnwu.superuser.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.ShellUtils;
import com.topjohnwu.superuser.internal.IRootServiceManager;
import com.topjohnwu.superuser.internal.RootServiceManager;
import com.topjohnwu.superuser.ipc.RootService;
import defpackage.se;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class RootServiceManager implements Handler.Callback {
    private static final String API_27_DEBUG = "-Xrunjdwp:transport=dt_android_adb,suspend=n,server=y -Xcompiler-option --debuggable";
    private static final String API_28_DEBUG = "-XjdwpProvider:adbconnection -XjdwpOptions:suspend=n,server=y -Xcompiler-option --debuggable";
    private static final String BUNDLE_BINDER_KEY = "binder";
    private static final int DAEMON_EN_ROUTE = 2;
    static final String DEBUG_ENV = "LIBSU_DEBUGGER";
    private static final String INTENT_BUNDLE_KEY = "extra.bundle";
    private static final String INTENT_DAEMON_KEY = "extra.daemon";
    private static final String JVMTI_ERROR = " \n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n! Warning: JVMTI agent is enabled. Please enable the !\n! 'Always install with package manager' option in    !\n! Android Studio. For more details and information,  !\n! check out RootService's Javadoc.                   !\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n";
    static final String LOGGING_ENV = "LIBSU_VERBOSE_LOGGING";
    static final int MSG_STOP = 1;
    private static final String RECEIVER_BROADCAST = "com.topjohnwu.superuser.RECEIVER_BROADCAST";
    private static final int RECEIVER_REGISTERED = 4;
    private static final int REMOTE_EN_ROUTE = 1;
    static final String TAG = "IPC";
    private static RootServiceManager mInstance;
    private RemoteProcess mDaemon;
    private RemoteProcess mRemote;
    private int flags = 0;
    private final List<BindTask> pendingTasks = new ArrayList();
    private final Map<ServiceKey, RemoteServiceRecord> services = new ArrayMap();
    private final Map<ServiceConnection, ConnectionRecord> connections = new ArrayMap();

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface BindTask {
        boolean run();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ConnectionRecord extends Pair<RemoteServiceRecord, Executor> {
        public ConnectionRecord(RemoteServiceRecord remoteServiceRecord, Executor executor) {
            super(remoteServiceRecord, executor);
        }

        public /* synthetic */ void lambda$disconnect$0(ServiceConnection serviceConnection) {
            serviceConnection.onServiceDisconnected(((RemoteServiceRecord) ((Pair) this).first).key.getName());
        }

        public void disconnect(ServiceConnection serviceConnection) {
            ((Executor) ((Pair) this).second).execute(new d(2, this, serviceConnection));
        }

        public RemoteServiceRecord getService() {
            return (RemoteServiceRecord) ((Pair) this).first;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface Predicate {
        boolean eval(RemoteServiceRecord remoteServiceRecord);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class RemoteProcess extends BinderHolder {
        final IRootServiceManager mgr;

        public RemoteProcess(IRootServiceManager iRootServiceManager) {
            super(iRootServiceManager.asBinder());
            this.mgr = iRootServiceManager;
        }

        public /* synthetic */ boolean lambda$onBinderDied$0(RemoteServiceRecord remoteServiceRecord) {
            if (remoteServiceRecord.host == this) {
                return true;
            }
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.BinderHolder
        public void onBinderDied() {
            if (RootServiceManager.this.mRemote == this) {
                RootServiceManager.this.mRemote = null;
            }
            if (RootServiceManager.this.mDaemon == this) {
                RootServiceManager.this.mDaemon = null;
            }
            Iterator it = RootServiceManager.this.services.values().iterator();
            while (it.hasNext()) {
                if (((RemoteServiceRecord) it.next()).host == this) {
                    it.remove();
                }
            }
            RootServiceManager.this.dropConnections(new f(this, 2));
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class RemoteServiceRecord {
        final IBinder binder;
        final RemoteProcess host;
        final ServiceKey key;
        int refCount = 1;

        public RemoteServiceRecord(ServiceKey serviceKey, IBinder iBinder, RemoteProcess remoteProcess) {
            this.key = serviceKey;
            this.binder = iBinder;
            this.host = remoteProcess;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ServiceKey extends Pair<ComponentName, Boolean> {
        public ServiceKey(ComponentName componentName, boolean z) {
            super(componentName, Boolean.valueOf(z));
        }

        public ComponentName getName() {
            return (ComponentName) ((Pair) this).first;
        }

        public boolean isDaemon() {
            return ((Boolean) ((Pair) this).second).booleanValue();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class ServiceReceiver extends BroadcastReceiver {
        private final Messenger m;

        public ServiceReceiver() {
            this.m = new Messenger(new Handler(Looper.getMainLooper(), RootServiceManager.this));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IBinder binder;
            Bundle bundleExtra = intent.getBundleExtra(RootServiceManager.INTENT_BUNDLE_KEY);
            if (bundleExtra != null && (binder = bundleExtra.getBinder(RootServiceManager.BUNDLE_BINDER_KEY)) != null) {
                IRootServiceManager asInterface = IRootServiceManager.Stub.asInterface(binder);
                try {
                    asInterface.connect(this.m.getBinder());
                    RemoteProcess remoteProcess = new RemoteProcess(asInterface);
                    boolean booleanExtra = intent.getBooleanExtra(RootServiceManager.INTENT_DAEMON_KEY, false);
                    RootServiceManager rootServiceManager = RootServiceManager.this;
                    if (booleanExtra) {
                        rootServiceManager.mDaemon = remoteProcess;
                        RootServiceManager.access$472(RootServiceManager.this, -3);
                    } else {
                        rootServiceManager.mRemote = remoteProcess;
                        RootServiceManager.access$472(RootServiceManager.this, -2);
                    }
                    for (int size = RootServiceManager.this.pendingTasks.size() - 1; size >= 0; size--) {
                        if (((BindTask) RootServiceManager.this.pendingTasks.get(size)).run()) {
                            RootServiceManager.this.pendingTasks.remove(size);
                        }
                    }
                } catch (RemoteException e) {
                    Utils.err(RootServiceManager.TAG, e);
                }
            }
        }
    }

    private RootServiceManager() {
    }

    public static /* synthetic */ int access$472(RootServiceManager rootServiceManager, int i) {
        int i2 = i & rootServiceManager.flags;
        rootServiceManager.flags = i2;
        return i2;
    }

    private ServiceKey bindInternal(Intent intent, Executor executor, final ServiceConnection serviceConnection) {
        RemoteProcess remoteProcess;
        enforceMainThread();
        final ServiceKey parseIntent = parseIntent(intent);
        RemoteServiceRecord remoteServiceRecord = this.services.get(parseIntent);
        final int i = 1;
        if (remoteServiceRecord != null) {
            this.connections.put(serviceConnection, new ConnectionRecord(remoteServiceRecord, executor));
            remoteServiceRecord.refCount++;
            final IBinder iBinder = remoteServiceRecord.binder;
            final int i2 = 0;
            executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.g
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    IBinder iBinder2 = iBinder;
                    RootServiceManager.ServiceKey serviceKey = parseIntent;
                    ServiceConnection serviceConnection2 = serviceConnection;
                    switch (i3) {
                        case 0:
                            RootServiceManager.lambda$bindInternal$1(serviceConnection2, serviceKey, iBinder2);
                            return;
                        default:
                            RootServiceManager.lambda$bindInternal$2(serviceConnection2, serviceKey, iBinder2);
                            return;
                    }
                }
            });
            return null;
        }
        if (parseIntent.isDaemon()) {
            remoteProcess = this.mDaemon;
        } else {
            remoteProcess = this.mRemote;
        }
        if (remoteProcess == null) {
            return parseIntent;
        }
        try {
            final IBinder bind = remoteProcess.mgr.bind(intent);
            if (bind != null) {
                RemoteServiceRecord remoteServiceRecord2 = new RemoteServiceRecord(parseIntent, bind, remoteProcess);
                this.connections.put(serviceConnection, new ConnectionRecord(remoteServiceRecord2, executor));
                this.services.put(parseIntent, remoteServiceRecord2);
                executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        IBinder iBinder2 = bind;
                        RootServiceManager.ServiceKey serviceKey = parseIntent;
                        ServiceConnection serviceConnection2 = serviceConnection;
                        switch (i3) {
                            case 0:
                                RootServiceManager.lambda$bindInternal$1(serviceConnection2, serviceKey, iBinder2);
                                return;
                            default:
                                RootServiceManager.lambda$bindInternal$2(serviceConnection2, serviceKey, iBinder2);
                                return;
                        }
                    }
                });
                return null;
            }
            executor.execute(new d(1, serviceConnection, parseIntent));
            return null;
        } catch (RemoteException e) {
            Utils.err(TAG, e);
            remoteProcess.binderDied();
            return parseIntent;
        }
    }

    public void dropConnections(Predicate predicate) {
        Iterator<Map.Entry<ServiceConnection, ConnectionRecord>> it = this.connections.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ServiceConnection, ConnectionRecord> next = it.next();
            ConnectionRecord value = next.getValue();
            if (predicate.eval(value.getService())) {
                value.disconnect(next.getKey());
                it.remove();
            }
        }
    }

    private static void enforceMainThread() {
        if (ShellUtils.onMainThread()) {
            return;
        }
        se.p("This method can only be called on the main thread");
    }

    public static Intent getBroadcastIntent(IBinder iBinder, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBinder(BUNDLE_BINDER_KEY, iBinder);
        return new Intent(RECEIVER_BROADCAST).setPackage(Utils.getContext().getPackageName()).addFlags(HiddenAPIs.FLAG_RECEIVER_FROM_SHELL).putExtra(INTENT_DAEMON_KEY, z).putExtra(INTENT_BUNDLE_KEY, bundle);
    }

    public static RootServiceManager getInstance() {
        if (mInstance == null) {
            mInstance = new RootServiceManager();
        }
        return mInstance;
    }

    public static /* synthetic */ void lambda$bindInternal$1(ServiceConnection serviceConnection, ServiceKey serviceKey, IBinder iBinder) {
        serviceConnection.onServiceConnected(serviceKey.getName(), iBinder);
    }

    public static /* synthetic */ void lambda$bindInternal$2(ServiceConnection serviceConnection, ServiceKey serviceKey, IBinder iBinder) {
        serviceConnection.onServiceConnected(serviceKey.getName(), iBinder);
    }

    public static /* synthetic */ void lambda$bindInternal$3(ServiceConnection serviceConnection, ServiceKey serviceKey) {
        serviceConnection.onNullBinding(serviceKey.getName());
    }

    public /* synthetic */ boolean lambda$createBindTask$4(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        if (bindInternal(intent, executor, serviceConnection) == null) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$startRootProcess$0(Context context, String str, ComponentName componentName, OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        String str2;
        String str3;
        Context deContext = Utils.getDeContext();
        File file = new File(deContext.getCacheDir(), "main.jar");
        InputStream open = deContext.getResources().getAssets().open("main.jar");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                Utils.pump(open, fileOutputStream);
                fileOutputStream.close();
                if (open != null) {
                    open.close();
                }
                str.getClass();
                if (!str.equals("daemon")) {
                    if (!str.equals("start")) {
                        str2 = "";
                    } else {
                        Locale locale = Locale.ROOT;
                        str2 = "--nice-name=" + deContext.getPackageName() + ":root:" + (Process.myUid() / 100000);
                    }
                } else {
                    str2 = "--nice-name=" + deContext.getPackageName() + ":root:daemon";
                }
                String str4 = str2;
                if (Utils.isProcess64Bit()) {
                    str3 = "64";
                } else {
                    str3 = "32";
                }
                outputStream.write(String.format(Locale.ROOT, "(%s CLASSPATH=%s %s %s /system/bin %s com.topjohnwu.superuser.internal.RootServerMain '%s' %d %s >/dev/null 2>&1)&", "", file, "/system/bin/app_process".concat(str3), " -Xnoimage-dex2oat", str4, componentName.flattenToString(), Integer.valueOf(Process.myUid()), str).getBytes(StandardCharsets.UTF_8));
                outputStream.write(10);
                outputStream.flush();
            } finally {
            }
        } finally {
        }
    }

    private void onServiceStopped(ServiceKey serviceKey) {
        RemoteServiceRecord remove = this.services.remove(serviceKey);
        if (remove != null) {
            dropConnections(new f(remove, 1));
        }
    }

    private static ServiceKey parseIntent(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (component.getPackageName().equals(Utils.getContext().getPackageName())) {
                return new ServiceKey(component, intent.hasCategory(RootService.CATEGORY_DAEMON_MODE));
            }
            se.h("RootServices outside of the app are not supported");
            return null;
        }
        se.h("The intent does not have a component set");
        return null;
    }

    private Shell.Task startRootProcess(final ComponentName componentName, final String str) {
        final Context context = Utils.getContext();
        if ((this.flags & 4) == 0) {
            context.registerReceiver(new ServiceReceiver(), new IntentFilter(RECEIVER_BROADCAST), "android.permission.BROADCAST_PACKAGE_REMOVED", null, 4);
            this.flags |= 4;
        }
        return new Shell.Task() { // from class: ep1
            @Override // com.topjohnwu.superuser.Shell.Task
            public final void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
                RootServiceManager.lambda$startRootProcess$0(context, str, componentName, outputStream, inputStream, inputStream2);
            }
        };
    }

    public Shell.Task createBindTask(final Intent intent, final Executor executor, final ServiceConnection serviceConnection) {
        int i;
        String str;
        ServiceKey bindInternal = bindInternal(intent, executor, serviceConnection);
        if (bindInternal != null) {
            this.pendingTasks.add(new BindTask() { // from class: com.topjohnwu.superuser.internal.h
                @Override // com.topjohnwu.superuser.internal.RootServiceManager.BindTask
                public final boolean run() {
                    boolean lambda$createBindTask$4;
                    lambda$createBindTask$4 = RootServiceManager.this.lambda$createBindTask$4(intent, executor, serviceConnection);
                    return lambda$createBindTask$4;
                }
            });
            if (bindInternal.isDaemon()) {
                i = 2;
            } else {
                i = 1;
            }
            int i2 = this.flags;
            if ((i2 & i) == 0) {
                this.flags = i | i2;
                if (bindInternal.isDaemon()) {
                    str = "daemon";
                } else {
                    str = "start";
                }
                return startRootProcess(bindInternal.getName(), str);
            }
            return null;
        }
        return null;
    }

    public Shell.Task createStopTask(Intent intent) {
        RemoteProcess remoteProcess;
        enforceMainThread();
        ServiceKey parseIntent = parseIntent(intent);
        if (parseIntent.isDaemon()) {
            remoteProcess = this.mDaemon;
        } else {
            remoteProcess = this.mRemote;
        }
        if (remoteProcess == null) {
            if (!parseIntent.isDaemon()) {
                return null;
            }
            return startRootProcess(parseIntent.getName(), "stop");
        }
        try {
            remoteProcess.mgr.stop(parseIntent.getName(), -1);
        } catch (RemoteException e) {
            Utils.err(TAG, e);
        }
        onServiceStopped(parseIntent);
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        boolean z = true;
        if (message.what == 1) {
            ComponentName componentName = (ComponentName) message.obj;
            if (message.arg1 == 0) {
                z = false;
            }
            onServiceStopped(new ServiceKey(componentName, z));
        }
        return false;
    }

    public void unbind(ServiceConnection serviceConnection) {
        enforceMainThread();
        ConnectionRecord remove = this.connections.remove(serviceConnection);
        if (remove != null) {
            RemoteServiceRecord service = remove.getService();
            int i = service.refCount - 1;
            service.refCount = i;
            if (i == 0) {
                this.services.remove(service.key);
                try {
                    service.host.mgr.unbind(service.key.getName());
                } catch (RemoteException e) {
                    Utils.err(TAG, e);
                }
            }
            remove.disconnect(serviceConnection);
        }
    }
}
