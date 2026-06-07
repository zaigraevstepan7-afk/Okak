package kotlinx.serialization.json.internal;

import defpackage.fo1;
import defpackage.p32;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"MAX_CHARS_IN_POOL", "", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ArrayPoolsKt {
    private static final int MAX_CHARS_IN_POOL;

    static {
        Object fo1Var;
        int i;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                fo1Var = p32.E(property);
            } else {
                fo1Var = null;
            }
        } catch (Throwable th) {
            fo1Var = new fo1(th);
        }
        if (!(fo1Var instanceof fo1)) {
            obj = fo1Var;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        MAX_CHARS_IN_POOL = i;
    }
}
