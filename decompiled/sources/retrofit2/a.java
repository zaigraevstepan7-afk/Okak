package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f;
    public final /* synthetic */ Callback g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i) {
        this.e = i;
        this.f = anonymousClass1;
        this.g = callback;
        this.h = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.h;
        Callback callback = this.g;
        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1 = this.f;
        switch (i) {
            case 0:
                anonymousClass1.lambda$onResponse$0(callback, (Response) obj);
                return;
            default:
                anonymousClass1.lambda$onFailure$1(callback, (Throwable) obj);
                return;
        }
    }
}
