package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kl implements n81 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + AbstractJsonLexerKt.END_LIST;
            case 1:
                return "CancelHandler.UserSupplied[" + ((oe0) obj).getClass().getSimpleName() + '@' + rx.w(this) + AbstractJsonLexerKt.END_LIST;
            default:
                return "DisposeOnCancel[" + ((q10) obj) + AbstractJsonLexerKt.END_LIST;
        }
    }
}
