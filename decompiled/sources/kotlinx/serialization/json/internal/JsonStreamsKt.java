package kotlinx.serialization.json.internal;

import defpackage.kv1;
import defpackage.mv1;
import defpackage.s;
import defpackage.sn0;
import defpackage.yq1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "Lod2;", "encodeByWriter", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "decodeByReader", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/internal/InternalJsonReader;)Ljava/lang/Object;", "Lkotlinx/serialization/json/DecodeSequenceMode;", "format", "Lkv1;", "decodeToSequenceByReader", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonReader;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkv1;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonReader;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkv1;", "", "SINGLE_CHAR_MAX_CODEPOINT", "I", "HIGH_SURROGATE_HEADER", "LOW_SURROGATE_HEADER", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonStreamsKt {
    private static final int HIGH_SURROGATE_HEADER = 55232;
    private static final int LOW_SURROGATE_HEADER = 56320;
    private static final int SINGLE_CHAR_MAX_CODEPOINT = 65535;

    @JsonFriendModuleApi
    public static final <T> T decodeByReader(Json json, DeserializationStrategy<? extends T> deserializationStrategy, InternalJsonReader internalJsonReader) {
        json.getClass();
        deserializationStrategy.getClass();
        internalJsonReader.getClass();
        ReaderJsonLexer ReaderJsonLexer$default = ReaderJsonLexerKt.ReaderJsonLexer$default(json, internalJsonReader, null, 4, null);
        try {
            T t = (T) new StreamingJsonDecoder(json, WriteMode.OBJ, ReaderJsonLexer$default, deserializationStrategy.getDescriptor(), null).decodeSerializableValue(deserializationStrategy);
            ReaderJsonLexer$default.expectEof();
            return t;
        } finally {
            ReaderJsonLexer$default.release();
        }
    }

    @JsonFriendModuleApi
    @ExperimentalSerializationApi
    public static final <T> kv1 decodeToSequenceByReader(Json json, InternalJsonReader internalJsonReader, DeserializationStrategy<? extends T> deserializationStrategy, DecodeSequenceMode decodeSequenceMode) {
        json.getClass();
        internalJsonReader.getClass();
        deserializationStrategy.getClass();
        decodeSequenceMode.getClass();
        final Iterator JsonIterator = JsonIteratorKt.JsonIterator(decodeSequenceMode, json, ReaderJsonLexerKt.ReaderJsonLexer(json, internalJsonReader, new char[16384]), deserializationStrategy);
        return mv1.F(new kv1() { // from class: kotlinx.serialization.json.internal.JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1
            @Override // defpackage.kv1
            public Iterator<T> iterator() {
                return JsonIterator;
            }
        });
    }

    public static /* synthetic */ kv1 decodeToSequenceByReader$default(Json json, InternalJsonReader internalJsonReader, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        json.getClass();
        internalJsonReader.getClass();
        decodeSequenceMode.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }

    @JsonFriendModuleApi
    public static final <T> void encodeByWriter(Json json, InternalJsonWriter internalJsonWriter, SerializationStrategy<? super T> serializationStrategy, T t) {
        json.getClass();
        internalJsonWriter.getClass();
        serializationStrategy.getClass();
        new StreamingJsonEncoder(internalJsonWriter, json, WriteMode.OBJ, new JsonEncoder[((s) WriteMode.getEntries()).a()]).encodeSerializableValue(serializationStrategy, t);
    }

    public static /* synthetic */ kv1 decodeToSequenceByReader$default(Json json, InternalJsonReader internalJsonReader, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 8) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequenceByReader(json, internalJsonReader, deserializationStrategy, decodeSequenceMode);
    }

    @JsonFriendModuleApi
    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> kv1 decodeToSequenceByReader(Json json, InternalJsonReader internalJsonReader, DecodeSequenceMode decodeSequenceMode) {
        json.getClass();
        internalJsonReader.getClass();
        decodeSequenceMode.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }
}
