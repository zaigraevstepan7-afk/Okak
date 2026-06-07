package com.topjohnwu.superuser.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.RootServiceManager;
import com.topjohnwu.superuser.internal.RootServiceServer;
import com.topjohnwu.superuser.internal.UiThreadHandler;
import com.topjohnwu.superuser.internal.Utils;
import defpackage.r5;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class RootService extends ContextWrapper {
    public static final String CATEGORY_DAEMON_MODE = "com.topjohnwu.superuser.DAEMON_MODE";

    public RootService() {
        super(null);
    }

    public static /* synthetic */ void a(Shell.Task task) {
        lambda$asRunnable$0(task);
    }

    private static Runnable asRunnable(Shell.Task task) {
        return new r5(task, 9);
    }

    public static void bind(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        Shell.Task bindOrTask;
        if (!Utils.isRootImpossible() && (bindOrTask = bindOrTask(intent, executor, serviceConnection)) != null) {
            Shell.EXECUTOR.execute(asRunnable(bindOrTask));
        }
    }

    public static Shell.Task bindOrTask(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        return RootServiceManager.getInstance().createBindTask(intent, executor, serviceConnection);
    }

    @Deprecated
    public static Runnable createBindTask(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        Shell.Task bindOrTask = bindOrTask(intent, executor, serviceConnection);
        if (bindOrTask == null) {
            return null;
        }
        return asRunnable(bindOrTask);
    }

    public static /* synthetic */ void lambda$asRunnable$0(Shell.Task task) {
        try {
            Shell shell = Shell.getShell();
            if (shell.isRoot()) {
                shell.execTask(task);
            }
        } catch (IOException e) {
            Utils.err(e);
        }
    }

    public static void stop(Intent intent) {
        Shell.Task stopOrTask;
        if (!Utils.isRootImpossible() && (stopOrTask = stopOrTask(intent)) != null) {
            Shell.EXECUTOR.execute(asRunnable(stopOrTask));
        }
    }

    public static Shell.Task stopOrTask(Intent intent) {
        return RootServiceManager.getInstance().createStopTask(intent);
    }

    public static void unbind(ServiceConnection serviceConnection) {
        RootServiceManager.getInstance().unbind(serviceConnection);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(onAttach(Utils.getContextImpl(context)));
        RootServiceServer.getInstance(context).register(this);
        onCreate();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return Utils.context;
    }

    public ComponentName getComponentName() {
        return new ComponentName(this, getClass());
    }

    public abstract IBinder onBind(Intent intent);

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public final void stopSelf() {
        RootServiceServer.getInstance(this).selfStop(getComponentName());
    }

    public static void bind(Intent intent, ServiceConnection serviceConnection) {
        bind(intent, UiThreadHandler.executor, serviceConnection);
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public Context onAttach(Context context) {
        return context;
    }

    public void onRebind(Intent intent) {
    }
}
