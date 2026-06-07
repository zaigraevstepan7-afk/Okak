package kotlinx.serialization.internal;

import defpackage.a20;
import defpackage.al;
import defpackage.bd2;
import defpackage.cd2;
import defpackage.d32;
import defpackage.de0;
import defpackage.de2;
import defpackage.ed2;
import defpackage.fa0;
import defpackage.fd2;
import defpackage.fp;
import defpackage.fy0;
import defpackage.jx1;
import defpackage.lm0;
import defpackage.nz0;
import defpackage.od2;
import defpackage.pm;
import defpackage.qm0;
import defpackage.s40;
import defpackage.si;
import defpackage.to0;
import defpackage.tz0;
import defpackage.vc2;
import defpackage.wc2;
import defpackage.yc2;
import defpackage.yl1;
import defpackage.yq1;
import defpackage.zc2;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\b\u001a#\u0010\u000b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aM\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\t\"\n\b\u0001\u0010\u0010*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\u0011j\b\u0012\u0004\u0012\u00028\u0001`\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\n2\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aO\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u00192\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001f\u001aO\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u00192\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b \u0010\u001f\u001a%\u0010!\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b%\u0010$\u001aQ\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u00192\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b'\u0010\u001f\u001aM\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t2\u0006\u0010(\u001a\u00020\t2\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b)\u0010*\u001a!\u0010-\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.\u001a)\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b/\u00100\u001a+\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b1\u00100\u001a\u001d\u00103\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\nH\u0000¢\u0006\u0004\b3\u0010\f\u001a#\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r04H\u0000¢\u0006\u0004\b5\u00106\u001a\u001e\u0010:\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0082\b¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"T", "", "", "index", "getChecked", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "", "([ZI)Z", "", "Lto0;", "isInterface", "(Lto0;)Z", "Lkotlinx/serialization/KSerializer;", "compiledSerializerImpl", "(Lto0;)Lkotlinx/serialization/KSerializer;", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "toNativeArrayImpl", "(Ljava/util/ArrayList;Lto0;)[Ljava/lang/Object;", "", "platformSpecificSerializerNotRegistered", "(Lto0;)Ljava/lang/Void;", "Ljava/lang/Class;", "serializerNotRegistered", "(Ljava/lang/Class;)Ljava/lang/Void;", "args", "constructSerializerForGivenTypeArgs", "(Lto0;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "findInNamedCompanion", "findNamedCompanionByAnnotation", "(Ljava/lang/Class;)Ljava/lang/Object;", "isNotAnnotated", "(Ljava/lang/Class;)Z", "isPolymorphicSerializer", "jClass", "invokeSerializerOnDefaultCompanion", "companion", "invokeSerializerOnCompanion", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "companionName", "companionOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "createEnumSerializer", "(Ljava/lang/Class;)Lkotlinx/serialization/KSerializer;", "findObjectSerializer", "rootClass", "isReferenceArray", "", "initBuiltins", "()Ljava/util/Map;", "Lkotlin/Function0;", "Lod2;", "block", "loadSafe", "(Lde0;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PlatformKt {
    private static final Object companionOrNull(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> KSerializer<T> compiledSerializerImpl(to0 to0Var) {
        to0Var.getClass();
        return constructSerializerForGivenTypeArgs(to0Var, (KSerializer<Object>[]) new KSerializer[0]);
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        cls.getClass();
        kSerializerArr.getClass();
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        KSerializer<T> invokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (invokeSerializerOnDefaultCompanion != null) {
            return invokeSerializerOnDefaultCompanion;
        }
        KSerializer<T> findObjectSerializer = findObjectSerializer(cls);
        if (findObjectSerializer != null) {
            return findObjectSerializer;
        }
        KSerializer<T> findInNamedCompanion = findInNamedCompanion(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (findInNamedCompanion != null) {
            return findInNamedCompanion;
        }
        if (isPolymorphicSerializer(cls)) {
            return new PolymorphicSerializer(yl1.a(cls));
        }
        return null;
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        enumConstants.getClass();
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> KSerializer<T> findInNamedCompanion(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        Object obj;
        Field field;
        KSerializer<T> invokeSerializerOnCompanion;
        Object findNamedCompanionByAnnotation = findNamedCompanionByAnnotation(cls);
        if (findNamedCompanionByAnnotation != null && (invokeSerializerOnCompanion = invokeSerializerOnCompanion(findNamedCompanionByAnnotation, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return invokeSerializerOnCompanion;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            declaredClasses.getClass();
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = declaredClasses[i];
                    if (cls3.getSimpleName().equals("$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                } else if (!z) {
                }
            }
            cls2 = null;
            if (cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                obj = field.get(null);
            } else {
                obj = null;
            }
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final <T> Object findNamedCompanionByAnnotation(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        declaredClasses.getClass();
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i < length) {
                cls2 = declaredClasses[i];
                if (cls2.getAnnotation(NamedCompanion.class) != null) {
                    break;
                }
                i++;
            } else {
                cls2 = null;
                break;
            }
        }
        if (cls2 == null) {
            return null;
        }
        return companionOrNull(cls, cls2.getSimpleName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0053, code lost:
    
        if (r5 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.serialization.KSerializer<T> findObjectSerializer(java.lang.Class<T> r11) {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto La7
            java.lang.String r2 = "java."
            r3 = 0
            boolean r2 = defpackage.p32.D(r0, r2, r3)
            if (r2 != 0) goto La7
            java.lang.String r2 = "kotlin."
            boolean r0 = defpackage.p32.D(r0, r2, r3)
            if (r0 == 0) goto L1a
            goto La7
        L1a:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            r0.getClass()
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L25:
            r7 = 1
            if (r4 >= r2) goto L53
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = defpackage.sn0.r(r9, r10)
            if (r9 == 0) goto L50
            java.lang.Class r9 = r8.getType()
            boolean r9 = defpackage.sn0.r(r9, r11)
            if (r9 == 0) goto L50
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L50
            if (r5 == 0) goto L4e
        L4c:
            r6 = r1
            goto L56
        L4e:
            r5 = r7
            r6 = r8
        L50:
            int r4 = r4 + 1
            goto L25
        L53:
            if (r5 != 0) goto L56
            goto L4c
        L56:
            if (r6 != 0) goto L59
            goto La7
        L59:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            r11.getClass()
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L67:
            if (r3 >= r2) goto L96
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = defpackage.sn0.r(r8, r9)
            if (r8 == 0) goto L93
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L93
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r9 = kotlinx.serialization.KSerializer.class
            boolean r8 = defpackage.sn0.r(r8, r9)
            if (r8 == 0) goto L93
            if (r4 == 0) goto L91
        L8f:
            r5 = r1
            goto L99
        L91:
            r5 = r6
            r4 = r7
        L93:
            int r3 = r3 + 1
            goto L67
        L96:
            if (r4 != 0) goto L99
            goto L8f
        L99:
            if (r5 != 0) goto L9c
            goto La7
        L9c:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto La7
            kotlinx.serialization.KSerializer r11 = (kotlinx.serialization.KSerializer) r11
            return r11
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PlatformKt.findObjectSerializer(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    public static final <T> T getChecked(T[] tArr, int i) {
        tArr.getClass();
        return tArr[i];
    }

    public static final Map<to0, KSerializer<?>> initBuiltins() {
        nz0 nz0Var = new nz0(8);
        nz0Var.put(yl1.a(String.class), BuiltinSerializersKt.serializer(d32.a));
        nz0Var.put(yl1.a(Character.TYPE), BuiltinSerializersKt.serializer(pm.a));
        nz0Var.put(yl1.a(char[].class), BuiltinSerializersKt.CharArraySerializer());
        nz0Var.put(yl1.a(Double.TYPE), BuiltinSerializersKt.serializer(a20.a));
        nz0Var.put(yl1.a(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
        nz0Var.put(yl1.a(Float.TYPE), BuiltinSerializersKt.serializer(fa0.a));
        nz0Var.put(yl1.a(float[].class), BuiltinSerializersKt.FloatArraySerializer());
        nz0Var.put(yl1.a(Long.TYPE), BuiltinSerializersKt.serializer(fy0.a));
        nz0Var.put(yl1.a(long[].class), BuiltinSerializersKt.LongArraySerializer());
        nz0Var.put(yl1.a(bd2.class), BuiltinSerializersKt.serializer(bd2.f));
        nz0Var.put(yl1.a(Integer.TYPE), BuiltinSerializersKt.serializer(qm0.a));
        nz0Var.put(yl1.a(int[].class), BuiltinSerializersKt.IntArraySerializer());
        nz0Var.put(yl1.a(yc2.class), BuiltinSerializersKt.serializer(yc2.f));
        nz0Var.put(yl1.a(Short.TYPE), BuiltinSerializersKt.serializer(jx1.a));
        nz0Var.put(yl1.a(short[].class), BuiltinSerializersKt.ShortArraySerializer());
        nz0Var.put(yl1.a(ed2.class), BuiltinSerializersKt.serializer(ed2.f));
        nz0Var.put(yl1.a(Byte.TYPE), BuiltinSerializersKt.serializer(al.a));
        nz0Var.put(yl1.a(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
        nz0Var.put(yl1.a(vc2.class), BuiltinSerializersKt.serializer(vc2.f));
        nz0Var.put(yl1.a(Boolean.TYPE), BuiltinSerializersKt.serializer(si.a));
        nz0Var.put(yl1.a(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
        nz0Var.put(yl1.a(od2.class), BuiltinSerializersKt.serializer(od2.a));
        nz0Var.put(yl1.a(Void.class), BuiltinSerializersKt.NothingSerializer());
        try {
            nz0Var.put(yl1.a(s40.class), BuiltinSerializersKt.serializer(s40.f));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            nz0Var.put(yl1.a(cd2.class), BuiltinSerializersKt.ULongArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            nz0Var.put(yl1.a(zc2.class), BuiltinSerializersKt.UIntArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            nz0Var.put(yl1.a(fd2.class), BuiltinSerializersKt.UShortArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            nz0Var.put(yl1.a(wc2.class), BuiltinSerializersKt.UByteArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            nz0Var.put(yl1.a(de2.class), BuiltinSerializersKt.serializer(de2.g));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            nz0Var.put(yl1.a(lm0.class), BuiltinSerializersKt.serializer(lm0.g));
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        return tz0.a0(nz0Var);
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object obj, KSerializer<Object>... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (!(invoke instanceof KSerializer)) {
                return null;
            }
            return (KSerializer) invoke;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object companionOrNull = companionOrNull(cls, "Companion");
        if (companionOrNull == null) {
            return null;
        }
        return invokeSerializerOnCompanion(companionOrNull, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> boolean isInterface(to0 to0Var) {
        to0Var.getClass();
        return fp.D(to0Var).isInterface();
    }

    private static final <T> boolean isNotAnnotated(Class<T> cls) {
        if (cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null) {
            return true;
        }
        return false;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> cls) {
        if (cls.getAnnotation(Polymorphic.class) == null) {
            Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
            if (serializable != null && yl1.a(serializable.with()).equals(yl1.a(PolymorphicSerializer.class))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean isReferenceArray(to0 to0Var) {
        to0Var.getClass();
        return fp.D(to0Var).isArray();
    }

    private static final void loadSafe(de0 de0Var) {
        try {
            de0Var.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }

    public static final Void platformSpecificSerializerNotRegistered(to0 to0Var) {
        to0Var.getClass();
        Platform_commonKt.serializerNotRegistered(to0Var);
        throw new RuntimeException();
    }

    public static final Void serializerNotRegistered(Class<?> cls) {
        cls.getClass();
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(yl1.a(cls)));
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> arrayList, to0 to0Var) {
        arrayList.getClass();
        to0Var.getClass();
        Object newInstance = Array.newInstance((Class<?>) fp.D(to0Var), arrayList.size());
        newInstance.getClass();
        E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
        eArr.getClass();
        return eArr;
    }

    public static final boolean getChecked(boolean[] zArr, int i) {
        zArr.getClass();
        return zArr[i];
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(to0 to0Var, KSerializer<Object>... kSerializerArr) {
        to0Var.getClass();
        kSerializerArr.getClass();
        return constructSerializerForGivenTypeArgs(fp.D(to0Var), (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }
}
