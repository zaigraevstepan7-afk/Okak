package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cg0 {
    public static final cg0 e;
    public static final cg0 f;
    public static final /* synthetic */ cg0[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cg0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cg0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, cg0] */
    static {
        ?? r0 = new Enum("First", 0);
        e = r0;
        ?? r1 = new Enum("Last", 1);
        f = r1;
        g = new cg0[]{r0, r1, new Enum("Only", 2)};
    }

    public static cg0 valueOf(String str) {
        return (cg0) Enum.valueOf(cg0.class, str);
    }

    public static cg0[] values() {
        return (cg0[]) g.clone();
    }
}
