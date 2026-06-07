package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class po0 extends i90 {
    public final /* synthetic */ int i;
    public final Closeable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po0(boolean z, Closeable closeable, int i) {
        super(z);
        this.i = i;
        this.j = closeable;
    }

    @Override // defpackage.i90
    public final synchronized void b() {
        int i = this.i;
        synchronized (this) {
            switch (i) {
                case 0:
                    ((RandomAccessFile) this.j).close();
                    return;
                default:
                    ((FileChannel) this.j).close();
                    return;
            }
        }
    }

    @Override // defpackage.i90
    public final synchronized void c() {
        int i = this.i;
        synchronized (this) {
            switch (i) {
                case 0:
                    ((RandomAccessFile) this.j).getFD().sync();
                    return;
                default:
                    ((FileChannel) this.j).force(true);
                    return;
            }
        }
    }

    @Override // defpackage.i90
    public final synchronized int g(byte[] bArr, int i, long j, int i2) {
        int i3 = this.i;
        int i4 = 0;
        synchronized (this) {
            switch (i3) {
                case 0:
                    bArr.getClass();
                    ((RandomAccessFile) this.j).seek(j);
                    while (true) {
                        if (i4 < i2) {
                            int read = ((RandomAccessFile) this.j).read(bArr, i, i2 - i4);
                            if (read == -1) {
                                if (i4 == 0) {
                                    return -1;
                                }
                            } else {
                                i4 += read;
                            }
                        }
                    }
                    return i4;
                default:
                    bArr.getClass();
                    ((FileChannel) this.j).position(j);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
                    while (true) {
                        if (i4 < i2) {
                            int read2 = ((FileChannel) this.j).read(wrap);
                            if (read2 == -1) {
                                if (i4 == 0) {
                                    return -1;
                                }
                            } else {
                                i4 += read2;
                            }
                        }
                    }
                    return i4;
            }
        }
    }

    @Override // defpackage.i90
    public final synchronized long i() {
        int i = this.i;
        synchronized (this) {
            switch (i) {
                case 0:
                    return ((RandomAccessFile) this.j).length();
                default:
                    return ((FileChannel) this.j).size();
            }
        }
    }

    @Override // defpackage.i90
    public final synchronized void k(byte[] bArr, int i, long j, int i2) {
        int i3 = this.i;
        synchronized (this) {
            switch (i3) {
                case 0:
                    bArr.getClass();
                    ((RandomAccessFile) this.j).seek(j);
                    ((RandomAccessFile) this.j).write(bArr, i, i2);
                    return;
                default:
                    bArr.getClass();
                    ((FileChannel) this.j).position(j);
                    ((FileChannel) this.j).write(ByteBuffer.wrap(bArr, i, i2));
                    return;
            }
        }
    }
}
