package okhttp3.internal.ws;

import defpackage.bl;
import defpackage.fk;
import defpackage.hk;
import defpackage.ok;
import defpackage.se;
import defpackage.yq1;
import java.io.Closeable;
import java.util.Random;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "Lok;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLok;Ljava/util/Random;ZZJ)V", "", "opcode", "Lbl;", "payload", "Lod2;", "writeControlFrame", "(ILbl;)V", "writePing", "(Lbl;)V", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "()V", "Z", "Lok;", "getSink", "()Lok;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "J", "Lhk;", "messageBuffer", "Lhk;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lfk;", "maskCursor", "Lfk;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final fk maskCursor;
    private final byte[] maskKey;
    private final hk messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final ok sink;
    private final hk sinkBuffer;
    private boolean writerClosed;

    /* JADX WARN: Type inference failed for: r3v1, types: [hk, java.lang.Object] */
    public WebSocketWriter(boolean z, ok okVar, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        okVar.getClass();
        random.getClass();
        this.isClient = z;
        this.sink = okVar;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new Object();
        this.sinkBuffer = okVar.a();
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new fk() : null;
    }

    private final void writeControlFrame(int opcode, bl payload) {
        if (!this.writerClosed) {
            int d = payload.d();
            if (d <= 125) {
                this.sinkBuffer.Q(opcode | 128);
                boolean z = this.isClient;
                hk hkVar = this.sinkBuffer;
                if (z) {
                    hkVar.Q(d | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    bArr.getClass();
                    random.nextBytes(bArr);
                    hk hkVar2 = this.sinkBuffer;
                    byte[] bArr2 = this.maskKey;
                    hkVar2.getClass();
                    bArr2.getClass();
                    hkVar2.m79write(bArr2, 0, bArr2.length);
                    if (d > 0) {
                        hk hkVar3 = this.sinkBuffer;
                        long j = hkVar3.f;
                        hkVar3.P(payload);
                        hk hkVar4 = this.sinkBuffer;
                        fk fkVar = this.maskCursor;
                        fkVar.getClass();
                        hkVar4.s(fkVar);
                        this.maskCursor.c(j);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    hkVar.Q(d);
                    this.sinkBuffer.P(payload);
                }
                this.sink.flush();
                return;
            }
            se.h("Payload size must be less than or equal to 125");
            return;
        }
        se.w("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.sink);
    }

    public final Random getRandom() {
        return this.random;
    }

    public final ok getSink() {
        return this.sink;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hk, java.lang.Object] */
    public final void writeClose(int code, bl reason) {
        bl blVar = bl.h;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            ?? obj = new Object();
            obj.V(code);
            if (reason != null) {
                obj.P(reason);
            }
            blVar = obj.e(obj.f);
        }
        try {
            writeControlFrame(8, blVar);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, bl data) {
        int i;
        data.getClass();
        if (!this.writerClosed) {
            this.messageBuffer.P(data);
            int i2 = formatOpcode | 128;
            if (this.perMessageDeflate && data.d() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i2 = formatOpcode | 192;
            }
            long j = this.messageBuffer.f;
            this.sinkBuffer.Q(i2);
            if (this.isClient) {
                i = 128;
            } else {
                i = 0;
            }
            hk hkVar = this.sinkBuffer;
            if (j <= 125) {
                hkVar.Q(i | ((int) j));
            } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                hkVar.Q(i | WebSocketProtocol.PAYLOAD_SHORT);
                this.sinkBuffer.V((int) j);
            } else {
                hkVar.Q(i | 127);
                this.sinkBuffer.U(j);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                random.nextBytes(bArr);
                hk hkVar2 = this.sinkBuffer;
                byte[] bArr2 = this.maskKey;
                hkVar2.getClass();
                bArr2.getClass();
                hkVar2.m79write(bArr2, 0, bArr2.length);
                if (j > 0) {
                    hk hkVar3 = this.messageBuffer;
                    fk fkVar = this.maskCursor;
                    fkVar.getClass();
                    hkVar3.s(fkVar);
                    this.maskCursor.c(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, j);
            this.sink.flush();
            return;
        }
        se.w("closed");
    }

    public final void writePing(bl payload) {
        payload.getClass();
        writeControlFrame(9, payload);
    }

    public final void writePong(bl payload) {
        payload.getClass();
        writeControlFrame(10, payload);
    }
}
