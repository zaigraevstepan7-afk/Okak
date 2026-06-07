package kotlinx.serialization.json.internal;

import defpackage.oe0;
import defpackage.yq1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0017j\b\u0012\u0004\u0012\u00020\u0005`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "Lod2;", "nodeConsumer", "<init>", "(Lkotlinx/serialization/json/Json;Loe0;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "key", "element", "putElement", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "getCurrent", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "array", "Ljava/util/ArrayList;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
final class JsonTreeListEncoder extends AbstractJsonTreeEncoder {
    private final ArrayList<JsonElement> array;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListEncoder(Json json, oe0 oe0Var) {
        super(json, oe0Var, null);
        json.getClass();
        oe0Var.getClass();
        this.array = new ArrayList<>();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return String.valueOf(index);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement getCurrent() {
        return new JsonArray(this.array);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void putElement(String key, JsonElement element) {
        key.getClass();
        element.getClass();
        this.array.add(Integer.parseInt(key), element);
    }
}
