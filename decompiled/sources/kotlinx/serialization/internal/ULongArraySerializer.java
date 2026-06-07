package kotlinx.serialization.internal;

import defpackage.bd2;
import defpackage.cd2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/serialization/internal/ULongArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lcd2;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lbd2;", "Lkotlinx/serialization/internal/ULongArrayBuilder;", "<init>", "()V", "", "collectionSize-QwZRm1k", "([J)I", "collectionSize", "toBuilder-QwZRm1k", "([J)Lkotlinx/serialization/internal/ULongArrayBuilder;", "toBuilder", "empty-Y2RjT0g", "()[J", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "Lod2;", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/ULongArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent-0q3Fkuo", "(Lkotlinx/serialization/encoding/CompositeEncoder;[JI)V", "writeContent", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public final class ULongArraySerializer extends PrimitiveArraySerializer<bd2, cd2, ULongArrayBuilder> implements KSerializer<cd2> {
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

    private ULongArraySerializer() {
        super(BuiltinSerializersKt.serializer(bd2.f));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m104collectionSizeQwZRm1k(((cd2) obj).e);
    }

    /* renamed from: collectionSize-QwZRm1k, reason: not valid java name */
    public int m104collectionSizeQwZRm1k(long[] jArr) {
        jArr.getClass();
        return jArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ cd2 empty() {
        return new cd2(m105emptyY2RjT0g());
    }

    /* renamed from: empty-Y2RjT0g, reason: not valid java name */
    public long[] m105emptyY2RjT0g() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, ULongArrayBuilder builder, boolean checkIndex) {
        decoder.getClass();
        builder.getClass();
        builder.m102appendVKZWuLQ$kotlinx_serialization_core(decoder.decodeInlineElement(getDescriptor(), index).decodeLong());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m106toBuilderQwZRm1k(((cd2) obj).e);
    }

    /* renamed from: toBuilder-QwZRm1k, reason: not valid java name */
    public ULongArrayBuilder m106toBuilderQwZRm1k(long[] jArr) {
        jArr.getClass();
        return new ULongArrayBuilder(jArr, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, cd2 cd2Var, int i) {
        m107writeContent0q3Fkuo(compositeEncoder, cd2Var.e, i);
    }

    /* renamed from: writeContent-0q3Fkuo, reason: not valid java name */
    public void m107writeContent0q3Fkuo(CompositeEncoder encoder, long[] content, int size) {
        encoder.getClass();
        content.getClass();
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeLong(content[i]);
        }
    }
}
