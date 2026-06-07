package kotlinx.serialization.modules;

import defpackage.oe0;
import defpackage.sn0;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0007H¦\u0002\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider;", "", "<init>", "()V", "invoke", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "", "Argless", "WithTypeArguments", "Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class ContextualProvider {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\nH\u0096\u0002J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider;", "serializer", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "invoke", "typeArgumentsSerializers", "", "equals", "", "other", "", "hashCode", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Argless extends ContextualProvider {
        private final KSerializer<?> serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Argless(KSerializer<?> kSerializer) {
            super(null);
            kSerializer.getClass();
            this.serializer = kSerializer;
        }

        public boolean equals(Object other) {
            if ((other instanceof Argless) && sn0.r(((Argless) other).serializer, this.serializer)) {
                return true;
            }
            return false;
        }

        public final KSerializer<?> getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode();
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public KSerializer<?> invoke(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            typeArgumentsSerializers.getClass();
            return this.serializer;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0005\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR1\u0010\u0005\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "Lkotlinx/serialization/modules/ContextualProvider;", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "provider", "<init>", "(Loe0;)V", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Loe0;", "getProvider", "()Loe0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class WithTypeArguments extends ContextualProvider {
        private final oe0 provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithTypeArguments(oe0 oe0Var) {
            super(null);
            oe0Var.getClass();
            this.provider = oe0Var;
        }

        public final oe0 getProvider() {
            return this.provider;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public KSerializer<?> invoke(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            typeArgumentsSerializers.getClass();
            return (KSerializer) this.provider.invoke(typeArgumentsSerializers);
        }
    }

    public /* synthetic */ ContextualProvider(yx yxVar) {
        this();
    }

    public abstract KSerializer<?> invoke(List<? extends KSerializer<?>> typeArgumentsSerializers);

    private ContextualProvider() {
    }
}
