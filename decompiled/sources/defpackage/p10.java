package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p10 implements q10 {
    public final ScheduledFuture e;

    public p10(ScheduledFuture scheduledFuture) {
        this.e = scheduledFuture;
    }

    @Override // defpackage.q10
    public final void a() {
        this.e.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.e + AbstractJsonLexerKt.END_LIST;
    }
}
