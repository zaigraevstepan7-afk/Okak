package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xl0 {
    public static final xl0 e;
    public static final xl0 f;
    public static final xl0 g;
    public static final /* synthetic */ xl0[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xl0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xl0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xl0] */
    static {
        ?? r0 = new Enum("Focused", 0);
        e = r0;
        ?? r1 = new Enum("UnfocusedEmpty", 1);
        f = r1;
        ?? r2 = new Enum("UnfocusedNotEmpty", 2);
        g = r2;
        h = new xl0[]{r0, r1, r2};
    }

    public static xl0 valueOf(String str) {
        return (xl0) Enum.valueOf(xl0.class, str);
    }

    public static xl0[] values() {
        return (xl0[]) h.clone();
    }
}
