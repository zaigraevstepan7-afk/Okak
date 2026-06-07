package kotlinx.serialization.encoding;

import defpackage.se;
import defpackage.yl1;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J5\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\n\b\u0002\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00122\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00182\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020!2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020$2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010MJ=\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bN\u0010OJC\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020\u00052\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bP\u0010O¨\u0006Q"}, d2 = {"Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "", "decodeValue", "()Ljava/lang/Object;", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "descriptor", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "Lod2;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "index", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public abstract class AbstractDecoder implements Decoder, CompositeDecoder {
    public static /* synthetic */ Object decodeSerializableValue$default(AbstractDecoder abstractDecoder, DeserializationStrategy deserializationStrategy, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                obj = null;
            }
            return abstractDecoder.decodeSerializableValue(deserializationStrategy, obj);
        }
        se.v("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Boolean) decodeValue).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeBoolean();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Byte) decodeValue).byteValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeByte();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Character) decodeValue).charValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeChar();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(SerialDescriptor serialDescriptor) {
        return super.decodeCollectionSize(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Double) decodeValue).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeDouble();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        enumDescriptor.getClass();
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Integer) decodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Float) decodeValue).floatValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeFloat();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        descriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Decoder decodeInlineElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeInline(descriptor.getElementDescriptor(index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Integer) decodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeInt();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Long) decodeValue).longValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeLong();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeNullableSerializableElement(SerialDescriptor descriptor, int index, DeserializationStrategy<? extends T> deserializer, T previousValue) {
        descriptor.getClass();
        deserializer.getClass();
        if (!deserializer.getDescriptor().isNullable() && !decodeNotNullMark()) {
            return (T) decodeNull();
        }
        return (T) decodeSerializableValue(deserializer, previousValue);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @ExperimentalSerializationApi
    public <T> T decodeNullableSerializableValue(DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) super.decodeNullableSerializableValue(deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @ExperimentalSerializationApi
    public boolean decodeSequentially() {
        return super.decodeSequentially();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(SerialDescriptor descriptor, int index, DeserializationStrategy<? extends T> deserializer, T previousValue) {
        descriptor.getClass();
        deserializer.getClass();
        return (T) decodeSerializableValue(deserializer, previousValue);
    }

    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer, T previousValue) {
        deserializer.getClass();
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Short) decodeValue).shortValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeShort();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return (String) decodeValue;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final String decodeStringElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeString();
    }

    public Object decodeValue() {
        throw new SerializationException(yl1.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) super.decodeSerializableValue(deserializationStrategy);
    }
}
