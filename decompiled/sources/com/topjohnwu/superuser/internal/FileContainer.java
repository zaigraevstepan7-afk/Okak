package com.topjohnwu.superuser.internal;

import android.os.Binder;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class FileContainer {
    private static final String ERROR_MSG = "Requested file was not opened!";
    private int nextHandle = 0;
    private final SparseArray<SparseArray<OpenFile>> files = new SparseArray<>();

    public synchronized OpenFile get(int i) {
        OpenFile openFile;
        try {
            SparseArray<OpenFile> sparseArray = this.files.get(Binder.getCallingPid());
            if (sparseArray != null) {
                openFile = sparseArray.get(i);
                if (openFile == null) {
                    throw new IOException(ERROR_MSG);
                }
            } else {
                throw new IOException(ERROR_MSG);
            }
        } catch (Throwable th) {
            throw th;
        }
        return openFile;
    }

    public synchronized void pidDied(int i) {
        SparseArray<OpenFile> sparseArray = this.files.get(i);
        if (sparseArray == null) {
            return;
        }
        this.files.remove(i);
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray.valueAt(i2).close();
        }
    }

    public synchronized int put(OpenFile openFile) {
        int i;
        try {
            int callingPid = Binder.getCallingPid();
            SparseArray<OpenFile> sparseArray = this.files.get(callingPid);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                this.files.put(callingPid, sparseArray);
            }
            i = this.nextHandle;
            this.nextHandle = i + 1;
            sparseArray.append(i, openFile);
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public synchronized void remove(int i) {
        SparseArray<OpenFile> sparseArray = this.files.get(Binder.getCallingPid());
        if (sparseArray == null) {
            return;
        }
        OpenFile openFile = sparseArray.get(i);
        if (openFile == null) {
            return;
        }
        sparseArray.remove(i);
        synchronized (openFile) {
            openFile.close();
        }
    }
}
