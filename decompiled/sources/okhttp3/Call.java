package okhttp3;

import defpackage.de0;
import defpackage.ea2;
import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001$J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH&¢\u0006\u0004\b\u001a\u0010\u001dJ5\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&¢\u0006\u0004\b\u001a\u0010 J5\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&¢\u0006\u0004\b\u001a\u0010!J\u000f\u0010\"\u001a\u00020\u0000H&¢\u0006\u0004\b\"\u0010#¨\u0006%À\u0006\u0003"}, d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "Lod2;", "enqueue", "(Lokhttp3/Callback;)V", "cancel", "()V", "", "isExecuted", "()Z", "isCanceled", "Lea2;", "timeout", "()Lea2;", "", "T", "Lto0;", "type", "tag", "(Lto0;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function0;", "computeIfAbsent", "(Lto0;Lde0;)Ljava/lang/Object;", "(Ljava/lang/Class;Lde0;)Ljava/lang/Object;", "clone", "()Lokhttp3/Call;", "Factory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface Call extends Cloneable {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lokhttp3/Call$Factory;", "", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    /* renamed from: clone */
    Call mo276clone();

    void enqueue(Callback responseCallback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    <T> T tag(Class<? extends T> type);

    <T> T tag(Class<T> type, de0 computeIfAbsent);

    <T> T tag(to0 type);

    <T> T tag(to0 type, de0 computeIfAbsent);

    ea2 timeout();
}
