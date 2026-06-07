package okhttp3.internal.http2;

import defpackage.bl;
import defpackage.sn0;
import defpackage.xl1;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Lbl;", "name", "value", "<init>", "(Lbl;Lbl;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lbl;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lbl;", "component2", "copy", "(Lbl;Lbl;)Lokhttp3/internal/http2/Header;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbl;", "hpackSize", "I", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class Header {
    public static final bl PSEUDO_PREFIX;
    public static final bl RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final bl TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final bl TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final bl TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final bl TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final bl name;
    public final bl value;

    static {
        bl blVar = bl.h;
        PSEUDO_PREFIX = xl1.p(":");
        RESPONSE_STATUS = xl1.p(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = xl1.p(TARGET_METHOD_UTF8);
        TARGET_PATH = xl1.p(TARGET_PATH_UTF8);
        TARGET_SCHEME = xl1.p(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = xl1.p(TARGET_AUTHORITY_UTF8);
    }

    public Header(bl blVar, bl blVar2) {
        blVar.getClass();
        blVar2.getClass();
        this.name = blVar;
        this.value = blVar2;
        this.hpackSize = blVar2.d() + blVar.d() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, bl blVar, bl blVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            blVar = header.name;
        }
        if ((i & 2) != 0) {
            blVar2 = header.value;
        }
        return header.copy(blVar, blVar2);
    }

    /* renamed from: component1, reason: from getter */
    public final bl getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final bl getValue() {
        return this.value;
    }

    public final Header copy(bl name, bl value) {
        name.getClass();
        value.getClass();
        return new Header(name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        if (sn0.r(this.name, header.name) && sn0.r(this.value, header.value)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.r() + ": " + this.value.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(xl1.p(str), xl1.p(str2));
        str.getClass();
        str2.getClass();
        bl blVar = bl.h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(bl blVar, String str) {
        this(blVar, xl1.p(str));
        blVar.getClass();
        str.getClass();
        bl blVar2 = bl.h;
    }
}
