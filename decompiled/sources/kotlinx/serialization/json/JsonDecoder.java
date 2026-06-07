package kotlinx.serialization.json;

import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface JsonDecoder extends Decoder, CompositeDecoder {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static int decodeCollectionSize(JsonDecoder jsonDecoder, SerialDescriptor serialDescriptor) {
            serialDescriptor.getClass();
            return JsonDecoder.super.decodeCollectionSize(serialDescriptor);
        }

        @ExperimentalSerializationApi
        @Deprecated
        public static <T> T decodeNullableSerializableValue(JsonDecoder jsonDecoder, DeserializationStrategy<? extends T> deserializationStrategy) {
            deserializationStrategy.getClass();
            return (T) JsonDecoder.super.decodeNullableSerializableValue(deserializationStrategy);
        }

        @ExperimentalSerializationApi
        @Deprecated
        public static boolean decodeSequentially(JsonDecoder jsonDecoder) {
            return JsonDecoder.super.decodeSequentially();
        }

        @Deprecated
        public static <T> T decodeSerializableValue(JsonDecoder jsonDecoder, DeserializationStrategy<? extends T> deserializationStrategy) {
            deserializationStrategy.getClass();
            return (T) JsonDecoder.super.decodeSerializableValue(deserializationStrategy);
        }
    }

    JsonElement decodeJsonElement();

    Json getJson();
}
