package okhttp3;

import defpackage.am1;
import defpackage.f00;
import defpackage.mp0;
import defpackage.p32;
import defpackage.q4;
import defpackage.se;
import defpackage.sn0;
import defpackage.uz0;
import defpackage.vn;
import defpackage.vz0;
import defpackage.wz0;
import defpackage.yq1;
import defpackage.yx;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001b"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getMediaType$okhttp", "()Ljava/lang/String;", "[Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "parameter", "name", "-deprecated_type", "-deprecated_subtype", "toString", "equals", "", "other", "hashCode", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final am1 TYPE_SUBTYPE = new am1("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final am1 PARAMETER = new am1(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public MediaType(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        strArr.getClass();
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return INSTANCE.get(str);
    }

    public static final MediaType parse(String str) {
        return INSTANCE.parse(str);
    }

    @f00
    /* renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @f00
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final String getType() {
        return this.type;
    }

    public final Charset charset(Charset defaultValue) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public boolean equals(Object other) {
        if ((other instanceof MediaType) && sn0.r(((MediaType) other).mediaType, this.mediaType)) {
            return true;
        }
        return false;
    }

    /* renamed from: getMediaType$okhttp, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String name) {
        name.getClass();
        int i = 0;
        int D = vn.D(0, this.parameterNamesAndValues.length - 1, 2);
        if (D >= 0) {
            while (!p32.x(this.parameterNamesAndValues[i], name, true)) {
                if (i != D) {
                    i += 2;
                } else {
                    return null;
                }
            }
            return this.parameterNamesAndValues[i + 1];
        }
        return null;
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "get", "(Ljava/lang/String;)Lokhttp3/MediaType;", "toMediaType", "parse", "toMediaTypeOrNull", "mediaType", "-deprecated_get", "-deprecated_parse", "TOKEN", "Ljava/lang/String;", "QUOTED", "Lam1;", "TYPE_SUBTYPE", "Lam1;", "PARAMETER", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        @f00
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m208deprecated_get(String mediaType) {
            mediaType.getClass();
            return get(mediaType);
        }

        @f00
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m209deprecated_parse(String mediaType) {
            mediaType.getClass();
            return parse(mediaType);
        }

        public final MediaType get(String str) {
            String str2;
            str.getClass();
            q4 b = MediaType.TYPE_SUBTYPE.b(0, str);
            if (b != null) {
                String str3 = (String) ((vz0) b.k()).get(1);
                Locale locale = Locale.ROOT;
                String lowerCase = str3.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((String) ((vz0) b.k()).get(2)).toLowerCase(locale);
                lowerCase2.getClass();
                ArrayList arrayList = new ArrayList();
                int i = b.l().f;
                while (true) {
                    int i2 = i + 1;
                    if (i2 < str.length()) {
                        q4 b2 = MediaType.PARAMETER.b(i2, str);
                        String str4 = null;
                        if (b2 != null) {
                            wz0 wz0Var = (wz0) b2.h;
                            uz0 b3 = wz0Var.b(1);
                            if (b3 != null) {
                                str2 = b3.a;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                i = b2.l().f;
                            } else {
                                uz0 b4 = wz0Var.b(2);
                                if (b4 != null) {
                                    str4 = b4.a;
                                }
                                if (str4 == null) {
                                    uz0 b5 = wz0Var.b(3);
                                    b5.getClass();
                                    str4 = b5.a;
                                } else if (str4.length() > 0 && mp0.p(str4.charAt(0), '\'', false) && str4.length() > 0 && mp0.p(str4.charAt(str4.length() - 1), '\'', false) && str4.length() > 2) {
                                    str4 = str4.substring(1, str4.length() - 1);
                                }
                                arrayList.add(str2);
                                arrayList.add(str4);
                                i = b2.l().f;
                            }
                        } else {
                            se.q("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                            return null;
                        }
                    } else {
                        return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                    }
                }
            } else {
                throw new IllegalArgumentException("No subtype found for: \"" + str + AbstractJsonLexerKt.STRING);
            }
        }

        public final MediaType parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }
}
