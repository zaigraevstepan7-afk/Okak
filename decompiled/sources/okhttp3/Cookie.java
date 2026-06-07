package okhttp3;

import defpackage.f00;
import defpackage.i32;
import defpackage.l60;
import defpackage.l90;
import defpackage.mb2;
import defpackage.p32;
import defpackage.se;
import defpackage.sn0;
import defpackage.yq1;
import defpackage.yx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0002)*B[\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001eJ\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001fJ\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b J\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b#J\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b$J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0006\u0010'\u001a\u00020(R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0011¨\u0006+"}, d2 = {"Lokhttp3/Cookie;", "", "name", "", "value", "expiresAt", "", "domain", "path", "secure", "", "httpOnly", "persistent", "hostOnly", "sameSite", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "()Ljava/lang/String;", "()J", "()Z", "matches", "url", "Lokhttp3/HttpUrl;", "equals", "other", "hashCode", "", "toString", "-deprecated_name", "-deprecated_value", "-deprecated_persistent", "-deprecated_expiresAt", "-deprecated_hostOnly", "-deprecated_domain", "-deprecated_path", "-deprecated_httpOnly", "-deprecated_secure", "forObsoleteRfc2965", "toString$okhttp", "newBuilder", "Lokhttp3/Cookie$Builder;", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final String sameSite;
    private final boolean secure;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
        this.sameSite = str5;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    @f00
    /* renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @f00
    /* renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @f00
    /* renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @f00
    /* renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @f00
    /* renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @f00
    /* renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    @f00
    /* renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @f00
    /* renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @f00
    /* renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object other) {
        if (other instanceof Cookie) {
            Cookie cookie = (Cookie) other;
            if (sn0.r(cookie.name, this.name) && sn0.r(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && sn0.r(cookie.domain, this.domain) && sn0.r(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && sn0.r(cookie.sameSite, this.sameSite)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        int i;
        int a = mb2.a(mb2.a(mb2.a(mb2.a(l90.d(l90.d(l90.e(this.expiresAt, l90.d(l90.d(527, 31, this.name), 31, this.value), 31), 31, this.domain), 31, this.path), 31, this.secure), 31, this.httpOnly), 31, this.persistent), 31, this.hostOnly);
        String str = this.sameSite;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return a + i;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        boolean domainMatch;
        url.getClass();
        if (!this.hostOnly) {
            domainMatch = INSTANCE.domainMatch(url.host(), this.domain);
        } else {
            domainMatch = sn0.r(url.host(), this.domain);
        }
        if (!domainMatch || !INSTANCE.pathMatch(url, this.path)) {
            return false;
        }
        if (this.secure && !url.isHttps()) {
            return false;
        }
        return true;
    }

    public final String name() {
        return this.name;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    /* renamed from: sameSite, reason: from getter */
    public final String getSameSite() {
        return this.sameSite;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DateFormattingKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        if (this.sameSite != null) {
            sb.append("; samesite=");
            sb.append(this.sameSite);
        }
        return sb.toString();
    }

    public final String value() {
        return this.value;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0007J'\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0018J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140$2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "domainMatch", "", "urlHost", "", "domain", "pathMatch", "url", "Lokhttp3/HttpUrl;", "path", "parse", "Lokhttp3/Cookie;", "setCookie", "currentTimeMillis", "", "parse$okhttp", "parseExpires", "s", "pos", "", "limit", "dateCharacterOffset", "input", "invert", "parseMaxAge", "parseDomain", "parseAll", "", "headers", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        private final int dateCharacterOffset(String input, int pos, int limit, boolean invert) {
            boolean z;
            while (pos < limit) {
                char charAt = input.charAt(pos);
                if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String urlHost, String domain) {
            if (sn0.r(urlHost, domain) || (p32.w(urlHost, domain, false) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !_HostnamesCommonKt.canParseAsIpAddress(urlHost))) {
                return true;
            }
            return false;
        }

        private final String parseDomain(String s) {
            if (!p32.w(s, ".", false)) {
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(i32.U(s, "."));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            se.h("Failed requirement.");
            return null;
        }

        private final long parseExpires(String s, int pos, int limit) {
            int dateCharacterOffset = dateCharacterOffset(s, pos, limit, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(s);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            while (dateCharacterOffset < limit) {
                int dateCharacterOffset2 = dateCharacterOffset(s, dateCharacterOffset + 1, limit, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i2 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    i2 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    i5 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    i6 = Integer.parseInt(group3);
                } else if (i3 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    group4.getClass();
                    i3 = Integer.parseInt(group4);
                } else if (i4 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    group5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = group5.toLowerCase(locale);
                    lowerCase.getClass();
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    pattern.getClass();
                    i4 = i32.L(pattern, lowerCase, 0, false, 6) / 4;
                } else if (i == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(s, dateCharacterOffset2 + 1, limit, false);
            }
            if (70 <= i && i < 100) {
                i += 1900;
            }
            if (i >= 0 && i < 70) {
                i += 2000;
            }
            if (i >= 1601) {
                if (i4 != -1) {
                    if (1 <= i3 && i3 < 32) {
                        if (i2 >= 0 && i2 < 24) {
                            if (i5 >= 0 && i5 < 60) {
                                if (i6 >= 0 && i6 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i);
                                    gregorianCalendar.set(2, i4 - 1);
                                    gregorianCalendar.set(5, i3);
                                    gregorianCalendar.set(11, i2);
                                    gregorianCalendar.set(12, i5);
                                    gregorianCalendar.set(13, i6);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                se.h("Failed requirement.");
                                return 0L;
                            }
                            se.h("Failed requirement.");
                            return 0L;
                        }
                        se.h("Failed requirement.");
                        return 0L;
                    }
                    se.h("Failed requirement.");
                    return 0L;
                }
                se.h("Failed requirement.");
                return 0L;
            }
            se.h("Failed requirement.");
            return 0L;
        }

        private final long parseMaxAge(String s) {
            try {
                long parseLong = Long.parseLong(s);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                Pattern compile = Pattern.compile("-?\\d+");
                compile.getClass();
                s.getClass();
                if (compile.matcher(s).matches()) {
                    if (p32.D(s, "-", false)) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl url, String path) {
            String encodedPath = url.encodedPath();
            if (!sn0.r(encodedPath, path)) {
                if (!p32.D(encodedPath, path, false) || (!p32.w(path, "/", false) && encodedPath.charAt(path.length()) != '/')) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            url.getClass();
            setCookie.getClass();
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie parse$okhttp(long currentTimeMillis, HttpUrl url, String setCookie) {
            long j;
            long j2;
            String str;
            String str2;
            url.getClass();
            setCookie.getClass();
            int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int delimiterOffset$default2 = _UtilCommonKt.delimiterOffset$default(setCookie, '=', 0, delimiterOffset$default, 2, (Object) null);
            String str3 = null;
            if (delimiterOffset$default2 != delimiterOffset$default) {
                String trimSubstring$default = _UtilCommonKt.trimSubstring$default(setCookie, 0, delimiterOffset$default2, 1, null);
                if (trimSubstring$default.length() != 0 && _UtilCommonKt.indexOfControlOrNonAscii(trimSubstring$default) == -1) {
                    String trimSubstring = _UtilCommonKt.trimSubstring(setCookie, delimiterOffset$default2 + 1, delimiterOffset$default);
                    if (_UtilCommonKt.indexOfControlOrNonAscii(trimSubstring) == -1) {
                        int i = delimiterOffset$default + 1;
                        int length = setCookie.length();
                        String str4 = null;
                        String str5 = null;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = true;
                        long j3 = -1;
                        long j4 = DateFormattingKt.MAX_DATE;
                        while (i < length) {
                            int delimiterOffset = _UtilCommonKt.delimiterOffset(setCookie, ';', i, length);
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(setCookie, '=', i, delimiterOffset);
                            String trimSubstring2 = _UtilCommonKt.trimSubstring(setCookie, i, delimiterOffset2);
                            if (delimiterOffset2 < delimiterOffset) {
                                str2 = _UtilCommonKt.trimSubstring(setCookie, delimiterOffset2 + 1, delimiterOffset);
                            } else {
                                str2 = "";
                            }
                            if (p32.x(trimSubstring2, "expires", true)) {
                                try {
                                    j4 = parseExpires(str2, 0, str2.length());
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (p32.x(trimSubstring2, "max-age", true)) {
                                j3 = parseMaxAge(str2);
                            } else {
                                if (p32.x(trimSubstring2, "domain", true)) {
                                    str4 = parseDomain(str2);
                                    z4 = false;
                                } else if (p32.x(trimSubstring2, "path", true)) {
                                    str3 = str2;
                                } else if (p32.x(trimSubstring2, "secure", true)) {
                                    z3 = true;
                                } else if (p32.x(trimSubstring2, "httponly", true)) {
                                    z = true;
                                } else if (p32.x(trimSubstring2, "samesite", true)) {
                                    str5 = str2;
                                }
                                i = delimiterOffset + 1;
                            }
                            z2 = true;
                            i = delimiterOffset + 1;
                        }
                        if (j3 == Long.MIN_VALUE) {
                            j = Long.MIN_VALUE;
                        } else if (j3 != -1) {
                            if (j3 <= 9223372036854775L) {
                                j2 = j3 * 1000;
                            } else {
                                j2 = Long.MAX_VALUE;
                            }
                            long j5 = currentTimeMillis + j2;
                            if (j5 >= currentTimeMillis && j5 <= DateFormattingKt.MAX_DATE) {
                                j = j5;
                            } else {
                                j = 253402300799999L;
                            }
                        } else {
                            j = j4;
                        }
                        String host = url.host();
                        if (str4 == null) {
                            str = host;
                        } else {
                            if (!domainMatch(host, str4)) {
                                return null;
                            }
                            str = str4;
                        }
                        if (host.length() != str.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str) == null) {
                            return null;
                        }
                        String str6 = "/";
                        if (str3 == null || !p32.D(str3, "/", false)) {
                            String encodedPath = url.encodedPath();
                            int P = i32.P(encodedPath, '/', 0, 6);
                            if (P != 0) {
                                str6 = encodedPath.substring(0, P);
                            }
                            str3 = str6;
                        }
                        return new Cookie(trimSubstring$default, trimSubstring, j, str, str3, z3, z, z2, z4, str5, null);
                    }
                }
            }
            return null;
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            url.getClass();
            headers.getClass();
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            List<Cookie> list = null;
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(url, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                list = Collections.unmodifiableList(arrayList);
                list.getClass();
            }
            if (list == null) {
                return l60.e;
            }
            return list;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "cookie", "Lokhttp3/Cookie;", "(Lokhttp3/Cookie;)V", "name", "", "value", "expiresAt", "", "domain", "path", "secure", "", "httpOnly", "persistent", "hostOnly", "sameSite", "hostOnlyDomain", "build", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Builder {
        private String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path;
        private boolean persistent;
        private String sameSite;
        private boolean secure;
        private String value;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Cookie cookie) {
            this();
            cookie.getClass();
            this.name = cookie.name();
            this.value = cookie.value();
            this.expiresAt = cookie.expiresAt();
            this.domain = cookie.domain();
            this.path = cookie.path();
            this.secure = cookie.secure();
            this.httpOnly = cookie.httpOnly();
            this.persistent = cookie.persistent();
            this.hostOnly = cookie.hostOnly();
            this.sameSite = cookie.getSameSite();
        }

        private final Builder domain(String domain, boolean hostOnly) {
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(domain);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = hostOnly;
                return this;
            }
            se.h(l90.l("unexpected domain: ", domain));
            return null;
        }

        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, this.sameSite, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        public final Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > DateFormattingKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            domain.getClass();
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            name.getClass();
            if (sn0.r(i32.Y(name).toString(), name)) {
                this.name = name;
                return this;
            }
            se.h("name is not trimmed");
            return null;
        }

        public final Builder path(String path) {
            path.getClass();
            if (p32.D(path, "/", false)) {
                this.path = path;
                return this;
            }
            se.h("path must start with '/'");
            return null;
        }

        public final Builder sameSite(String sameSite) {
            sameSite.getClass();
            if (sn0.r(i32.Y(sameSite).toString(), sameSite)) {
                this.sameSite = sameSite;
                return this;
            }
            se.h("sameSite is not trimmed");
            return null;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            value.getClass();
            if (sn0.r(i32.Y(value).toString(), value)) {
                this.value = value;
                return this;
            }
            se.h("value is not trimmed");
            return null;
        }

        public final Builder domain(String domain) {
            domain.getClass();
            return domain(domain, false);
        }

        public Builder() {
            this.expiresAt = DateFormattingKt.MAX_DATE;
            this.path = "/";
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, yx yxVar) {
        this(str, str2, j, str3, str4, z, z2, z3, z4, str5);
    }
}
