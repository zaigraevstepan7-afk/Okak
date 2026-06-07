package retrofit2;

import defpackage.hk;
import defpackage.l90;
import defpackage.ok;
import defpackage.se;
import defpackage.y61;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jsoup.helper.HttpConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final HttpUrl baseUrl;

    @Nullable
    private RequestBody body;

    @Nullable
    private MediaType contentType;

    @Nullable
    private FormBody.Builder formBuilder;
    private final boolean hasBody;
    private final Headers.Builder headersBuilder;
    private final String method;

    @Nullable
    private MultipartBody.Builder multipartBuilder;

    @Nullable
    private String relativeUrl;
    private final Request.Builder requestBuilder = new Request.Builder();

    @Nullable
    private HttpUrl.Builder urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ContentTypeOverridingRequestBody extends RequestBody {
        private final MediaType contentType;
        private final RequestBody delegate;

        public ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.delegate = requestBody;
            this.contentType = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public MediaType getContentType() {
            return this.contentType;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(ok okVar) {
            this.delegate.writeTo(okVar);
        }
    }

    public RequestBuilder(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        this.contentType = mediaType;
        this.hasBody = z;
        if (headers != null) {
            this.headersBuilder = headers.newBuilder();
        } else {
            this.headersBuilder = new Headers.Builder();
        }
        if (z2) {
            this.formBuilder = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.multipartBuilder = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hk] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static void canonicalizeForPath(hk hkVar, String str, int i, int i2, boolean z) {
        ?? r0 = 0;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    hkVar.Z(codePointAt);
                } else {
                    if (r0 == 0) {
                        r0 = new Object();
                    }
                    r0.Z(codePointAt);
                    while (!r0.j()) {
                        byte readByte = r0.readByte();
                        hkVar.Q(37);
                        char[] cArr = HEX_DIGITS;
                        hkVar.Q(cArr[((readByte & 255) >> 4) & 15]);
                        hkVar.Q(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
            r0 = r0;
        }
    }

    public void addFormField(String str, String str2, boolean z) {
        FormBody.Builder builder = this.formBuilder;
        if (z) {
            builder.addEncoded(str, str2);
        } else {
            builder.add(str, str2);
        }
    }

    public void addHeader(String str, String str2, boolean z) {
        if (HttpConnection.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.contentType = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(l90.l("Malformed content type: ", str2), e);
            }
        } else {
            Headers.Builder builder = this.headersBuilder;
            if (z) {
                builder.addUnsafeNonAscii(str, str2);
            } else {
                builder.add(str, str2);
            }
        }
    }

    public void addHeaders(Headers headers) {
        this.headersBuilder.addAll(headers);
    }

    public void addPart(Headers headers, RequestBody requestBody) {
        this.multipartBuilder.addPart(headers, requestBody);
    }

    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl != null) {
            String canonicalizeForPath = canonicalizeForPath(str2, z);
            String replace = this.relativeUrl.replace("{" + str + "}", canonicalizeForPath);
            if (!PATH_TRAVERSAL.matcher(replace).matches()) {
                this.relativeUrl = replace;
                return;
            } else {
                se.h(l90.l("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
                return;
            }
        }
        throw new AssertionError();
    }

    public void addQueryParam(String str, @Nullable String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.baseUrl.newBuilder(str3);
            this.urlBuilder = newBuilder;
            if (newBuilder != null) {
                this.relativeUrl = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                y61.t(sb, ", Relative: ", this.relativeUrl);
                return;
            }
        }
        HttpUrl.Builder builder = this.urlBuilder;
        if (z) {
            builder.addEncodedQueryParameter(str, str2);
        } else {
            builder.addQueryParameter(str, str2);
        }
    }

    public <T> void addTag(Class<T> cls, @Nullable T t) {
        this.requestBuilder.tag((Class<? super Class<T>>) cls, (Class<T>) t);
    }

    public Request.Builder get() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.urlBuilder;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.baseUrl.resolve(this.relativeUrl);
            if (resolve == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                y61.t(sb, ", Relative: ", this.relativeUrl);
                return null;
            }
        }
        RequestBody requestBody = this.body;
        if (requestBody == null) {
            FormBody.Builder builder2 = this.formBuilder;
            if (builder2 != null) {
                requestBody = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.multipartBuilder;
                if (builder3 != null) {
                    requestBody = builder3.build();
                } else if (this.hasBody) {
                    requestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.contentType;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new ContentTypeOverridingRequestBody(requestBody, mediaType);
            } else {
                this.headersBuilder.add(HttpConnection.CONTENT_TYPE, mediaType.toString());
            }
        }
        return this.requestBuilder.url(resolve).headers(this.headersBuilder.build()).method(this.method, requestBody);
    }

    public void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    public void addPart(MultipartBody.Part part) {
        this.multipartBuilder.addPart(part);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [hk, java.lang.Object] */
    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.X(0, i, str);
                canonicalizeForPath(obj, str, i, length, z);
                return obj.G();
            }
        }
        return str;
    }
}
