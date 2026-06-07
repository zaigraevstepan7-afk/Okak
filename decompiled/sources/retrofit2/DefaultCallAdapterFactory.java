package retrofit2;

import defpackage.ea2;
import defpackage.se;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import retrofit2.CallAdapter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    @Nullable
    private final Executor callbackExecutor;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ExecutorCallbackCall<T> implements Call<T> {
        final Executor callbackExecutor;
        final Call<T> delegate;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Callback<T> {
            final /* synthetic */ Callback val$callback;

            public AnonymousClass1(Callback callback) {
                this.val$callback = callback;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onFailure$1(Callback callback, Throwable th) {
                callback.onFailure(ExecutorCallbackCall.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onResponse$0(Callback callback, Response response) {
                boolean isCanceled = ExecutorCallbackCall.this.delegate.isCanceled();
                ExecutorCallbackCall executorCallbackCall = ExecutorCallbackCall.this;
                if (isCanceled) {
                    callback.onFailure(executorCallbackCall, new IOException("Canceled"));
                } else {
                    callback.onResponse(executorCallbackCall, response);
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, Throwable th) {
                ExecutorCallbackCall.this.callbackExecutor.execute(new a(this, this.val$callback, th, 1));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, Response<T> response) {
                ExecutorCallbackCall.this.callbackExecutor.execute(new a(this, this.val$callback, response, 0));
            }
        }

        public ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.delegate.enqueue(new AnonymousClass1(callback));
        }

        @Override // retrofit2.Call
        public Response<T> execute() {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.delegate.request();
        }

        @Override // retrofit2.Call
        public ea2 timeout() {
            return this.delegate.timeout();
        }
    }

    public DefaultCallAdapterFactory(@Nullable Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final Executor executor = null;
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type parameterUpperBound = Utils.getParameterUpperBound(0, (ParameterizedType) type);
            if (!Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class)) {
                executor = this.callbackExecutor;
            }
            return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
                @Override // retrofit2.CallAdapter
                public Call<?> adapt(Call<Object> call) {
                    Executor executor2 = executor;
                    if (executor2 == null) {
                        return call;
                    }
                    return new ExecutorCallbackCall(executor2, call);
                }

                @Override // retrofit2.CallAdapter
                public Type responseType() {
                    return parameterUpperBound;
                }
            };
        }
        se.h("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
