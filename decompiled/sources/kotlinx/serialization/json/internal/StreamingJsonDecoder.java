package kotlinx.serialization.json.internal;

import defpackage.oe0;
import defpackage.se;
import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001nB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J=\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\u0010&\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010 J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ#\u0010E\u001a\u00020\u001b2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u001b0CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020G2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020$2\u0006\u0010J\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010*J\u001d\u0010M\u001a\u00020\u001e*\u0004\u0018\u00010\f2\u0006\u0010L\u001a\u00020@H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010\u001dJ\u000f\u0010P\u001a\u00020\u001bH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020$H\u0002¢\u0006\u0004\bR\u00103J\u001f\u0010S\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bU\u0010*J\u001f\u0010W\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010V\u001a\u00020@H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020$H\u0002¢\u0006\u0004\bY\u00103J\u000f\u0010Z\u001a\u00020@H\u0002¢\u0006\u0004\bZ\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010l\u001a\u0004\u0018\u00010k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/ChunkedDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "discriminatorHolder", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;)V", "Lkotlinx/serialization/json/JsonElement;", "decodeJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "Lod2;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "", "index", "previousValue", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "Lkotlin/Function1;", "consumeChunk", "decodeStringChunked", "(Loe0;)V", "Lkotlinx/serialization/encoding/Decoder;", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "enumDescriptor", "decodeEnum", "unknownKey", "trySkip", "(Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;Ljava/lang/String;)Z", "skipLeftoverElements", "checkLeadingComma", "()V", "decodeMapIndex", "coerceInputValue", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeObjectIndex", "key", "handleUnknown", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/String;)Z", "decodeListIndex", "decodeStringKey", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/internal/WriteMode;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "currentIndex", "I", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "elementMarker", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "DiscriminatorHolder", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder, ChunkedDecoder {
    private final JsonConfiguration configuration;
    private int currentIndex;
    private DiscriminatorHolder discriminatorHolder;
    private final JsonElementMarker elementMarker;
    private final Json json;
    public final AbstractJsonLexer lexer;
    private final WriteMode mode;
    private final SerializersModule serializersModule;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "", "discriminatorToSkip", "", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DiscriminatorHolder {
        public String discriminatorToSkip;

        public DiscriminatorHolder(String str) {
            this.discriminatorToSkip = str;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonDecoder(Json json, WriteMode writeMode, AbstractJsonLexer abstractJsonLexer, SerialDescriptor serialDescriptor, DiscriminatorHolder discriminatorHolder) {
        JsonElementMarker jsonElementMarker;
        json.getClass();
        writeMode.getClass();
        abstractJsonLexer.getClass();
        serialDescriptor.getClass();
        this.json = json;
        this.mode = writeMode;
        this.lexer = abstractJsonLexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        if (configuration.getExplicitNulls()) {
            jsonElementMarker = null;
        } else {
            jsonElementMarker = new JsonElementMarker(serialDescriptor);
        }
        this.elementMarker = jsonElementMarker;
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        se.c();
    }

    private final boolean coerceInputValue(SerialDescriptor descriptor, int index) {
        String peekString;
        boolean z;
        Json json = this.json;
        boolean isElementOptional = descriptor.isElementOptional(index);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (isElementOptional && !elementDescriptor.isNullable() && this.lexer.tryConsumeNull(true)) {
            return true;
        }
        if (!sn0.r(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && this.lexer.tryConsumeNull(false)) || (peekString = this.lexer.peekString(this.configuration.getIsLenient())) == null)) {
            return false;
        }
        int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, peekString);
        if (!json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable()) {
            z = true;
        } else {
            z = false;
        }
        if (jsonNameIndex == -3 && (isElementOptional || z)) {
            this.lexer.consumeString();
            return true;
        }
        return false;
    }

    private final int decodeListIndex() {
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        if (this.lexer.canConsumeValue()) {
            int i = this.currentIndex;
            if (i != -1 && !tryConsumeComma) {
                AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
                se.c();
                return 0;
            }
            int i2 = i + 1;
            this.currentIndex = i2;
            return i2;
        }
        if (!tryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
            return -1;
        }
        JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
        se.c();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int decodeMapIndex() {
        /*
            r11 = this;
            int r0 = r11.currentIndex
            int r1 = r0 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r3
        Lb:
            r4 = -1
            if (r1 == 0) goto L17
            if (r0 == r4) goto L1e
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r11.lexer
            boolean r0 = r0.tryConsumeComma()
            goto L1f
        L17:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r11.lexer
            r5 = 58
            r0.consumeNextToken(r5)
        L1e:
            r0 = r3
        L1f:
            kotlinx.serialization.json.internal.AbstractJsonLexer r5 = r11.lexer
            boolean r5 = r5.canConsumeValue()
            if (r5 == 0) goto L57
            if (r1 == 0) goto L51
            int r1 = r11.currentIndex
            kotlinx.serialization.json.internal.AbstractJsonLexer r5 = r11.lexer
            if (r1 != r4) goto L40
            int r7 = r5.currentPosition
            if (r0 != 0) goto L34
            goto L51
        L34:
            r9 = 4
            r10 = 0
            java.lang.String r6 = "Unexpected leading comma"
            r8 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r5, r6, r7, r8, r9, r10)
            defpackage.se.c()
            return r3
        L40:
            int r7 = r5.currentPosition
            if (r0 == 0) goto L45
            goto L51
        L45:
            r9 = 4
            r10 = 0
            java.lang.String r6 = "Expected comma after the key-value pair"
            r8 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r5, r6, r7, r8, r9, r10)
            defpackage.se.c()
            return r3
        L51:
            int r0 = r11.currentIndex
            int r0 = r0 + r2
            r11.currentIndex = r0
            return r0
        L57:
            if (r0 == 0) goto L70
            kotlinx.serialization.json.Json r0 = r11.json
            kotlinx.serialization.json.JsonConfiguration r0 = r0.getConfiguration()
            boolean r0 = r0.getAllowTrailingComma()
            if (r0 == 0) goto L66
            goto L70
        L66:
            kotlinx.serialization.json.internal.AbstractJsonLexer r11 = r11.lexer
            r0 = 0
            kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(r11, r0, r2, r0)
            defpackage.se.c()
            return r3
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeMapIndex():int");
    }

    private final int decodeObjectIndex(SerialDescriptor descriptor) {
        int jsonNameIndex;
        boolean z;
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        while (true) {
            boolean z2 = true;
            if (this.lexer.canConsumeValue()) {
                String decodeStringKey = decodeStringKey();
                this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
                jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(descriptor, this.json, decodeStringKey);
                if (jsonNameIndex != -3) {
                    if (!this.configuration.getCoerceInputValues() || !coerceInputValue(descriptor, jsonNameIndex)) {
                        break;
                    }
                    z = this.lexer.tryConsumeComma();
                    z2 = false;
                } else {
                    z = false;
                }
                if (z2) {
                    tryConsumeComma = handleUnknown(descriptor, decodeStringKey);
                } else {
                    tryConsumeComma = z;
                }
            } else {
                if (tryConsumeComma && !this.json.getConfiguration().getAllowTrailingComma()) {
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    se.c();
                    return 0;
                }
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.nextUnmarkedIndex$kotlinx_serialization_json();
                }
                return -1;
            }
        }
        JsonElementMarker jsonElementMarker2 = this.elementMarker;
        if (jsonElementMarker2 != null) {
            jsonElementMarker2.mark$kotlinx_serialization_json(jsonNameIndex);
        }
        return jsonNameIndex;
    }

    private final String decodeStringKey() {
        boolean isLenient = this.configuration.getIsLenient();
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        if (isLenient) {
            return abstractJsonLexer.consumeStringLenientNotNull();
        }
        return abstractJsonLexer.consumeKeyString();
    }

    private final boolean handleUnknown(SerialDescriptor descriptor, String key) {
        if (!JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json) && !trySkip(this.discriminatorHolder, key)) {
            this.lexer.path.popDescriptor();
            this.lexer.failOnUnknownKey(key);
        } else {
            this.lexer.skipElement(this.configuration.getIsLenient());
        }
        return this.lexer.tryConsumeComma();
    }

    private final void skipLeftoverElements(SerialDescriptor descriptor) {
        do {
        } while (decodeElementIndex(descriptor) != -1);
    }

    private final boolean trySkip(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !sn0.r(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
        WriteMode switchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(switchMode.begin);
        checkLeadingComma();
        int i = WhenMappings.$EnumSwitchMapping$0[switchMode.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (this.mode == switchMode && this.json.getConfiguration().getExplicitNulls()) {
                return this;
            }
            return new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
        }
        return new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.lexer.consumeBooleanLenient();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b = (byte) consumeNumericLiteral;
        if (consumeNumericLiteral == b) {
            return b;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        se.c();
        return (byte) 0;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String consumeStringLenient = this.lexer.consumeStringLenient();
        if (consumeStringLenient.length() == 1) {
            return consumeStringLenient.charAt(0);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Expected single char, but got '" + consumeStringLenient + '\'', 0, null, 6, null);
        se.c();
        return (char) 0;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double parseDouble = Double.parseDouble(consumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                    return parseDouble;
                }
                JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(parseDouble));
                se.c();
                return 0.0d;
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'double' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            se.c();
            return 0.0d;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        int decodeMapIndex;
        descriptor.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i != 2) {
            if (i != 4) {
                decodeMapIndex = decodeListIndex();
            } else {
                decodeMapIndex = decodeObjectIndex(descriptor);
            }
        } else {
            decodeMapIndex = decodeMapIndex();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(decodeMapIndex);
        }
        return decodeMapIndex;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        enumDescriptor.getClass();
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float parseFloat = Float.parseFloat(consumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                    return parseFloat;
                }
                JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(parseFloat));
                se.c();
                return 0.0f;
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'float' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            se.c();
            return 0.0f;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        descriptor.getClass();
        if (StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            return new JsonDecoderForUnsignedTypes(this.lexer, this.json);
        }
        return super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i = (int) consumeNumericLiteral;
        if (consumeNumericLiteral == i) {
            return i;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        se.c();
        return 0;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        boolean z;
        JsonElementMarker jsonElementMarker = this.elementMarker;
        if (jsonElementMarker != null) {
            z = jsonElementMarker.getIsUnmarkedNull();
        } else {
            z = false;
        }
        if (z || AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(SerialDescriptor descriptor, int index, DeserializationStrategy<? extends T> deserializer, T previousValue) {
        boolean z;
        descriptor.getClass();
        deserializer.getClass();
        if (this.mode == WriteMode.MAP && (index & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t = (T) super.decodeSerializableElement(descriptor, index, deserializer, previousValue);
        if (z) {
            this.lexer.path.updateCurrentMapKey(t);
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> r9) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue(kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s = (short) consumeNumericLiteral;
        if (consumeNumericLiteral == s) {
            return s;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        se.c();
        return (short) 0;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        boolean isLenient = this.configuration.getIsLenient();
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        if (isLenient) {
            return abstractJsonLexer.consumeStringLenientNotNull();
        }
        return abstractJsonLexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.ChunkedDecoder
    public void decodeStringChunked(oe0 consumeChunk) {
        consumeChunk.getClass();
        this.lexer.consumeStringChunked(this.configuration.getIsLenient(), consumeChunk);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
        if (descriptor.getElementsCount() == 0 && JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json)) {
            skipLeftoverElements(descriptor);
        }
        if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            se.c();
        } else {
            this.lexer.consumeNextToken(this.mode.end);
            this.lexer.path.popDescriptor();
        }
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
