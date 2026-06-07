package kotlinx.serialization.json.internal;

import defpackage.se;
import defpackage.xo0;
import defpackage.yq1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\fH\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/internal/JsonIteratorArrayWrapped;", "T", "", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)V", "first", "", "finished", "next", "()Ljava/lang/Object;", "hasNext", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonIteratorArrayWrapped<T> implements Iterator<T>, xo0 {
    private final DeserializationStrategy<T> deserializer;
    private boolean finished;
    private boolean first;
    private final Json json;
    private final ReaderJsonLexer lexer;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorArrayWrapped(Json json, ReaderJsonLexer readerJsonLexer, DeserializationStrategy<? extends T> deserializationStrategy) {
        json.getClass();
        readerJsonLexer.getClass();
        deserializationStrategy.getClass();
        this.json = json;
        this.lexer = readerJsonLexer;
        this.deserializer = deserializationStrategy;
        this.first = true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String str;
        if (this.finished) {
            return false;
        }
        if (this.lexer.peekNextToken() == 9) {
            this.finished = true;
            this.lexer.consumeNextToken((byte) 9);
            if (this.lexer.isNotEof()) {
                byte peekNextToken = this.lexer.peekNextToken();
                ReaderJsonLexer readerJsonLexer = this.lexer;
                if (peekNextToken != 8) {
                    readerJsonLexer.expectEof();
                } else {
                    AbstractJsonLexer.fail$default(readerJsonLexer, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                    se.c();
                }
            }
            return false;
        }
        if (this.lexer.isNotEof() || this.finished) {
            return true;
        }
        ReaderJsonLexer readerJsonLexer2 = this.lexer;
        String str2 = AbstractJsonLexerKt.tokenDescription((byte) 9);
        int i = readerJsonLexer2.currentPosition;
        int i2 = i - 1;
        if (i != readerJsonLexer2.getSource().length() && i2 >= 0) {
            str = String.valueOf(readerJsonLexer2.getSource().charAt(i2));
        } else {
            str = "EOF";
        }
        AbstractJsonLexer.fail$default(readerJsonLexer2, "Expected " + str2 + ", but had '" + str + "' instead", i2, null, 4, null);
        se.c();
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.first) {
            this.first = false;
        } else {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COMMA);
        }
        return (T) new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null).decodeSerializableValue(this.deserializer);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
