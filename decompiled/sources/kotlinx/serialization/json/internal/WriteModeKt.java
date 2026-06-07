package kotlinx.serialization.json.internal;

import defpackage.de0;
import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aU\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u0007*\u00028\u0000\"\b\b\u0002\u0010\b*\u00028\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "Lkotlinx/serialization/json/internal/WriteMode;", "switchMode", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/WriteMode;", "T", "R1", "R2", "mapDescriptor", "Lkotlin/Function0;", "ifMap", "ifList", "selectMapMode", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;Lde0;Lde0;)Ljava/lang/Object;", "Lkotlinx/serialization/modules/SerializersModule;", "module", "carrierDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class WriteModeKt {
    public static final SerialDescriptor carrierDescriptor(SerialDescriptor serialDescriptor, SerializersModule serializersModule) {
        SerialDescriptor carrierDescriptor;
        serialDescriptor.getClass();
        serializersModule.getClass();
        if (sn0.r(serialDescriptor.getKind(), SerialKind.CONTEXTUAL.INSTANCE)) {
            SerialDescriptor contextualDescriptor = ContextAwareKt.getContextualDescriptor(serializersModule, serialDescriptor);
            if (contextualDescriptor != null && (carrierDescriptor = carrierDescriptor(contextualDescriptor, serializersModule)) != null) {
                return carrierDescriptor;
            }
            return serialDescriptor;
        }
        if (serialDescriptor.getIsInline()) {
            return carrierDescriptor(serialDescriptor.getElementDescriptor(0), serializersModule);
        }
        return serialDescriptor;
    }

    public static final <T, R1 extends T, R2 extends T> T selectMapMode(Json json, SerialDescriptor serialDescriptor, de0 de0Var, de0 de0Var2) {
        json.getClass();
        serialDescriptor.getClass();
        de0Var.getClass();
        de0Var2.getClass();
        SerialDescriptor carrierDescriptor = carrierDescriptor(serialDescriptor.getElementDescriptor(0), json.getSerializersModule());
        SerialKind kind = carrierDescriptor.getKind();
        if (!(kind instanceof PrimitiveKind) && !sn0.r(kind, SerialKind.ENUM.INSTANCE)) {
            if (json.getConfiguration().getAllowStructuredMapKeys()) {
                return (T) de0Var2.invoke();
            }
            throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
        }
        return (T) de0Var.invoke();
    }

    public static final WriteMode switchMode(Json json, SerialDescriptor serialDescriptor) {
        json.getClass();
        serialDescriptor.getClass();
        SerialKind kind = serialDescriptor.getKind();
        if (kind instanceof PolymorphicKind) {
            return WriteMode.POLY_OBJ;
        }
        if (sn0.r(kind, StructureKind.LIST.INSTANCE)) {
            return WriteMode.LIST;
        }
        if (sn0.r(kind, StructureKind.MAP.INSTANCE)) {
            SerialDescriptor carrierDescriptor = carrierDescriptor(serialDescriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = carrierDescriptor.getKind();
            if (!(kind2 instanceof PrimitiveKind) && !sn0.r(kind2, SerialKind.ENUM.INSTANCE)) {
                if (json.getConfiguration().getAllowStructuredMapKeys()) {
                    return WriteMode.LIST;
                }
                throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
            }
            return WriteMode.MAP;
        }
        return WriteMode.OBJ;
    }
}
