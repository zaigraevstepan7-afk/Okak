package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class um1 {
    public static final um1 e;
    public static final um1 f;
    public static final /* synthetic */ um1[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, um1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, um1] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        e = r0;
        ?? r1 = new Enum("Rtl", 1);
        f = r1;
        g = new um1[]{r0, r1};
    }

    public static um1 valueOf(String str) {
        return (um1) Enum.valueOf(um1.class, str);
    }

    public static um1[] values() {
        return (um1[]) g.clone();
    }
}
