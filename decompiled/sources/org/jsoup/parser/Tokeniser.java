package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class Tokeniser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char[] notCharRefCharsSorted;
    static final char replacementChar = 65533;
    static final int[] win1252Extensions = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    static final int win1252ExtensionsStart = 128;
    final Token.EndTag endPending;
    private final ParseErrorList errors;
    private String lastStartCloseSeq;
    private String lastStartTag;
    private int markupStartPos;
    private final CharacterReader reader;
    final Token.StartTag startPending;
    Token.Tag tagPending;
    private TokeniserState state = TokeniserState.Data;
    private Token emitPending = null;
    private boolean isEmitPending = $assertionsDisabled;
    private String charsString = null;
    private final StringBuilder charsBuilder = new StringBuilder(1024);
    final StringBuilder dataBuffer = new StringBuilder(1024);
    final Token.Character charPending = new Token.Character();
    final Token.Doctype doctypePending = new Token.Doctype();
    final Token.Comment commentPending = new Token.Comment();
    private int charStartPos = 0;
    private final int[] codepointHolder = new int[1];
    private final int[] multipointHolder = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        notCharRefCharsSorted = cArr;
        Arrays.sort(cArr);
    }

    public Tokeniser(TreeBuilder treeBuilder) {
        Token.StartTag startTag = new Token.StartTag(treeBuilder);
        this.startPending = startTag;
        this.tagPending = startTag;
        this.endPending = new Token.EndTag(treeBuilder);
        this.reader = treeBuilder.reader;
        this.errors = treeBuilder.parser.getErrors();
    }

    private void characterReferenceError(String str, Object... objArr) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    public static boolean currentNodeInHtmlNS() {
        return true;
    }

    public void advanceTransition(TokeniserState tokeniserState) {
        transition(tokeniserState);
        this.reader.advance();
    }

    public String appropriateEndTagName() {
        return this.lastStartTag;
    }

    public String appropriateEndTagSeq() {
        if (this.lastStartCloseSeq == null) {
            this.lastStartCloseSeq = "</" + this.lastStartTag;
        }
        return this.lastStartCloseSeq;
    }

    public int[] consumeCharacterReference(Character ch, boolean z) {
        String consumeDigitSequence;
        int i;
        int i2;
        if (this.reader.isEmpty()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.reader.current()) || this.reader.matchesAnySorted(notCharRefCharsSorted)) {
            return null;
        }
        int[] iArr = this.codepointHolder;
        this.reader.mark();
        boolean matchConsume = this.reader.matchConsume("#");
        CharacterReader characterReader = this.reader;
        if (matchConsume) {
            boolean matchConsumeIgnoreCase = characterReader.matchConsumeIgnoreCase("X");
            CharacterReader characterReader2 = this.reader;
            if (matchConsumeIgnoreCase) {
                consumeDigitSequence = characterReader2.consumeHexSequence();
            } else {
                consumeDigitSequence = characterReader2.consumeDigitSequence();
            }
            if (consumeDigitSequence.length() == 0) {
                characterReferenceError("numeric reference with no numerals", new Object[0]);
                this.reader.rewindToMark();
                return null;
            }
            this.reader.unmark();
            if (!this.reader.matchConsume(";")) {
                characterReferenceError("missing semicolon on [&#%s]", consumeDigitSequence);
            }
            if (matchConsumeIgnoreCase) {
                i = 16;
            } else {
                i = 10;
            }
            try {
                i2 = Integer.valueOf(consumeDigitSequence, i).intValue();
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            if (i2 != -1 && i2 <= 1114111) {
                if (i2 >= 128) {
                    int[] iArr2 = win1252Extensions;
                    if (i2 < iArr2.length + 128) {
                        characterReferenceError("character [%s] is not a valid unicode code point", Integer.valueOf(i2));
                        i2 = iArr2[i2 - 128];
                    }
                }
                iArr[0] = i2;
            } else {
                characterReferenceError("character [%s] outside of valid range", Integer.valueOf(i2));
                iArr[0] = 65533;
            }
            return iArr;
        }
        String consumeLetterThenDigitSequence = characterReader.consumeLetterThenDigitSequence();
        boolean matches = this.reader.matches(';');
        if (!Entities.isBaseNamedEntity(consumeLetterThenDigitSequence) && (!Entities.isNamedEntity(consumeLetterThenDigitSequence) || !matches)) {
            this.reader.rewindToMark();
            if (matches) {
                characterReferenceError("invalid named reference [%s]", consumeLetterThenDigitSequence);
            }
            if (z) {
                return null;
            }
            consumeLetterThenDigitSequence = Entities.findPrefix(consumeLetterThenDigitSequence);
            if (consumeLetterThenDigitSequence.isEmpty()) {
                return null;
            }
            this.reader.matchConsume(consumeLetterThenDigitSequence);
        }
        if (z && (this.reader.matchesLetter() || this.reader.matchesDigit() || this.reader.matchesAny('=', '-', '_'))) {
            this.reader.rewindToMark();
            return null;
        }
        this.reader.unmark();
        if (!this.reader.matchConsume(";")) {
            characterReferenceError("missing semicolon on [&%s]", consumeLetterThenDigitSequence);
        }
        int codepointsForName = Entities.codepointsForName(consumeLetterThenDigitSequence, this.multipointHolder);
        if (codepointsForName == 1) {
            iArr[0] = this.multipointHolder[0];
            return iArr;
        }
        if (codepointsForName == 2) {
            return this.multipointHolder;
        }
        Validate.fail("Unexpected characters returned for " + consumeLetterThenDigitSequence);
        return this.multipointHolder;
    }

    public void createBogusCommentPending() {
        this.commentPending.reset();
        this.commentPending.bogus = true;
    }

    public void createCommentPending() {
        this.commentPending.reset();
    }

    public void createDoctypePending() {
        this.doctypePending.reset();
    }

    public Token.Tag createTagPending(boolean z) {
        Token.Tag reset;
        if (z) {
            reset = this.startPending.reset();
        } else {
            reset = this.endPending.reset();
        }
        this.tagPending = reset;
        return reset;
    }

    public void createTempBuffer() {
        Token.reset(this.dataBuffer);
    }

    public void emit(Token token) {
        Validate.isFalse(this.isEmitPending);
        this.emitPending = token;
        this.isEmitPending = true;
        token.startPos(this.markupStartPos);
        token.endPos(this.reader.pos());
        this.charStartPos = this.reader.pos();
        Token.TokenType tokenType = token.type;
        if (tokenType == Token.TokenType.StartTag) {
            this.lastStartTag = ((Token.StartTag) token).tagName;
            this.lastStartCloseSeq = null;
        } else if (tokenType == Token.TokenType.EndTag) {
            Token.EndTag endTag = (Token.EndTag) token;
            if (endTag.hasAttributes()) {
                error("Attributes incorrectly present on end tag [/%s]", endTag.normalName());
            }
        }
    }

    public void emitCommentPending() {
        emit(this.commentPending);
    }

    public void emitDoctypePending() {
        emit(this.doctypePending);
    }

    public void emitTagPending() {
        this.tagPending.finaliseTag();
        emit(this.tagPending);
    }

    public void eofError(TokeniserState tokeniserState) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader, "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    public void error(TokeniserState tokeniserState) {
        if (this.errors.canAddError()) {
            ParseErrorList parseErrorList = this.errors;
            CharacterReader characterReader = this.reader;
            parseErrorList.add(new ParseError(characterReader, "Unexpected character '%s' in input state [%s]", Character.valueOf(characterReader.current()), tokeniserState));
        }
    }

    public TokeniserState getState() {
        return this.state;
    }

    public boolean isAppropriateEndTagToken() {
        if (this.lastStartTag != null && this.tagPending.name().equalsIgnoreCase(this.lastStartTag)) {
            return true;
        }
        return $assertionsDisabled;
    }

    public Token read() {
        while (!this.isEmitPending) {
            this.state.read(this, this.reader);
        }
        StringBuilder sb = this.charsBuilder;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            Token.Character data = this.charPending.data(sb2);
            this.charsString = null;
            return data;
        }
        String str = this.charsString;
        if (str != null) {
            Token.Character data2 = this.charPending.data(str);
            this.charsString = null;
            return data2;
        }
        this.isEmitPending = $assertionsDisabled;
        return this.emitPending;
    }

    public void transition(TokeniserState tokeniserState) {
        if (tokeniserState == TokeniserState.TagOpen) {
            this.markupStartPos = this.reader.pos();
        }
        this.state = tokeniserState;
    }

    public String unescapeEntities(boolean z) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        while (!this.reader.isEmpty()) {
            borrowBuilder.append(this.reader.consumeTo('&'));
            if (this.reader.matches('&')) {
                this.reader.consume();
                int[] consumeCharacterReference = consumeCharacterReference(null, z);
                if (consumeCharacterReference != null && consumeCharacterReference.length != 0) {
                    borrowBuilder.appendCodePoint(consumeCharacterReference[0]);
                    if (consumeCharacterReference.length == 2) {
                        borrowBuilder.appendCodePoint(consumeCharacterReference[1]);
                    }
                } else {
                    borrowBuilder.append('&');
                }
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public void error(String str) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader, str));
        }
    }

    public void error(String str, Object... objArr) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader, str, objArr));
        }
    }

    public void emit(String str) {
        if (this.charsString == null) {
            this.charsString = str;
        } else {
            if (this.charsBuilder.length() == 0) {
                this.charsBuilder.append(this.charsString);
            }
            this.charsBuilder.append(str);
        }
        this.charPending.startPos(this.charStartPos);
        this.charPending.endPos(this.reader.pos());
    }

    public void emit(StringBuilder sb) {
        if (this.charsString == null) {
            this.charsString = sb.toString();
        } else {
            if (this.charsBuilder.length() == 0) {
                this.charsBuilder.append(this.charsString);
            }
            this.charsBuilder.append((CharSequence) sb);
        }
        this.charPending.startPos(this.charStartPos);
        this.charPending.endPos(this.reader.pos());
    }

    public void emit(char c) {
        if (this.charsString == null) {
            this.charsString = String.valueOf(c);
        } else {
            if (this.charsBuilder.length() == 0) {
                this.charsBuilder.append(this.charsString);
            }
            this.charsBuilder.append(c);
        }
        this.charPending.startPos(this.charStartPos);
        this.charPending.endPos(this.reader.pos());
    }

    public void emit(char[] cArr) {
        emit(String.valueOf(cArr));
    }

    public void emit(int[] iArr) {
        emit(new String(iArr, 0, iArr.length));
    }
}
