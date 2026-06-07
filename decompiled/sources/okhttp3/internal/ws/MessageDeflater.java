package okhttp3.internal.ws;

import defpackage.al1;
import defpackage.bl;
import defpackage.fk;
import defpackage.hk;
import defpackage.nz;
import defpackage.rx;
import defpackage.se;
import defpackage.yq1;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lhk;", "Lbl;", "suffix", "endsWith", "(Lhk;Lbl;)Z", "buffer", "Lod2;", "deflate", "(Lhk;)V", "close", "()V", "Z", "deflatedBytes", "Lhk;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lnz;", "deflaterSink", "Lnz;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MessageDeflater implements Closeable {
    private final hk deflatedBytes;
    private final Deflater deflater;
    private final nz deflaterSink;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r4v1, types: [hk, java.lang.Object, ey1] */
    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new nz(new al1(obj), deflater);
    }

    private final boolean endsWith(hk hkVar, bl blVar) {
        return hkVar.I(hkVar.f - blVar.d(), blVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(hk buffer) {
        bl blVar;
        buffer.getClass();
        if (this.deflatedBytes.f == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.f);
            this.deflaterSink.flush();
            hk hkVar = this.deflatedBytes;
            blVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            boolean endsWith = endsWith(hkVar, blVar);
            hk hkVar2 = this.deflatedBytes;
            if (endsWith) {
                long j = hkVar2.f - 4;
                fk s = hkVar2.s(rx.a);
                try {
                    s.b(j);
                    s.close();
                } finally {
                }
            } else {
                hkVar2.Q(0);
            }
            hk hkVar3 = this.deflatedBytes;
            buffer.write(hkVar3, hkVar3.f);
            return;
        }
        se.h("Failed requirement.");
    }
}
