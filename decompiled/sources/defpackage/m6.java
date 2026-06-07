package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m6 {
    public static final m6 e;
    public static final m6 f;
    public static final /* synthetic */ m6[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m6] */
    static {
        ?? r0 = new Enum("SHOW_ORIGINAL", 0);
        e = r0;
        ?? r1 = new Enum("SHOW_TRANSLATED", 1);
        f = r1;
        g = new m6[]{r0, r1};
    }

    public static m6 valueOf(String str) {
        return (m6) Enum.valueOf(m6.class, str);
    }

    public static m6[] values() {
        return (m6[]) g.clone();
    }
}
