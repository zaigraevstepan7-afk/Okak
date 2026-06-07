package kotlinx.serialization.modules;

import defpackage.f00;
import defpackage.oe0;
import defpackage.to0;
import defpackage.xd1;
import defpackage.y61;
import defpackage.yq1;
import defpackage.yx;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001B)\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\n\u001a\u00020\f\"\b\b\u0001\u0010\t*\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\n\u0010\bJ+\u0010\u0011\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\u00020\f2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f0\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR6\u0010\u001d\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00050\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R.\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "", "Base", "Lto0;", "baseClass", "Lkotlinx/serialization/KSerializer;", "baseSerializer", "<init>", "(Lto0;Lkotlinx/serialization/KSerializer;)V", "T", "subclass", "serializer", "Lod2;", "Lkotlin/Function1;", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "defaultDeserializer", "(Loe0;)V", "defaultSerializerProvider", "default", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "builder", "buildTo", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;)V", "Lto0;", "Lkotlinx/serialization/KSerializer;", "", "Lxd1;", "subclasses", "Ljava/util/List;", "Lkotlinx/serialization/SerializationStrategy;", "Loe0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PolymorphicModuleBuilder<Base> {
    private final to0 baseClass;
    private final KSerializer<Base> baseSerializer;
    private oe0 defaultDeserializerProvider;
    private oe0 defaultSerializerProvider;
    private final List<xd1> subclasses;

    public PolymorphicModuleBuilder(to0 to0Var, KSerializer<Base> kSerializer) {
        to0Var.getClass();
        this.baseClass = to0Var;
        this.baseSerializer = kSerializer;
        this.subclasses = new ArrayList();
    }

    public final void buildTo(SerializersModuleBuilder builder) {
        SerializersModuleBuilder serializersModuleBuilder;
        builder.getClass();
        KSerializer<Base> kSerializer = this.baseSerializer;
        if (kSerializer != null) {
            to0 to0Var = this.baseClass;
            serializersModuleBuilder = builder;
            SerializersModuleBuilder.registerPolymorphicSerializer$default(serializersModuleBuilder, to0Var, to0Var, kSerializer, false, 8, null);
        } else {
            serializersModuleBuilder = builder;
        }
        for (xd1 xd1Var : this.subclasses) {
            to0 to0Var2 = (to0) xd1Var.e;
            KSerializer kSerializer2 = (KSerializer) xd1Var.f;
            to0 to0Var3 = this.baseClass;
            to0Var2.getClass();
            kSerializer2.getClass();
            SerializersModuleBuilder.registerPolymorphicSerializer$default(serializersModuleBuilder, to0Var3, to0Var2, kSerializer2, false, 8, null);
        }
        oe0 oe0Var = this.defaultSerializerProvider;
        if (oe0Var != null) {
            serializersModuleBuilder.registerDefaultPolymorphicSerializer(this.baseClass, oe0Var, false);
        }
        oe0 oe0Var2 = this.defaultDeserializerProvider;
        if (oe0Var2 != null) {
            serializersModuleBuilder.registerDefaultPolymorphicDeserializer(this.baseClass, oe0Var2, false);
        }
    }

    @f00
    /* renamed from: default, reason: not valid java name */
    public final void m124default(oe0 defaultSerializerProvider) {
        defaultSerializerProvider.getClass();
        defaultDeserializer(defaultSerializerProvider);
    }

    public final void defaultDeserializer(oe0 defaultDeserializerProvider) {
        defaultDeserializerProvider.getClass();
        if (this.defaultDeserializerProvider == null) {
            this.defaultDeserializerProvider = defaultDeserializerProvider;
            return;
        }
        StringBuilder sb = new StringBuilder("Default deserializer provider is already registered for class ");
        sb.append(this.baseClass);
        y61.p(sb, ": ", this.defaultDeserializerProvider);
    }

    public final <T extends Base> void subclass(to0 subclass, KSerializer<T> serializer) {
        subclass.getClass();
        serializer.getClass();
        this.subclasses.add(new xd1(subclass, serializer));
    }

    public /* synthetic */ PolymorphicModuleBuilder(to0 to0Var, KSerializer kSerializer, int i, yx yxVar) {
        this(to0Var, (i & 2) != 0 ? null : kSerializer);
    }
}
