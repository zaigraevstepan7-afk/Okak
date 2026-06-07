package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ka2 {
    public static final ka2 e;
    public static final ka2 f;
    public static final /* synthetic */ ka2[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ka2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ka2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ka2] */
    static {
        ?? r0 = new Enum("On", 0);
        e = r0;
        ?? r1 = new Enum("Off", 1);
        f = r1;
        g = new ka2[]{r0, r1, new Enum("Indeterminate", 2)};
    }

    public static ka2 valueOf(String str) {
        return (ka2) Enum.valueOf(ka2.class, str);
    }

    public static ka2[] values() {
        return (ka2[]) g.clone();
    }
}
