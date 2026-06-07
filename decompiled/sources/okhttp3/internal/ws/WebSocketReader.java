package okhttp3.internal.ws;

import defpackage.bl;
import defpackage.fk;
import defpackage.hk;
import defpackage.pk;
import defpackage.se;
import defpackage.yq1;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "isClient", "Lpk;", "source", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLpk;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "Lod2;", "readHeader", "()V", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", "close", "Z", "Lpk;", "getSource", "()Lpk;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "closed", "", "opcode", "I", "", "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Lhk;", "controlFrameBuffer", "Lhk;", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "", "maskKey", "[B", "Lfk;", "maskCursor", "Lfk;", "FrameCallback", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final hk controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final fk maskCursor;
    private final byte[] maskKey;
    private final hk messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final pk source;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "text", "Lod2;", "onReadMessage", "(Ljava/lang/String;)V", "Lbl;", "bytes", "(Lbl;)V", "payload", "onReadPing", "onReadPong", "", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public interface FrameCallback {
        void onReadClose(int code, String reason);

        void onReadMessage(bl bytes);

        void onReadMessage(String text);

        void onReadPing(bl payload);

        void onReadPong(bl payload);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hk, java.lang.Object] */
    public WebSocketReader(boolean z, pk pkVar, FrameCallback frameCallback, boolean z2, boolean z3) {
        byte[] bArr;
        pkVar.getClass();
        frameCallback.getClass();
        this.isClient = z;
        this.source = pkVar;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new Object();
        this.messageFrameBuffer = new Object();
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = z ? null : new fk();
    }

    private final void readControlFrame() {
        short s;
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.v(this.controlFrameBuffer, j);
            if (!this.isClient) {
                hk hkVar = this.controlFrameBuffer;
                fk fkVar = this.maskCursor;
                fkVar.getClass();
                hkVar.s(fkVar);
                this.maskCursor.c(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                fk fkVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                webSocketProtocol.toggleMask(fkVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                hk hkVar2 = this.controlFrameBuffer;
                long j2 = hkVar2.f;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = hkVar2.readShort();
                        str = this.controlFrameBuffer.G();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                hk hkVar3 = this.controlFrameBuffer;
                frameCallback.onReadPing(hkVar3.e(hkVar3.f));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                hk hkVar4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(hkVar4.e(hkVar4.f));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + _UtilJvmKt.toHexString(this.opcode));
        }
    }

    private final void readHeader() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = _UtilCommonKt.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, timeUnit);
                int i = and & 15;
                this.opcode = i;
                boolean z5 = false;
                if ((and & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.isFinalFrame = z;
                if ((and & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.isControlFrame = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((and & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != 1 && i != 2) {
                    if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z3) {
                        if (this.perMessageDeflate) {
                            z4 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z4 = false;
                    }
                    this.readingCompressedMessage = z4;
                }
                if ((and & 32) == 0) {
                    if ((and & 16) == 0) {
                        int and2 = _UtilCommonKt.and(this.source.readByte(), 255);
                        if ((and2 & 128) != 0) {
                            z5 = true;
                        }
                        if (z5 == this.isClient) {
                            if (this.isClient) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = and2 & 127;
                        this.frameLength = j;
                        if (j == 126) {
                            this.frameLength = _UtilCommonKt.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        } else if (j == 127) {
                            long readLong = this.source.readLong();
                            this.frameLength = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + _UtilJvmKt.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.isControlFrame && this.frameLength > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z5) {
                            pk pkVar = this.source;
                            byte[] bArr = this.maskKey;
                            bArr.getClass();
                            pkVar.readFully(bArr);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, timeUnit);
                throw th;
            }
        }
        se.w("closed");
    }

    private final void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.v(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    hk hkVar = this.messageFrameBuffer;
                    fk fkVar = this.maskCursor;
                    fkVar.getClass();
                    hkVar.s(fkVar);
                    this.maskCursor.c(this.messageFrameBuffer.f - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    fk fkVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    bArr.getClass();
                    webSocketProtocol.toggleMask(fkVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + _UtilJvmKt.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        se.w("closed");
    }

    private final void readMessageFrame() {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + _UtilJvmKt.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        FrameCallback frameCallback = this.frameCallback;
        if (i == 1) {
            frameCallback.onReadMessage(this.messageFrameBuffer.G());
        } else {
            hk hkVar = this.messageFrameBuffer;
            frameCallback.onReadMessage(hkVar.e(hkVar.f));
        }
    }

    private final void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            _UtilCommonKt.closeQuietly(messageInflater);
        }
        _UtilCommonKt.closeQuietly(this.source);
    }

    public final pk getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
