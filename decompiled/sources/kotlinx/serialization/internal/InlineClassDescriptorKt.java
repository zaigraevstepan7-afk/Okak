package kotlinx.serialization.internal;

import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"InlinePrimitiveDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "name", "", "primitiveSerializer", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class InlineClassDescriptorKt {
    @InternalSerializationApi
    public static final <T> SerialDescriptor InlinePrimitiveDescriptor(String str, final KSerializer<T> kSerializer) {
        str.getClass();
        kSerializer.getClass();
        return new InlineClassDescriptor(str, new GeneratedSerializer<T>() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{kSerializer};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public T deserialize(Decoder decoder) {
                decoder.getClass();
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public SerialDescriptor getDescriptor() {
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder, T value) {
                encoder.getClass();
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer<?>[] typeParametersSerializers() {
                return super.typeParametersSerializers();
            }
        });
    }
}
