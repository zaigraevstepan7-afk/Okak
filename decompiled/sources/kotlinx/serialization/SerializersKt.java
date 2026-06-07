package kotlinx.serialization;

import defpackage.de0;
import defpackage.fp0;
import defpackage.sn0;
import defpackage.to0;
import defpackage.yq1;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, k = 4, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerializersKt {
    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule serializersModule, to0 to0Var) {
        return SerializersKt__SerializersKt.moduleThenPolymorphic(serializersModule, to0Var);
    }

    public static final KSerializer<?> noCompiledSerializer(String str) {
        return SerializersKt__SerializersKt.noCompiledSerializer(str);
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(to0 to0Var, List<? extends KSerializer<Object>> list, de0 de0Var) {
        return SerializersKt__SerializersKt.parametrizedSerializerOrNull(to0Var, list, de0Var);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        sn0.R();
        throw null;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(to0 to0Var) {
        return SerializersKt__SerializersKt.serializerOrNull(to0Var);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule serializersModule, List<? extends fp0> list, boolean z) {
        return SerializersKt__SerializersKt.serializersForParameters(serializersModule, list, z);
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule serializersModule, to0 to0Var, KSerializer<?>[] kSerializerArr) {
        return SerializersKt__SerializersKt.moduleThenPolymorphic(serializersModule, to0Var, kSerializerArr);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule serializersModule, to0 to0Var) {
        return SerializersKt__SerializersKt.noCompiledSerializer(serializersModule, to0Var);
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(to0 to0Var) {
        return SerializersKt__SerializersKt.serializer(to0Var);
    }

    public static final KSerializer<Object> serializerOrNull(fp0 fp0Var) {
        return SerializersKt__SerializersKt.serializerOrNull(fp0Var);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule serializersModule, to0 to0Var, KSerializer<?>[] kSerializerArr) {
        return SerializersKt__SerializersKt.noCompiledSerializer(serializersModule, to0Var, kSerializerArr);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(to0 to0Var, List<? extends KSerializer<?>> list, boolean z) {
        return SerializersKt__SerializersKt.serializer(to0Var, list, z);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull(type);
    }

    public static final KSerializer<Object> serializer(fp0 fp0Var) {
        return SerializersKt__SerializersKt.serializer(fp0Var);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, fp0 fp0Var) {
        return SerializersKt__SerializersKt.serializerOrNull(serializersModule, fp0Var);
    }

    public static final KSerializer<Object> serializer(Type type) {
        return SerializersKt__SerializersJvmKt.serializer(type);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull(serializersModule, type);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        sn0.R();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule serializersModule, to0 to0Var, List<? extends KSerializer<?>> list, boolean z) {
        return SerializersKt__SerializersKt.serializer(serializersModule, to0Var, list, z);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, fp0 fp0Var) {
        return SerializersKt__SerializersKt.serializer(serializersModule, fp0Var);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, Type type) {
        return SerializersKt__SerializersJvmKt.serializer(serializersModule, type);
    }
}
