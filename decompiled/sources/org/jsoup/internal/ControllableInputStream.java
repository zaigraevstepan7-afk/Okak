package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.Progress;
import org.jsoup.helper.Validate;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ControllableInputStream extends FilterInputStream {
    private boolean allowClose;
    private final SimpleBufferedInput buff;
    private int contentLength;
    private boolean interrupted;
    private int markPos;
    private int maxSize;
    private Progress<?> progress;
    private Object progressContext;
    private int readPos;
    private int remaining;
    private long startTime;
    private long timeout;

    private ControllableInputStream(SimpleBufferedInput simpleBufferedInput, int i) {
        super(simpleBufferedInput);
        this.timeout = 0L;
        this.allowClose = true;
        this.contentLength = -1;
        this.readPos = 0;
        Validate.isTrue(i >= 0);
        this.buff = simpleBufferedInput;
        this.maxSize = i;
        this.remaining = i;
        this.markPos = -1;
        this.startTime = System.nanoTime();
    }

    private void emitProgress() {
        float f;
        if (this.progress != null) {
            int i = this.contentLength;
            if (i > 0) {
                f = Math.min(100.0f, (this.readPos * 100.0f) / i);
            } else {
                f = 0.0f;
            }
            this.progress.onProgress(this.readPos, this.contentLength, f, this.progressContext);
            if (f == 100.0f) {
                this.progress = null;
            }
        }
    }

    private boolean expired() {
        if (this.timeout == 0 || System.nanoTime() - this.startTime <= this.timeout) {
            return false;
        }
        return true;
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i) {
        boolean z;
        int i2;
        int min;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "maxSize must be 0 (unlimited) or larger");
        Validate.notNull(inputStream);
        if (i <= 0) {
            z2 = false;
        }
        byte[] borrow = SimpleBufferedInput.BufferPool.borrow();
        if (z2) {
            i2 = Math.min(i, SharedConstants.DefaultBufferSize);
        } else {
            i2 = 8192;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        while (true) {
            if (z2) {
                try {
                    min = Math.min(i, SharedConstants.DefaultBufferSize);
                } catch (Throwable th) {
                    SimpleBufferedInput.BufferPool.release(borrow);
                    throw th;
                }
            } else {
                min = 8192;
            }
            int read = inputStream.read(borrow, 0, min);
            if (read != -1) {
                if (allocate.remaining() < read) {
                    ByteBuffer allocate2 = ByteBuffer.allocate((int) Math.max(allocate.capacity() * 1.5d, allocate.capacity() + read));
                    allocate.flip();
                    allocate2.put(allocate);
                    allocate = allocate2;
                }
                allocate.put(borrow, 0, read);
                if (z2 && (i = i - read) <= 0) {
                    break;
                }
            } else {
                break;
            }
        }
        allocate.flip();
        SimpleBufferedInput.BufferPool.release(borrow);
        return allocate;
    }

    public static ControllableInputStream wrap(InputStream inputStream, int i) {
        if (inputStream instanceof ControllableInputStream) {
            return (ControllableInputStream) inputStream;
        }
        return new ControllableInputStream(new SimpleBufferedInput(inputStream), i);
    }

    public void allowClose(boolean z) {
        this.allowClose = z;
    }

    public boolean baseReadFully() {
        return this.buff.baseReadFully();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.allowClose) {
            super.close();
        }
    }

    public BufferedInputStream inputStream() {
        return new BufferedInputStream(this.buff);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.markPos = this.maxSize - this.remaining;
    }

    public void max(int i) {
        this.remaining = (i - this.maxSize) + this.remaining;
        this.maxSize = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ProgressContext> ControllableInputStream onProgress(int i, Progress<ProgressContext> progress, ProgressContext progresscontext) {
        Validate.notNull(progress);
        Validate.notNull(progresscontext);
        this.contentLength = i;
        this.progress = progress;
        this.progressContext = progresscontext;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        if (this.readPos == 0) {
            emitProgress();
        }
        if (this.maxSize != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.interrupted || (z && this.remaining <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.interrupted = true;
            return -1;
        }
        if (z && i2 > (i3 = this.remaining)) {
            i2 = i3;
        }
        while (!expired()) {
            try {
                int read = super.read(bArr, i, i2);
                if (read == -1) {
                    this.contentLength = this.readPos;
                } else {
                    this.remaining -= read;
                    this.readPos += read;
                }
                emitProgress();
                return read;
            } catch (SocketTimeoutException e) {
                if (expired() || this.timeout == 0) {
                    throw e;
                }
            }
        }
        throw new SocketTimeoutException("Read timeout");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        int i = this.maxSize;
        int i2 = this.markPos;
        this.remaining = i - i2;
        this.readPos = i2;
    }

    public ControllableInputStream timeout(long j, long j2) {
        this.startTime = j;
        this.timeout = j2 * 1000000;
        return this;
    }

    public int max() {
        return this.maxSize;
    }

    public static ControllableInputStream wrap(InputStream inputStream, int i, int i2) {
        return wrap(inputStream, i2);
    }
}
