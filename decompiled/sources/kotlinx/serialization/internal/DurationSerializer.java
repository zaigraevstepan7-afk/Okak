package kotlinx.serialization.internal;

import defpackage.l90;
import defpackage.r40;
import defpackage.s40;
import defpackage.v40;
import defpackage.vn;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/DurationSerializer;", "Lkotlinx/serialization/KSerializer;", "Ls40;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize-HG0u8IE", "(Lkotlinx/serialization/encoding/Encoder;J)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-5sfh64U", "(Lkotlinx/serialization/encoding/Decoder;)J", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class DurationSerializer implements KSerializer<s40> {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.time.Duration", PrimitiveKind.STRING.INSTANCE);

    private DurationSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new s40(m81deserialize5sfh64U(decoder));
    }

    /* renamed from: deserialize-5sfh64U, reason: not valid java name */
    public long m81deserialize5sfh64U(Decoder decoder) {
        boolean z;
        decoder.getClass();
        r40 r40Var = s40.f;
        String decodeString = decoder.decodeString();
        decodeString.getClass();
        try {
            long H = vn.H(decodeString);
            if (H == s40.i) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return H;
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(l90.m("Invalid ISO duration string format: '", decodeString, "'."), e);
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m82serializeHG0u8IE(encoder, ((s40) obj).e);
    }

    /* renamed from: serialize-HG0u8IE, reason: not valid java name */
    public void m82serializeHG0u8IE(Encoder encoder, long value) {
        long j;
        int f;
        int f2;
        boolean z;
        boolean z2;
        encoder.getClass();
        r40 r40Var = s40.f;
        StringBuilder sb = new StringBuilder();
        if (value < 0) {
            sb.append('-');
        }
        sb.append("PT");
        if (value < 0) {
            j = s40.g(value);
        } else {
            j = value;
        }
        long f3 = s40.f(j, v40.HOURS);
        boolean z3 = false;
        if (s40.d(j)) {
            f = 0;
        } else {
            f = (int) (s40.f(j, v40.MINUTES) % 60);
        }
        if (s40.d(j)) {
            f2 = 0;
        } else {
            f2 = (int) (s40.f(j, v40.SECONDS) % 60);
        }
        int c = s40.c(j);
        if (s40.d(value)) {
            f3 = 9999999999999L;
        }
        if (f3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (f2 == 0 && c == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (f != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(f3);
            sb.append('H');
        }
        if (z3) {
            sb.append(f);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            s40.b(sb, f2, c, 9, "S", true);
        }
        encoder.encodeString(sb.toString());
    }
}
