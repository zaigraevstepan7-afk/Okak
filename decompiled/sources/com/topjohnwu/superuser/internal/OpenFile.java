package com.topjohnwu.superuser.internal;

import android.system.ErrnoException;
import android.system.Int64Ref;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class OpenFile implements Closeable {
    private static final boolean FORCE_NO_SPLICE = false;
    private ByteBuffer buf;
    FileDescriptor fd;
    FileDescriptor read;
    private StructStat st;
    FileDescriptor write;

    private void ensureOpen() {
        if (this.fd != null) {
        } else {
            throw new ClosedChannelException();
        }
    }

    private ByteBuffer getBuf() {
        if (this.buf == null) {
            this.buf = ByteBuffer.allocateDirect(65536);
        }
        this.buf.clear();
        return this.buf;
    }

    private StructStat getStat() {
        if (this.st == null) {
            this.st = Os.fstat(this.fd);
        }
        return this.st;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        FileDescriptor fileDescriptor = this.fd;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException unused) {
            }
            this.fd = null;
        }
        FileDescriptor fileDescriptor2 = this.read;
        if (fileDescriptor2 != null) {
            try {
                Os.close(fileDescriptor2);
            } catch (ErrnoException unused2) {
            }
            this.read = null;
        }
        FileDescriptor fileDescriptor3 = this.write;
        if (fileDescriptor3 != null) {
            try {
                Os.close(fileDescriptor3);
            } catch (ErrnoException unused3) {
            }
            this.write = null;
        }
    }

    public synchronized void ftruncate(long j) {
        ensureOpen();
        Os.ftruncate(this.fd, j);
    }

    public synchronized long lseek(long j, int i) {
        ensureOpen();
        return Os.lseek(this.fd, j, i);
    }

    public synchronized int pread(int i, long j) {
        Int64Ref int64Ref;
        if (this.fd != null && this.write != null) {
            if (j < 0) {
                int64Ref = null;
            } else {
                int64Ref = new Int64Ref(j);
            }
        } else {
            throw new ClosedChannelException();
        }
        return (int) FileUtils.splice(this.fd, int64Ref, this.write, null, i, 0);
    }

    public synchronized int pwrite(int i, long j, boolean z) {
        Int64Ref int64Ref;
        if (this.fd != null && this.read != null) {
            if (j < 0) {
                int64Ref = null;
            } else {
                int64Ref = new Int64Ref(j);
            }
            if (z) {
                int i2 = i;
                while (i2 > 0) {
                    long j2 = i2;
                    i2 = (int) (j2 - FileUtils.splice(this.read, null, this.fd, int64Ref, j2, 0));
                }
                return i;
            }
            return (int) FileUtils.splice(this.read, null, this.fd, int64Ref, i, 0);
        }
        throw new ClosedChannelException();
    }

    public synchronized long size() {
        long lseek;
        ensureOpen();
        FileDescriptor fileDescriptor = this.fd;
        int i = OsConstants.SEEK_CUR;
        long lseek2 = Os.lseek(fileDescriptor, 0L, i);
        Os.lseek(this.fd, 0L, OsConstants.SEEK_END);
        lseek = Os.lseek(this.fd, 0L, i);
        Os.lseek(this.fd, lseek2, OsConstants.SEEK_SET);
        return lseek;
    }

    public synchronized void sync(boolean z) {
        try {
            ensureOpen();
            FileDescriptor fileDescriptor = this.fd;
            if (z) {
                Os.fsync(fileDescriptor);
            } else {
                Os.fdatasync(fileDescriptor);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
