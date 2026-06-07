package org.jsoup.internal;

import defpackage.se;
import java.io.FilterInputStream;
import java.io.InputStream;
import org.jsoup.helper.Validate;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class SimpleBufferedInput extends FilterInputStream {
    static final SoftPool<byte[]> BufferPool = new SoftPool<>(new Object());
    static final int BufferSize = 8192;
    private int bufLength;
    private int bufMark;
    private int bufPos;
    private byte[] byteBuf;
    private boolean inReadFully;

    public SimpleBufferedInput(InputStream inputStream) {
        super(inputStream);
        this.bufMark = -1;
        this.inReadFully = false;
    }

    private void closeIfDone(int i) {
        if (i == -1) {
            this.inReadFully = true;
            super.close();
        }
    }

    private void fill() {
        if (this.inReadFully) {
            return;
        }
        if (this.byteBuf == null) {
            this.byteBuf = BufferPool.borrow();
        }
        int i = this.bufMark;
        if (i < 0) {
            this.bufPos = 0;
        } else {
            int i2 = this.bufPos;
            if (i2 >= 8192) {
                if (i > 0) {
                    int i3 = i2 - i;
                    byte[] bArr = this.byteBuf;
                    System.arraycopy(bArr, i, bArr, 0, i3);
                    this.bufPos = i3;
                    this.bufMark = 0;
                } else {
                    this.bufMark = -1;
                    this.bufPos = 0;
                }
            }
        }
        this.bufLength = this.bufPos;
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr2 = this.byteBuf;
        int i4 = this.bufPos;
        int read = inputStream.read(bArr2, i4, bArr2.length - i4);
        if (read > 0) {
            this.bufLength = this.bufPos + read;
            while (this.byteBuf.length - this.bufLength > 0 && ((FilterInputStream) this).in.available() >= 1) {
                InputStream inputStream2 = ((FilterInputStream) this).in;
                byte[] bArr3 = this.byteBuf;
                int i5 = this.bufLength;
                read = inputStream2.read(bArr3, i5, bArr3.length - i5);
                if (read <= 0) {
                    break;
                } else {
                    this.bufLength += read;
                }
            }
        }
        closeIfDone(read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$static$0() {
        return new byte[8192];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (this.byteBuf != null) {
            int i = this.bufLength;
            int i2 = this.bufPos;
            if (i - i2 > 0) {
                return i - i2;
            }
        }
        if (this.inReadFully) {
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    public boolean baseReadFully() {
        return this.inReadFully;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        byte[] bArr = this.byteBuf;
        if (bArr == null) {
            return;
        }
        BufferPool.release(bArr);
        this.byteBuf = null;
    }

    public byte[] getBuf() {
        Validate.notNull(this.byteBuf);
        return this.byteBuf;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (i <= 8192) {
            this.bufMark = this.bufPos;
        } else {
            se.h("Read-ahead limit is greater than buffer size");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        Validate.notNull(bArr);
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.bufLength - this.bufPos;
            if (i3 <= 0) {
                if (!this.inReadFully && this.bufMark < 0) {
                    int read = ((FilterInputStream) this).in.read(bArr, i, i2);
                    closeIfDone(read);
                    return read;
                }
                fill();
                i3 = this.bufLength - this.bufPos;
            }
            int min = Math.min(i3, i2);
            if (min <= 0) {
                return -1;
            }
            System.arraycopy(getBuf(), this.bufPos, bArr, i, min);
            this.bufPos += min;
            return min;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        int i = this.bufMark;
        if (i >= 0) {
            this.bufPos = i;
        } else {
            se.w("Resetting to invalid mark");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.bufPos >= this.bufLength) {
            fill();
            if (this.bufPos >= this.bufLength) {
                return -1;
            }
        }
        byte[] buf = getBuf();
        int i = this.bufPos;
        this.bufPos = i + 1;
        return buf[i] & 255;
    }
}
