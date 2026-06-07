package kotlinx.serialization.json;

import defpackage.kv1;
import defpackage.sn0;
import defpackage.yq1;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a,\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\b\u0010\n\u001a/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u000e\u0010\u0010\u001a?\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "Ljava/io/OutputStream;", "stream", "Lod2;", "encodeToStream", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Ljava/io/InputStream;", "decodeFromStream", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "Lkotlinx/serialization/json/DecodeSequenceMode;", "format", "Lkv1;", "decodeToSequence", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkv1;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkv1;", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JvmStreamsKt {
    @ExperimentalSerializationApi
    public static final <T> T decodeFromStream(Json json, DeserializationStrategy<? extends T> deserializationStrategy, InputStream inputStream) {
        json.getClass();
        deserializationStrategy.getClass();
        inputStream.getClass();
        JavaStreamSerialReader javaStreamSerialReader = new JavaStreamSerialReader(inputStream);
        try {
            return (T) JsonStreamsKt.decodeByReader(json, deserializationStrategy, javaStreamSerialReader);
        } finally {
            javaStreamSerialReader.release();
        }
    }

    @ExperimentalSerializationApi
    public static final <T> kv1 decodeToSequence(Json json, InputStream inputStream, DeserializationStrategy<? extends T> deserializationStrategy, DecodeSequenceMode decodeSequenceMode) {
        json.getClass();
        inputStream.getClass();
        deserializationStrategy.getClass();
        decodeSequenceMode.getClass();
        return JsonStreamsKt.decodeToSequenceByReader(json, new JavaStreamSerialReader(inputStream), deserializationStrategy, decodeSequenceMode);
    }

    public static /* synthetic */ kv1 decodeToSequence$default(Json json, InputStream inputStream, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 2) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        json.getClass();
        inputStream.getClass();
        decodeSequenceMode.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final <T> void encodeToStream(Json json, SerializationStrategy<? super T> serializationStrategy, T t, OutputStream outputStream) {
        json.getClass();
        serializationStrategy.getClass();
        outputStream.getClass();
        JsonToJavaStreamWriter jsonToJavaStreamWriter = new JsonToJavaStreamWriter(outputStream);
        try {
            JsonStreamsKt.encodeByWriter(json, jsonToJavaStreamWriter, serializationStrategy, t);
        } finally {
            jsonToJavaStreamWriter.release();
        }
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> kv1 decodeToSequence(Json json, InputStream inputStream, DecodeSequenceMode decodeSequenceMode) {
        json.getClass();
        inputStream.getClass();
        decodeSequenceMode.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }

    public static /* synthetic */ kv1 decodeToSequence$default(Json json, InputStream inputStream, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToStream(Json json, T t, OutputStream outputStream) {
        json.getClass();
        outputStream.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStream(Json json, InputStream inputStream) {
        json.getClass();
        inputStream.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }
}
