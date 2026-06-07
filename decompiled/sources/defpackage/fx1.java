package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fx1 {
    public static final fx1 e;
    public static final fx1 f;
    public static final fx1 g;
    public static final /* synthetic */ fx1[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fx1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fx1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fx1] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        e = r0;
        ?? r1 = new Enum("Expanded", 1);
        f = r1;
        ?? r2 = new Enum("PartiallyExpanded", 2);
        g = r2;
        h = new fx1[]{r0, r1, r2};
    }

    public static fx1 valueOf(String str) {
        return (fx1) Enum.valueOf(fx1.class, str);
    }

    public static fx1[] values() {
        return (fx1[]) h.clone();
    }
}
