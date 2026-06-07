package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t41 {
    public static final t41 e;
    public static final t41 f;
    public static final t41 g;
    public static final /* synthetic */ t41[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [t41, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t41, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t41, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Default", 0);
        e = r0;
        ?? r1 = new Enum("UserInput", 1);
        f = r1;
        ?? r2 = new Enum("PreventUserInput", 2);
        g = r2;
        h = new t41[]{r0, r1, r2};
    }

    public static t41 valueOf(String str) {
        return (t41) Enum.valueOf(t41.class, str);
    }

    public static t41[] values() {
        return (t41[]) h.clone();
    }
}
