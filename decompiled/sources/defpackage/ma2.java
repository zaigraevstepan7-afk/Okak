package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ma2 {
    public static final ma2 e;
    public static final ma2 f;
    public static final ma2 g;
    public static final /* synthetic */ ma2[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ma2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ma2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ma2] */
    static {
        ?? r0 = new Enum("Uninitialized", 0);
        e = r0;
        ?? r1 = new Enum("Detached", 1);
        f = r1;
        ?? r2 = new Enum("Attached", 2);
        g = r2;
        h = new ma2[]{r0, r1, r2};
    }

    public static ma2 valueOf(String str) {
        return (ma2) Enum.valueOf(ma2.class, str);
    }

    public static ma2[] values() {
        return (ma2[]) h.clone();
    }
}
