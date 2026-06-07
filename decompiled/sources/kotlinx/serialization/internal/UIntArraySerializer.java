package kotlinx.serialization.internal;

import defpackage.yc2;
import defpackage.yq1;
import defpackage.zc2;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/serialization/internal/UIntArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lzc2;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lyc2;", "Lkotlinx/serialization/internal/UIntArrayBuilder;", "<init>", "()V", "", "collectionSize--ajY-9A", "([I)I", "collectionSize", "toBuilder--ajY-9A", "([I)Lkotlinx/serialization/internal/UIntArrayBuilder;", "toBuilder", "empty--hP7Qyg", "()[I", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "Lod2;", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UIntArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent-CPlH8fI", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "writeContent", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public final class UIntArraySerializer extends PrimitiveArraySerializer<yc2, zc2, UIntArrayBuilder> implements KSerializer<zc2> {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    private UIntArraySerializer() {
        super(BuiltinSerializersKt.serializer(yc2.f));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m96collectionSizeajY9A(((zc2) obj).e);
    }

    /* renamed from: collectionSize--ajY-9A, reason: not valid java name */
    public int m96collectionSizeajY9A(int[] iArr) {
        iArr.getClass();
        return iArr.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ zc2 empty() {
        return new zc2(m97emptyhP7Qyg());
    }

    /* renamed from: empty--hP7Qyg, reason: not valid java name */
    public int[] m97emptyhP7Qyg() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, UIntArrayBuilder builder, boolean checkIndex) {
        decoder.getClass();
        builder.getClass();
        builder.m94appendWZ4Q5Ns$kotlinx_serialization_core(decoder.decodeInlineElement(getDescriptor(), index).decodeInt());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m98toBuilderajY9A(((zc2) obj).e);
    }

    /* renamed from: toBuilder--ajY-9A, reason: not valid java name */
    public UIntArrayBuilder m98toBuilderajY9A(int[] iArr) {
        iArr.getClass();
        return new UIntArrayBuilder(iArr, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, zc2 zc2Var, int i) {
        m99writeContentCPlH8fI(compositeEncoder, zc2Var.e, i);
    }

    /* renamed from: writeContent-CPlH8fI, reason: not valid java name */
    public void m99writeContentCPlH8fI(CompositeEncoder encoder, int[] content, int size) {
        encoder.getClass();
        content.getClass();
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeInt(content[i]);
        }
    }
}
