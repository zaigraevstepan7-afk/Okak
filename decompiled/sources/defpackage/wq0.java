package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wq0 {
    public static final wq0 e;
    public static final wq0 f;
    public static final wq0 g;
    public static final wq0 h;
    public static final wq0 i;
    public static final /* synthetic */ wq0[] j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wq0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wq0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wq0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, wq0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, wq0] */
    static {
        ?? r0 = new Enum("Measuring", 0);
        e = r0;
        ?? r1 = new Enum("LookaheadMeasuring", 1);
        f = r1;
        ?? r2 = new Enum("LayingOut", 2);
        g = r2;
        ?? r3 = new Enum("LookaheadLayingOut", 3);
        h = r3;
        ?? r4 = new Enum("Idle", 4);
        i = r4;
        j = new wq0[]{r0, r1, r2, r3, r4};
    }

    public static wq0 valueOf(String str) {
        return (wq0) Enum.valueOf(wq0.class, str);
    }

    public static wq0[] values() {
        return (wq0[]) j.clone();
    }
}
