package org.jsoup.helper;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
final class UrlBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String unsafeCharacters = "<>\"{}|\\^[]`";
    StringBuilder q;
    URL u;

    public UrlBuilder(URL url) {
        this.u = url;
        if (url.getQuery() != null) {
            StringBuilder borrowBuilder = StringUtil.borrowBuilder();
            borrowBuilder.append(this.u.getQuery());
            this.q = borrowBuilder;
        }
    }

    private static void appendToAscii(String str, boolean z, StringBuilder sb) {
        Object obj;
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 32) {
                if (z) {
                    obj = '+';
                } else {
                    obj = "%20";
                }
                sb.append(obj);
            } else if (codePointAt == 37) {
                if (i < str.length() - 2) {
                    int i2 = i + 1;
                    if (isHex(str.charAt(i2))) {
                        int i3 = i + 2;
                        if (isHex(str.charAt(i3))) {
                            sb.append('%');
                            sb.append(str.charAt(i2));
                            sb.append(str.charAt(i3));
                            i = i3;
                        }
                    }
                }
                sb.append("%25");
            } else if (codePointAt <= 127 && unsafeCharacters.indexOf(codePointAt) == -1) {
                sb.append((char) codePointAt);
            } else {
                sb.append(URLEncoder.encode(new String(Character.toChars(codePointAt)), DataUtil.UTF_8.name()));
                if (Character.charCount(codePointAt) == 2) {
                    i++;
                }
            }
            i++;
        }
    }

    private static String decodePart(String str) {
        try {
            return URLDecoder.decode(str, DataUtil.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isHex(char c) {
        if (c < '0' || c > '9') {
            if (c < 'A' || c > 'F') {
                if (c >= 'a' && c <= 'f') {
                    return true;
                }
                return $assertionsDisabled;
            }
            return true;
        }
        return true;
    }

    public void appendKeyVal(Connection.KeyVal keyVal) {
        StringBuilder sb = this.q;
        if (sb == null) {
            this.q = StringUtil.borrowBuilder();
        } else {
            sb.append('&');
        }
        StringBuilder sb2 = this.q;
        String key = keyVal.key();
        Charset charset = DataUtil.UTF_8;
        sb2.append(URLEncoder.encode(key, charset.name()));
        sb2.append('=');
        sb2.append(URLEncoder.encode(keyVal.value(), charset.name()));
    }

    public URL build() {
        try {
            URI uri = new URI(this.u.getProtocol(), this.u.getUserInfo(), IDN.toASCII(decodePart(this.u.getHost())), this.u.getPort(), null, null, null);
            StringBuilder borrowBuilder = StringUtil.borrowBuilder();
            borrowBuilder.append(uri.toASCIIString());
            appendToAscii(this.u.getPath(), $assertionsDisabled, borrowBuilder);
            if (this.q != null) {
                borrowBuilder.append('?');
                appendToAscii(StringUtil.releaseBuilder(this.q), true, borrowBuilder);
            }
            if (this.u.getRef() != null) {
                borrowBuilder.append('#');
                appendToAscii(this.u.getRef(), $assertionsDisabled, borrowBuilder);
            }
            URL url = new URL(StringUtil.releaseBuilder(borrowBuilder));
            this.u = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return this.u;
        }
    }
}
