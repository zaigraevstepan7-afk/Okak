package kotlinx.serialization.encoding;

import defpackage.oe0;
import defpackage.te0;
import defpackage.xn;
import defpackage.yq1;
import java.util.Collection;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2 \b\u0004\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lod2;", "block", "encodeStructure", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Loe0;)V", "", "collectionSize", "encodeCollection", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;ILoe0;)V", "E", "", "collection", "Lkotlin/Function3;", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/Collection;Lte0;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EncodingKt {
    public static final <E> void encodeCollection(Encoder encoder, SerialDescriptor serialDescriptor, Collection<? extends E> collection, te0 te0Var) {
        encoder.getClass();
        serialDescriptor.getClass();
        collection.getClass();
        te0Var.getClass();
        CompositeEncoder beginCollection = encoder.beginCollection(serialDescriptor, collection.size());
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            if (i >= 0) {
                te0Var.invoke(beginCollection, Integer.valueOf(i), obj);
                i = i2;
            } else {
                xn.U();
                throw null;
            }
        }
        beginCollection.endStructure(serialDescriptor);
    }

    public static final void encodeStructure(Encoder encoder, SerialDescriptor serialDescriptor, oe0 oe0Var) {
        encoder.getClass();
        serialDescriptor.getClass();
        oe0Var.getClass();
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        oe0Var.invoke(beginStructure);
        beginStructure.endStructure(serialDescriptor);
    }

    public static final void encodeCollection(Encoder encoder, SerialDescriptor serialDescriptor, int i, oe0 oe0Var) {
        encoder.getClass();
        serialDescriptor.getClass();
        oe0Var.getClass();
        CompositeEncoder beginCollection = encoder.beginCollection(serialDescriptor, i);
        oe0Var.invoke(beginCollection);
        beginCollection.endStructure(serialDescriptor);
    }
}
