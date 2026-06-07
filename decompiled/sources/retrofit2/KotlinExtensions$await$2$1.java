package retrofit2;

import defpackage.cq0;
import defpackage.od2;
import defpackage.oe0;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lod2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KotlinExtensions$await$2$1 extends cq0 implements oe0 {
    final /* synthetic */ Call<T> $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$await$2$1(Call<T> call) {
        super(1);
        this.$this_await = call;
    }

    @Override // defpackage.oe0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return od2.a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel();
    }
}
