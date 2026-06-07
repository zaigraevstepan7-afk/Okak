package kotlinx.serialization.internal;

import defpackage.de0;
import defpackage.m52;
import defpackage.wn;
import defpackage.xn;
import defpackage.yl1;
import defpackage.yq1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH$¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J3\u00107\u001a\u00028\u0001\"\n\b\u0001\u00103*\u0004\u0018\u00010\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u000f¢\u0006\u0004\b@\u0010=J\r\u0010A\u001a\u00020\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0019¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u001e¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020!¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020$¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020'¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020*¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020!2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\u00020$2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020'2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bf\u0010gJ\u001d\u0010h\u001a\u00020*2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bh\u0010iJ\u001d\u0010j\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bj\u0010kJA\u0010l\u001a\u00028\u0001\"\n\b\u0001\u00103*\u0004\u0018\u00010\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bl\u0010mJC\u0010n\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u00103*\u00020\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bn\u0010mJ\u0017\u0010p\u001a\u00020U2\u0006\u0010o\u001a\u00028\u0000H\u0004¢\u0006\u0004\bp\u0010qJ\u001d\u0010s\u001a\u00020U2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00028\u0000H\u0004¢\u0006\u0004\bu\u0010vJ+\u0010z\u001a\u00028\u0001\"\u0004\b\u0001\u0010w2\u0006\u0010\f\u001a\u00028\u00002\f\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00010xH\u0002¢\u0006\u0004\bz\u0010{R,\u0010~\u001a\u0012\u0012\u0004\u0012\u00028\u00000|j\b\u0012\u0004\u0012\u00028\u0000`}8\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0089\u0001\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010vR\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010v¨\u0006\u008c\u0001"}, d2 = {"Lkotlinx/serialization/internal/TaggedDecoder;", "", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "decodeTaggedValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "decodeTaggedNotNullMark", "(Ljava/lang/Object;)Z", "", "decodeTaggedNull", "(Ljava/lang/Object;)Ljava/lang/Void;", "decodeTaggedBoolean", "", "decodeTaggedByte", "(Ljava/lang/Object;)B", "", "decodeTaggedShort", "(Ljava/lang/Object;)S", "decodeTaggedInt", "(Ljava/lang/Object;)I", "", "decodeTaggedLong", "(Ljava/lang/Object;)J", "", "decodeTaggedFloat", "(Ljava/lang/Object;)F", "", "decodeTaggedDouble", "(Ljava/lang/Object;)D", "", "decodeTaggedChar", "(Ljava/lang/Object;)C", "", "decodeTaggedString", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "decodeTaggedEnum", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "decodeTaggedInline", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeNotNullMark", "()Z", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "decodeByte", "()B", "decodeShort", "()S", "decodeInt", "()I", "decodeLong", "()J", "decodeFloat", "()F", "decodeDouble", "()D", "decodeChar", "()C", "decodeString", "()Ljava/lang/String;", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "Lod2;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "name", "pushTag", "(Ljava/lang/Object;)V", "other", "copyTagsTo", "(Lkotlinx/serialization/internal/TaggedDecoder;)V", "popTag", "()Ljava/lang/Object;", "E", "Lkotlin/Function0;", "block", "tagBlock", "(Ljava/lang/Object;Lde0;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tagStack", "Ljava/util/ArrayList;", "getTagStack$kotlinx_serialization_core", "()Ljava/util/ArrayList;", "flag", "Z", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@InternalSerializationApi
/* loaded from: classes.dex */
public abstract class TaggedDecoder<Tag> implements Decoder, CompositeDecoder {
    private boolean flag;
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    public static final Object decodeNullableSerializableElement$lambda$3(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj) {
        if (!deserializationStrategy.getDescriptor().isNullable() && !taggedDecoder.decodeNotNullMark()) {
            return taggedDecoder.decodeNull();
        }
        return taggedDecoder.decodeSerializableValue(deserializationStrategy, obj);
    }

    private final <E> E tagBlock(Tag tag, de0 block) {
        pushTag(tag);
        E e = (E) block.invoke();
        if (!this.flag) {
            popTag();
        }
        this.flag = false;
        return e;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
        return this;
    }

    public final void copyTagsTo(TaggedDecoder<Tag> other) {
        other.getClass();
        other.tagStack.addAll(this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        return decodeTaggedBoolean(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedBoolean(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        return decodeTaggedByte(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedByte(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        return decodeTaggedChar(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedChar(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(SerialDescriptor serialDescriptor) {
        return super.decodeCollectionSize(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        return decodeTaggedDouble(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedDouble(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor enumDescriptor) {
        enumDescriptor.getClass();
        return decodeTaggedEnum(popTag(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        return decodeTaggedFloat(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedFloat(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        descriptor.getClass();
        return decodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Decoder decodeInlineElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedInline(getTag(descriptor, index), descriptor.getElementDescriptor(index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        return decodeTaggedInt(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedInt(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return decodeTaggedLong(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedLong(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        Tag currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            return false;
        }
        return decodeTaggedNotNullMark(currentTagOrNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeNullableSerializableElement(SerialDescriptor descriptor, int index, DeserializationStrategy<? extends T> deserializer, T previousValue) {
        descriptor.getClass();
        deserializer.getClass();
        return (T) tagBlock(getTag(descriptor, index), new m52(this, deserializer, previousValue, 1));
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
    public final <T> T decodeSerializableElement(SerialDescriptor descriptor, int index, DeserializationStrategy<? extends T> deserializer, T previousValue) {
        descriptor.getClass();
        deserializer.getClass();
        return (T) tagBlock(getTag(descriptor, index), new m52(this, deserializer, previousValue, 0));
    }

    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer, T previousValue) {
        deserializer.getClass();
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        return decodeTaggedShort(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedShort(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        return decodeTaggedString(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final String decodeStringElement(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return decodeTaggedString(getTag(descriptor, index));
    }

    public boolean decodeTaggedBoolean(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Boolean) decodeTaggedValue).booleanValue();
    }

    public byte decodeTaggedByte(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Byte) decodeTaggedValue).byteValue();
    }

    public char decodeTaggedChar(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Character) decodeTaggedValue).charValue();
    }

    public double decodeTaggedDouble(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Double) decodeTaggedValue).doubleValue();
    }

    public int decodeTaggedEnum(Tag tag, SerialDescriptor enumDescriptor) {
        enumDescriptor.getClass();
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Integer) decodeTaggedValue).intValue();
    }

    public float decodeTaggedFloat(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Float) decodeTaggedValue).floatValue();
    }

    public Decoder decodeTaggedInline(Tag tag, SerialDescriptor inlineDescriptor) {
        inlineDescriptor.getClass();
        pushTag(tag);
        return this;
    }

    public int decodeTaggedInt(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Integer) decodeTaggedValue).intValue();
    }

    public long decodeTaggedLong(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Long) decodeTaggedValue).longValue();
    }

    public boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    public Void decodeTaggedNull(Tag tag) {
        return null;
    }

    public short decodeTaggedShort(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return ((Short) decodeTaggedValue).shortValue();
    }

    public String decodeTaggedString(Tag tag) {
        Object decodeTaggedValue = decodeTaggedValue(tag);
        decodeTaggedValue.getClass();
        return (String) decodeTaggedValue;
    }

    public Object decodeTaggedValue(Tag tag) {
        throw new SerializationException(yl1.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
    }

    public final Tag getCurrentTag() {
        return (Tag) wn.n0(this.tagStack);
    }

    public final Tag getCurrentTagOrNull() {
        return (Tag) wn.o0(this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return SerializersModuleBuildersKt.EmptySerializersModule();
    }

    public abstract Tag getTag(SerialDescriptor serialDescriptor, int i);

    public final ArrayList<Tag> getTagStack$kotlinx_serialization_core() {
        return this.tagStack;
    }

    public final Tag popTag() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag remove = arrayList.remove(xn.A(arrayList));
        this.flag = true;
        return remove;
    }

    public final void pushTag(Tag name) {
        this.tagStack.add(name);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) super.decodeSerializableValue(deserializationStrategy);
    }
}
