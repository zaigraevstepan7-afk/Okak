package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bg0 {
    public static final bg0 e;
    public static final bg0 f;
    public static final bg0 g;
    public static final /* synthetic */ bg0[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bg0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bg0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, bg0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, bg0] */
    static {
        ?? r0 = new Enum("First", 0);
        e = r0;
        ?? r1 = new Enum("Middle", 1);
        ?? r2 = new Enum("Last", 2);
        f = r2;
        ?? r3 = new Enum("Only", 3);
        g = r3;
        h = new bg0[]{r0, r1, r2, r3};
    }

    public static bg0 valueOf(String str) {
        return (bg0) Enum.valueOf(bg0.class, str);
    }

    public static bg0[] values() {
        return (bg0[]) h.clone();
    }
}
