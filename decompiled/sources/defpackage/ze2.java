package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ze2 {
    public static final ze2 e;
    public static final ze2 f;
    public static final /* synthetic */ ze2[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ze2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ze2] */
    static {
        ?? r0 = new Enum("Lsq2", 0);
        e = r0;
        ?? r1 = new Enum("Impulse", 1);
        f = r1;
        g = new ze2[]{r0, r1};
    }

    public static ze2 valueOf(String str) {
        return (ze2) Enum.valueOf(ze2.class, str);
    }

    public static ze2[] values() {
        return (ze2[]) g.clone();
    }
}
