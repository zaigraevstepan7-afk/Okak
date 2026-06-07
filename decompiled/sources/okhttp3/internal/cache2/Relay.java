package okhttp3.internal.cache2;

import defpackage.bl;
import defpackage.ea2;
import defpackage.hk;
import defpackage.k12;
import defpackage.se;
import defpackage.sn0;
import defpackage.xl1;
import defpackage.yq1;
import defpackage.yx;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0002FEB5\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010$R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010;\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010D\u001a\u0002048F¢\u0006\u0006\u001a\u0004\bD\u00108¨\u0006G"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "Lokhttp3/internal/concurrent/Lockable;", "Ljava/io/RandomAccessFile;", "file", "Lk12;", "upstream", "", "upstreamPos", "Lbl;", "metadata", "bufferMaxSize", "<init>", "(Ljava/io/RandomAccessFile;Lk12;JLbl;J)V", "prefix", "upstreamSize", "metadataSize", "Lod2;", "writeHeader", "(Lbl;JJ)V", "writeMetadata", "(J)V", "commit", "()Lbl;", "newSource", "()Lk12;", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "Lk12;", "getUpstream", "setUpstream", "(Lk12;)V", "J", "getUpstreamPos", "()J", "setUpstreamPos", "Lbl;", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lhk;", "upstreamBuffer", "Lhk;", "getUpstreamBuffer", "()Lhk;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Relay implements Lockable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final bl PREFIX_CLEAN;
    public static final bl PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final hk buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final bl metadata;
    private int sourceCount;
    private k12 upstream;
    private final hk upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lk12;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "Lhk;", "sink", "", "byteCount", "read", "(Lhk;J)J", "Lea2;", "timeout", "()Lea2;", "Lod2;", "close", "()V", "Lea2;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class RelaySource implements k12 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final ea2 timeout = new Object();

        /* JADX WARN: Type inference failed for: r0v0, types: [ea2, java.lang.Object] */
        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            file.getClass();
            FileChannel channel = file.getChannel();
            channel.getClass();
            this.fileOperator = new FileOperator(channel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = Relay.this;
                synchronized (relay) {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                }
                if (randomAccessFile != null) {
                    _UtilCommonKt.closeQuietly(randomAccessFile);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            r4 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        
            r14 = java.lang.Math.min(r24, r4.getUpstreamPos() - r22.sourcePos);
            r10 = r22.fileOperator;
            r10.getClass();
            r10.read(r22.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r23, r14);
            r22.sourcePos += r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            return r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        
            r0 = r4.getUpstream();
            r0.getClass();
            r10 = r0.read(r22.this$0.getUpstreamBuffer(), r22.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        
            if (r10 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        
            r0 = r22.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
        
            r1 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        
            r1.setUpstreamReader(null);
            r1.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        
            r20 = java.lang.Math.min(r10, r24);
            r22.this$0.getUpstreamBuffer().i(0, r23, r20);
            r22.sourcePos += r20;
            r12 = r22.fileOperator;
            r12.getClass();
            r12.write(r22.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22.this$0.getUpstreamBuffer().clone(), r10);
            r4 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        
            r4.getBuffer().write(r4.getUpstreamBuffer(), r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
        
            if (r4.getBuffer().f <= r4.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
        
            r4.getBuffer().skip(r4.getBuffer().f - r4.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
        
            r4.setUpstreamPos(r4.getUpstreamPos() + r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
        
            r1 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x011b, code lost:
        
            r1.setUpstreamReader(null);
            r1.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0122, code lost:
        
            return r20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0127, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00a6, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
        
            r1 = r22.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012a, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
        
            r1.setUpstreamReader(null);
            r1.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0132, code lost:
        
            throw r0;
         */
        @Override // defpackage.k12
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(defpackage.hk r23, long r24) {
            /*
                Method dump skipped, instructions count: 351
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(hk, long):long");
        }

        @Override // defpackage.k12
        /* renamed from: timeout, reason: from getter */
        public ea2 getTimeout() {
            return this.timeout;
        }
    }

    static {
        bl blVar = bl.h;
        PREFIX_CLEAN = xl1.p("OkHttp cache v1\n");
        PREFIX_DIRTY = xl1.p("OkHttp DIRTY :(\n");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hk, java.lang.Object] */
    private Relay(RandomAccessFile randomAccessFile, k12 k12Var, long j, bl blVar, long j2) {
        boolean z;
        this.file = randomAccessFile;
        this.upstream = k12Var;
        this.upstreamPos = j;
        this.metadata = blVar;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new Object();
        if (k12Var == null) {
            z = true;
        } else {
            z = false;
        }
        this.complete = z;
        this.buffer = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [hk, java.lang.Object] */
    public final void writeHeader(bl prefix, long upstreamSize, long metadataSize) {
        ?? obj = new Object();
        obj.P(prefix);
        obj.U(upstreamSize);
        obj.U(metadataSize);
        if (obj.f == FILE_HEADER_SIZE) {
            RandomAccessFile randomAccessFile = this.file;
            randomAccessFile.getClass();
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            new FileOperator(channel).write(0L, obj, FILE_HEADER_SIZE);
            return;
        }
        se.h("Failed requirement.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hk, java.lang.Object] */
    private final void writeMetadata(long upstreamSize) {
        ?? obj = new Object();
        obj.P(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(FILE_HEADER_SIZE + upstreamSize, obj, this.metadata.d());
    }

    public final void commit(long upstreamSize) {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.d());
        RandomAccessFile randomAccessFile2 = this.file;
        randomAccessFile2.getClass();
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        k12 k12Var = this.upstream;
        if (k12Var != null) {
            _UtilCommonKt.closeQuietly(k12Var);
        }
        this.upstream = null;
    }

    public final hk getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final k12 getUpstream() {
        return this.upstream;
    }

    public final hk getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    /* renamed from: metadata, reason: from getter */
    public final bl getMetadata() {
        return this.metadata;
    }

    public final k12 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(k12 k12Var) {
        this.upstream = k12Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lk12;", "upstream", "Lbl;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;Lk12;Lbl;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", "", "SOURCE_UPSTREAM", "I", "SOURCE_FILE", "PREFIX_CLEAN", "Lbl;", "PREFIX_DIRTY", "FILE_HEADER_SIZE", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final Relay edit(File file, k12 upstream, bl metadata, long bufferMaxSize) {
            file.getClass();
            upstream.getClass();
            metadata.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [hk, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v1, types: [hk, java.lang.Object] */
        public final Relay read(File file) {
            file.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            FileOperator fileOperator = new FileOperator(channel);
            ?? obj = new Object();
            fileOperator.read(0L, obj, Relay.FILE_HEADER_SIZE);
            if (sn0.r(obj.e(r9.d()), Relay.PREFIX_CLEAN)) {
                long readLong = obj.readLong();
                long readLong2 = obj.readLong();
                ?? obj2 = new Object();
                fileOperator.read(Relay.FILE_HEADER_SIZE + readLong, obj2, readLong2);
                return new Relay(randomAccessFile, null, readLong, obj2.e(obj2.f), 0L, null);
            }
            se.w("unreadable cache file");
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, k12 k12Var, long j, bl blVar, long j2, yx yxVar) {
        this(randomAccessFile, k12Var, j, blVar, j2);
    }
}
