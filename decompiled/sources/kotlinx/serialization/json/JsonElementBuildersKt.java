package kotlinx.serialization.json;

import defpackage.oe0;
import defpackage.yn;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0007\u001a4\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a4\u0010\t\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a%\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0016\u001a%\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0017\u001a'\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0013\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0011*\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001a\u001a\u00020\u0011*\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001c\u001a\u001b\u0010\u001a\u001a\u00020\u0011*\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001a\u0010\u001d\u001a\u001d\u0010\u001a\u001a\u00020\u0011*\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001e\u001a%\u0010\u001f\u001a\u00020\u0011*\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010!\u001a\u00020\u0011*\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b!\u0010 \u001a#\u0010&\u001a\u00020\u0011*\u00020\u00072\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\"H\u0007¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\u0011*\u00020\u00072\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"H\u0007¢\u0006\u0004\b'\u0010%\u001a#\u0010&\u001a\u00020\u0011*\u00020\u00072\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\"H\u0007¢\u0006\u0004\b(\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObjectBuilder;", "Lod2;", "builderAction", "Lkotlinx/serialization/json/JsonObject;", "buildJsonObject", "(Loe0;)Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonArrayBuilder;", "Lkotlinx/serialization/json/JsonArray;", "buildJsonArray", "(Loe0;)Lkotlinx/serialization/json/JsonArray;", "", "key", "Lkotlinx/serialization/json/JsonElement;", "putJsonObject", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Loe0;)Lkotlinx/serialization/json/JsonElement;", "putJsonArray", "", "value", "put", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;", "", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Number;)Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Void;)Lkotlinx/serialization/json/JsonElement;", "add", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/Boolean;)Z", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/Number;)Z", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/String;)Z", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/Void;)Z", "addJsonObject", "(Lkotlinx/serialization/json/JsonArrayBuilder;Loe0;)Z", "addJsonArray", "", "values", "addAllStrings", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/util/Collection;)Z", "addAll", "addAllBooleans", "addAllNumbers", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonElementBuildersKt {
    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, Boolean bool) {
        jsonArrayBuilder.getClass();
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(bool));
    }

    @ExperimentalSerializationApi
    public static final boolean addAllBooleans(JsonArrayBuilder jsonArrayBuilder, Collection<Boolean> collection) {
        jsonArrayBuilder.getClass();
        collection.getClass();
        Collection<Boolean> collection2 = collection;
        ArrayList arrayList = new ArrayList(yn.a0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.JsonPrimitive((Boolean) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    @ExperimentalSerializationApi
    public static final boolean addAllNumbers(JsonArrayBuilder jsonArrayBuilder, Collection<? extends Number> collection) {
        jsonArrayBuilder.getClass();
        collection.getClass();
        Collection<? extends Number> collection2 = collection;
        ArrayList arrayList = new ArrayList(yn.a0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.JsonPrimitive((Number) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    @ExperimentalSerializationApi
    public static final boolean addAllStrings(JsonArrayBuilder jsonArrayBuilder, Collection<String> collection) {
        jsonArrayBuilder.getClass();
        collection.getClass();
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(yn.a0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.JsonPrimitive((String) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    public static final boolean addJsonArray(JsonArrayBuilder jsonArrayBuilder, oe0 oe0Var) {
        jsonArrayBuilder.getClass();
        oe0Var.getClass();
        JsonArrayBuilder jsonArrayBuilder2 = new JsonArrayBuilder();
        oe0Var.invoke(jsonArrayBuilder2);
        return jsonArrayBuilder.add(jsonArrayBuilder2.build());
    }

    public static final boolean addJsonObject(JsonArrayBuilder jsonArrayBuilder, oe0 oe0Var) {
        jsonArrayBuilder.getClass();
        oe0Var.getClass();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        oe0Var.invoke(jsonObjectBuilder);
        return jsonArrayBuilder.add(jsonObjectBuilder.build());
    }

    public static final JsonArray buildJsonArray(oe0 oe0Var) {
        oe0Var.getClass();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        oe0Var.invoke(jsonArrayBuilder);
        return jsonArrayBuilder.build();
    }

    public static final JsonObject buildJsonObject(oe0 oe0Var) {
        oe0Var.getClass();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        oe0Var.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.build();
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String str, Boolean bool) {
        jsonObjectBuilder.getClass();
        str.getClass();
        return jsonObjectBuilder.put(str, JsonElementKt.JsonPrimitive(bool));
    }

    public static final JsonElement putJsonArray(JsonObjectBuilder jsonObjectBuilder, String str, oe0 oe0Var) {
        jsonObjectBuilder.getClass();
        str.getClass();
        oe0Var.getClass();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        oe0Var.invoke(jsonArrayBuilder);
        return jsonObjectBuilder.put(str, jsonArrayBuilder.build());
    }

    public static final JsonElement putJsonObject(JsonObjectBuilder jsonObjectBuilder, String str, oe0 oe0Var) {
        jsonObjectBuilder.getClass();
        str.getClass();
        oe0Var.getClass();
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        oe0Var.invoke(jsonObjectBuilder2);
        return jsonObjectBuilder.put(str, jsonObjectBuilder2.build());
    }

    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, Number number) {
        jsonArrayBuilder.getClass();
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(number));
    }

    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, String str) {
        jsonArrayBuilder.getClass();
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(str));
    }

    @ExperimentalSerializationApi
    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, Void r1) {
        jsonArrayBuilder.getClass();
        return jsonArrayBuilder.add(JsonNull.INSTANCE);
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String str, Number number) {
        jsonObjectBuilder.getClass();
        str.getClass();
        return jsonObjectBuilder.put(str, JsonElementKt.JsonPrimitive(number));
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String str, String str2) {
        jsonObjectBuilder.getClass();
        str.getClass();
        return jsonObjectBuilder.put(str, JsonElementKt.JsonPrimitive(str2));
    }

    @ExperimentalSerializationApi
    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String str, Void r2) {
        jsonObjectBuilder.getClass();
        str.getClass();
        return jsonObjectBuilder.put(str, JsonNull.INSTANCE);
    }
}
