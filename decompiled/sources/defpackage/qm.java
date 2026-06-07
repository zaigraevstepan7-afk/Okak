package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qm implements CharacterIterator {
    public final CharSequence e;
    public final int f;
    public int g = 0;

    public qm(CharSequence charSequence, int i) {
        this.e = charSequence;
        this.f = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.g;
        if (i == this.f) {
            return (char) 65535;
        }
        return this.e.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.g = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.g;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f;
        if (i == 0) {
            this.g = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.g = i2;
        return this.e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.g + 1;
        this.g = i;
        int i2 = this.f;
        if (i >= i2) {
            this.g = i2;
            return (char) 65535;
        }
        return this.e.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.g;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.g = i2;
        return this.e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i <= this.f && i >= 0) {
            this.g = i;
            return current();
        }
        se.h("invalid position");
        return (char) 0;
    }
}
