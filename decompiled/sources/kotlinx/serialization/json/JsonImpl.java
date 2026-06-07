package kotlinx.serialization.json;

import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.JsonSerializersModuleValidator;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/JsonImpl;", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/modules/SerializersModule;", "module", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/modules/SerializersModule;)V", "Lod2;", "validateConfiguration", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonImpl extends Json {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonImpl(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        super(jsonConfiguration, serializersModule, null);
        jsonConfiguration.getClass();
        serializersModule.getClass();
        validateConfiguration();
    }

    private final void validateConfiguration() {
        if (sn0.r(getSerializersModule(), SerializersModuleBuildersKt.EmptySerializersModule())) {
            return;
        }
        getSerializersModule().dumpTo(new JsonSerializersModuleValidator(getConfiguration()));
    }
}
