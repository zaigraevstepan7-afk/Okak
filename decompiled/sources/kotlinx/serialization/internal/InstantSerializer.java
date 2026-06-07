package kotlinx.serialization.internal;

import defpackage.fc2;
import defpackage.km0;
import defpackage.l90;
import defpackage.lm0;
import defpackage.mm0;
import defpackage.om0;
import defpackage.pm0;
import defpackage.sl0;
import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/internal/InstantSerializer;", "Lkotlinx/serialization/KSerializer;", "Llm0;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Llm0;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Llm0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class InstantSerializer implements KSerializer<lm0> {
    public static final InstantSerializer INSTANCE = new InstantSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.time.Instant", PrimitiveKind.STRING.INSTANCE);

    private InstantSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public lm0 deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        pm0 G;
        int i7;
        int i8;
        boolean z;
        int i9;
        long j;
        char charAt;
        char charAt2;
        decoder.getClass();
        km0 km0Var = lm0.g;
        String decodeString = decoder.decodeString();
        decodeString.getClass();
        if (decodeString.length() == 0) {
            G = new sl0("An empty string is not a valid Instant", decodeString);
        } else {
            char charAt3 = decodeString.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i = 0;
                charAt3 = ' ';
            } else {
                i = 1;
            }
            int i10 = 0;
            int i11 = i;
            while (i11 < decodeString.length() && '0' <= (charAt2 = decodeString.charAt(i11)) && charAt2 < ':') {
                i10 = (i10 * 10) + (decodeString.charAt(i11) - '0');
                i11++;
            }
            int i12 = i11 - i;
            if (i12 > 10) {
                G = fc2.G(decodeString, "Expected at most 10 digits for the year number, got " + i12 + " digits");
            } else if (i12 == 10 && sn0.B(decodeString.charAt(i), 50) >= 0) {
                G = fc2.G(decodeString, "Expected at most 9 digits for the year number or year 1000000000, got " + i12 + " digits");
            } else if (i12 < 4) {
                G = fc2.G(decodeString, "The year number must be padded to 4 digits, got " + i12 + " digits");
            } else if (charAt3 == '+' && i12 == 4) {
                G = fc2.G(decodeString, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i12 != 4) {
                G = fc2.G(decodeString, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i10 = -i10;
                }
                int i13 = i11 + 16;
                if (decodeString.length() < i13) {
                    G = fc2.G(decodeString, "The input string is too short");
                } else {
                    sl0 F = fc2.F(decodeString, "'-'", i11, new mm0(1));
                    if (F != null || (F = fc2.F(decodeString, "'-'", i11 + 3, new mm0(2))) != null || (F = fc2.F(decodeString, "'T' or 't'", i11 + 6, new mm0(3))) != null || (F = fc2.F(decodeString, "':'", i11 + 9, new mm0(4))) != null || (F = fc2.F(decodeString, "':'", i11 + 12, new mm0(5))) != null) {
                        G = F;
                    } else {
                        int[] iArr = fc2.p;
                        int i14 = 0;
                        while (true) {
                            if (i14 < 10) {
                                G = fc2.F(decodeString, "an ASCII digit", iArr[i14] + i11, new mm0(6));
                                if (G != null) {
                                    break;
                                }
                                i14++;
                            } else {
                                int H = fc2.H(i11 + 1, decodeString);
                                int H2 = fc2.H(i11 + 4, decodeString);
                                int H3 = fc2.H(i11 + 7, decodeString);
                                int H4 = fc2.H(i11 + 10, decodeString);
                                int H5 = fc2.H(i11 + 13, decodeString);
                                int i15 = i11 + 15;
                                if (decodeString.charAt(i15) == '.') {
                                    i15 = i13;
                                    int i16 = 0;
                                    while (i15 < decodeString.length() && '0' <= (charAt = decodeString.charAt(i15)) && charAt < ':') {
                                        i16 = (i16 * 10) + (decodeString.charAt(i15) - '0');
                                        i15++;
                                    }
                                    int i17 = i15 - i13;
                                    if (1 <= i17 && i17 < 10) {
                                        i2 = i16 * fc2.o[9 - i17];
                                    } else {
                                        G = fc2.G(decodeString, "1..9 digits are supported for the fraction of the second, got " + i17 + " digits");
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (i15 >= decodeString.length()) {
                                    G = fc2.G(decodeString, "The UTC offset at the end of the string is missing");
                                } else {
                                    char charAt4 = decodeString.charAt(i15);
                                    if (charAt4 != '+' && charAt4 != '-') {
                                        if (charAt4 != 'Z' && charAt4 != 'z') {
                                            G = fc2.G(decodeString, "Expected the UTC offset at position " + i15 + ", got '" + charAt4 + '\'');
                                        } else {
                                            int i18 = i15 + 1;
                                            if (decodeString.length() == i18) {
                                                i6 = 0;
                                                if (1 > H) {
                                                }
                                                G = fc2.G(decodeString, "Expected a month number in 1..12, got " + H);
                                            } else {
                                                G = fc2.G(decodeString, "Extra text after the instant at position " + i18);
                                            }
                                        }
                                    } else {
                                        int length = decodeString.length() - i15;
                                        if (length > 9) {
                                            G = fc2.G(decodeString, "The UTC offset string \"" + fc2.K(16, decodeString.subSequence(i15, decodeString.length()).toString()) + "\" is too long");
                                        } else if (length % 3 != 0) {
                                            G = fc2.G(decodeString, "Invalid UTC offset string \"" + decodeString.subSequence(i15, decodeString.length()).toString() + AbstractJsonLexerKt.STRING);
                                        } else {
                                            int[] iArr2 = fc2.q;
                                            for (int i19 = 0; i19 < 2 && (i8 = iArr2[i19] + i15) < decodeString.length(); i19++) {
                                                if (decodeString.charAt(i8) != ':') {
                                                    StringBuilder q = l90.q("Expected ':' at index ", i8, ", got '");
                                                    q.append(decodeString.charAt(i8));
                                                    q.append('\'');
                                                    G = fc2.G(decodeString, q.toString());
                                                    break;
                                                }
                                            }
                                            int[] iArr3 = fc2.r;
                                            int i20 = 0;
                                            while (i20 < 6 && (i7 = iArr3[i20] + i15) < decodeString.length()) {
                                                char charAt5 = decodeString.charAt(i7);
                                                int[] iArr4 = iArr3;
                                                if ('0' <= charAt5 && charAt5 < ':') {
                                                    i20++;
                                                    iArr3 = iArr4;
                                                } else {
                                                    StringBuilder q2 = l90.q("Expected an ASCII digit at index ", i7, ", got '");
                                                    q2.append(decodeString.charAt(i7));
                                                    q2.append('\'');
                                                    G = fc2.G(decodeString, q2.toString());
                                                    break;
                                                }
                                            }
                                            int H6 = fc2.H(i15 + 1, decodeString);
                                            if (length > 3) {
                                                i3 = fc2.H(i15 + 4, decodeString);
                                            } else {
                                                i3 = 0;
                                            }
                                            if (length > 6) {
                                                i4 = fc2.H(i15 + 7, decodeString);
                                            } else {
                                                i4 = 0;
                                            }
                                            if (i3 > 59) {
                                                G = fc2.G(decodeString, "Expected offset-minute-of-hour in 0..59, got " + i3);
                                            } else if (i4 > 59) {
                                                G = fc2.G(decodeString, "Expected offset-second-of-minute in 0..59, got " + i4);
                                            } else if (H6 > 17 && (H6 != 18 || i3 != 0 || i4 != 0)) {
                                                G = fc2.G(decodeString, "Expected an offset in -18:00..+18:00, got " + decodeString.subSequence(i15, decodeString.length()).toString());
                                            } else {
                                                int i21 = (i3 * 60) + (H6 * 3600) + i4;
                                                if (charAt4 == '-') {
                                                    i5 = -1;
                                                } else {
                                                    i5 = 1;
                                                }
                                                i6 = i21 * i5;
                                                if (1 > H && H < 13) {
                                                    if (1 <= H2) {
                                                        int i22 = i10 & 3;
                                                        if (i22 == 0 && (i10 % 100 != 0 || i10 % 400 == 0)) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (H != 2) {
                                                            if (H != 4 && H != 6 && H != 9 && H != 11) {
                                                                i9 = 31;
                                                            } else {
                                                                i9 = 30;
                                                            }
                                                        } else if (z) {
                                                            i9 = 29;
                                                        } else {
                                                            i9 = 28;
                                                        }
                                                        if (H2 <= i9) {
                                                            if (H3 > 23) {
                                                                G = fc2.G(decodeString, "Expected hour in 0..23, got " + H3);
                                                            } else if (H4 > 59) {
                                                                G = fc2.G(decodeString, "Expected minute-of-hour in 0..59, got " + H4);
                                                            } else if (H5 > 59) {
                                                                G = fc2.G(decodeString, "Expected second-of-minute in 0..59, got " + H5);
                                                            } else {
                                                                long j2 = i10;
                                                                long j3 = 365 * j2;
                                                                if (j2 >= 0) {
                                                                    j = ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3;
                                                                } else {
                                                                    j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                                }
                                                                long j4 = j + (((H * 367) - 362) / 12) + (H2 - 1);
                                                                if (H > 2) {
                                                                    j4 = (i22 == 0 && (i10 % 100 != 0 || i10 % 400 == 0)) ? (-1) + j4 : j4 - 2;
                                                                }
                                                                G = new om0(i2, (((j4 - 719528) * 86400) + (((H4 * 60) + (H3 * 3600)) + H5)) - i6);
                                                            }
                                                        }
                                                    }
                                                    G = fc2.G(decodeString, "Expected a valid day-of-month for month " + H + " of year " + i10 + ", got " + H2);
                                                } else {
                                                    G = fc2.G(decodeString, "Expected a month number in 1..12, got " + H);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return G.toInstant();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, lm0 value) {
        encoder.getClass();
        value.getClass();
        encoder.encodeString(value.toString());
    }
}
