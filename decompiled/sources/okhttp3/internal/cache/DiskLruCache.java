package okhttp3.internal.cache;

import defpackage.al1;
import defpackage.am1;
import defpackage.ey1;
import defpackage.i;
import defpackage.i32;
import defpackage.k12;
import defpackage.l90;
import defpackage.lo;
import defpackage.n90;
import defpackage.od2;
import defpackage.oe1;
import defpackage.ok;
import defpackage.p32;
import defpackage.qo;
import defpackage.r;
import defpackage.se;
import defpackage.sn0;
import defpackage.xd0;
import defpackage.y61;
import defpackage.yq1;
import defpackage.zd0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001l\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004pqroB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001e\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J#\u0010&\u001a\u00020\u00112\n\u0010!\u001a\u00060\u001cR\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\u00020\"2\n\u0010*\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010\u0013J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010\u0013J\r\u00103\u001a\u00020\u0011¢\u0006\u0004\b3\u0010\u0013J\r\u00104\u001a\u00020\u0011¢\u0006\u0004\b4\u0010\u0013J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u000005¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u0010\u0013J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0016H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010\u0013J\u000f\u0010@\u001a\u00020\"H\u0002¢\u0006\u0004\b@\u00100J\u000f\u0010A\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010\u0013J\u000f\u0010B\u001a\u00020\"H\u0002¢\u0006\u0004\bB\u00100J\u0017\u0010C\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bC\u0010>R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010LR*\u0010\f\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010N\u001a\u0004\bO\u0010 \"\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010DR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010DR\u0014\u0010T\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010DR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010NR\u0018\u0010U\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR>\u0010Y\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u00000Wj\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u0000`X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010GR\u0016\u0010^\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010_R\"\u0010b\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010_\u001a\u0004\bc\u00100\"\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R\u0016\u0010g\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010_R\u0016\u0010h\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010NR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006s"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/concurrent/Lockable;", "Ln90;", "fileSystem", "Loe1;", "directory", "", "appVersion", "valueCount", "", "maxSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Ln90;Loe1;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Lod2;", "initialize", "()V", "rebuildJournal$okhttp", "rebuildJournal", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "size", "()J", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "()Z", "close", "trimToSize", "delete", "evictAll", "", "snapshots", "()Ljava/util/Iterator;", "readJournal", "Lok;", "newJournalWriter", "()Lok;", "line", "readJournalLine", "(Ljava/lang/String;)V", "processJournal", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", "validateKey", "Loe1;", "getDirectory", "()Loe1;", "I", "getValueCount$okhttp", "()I", "Ln90;", "getFileSystem$okhttp", "()Ln90;", "value", "J", "getMaxSize", "setMaxSize", "(J)V", "journalFile", "journalFileTmp", "journalFileBackup", "journalWriter", "Lok;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "redundantOpCount", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Companion", "Snapshot", "Editor", "Entry", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable, Lockable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final oe1 directory;
    private final n90 fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final oe1 journalFile;
    private final oe1 journalFileBackup;
    private final oe1 journalFileTmp;
    private ok journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final am1 LEGAL_KEY_PATTERN = new am1("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "Lod2;", "detach$okhttp", "()V", "detach", "", "index", "Lk12;", "newSource", "(I)Lk12;", "Ley1;", "newSink", "(I)Ley1;", "commit", "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            boolean[] zArr;
            entry.getClass();
            this.this$0 = diskLruCache;
            this.entry = entry;
            if (entry.getReadable()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount()];
            }
            this.written = zArr;
        }

        public static /* synthetic */ od2 a(DiskLruCache diskLruCache, Editor editor, IOException iOException) {
            return newSink$lambda$0$0(diskLruCache, editor, iOException);
        }

        public static final od2 newSink$lambda$0$0(DiskLruCache diskLruCache, Editor editor, IOException iOException) {
            iOException.getClass();
            synchronized (diskLruCache) {
                editor.detach$okhttp();
            }
            return od2.a;
        }

        public final void abort() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (sn0.r(this.entry.getCurrentEditor(), this)) {
                            diskLruCache.completeEdit$okhttp(this, false);
                        }
                        this.done = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (sn0.r(this.entry.getCurrentEditor(), this)) {
                            diskLruCache.completeEdit$okhttp(this, true);
                        }
                        this.done = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (sn0.r(this.entry.getCurrentEditor(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        /* renamed from: getEntry$okhttp, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        /* renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ey1] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, ey1] */
        public final ey1 newSink(int index) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (!sn0.r(this.entry.getCurrentEditor(), this)) {
                            return new Object();
                        }
                        if (!this.entry.getReadable()) {
                            boolean[] zArr = this.written;
                            zArr.getClass();
                            zArr[index] = true;
                        }
                        try {
                            return new FaultHidingSink(diskLruCache.getFileSystem().sink(this.entry.getDirtyFiles$okhttp().get(index)), new i(9, diskLruCache, this));
                        } catch (FileNotFoundException unused) {
                            return new Object();
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final k12 newSource(int index) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    k12 k12Var = null;
                    if (!this.entry.getReadable() || !sn0.r(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                        return null;
                    }
                    try {
                        k12Var = diskLruCache.getFileSystem().source(this.entry.getCleanFiles$okhttp().get(index));
                    } catch (FileNotFoundException unused) {
                    }
                    return k12Var;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001d\u001a\b\u0018\u00010\u0019R\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\"\u0010/\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R(\u00109\u001a\b\u0018\u000108R\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "key", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "invalidLengths", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "Lk12;", "newSource", "(I)Lk12;", "Lod2;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lok;", "writer", "writeLengths$okhttp", "(Lok;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Loe1;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class Entry {
        private final List<oe1> cleanFiles;
        private Editor currentEditor;
        private final List<oe1> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            str.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i = 0; i < valueCount; i++) {
                sb.append(i);
                this.cleanFiles.add(this.this$0.getDirectory().f(sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(this.this$0.getDirectory().f(sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> strings) {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final k12 newSource(int index) {
            k12 source = this.this$0.getFileSystem().source(this.cleanFiles.get(index));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new zd0(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // defpackage.zd0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache2 = diskLruCache;
                        DiskLruCache.Entry entry = this;
                        synchronized (diskLruCache2) {
                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                            if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                                diskLruCache2.removeEntry$okhttp(entry);
                            }
                        }
                    }
                }
            };
        }

        public final List<oe1> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        /* renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final List<oe1> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        /* renamed from: getKey$okhttp, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> strings) {
            strings.getClass();
            if (strings.size() == this.this$0.getValueCount()) {
                try {
                    int size = strings.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = Long.parseLong(strings.get(i));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(strings);
                    se.c();
                    return;
                }
            }
            invalidLengths(strings);
            se.c();
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                y61.h(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
                return null;
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.this$0.getValueCount();
                for (int i = 0; i < valueCount; i++) {
                    arrayList.add(newSource(i));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    _UtilCommonKt.closeQuietly((k12) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(ok writer) {
            writer.getClass();
            for (long j : this.lengths) {
                writer.writeByte(32).L(j);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\rJ\u0013\u0010\u0010\u001a\b\u0018\u00010\u000eR\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lk12;", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "index", "getSource", "(I)Lk12;", "getLength", "(I)J", "Lod2;", "close", "()V", "Ljava/lang/String;", "J", "Ljava/util/List;", "[J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<k12> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends k12> list, long[] jArr) {
            str.getClass();
            list.getClass();
            jArr.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<k12> it = this.sources.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.closeQuietly(it.next());
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int index) {
            return this.lengths[index];
        }

        public final k12 getSource(int index) {
            return this.sources.get(index);
        }

        /* renamed from: key, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(n90 n90Var, oe1 oe1Var, int i, int i2, long j, TaskRunner taskRunner) {
        n90Var.getClass();
        oe1Var.getClass();
        taskRunner.getClass();
        this.directory = oe1Var;
        this.appVersion = i;
        this.valueCount = i2;
        this.fileSystem = new xd0(n90Var) { // from class: okhttp3.internal.cache.DiskLruCache$fileSystem$1
            @Override // defpackage.xd0, defpackage.n90
            public ey1 sink(oe1 file, boolean mustCreate) {
                file.getClass();
                oe1 c = file.c();
                if (c != null) {
                    createDirectories(c);
                }
                return super.sink(file, mustCreate);
            }
        };
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new Task(l90.p(new StringBuilder(), _UtilJvmKt.okHttpName, " Cache")) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ey1] */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z;
                ok okVar;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z = diskLruCache.initialized;
                    if (!z || diskLruCache.getClosed()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        okVar = diskLruCache.journalWriter;
                        if (okVar != null) {
                            _UtilCommonKt.closeQuietly(okVar);
                        }
                        diskLruCache.journalWriter = new al1(new Object());
                    }
                    return -1L;
                }
            }
        };
        if (j > 0) {
            if (i2 > 0) {
                this.journalFile = oe1Var.f(JOURNAL_FILE);
                this.journalFileTmp = oe1Var.f(JOURNAL_FILE_TEMP);
                this.journalFileBackup = oe1Var.f(JOURNAL_FILE_BACKUP);
                return;
            }
            se.h("valueCount <= 0");
            throw null;
        }
        se.h("maxSize <= 0");
        throw null;
    }

    public static /* synthetic */ od2 b(DiskLruCache diskLruCache, IOException iOException) {
        return newJournalWriter$lambda$0(diskLruCache, iOException);
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i >= 2000 && i >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    private final ok newJournalWriter() {
        return new al1(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new r(this, 11)));
    }

    public static final od2 newJournalWriter$lambda$0(DiskLruCache diskLruCache, IOException iOException) {
        iOException.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
            y61.h(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
            return null;
        }
        diskLruCache.hasJournalErrors = true;
        return od2.a;
    }

    private final void processJournal() {
        _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.getClass();
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i));
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readJournal() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            n90 r2 = r11.fileSystem
            oe1 r3 = r11.journalFile
            k12 r2 = r2.source(r3)
            bl1 r2 = defpackage.lo.l(r2)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = r2.q(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r2.q(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r2.q(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r2.q(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r2.q(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> L62
            boolean r10 = defpackage.sn0.r(r10, r5)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L8b
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> L62
            boolean r10 = defpackage.sn0.r(r10, r6)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L8b
            int r10 = r11.appVersion     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L62
            boolean r7 = defpackage.sn0.r(r10, r7)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L8b
            int r7 = r11.valueCount     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L62
            boolean r7 = defpackage.sn0.r(r7, r8)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L8b
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L62
            if (r7 > 0) goto L8b
            r0 = 0
        L58:
            java.lang.String r1 = r2.q(r3)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            r11.readJournalLine(r1)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            int r0 = r0 + 1
            goto L58
        L62:
            r11 = move-exception
            goto Lb4
        L64:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r11.lruEntries     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r1
            r11.redundantOpCount = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r2.j()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L77
            r11.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> L62
            goto L84
        L77:
            ok r0 = r11.journalWriter     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L7e
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L62
        L7e:
            ok r0 = r11.newJournalWriter()     // Catch: java.lang.Throwable -> L62
            r11.journalWriter = r0     // Catch: java.lang.Throwable -> L62
        L84:
            r2.close()     // Catch: java.lang.Throwable -> L89
            r11 = 0
            goto Lbc
        L89:
            r11 = move-exception
            goto Lbc
        L8b:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r3.append(r5)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r6)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r8)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r9)     // Catch: java.lang.Throwable -> L62
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L62
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r11     // Catch: java.lang.Throwable -> L62
        Lb4:
            r2.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r0 = move-exception
            defpackage.qo.g(r11, r0)
        Lbc:
            if (r11 != 0) goto Lbf
            return
        Lbf:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String line) {
        String substring;
        int K = i32.K(line, ' ', 0, 6);
        if (K != -1) {
            int i = K + 1;
            int K2 = i32.K(line, ' ', i, 4);
            if (K2 == -1) {
                substring = line.substring(i);
                String str = REMOVE;
                if (K == str.length() && p32.D(line, str, false)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            } else {
                substring = line.substring(i, K2);
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(this, substring);
                this.lruEntries.put(substring, entry);
            }
            if (K2 != -1) {
                String str2 = CLEAN;
                if (K == str2.length() && p32.D(line, str2, false)) {
                    List<String> V = i32.V(line.substring(K2 + 1), new char[]{' '});
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp(null);
                    entry.setLengths$okhttp(V);
                    return;
                }
            }
            if (K2 == -1) {
                String str3 = DIRTY;
                if (K == str3.length() && p32.D(line, str3, false)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (K2 == -1) {
                String str4 = READ;
                if (K == str4.length() && p32.D(line, str4, false)) {
                    return;
                }
            }
            se.w("unexpected journal line: ".concat(line));
            return;
        }
        se.w("unexpected journal line: ".concat(line));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            entry.getClass();
            Entry entry2 = entry;
            if (!entry2.getZombie()) {
                removeEntry$okhttp(entry2);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String key) {
        am1 am1Var = LEGAL_KEY_PATTERN;
        am1Var.getClass();
        key.getClass();
        if (am1Var.e.matcher(key).matches()) {
            return;
        }
        se.i("keys must match regex [a-z0-9_-]{1,120}: \"", 34, key);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                values.getClass();
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    entry.getClass();
                    if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                        currentEditor.detach$okhttp();
                    }
                }
                trimToSize();
                ok okVar = this.journalWriter;
                if (okVar != null) {
                    _UtilCommonKt.closeQuietly(okVar);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean success) {
        long j;
        editor.getClass();
        Entry entry = editor.getEntry();
        if (sn0.r(entry.getCurrentEditor(), editor)) {
            if (success && !entry.getReadable()) {
                int i = this.valueCount;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] written = editor.getWritten();
                    written.getClass();
                    if (written[i2]) {
                        if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i2))) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            int i3 = this.valueCount;
            for (int i4 = 0; i4 < i3; i4++) {
                oe1 oe1Var = entry.getDirtyFiles$okhttp().get(i4);
                if (success && !entry.getZombie()) {
                    if (this.fileSystem.exists(oe1Var)) {
                        oe1 oe1Var2 = entry.getCleanFiles$okhttp().get(i4);
                        this.fileSystem.atomicMove(oe1Var, oe1Var2);
                        long j2 = entry.getLengths()[i4];
                        Long l = this.fileSystem.metadata(oe1Var2).d;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        entry.getLengths()[i4] = j;
                        this.size = (this.size - j2) + j;
                    }
                } else {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, oe1Var);
                }
            }
            entry.setCurrentEditor$okhttp(null);
            if (entry.getZombie()) {
                removeEntry$okhttp(entry);
                return;
            }
            this.redundantOpCount++;
            ok okVar = this.journalWriter;
            okVar.getClass();
            if (!entry.getReadable() && !success) {
                this.lruEntries.remove(entry.getKey());
                okVar.u(REMOVE).writeByte(32);
                okVar.u(entry.getKey());
                okVar.writeByte(10);
                okVar.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry.setReadable$okhttp(true);
            okVar.u(CLEAN).writeByte(32);
            okVar.u(entry.getKey());
            entry.writeLengths$okhttp(okVar);
            okVar.writeByte(10);
            if (success) {
                long j3 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j3;
                entry.setSequenceNumber$okhttp(j3);
            }
            okVar.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void delete() {
        close();
        _UtilCommonKt.deleteContents(this.fileSystem, this.directory);
    }

    public final synchronized Editor edit(String key, long expectedSequenceNumber) {
        Editor editor;
        key.getClass();
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if (entry != null) {
            editor = entry.getCurrentEditor();
        } else {
            editor = null;
        }
        if (editor != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            ok okVar = this.journalWriter;
            okVar.getClass();
            okVar.u(DIRTY).writeByte(32).u(key).writeByte(10);
            okVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor2 = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor2);
            return editor2;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> values = this.lruEntries.values();
            values.getClass();
            for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                entry.getClass();
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        ok okVar = this.journalWriter;
        okVar.getClass();
        okVar.flush();
    }

    public final synchronized Snapshot get(String key) {
        key.getClass();
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        ok okVar = this.journalWriter;
        okVar.getClass();
        okVar.u(READ).writeByte(32).u(key).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    /* renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final oe1 getDirectory() {
        return this.directory;
    }

    /* renamed from: getFileSystem$okhttp, reason: from getter */
    public final n90 getFileSystem() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        try {
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                boolean exists = this.fileSystem.exists(this.journalFile);
                n90 n90Var = this.fileSystem;
                if (exists) {
                    n90Var.delete(this.journalFileBackup);
                } else {
                    n90Var.atomicMove(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = _UtilCommonKt.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    try {
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        Throwable th;
        try {
            ok okVar = this.journalWriter;
            if (okVar != null) {
                okVar.close();
            }
            al1 k = lo.k(this.fileSystem.sink(this.journalFileTmp, false));
            try {
                k.u(MAGIC);
                k.writeByte(10);
                k.u(VERSION_1);
                k.writeByte(10);
                k.L(this.appVersion);
                k.writeByte(10);
                k.L(this.valueCount);
                k.writeByte(10);
                k.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    entry.getClass();
                    Entry entry2 = entry;
                    if (entry2.getCurrentEditor() != null) {
                        k.u(DIRTY);
                        k.writeByte(32);
                        k.u(entry2.getKey());
                        k.writeByte(10);
                    } else {
                        k.u(CLEAN);
                        k.writeByte(32);
                        k.u(entry2.getKey());
                        entry2.writeLengths$okhttp(k);
                        k.writeByte(10);
                    }
                }
                try {
                    k.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    k.close();
                } catch (Throwable th4) {
                    qo.g(th3, th4);
                }
                th = th3;
            }
            if (th == null) {
                boolean exists = this.fileSystem.exists(this.journalFile);
                n90 n90Var = this.fileSystem;
                if (exists) {
                    n90Var.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileBackup);
                } else {
                    n90Var.atomicMove(this.journalFileTmp, this.journalFile);
                }
                ok okVar2 = this.journalWriter;
                if (okVar2 != null) {
                    _UtilCommonKt.closeQuietly(okVar2);
                }
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } else {
                throw th;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized boolean remove(String key) {
        key.getClass();
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        ok okVar;
        entry.getClass();
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (okVar = this.journalWriter) != null) {
                okVar.u(DIRTY);
                okVar.writeByte(32);
                okVar.u(entry.getKey());
                okVar.writeByte(10);
                okVar.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths()[i2];
            entry.getLengths()[i2] = 0;
        }
        this.redundantOpCount++;
        ok okVar2 = this.journalWriter;
        if (okVar2 != null) {
            okVar2.u(REMOVE);
            okVar2.writeByte(32);
            okVar2.u(entry.getKey());
            okVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final Editor edit(String str) {
        str.getClass();
        return edit$default(this, str, 0L, 2, null);
    }
}
