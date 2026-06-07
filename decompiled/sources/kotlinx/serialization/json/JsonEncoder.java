package kotlinx.serialization.json;

import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lod2;", "encodeJsonElement", "(Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface JsonEncoder extends Encoder, CompositeEncoder {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static CompositeEncoder beginCollection(JsonEncoder jsonEncoder, SerialDescriptor serialDescriptor, int i) {
            serialDescriptor.getClass();
            return JsonEncoder.super.beginCollection(serialDescriptor, i);
        }

        @ExperimentalSerializationApi
        @Deprecated
        public static void encodeNotNullMark(JsonEncoder jsonEncoder) {
            JsonEncoder.super.encodeNotNullMark();
        }

        @ExperimentalSerializationApi
        @Deprecated
        public static <T> void encodeNullableSerializableValue(JsonEncoder jsonEncoder, SerializationStrategy<? super T> serializationStrategy, T t) {
            serializationStrategy.getClass();
            JsonEncoder.super.encodeNullableSerializableValue(serializationStrategy, t);
        }

        @Deprecated
        public static <T> void encodeSerializableValue(JsonEncoder jsonEncoder, SerializationStrategy<? super T> serializationStrategy, T t) {
            serializationStrategy.getClass();
            JsonEncoder.super.encodeSerializableValue(serializationStrategy, t);
        }

        @ExperimentalSerializationApi
        @Deprecated
        public static boolean shouldEncodeElementDefault(JsonEncoder jsonEncoder, SerialDescriptor serialDescriptor, int i) {
            serialDescriptor.getClass();
            return JsonEncoder.super.shouldEncodeElementDefault(serialDescriptor, i);
        }
    }

    void encodeJsonElement(JsonElement element);

    Json getJson();
}
