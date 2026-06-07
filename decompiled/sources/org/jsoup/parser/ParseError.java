package org.jsoup.parser;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ParseError {
    private final String cursorPos;
    private final String errorMsg;
    private final int pos;

    public ParseError(CharacterReader characterReader, String str, Object... objArr) {
        this.pos = characterReader.pos();
        this.cursorPos = characterReader.posLineCol();
        this.errorMsg = String.format(str, objArr);
    }

    public String getCursorPos() {
        return this.cursorPos;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public int getPosition() {
        return this.pos;
    }

    public String toString() {
        return "<" + this.cursorPos + ">: " + this.errorMsg;
    }

    public ParseError(CharacterReader characterReader, String str) {
        this.pos = characterReader.pos();
        this.cursorPos = characterReader.posLineCol();
        this.errorMsg = str;
    }

    public ParseError(int i, String str) {
        this.pos = i;
        this.cursorPos = String.valueOf(i);
        this.errorMsg = str;
    }

    public ParseError(int i, String str, Object... objArr) {
        this.pos = i;
        this.cursorPos = String.valueOf(i);
        this.errorMsg = String.format(str, objArr);
    }
}
