package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class eu1 {
    public static final eu1 e;
    public static final eu1 f;
    public static final eu1 g;
    public static final /* synthetic */ eu1[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [eu1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eu1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eu1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Left", 0);
        e = r0;
        ?? r1 = new Enum("Middle", 1);
        f = r1;
        ?? r2 = new Enum("Right", 2);
        g = r2;
        h = new eu1[]{r0, r1, r2};
    }

    public static eu1 valueOf(String str) {
        return (eu1) Enum.valueOf(eu1.class, str);
    }

    public static eu1[] values() {
        return (eu1[]) h.clone();
    }
}
