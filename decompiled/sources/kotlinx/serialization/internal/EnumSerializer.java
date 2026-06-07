package kotlinx.serialization.internal;

import defpackage.b52;
import defpackage.bf;
import defpackage.j1;
import defpackage.rr0;
import defpackage.yq1;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\u000b\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "createUnmarkedDescriptor", "(Ljava/lang/String;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "[Ljava/lang/Enum;", "overriddenDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lrr0;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final rr0 descriptor;
    private SerialDescriptor overriddenDescriptor;
    private final T[] values;

    public EnumSerializer(String str, T[] tArr) {
        str.getClass();
        tArr.getClass();
        this.values = tArr;
        this.descriptor = new b52(new j1(14, this, str));
    }

    private final SerialDescriptor createUnmarkedDescriptor(String serialName) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, this.values.length);
        for (T t : this.values) {
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, t.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    public static final SerialDescriptor descriptor_delegate$lambda$0(EnumSerializer enumSerializer, String str) {
        SerialDescriptor serialDescriptor = enumSerializer.overriddenDescriptor;
        if (serialDescriptor == null) {
            return enumSerializer.createUnmarkedDescriptor(str);
        }
        return serialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        decoder.getClass();
        int decodeEnum = decoder.decodeEnum(getDescriptor());
        if (decodeEnum >= 0) {
            T[] tArr = this.values;
            if (decodeEnum < tArr.length) {
                return tArr[decodeEnum];
            }
        }
        throw new SerializationException(decodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor.getValue();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, T value) {
        encoder.getClass();
        value.getClass();
        int X = bf.X(this.values, value);
        if (X != -1) {
            encoder.encodeEnum(getDescriptor(), X);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        String serialName = getDescriptor().getSerialName();
        String arrays = Arrays.toString(this.values);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(serialName);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String str, T[] tArr, SerialDescriptor serialDescriptor) {
        this(str, tArr);
        str.getClass();
        tArr.getClass();
        serialDescriptor.getClass();
        this.overriddenDescriptor = serialDescriptor;
    }
}
