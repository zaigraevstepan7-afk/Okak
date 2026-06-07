package kotlinx.serialization.descriptors;

import defpackage.bf;
import defpackage.fp0;
import defpackage.i32;
import defpackage.l60;
import defpackage.nv1;
import defpackage.od2;
import defpackage.oe0;
import defpackage.se;
import defpackage.sn0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.HashMapClassDesc;
import kotlinx.serialization.internal.HashSetClassDesc;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.SerialDescriptorForNullable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00122\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0018\u0010\u0017\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0018\u0010\u001d\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0087\b¢\u0006\u0004\b\u001d\u0010\u0018\u001a\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0007¢\u0006\u0004\b!\u0010\"\u001a \u0010!\u001a\u00020\u0003\"\u0006\b\u0000\u0010#\u0018\u0001\"\u0006\b\u0001\u0010$\u0018\u0001H\u0087\b¢\u0006\u0004\b!\u0010\u0018\u001a\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010\u001e\u001a\u0018\u0010%\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0087\b¢\u0006\u0004\b%\u0010\u0018\u001a>\u0010,\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00062\u0006\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\b\b\u0002\u0010+\u001a\u00020*H\u0086\b¢\u0006\u0004\b,\u0010-\"\u001b\u00101\u001a\u00020\u0003*\u00020\u00038F¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001e\"\u001e\u00104\u001a\u00020\u0003*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001e¨\u00065"}, d2 = {"", "serialName", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameters", "Lkotlin/Function1;", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "Lod2;", "builderAction", "buildClassSerialDescriptor", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Loe0;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "PrimitiveSerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "SerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialKind;", "builder", "buildSerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;[Lkotlinx/serialization/descriptors/SerialDescriptor;Loe0;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "serialDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lfp0;", "type", "(Lfp0;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "listSerialDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "valueDescriptor", "mapSerialDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "K", "V", "setSerialDescriptor", "elementName", "", "", "annotations", "", "isOptional", "element", "(Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;Ljava/lang/String;Ljava/util/List;Z)V", "getNullable", "getNullable$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "nullable", "getNonNullOriginal", "getNonNullOriginal$annotations", "nonNullOriginal", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerialDescriptorsKt {
    public static final SerialDescriptor PrimitiveSerialDescriptor(String str, PrimitiveKind primitiveKind) {
        str.getClass();
        primitiveKind.getClass();
        if (!i32.N(str)) {
            return PrimitivesKt.PrimitiveDescriptorSafe(str, primitiveKind);
        }
        se.h("Blank serial names are prohibited");
        return null;
    }

    public static final SerialDescriptor SerialDescriptor(String str, SerialDescriptor serialDescriptor) {
        str.getClass();
        serialDescriptor.getClass();
        if (!i32.N(str)) {
            if (!str.equals(serialDescriptor.getSerialName())) {
                if (serialDescriptor.getKind() instanceof PrimitiveKind) {
                    PrimitivesKt.checkNameIsNotAPrimitive(str);
                }
                return new WrappedSerialDescriptor(str, serialDescriptor);
            }
            se.q("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (", serialDescriptor.getSerialName(), 41);
            return null;
        }
        se.h("Blank serial names are prohibited");
        return null;
    }

    public static final SerialDescriptor buildClassSerialDescriptor(String str, SerialDescriptor[] serialDescriptorArr, oe0 oe0Var) {
        str.getClass();
        serialDescriptorArr.getClass();
        oe0Var.getClass();
        if (!i32.N(str)) {
            ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
            oe0Var.invoke(classSerialDescriptorBuilder);
            return new SerialDescriptorImpl(str, StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), bf.e0(serialDescriptorArr), classSerialDescriptorBuilder);
        }
        se.h("Blank serial names are prohibited");
        return null;
    }

    public static /* synthetic */ SerialDescriptor buildClassSerialDescriptor$default(String str, SerialDescriptor[] serialDescriptorArr, oe0 oe0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            oe0Var = new nv1(0);
        }
        return buildClassSerialDescriptor(str, serialDescriptorArr, oe0Var);
    }

    public static final od2 buildClassSerialDescriptor$lambda$0(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        return od2.a;
    }

    @InternalSerializationApi
    public static final SerialDescriptor buildSerialDescriptor(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, oe0 oe0Var) {
        str.getClass();
        serialKind.getClass();
        serialDescriptorArr.getClass();
        oe0Var.getClass();
        if (!i32.N(str)) {
            if (!serialKind.equals(StructureKind.CLASS.INSTANCE)) {
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str);
                oe0Var.invoke(classSerialDescriptorBuilder);
                return new SerialDescriptorImpl(str, serialKind, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), bf.e0(serialDescriptorArr), classSerialDescriptorBuilder);
            }
            se.h("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        se.h("Blank serial names are prohibited");
        return null;
    }

    public static /* synthetic */ SerialDescriptor buildSerialDescriptor$default(String str, SerialKind serialKind, SerialDescriptor[] serialDescriptorArr, oe0 oe0Var, int i, Object obj) {
        if ((i & 8) != 0) {
            oe0Var = new nv1(1);
        }
        return buildSerialDescriptor(str, serialKind, serialDescriptorArr, oe0Var);
    }

    public static final od2 buildSerialDescriptor$lambda$5(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        return od2.a;
    }

    public static final /* synthetic */ <T> void element(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String str, List<? extends Annotation> list, boolean z) {
        classSerialDescriptorBuilder.getClass();
        str.getClass();
        list.getClass();
        sn0.R();
        throw null;
    }

    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String str, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            list = l60.e;
        }
        classSerialDescriptorBuilder.getClass();
        str.getClass();
        list.getClass();
        sn0.R();
        throw null;
    }

    public static final SerialDescriptor getNonNullOriginal(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof SerialDescriptorForNullable) {
            return ((SerialDescriptorForNullable) serialDescriptor).getOriginal();
        }
        return serialDescriptor;
    }

    public static final SerialDescriptor getNullable(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.isNullable()) {
            return serialDescriptor;
        }
        return new SerialDescriptorForNullable(serialDescriptor);
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor listSerialDescriptor(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return new ArrayListClassDesc(serialDescriptor);
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor mapSerialDescriptor(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        serialDescriptor.getClass();
        serialDescriptor2.getClass();
        return new HashMapClassDesc(serialDescriptor, serialDescriptor2);
    }

    public static final SerialDescriptor serialDescriptor(fp0 fp0Var) {
        fp0Var.getClass();
        return SerializersKt.serializer(fp0Var).getDescriptor();
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor setSerialDescriptor(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return new HashSetClassDesc(serialDescriptor);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor listSerialDescriptor() {
        sn0.R();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor setSerialDescriptor() {
        sn0.R();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <K, V> SerialDescriptor mapSerialDescriptor() {
        sn0.R();
        throw null;
    }

    public static final /* synthetic */ <T> SerialDescriptor serialDescriptor() {
        sn0.R();
        throw null;
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getNonNullOriginal$annotations(SerialDescriptor serialDescriptor) {
    }

    public static /* synthetic */ void getNullable$annotations(SerialDescriptor serialDescriptor) {
    }
}
