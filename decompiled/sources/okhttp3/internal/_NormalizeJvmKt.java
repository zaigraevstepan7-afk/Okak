package okhttp3.internal;

import defpackage.yq1;
import java.text.Normalizer;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"normalizeNfc", "", "string", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class _NormalizeJvmKt {
    public static final String normalizeNfc(String str) {
        str.getClass();
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        normalize.getClass();
        return normalize;
    }
}
