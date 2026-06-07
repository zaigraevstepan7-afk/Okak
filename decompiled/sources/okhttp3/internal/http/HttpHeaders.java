package okhttp3.internal.http;

import defpackage.bl;
import defpackage.f00;
import defpackage.hk;
import defpackage.se;
import defpackage.sm;
import defpackage.sn0;
import defpackage.xl1;
import defpackage.yq1;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lhk;", "", "result", "Lod2;", "readChallengeHeader", "(Lhk;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lhk;)Z", "", "prefix", "startsWith", "(Lhk;B)Z", "readQuotedString", "(Lhk;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lbl;", "QUOTED_STRING_DELIMITERS", "Lbl;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class HttpHeaders {
    private static final bl QUOTED_STRING_DELIMITERS;
    private static final bl TOKEN_DELIMITERS;

    static {
        bl blVar = bl.h;
        QUOTED_STRING_DELIMITERS = xl1.p("\"\\");
        TOKEN_DELIMITERS = xl1.p("\t ,=");
    }

    @f00
    public static final boolean hasBody(Response response) {
        response.getClass();
        return promisesBody(response);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [hk, java.lang.Object] */
    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                ?? obj = new Object();
                obj.Y(headers.value(i));
                try {
                    readChallengeHeader(obj, arrayList);
                } catch (EOFException e) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        response.getClass();
        if (sn0.r(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && _UtilJvmKt.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(defpackage.hk r7, java.util.List<okhttp3.Challenge> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb6
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.j()
            if (r7 != 0) goto L21
            goto Lb6
        L21:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            m60 r0 = defpackage.m60.e
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L65
            if (r6 != 0) goto L40
            boolean r2 = r7.j()
            if (r2 == 0) goto L65
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = defpackage.p32.A(r5, r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r3.getClass()
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L65:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            int r6 = r6 + r5
        L6f:
            if (r3 != 0) goto L80
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb9
            int r5 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            r6 = r5
        L80:
            if (r6 == 0) goto Lb9
            r5 = 1
            if (r6 <= r5) goto L86
            goto Lb6
        L86:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8d
            goto Lb6
        L8d:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L9a
            java.lang.String r5 = readQuotedString(r7)
            goto L9e
        L9a:
            java.lang.String r5 = readToken(r7)
        L9e:
            if (r5 != 0) goto La1
            goto Lb6
        La1:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Laa
            goto Lb6
        Laa:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb7
            boolean r3 = r7.j()
            if (r3 != 0) goto Lb7
        Lb6:
            return
        Lb7:
            r3 = r0
            goto L6f
        Lb9:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(hk, java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hk, java.lang.Object] */
    private static final String readQuotedString(hk hkVar) {
        if (hkVar.readByte() == 34) {
            ?? obj = new Object();
            while (true) {
                long p = hkVar.p(QUOTED_STRING_DELIMITERS);
                if (p == -1) {
                    return null;
                }
                if (hkVar.k(p) == 34) {
                    obj.write(hkVar, p);
                    hkVar.readByte();
                    return obj.G();
                }
                if (hkVar.f == p + 1) {
                    return null;
                }
                obj.write(hkVar, p);
                hkVar.readByte();
                obj.write(hkVar, 1L);
            }
        } else {
            se.h("Failed requirement.");
            return null;
        }
    }

    private static final String readToken(hk hkVar) {
        long p = hkVar.p(TOKEN_DELIMITERS);
        if (p == -1) {
            p = hkVar.f;
        }
        if (p != 0) {
            return hkVar.D(p, sm.a);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.INSTANCE.parseAll(httpUrl, headers);
            if (parseAll.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(httpUrl, parseAll);
        }
    }

    private static final boolean skipCommasAndWhitespace(hk hkVar) {
        boolean z = false;
        while (!hkVar.j()) {
            byte k = hkVar.k(0L);
            if (k == 44) {
                hkVar.readByte();
                z = true;
            } else {
                if (k != 32 && k != 9) {
                    break;
                }
                hkVar.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(hk hkVar, byte b) {
        if (!hkVar.j() && hkVar.k(0L) == b) {
            return true;
        }
        return false;
    }
}
