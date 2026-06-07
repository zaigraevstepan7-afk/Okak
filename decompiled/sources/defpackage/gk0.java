package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gk0 {
    public static final gk0 e;
    public static final gk0 f;
    public static final gk0 g;
    public static final /* synthetic */ gk0[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gk0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gk0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gk0] */
    static {
        ?? r0 = new Enum("Yes", 0);
        e = r0;
        ?? r1 = new Enum("No", 1);
        f = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        g = r2;
        h = new gk0[]{r0, r1, r2};
    }

    public static gk0 valueOf(String str) {
        return (gk0) Enum.valueOf(gk0.class, str);
    }

    public static gk0[] values() {
        return (gk0[]) h.clone();
    }
}
