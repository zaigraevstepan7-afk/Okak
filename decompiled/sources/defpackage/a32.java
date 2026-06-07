package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a32 {
    public static final a32 e;
    public static final a32 f;
    public static final a32 g;
    public static final /* synthetic */ a32[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [a32, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a32, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a32, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ERROR", 0);
        e = r0;
        ?? r1 = new Enum("FROZEN", 1);
        f = r1;
        ?? r2 = new Enum("WARNING", 2);
        g = r2;
        h = new a32[]{r0, r1, r2};
    }

    public static a32 valueOf(String str) {
        return (a32) Enum.valueOf(a32.class, str);
    }

    public static a32[] values() {
        return (a32[]) h.clone();
    }
}
