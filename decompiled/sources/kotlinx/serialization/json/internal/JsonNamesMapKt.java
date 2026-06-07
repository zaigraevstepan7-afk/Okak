package kotlinx.serialization.json.internal;

import defpackage.de0;
import defpackage.j1;
import defpackage.m60;
import defpackage.od2;
import defpackage.oe0;
import defpackage.sn0;
import defpackage.tz0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001a-\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a[\u0010%\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001f2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040!2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0!H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b'\u0010(\",\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"&\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "", "", "", "buildDeserializationNamesMap", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/util/Map;", "descriptor", "deserializationNamesMap", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", "Lkotlinx/serialization/json/JsonNamingStrategy;", "strategy", "", "serializationNamesIndices", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonNamingStrategy;)[Ljava/lang/String;", "index", "getJsonElementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;I)Ljava/lang/String;", "namingStrategy", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/JsonNamingStrategy;", "name", "getJsonNameIndexSlowPath", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;)I", "", "decodeCaseInsensitive", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "getJsonNameIndex", "suffix", "getJsonNameIndexOrThrow", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;Ljava/lang/String;)I", "Lkotlin/Function1;", "peekNull", "Lkotlin/Function0;", "peekString", "Lod2;", "onEnumCoercing", "tryCoerceValue", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;ILoe0;Lde0;Lde0;)Z", "ignoreUnknownKeys", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Z", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonDeserializationNamesKey", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "getJsonDeserializationNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonSerializationNamesKey", "getJsonSerializationNamesKey", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonNamesMapKt {
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key<>();
    private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = new DescriptorSchemaCache.Key<>();

    public static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor serialDescriptor, Json json) {
        Object obj;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean decodeCaseInsensitive = decodeCaseInsensitive(json, serialDescriptor);
        JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : elementAnnotations) {
                if (obj2 instanceof JsonNames) {
                    arrayList.add(obj2);
                }
            }
            String str = null;
            if (arrayList.size() == 1) {
                obj = arrayList.get(0);
            } else {
                obj = null;
            }
            JsonNames jsonNames = (JsonNames) obj;
            if (jsonNames != null && (names = jsonNames.names()) != null) {
                for (String str2 : names) {
                    if (decodeCaseInsensitive) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        str2.getClass();
                    }
                    buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, str2, i);
                }
            }
            if (decodeCaseInsensitive) {
                str = serialDescriptor.getElementName(i).toLowerCase(Locale.ROOT);
                str.getClass();
            } else if (namingStrategy != null) {
                str = namingStrategy.serialNameForJson(serialDescriptor, i, serialDescriptor.getElementName(i));
            }
            if (str != null) {
                buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, str, i);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return m60.e;
        }
        return linkedHashMap;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i) {
        String str2;
        if (sn0.r(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.getElementName(i) + " is already one of the names for " + str2 + ' ' + serialDescriptor.getElementName(((Number) tz0.b0(str, map)).intValue()) + " in " + serialDescriptor);
    }

    private static final boolean decodeCaseInsensitive(Json json, SerialDescriptor serialDescriptor) {
        if (json.getConfiguration().getDecodeEnumsCaseInsensitive() && sn0.r(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            return true;
        }
        return false;
    }

    public static final Map<String, Integer> deserializationNamesMap(Json json, SerialDescriptor serialDescriptor) {
        json.getClass();
        serialDescriptor.getClass();
        return (Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonDeserializationNamesKey, new j1(20, serialDescriptor, json));
    }

    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    public static final String getJsonElementName(SerialDescriptor serialDescriptor, Json json, int i) {
        serialDescriptor.getClass();
        json.getClass();
        JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        if (namingStrategy == null) {
            return serialDescriptor.getElementName(i);
        }
        return serializationNamesIndices(serialDescriptor, json, namingStrategy)[i];
    }

    public static final int getJsonNameIndex(SerialDescriptor serialDescriptor, Json json, String str) {
        serialDescriptor.getClass();
        json.getClass();
        str.getClass();
        if (decodeCaseInsensitive(json, serialDescriptor)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return getJsonNameIndexSlowPath(serialDescriptor, json, lowerCase);
        }
        if (namingStrategy(serialDescriptor, json) != null) {
            return getJsonNameIndexSlowPath(serialDescriptor, json, str);
        }
        int elementIndex = serialDescriptor.getElementIndex(str);
        if (elementIndex != -3 || !json.getConfiguration().getUseAlternativeNames()) {
            return elementIndex;
        }
        return getJsonNameIndexSlowPath(serialDescriptor, json, str);
    }

    public static final int getJsonNameIndexOrThrow(SerialDescriptor serialDescriptor, Json json, String str, String str2) {
        serialDescriptor.getClass();
        json.getClass();
        str.getClass();
        str2.getClass();
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, str);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    private static final int getJsonNameIndexSlowPath(SerialDescriptor serialDescriptor, Json json, String str) {
        Integer num = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    public static final boolean ignoreUnknownKeys(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        json.getClass();
        if (!json.getConfiguration().getIgnoreUnknownKeys()) {
            List<Annotation> annotations = serialDescriptor.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                Iterator<T> it = annotations.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof JsonIgnoreUnknownKeys) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final JsonNamingStrategy namingStrategy(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        json.getClass();
        if (sn0.r(serialDescriptor.getKind(), StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    public static final String[] serializationNamesIndices(SerialDescriptor serialDescriptor, Json json, JsonNamingStrategy jsonNamingStrategy) {
        serialDescriptor.getClass();
        json.getClass();
        jsonNamingStrategy.getClass();
        return (String[]) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonSerializationNamesKey, new j1(21, serialDescriptor, jsonNamingStrategy));
    }

    public static final String[] serializationNamesIndices$lambda$4(SerialDescriptor serialDescriptor, JsonNamingStrategy jsonNamingStrategy) {
        int elementsCount = serialDescriptor.getElementsCount();
        String[] strArr = new String[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            strArr[i] = jsonNamingStrategy.serialNameForJson(serialDescriptor, i, serialDescriptor.getElementName(i));
        }
        return strArr;
    }

    public static final boolean tryCoerceValue(Json json, SerialDescriptor serialDescriptor, int i, oe0 oe0Var, de0 de0Var, de0 de0Var2) {
        String str;
        boolean z;
        json.getClass();
        serialDescriptor.getClass();
        oe0Var.getClass();
        de0Var.getClass();
        de0Var2.getClass();
        boolean isElementOptional = serialDescriptor.isElementOptional(i);
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i);
        if (isElementOptional && !elementDescriptor.isNullable() && ((Boolean) oe0Var.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!sn0.r(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) oe0Var.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) de0Var.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        if (!json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable()) {
            z = true;
        } else {
            z = false;
        }
        if (jsonNameIndex == -3 && (isElementOptional || z)) {
            de0Var2.invoke();
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor serialDescriptor, int i, oe0 oe0Var, de0 de0Var, de0 de0Var2, int i2, Object obj) {
        String str;
        boolean z;
        if ((i2 & 16) != 0) {
            de0Var2 = new de0() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$tryCoerceValue$1
                @Override // defpackage.de0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m123invoke();
                    return od2.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m123invoke() {
                }
            };
        }
        json.getClass();
        serialDescriptor.getClass();
        oe0Var.getClass();
        de0Var.getClass();
        de0Var2.getClass();
        boolean isElementOptional = serialDescriptor.isElementOptional(i);
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i);
        if (isElementOptional && !elementDescriptor.isNullable() && ((Boolean) oe0Var.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!sn0.r(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) oe0Var.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) de0Var.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        if (!json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable()) {
            z = true;
        } else {
            z = false;
        }
        if (jsonNameIndex == -3 && (isElementOptional || z)) {
            de0Var2.invoke();
            return true;
        }
        return false;
    }
}
