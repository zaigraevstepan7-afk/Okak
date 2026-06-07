package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import okhttp3.MediaType;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v80 extends Converter.Factory {
    public final MediaType a;
    public final ov1 b;

    public v80(MediaType mediaType, ov1 ov1Var) {
        this.a = mediaType;
        this.b = ov1Var;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        type.getClass();
        annotationArr.getClass();
        annotationArr2.getClass();
        retrofit.getClass();
        ov1 ov1Var = this.b;
        return new ld(this.a, SerializersKt.serializer(((Json) ov1Var.f).getSerializersModule(), type), ov1Var);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [retrofit2.Converter, sl0, java.lang.Object] */
    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        type.getClass();
        annotationArr.getClass();
        retrofit.getClass();
        ov1 ov1Var = this.b;
        KSerializer<Object> serializer = SerializersKt.serializer(((Json) ov1Var.f).getSerializersModule(), type);
        serializer.getClass();
        ov1Var.getClass();
        ?? obj = new Object();
        obj.e = serializer;
        obj.f = ov1Var;
        return obj;
    }
}
