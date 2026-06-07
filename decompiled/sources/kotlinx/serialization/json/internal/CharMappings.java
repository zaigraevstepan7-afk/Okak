package kotlinx.serialization.json.internal;

import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "<init>", "()V", "Lod2;", "initEscape", "initCharToToken", "", "c", "", "esc", "initC2ESC", "(IC)V", "(CC)V", "", "cl", "initC2TC", "(IB)V", "(CB)V", "", "ESCAPE_2_CHAR", "[C", "", "CHAR_TO_TOKEN", "[B", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class CharMappings {
    public static final byte[] CHAR_TO_TOKEN;
    public static final char[] ESCAPE_2_CHAR;
    public static final CharMappings INSTANCE;

    static {
        CharMappings charMappings = new CharMappings();
        INSTANCE = charMappings;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[WebSocketProtocol.PAYLOAD_SHORT];
        charMappings.initEscape();
        charMappings.initCharToToken();
    }

    private CharMappings() {
    }

    private final void initC2ESC(int c, char esc) {
        if (esc != 'u') {
            ESCAPE_2_CHAR[esc] = (char) c;
        }
    }

    private final void initC2TC(int c, byte cl) {
        CHAR_TO_TOKEN[c] = cl;
    }

    private final void initCharToToken() {
        for (int i = 0; i < 33; i++) {
            initC2TC(i, AbstractJsonLexerKt.TC_INVALID);
        }
        initC2TC(9, (byte) 3);
        initC2TC(10, (byte) 3);
        initC2TC(13, (byte) 3);
        initC2TC(32, (byte) 3);
        initC2TC(AbstractJsonLexerKt.COMMA, (byte) 4);
        initC2TC(AbstractJsonLexerKt.COLON, (byte) 5);
        initC2TC(AbstractJsonLexerKt.BEGIN_OBJ, (byte) 6);
        initC2TC(AbstractJsonLexerKt.END_OBJ, (byte) 7);
        initC2TC(AbstractJsonLexerKt.BEGIN_LIST, (byte) 8);
        initC2TC(AbstractJsonLexerKt.END_LIST, (byte) 9);
        initC2TC(AbstractJsonLexerKt.STRING, (byte) 1);
        initC2TC(AbstractJsonLexerKt.STRING_ESC, (byte) 2);
    }

    private final void initEscape() {
        for (int i = 0; i < 32; i++) {
            initC2ESC(i, AbstractJsonLexerKt.UNICODE_ESC);
        }
        initC2ESC(8, 'b');
        initC2ESC(9, 't');
        initC2ESC(10, 'n');
        initC2ESC(12, 'f');
        initC2ESC(13, 'r');
        initC2ESC('/', '/');
        initC2ESC(AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.STRING);
        initC2ESC(AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.STRING_ESC);
    }

    private final void initC2TC(char c, byte cl) {
        initC2TC((int) c, cl);
    }

    private final void initC2ESC(char c, char esc) {
        initC2ESC((int) c, esc);
    }
}
