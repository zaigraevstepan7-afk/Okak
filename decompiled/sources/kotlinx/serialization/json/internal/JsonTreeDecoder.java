package kotlinx.serialization.json.internal;

import defpackage.l90;
import defpackage.p60;
import defpackage.sn0;
import defpackage.tz0;
import defpackage.wn;
import defpackage.yq1;
import defpackage.yx;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/JsonObject;", "value", "", "polymorphicDiscriminator", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "polyDescriptor", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "descriptor", "", "index", "", "setForceNull", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeNotNullMark", "()Z", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "tag", "Lkotlinx/serialization/json/JsonElement;", "currentElement", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "currentElementOrNull", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "Lod2;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/JsonObject;", "getValue", "()Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "position", "I", "forceNull", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class JsonTreeDecoder extends AbstractJsonTreeDecoder {
    private boolean forceNull;
    private final SerialDescriptor polyDescriptor;
    private int position;
    private final JsonObject value;

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, yx yxVar) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean setForceNull(SerialDescriptor descriptor, int index) {
        boolean z;
        if (!getJson().getConfiguration().getExplicitNulls() && !descriptor.isElementOptional(index) && descriptor.getElementDescriptor(index).isNullable()) {
            z = true;
        } else {
            z = false;
        }
        this.forceNull = z;
        return z;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
        if (descriptor == this.polyDescriptor) {
            Json json = getJson();
            JsonElement currentObject = currentObject();
            String serialName = this.polyDescriptor.getSerialName();
            if (currentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json, (JsonObject) currentObject, getPolymorphicDiscriminator(), this.polyDescriptor);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            l90.w(JsonObject.class, sb, ", but had ", currentObject, " as the serialized body of ");
            sb.append(serialName);
            sb.append(" at element: ");
            sb.append(renderTagStack());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentObject.toString());
        }
        return super.beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String tag) {
        tag.getClass();
        return (JsonElement) tz0.b0(tag, getValue());
    }

    public final JsonElement currentElementOrNull(String tag) {
        tag.getClass();
        return (JsonElement) getValue().get((Object) tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        JsonPrimitive jsonPrimitive;
        descriptor.getClass();
        while (this.position < descriptor.getElementsCount()) {
            int i = this.position;
            this.position = i + 1;
            String tag = getTag(descriptor, i);
            boolean z = true;
            int i2 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey((Object) tag) || setForceNull(descriptor, i2)) {
                if (this.configuration.getCoerceInputValues()) {
                    Json json = getJson();
                    boolean isElementOptional = descriptor.isElementOptional(i2);
                    SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i2);
                    if (!isElementOptional || elementDescriptor.isNullable() || !(currentElementOrNull(tag) instanceof JsonNull)) {
                        if (sn0.r(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
                            if (elementDescriptor.isNullable() && (currentElementOrNull(tag) instanceof JsonNull)) {
                                return i2;
                            }
                            JsonElement currentElementOrNull = currentElementOrNull(tag);
                            String str = null;
                            if (currentElementOrNull instanceof JsonPrimitive) {
                                jsonPrimitive = (JsonPrimitive) currentElementOrNull;
                            } else {
                                jsonPrimitive = null;
                            }
                            if (jsonPrimitive != null) {
                                str = JsonElementKt.getContentOrNull(jsonPrimitive);
                            }
                            if (str == null) {
                                return i2;
                            }
                            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, str);
                            if (json.getConfiguration().getExplicitNulls() || !elementDescriptor.isNullable()) {
                                z = false;
                            }
                            if (jsonNameIndex == -3 && ((isElementOptional || z) && !setForceNull(descriptor, i2))) {
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        if (!this.forceNull && super.decodeNotNullMark()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor descriptor, int index) {
        String str;
        Object obj;
        descriptor.getClass();
        JsonNamingStrategy namingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        String elementName = descriptor.getElementName(index);
        if (namingStrategy != null || (this.configuration.getUseAlternativeNames() && !getValue().keySet().contains(elementName))) {
            Map<String, Integer> deserializationNamesMap = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor);
            Iterator<T> it = getValue().keySet().iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj = it.next();
                    Integer num = deserializationNamesMap.get((String) obj);
                    if (num != null && num.intValue() == index) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                return str2;
            }
            if (namingStrategy != null) {
                str = namingStrategy.serialNameForJson(descriptor, index, elementName);
            }
            if (str != null) {
                return str;
            }
        }
        return elementName;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Set set;
        Integer num;
        int size;
        Set<String> set2;
        descriptor.getClass();
        if (!JsonNamesMapKt.ignoreUnknownKeys(descriptor, getJson()) && !(descriptor.getKind() instanceof PolymorphicKind)) {
            JsonNamingStrategy namingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
            if (namingStrategy == null && !this.configuration.getUseAlternativeNames()) {
                set2 = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            } else if (namingStrategy != null) {
                set2 = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor).keySet();
            } else {
                Set<String> jsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
                Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonDeserializationNamesKey());
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = p60.e;
                }
                Set set3 = set;
                jsonCachedSerialNames.getClass();
                if (set3 instanceof Collection) {
                    num = Integer.valueOf(set3.size());
                } else {
                    num = null;
                }
                if (num != null) {
                    size = jsonCachedSerialNames.size() + num.intValue();
                } else {
                    size = jsonCachedSerialNames.size() * 2;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(tz0.c0(size));
                linkedHashSet.addAll(jsonCachedSerialNames);
                wn.d0(set3, linkedHashSet);
                set2 = linkedHashSet;
            }
            for (String str : getValue().keySet()) {
                if (!set2.contains(str) && !sn0.r(str, getPolymorphicDiscriminator())) {
                    throw JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key '" + str + "' at element: " + renderTagStack() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify$default(getValue().toString(), 0, 1, null)));
                }
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonObject getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(json, jsonObject, str, null);
        json.getClass();
        jsonObject.getClass();
        this.value = jsonObject;
        this.polyDescriptor = serialDescriptor;
    }
}
