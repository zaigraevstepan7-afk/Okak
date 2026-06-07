package kotlinx.serialization.json;

import defpackage.d32;
import defpackage.de0;
import defpackage.o32;
import defpackage.se;
import defpackage.yl1;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0003\u0010\u0014\u001a\u0019\u0010\u0003\u001a\u00020\u00162\b\u0010\u0001\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0003\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u001b\u0010\u001b\u001a\u00020\u0015*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0082\b¢\u0006\u0004\b \u0010!\u001a$\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0082\b¢\u0006\u0004\b\"\u0010!\u001a\u001f\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0001¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010(\u001a\u00020'*\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010)\"\u001a\u0010+\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0015\u00101\u001a\u00020\u0002*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0015\u00105\u001a\u000202*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0015\u00109\u001a\u000206*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0015\u0010<\u001a\u00020\u0016*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0015\u0010@\u001a\u00020=*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b>\u0010?\"\u0017\u0010C\u001a\u0004\u0018\u00010=*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0015\u0010E\u001a\u00020'*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bD\u0010)\"\u0017\u0010H\u001a\u0004\u0018\u00010'*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u0015\u0010L\u001a\u00020I*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bJ\u0010K\"\u0017\u0010O\u001a\u0004\u0018\u00010I*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u0015\u0010S\u001a\u00020P*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u0017\u0010V\u001a\u0004\u0018\u00010P*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u0015\u0010Y\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bW\u0010X\"\u0017\u0010\\\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0017\u0010_\u001a\u0004\u0018\u00010\u0013*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "JsonPrimitive", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;", "Lvc2;", "JsonPrimitive-7apg3OU", "(B)Lkotlinx/serialization/json/JsonPrimitive;", "Led2;", "JsonPrimitive-xj2QHRw", "(S)Lkotlinx/serialization/json/JsonPrimitive;", "Lyc2;", "JsonPrimitive-WZ4Q5Ns", "(I)Lkotlinx/serialization/json/JsonPrimitive;", "Lbd2;", "JsonPrimitive-VKZWuLQ", "(J)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlinx/serialization/json/JsonNull;", "(Ljava/lang/Void;)Lkotlinx/serialization/json/JsonNull;", "JsonUnquotedLiteral", "Lkotlinx/serialization/json/JsonElement;", "element", "error", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Ljava/lang/Void;", "T", "Lkotlin/Function0;", "f", "exceptionToNull", "(Lde0;)Ljava/lang/Object;", "exceptionToNumberFormatException", "key", "expected", "unexpectedJson", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "", "parseLongImpl", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonUnquotedLiteralDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "Lkotlinx/serialization/json/JsonArray;", "getJsonArray", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonArray", "getJsonNull", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonNull;", "jsonNull", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "getLong", "long", "getLongOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "getDoubleOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "float", "getFloatOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Float;", "floatOrNull", "getBoolean", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", "boolean", "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonElementKt {
    private static final SerialDescriptor jsonUnquotedLiteralDescriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(d32.a));

    public static final JsonPrimitive JsonPrimitive(Boolean bool) {
        if (bool == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(bool, false, null, 4, null);
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final JsonPrimitive m119JsonPrimitive7apg3OU(byte b) {
        return m120JsonPrimitiveVKZWuLQ(b & 255);
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final JsonPrimitive m120JsonPrimitiveVKZWuLQ(long j) {
        return JsonUnquotedLiteral(Long.toUnsignedString(j));
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final JsonPrimitive m121JsonPrimitiveWZ4Q5Ns(int i) {
        return m120JsonPrimitiveVKZWuLQ(i & 4294967295L);
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final JsonPrimitive m122JsonPrimitivexj2QHRw(short s) {
        return m120JsonPrimitiveVKZWuLQ(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @ExperimentalSerializationApi
    public static final JsonPrimitive JsonUnquotedLiteral(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        if (!str.equals(JsonNull.INSTANCE.getContent())) {
            return new JsonLiteral(str, false, jsonUnquotedLiteralDescriptor);
        }
        throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
    }

    private static final Void error(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + yl1.a(jsonElement.getClass()) + " is not a " + str);
    }

    private static final <T> T exceptionToNull(de0 de0Var) {
        try {
            return (T) de0Var.invoke();
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    private static final <T> T exceptionToNumberFormatException(de0 de0Var) {
        try {
            return (T) de0Var.invoke();
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final boolean getBoolean(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        Boolean booleanStrictOrNull = StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final Boolean getBooleanOrNull(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        return StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    public static final String getContentOrNull(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final double getDouble(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    public static final Double getDoubleOrNull(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        String content = jsonPrimitive.getContent();
        content.getClass();
        try {
            if (o32.u(content)) {
                return Double.valueOf(Double.parseDouble(content));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final float getFloat(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    public static final Float getFloatOrNull(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        String content = jsonPrimitive.getContent();
        content.getClass();
        try {
            if (o32.u(content)) {
                return Float.valueOf(Float.parseFloat(content));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final int getInt(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        try {
            long parseLongImpl = parseLongImpl(jsonPrimitive);
            if (-2147483648L <= parseLongImpl && parseLongImpl <= 2147483647L) {
                return (int) parseLongImpl;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer getIntOrNull(JsonPrimitive jsonPrimitive) {
        Long l;
        jsonPrimitive.getClass();
        try {
            l = Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final JsonArray getJsonArray(JsonElement jsonElement) {
        JsonArray jsonArray;
        jsonElement.getClass();
        if (jsonElement instanceof JsonArray) {
            jsonArray = (JsonArray) jsonElement;
        } else {
            jsonArray = null;
        }
        if (jsonArray != null) {
            return jsonArray;
        }
        error(jsonElement, "JsonArray");
        se.c();
        return null;
    }

    public static final JsonNull getJsonNull(JsonElement jsonElement) {
        JsonNull jsonNull;
        jsonElement.getClass();
        if (jsonElement instanceof JsonNull) {
            jsonNull = (JsonNull) jsonElement;
        } else {
            jsonNull = null;
        }
        if (jsonNull != null) {
            return jsonNull;
        }
        error(jsonElement, "JsonNull");
        se.c();
        return null;
    }

    public static final JsonObject getJsonObject(JsonElement jsonElement) {
        JsonObject jsonObject;
        jsonElement.getClass();
        if (jsonElement instanceof JsonObject) {
            jsonObject = (JsonObject) jsonElement;
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            return jsonObject;
        }
        error(jsonElement, "JsonObject");
        se.c();
        return null;
    }

    public static final JsonPrimitive getJsonPrimitive(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        jsonElement.getClass();
        if (jsonElement instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) jsonElement;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error(jsonElement, "JsonPrimitive");
        se.c();
        return null;
    }

    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    public static final long getLong(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        try {
            return parseLongImpl(jsonPrimitive);
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Long getLongOrNull(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        try {
            return Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final long parseLongImpl(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        return new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteralFully();
    }

    public static final Void unexpectedJson(String str, String str2) {
        str.getClass();
        str2.getClass();
        throw new IllegalArgumentException("Element " + str + " is not a " + str2);
    }

    public static final JsonPrimitive JsonPrimitive(Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(number, false, null, 4, null);
    }

    public static final JsonPrimitive JsonPrimitive(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(str, true, null, 4, null);
    }

    @ExperimentalSerializationApi
    public static final JsonNull JsonPrimitive(Void r0) {
        return JsonNull.INSTANCE;
    }
}
