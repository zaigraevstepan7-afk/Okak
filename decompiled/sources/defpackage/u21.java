package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u21 {
    public static final u21 e;
    public static final u21 f;
    public static final u21 g;
    public static final u21 h;
    public static final u21 i;
    public static final /* synthetic */ u21[] j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u21] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u21] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u21] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, u21] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, u21] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, u21] */
    static {
        ?? r0 = new Enum("DefaultSpatial", 0);
        e = r0;
        ?? r1 = new Enum("FastSpatial", 1);
        f = r1;
        ?? r2 = new Enum("SlowSpatial", 2);
        ?? r3 = new Enum("DefaultEffects", 3);
        g = r3;
        ?? r4 = new Enum("FastEffects", 4);
        h = r4;
        ?? r5 = new Enum("SlowEffects", 5);
        i = r5;
        j = new u21[]{r0, r1, r2, r3, r4, r5};
    }

    public static u21 valueOf(String str) {
        return (u21) Enum.valueOf(u21.class, str);
    }

    public static u21[] values() {
        return (u21[]) j.clone();
    }
}
