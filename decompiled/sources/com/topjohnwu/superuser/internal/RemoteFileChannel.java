package com.topjohnwu.superuser.internal;

import android.os.RemoteException;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.topjohnwu.superuser.nio.FileSystemManager;
import defpackage.se;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class RemoteFileChannel extends FileChannel {
    private static final int PIPE_CAPACITY = 65536;
    private final Object fdLock = new Object();
    private final IFileSystemService fs;
    private final int handle;
    private final int mode;
    private final FileDescriptor read;
    private final FileDescriptor write;

    public RemoteFileChannel(IFileSystemService iFileSystemService, File file, int i) {
        this.fs = iFileSystemService;
        this.mode = i;
        File file2 = null;
        try {
            try {
                file2 = FileUtils.createTempFIFO();
                this.handle = ((Integer) iFileSystemService.openChannel(file.getAbsolutePath(), FileUtils.modeToPosix(i), file2.getPath()).tryAndGet()).intValue();
                String path = file2.getPath();
                int i2 = OsConstants.O_RDONLY;
                int i3 = OsConstants.O_NONBLOCK;
                this.read = Os.open(path, i2 | i3, 0);
                this.write = Os.open(file2.getPath(), OsConstants.O_WRONLY | i3, 0);
                file2.delete();
            } catch (RemoteException | ErrnoException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            if (file2 != null) {
                file2.delete();
            }
            throw th;
        }
    }

    private void ensureOpen() {
        if (isOpen()) {
        } else {
            throw new ClosedChannelException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r10 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r10 = r10 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        r2 = r2 - r1;
        r9.limit(r0);
        end(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int read0(java.nio.ByteBuffer r9, long r10) {
        /*
            r8 = this;
            r8.begin()
            int r0 = r9.limit()
            int r1 = r9.position()
            r2 = r1
        Lc:
            if (r0 <= r2) goto L72
            r3 = 0
            java.lang.Object r4 = r8.fdLock     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L58
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L58
            boolean r5 = r8.isOpen()     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L5a
            boolean r5 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L1f
            goto L5a
        L1f:
            com.topjohnwu.superuser.internal.IFileSystemService r5 = r8.fs     // Catch: java.lang.Throwable -> L37
            int r6 = r8.handle     // Catch: java.lang.Throwable -> L37
            int r7 = r0 - r2
            com.topjohnwu.superuser.internal.IOResult r5 = r5.pread(r6, r7, r10)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = r5.tryAndGet()     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L37
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L39
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            goto L72
        L37:
            r10 = move-exception
            goto L63
        L39:
            int r2 = r2 + r5
            r9.limit(r2)     // Catch: java.lang.Throwable -> L37
            r2 = r3
        L3e:
            if (r2 >= r5) goto L48
            java.io.FileDescriptor r6 = r8.read     // Catch: java.lang.Throwable -> L37
            int r6 = android.system.Os.read(r6, r9)     // Catch: java.lang.Throwable -> L37
            int r2 = r2 + r6
            goto L3e
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            r6 = 0
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 < 0) goto L51
            long r4 = (long) r5
            long r10 = r10 + r4
        L51:
            int r2 = r9.position()     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L58 java.lang.Throwable -> L58
            goto Lc
        L56:
            r10 = move-exception
            goto L6b
        L58:
            r10 = move-exception
            goto L65
        L5a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            r9.limit(r0)
            r8.end(r3)
            r8 = -1
            return r8
        L63:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L58 java.lang.Throwable -> L58
        L65:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L56
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L56
            throw r11     // Catch: java.lang.Throwable -> L56
        L6b:
            r9.limit(r0)
            r8.end(r3)
            throw r10
        L72:
            int r2 = r2 - r1
            r9.limit(r0)
            r9 = 1
            r8.end(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topjohnwu.superuser.internal.RemoteFileChannel.read0(java.nio.ByteBuffer, long):int");
    }

    private boolean readable() {
        int i = this.mode & FileSystemManager.MODE_READ_WRITE;
        if (i != 268435456 && i != 805306368) {
            return false;
        }
        return true;
    }

    private boolean writable() {
        int i = this.mode & FileSystemManager.MODE_READ_WRITE;
        if (i != 536870912 && i != 805306368) {
            return false;
        }
        return true;
    }

    private int write0(ByteBuffer byteBuffer, long j) {
        int write;
        begin();
        int remaining = byteBuffer.remaining();
        while (byteBuffer.hasRemaining()) {
            try {
                try {
                    synchronized (this.fdLock) {
                        try {
                            if (isOpen() && !Thread.interrupted()) {
                                write = Os.write(this.write, byteBuffer);
                                this.fs.pwrite(this.handle, write, j).checkException();
                            }
                            end(false);
                            return -1;
                        } finally {
                        }
                    }
                    if (j >= 0) {
                        j += write;
                    }
                } catch (Throwable th) {
                    end(false);
                    throw th;
                }
            } catch (RemoteException | ErrnoException e) {
                throw new IOException(e);
            }
        }
        end(true);
        return remaining;
    }

    @Override // java.nio.channels.FileChannel
    public void force(boolean z) {
        ensureOpen();
        try {
            this.fs.sync(this.handle, z).checkException();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public void implCloseChannel() {
        try {
            this.fs.close(this.handle);
        } catch (RemoteException unused) {
        }
        synchronized (this.fdLock) {
            try {
                Os.close(this.read);
            } catch (ErrnoException unused2) {
            }
            try {
                Os.close(this.write);
            } catch (ErrnoException unused3) {
            }
        }
    }

    @Override // java.nio.channels.FileChannel
    public FileLock lock(long j, long j2, boolean z) {
        throw new UnsupportedOperationException("Locking a remote file is not supported!");
    }

    @Override // java.nio.channels.FileChannel
    public MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        throw new UnsupportedOperationException("Memory mapping a remote file is not supported!");
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public RemoteFileChannel position(long j) {
        ensureOpen();
        if (j >= 0) {
            try {
                this.fs.lseek(this.handle, j, OsConstants.SEEK_SET).checkException();
                return this;
            } catch (RemoteException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i <= byteBufferArr.length - i2) {
            ensureOpen();
            if (readable()) {
                int i3 = 0;
                for (int i4 = i; i4 < i + i2; i4++) {
                    i3 += read0(byteBufferArr[i4], -1L);
                }
                return i3;
            }
            throw new NonReadableChannelException();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public long size() {
        ensureOpen();
        try {
            return ((Long) this.fs.size(this.handle).tryAndGet()).longValue();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        ensureOpen();
        if (readableByteChannel.isOpen()) {
            if (writable()) {
                long j3 = 0;
                if (j >= 0 && j2 >= 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(PIPE_CAPACITY);
                    while (j2 > j3) {
                        allocateDirect.limit((int) Math.min(allocateDirect.capacity(), j2 - j3));
                        if (readableByteChannel.read(allocateDirect) <= 0) {
                            break;
                        }
                        allocateDirect.flip();
                        long write0 = write0(allocateDirect, j);
                        j += write0;
                        j3 += write0;
                        allocateDirect.clear();
                    }
                    return j3;
                }
                throw new IllegalArgumentException();
            }
            throw new NonWritableChannelException();
        }
        throw new ClosedChannelException();
    }

    @Override // java.nio.channels.FileChannel
    public long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        ensureOpen();
        if (writableByteChannel.isOpen()) {
            if (readable()) {
                long j3 = 0;
                if (j >= 0 && j2 >= 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(PIPE_CAPACITY);
                    while (j2 > j3) {
                        allocateDirect.limit((int) Math.min(allocateDirect.capacity(), j2 - j3));
                        if (read0(allocateDirect, j) <= 0) {
                            break;
                        }
                        allocateDirect.flip();
                        long write = writableByteChannel.write(allocateDirect);
                        j += write;
                        j3 += write;
                        allocateDirect.clear();
                    }
                    return j3;
                }
                throw new IllegalArgumentException();
            }
            throw new NonReadableChannelException();
        }
        throw new ClosedChannelException();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public RemoteFileChannel truncate(long j) {
        ensureOpen();
        if (j >= 0) {
            if (writable()) {
                try {
                    this.fs.ftruncate(this.handle, j).checkException();
                    return this;
                } catch (RemoteException e) {
                    throw new IOException(e);
                }
            }
            throw new NonWritableChannelException();
        }
        se.h("Negative size");
        return null;
    }

    @Override // java.nio.channels.FileChannel
    public FileLock tryLock(long j, long j2, boolean z) {
        throw new UnsupportedOperationException("Locking a remote file is not supported!");
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i <= byteBufferArr.length - i2) {
            ensureOpen();
            if (writable()) {
                int i3 = 0;
                for (int i4 = i; i4 < i + i2; i4++) {
                    i3 += write(byteBufferArr[i4]);
                }
                return i3;
            }
            throw new NonWritableChannelException();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public long position() {
        ensureOpen();
        try {
            return ((Long) this.fs.lseek(this.handle, 0L, OsConstants.SEEK_CUR).tryAndGet()).longValue();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        ensureOpen();
        if (writable()) {
            return write0(byteBuffer, -1L);
        }
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        ensureOpen();
        if (readable()) {
            return read0(byteBuffer, -1L);
        }
        throw new NonReadableChannelException();
    }

    @Override // java.nio.channels.FileChannel
    public int write(ByteBuffer byteBuffer, long j) {
        if (j >= 0) {
            ensureOpen();
            return write0(byteBuffer, j);
        }
        se.h("Negative position");
        return 0;
    }

    @Override // java.nio.channels.FileChannel
    public int read(ByteBuffer byteBuffer, long j) {
        if (j >= 0) {
            ensureOpen();
            return read0(byteBuffer, j);
        }
        se.h("Negative position");
        return 0;
    }
}
