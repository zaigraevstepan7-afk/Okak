package okhttp3.internal.cache2;

import defpackage.hk;
import defpackage.yq1;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "pos", "Lhk;", "source", "byteCount", "Lod2;", "write", "(JLhk;J)V", "sink", "read", "Ljava/nio/channels/FileChannel;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        fileChannel.getClass();
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, hk sink, long byteCount) {
        sink.getClass();
        if (byteCount >= 0) {
            long j = pos;
            long j2 = byteCount;
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, sink);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long pos, hk source, long byteCount) {
        source.getClass();
        if (byteCount >= 0 && byteCount <= source.f) {
            long j = pos;
            long j2 = byteCount;
            while (j2 > 0) {
                long transferFrom = this.fileChannel.transferFrom(source, j, j2);
                j += transferFrom;
                j2 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
