package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r60 {
    public static final r60 e;
    public static final r60 f;
    public static final r60 g;
    public static final /* synthetic */ r60[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r60] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r60] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r60] */
    static {
        ?? r0 = new Enum("PreEnter", 0);
        e = r0;
        ?? r1 = new Enum("Visible", 1);
        f = r1;
        ?? r2 = new Enum("PostExit", 2);
        g = r2;
        h = new r60[]{r0, r1, r2};
    }

    public static r60 valueOf(String str) {
        return (r60) Enum.valueOf(r60.class, str);
    }

    public static r60[] values() {
        return (r60[]) h.clone();
    }
}
