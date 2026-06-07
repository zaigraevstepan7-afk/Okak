package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uw1 {
    public static final uw1 e;
    public static final uw1 f;
    public static final uw1 g;
    public static final /* synthetic */ uw1[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uw1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uw1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, uw1] */
    static {
        ?? r0 = new Enum("START", 0);
        e = r0;
        ?? r1 = new Enum("STOP", 1);
        f = r1;
        ?? r2 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        g = r2;
        h = new uw1[]{r0, r1, r2};
    }

    public static uw1 valueOf(String str) {
        return (uw1) Enum.valueOf(uw1.class, str);
    }

    public static uw1[] values() {
        return (uw1[]) h.clone();
    }
}
