package kotlinx.serialization.json.internal;

import defpackage.oe0;
import defpackage.se;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a6\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\fH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "source", "Lkotlinx/serialization/json/JsonElement;", "decodeStringToJsonTree", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "expectedType", "Lkotlin/Function1;", "block", "parseString", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;Loe0;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class StreamingJsonDecoderKt {
    @JsonFriendModuleApi
    public static final <T> JsonElement decodeStringToJsonTree(Json json, DeserializationStrategy<? extends T> deserializationStrategy, String str) {
        json.getClass();
        deserializationStrategy.getClass();
        str.getClass();
        StringJsonLexer StringJsonLexer = StringJsonLexerKt.StringJsonLexer(json, str);
        JsonElement decodeJsonElement = new StreamingJsonDecoder(json, WriteMode.OBJ, StringJsonLexer, deserializationStrategy.getDescriptor(), null).decodeJsonElement();
        StringJsonLexer.expectEof();
        return decodeJsonElement;
    }

    private static final <T> T parseString(AbstractJsonLexer abstractJsonLexer, String str, oe0 oe0Var) {
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return (T) oe0Var.invoke(consumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type '" + str + "' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            se.c();
            return null;
        }
    }
}
