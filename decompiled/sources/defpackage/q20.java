package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q20 {
    public static final q20 e;
    public static final q20 f;
    public static final q20 g;
    public static final /* synthetic */ q20[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q20] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, q20] */
    static {
        ?? r0 = new Enum("Yes", 0);
        e = r0;
        ?? r1 = new Enum("No", 1);
        f = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        g = r2;
        h = new q20[]{r0, r1, r2};
    }

    public static q20 valueOf(String str) {
        return (q20) Enum.valueOf(q20.class, str);
    }

    public static q20[] values() {
        return (q20[]) h.clone();
    }
}
