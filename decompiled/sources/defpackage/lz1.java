package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lz1 {
    public static final lz1 e;
    public static final lz1 f;
    public static final /* synthetic */ lz1[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [lz1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [lz1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [lz1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Short", 0);
        e = r0;
        ?? r1 = new Enum("Long", 1);
        ?? r2 = new Enum("Indefinite", 2);
        f = r2;
        g = new lz1[]{r0, r1, r2};
    }

    public static lz1 valueOf(String str) {
        return (lz1) Enum.valueOf(lz1.class, str);
    }

    public static lz1[] values() {
        return (lz1[]) g.clone();
    }
}
