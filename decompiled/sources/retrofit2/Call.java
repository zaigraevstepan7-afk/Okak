package retrofit2;

import defpackage.ea2;
import okhttp3.Request;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    ea2 timeout();
}
