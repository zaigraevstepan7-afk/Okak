package kotlinx.serialization.internal;

import defpackage.qm0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/internal/IntArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/IntArrayBuilder;", "<init>", "()V", "collectionSize", "([I)I", "toBuilder", "([I)Lkotlinx/serialization/internal/IntArrayBuilder;", "empty", "()[I", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "Lod2;", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/IntArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class IntArraySerializer extends PrimitiveArraySerializer<Integer, int[], IntArrayBuilder> implements KSerializer<int[]> {
    public static final IntArraySerializer INSTANCE = new IntArraySerializer();

    private IntArraySerializer() {
        super(BuiltinSerializersKt.serializer(qm0.a));
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, IntArrayBuilder builder, boolean checkIndex) {
        decoder.getClass();
        builder.getClass();
        builder.append$kotlinx_serialization_core(decoder.decodeIntElement(getDescriptor(), index));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public IntArrayBuilder toBuilder(int[] iArr) {
        iArr.getClass();
        return new IntArrayBuilder(iArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder encoder, int[] content, int size) {
        encoder.getClass();
        content.getClass();
        for (int i = 0; i < size; i++) {
            encoder.encodeIntElement(getDescriptor(), i, content[i]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public int[] empty() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(int[] iArr) {
        iArr.getClass();
        return iArr.length;
    }
}
