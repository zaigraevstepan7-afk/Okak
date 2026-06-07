package okhttp3;

import defpackage.bl;
import defpackage.f00;
import defpackage.hk;
import defpackage.ok;
import defpackage.se;
import defpackage.sn0;
import defpackage.xl1;
import defpackage.y61;
import defpackage.yq1;
import defpackage.yx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal._UtilJvmKt;
import org.jsoup.helper.HttpConnection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0003./-B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b\u0005\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010#R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010!\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b!\u0010 ¨\u00060"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lbl;", "boundaryByteString", "Lokhttp3/MediaType;", "type", "", "Lokhttp3/MultipartBody$Part;", "parts", "<init>", "(Lbl;Lokhttp3/MediaType;Ljava/util/List;)V", "Lok;", "sink", "", "countBytes", "", "writeOrCountBytes", "(Lok;Z)J", "", "index", "part", "(I)Lokhttp3/MultipartBody$Part;", "isOneShot", "()Z", "contentType", "()Lokhttp3/MediaType;", "-deprecated_type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "-deprecated_parts", "()Ljava/util/List;", "contentLength", "()J", "Lod2;", "writeTo", "(Lok;)V", "Lbl;", "Lokhttp3/MediaType;", "Ljava/util/List;", "J", "Companion", "Part", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final bl boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get(HttpConnection.MULTIPART_FORM_DATA);
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(bl blVar, MediaType mediaType, List<Part> list) {
        blVar.getClass();
        mediaType.getClass();
        list.getClass();
        this.boundaryByteString = blVar;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.INSTANCE.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(ok sink, boolean countBytes) {
        hk hkVar;
        ok okVar;
        if (countBytes) {
            Object obj = new Object();
            hkVar = obj;
            okVar = obj;
        } else {
            hkVar = null;
            okVar = sink;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody body = part.body();
            okVar.getClass();
            okVar.write(DASHDASH);
            okVar.w(this.boundaryByteString);
            okVar.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    okVar.u(headers.name(i2)).write(COLONSPACE).u(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType = body.getContentType();
            if (contentType != null) {
                okVar.u("Content-Type: ").u(contentType.toString()).write(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength == -1 && countBytes) {
                hkVar.getClass();
                hkVar.b();
                return -1L;
            }
            byte[] bArr = CRLF;
            okVar.write(bArr);
            if (countBytes) {
                j += contentLength;
            } else {
                body.writeTo(okVar);
            }
            okVar.write(bArr);
        }
        okVar.getClass();
        byte[] bArr2 = DASHDASH;
        okVar.write(bArr2);
        okVar.w(this.boundaryByteString);
        okVar.write(bArr2);
        okVar.write(CRLF);
        if (countBytes) {
            hkVar.getClass();
            long j2 = j + hkVar.f;
            hkVar.b();
            return j2;
        }
        return j;
    }

    @f00
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m210deprecated_boundary() {
        return boundary();
    }

    @f00
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m211deprecated_parts() {
        return this.parts;
    }

    @f00
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m212deprecated_size() {
        return size();
    }

    @f00
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final MediaType getType() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.r();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        long j = this.contentLength;
        if (j == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public MediaType getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        List<Part> list = this.parts;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).body().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    public final Part part(int index) {
        return this.parts.get(index);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(ok sink) {
        sink.getClass();
        writeOrCountBytes(sink, false);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/Headers;", "()Lokhttp3/RequestBody;", "-deprecated_headers", "-deprecated_body", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Part {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return INSTANCE.create(headers, requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return INSTANCE.createFormData(str, str2);
        }

        @f00
        /* renamed from: -deprecated_body, reason: not valid java name and from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @f00
        /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "create", "Lokhttp3/MultipartBody$Part;", "body", "Lokhttp3/RequestBody;", "headers", "Lokhttp3/Headers;", "createFormData", "name", "", "value", "filename", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final Part create(Headers headers, RequestBody body) {
                String str;
                String str2;
                body.getClass();
                yx yxVar = null;
                if (headers != null) {
                    str = headers.get(HttpConnection.CONTENT_TYPE);
                } else {
                    str = null;
                }
                if (str == null) {
                    if (headers != null) {
                        str2 = headers.get("Content-Length");
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        return new Part(headers, body, yxVar);
                    }
                    se.h("Unexpected header: Content-Length");
                    return null;
                }
                se.h("Unexpected header: Content-Type");
                return null;
            }

            public final Part createFormData(String name, String filename, RequestBody body) {
                name.getClass();
                body.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.INSTANCE;
                companion.appendQuotedString$okhttp(sb, name);
                if (filename != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, filename);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), body);
            }

            private Companion() {
            }

            public final Part create(RequestBody body) {
                body.getClass();
                return create(null, body);
            }

            public final Part createFormData(String name, String value) {
                name.getClass();
                value.getClass();
                return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.INSTANCE, value, (MediaType) null, 1, (Object) null));
            }
        }

        public static final Part create(RequestBody requestBody) {
            return INSTANCE.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return INSTANCE.createFormData(str, str2, requestBody);
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, yx yxVar) {
            this(headers, requestBody);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lod2;", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "MIXED", "Lokhttp3/MediaType;", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            sb.getClass();
            str.getClass();
            sb.append(AbstractJsonLexerKt.STRING);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\n') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            sb.append(charAt);
                        } else {
                            sb.append("%22");
                        }
                    } else {
                        sb.append("%0D");
                    }
                } else {
                    sb.append("%0A");
                }
            }
            sb.append(AbstractJsonLexerKt.STRING);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0016J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\f\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/MediaType;", "type", "setType", "(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/RequestBody;", "body", "addPart", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "name", "value", "addFormDataPart", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody$Part;", "part", "(Lokhttp3/MultipartBody$Part;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", "build", "()Lokhttp3/MultipartBody;", "Lbl;", "Lbl;", "Lokhttp3/MediaType;", "", "parts", "Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Builder {
        private final bl boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder(String str) {
            str.getClass();
            bl blVar = bl.h;
            this.boundary = xl1.p(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String name, String value) {
            name.getClass();
            value.getClass();
            addPart(Part.INSTANCE.createFormData(name, value));
            return this;
        }

        public final Builder addPart(RequestBody body) {
            body.getClass();
            addPart(Part.INSTANCE.create(body));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, _UtilJvmKt.toImmutableList(this.parts));
            }
            se.p("Multipart body must have at least one part.");
            return null;
        }

        public final Builder setType(MediaType type) {
            type.getClass();
            if (sn0.r(type.type(), "multipart")) {
                this.type = type;
                return this;
            }
            y61.q(type, "multipart != ");
            return null;
        }

        public final Builder addPart(Headers headers, RequestBody body) {
            body.getClass();
            addPart(Part.INSTANCE.create(headers, body));
            return this;
        }

        public final Builder addPart(Part part) {
            part.getClass();
            this.parts.add(part);
            return this;
        }

        public final Builder addFormDataPart(String name, String filename, RequestBody body) {
            name.getClass();
            body.getClass();
            addPart(Part.INSTANCE.createFormData(name, filename, body));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, defpackage.yx r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto Lf
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                r1.getClass()
            Lf:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, yx):void");
        }
    }
}
