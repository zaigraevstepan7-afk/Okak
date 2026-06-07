package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m40 {
    public static final m40 e;
    public static final m40 f;
    public static final /* synthetic */ m40[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m40] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m40] */
    static {
        ?? r0 = new Enum("Closed", 0);
        e = r0;
        ?? r1 = new Enum("Open", 1);
        f = r1;
        g = new m40[]{r0, r1};
    }

    public static m40 valueOf(String str) {
        return (m40) Enum.valueOf(m40.class, str);
    }

    public static m40[] values() {
        return (m40[]) g.clone();
    }
}
