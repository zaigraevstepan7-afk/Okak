package kotlinx.serialization.internal;

import defpackage.a20;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lkotlinx/serialization/internal/DoubleArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/DoubleArrayBuilder;", "<init>", "()V", "", "collectionSize", "([D)I", "toBuilder", "([D)Lkotlinx/serialization/internal/DoubleArrayBuilder;", "empty", "()[D", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "Lod2;", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/DoubleArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;[DI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class DoubleArraySerializer extends PrimitiveArraySerializer<Double, double[], DoubleArrayBuilder> implements KSerializer<double[]> {
    public static final DoubleArraySerializer INSTANCE = new DoubleArraySerializer();

    private DoubleArraySerializer() {
        super(BuiltinSerializersKt.serializer(a20.a));
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, DoubleArrayBuilder builder, boolean checkIndex) {
        decoder.getClass();
        builder.getClass();
        builder.append$kotlinx_serialization_core(decoder.decodeDoubleElement(getDescriptor(), index));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public DoubleArrayBuilder toBuilder(double[] dArr) {
        dArr.getClass();
        return new DoubleArrayBuilder(dArr);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder encoder, double[] content, int size) {
        encoder.getClass();
        content.getClass();
        for (int i = 0; i < size; i++) {
            encoder.encodeDoubleElement(getDescriptor(), i, content[i]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public double[] empty() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(double[] dArr) {
        dArr.getClass();
        return dArr.length;
    }
}
