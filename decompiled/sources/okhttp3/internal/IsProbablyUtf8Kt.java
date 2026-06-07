package okhttp3.internal;

import defpackage.bl1;
import defpackage.hk;
import defpackage.pk;
import defpackage.yq1;
import java.io.EOFException;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpk;", "", "codePointLimit", "", "isProbablyUtf8", "(Lpk;J)Z", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class IsProbablyUtf8Kt {
    public static final boolean isProbablyUtf8(pk pkVar, long j) {
        pkVar.getClass();
        try {
            bl1 peek = pkVar.peek();
            for (long j2 = 0; j2 < j; j2++) {
                if (!peek.j()) {
                    peek.K(1L);
                    hk hkVar = peek.f;
                    byte k = hkVar.k(0L);
                    if ((k & 224) == 192) {
                        peek.K(2L);
                    } else if ((k & 240) == 224) {
                        peek.K(3L);
                    } else if ((k & 248) == 240) {
                        peek.K(4L);
                    }
                    int H = hkVar.H();
                    if (Character.isISOControl(H) && !Character.isWhitespace(H)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(pk pkVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return isProbablyUtf8(pkVar, j);
    }
}
