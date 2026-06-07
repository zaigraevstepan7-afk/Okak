package kotlinx.serialization.modules;

import defpackage.f00;
import defpackage.l60;
import defpackage.se;
import defpackage.to0;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJC\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\b\u0002\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u000bH'¢\u0006\u0004\b\b\u0010\rJ9\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u0006\u0010\u000f\u001a\u00028\u0000H'¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0011\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8 X¡\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0001!¨\u0006\""}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "", "<init>", "()V", "T", "Lto0;", "kclass", "Lkotlinx/serialization/KSerializer;", "getContextual", "(Lto0;)Lkotlinx/serialization/KSerializer;", "kClass", "", "typeArgumentsSerializers", "(Lto0;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "baseClass", "value", "Lkotlinx/serialization/SerializationStrategy;", "getPolymorphic", "(Lto0;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "(Lto0;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "collector", "Lod2;", "dumpTo", "(Lkotlinx/serialization/modules/SerializersModuleCollector;)V", "", "getHasInterfaceContextualSerializers$kotlinx_serialization_core", "()Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations", "hasInterfaceContextualSerializers", "Lkotlinx/serialization/modules/SerialModuleImpl;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class SerializersModule {
    public /* synthetic */ SerializersModule(yx yxVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KSerializer getContextual$default(SerializersModule serializersModule, to0 to0Var, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = l60.e;
            }
            return serializersModule.getContextual(to0Var, list);
        }
        se.v("Super calls with default arguments not supported in this target, function: getContextual");
        return null;
    }

    @ExperimentalSerializationApi
    public abstract void dumpTo(SerializersModuleCollector collector);

    @ExperimentalSerializationApi
    @f00
    public final /* synthetic */ KSerializer getContextual(to0 kclass) {
        kclass.getClass();
        return getContextual(kclass, l60.e);
    }

    @ExperimentalSerializationApi
    public abstract <T> KSerializer<T> getContextual(to0 kClass, List<? extends KSerializer<?>> typeArgumentsSerializers);

    public abstract boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core();

    @ExperimentalSerializationApi
    public abstract <T> DeserializationStrategy<T> getPolymorphic(to0 baseClass, String serializedClassName);

    @ExperimentalSerializationApi
    public abstract <T> SerializationStrategy<T> getPolymorphic(to0 baseClass, T value);

    private SerializersModule() {
    }

    @InternalSerializationApi
    public static /* synthetic */ void getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations() {
    }
}
