package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ne1 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public CharSequence d;
    public Object e;

    public ne1(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            ll0.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            ll0.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new qm(charSequence, i));
    }

    public void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (!z) {
            ll0.a("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + AbstractJsonLexerKt.END_LIST);
        }
    }

    public int b() {
        gf0 gf0Var = (gf0) this.e;
        String str = (String) this.d;
        if (gf0Var == null) {
            return str.length();
        }
        return (gf0Var.b - gf0Var.b()) + (str.length() - (this.c - this.b));
    }

    public boolean c(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
                int i3 = i - 1;
                if (!Character.isSurrogate(charSequence.charAt(i3))) {
                    if (v50.d()) {
                        v50 a = v50.a();
                        if (a.c() != 1 || a.b(charSequence, i3) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean d(int i) {
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            return op1.m(Character.codePointBefore(this.d, i));
        }
        return false;
    }

    public boolean e(int i) {
        a(i);
        if (((BreakIterator) this.e).isBoundary(i)) {
            if (!g(i) || !g(i - 1) || !g(i + 1)) {
                if (i <= 0 || i >= this.d.length() - 1 || (!f(i) && !f(i + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean f(int i) {
        CharSequence charSequence = this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!sn0.r(of, unicodeBlock) || !sn0.r(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (sn0.r(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && sn0.r(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean g(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
                if (v50.d()) {
                    v50 a = v50.a();
                    if (a.c() != 1 || a.b(charSequence, i) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(int i) {
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            return op1.m(Character.codePointAt(this.d, i));
        }
        return false;
    }

    public int i(int i) {
        a(i);
        int following = ((BreakIterator) this.e).following(i);
        if (g(following - 1) && g(following) && !f(following)) {
            return i(following);
        }
        return following;
    }

    public int j(int i) {
        a(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        if (g(preceding) && c(preceding) && !f(preceding)) {
            return j(preceding);
        }
        return preceding;
    }

    public void k(int i, int i2, String str) {
        if (i > i2) {
            ll0.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            ll0.a("start must be non-negative, but was " + i);
        }
        gf0 gf0Var = (gf0) this.e;
        int i3 = 0;
        if (gf0Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i4 = i - min;
            str2.getClass();
            str2.getChars(i4, i, cArr, 0);
            String str3 = (String) this.d;
            int i5 = max - min2;
            int i6 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i6, cArr, i5);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            gf0 gf0Var2 = new gf0(i3);
            gf0Var2.b = max;
            gf0Var2.e = cArr;
            gf0Var2.c = length;
            gf0Var2.d = i5;
            this.e = gf0Var2;
            this.b = i4;
            this.c = i6;
            return;
        }
        int i7 = this.b;
        int i8 = i - i7;
        int i9 = i2 - i7;
        if (i8 >= 0 && i9 <= gf0Var.b - gf0Var.b()) {
            int length2 = str.length() - (i9 - i8);
            if (length2 > gf0Var.b()) {
                int b = length2 - gf0Var.b();
                int i10 = gf0Var.b;
                do {
                    i10 *= 2;
                } while (i10 - gf0Var.b < b);
                char[] cArr2 = new char[i10];
                bf.A((char[]) gf0Var.e, cArr2, 0, 0, gf0Var.c);
                int i11 = gf0Var.b;
                int i12 = gf0Var.d;
                int i13 = i11 - i12;
                int i14 = i10 - i13;
                bf.A((char[]) gf0Var.e, cArr2, i14, i12, i13 + i12);
                gf0Var.e = cArr2;
                gf0Var.b = i10;
                gf0Var.d = i14;
            }
            int i15 = gf0Var.c;
            if (i8 < i15 && i9 <= i15) {
                int i16 = i15 - i9;
                char[] cArr3 = (char[]) gf0Var.e;
                bf.A(cArr3, cArr3, gf0Var.d - i16, i9, i15);
                gf0Var.c = i8;
                gf0Var.d -= i16;
            } else if (i8 < i15 && i9 >= i15) {
                gf0Var.d = gf0Var.b() + i9;
                gf0Var.c = i8;
            } else {
                int b2 = gf0Var.b() + i8;
                int b3 = gf0Var.b() + i9;
                int i17 = gf0Var.d;
                char[] cArr4 = (char[]) gf0Var.e;
                bf.A(cArr4, cArr4, gf0Var.c, i17, b2);
                gf0Var.c += b2 - i17;
                gf0Var.d = b3;
            }
            str.getChars(0, str.length(), (char[]) gf0Var.e, gf0Var.c);
            gf0Var.c = str.length() + gf0Var.c;
            return;
        }
        this.d = toString();
        this.e = null;
        this.b = -1;
        this.c = -1;
        k(i, i2, str);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                gf0 gf0Var = (gf0) this.e;
                String str = (String) this.d;
                if (gf0Var != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, this.b);
                    sb.append((char[]) gf0Var.e, 0, gf0Var.c);
                    char[] cArr = (char[]) gf0Var.e;
                    int i = gf0Var.d;
                    sb.append(cArr, i, gf0Var.b - i);
                    String str2 = (String) this.d;
                    sb.append((CharSequence) str2, this.c, str2.length());
                    return sb.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ne1() {
    }
}
