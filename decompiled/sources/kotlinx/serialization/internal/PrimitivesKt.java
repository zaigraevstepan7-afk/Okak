package kotlinx.serialization.internal;

import defpackage.j32;
import defpackage.se;
import defpackage.to0;
import defpackage.yl1;
import defpackage.yq1;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\"\b\b\u0000\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"(\u0010\u0013\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "serialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "PrimitiveDescriptorSafe", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lod2;", "checkNameIsNotAPrimitive", "(Ljava/lang/String;)V", "capitalize", "(Ljava/lang/String;)Ljava/lang/String;", "", "T", "Lto0;", "Lkotlinx/serialization/KSerializer;", "builtinSerializerOrNull", "(Lto0;)Lkotlinx/serialization/KSerializer;", "", "BUILTIN_SERIALIZERS", "Ljava/util/Map;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PrimitivesKt {
    private static final Map<to0, KSerializer<?>> BUILTIN_SERIALIZERS = PlatformKt.initBuiltins();

    public static final SerialDescriptor PrimitiveDescriptorSafe(String str, PrimitiveKind primitiveKind) {
        str.getClass();
        primitiveKind.getClass();
        checkNameIsNotAPrimitive(str);
        return new PrimitiveSerialDescriptor(str, primitiveKind);
    }

    public static final <T> KSerializer<T> builtinSerializerOrNull(to0 to0Var) {
        to0Var.getClass();
        return (KSerializer) BUILTIN_SERIALIZERS.get(to0Var);
    }

    private static final String capitalize(String str) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                String valueOf2 = String.valueOf(charAt);
                valueOf2.getClass();
                Locale locale = Locale.ROOT;
                valueOf = valueOf2.toUpperCase(locale);
                valueOf.getClass();
                if (valueOf.length() > 1) {
                    if (charAt != 329) {
                        char charAt2 = valueOf.charAt(0);
                        String lowerCase = valueOf.substring(1).toLowerCase(locale);
                        lowerCase.getClass();
                        valueOf = charAt2 + lowerCase;
                    }
                } else {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            sb.append(str.substring(1));
            return sb.toString();
        }
        return str;
    }

    public static final void checkNameIsNotAPrimitive(String str) {
        str.getClass();
        for (KSerializer<?> kSerializer : BUILTIN_SERIALIZERS.values()) {
            if (str.equals(kSerializer.getDescriptor().getSerialName())) {
                se.h(j32.s("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + yl1.a(kSerializer.getClass()).d() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
    }
}
