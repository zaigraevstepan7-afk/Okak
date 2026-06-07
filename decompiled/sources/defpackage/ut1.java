package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ut1 {
    public static final ut1 e;
    public static final /* synthetic */ ut1[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [ut1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ut1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("EditableText", 0);
        e = r0;
        f = new ut1[]{r0, new Enum("StaticText", 1)};
    }

    public static ut1 valueOf(String str) {
        return (ut1) Enum.valueOf(ut1.class, str);
    }

    public static ut1[] values() {
        return (ut1[]) f.clone();
    }
}
