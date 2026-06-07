package kotlinx.serialization.internal;

import defpackage.vc2;
import defpackage.wc2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/serialization/internal/UByteArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lwc2;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lvc2;", "Lkotlinx/serialization/internal/UByteArrayBuilder;", "<init>", "()V", "", "collectionSize-GBYM_sE", "([B)I", "collectionSize", "toBuilder-GBYM_sE", "([B)Lkotlinx/serialization/internal/UByteArrayBuilder;", "toBuilder", "empty-TcUX1vc", "()[B", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "Lod2;", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UByteArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent-Coi6ktg", "(Lkotlinx/serialization/encoding/CompositeEncoder;[BI)V", "writeContent", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public final class UByteArraySerializer extends PrimitiveArraySerializer<vc2, wc2, UByteArrayBuilder> implements KSerializer<wc2> {
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

    private UByteArraySerializer() {
        super(BuiltinSerializersKt.serializer(vc2.f));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m88collectionSizeGBYM_sE(((wc2) obj).e);
    }

    /* renamed from: collectionSize-GBYM_sE, reason: not valid java name */
    public int m88collectionSizeGBYM_sE(byte[] bArr) {
        bArr.getClass();
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ wc2 empty() {
        return new wc2(m89emptyTcUX1vc());
    }

    /* renamed from: empty-TcUX1vc, reason: not valid java name */
    public byte[] m89emptyTcUX1vc() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, UByteArrayBuilder builder, boolean checkIndex) {
        decoder.getClass();
        builder.getClass();
        builder.m86append7apg3OU$kotlinx_serialization_core(decoder.decodeInlineElement(getDescriptor(), index).decodeByte());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m90toBuilderGBYM_sE(((wc2) obj).e);
    }

    /* renamed from: toBuilder-GBYM_sE, reason: not valid java name */
    public UByteArrayBuilder m90toBuilderGBYM_sE(byte[] bArr) {
        bArr.getClass();
        return new UByteArrayBuilder(bArr, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, wc2 wc2Var, int i) {
        m91writeContentCoi6ktg(compositeEncoder, wc2Var.e, i);
    }

    /* renamed from: writeContent-Coi6ktg, reason: not valid java name */
    public void m91writeContentCoi6ktg(CompositeEncoder encoder, byte[] content, int size) {
        encoder.getClass();
        content.getClass();
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeByte(content[i]);
        }
    }
}
