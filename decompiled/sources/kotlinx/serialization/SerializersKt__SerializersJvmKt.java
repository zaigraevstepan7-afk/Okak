package kotlinx.serialization;

import defpackage.bf;
import defpackage.cc2;
import defpackage.cn;
import defpackage.l60;
import defpackage.se;
import defpackage.to0;
import defpackage.xd1;
import defpackage.y61;
import defpackage.yl1;
import defpackage.yn;
import defpackage.yq1;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\n\u001a-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\r\u001aG\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0002*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\f2\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0012H\u0002¢\u0006\u0002\b\u0013\u001a)\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\u0016\u001a\u0015\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\f*\u00020\u0004H\u0002¢\u0006\u0002\b\u0018¨\u0006\u0019"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", "", "type", "Ljava/lang/reflect/Type;", "serializerOrNull", "Lkotlinx/serialization/modules/SerializersModule;", "serializerByJavaTypeImpl", "failOnMissingTypeArgSerializer", "", "serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt", "typeSerializer", "Ljava/lang/Class;", "typeSerializer$SerializersKt__SerializersJvmKt", "reflectiveOrContextual", "T", "jClass", "typeArgumentsSerializers", "", "reflectiveOrContextual$SerializersKt__SerializersJvmKt", "genericArraySerializer", "Ljava/lang/reflect/GenericArrayType;", "genericArraySerializer$SerializersKt__SerializersJvmKt", "prettyClass", "prettyClass$SerializersKt__SerializersJvmKt", "kotlinx-serialization-core"}, k = 5, mv = {2, 2, 0}, xi = yq1.f, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes.dex */
public final /* synthetic */ class SerializersKt__SerializersJvmKt {
    private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, GenericArrayType genericArrayType, boolean z) {
        KSerializer<Object> serializerOrNull;
        to0 to0Var;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            upperBounds.getClass();
            genericComponentType = (Type) bf.R(upperBounds);
        }
        genericComponentType.getClass();
        if (z) {
            serializerOrNull = SerializersKt.serializer(serializersModule, genericComponentType);
        } else {
            serializerOrNull = SerializersKt.serializerOrNull(serializersModule, genericComponentType);
            if (serializerOrNull == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            rawType.getClass();
            to0Var = yl1.a((Class) rawType);
        } else if (genericComponentType instanceof to0) {
            to0Var = (to0) genericComponentType;
        } else {
            se.g(yl1.a(genericComponentType.getClass()), "unsupported type in GenericArray: ");
            return null;
        }
        to0Var.getClass();
        KSerializer<Object> ArraySerializer = BuiltinSerializersKt.ArraySerializer(to0Var, serializerOrNull);
        ArraySerializer.getClass();
        return ArraySerializer;
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object R = bf.R(upperBounds);
            R.getClass();
            return prettyClass$SerializersKt__SerializersJvmKt((Type) R);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        y61.t(sb, " has type ", yl1.a(type.getClass()));
        return null;
    }

    private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Class<T> cls, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> constructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(cls, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (constructSerializerForGivenTypeArgs != null) {
            return constructSerializerForGivenTypeArgs;
        }
        cls.getClass();
        cn a = yl1.a(cls);
        KSerializer<T> builtinSerializerOrNull = PrimitivesKt.builtinSerializerOrNull(a);
        if (builtinSerializerOrNull == null) {
            KSerializer<T> contextual = serializersModule.getContextual(a, list);
            if (contextual == null) {
                if (cls.isInterface()) {
                    return new PolymorphicSerializer(yl1.a(cls));
                }
                return null;
            }
            return contextual;
        }
        return builtinSerializerOrNull;
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, Type type) {
        serializersModule.getClass();
        type.getClass();
        KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, true);
        if (serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        se.c();
        return null;
    }

    private static final KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Type type, boolean z) {
        ArrayList<KSerializer> arrayList;
        if (type instanceof GenericArrayType) {
            return genericArraySerializer$SerializersKt__SerializersJvmKt(serializersModule, (GenericArrayType) type, z);
        }
        if (type instanceof Class) {
            return typeSerializer$SerializersKt__SerializersJvmKt(serializersModule, (Class) type, z);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            rawType.getClass();
            Class cls = (Class) rawType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            actualTypeArguments.getClass();
            if (z) {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    type2.getClass();
                    arrayList.add(SerializersKt.serializer(serializersModule, type2));
                }
            } else {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    type3.getClass();
                    KSerializer<Object> serializerOrNull = SerializersKt.serializerOrNull(serializersModule, type3);
                    if (serializerOrNull == null) {
                        return null;
                    }
                    arrayList.add(serializerOrNull);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                KSerializer<Object> SetSerializer = BuiltinSerializersKt.SetSerializer((KSerializer) arrayList.get(0));
                SetSerializer.getClass();
                return SetSerializer;
            }
            if (!List.class.isAssignableFrom(cls) && !Collection.class.isAssignableFrom(cls)) {
                if (Map.class.isAssignableFrom(cls)) {
                    KSerializer<Object> MapSerializer = BuiltinSerializersKt.MapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    MapSerializer.getClass();
                    return MapSerializer;
                }
                if (Map.Entry.class.isAssignableFrom(cls)) {
                    KSerializer<Object> MapEntrySerializer = BuiltinSerializersKt.MapEntrySerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    MapEntrySerializer.getClass();
                    return MapEntrySerializer;
                }
                if (xd1.class.isAssignableFrom(cls)) {
                    KSerializer<xd1> PairSerializer = BuiltinSerializersKt.PairSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    PairSerializer.getClass();
                    return PairSerializer;
                }
                if (cc2.class.isAssignableFrom(cls)) {
                    KSerializer<cc2> TripleSerializer = BuiltinSerializersKt.TripleSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                    TripleSerializer.getClass();
                    return TripleSerializer;
                }
                ArrayList arrayList2 = new ArrayList(yn.a0(arrayList, 10));
                for (KSerializer kSerializer : arrayList) {
                    kSerializer.getClass();
                    arrayList2.add(kSerializer);
                }
                return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, arrayList2);
            }
            KSerializer<Object> ListSerializer = BuiltinSerializersKt.ListSerializer((KSerializer) arrayList.get(0));
            ListSerializer.getClass();
            return ListSerializer;
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object R = bf.R(upperBounds);
            R.getClass();
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(serializersModule, (Type) R, false, 2, null);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        y61.t(sb, " has type ", yl1.a(type.getClass()));
        return null;
    }

    public static /* synthetic */ KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule serializersModule, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, z);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        type.getClass();
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Class<?> cls, boolean z) {
        KSerializer<Object> serializerOrNull;
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (z) {
                serializerOrNull = SerializersKt.serializer(serializersModule, componentType);
            } else {
                serializerOrNull = SerializersKt.serializerOrNull(serializersModule, componentType);
                if (serializerOrNull == null) {
                    return null;
                }
            }
            KSerializer<Object> ArraySerializer = BuiltinSerializersKt.ArraySerializer(yl1.a(componentType), serializerOrNull);
            ArraySerializer.getClass();
            return ArraySerializer;
        }
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, l60.e);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, Type type) {
        serializersModule.getClass();
        type.getClass();
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, false);
    }

    public static final KSerializer<Object> serializer(Type type) {
        type.getClass();
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }
}
