package okhttp3;

import defpackage.bl;
import defpackage.f00;
import defpackage.l90;
import defpackage.oe0;
import defpackage.pk;
import defpackage.qo;
import defpackage.se;
import defpackage.xd1;
import defpackage.y61;
import defpackage.yq1;
import defpackage.yx;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lpk;", "consumer", "", "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Loe0;Loe0;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lpk;", "", "bytes", "()[B", "Lbl;", "byteString", "()Lbl;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "Lod2;", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ResponseBody EMPTY;
    private Reader reader;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lpk;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lpk;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "Lod2;", "close", "()V", "Lpk;", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final pk source;

        public BomAwareReader(pk pkVar, Charset charset) {
            pkVar.getClass();
            charset.getClass();
            this.source = pkVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) {
            cbuf.getClass();
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.inputStream(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cbuf, off, len);
            }
            se.w("Stream closed");
            return 0;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, bl.h, (MediaType) null, 1, (Object) null);
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(get$contentType());
    }

    private final <T> T consumeSource(ResponseBody responseBody, oe0 oe0Var, oe0 oe0Var2) {
        Throwable th;
        T t;
        long j = responseBody.get$contentLength();
        if (j <= 2147483647L) {
            pk pkVar = responseBody.get$this_asResponseBody();
            try {
                t = (T) oe0Var.invoke(pkVar);
                if (pkVar != null) {
                    try {
                        pkVar.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (Throwable th3) {
                if (pkVar != null) {
                    try {
                        pkVar.close();
                    } catch (Throwable th4) {
                        qo.g(th3, th4);
                    }
                }
                th = th3;
                t = null;
            }
            if (th == null) {
                int intValue = ((Number) oe0Var2.invoke(t)).intValue();
                if (j == -1 || j == intValue) {
                    return t;
                }
                y61.d(intValue, j);
                return null;
            }
            throw th;
        }
        se.w(l90.k("Cannot buffer entire body for content length: ", j));
        return null;
    }

    public static final ResponseBody create(pk pkVar, MediaType mediaType, long j) {
        return INSTANCE.create(pkVar, mediaType, j);
    }

    public final InputStream byteStream() {
        return get$this_asResponseBody().inputStream();
    }

    public final bl byteString() {
        Throwable th;
        bl blVar;
        long j = get$contentLength();
        if (j <= 2147483647L) {
            pk pkVar = get$this_asResponseBody();
            try {
                blVar = pkVar.z();
                try {
                    pkVar.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (pkVar != null) {
                    try {
                        pkVar.close();
                    } catch (Throwable th4) {
                        qo.g(th3, th4);
                    }
                }
                th = th3;
                blVar = null;
            }
            if (th == null) {
                int d = blVar.d();
                if (j != -1 && j != d) {
                    y61.d(d, j);
                    return null;
                }
                return blVar;
            }
            throw th;
        }
        se.w(l90.k("Cannot buffer entire body for content length: ", j));
        return null;
    }

    public final byte[] bytes() {
        Throwable th;
        byte[] bArr;
        long j = get$contentLength();
        if (j <= 2147483647L) {
            pk pkVar = get$this_asResponseBody();
            try {
                bArr = pkVar.h();
                try {
                    pkVar.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (pkVar != null) {
                    try {
                        pkVar.close();
                    } catch (Throwable th4) {
                        qo.g(th3, th4);
                    }
                }
                th = th3;
                bArr = null;
            }
            if (th == null) {
                int length = bArr.length;
                if (j != -1 && j != length) {
                    y61.d(length, j);
                    return null;
                }
                return bArr;
            }
            throw th;
        }
        se.w(l90.k("Cannot buffer entire body for content length: ", j));
        return null;
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.closeQuietly(get$this_asResponseBody());
    }

    /* renamed from: contentLength */
    public abstract long get$contentLength();

    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    /* renamed from: source */
    public abstract pk get$this_asResponseBody();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final String string() {
        pk pkVar = get$this_asResponseBody();
        String th = null;
        try {
            String x = pkVar.x(_UtilJvmKt.readBomAsCharset(pkVar, charset()));
            try {
                pkVar.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = x;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (pkVar != null) {
                try {
                    pkVar.close();
                } catch (Throwable th4) {
                    qo.g(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lbl;", "(Lbl;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lpk;", "", "contentLength", "(Lpk;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lbl;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLpk;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, pk pkVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(pkVar, mediaType, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [hk, java.lang.Object, pk] */
        public final ResponseBody create(String str, MediaType mediaType) {
            str.getClass();
            xd1 chooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.e;
            MediaType mediaType2 = (MediaType) chooseCharset.f;
            ?? obj = new Object();
            charset.getClass();
            obj.W(str, 0, str.length(), charset);
            return create((pk) obj, mediaType2, obj.f);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, bl blVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(blVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [hk, java.lang.Object, pk] */
        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            ?? obj = new Object();
            obj.m79write(bArr, 0, bArr.length);
            return create((pk) obj, mediaType, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [hk, java.lang.Object, pk] */
        public final ResponseBody create(bl blVar, MediaType mediaType) {
            blVar.getClass();
            ?? obj = new Object();
            obj.P(blVar);
            return create((pk) obj, mediaType, blVar.d());
        }

        public final ResponseBody create(final pk pkVar, final MediaType mediaType, final long j) {
            pkVar.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: source, reason: from getter */
                public pk get$this_asResponseBody() {
                    return pkVar;
                }
            };
        }

        @f00
        public final ResponseBody create(MediaType contentType, String content) {
            content.getClass();
            return create(content, contentType);
        }

        @f00
        public final ResponseBody create(MediaType contentType, byte[] content) {
            content.getClass();
            return create(content, contentType);
        }

        @f00
        public final ResponseBody create(MediaType contentType, bl content) {
            content.getClass();
            return create(content, contentType);
        }

        @f00
        public final ResponseBody create(MediaType contentType, long contentLength, pk content) {
            content.getClass();
            return create(content, contentType, contentLength);
        }
    }

    public static final ResponseBody create(bl blVar, MediaType mediaType) {
        return INSTANCE.create(blVar, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @f00
    public static final ResponseBody create(MediaType mediaType, long j, pk pkVar) {
        return INSTANCE.create(mediaType, j, pkVar);
    }

    @f00
    public static final ResponseBody create(MediaType mediaType, bl blVar) {
        return INSTANCE.create(mediaType, blVar);
    }

    @f00
    public static final ResponseBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @f00
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
