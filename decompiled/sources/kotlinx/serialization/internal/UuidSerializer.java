package kotlinx.serialization.internal;

import defpackage.de2;
import defpackage.rp1;
import defpackage.wg0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/internal/UuidSerializer;", "Lkotlinx/serialization/KSerializer;", "Lde2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lde2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lde2;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UuidSerializer implements KSerializer<de2> {
    public static final UuidSerializer INSTANCE = new UuidSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", PrimitiveKind.STRING.INSTANCE);

    private UuidSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public de2 deserialize(Decoder decoder) {
        String concat;
        decoder.getClass();
        String decodeString = decoder.decodeString();
        decodeString.getClass();
        int length = decodeString.length();
        int i = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (decodeString.length() <= 64) {
                    concat = decodeString;
                } else {
                    concat = decodeString.substring(0, 64).concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(decodeString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j = 0;
            while (i < 8) {
                long j2 = j << 4;
                char charAt = decodeString.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = wg0.b[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                rp1.u(decodeString, i, "a hexadecimal digit");
                throw null;
            }
            if (decodeString.charAt(8) == '-') {
                long j4 = 0;
                for (int i2 = 9; i2 < 13; i2++) {
                    long j5 = j4 << 4;
                    char charAt2 = decodeString.charAt(i2);
                    if ((charAt2 >>> '\b') == 0) {
                        long j6 = wg0.b[charAt2];
                        if (j6 >= 0) {
                            j4 = j5 | j6;
                        }
                    }
                    rp1.u(decodeString, i2, "a hexadecimal digit");
                    throw null;
                }
                if (decodeString.charAt(13) == '-') {
                    long j7 = 0;
                    for (int i3 = 14; i3 < 18; i3++) {
                        long j8 = j7 << 4;
                        char charAt3 = decodeString.charAt(i3);
                        if ((charAt3 >>> '\b') == 0) {
                            long j9 = wg0.b[charAt3];
                            if (j9 >= 0) {
                                j7 = j8 | j9;
                            }
                        }
                        rp1.u(decodeString, i3, "a hexadecimal digit");
                        throw null;
                    }
                    if (decodeString.charAt(18) == '-') {
                        long j10 = 0;
                        for (int i4 = 19; i4 < 23; i4++) {
                            long j11 = j10 << 4;
                            char charAt4 = decodeString.charAt(i4);
                            if ((charAt4 >>> '\b') == 0) {
                                long j12 = wg0.b[charAt4];
                                if (j12 >= 0) {
                                    j10 = j11 | j12;
                                }
                            }
                            rp1.u(decodeString, i4, "a hexadecimal digit");
                            throw null;
                        }
                        if (decodeString.charAt(23) == '-') {
                            long j13 = 0;
                            for (int i5 = 24; i5 < 36; i5++) {
                                long j14 = j13 << 4;
                                char charAt5 = decodeString.charAt(i5);
                                if ((charAt5 >>> '\b') == 0) {
                                    long j15 = wg0.b[charAt5];
                                    if (j15 >= 0) {
                                        j13 = j14 | j15;
                                    }
                                }
                                rp1.u(decodeString, i5, "a hexadecimal digit");
                                throw null;
                            }
                            long j16 = (j << 32) | (j4 << 16) | j7;
                            long j17 = (j10 << 48) | j13;
                            if (j16 != 0 || j17 != 0) {
                                return new de2(j16, j17);
                            }
                        } else {
                            rp1.u(decodeString, 23, "'-' (hyphen)");
                            throw null;
                        }
                    } else {
                        rp1.u(decodeString, 18, "'-' (hyphen)");
                        throw null;
                    }
                } else {
                    rp1.u(decodeString, 13, "'-' (hyphen)");
                    throw null;
                }
            } else {
                rp1.u(decodeString, 8, "'-' (hyphen)");
                throw null;
            }
        } else {
            long j18 = 0;
            while (i < 16) {
                long j19 = j18 << 4;
                char charAt6 = decodeString.charAt(i);
                if ((charAt6 >>> '\b') == 0) {
                    long j20 = wg0.b[charAt6];
                    if (j20 >= 0) {
                        j18 = j19 | j20;
                        i++;
                    }
                }
                rp1.u(decodeString, i, "a hexadecimal digit");
                throw null;
            }
            long j21 = 0;
            for (int i6 = 16; i6 < 32; i6++) {
                long j22 = j21 << 4;
                char charAt7 = decodeString.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j23 = wg0.b[charAt7];
                    if (j23 >= 0) {
                        j21 = j22 | j23;
                    }
                }
                rp1.u(decodeString, i6, "a hexadecimal digit");
                throw null;
            }
            if (j18 != 0 || j21 != 0) {
                return new de2(j18, j21);
            }
        }
        return de2.h;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, de2 value) {
        encoder.getClass();
        value.getClass();
        encoder.encodeString(value.toString());
    }
}
