package okhttp3;

import defpackage.bl;
import defpackage.bl1;
import defpackage.da2;
import defpackage.ea2;
import defpackage.go;
import defpackage.hk;
import defpackage.k12;
import defpackage.l90;
import defpackage.pk;
import defpackage.qb1;
import defpackage.se;
import defpackage.sn0;
import defpackage.xl1;
import defpackage.yq1;
import defpackage.yx;
import java.io.Closeable;
import java.io.EOFException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.http1.HeadersReader;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lpk;", "source", "", "boundary", "<init>", "(Lpk;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "", "maxByteCount", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "Lod2;", "close", "()V", "Lpk;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lbl;", "dashDashBoundary", "Lbl;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "PartSource", "Part", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MultipartReader implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final qb1 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final bl crlfDashDashBoundary;
    private PartSource currentPart;
    private final bl dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final pk source;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lpk;", "body", "<init>", "(Lokhttp3/Headers;Lpk;)V", "Lod2;", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lpk;", "()Lpk;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Part implements Closeable {
        private final pk body;
        private final Headers headers;

        public Part(Headers headers, pk pkVar) {
            headers.getClass();
            pkVar.getClass();
            this.headers = headers;
            this.body = pkVar;
        }

        /* renamed from: body, reason: from getter */
        public final pk getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        /* renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lk12;", "<init>", "(Lokhttp3/MultipartReader;)V", "Lod2;", "close", "()V", "Lhk;", "sink", "", "byteCount", "read", "(Lhk;J)J", "Lea2;", "timeout", "()Lea2;", "Lea2;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class PartSource implements k12 {
        private final ea2 timeout = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [ea2, java.lang.Object] */
        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (sn0.r(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // defpackage.k12
        public long read(hk sink, long byteCount) {
            long read;
            long read2;
            sink.getClass();
            if (byteCount >= 0) {
                if (sn0.r(MultipartReader.this.currentPart, this)) {
                    ea2 timeout = MultipartReader.this.source.getTimeout();
                    ea2 ea2Var = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    da2 da2Var = ea2.Companion;
                    long timeoutNanos2 = ea2Var.timeoutNanos();
                    long timeoutNanos3 = timeout.timeoutNanos();
                    da2Var.getClass();
                    if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                        timeoutNanos2 = timeoutNanos3;
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(timeoutNanos2, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (ea2Var.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), ea2Var.deadlineNanoTime()));
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(sink, currentPartBytesRemaining);
                            }
                            return read2;
                        } finally {
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (ea2Var.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                        }
                    }
                    if (ea2Var.hasDeadline()) {
                        timeout.deadlineNanoTime(ea2Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(sink, currentPartBytesRemaining2);
                        }
                        return read;
                    } finally {
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (ea2Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                    }
                }
                se.p("closed");
                return 0L;
            }
            se.e(l90.k("byteCount < 0: ", byteCount));
            return 0L;
        }

        @Override // defpackage.k12
        /* renamed from: timeout, reason: from getter */
        public ea2 getTimeout() {
            return this.timeout;
        }
    }

    static {
        bl blVar = bl.h;
        afterBoundaryOptions = go.L(xl1.p("\r\n"), xl1.p("--"), xl1.p(" "), xl1.p("\t"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [hk, java.lang.Object] */
    public MultipartReader(pk pkVar, String str) {
        pkVar.getClass();
        str.getClass();
        this.source = pkVar;
        this.boundary = str;
        ?? obj = new Object();
        obj.Y("--");
        obj.Y(str);
        this.dashDashBoundary = obj.e(obj.f);
        ?? obj2 = new Object();
        obj2.Y("\r\n--");
        obj2.Y(str);
        this.crlfDashDashBoundary = obj2.e(obj2.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxByteCount) {
        long min = Math.min(this.source.a().f, maxByteCount) + 1;
        long d = this.source.d(min, this.crlfDashDashBoundary);
        if (d != -1) {
            return d;
        }
        if (this.source.a().f >= min) {
            return Math.min(min, maxByteCount);
        }
        throw new EOFException();
    }

    /* renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() {
        pk pkVar;
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.I(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.d());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                    pkVar = this.source;
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    pkVar.skip(currentPartBytesRemaining);
                }
                pkVar.skip(this.crlfDashDashBoundary.d());
            }
            boolean z = false;
            while (true) {
                int J = this.source.J(afterBoundaryOptions);
                if (J != -1) {
                    if (J != 0) {
                        if (J != 1) {
                            if (J == 2 || J == 3) {
                                z = true;
                            }
                        } else {
                            if (!z) {
                                if (this.partCount != 0) {
                                    this.noMoreParts = true;
                                    return null;
                                }
                                throw new ProtocolException("expected at least 1 part");
                            }
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, new bl1(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            se.p("closed");
            return null;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lqb1;", "afterBoundaryOptions", "Lqb1;", "getAfterBoundaryOptions", "()Lqb1;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final qb1 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            r3.getClass()
            pk r0 = r3.getBodySource()
            okhttp3.MediaType r3 = r3.getMediaType()
            if (r3 == 0) goto L19
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L19
            r2.<init>(r0, r3)
            return
        L19:
            java.net.ProtocolException r2 = new java.net.ProtocolException
            java.lang.String r3 = "expected the Content-Type to have a boundary parameter"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
