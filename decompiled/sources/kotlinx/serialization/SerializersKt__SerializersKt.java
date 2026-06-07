package kotlinx.serialization;

import defpackage.cc2;
import defpackage.de0;
import defpackage.fp0;
import defpackage.se;
import defpackage.sn0;
import defpackage.to0;
import defpackage.uo0;
import defpackage.xd1;
import defpackage.yl1;
import defpackage.yn;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u001d\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\t\u001a=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\t\u001a!\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0012\u001aA\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0013\u001a#\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aI\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0013\u001a9\u0010\u001c\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001\u0018\u00010\f*\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0002\u0010\u001e\u001a+\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0011\u0010\u001e\u001aI\u0010#\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0000¢\u0006\u0004\b#\u0010$\u001a9\u0010'\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\fH\u0002¢\u0006\u0004\b%\u0010&\u001aI\u0010)\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0002¢\u0006\u0004\b(\u0010$\u001a3\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010,\u001a\u001b\u00100\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b0\u00101\u001a'\u00100\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u00102\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0004\b0\u00103\u001a9\u00100\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u00102\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000104H\u0001¢\u0006\u0004\b0\u00106\u001a'\u00107\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u00102\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0004\b7\u00103\u001a9\u00107\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u00102\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000104H\u0001¢\u0006\u0004\b7\u00106¨\u00068"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "Lfp0;", "type", "", "(Lfp0;)Lkotlinx/serialization/KSerializer;", "Lto0;", "kClass", "", "typeArgumentsSerializers", "", "isNullable", "(Lto0;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "serializerOrNull", "(Lkotlinx/serialization/modules/SerializersModule;Lfp0;)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;Lto0;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "failOnMissingTypeArgSerializer", "serializerByKTypeImpl$SerializersKt__SerializersKt", "(Lkotlinx/serialization/modules/SerializersModule;Lfp0;Z)Lkotlinx/serialization/KSerializer;", "serializerByKTypeImpl", "rootClass", "serializerByKClassImpl$SerializersKt__SerializersKt", "serializerByKClassImpl", "typeArguments", "serializersForParameters", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/util/List;Z)Ljava/util/List;", "(Lto0;)Lkotlinx/serialization/KSerializer;", "serializers", "Lkotlin/Function0;", "Luo0;", "elementClassifierIfArray", "parametrizedSerializerOrNull", "(Lto0;Ljava/util/List;Lde0;)Lkotlinx/serialization/KSerializer;", "compiledParametrizedSerializer$SerializersKt__SerializersKt", "(Lto0;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "compiledParametrizedSerializer", "builtinParametrizedSerializer$SerializersKt__SerializersKt", "builtinParametrizedSerializer", "shouldBeNullable", "nullable$SerializersKt__SerializersKt", "(Lkotlinx/serialization/KSerializer;Z)Lkotlinx/serialization/KSerializer;", "nullable", "", "forClass", "noCompiledSerializer", "(Ljava/lang/String;)Lkotlinx/serialization/KSerializer;", "module", "(Lkotlinx/serialization/modules/SerializersModule;Lto0;)Lkotlinx/serialization/KSerializer;", "", "argSerializers", "(Lkotlinx/serialization/modules/SerializersModule;Lto0;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "moduleThenPolymorphic", "kotlinx-serialization-core"}, k = 5, mv = {2, 2, 0}, xi = yq1.f, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes.dex */
public final /* synthetic */ class SerializersKt__SerializersKt {
    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(to0 to0Var, List<? extends KSerializer<Object>> list, de0 de0Var) {
        if (!sn0.r(to0Var, yl1.a(Collection.class)) && !sn0.r(to0Var, yl1.a(List.class)) && !sn0.r(to0Var, yl1.a(List.class)) && !sn0.r(to0Var, yl1.a(ArrayList.class))) {
            if (sn0.r(to0Var, yl1.a(HashSet.class))) {
                return new HashSetSerializer(list.get(0));
            }
            if (!sn0.r(to0Var, yl1.a(Set.class)) && !sn0.r(to0Var, yl1.a(Set.class)) && !sn0.r(to0Var, yl1.a(LinkedHashSet.class))) {
                if (sn0.r(to0Var, yl1.a(HashMap.class))) {
                    return new HashMapSerializer(list.get(0), list.get(1));
                }
                if (!sn0.r(to0Var, yl1.a(Map.class)) && !sn0.r(to0Var, yl1.a(Map.class)) && !sn0.r(to0Var, yl1.a(LinkedHashMap.class))) {
                    if (sn0.r(to0Var, yl1.a(Map.Entry.class))) {
                        return BuiltinSerializersKt.MapEntrySerializer(list.get(0), list.get(1));
                    }
                    if (sn0.r(to0Var, yl1.a(xd1.class))) {
                        return BuiltinSerializersKt.PairSerializer(list.get(0), list.get(1));
                    }
                    if (sn0.r(to0Var, yl1.a(cc2.class))) {
                        return BuiltinSerializersKt.TripleSerializer(list.get(0), list.get(1), list.get(2));
                    }
                    if (PlatformKt.isReferenceArray(to0Var)) {
                        Object invoke = de0Var.invoke();
                        invoke.getClass();
                        return BuiltinSerializersKt.ArraySerializer((to0) invoke, list.get(0));
                    }
                    return null;
                }
                return new LinkedHashMapSerializer(list.get(0), list.get(1));
            }
            return new LinkedHashSetSerializer(list.get(0));
        }
        return new ArrayListSerializer(list.get(0));
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(to0 to0Var, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(to0Var, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule serializersModule, to0 to0Var, KSerializer<?>[] kSerializerArr) {
        serializersModule.getClass();
        to0Var.getClass();
        kSerializerArr.getClass();
        List<? extends KSerializer<?>> asList = Arrays.asList(kSerializerArr);
        asList.getClass();
        KSerializer<?> contextual = serializersModule.getContextual(to0Var, asList);
        if (contextual == null) {
            return new PolymorphicSerializer(to0Var);
        }
        return contextual;
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule serializersModule, to0 to0Var, KSerializer<?>[] kSerializerArr) {
        serializersModule.getClass();
        to0Var.getClass();
        kSerializerArr.getClass();
        List<? extends KSerializer<?>> asList = Arrays.asList(kSerializerArr);
        asList.getClass();
        KSerializer<?> contextual = serializersModule.getContextual(to0Var, asList);
        if (contextual != null) {
            return contextual;
        }
        Platform_commonKt.serializerNotRegistered(to0Var);
        se.c();
        return null;
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> kSerializer, boolean z) {
        if (z) {
            return BuiltinSerializersKt.getNullable(kSerializer);
        }
        kSerializer.getClass();
        return kSerializer;
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(to0 to0Var, List<? extends KSerializer<Object>> list, de0 de0Var) {
        to0Var.getClass();
        list.getClass();
        de0Var.getClass();
        KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt(to0Var, list, de0Var);
        if (builtinParametrizedSerializer$SerializersKt__SerializersKt == null) {
            return compiledParametrizedSerializer$SerializersKt__SerializersKt(to0Var, list);
        }
        return builtinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, fp0 fp0Var) {
        serializersModule.getClass();
        fp0Var.getClass();
        KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, fp0Var, true);
        if (serializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return serializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(fp0Var));
        se.c();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, de0] */
    private static final KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, to0 to0Var, List<? extends KSerializer<Object>> list, boolean z) {
        KSerializer<? extends Object> kSerializer;
        if (list.isEmpty()) {
            kSerializer = SerializersKt.serializerOrNull(to0Var);
            if (kSerializer == null) {
                kSerializer = SerializersModule.getContextual$default(serializersModule, to0Var, null, 2, null);
            }
        } else {
            try {
                KSerializer<? extends Object> parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(to0Var, list, new Object());
                if (parametrizedSerializerOrNull == null) {
                    kSerializer = serializersModule.getContextual(to0Var, list);
                } else {
                    kSerializer = parametrizedSerializerOrNull;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
        }
        if (kSerializer == null) {
            return null;
        }
        return nullable$SerializersKt__SerializersKt(kSerializer, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uo0 serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlinx.serialization.KSerializer<java.lang.Object> serializerByKTypeImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule r6, defpackage.fp0 r7, boolean r8) {
        /*
            to0 r0 = kotlinx.serialization.internal.Platform_commonKt.kclass(r7)
            boolean r1 = r7.isMarkedNullable()
            java.util.List r7 = r7.getArguments()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.yn.a0(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r3 = r7.hasNext()
            r4 = 0
            if (r3 == 0) goto L34
            java.lang.Object r3 = r7.next()
            if (r3 != 0) goto L30
            fp0 r3 = kotlinx.serialization.internal.Platform_commonKt.typeOrThrow(r4)
            r2.add(r3)
            goto L1b
        L30:
            defpackage.se.s()
            return r4
        L34:
            boolean r7 = r2.isEmpty()
            r3 = 2
            if (r7 == 0) goto L4e
            boolean r7 = kotlinx.serialization.internal.PlatformKt.isInterface(r0)
            if (r7 == 0) goto L49
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.modules.SerializersModule.getContextual$default(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L49
        L47:
            r7 = r4
            goto L60
        L49:
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.SerializersCacheKt.findCachedSerializer(r0, r1)
            goto L60
        L4e:
            boolean r7 = r6.getHasInterfaceContextualSerializers()
            if (r7 == 0) goto L55
            goto L47
        L55:
            java.lang.Object r7 = kotlinx.serialization.SerializersCacheKt.findParametrizedCachedSerializer(r0, r2, r1)
            boolean r5 = r7 instanceof defpackage.fo1
            if (r5 == 0) goto L5e
            r7 = r4
        L5e:
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7
        L60:
            if (r7 == 0) goto L63
            return r7
        L63:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L84
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.SerializersKt.serializerOrNull(r0)
            if (r7 != 0) goto La9
            kotlinx.serialization.KSerializer r7 = kotlinx.serialization.modules.SerializersModule.getContextual$default(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La9
            boolean r6 = kotlinx.serialization.internal.PlatformKt.isInterface(r0)
            if (r6 == 0) goto L82
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
        L80:
            r7 = r6
            goto La9
        L82:
            r7 = r4
            goto La9
        L84:
            java.util.List r7 = kotlinx.serialization.SerializersKt.serializersForParameters(r6, r2, r8)
            if (r7 != 0) goto L8b
            goto Lb0
        L8b:
            kotlinx.serialization.b r8 = new kotlinx.serialization.b
            r8.<init>()
            kotlinx.serialization.KSerializer r8 = kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(r0, r7, r8)
            if (r8 != 0) goto La8
            kotlinx.serialization.KSerializer r7 = r6.getContextual(r0, r7)
            if (r7 != 0) goto La9
            boolean r6 = kotlinx.serialization.internal.PlatformKt.isInterface(r0)
            if (r6 == 0) goto L82
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r0)
            goto L80
        La8:
            r7 = r8
        La9:
            if (r7 == 0) goto Lb0
            kotlinx.serialization.KSerializer r6 = nullable$SerializersKt__SerializersKt(r7, r1)
            return r6
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersKt.serializerByKTypeImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule, fp0, boolean):kotlinx.serialization.KSerializer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uo0 serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List list) {
        return ((fp0) list.get(0)).getClassifier();
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(to0 to0Var) {
        to0Var.getClass();
        KSerializer<T> compiledSerializerImpl = PlatformKt.compiledSerializerImpl(to0Var);
        if (compiledSerializerImpl == null) {
            return PrimitivesKt.builtinSerializerOrNull(to0Var);
        }
        return compiledSerializerImpl;
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule serializersModule, List<? extends fp0> list, boolean z) {
        serializersModule.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(yn.a0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SerializersKt.serializer(serializersModule, (fp0) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(yn.a0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KSerializer<Object> serializerOrNull = SerializersKt.serializerOrNull(serializersModule, (fp0) it2.next());
            if (serializerOrNull == null) {
                return null;
            }
            arrayList2.add(serializerOrNull);
        }
        return arrayList2;
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, fp0 fp0Var) {
        serializersModule.getClass();
        fp0Var.getClass();
        return serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, fp0Var, false);
    }

    public static final KSerializer<Object> serializerOrNull(fp0 fp0Var) {
        fp0Var.getClass();
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), fp0Var);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        serializersModule.getClass();
        sn0.R();
        throw null;
    }

    public static final KSerializer<Object> serializer(fp0 fp0Var) {
        fp0Var.getClass();
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), fp0Var);
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule serializersModule, to0 to0Var) {
        serializersModule.getClass();
        to0Var.getClass();
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(serializersModule, to0Var, null, 2, null);
        return contextual$default == null ? new PolymorphicSerializer(to0Var) : contextual$default;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(to0 to0Var, List<? extends KSerializer<?>> list, boolean z) {
        to0Var.getClass();
        list.getClass();
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), to0Var, list, z);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        sn0.R();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule serializersModule, to0 to0Var, List<? extends KSerializer<?>> list, boolean z) {
        serializersModule.getClass();
        to0Var.getClass();
        list.getClass();
        KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt = serializerByKClassImpl$SerializersKt__SerializersKt(serializersModule, to0Var, list, z);
        if (serializerByKClassImpl$SerializersKt__SerializersKt != null) {
            return serializerByKClassImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(to0Var);
        se.c();
        return null;
    }

    public static final KSerializer<?> noCompiledSerializer(String str) {
        str.getClass();
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(str));
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule serializersModule, to0 to0Var) {
        serializersModule.getClass();
        to0Var.getClass();
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(serializersModule, to0Var, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        Platform_commonKt.serializerNotRegistered(to0Var);
        se.c();
        return null;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(to0 to0Var) {
        to0Var.getClass();
        KSerializer<T> serializerOrNull = SerializersKt.serializerOrNull(to0Var);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered(to0Var);
        se.c();
        return null;
    }
}
