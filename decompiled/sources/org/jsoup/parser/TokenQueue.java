package org.jsoup.parser;

import defpackage.se;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class TokenQueue {
    private static final char ESC = '\\';
    private int pos = 0;
    private String queue;
    private static final String[] ElementSelectorChars = {"*", "|", "_", "-"};
    private static final String[] CssIdentifierChars = {"-", "_"};

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.queue = str;
    }

    private String consumeEscapedCssIdentifier(String... strArr) {
        int i = this.pos;
        boolean z = false;
        while (!isEmpty()) {
            if (this.queue.charAt(this.pos) == '\\' && remainingLength() > 1) {
                this.pos += 2;
                z = true;
            } else {
                if (!matchesCssIdentifier(strArr)) {
                    break;
                }
                this.pos++;
            }
        }
        String substring = this.queue.substring(i, this.pos);
        if (z) {
            return unescape(substring);
        }
        return substring;
    }

    public static String escapeCssIdentifier(String str) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        TokenQueue tokenQueue = new TokenQueue(str);
        while (!tokenQueue.isEmpty()) {
            if (tokenQueue.matchesCssIdentifier(CssIdentifierChars)) {
                borrowBuilder.append(tokenQueue.consume());
            } else {
                borrowBuilder.append('\\');
                borrowBuilder.append(tokenQueue.consume());
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    private boolean matchesCssIdentifier(String... strArr) {
        if (!matchesWord() && !matchesAny(strArr)) {
            return false;
        }
        return true;
    }

    private int remainingLength() {
        return this.queue.length() - this.pos;
    }

    public static String unescape(String str) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    borrowBuilder.append(c2);
                    c = 0;
                }
            } else {
                borrowBuilder.append(c2);
            }
            c = c2;
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public void addFirst(String str) {
        this.queue = str + this.queue.substring(this.pos);
        this.pos = 0;
    }

    public void advance() {
        if (!isEmpty()) {
            this.pos++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[LOOP:0: B:2:0x0009->B:24:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[EDGE_INSN: B:25:0x0055->B:26:0x0055 BREAK  A[LOOP:0: B:2:0x0009->B:24:0x0079], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String chompBalanced(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
            r7 = r4
            r8 = r7
        L9:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L10
            goto L55
        L10:
            char r9 = r11.consume()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L53
            if (r3 != 0) goto L53
            if (r8 == 0) goto L34
            goto L53
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.pos
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = r1
        L4d:
            if (r7 <= 0) goto L53
            if (r2 == 0) goto L53
            int r6 = r11.pos
        L53:
            if (r7 > 0) goto L79
        L55:
            if (r6 < 0) goto L5e
            java.lang.String r11 = r11.queue
            java.lang.String r11 = r11.substring(r5, r6)
            goto L60
        L5e:
            java.lang.String r11 = ""
        L60:
            if (r7 <= 0) goto L78
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Did not find balanced marker at '"
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r13 = "'"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            org.jsoup.helper.Validate.fail(r12)
        L78:
            return r11
        L79:
            r2 = r9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.chompBalanced(char, char):java.lang.String");
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public void consume(String str) {
        if (matches(str)) {
            int length = str.length();
            if (length <= remainingLength()) {
                this.pos += length;
                return;
            } else {
                se.p("Queue not long enough to consume sequence");
                return;
            }
        }
        se.p("Queue did not match expected sequence");
    }

    public String consumeCssIdentifier() {
        return consumeEscapedCssIdentifier(CssIdentifierChars);
    }

    public String consumeElementSelector() {
        return consumeEscapedCssIdentifier(ElementSelectorChars);
    }

    public String consumeTo(String str) {
        int indexOf = this.queue.indexOf(str, this.pos);
        if (indexOf != -1) {
            String substring = this.queue.substring(this.pos, indexOf);
            this.pos = substring.length() + this.pos;
            return substring;
        }
        return remainder();
    }

    public String consumeToAny(String... strArr) {
        int i = this.pos;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.pos++;
        }
        return this.queue.substring(i, this.pos);
    }

    public String consumeToIgnoreCase(String str) {
        int i = this.pos;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (equals) {
                int indexOf = this.queue.indexOf(substring, this.pos);
                int i2 = this.pos;
                int i3 = indexOf - i2;
                if (i3 == 0) {
                    this.pos = i2 + 1;
                } else if (i3 < 0) {
                    this.pos = this.queue.length();
                } else {
                    this.pos = i2 + i3;
                }
            } else {
                this.pos++;
            }
        }
        return this.queue.substring(i, this.pos);
    }

    public boolean consumeWhitespace() {
        boolean z = false;
        while (matchesWhitespace()) {
            this.pos++;
            z = true;
        }
        return z;
    }

    public String consumeWord() {
        int i = this.pos;
        while (matchesWord()) {
            this.pos++;
        }
        return this.queue.substring(i, this.pos);
    }

    public boolean isEmpty() {
        if (remainingLength() == 0) {
            return true;
        }
        return false;
    }

    public boolean matchChomp(String str) {
        if (matches(str)) {
            this.pos = str.length() + this.pos;
            return true;
        }
        return false;
    }

    public boolean matches(String str) {
        return this.queue.regionMatches(true, this.pos, str, 0, str.length());
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c : cArr) {
            if (this.queue.charAt(this.pos) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesWhitespace() {
        if (!isEmpty() && StringUtil.isWhitespace(this.queue.charAt(this.pos))) {
            return true;
        }
        return false;
    }

    public boolean matchesWord() {
        if (!isEmpty() && Character.isLetterOrDigit(this.queue.charAt(this.pos))) {
            return true;
        }
        return false;
    }

    public String remainder() {
        String substring = this.queue.substring(this.pos);
        this.pos = this.queue.length();
        return substring;
    }

    public String toString() {
        return this.queue.substring(this.pos);
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public char consume() {
        String str = this.queue;
        int i = this.pos;
        this.pos = i + 1;
        return str.charAt(i);
    }
}
