package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e10 {
    public static final e10 e;
    public static final e10 f;
    public static final e10 g;
    public static final /* synthetic */ e10[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e10] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e10] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e10] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        e = r0;
        ?? r1 = new Enum("Horizontal", 1);
        f = r1;
        ?? r2 = new Enum("Both", 2);
        g = r2;
        h = new e10[]{r0, r1, r2};
    }

    public static e10 valueOf(String str) {
        return (e10) Enum.valueOf(e10.class, str);
    }

    public static e10[] values() {
        return (e10[]) h.clone();
    }
}
