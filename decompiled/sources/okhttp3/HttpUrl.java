package okhttp3;

import defpackage.f00;
import defpackage.go;
import defpackage.i32;
import defpackage.l60;
import defpackage.l90;
import defpackage.p32;
import defpackage.p60;
import defpackage.se;
import defpackage.sn0;
import defpackage.vn;
import defpackage.xn;
import defpackage.ym0;
import defpackage.yn;
import defpackage.yq1;
import defpackage.yx;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 K2\u00020\u0001:\u0002JKBc\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\rJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\b\u001aJ\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\u0003J\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\bJ\u0010\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010*\u001a\u00020\bJ\u0006\u0010-\u001a\u00020\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u00002\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u000201J\u0010\u00100\u001a\u0004\u0018\u0001012\u0006\u0010/\u001a\u00020\u0003J\u0013\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\b\u00106\u001a\u0004\u0018\u00010\u0003J\r\u0010\r\u001a\u00020\u0017H\u0007¢\u0006\u0002\b7J\r\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0002\b8J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b9J\r\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b:J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b;J\r\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0002\b<J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b=J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b?J\r\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0002\b@J\r\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0002\bAJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bBJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bCJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bDJ\u000f\u0010!\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bEJ\r\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0002\bFJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0007¢\u0006\u0002\bGJ\u000f\u0010,\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bHJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bIR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010 \u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&8G¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b,\u0010\u0010¨\u0006L"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "()I", "()Ljava/util/List;", "isHttps", "", "()Z", "toUrl", "Ljava/net/URL;", "toUri", "Ljava/net/URI;", "uri", "encodedUsername", "encodedPassword", "pathSize", "encodedPath", "encodedPathSegments", "encodedQuery", "query", "querySize", "queryParameter", "name", "queryParameterNames", "", "()Ljava/util/Set;", "queryParameterValues", "queryParameterName", "index", "queryParameterValue", "encodedFragment", "redact", "resolve", "link", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "equals", "other", "hashCode", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "-deprecated_encodedUsername", "-deprecated_username", "-deprecated_encodedPassword", "-deprecated_password", "-deprecated_host", "-deprecated_port", "-deprecated_pathSize", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_pathSegments", "-deprecated_encodedQuery", "-deprecated_query", "-deprecated_querySize", "-deprecated_queryParameterNames", "-deprecated_encodedFragment", "-deprecated_fragment", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class HttpUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    private HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }

    @f00
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m183deprecated_encodedFragment() {
        return encodedFragment();
    }

    @f00
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m184deprecated_encodedPassword() {
        return encodedPassword();
    }

    @f00
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m185deprecated_encodedPath() {
        return encodedPath();
    }

    @f00
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m186deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @f00
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m187deprecated_encodedQuery() {
        return encodedQuery();
    }

    @f00
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m188deprecated_encodedUsername() {
        return encodedUsername();
    }

    @f00
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @f00
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @f00
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @f00
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m192deprecated_pathSegments() {
        return this.pathSegments;
    }

    @f00
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m193deprecated_pathSize() {
        return pathSize();
    }

    @f00
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @f00
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m195deprecated_query() {
        return query();
    }

    @f00
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m196deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @f00
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m197deprecated_querySize() {
        return querySize();
    }

    @f00
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @f00
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m199deprecated_uri() {
        return uri();
    }

    @f00
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m200deprecated_url() {
        return url();
    }

    @f00
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(i32.K(this.url, '#', 0, 6) + 1);
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        return this.url.substring(i32.K(this.url, AbstractJsonLexerKt.COLON, this.scheme.length() + 3, 4) + 1, i32.K(this.url, '@', 0, 6));
    }

    public final String encodedPath() {
        int K = i32.K(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        return this.url.substring(K, _UtilCommonKt.delimiterOffset(str, "?#", K, str.length()));
    }

    public final List<String> encodedPathSegments() {
        int K = i32.K(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int delimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", K, str.length());
        ArrayList arrayList = new ArrayList();
        while (K < delimiterOffset) {
            int i = K + 1;
            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(this.url, '/', i, delimiterOffset);
            arrayList.add(this.url.substring(i, delimiterOffset2));
            K = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int K = i32.K(this.url, '?', 0, 6) + 1;
        String str = this.url;
        return this.url.substring(K, _UtilCommonKt.delimiterOffset(str, '#', K, str.length()));
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(Object other) {
        if ((other instanceof HttpUrl) && sn0.r(((HttpUrl) other).url, this.url)) {
            return true;
        }
        return false;
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return sn0.r(this.scheme, "https");
    }

    public final Builder newBuilder() {
        int i;
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        if (this.port != INSTANCE.defaultPort(this.scheme)) {
            i = this.port;
        } else {
            i = -1;
        }
        builder.setPort$okhttp(i);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.toQueryString(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String name) {
        name.getClass();
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            ym0 T = go.T(go.X(0, list.size()), 2);
            int i = T.e;
            int i2 = T.f;
            int i3 = T.g;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (!name.equals(this.queryNamesAndValues.get(i))) {
                    if (i != i2) {
                        i += i3;
                    } else {
                        return null;
                    }
                }
                return this.queryNamesAndValues.get(i + 1);
            }
            return null;
        }
        return null;
    }

    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(index * 2);
            str.getClass();
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return p60.e;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        ym0 T = go.T(go.X(0, this.queryNamesAndValues.size()), 2);
        int i = T.e;
        int i2 = T.f;
        int i3 = T.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                str.getClass();
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        name.getClass();
        if (this.queryNamesAndValues == null) {
            return l60.e;
        }
        ArrayList arrayList = new ArrayList(4);
        ym0 T = go.T(go.X(0, this.queryNamesAndValues.size()), 2);
        int i = T.e;
        int i2 = T.f;
        int i3 = T.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (name.equals(this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        newBuilder.getClass();
        return newBuilder.username("").password("").build().getUrl();
    }

    public final HttpUrl resolve(String link) {
        link.getClass();
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (_HostnamesCommonKt.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile.getClass();
                builder.getClass();
                String replaceAll = compile.matcher(builder).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u0017J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0018H\u0007¢\u0006\u0004\b\u0011\u0010\u0019J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u0012J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0017J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "Lod2;", "toQueryString", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "scheme", "", "defaultPort", "(Ljava/lang/String;)I", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void toQueryString(List<String> list, StringBuilder sb) {
            ym0 T = go.T(go.X(0, list.size()), 2);
            int i = T.e;
            int i2 = T.f;
            int i3 = T.g;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }

        @f00
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m202deprecated_get(String url) {
            url.getClass();
            return get(url);
        }

        @f00
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m205deprecated_parse(String url) {
            url.getClass();
            return parse(url);
        }

        public final int defaultPort(String scheme) {
            scheme.getClass();
            if (scheme.equals("http")) {
                return 80;
            }
            if (scheme.equals("https")) {
                return 443;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        @f00
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m204deprecated_get(URL url) {
            url.getClass();
            return get(url);
        }

        @f00
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m203deprecated_get(URI uri) {
            uri.getClass();
            return get(uri);
        }

        public final HttpUrl get(URL url) {
            url.getClass();
            String url2 = url.toString();
            url2.getClass();
            return parse(url2);
        }

        public final HttpUrl get(URI uri) {
            uri.getClass();
            String uri2 = uri.toString();
            uri2.getClass();
            return parse(uri2);
        }
    }

    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    public /* synthetic */ HttpUrl(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6, yx yxVar) {
        this(str, str2, str3, str4, i, list, list2, str5, str6);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0006J\u001d\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u0006J\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\"J\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010\"J\u001f\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\"J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0006J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010.\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103J!\u00108\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010/2\u0006\u00105\u001a\u00020\u0004H\u0000¢\u0006\u0004\b6\u00107J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b\u0012\u0010;J\u0017\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0002¢\u0006\u0004\b@\u0010AJ%\u0010F\u001a\u00020=*\b\u0012\u0004\u0012\u00020\u00040B2\n\u0010E\u001a\u00060Cj\u0002`DH\u0002¢\u0006\u0004\bF\u0010GJ'\u0010J\u001a\u00020=2\u0006\u00105\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0002¢\u0006\u0004\bJ\u0010KJ7\u0010N\u001a\u00020=2\u0006\u00105\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\f2\u0006\u0010I\u001a\u00020\f2\u0006\u0010M\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020=H\u0002¢\u0006\u0004\bP\u0010\u0003J\u0017\u0010Q\u001a\u0002092\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u0002092\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\bS\u0010RJ\u001b\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040T*\u00020\u0004H\u0002¢\u0006\u0004\bU\u0010VJ'\u0010W\u001a\u00020\f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0002¢\u0006\u0004\bW\u0010XJ#\u0010Y\u001a\u00020\f*\u00020\u00042\u0006\u0010L\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0002¢\u0006\u0004\bY\u0010XJ'\u0010Z\u001a\u00020\f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0002¢\u0006\u0004\bZ\u0010XJ'\u0010[\u001a\u00020\f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0002¢\u0006\u0004\b[\u0010XR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\\\u001a\u0004\b]\u00103\"\u0004\b^\u0010?R\"\u0010\b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\\\u001a\u0004\b_\u00103\"\u0004\b`\u0010?R\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\\\u001a\u0004\ba\u00103\"\u0004\bb\u0010?R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\\\u001a\u0004\bc\u00103\"\u0004\bd\u0010?R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010e\u001a\u0004\bf\u0010A\"\u0004\bg\u0010hR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010i\u001a\u0004\bj\u0010kR,\u0010l\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010i\u001a\u0004\bm\u0010k\"\u0004\bn\u0010oR$\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\\\u001a\u0004\bp\u00103\"\u0004\bq\u0010?¨\u0006r"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", "encodedUsername", "password", "encodedPassword", "host", "", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "", "alreadyEncoded", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "canonicalName", "Lod2;", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", "effectivePort", "()I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "startPos", "limit", "resolvePath", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "push", "(Ljava/lang/String;IIZZ)V", "pop", "isDot", "(Ljava/lang/String;)Z", "isDotDot", "", "toQueryNamesAndValues", "(Ljava/lang/String;)Ljava/util/List;", "schemeDelimiterOffset", "(Ljava/lang/String;II)I", "slashCount", "portColonOffset", "parsePort", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Builder {
        private String encodedFragment;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;
        private final List<String> encodedPathSegments = xn.G("");

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            boolean z;
            Builder builder;
            String str;
            boolean z2;
            int i = 0;
            while (true) {
                int delimiterOffset = _UtilCommonKt.delimiterOffset(pathSegments, "/\\", i, pathSegments.length());
                if (delimiterOffset < pathSegments.length()) {
                    z = true;
                    str = pathSegments;
                    z2 = alreadyEncoded;
                    builder = this;
                } else {
                    z = false;
                    builder = this;
                    str = pathSegments;
                    z2 = alreadyEncoded;
                }
                builder.push(str, i, delimiterOffset, z, z2);
                i = delimiterOffset + 1;
                if (i > str.length()) {
                    return builder;
                }
                this = builder;
                pathSegments = str;
                alreadyEncoded = z2;
            }
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            str.getClass();
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            if (sn0.r(input, ".") || p32.x(input, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean isDotDot(String input) {
            if (sn0.r(input, "..") || p32.x(input, "%2e.", true) || p32.x(input, ".%2e", true) || p32.x(input, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final int parsePort(String input, int pos, int limit) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(_UrlKt.canonicalize$default(input, pos, limit, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > parseInt || parseInt >= 65536) {
                return -1;
            }
            return parseInt;
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private final int portColonOffset(String input, int pos, int limit) {
            while (pos < limit) {
                char charAt = input.charAt(pos);
                if (charAt != ':') {
                    if (charAt != '[') {
                        pos++;
                    }
                    do {
                        pos++;
                        if (pos < limit) {
                        }
                        pos++;
                    } while (input.charAt(pos) != ']');
                    pos++;
                } else {
                    return pos;
                }
            }
            return limit;
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String canonicalize$default = _UrlKt.canonicalize$default(input, pos, limit, _UrlKt.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, 112, null);
            if (!isDot(canonicalize$default)) {
                if (isDotDot(canonicalize$default)) {
                    pop();
                    return;
                }
                int length = this.encodedPathSegments.get(r12.size() - 1).length();
                List<String> list = this.encodedPathSegments;
                if (length == 0) {
                    list.set(list.size() - 1, canonicalize$default);
                } else {
                    list.add(canonicalize$default);
                }
                if (addTrailingSlash) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int D = vn.D(size, 0, -2);
            if (D > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (sn0.r(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    list3.getClass();
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    list4.getClass();
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    list5.getClass();
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != D) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            boolean z;
            if (startPos != limit) {
                char charAt = input.charAt(startPos);
                if (charAt != '/' && charAt != '\\') {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                } else {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    startPos++;
                }
                int i = startPos;
                while (i < limit) {
                    int delimiterOffset = _UtilCommonKt.delimiterOffset(input, "/\\", i, limit);
                    if (delimiterOffset < limit) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Builder builder = this;
                    String str = input;
                    builder.push(str, i, delimiterOffset, z, true);
                    if (z) {
                        i = delimiterOffset + 1;
                        this = builder;
                        input = str;
                    } else {
                        this = builder;
                        input = str;
                        i = delimiterOffset;
                    }
                }
            }
        }

        private final int schemeDelimiterOffset(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char charAt = input.charAt(pos);
            if ((sn0.B(charAt, 97) >= 0 && sn0.B(charAt, 122) <= 0) || (sn0.B(charAt, 65) >= 0 && sn0.B(charAt, 90) <= 0)) {
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        break;
                    }
                    char charAt2 = input.charAt(pos);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return pos;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final int slashCount(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '/' && charAt != '\\') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private final void toPathString(List<String> list, StringBuilder sb) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        private final List<String> toQueryNamesAndValues(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int K = i32.K(str, '&', i, 4);
                if (K == -1) {
                    K = str.length();
                }
                int K2 = i32.K(str, '=', i, 4);
                if (K2 != -1 && K2 <= K) {
                    arrayList.add(str.substring(i, K2));
                    arrayList.add(str.substring(K2 + 1, K));
                } else {
                    arrayList.add(str.substring(i, K));
                    arrayList.add(null);
                }
                i = K + 1;
            }
            return arrayList;
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            encodedPathSegment.getClass();
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            encodedPathSegments.getClass();
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
            String str;
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            list.add(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            if (encodedValue != null) {
                str = _UrlKt.canonicalize$default(encodedValue, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            pathSegment.getClass();
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addQueryParameter(String name, String value) {
            String str;
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            list.add(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            if (value != null) {
                str = _UrlKt.canonicalize$default(value, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str;
            String str2 = this.scheme;
            if (str2 != null) {
                String percentDecode$default = _UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$default2 = _UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
                String str3 = this.host;
                if (str3 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    String str4 = null;
                    ArrayList arrayList2 = new ArrayList(yn.a0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(_UrlKt.percentDecode$default((String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList(yn.a0(list2, 10));
                        for (String str5 : list2) {
                            if (str5 != null) {
                                str = _UrlKt.percentDecode$default(str5, 0, 0, true, 3, null);
                            } else {
                                str = null;
                            }
                            arrayList3.add(str);
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str6 = this.encodedFragment;
                    if (str6 != null) {
                        str4 = _UrlKt.percentDecode$default(str6, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str2, percentDecode$default, percentDecode$default2, str3, effectivePort, arrayList2, arrayList, str4, toString(), null);
                }
                se.p("host == null");
                return null;
            }
            se.p("scheme == null");
            return null;
        }

        public final Builder encodedFragment(String encodedFragment) {
            String str;
            if (encodedFragment != null) {
                str = _UrlKt.canonicalize$default(encodedFragment, 0, 0, "", true, false, false, true, 51, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            encodedPassword.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            encodedPath.getClass();
            if (p32.D(encodedPath, "/", false)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            se.e("unexpected encodedPath: ".concat(encodedPath));
            return null;
        }

        public final Builder encodedQuery(String encodedQuery) {
            List<String> list;
            String canonicalize$default;
            if (encodedQuery != null && (canonicalize$default = _UrlKt.canonicalize$default(encodedQuery, 0, 0, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 83, null)) != null) {
                list = toQueryNamesAndValues(canonicalize$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            encodedUsername.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder fragment(String fragment) {
            String str;
            if (fragment != null) {
                str = _UrlKt.canonicalize$default(fragment, 0, 0, "", false, false, false, true, 59, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final Builder host(String host) {
            host.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            se.h("unexpected host: ".concat(host));
            return null;
        }

        public final Builder parse$okhttp(HttpUrl base, String input) {
            String str;
            int delimiterOffset;
            char c;
            Builder builder;
            boolean z;
            int i;
            int i2;
            char c2;
            String str2 = input;
            str2.getClass();
            Builder builder2 = null;
            int indexOfFirstNonAsciiWhitespace$default = _UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = _UtilCommonKt.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            int schemeDelimiterOffset = schemeDelimiterOffset(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z2 = true;
            if (schemeDelimiterOffset != -1) {
                if (p32.C(str2, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (p32.C(str2, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, schemeDelimiterOffset) + '\'');
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                if (str2.length() > 6) {
                    str = i32.X(6, str2).concat("...");
                } else {
                    str = str2;
                }
                se.h("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str));
                return null;
            }
            int slashCount = slashCount(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '#';
            if (slashCount < 2 && base != null && sn0.r(base.scheme(), this.scheme)) {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
            } else {
                boolean z3 = false;
                boolean z4 = false;
                int i3 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = _UtilCommonKt.delimiterOffset(str2, "@/\\?#", i3, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = str2.charAt(delimiterOffset);
                    } else {
                        c = 65535;
                    }
                    if (c == 65535 || c == c3 || c == '/' || c == '\\' || c == '?') {
                        break;
                    }
                    if (c == '@') {
                        if (!z3) {
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(str2, AbstractJsonLexerKt.COLON, i3, delimiterOffset);
                            builder = builder2;
                            z = z2;
                            String canonicalize$default = _UrlKt.canonicalize$default(str2, i3, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z4) {
                                canonicalize$default = this.encodedUsername + "%40" + canonicalize$default;
                            }
                            this.encodedUsername = canonicalize$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i2 = delimiterOffset;
                                this.encodedPassword = _UrlKt.canonicalize$default(input, delimiterOffset2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z3 = z;
                            } else {
                                i2 = delimiterOffset;
                            }
                            str2 = input;
                            i = i2;
                            z4 = z;
                        } else {
                            builder = builder2;
                            z = z2;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.encodedPassword);
                            sb.append("%40");
                            str2 = input;
                            i = delimiterOffset;
                            sb.append(_UrlKt.canonicalize$default(str2, i3, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.encodedPassword = sb.toString();
                        }
                        i3 = i + 1;
                        z2 = z;
                        builder2 = builder;
                        c3 = '#';
                    }
                }
                Builder builder3 = builder2;
                int portColonOffset = portColonOffset(str2, i3, delimiterOffset);
                int i4 = portColonOffset + 1;
                if (i4 < delimiterOffset) {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str2, i3, portColonOffset, false, 4, null));
                    int parsePort = parsePort(str2, i4, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        se.i("Invalid URL port: \"", 34, str2.substring(i4, delimiterOffset));
                        return builder3;
                    }
                } else {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str2, i3, portColonOffset, false, 4, null));
                    Companion companion = HttpUrl.INSTANCE;
                    String str3 = this.scheme;
                    str3.getClass();
                    this.port = companion.defaultPort(str3);
                }
                if (this.host != null) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    se.i("Invalid URL host: \"", 34, str2.substring(i3, portColonOffset));
                    return builder3;
                }
            }
            int delimiterOffset3 = _UtilCommonKt.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && str2.charAt(delimiterOffset3) == '?') {
                c2 = '#';
                int delimiterOffset4 = _UtilCommonKt.delimiterOffset(str2, '#', delimiterOffset3, indexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = toQueryNamesAndValues(_UrlKt.canonicalize$default(str2, delimiterOffset3 + 1, delimiterOffset4, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 80, null));
                delimiterOffset3 = delimiterOffset4;
            } else {
                c2 = '#';
            }
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && str2.charAt(delimiterOffset3) == c2) {
                this.encodedFragment = _UrlKt.canonicalize$default(str2, delimiterOffset3 + 1, indexOfLastNonAsciiWhitespace$default, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final Builder password(String password) {
            password.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final Builder port(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            se.e(l90.g(port, "unexpected port: "));
            return null;
        }

        public final Builder query(String query) {
            List<String> list;
            String canonicalize$default;
            if (query != null && (canonicalize$default = _UrlKt.canonicalize$default(query, 0, 0, _UrlKt.QUERY_ENCODE_SET, false, false, true, false, 91, null)) != null) {
                list = toQueryNamesAndValues(canonicalize$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                Pattern compile = Pattern.compile("[\"<>^`{|}]");
                compile.getClass();
                str = compile.matcher(str3).replaceAll("");
                str.getClass();
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, _UrlKt.canonicalize$default(list.get(i), 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = _UrlKt.canonicalize$default(str5, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = _UrlKt.canonicalize$default(str6, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            return this;
        }

        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            scheme.getClass();
            if (scheme.equalsIgnoreCase("http")) {
                this.scheme = "http";
                return this;
            }
            if (scheme.equalsIgnoreCase("https")) {
                this.scheme = "https";
                return this;
            }
            se.h("unexpected scheme: ".concat(scheme));
            return null;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
            encodedPathSegment.getClass();
            String canonicalize$default = _UrlKt.canonicalize$default(encodedPathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 115, null);
            this.encodedPathSegments.set(index, canonicalize$default);
            if (!isDot(canonicalize$default) && !isDotDot(canonicalize$default)) {
                return this;
            }
            se.e("unexpected path segment: ".concat(encodedPathSegment));
            return null;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
            encodedName.getClass();
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int index, String pathSegment) {
            pathSegment.getClass();
            String canonicalize$default = _UrlKt.canonicalize$default(pathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, false, false, false, false, 123, null);
            if (!isDot(canonicalize$default) && !isDotDot(canonicalize$default)) {
                this.encodedPathSegments.set(index, canonicalize$default);
                return this;
            }
            se.e("unexpected path segment: ".concat(pathSegment));
            return null;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String name, String value) {
            name.getClass();
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (i32.H(str2, AbstractJsonLexerKt.COLON)) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.host);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.INSTANCE.defaultPort(str3)) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(effectivePort);
                }
            }
            toPathString(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                Companion companion = HttpUrl.INSTANCE;
                List<String> list = this.encodedQueryNamesAndValues;
                list.getClass();
                companion.toQueryString(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public final Builder username(String username) {
            username.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            pathSegments.getClass();
            return addPathSegments(pathSegments, false);
        }
    }

    public final Builder newBuilder(String link) {
        link.getClass();
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
