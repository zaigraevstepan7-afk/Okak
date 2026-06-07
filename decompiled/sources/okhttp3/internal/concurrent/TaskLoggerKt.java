package okhttp3.internal.concurrent;

import defpackage.de0;
import defpackage.yq1;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0010\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lod2;", "taskLog", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lde0;)V", "T", "block", "logElapsed", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lde0;)Ljava/lang/Object;", "message", "log", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", "", "ns", "formatDuration", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.getName() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Logger logger, Task task, TaskQueue taskQueue, de0 de0Var) {
        long j;
        logger.getClass();
        task.getClass();
        taskQueue.getClass();
        de0Var.getClass();
        boolean isLoggable = logger.isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner().getBackend().nanoTime();
            log(logger, task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T t = (T) de0Var.invoke();
            if (isLoggable) {
                log(logger, task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - j));
            }
            return t;
        } catch (Throwable th) {
            if (isLoggable) {
                log(logger, task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - j));
            }
            throw th;
        }
    }

    public static final void taskLog(Logger logger, Task task, TaskQueue taskQueue, de0 de0Var) {
        logger.getClass();
        task.getClass();
        taskQueue.getClass();
        de0Var.getClass();
        if (logger.isLoggable(Level.FINE)) {
            log(logger, task, taskQueue, (String) de0Var.invoke());
        }
    }
}
