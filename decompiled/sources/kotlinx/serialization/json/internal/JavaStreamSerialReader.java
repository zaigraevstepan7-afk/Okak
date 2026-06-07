package kotlinx.serialization.json.internal;

import defpackage.sm;
import defpackage.yq1;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/JavaStreamSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;)V", "", "buffer", "", "bufferOffset", "count", "read", "([CII)I", "Lod2;", "release", "()V", "Lkotlinx/serialization/json/internal/CharsetReader;", "reader", "Lkotlinx/serialization/json/internal/CharsetReader;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JavaStreamSerialReader implements InternalJsonReader {
    private final CharsetReader reader;

    public JavaStreamSerialReader(InputStream inputStream) {
        inputStream.getClass();
        this.reader = new CharsetReader(inputStream, sm.a);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public int read(char[] buffer, int bufferOffset, int count) {
        buffer.getClass();
        return this.reader.read(buffer, bufferOffset, count);
    }

    public final void release() {
        this.reader.release();
    }
}
