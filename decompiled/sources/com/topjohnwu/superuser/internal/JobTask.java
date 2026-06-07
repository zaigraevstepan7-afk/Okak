package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.StreamGobbler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class JobTask extends Shell.Job implements Shell.Task {
    private static final byte[] END_CMD;
    static final String END_UUID;
    static final List<String> UNSET_LIST = new ArrayList(0);
    static final int UUID_LEN = 36;
    protected Shell.ResultCallback callback;
    protected Executor callbackExecutor;
    private final List<ShellInputSource> sources = new ArrayList();
    private List<String> out = null;
    private List<String> err = UNSET_LIST;

    static {
        String uuid = UUID.randomUUID().toString();
        END_UUID = uuid;
        END_CMD = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", uuid).getBytes(StandardCharsets.UTF_8);
    }

    private void close() {
        Iterator<ShellInputSource> it = this.sources.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public /* synthetic */ void lambda$setResult$0(ResultImpl resultImpl) {
        this.callback.onResult(resultImpl);
    }

    private void setResult(ResultImpl resultImpl) {
        Shell.ResultCallback resultCallback = this.callback;
        if (resultCallback != null) {
            Executor executor = this.callbackExecutor;
            if (executor == null) {
                resultCallback.onResult(resultImpl);
            } else {
                executor.execute(new d(0, this, resultImpl));
            }
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.sources.add(new CommandSource(strArr));
        }
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Task
    public void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        boolean z;
        List<String> list;
        List<String> list2 = this.out;
        List<String> list3 = UNSET_LIST;
        boolean z2 = false;
        if (list2 == list3) {
            z = true;
        } else {
            z = false;
        }
        if (this.err == list3) {
            z2 = true;
        }
        List<String> list4 = null;
        if (z) {
            if (this.callback == null) {
                list2 = null;
            } else {
                list2 = new ArrayList<>();
            }
        }
        if (z2) {
            if (Shell.enableLegacyStderrRedirection) {
                list = list2;
            } else {
                list = null;
            }
        } else {
            list = this.err;
        }
        if (list2 != null && list2 == list && !Utils.isSynchronized(list2)) {
            list2 = Collections.synchronizedList(list2);
            list = list2;
        }
        FutureTask futureTask = new FutureTask(new StreamGobbler.OUT(inputStream, list2));
        FutureTask futureTask2 = new FutureTask(new StreamGobbler.ERR(inputStream2, list));
        Shell.EXECUTOR.execute(futureTask);
        Shell.EXECUTOR.execute(futureTask2);
        ResultImpl resultImpl = new ResultImpl();
        try {
            Iterator<ShellInputSource> it = this.sources.iterator();
            while (it.hasNext()) {
                it.next().serve(outputStream);
            }
            outputStream.write(END_CMD);
            outputStream.flush();
            int intValue = ((Integer) futureTask.get()).intValue();
            futureTask2.get();
            resultImpl.code = intValue;
            resultImpl.out = list2;
            if (!z2) {
                list4 = this.err;
            }
            resultImpl.err = list4;
        } catch (IOException | InterruptedException | ExecutionException e) {
            Utils.err(e);
        }
        close();
        setResult(resultImpl);
    }

    @Override // com.topjohnwu.superuser.Shell.Task
    public void shellDied() {
        close();
        setResult(new ResultImpl());
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job to(List<String> list) {
        this.out = list;
        this.err = UNSET_LIST;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job to(List<String> list, List<String> list2) {
        this.out = list;
        this.err = list2;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(InputStream inputStream) {
        if (inputStream != null) {
            this.sources.add(new InputStreamSource(inputStream));
        }
        return this;
    }
}
