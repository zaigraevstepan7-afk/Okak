package com.topjohnwu.superuser;

import android.content.Context;
import com.topjohnwu.superuser.internal.BuilderImpl;
import com.topjohnwu.superuser.internal.MainShell;
import com.topjohnwu.superuser.internal.UiThreadHandler;
import com.topjohnwu.superuser.internal.Utils;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class Shell implements Closeable {
    public static final int FLAG_MOUNT_MASTER = 2;
    public static final int FLAG_NON_ROOT_SHELL = 1;

    @Deprecated
    public static final int FLAG_REDIRECT_STDERR = 8;
    public static final int NON_ROOT_SHELL = 0;

    @Deprecated
    public static final int ROOT_MOUNT_MASTER = 2;
    public static final int ROOT_SHELL = 1;
    public static final int UNKNOWN = -1;
    public static Executor EXECUTOR = Executors.newCachedThreadPool();
    public static boolean enableVerboseLogging = false;
    public static boolean enableLegacyStderrRedirection = false;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public static Builder create() {
            return new BuilderImpl();
        }

        public abstract Shell build();

        public abstract Shell build(Process process);

        public final Shell build(String... strArr) {
            return setCommands(strArr).build();
        }

        public abstract Builder setCommands(String... strArr);

        public final Builder setContext(Context context) {
            Utils.setContext(context);
            return this;
        }

        public abstract Builder setFlags(int i);

        @SafeVarargs
        public final Builder setInitializers(Class<? extends Initializer>... clsArr) {
            ((BuilderImpl) this).setInitializersImpl(clsArr);
            return this;
        }

        public abstract Builder setTimeout(long j);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface GetShellCallback {
        void onShell(Shell shell);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Initializer {
        public boolean onInit(Context context, Shell shell) {
            return true;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class Result {
        public static final int JOB_NOT_EXECUTED = -1;

        public abstract int getCode();

        public abstract List<String> getErr();

        public abstract List<String> getOut();

        public boolean isSuccess() {
            if (getCode() == 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface ResultCallback {
        void onResult(Result result);
    }

    public static Job cmd(String... strArr) {
        return MainShell.newJob(strArr);
    }

    public static Shell getCachedShell() {
        return MainShell.getCached();
    }

    public static void getShell(GetShellCallback getShellCallback) {
        MainShell.get(UiThreadHandler.executor, getShellCallback);
    }

    public static Boolean isAppGrantedRoot() {
        return Utils.isAppGrantedRoot();
    }

    @Deprecated
    public static boolean rootAccess() {
        return Objects.equals(isAppGrantedRoot(), Boolean.TRUE);
    }

    public static void setDefaultBuilder(Builder builder) {
        MainShell.setBuilder(builder);
    }

    public abstract void execTask(Task task);

    public abstract int getStatus();

    public abstract boolean isAlive();

    public boolean isRoot() {
        if (getStatus() >= 1) {
            return true;
        }
        return false;
    }

    public abstract Job newJob();

    public abstract void submitTask(Task task);

    public void waitAndClose() {
        while (!waitAndClose(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
        }
    }

    public abstract boolean waitAndClose(long j, TimeUnit timeUnit);

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class Job {
        public abstract Job add(InputStream inputStream);

        public abstract Job add(String... strArr);

        public abstract Future<Result> enqueue();

        public abstract Result exec();

        public final void submit(ResultCallback resultCallback) {
            submit(UiThreadHandler.executor, resultCallback);
        }

        public abstract void submit(Executor executor, ResultCallback resultCallback);

        public abstract Job to(List<String> list);

        public abstract Job to(List<String> list, List<String> list2);

        public final void submit() {
            submit(null);
        }
    }

    public static Job cmd(InputStream inputStream) {
        return MainShell.newJob(inputStream);
    }

    public static Shell getShell() {
        return MainShell.get();
    }

    public static void getShell(Executor executor, GetShellCallback getShellCallback) {
        MainShell.get(executor, getShellCallback);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface Task {
        void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2);

        default void shellDied() {
        }
    }
}
