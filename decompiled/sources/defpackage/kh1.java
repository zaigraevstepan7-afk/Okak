package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kh1 {
    public static final kh1 e;
    public static final kh1 f;
    public static final kh1 g;
    public static final /* synthetic */ kh1[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kh1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kh1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kh1] */
    static {
        ?? r0 = new Enum("Initial", 0);
        e = r0;
        ?? r1 = new Enum("Main", 1);
        f = r1;
        ?? r2 = new Enum("Final", 2);
        g = r2;
        h = new kh1[]{r0, r1, r2};
    }

    public static kh1 valueOf(String str) {
        return (kh1) Enum.valueOf(kh1.class, str);
    }

    public static kh1[] values() {
        return (kh1[]) h.clone();
    }
}
