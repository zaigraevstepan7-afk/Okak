package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tc {
    public static final tc e;
    public static final tc f;
    public static final tc g;
    public static final tc h;
    public static final tc i;
    public static final tc j;
    public static final tc k;
    public static final /* synthetic */ tc[] l;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, tc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, tc] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, tc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, tc] */
    static {
        ?? r0 = new Enum("Paragraph", 0);
        e = r0;
        ?? r1 = new Enum("Span", 1);
        f = r1;
        ?? r2 = new Enum("VerbatimTts", 2);
        g = r2;
        ?? r3 = new Enum("Url", 3);
        h = r3;
        ?? r4 = new Enum("Link", 4);
        i = r4;
        ?? r5 = new Enum("Clickable", 5);
        j = r5;
        ?? r6 = new Enum("String", 6);
        k = r6;
        l = new tc[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static tc valueOf(String str) {
        return (tc) Enum.valueOf(tc.class, str);
    }

    public static tc[] values() {
        return (tc[]) l.clone();
    }
}
