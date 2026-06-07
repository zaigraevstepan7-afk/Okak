package kotlinx.serialization.json.internal;

import defpackage.bd2;
import defpackage.nq1;
import defpackage.p32;
import defpackage.se;
import defpackage.yc2;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/json/Json;)V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeInt", "decodeLong", "", "decodeByte", "", "decodeShort", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonDecoderForUnsignedTypes extends AbstractDecoder {
    private final AbstractJsonLexer lexer;
    private final SerializersModule serializersModule;

    public JsonDecoderForUnsignedTypes(AbstractJsonLexer abstractJsonLexer, Json json) {
        abstractJsonLexer.getClass();
        json.getClass();
        this.lexer = abstractJsonLexer;
        this.serializersModule = json.getSerializersModule();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: IllegalArgumentException -> 0x002c, TryCatch #0 {IllegalArgumentException -> 0x002c, blocks: (B:3:0x0006, B:5:0x0010, B:8:0x001b, B:10:0x0025, B:13:0x0028, B:14:0x002b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: IllegalArgumentException -> 0x002c, TryCatch #0 {IllegalArgumentException -> 0x002c, blocks: (B:3:0x0006, B:5:0x0010, B:8:0x001b, B:10:0x0025, B:13:0x0028, B:14:0x002b), top: B:2:0x0006 }] */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte decodeByte() {
        /*
            r6 = this;
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r6.lexer
            java.lang.String r6 = r0.consumeStringLenient()
            r6.getClass()     // Catch: java.lang.IllegalArgumentException -> L2c
            yc2 r1 = defpackage.nq1.s(r6)     // Catch: java.lang.IllegalArgumentException -> L2c
            r2 = 0
            if (r1 == 0) goto L22
            int r1 = r1.e     // Catch: java.lang.IllegalArgumentException -> L2c
            r3 = 255(0xff, float:3.57E-43)
            int r3 = java.lang.Integer.compareUnsigned(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L2c
            if (r3 <= 0) goto L1b
            goto L22
        L1b:
            byte r1 = (byte) r1     // Catch: java.lang.IllegalArgumentException -> L2c
            vc2 r3 = new vc2     // Catch: java.lang.IllegalArgumentException -> L2c
            r3.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L2c
            goto L23
        L22:
            r3 = r2
        L23:
            if (r3 == 0) goto L28
            byte r6 = r3.e     // Catch: java.lang.IllegalArgumentException -> L2c
            return r6
        L28:
            defpackage.p32.y(r6)     // Catch: java.lang.IllegalArgumentException -> L2c
            throw r2     // Catch: java.lang.IllegalArgumentException -> L2c
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to parse type 'UByte' for input '"
            r1.<init>(r2)
            r1.append(r6)
            r6 = 39
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            defpackage.se.c()
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes.decodeByte():byte");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        descriptor.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            consumeStringLenient.getClass();
            yc2 s = nq1.s(consumeStringLenient);
            if (s != null) {
                return s.e;
            }
            p32.y(consumeStringLenient);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'UInt' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            se.c();
            return 0;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            consumeStringLenient.getClass();
            bd2 t = nq1.t(consumeStringLenient);
            if (t != null) {
                return t.e;
            }
            p32.y(consumeStringLenient);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'ULong' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            se.c();
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[Catch: IllegalArgumentException -> 0x002d, TryCatch #0 {IllegalArgumentException -> 0x002d, blocks: (B:3:0x0006, B:5:0x0010, B:8:0x001c, B:10:0x0026, B:13:0x0029, B:14:0x002c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IllegalArgumentException -> 0x002d, TryCatch #0 {IllegalArgumentException -> 0x002d, blocks: (B:3:0x0006, B:5:0x0010, B:8:0x001c, B:10:0x0026, B:13:0x0029, B:14:0x002c), top: B:2:0x0006 }] */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public short decodeShort() {
        /*
            r6 = this;
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r6.lexer
            java.lang.String r6 = r0.consumeStringLenient()
            r6.getClass()     // Catch: java.lang.IllegalArgumentException -> L2d
            yc2 r1 = defpackage.nq1.s(r6)     // Catch: java.lang.IllegalArgumentException -> L2d
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r1.e     // Catch: java.lang.IllegalArgumentException -> L2d
            r3 = 65535(0xffff, float:9.1834E-41)
            int r3 = java.lang.Integer.compareUnsigned(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L2d
            if (r3 <= 0) goto L1c
            goto L23
        L1c:
            short r1 = (short) r1     // Catch: java.lang.IllegalArgumentException -> L2d
            ed2 r3 = new ed2     // Catch: java.lang.IllegalArgumentException -> L2d
            r3.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L24
        L23:
            r3 = r2
        L24:
            if (r3 == 0) goto L29
            short r6 = r3.e     // Catch: java.lang.IllegalArgumentException -> L2d
            return r6
        L29:
            defpackage.p32.y(r6)     // Catch: java.lang.IllegalArgumentException -> L2d
            throw r2     // Catch: java.lang.IllegalArgumentException -> L2d
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to parse type 'UShort' for input '"
            r1.<init>(r2)
            r1.append(r6)
            r6 = 39
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            defpackage.se.c()
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes.decodeShort():short");
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
