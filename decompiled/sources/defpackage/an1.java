package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class an1 {
    public static final an1 e;
    public static final an1 f;
    public static final an1 g;
    public static final /* synthetic */ an1[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, an1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, an1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, an1] */
    static {
        ?? r0 = new Enum("SOUND", 0);
        e = r0;
        ?? r1 = new Enum("IMAGE", 1);
        f = r1;
        ?? r2 = new Enum("AVATAR", 2);
        g = r2;
        h = new an1[]{r0, r1, r2};
    }

    public static an1 valueOf(String str) {
        return (an1) Enum.valueOf(an1.class, str);
    }

    public static an1[] values() {
        return (an1[]) h.clone();
    }
}
