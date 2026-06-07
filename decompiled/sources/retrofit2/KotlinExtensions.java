package retrofit2;

import defpackage.fo1;
import defpackage.go;
import defpackage.nl;
import defpackage.od2;
import defpackage.pl;
import defpackage.sn0;
import defpackage.vt;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a \u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@¢\u0006\u0004\b\b\u0010\u0007\u001a\u001a\u0010\u0006\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0005H\u0087@¢\u0006\u0004\b\n\u0010\u0007\u001a&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\f\u0010\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lvt;)Ljava/lang/Object;", "awaitNullable", "Lod2;", "awaitUnit", "Lretrofit2/Response;", "awaitResponse", "", "", "suspendAndThrow", "(Ljava/lang/Throwable;Lvt;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, vt<? super T> vtVar) {
        final pl plVar = new pl(1, go.F(vtVar));
        plVar.r();
        plVar.t(new KotlinExtensions$await$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                call2.getClass();
                t.getClass();
                nl.this.resumeWith(new fo1(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                call2.getClass();
                response.getClass();
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        Object tag = call2.request().tag(Invocation.class);
                        tag.getClass();
                        Invocation invocation = (Invocation) tag;
                        nl.this.resumeWith(new fo1(new NullPointerException("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null")));
                        return;
                    }
                    nl.this.resumeWith(body);
                    return;
                }
                nl.this.resumeWith(new fo1(new HttpException(response)));
            }
        });
        return plVar.q();
    }

    public static final <T> Object awaitNullable(Call<T> call, vt<? super T> vtVar) {
        final pl plVar = new pl(1, go.F(vtVar));
        plVar.r();
        plVar.t(new KotlinExtensions$await$4$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                call2.getClass();
                t.getClass();
                nl.this.resumeWith(new fo1(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                call2.getClass();
                response.getClass();
                boolean isSuccessful = response.isSuccessful();
                nl nlVar = nl.this;
                if (isSuccessful) {
                    nlVar.resumeWith(response.body());
                } else {
                    nlVar.resumeWith(new fo1(new HttpException(response)));
                }
            }
        });
        return plVar.q();
    }

    public static final <T> Object awaitResponse(Call<T> call, vt<? super Response<T>> vtVar) {
        final pl plVar = new pl(1, go.F(vtVar));
        plVar.r();
        plVar.t(new KotlinExtensions$awaitResponse$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                call2.getClass();
                t.getClass();
                nl.this.resumeWith(new fo1(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                call2.getClass();
                response.getClass();
                nl.this.resumeWith(response);
            }
        });
        return plVar.q();
    }

    public static final Object awaitUnit(Call<od2> call, vt<? super od2> vtVar) {
        call.getClass();
        return awaitNullable(call, vtVar);
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        retrofit.getClass();
        sn0.R();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Throwable r4, defpackage.vt<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L33
            r4 = 0
            if (r1 == r2) goto L28
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            return r4
        L28:
            java.lang.Object r0 = r0.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.io.K(r5)
            defpackage.se.c()
            return r4
        L33:
            defpackage.io.K(r5)
            r0.L$0 = r4
            r0.label = r2
            vy r5 = defpackage.k10.a
            xu r1 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$2$1 r2 = new retrofit2.KotlinExtensions$suspendAndThrow$2$1
            r2.<init>()
            r5.P(r1, r2)
            hv r4 = defpackage.hv.e
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Throwable, vt):java.lang.Object");
    }
}
