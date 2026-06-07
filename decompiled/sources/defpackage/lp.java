package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class lp {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(lp.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public lp(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + AbstractJsonLexerKt.BEGIN_LIST + this.a + AbstractJsonLexerKt.END_LIST;
    }
}
