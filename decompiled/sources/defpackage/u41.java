package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u41 {
    public static final u41 e;
    public static final /* synthetic */ u41[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [u41, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [u41, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [u41, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Default", 0);
        e = r0;
        f = new u41[]{r0, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
    }

    public static u41 valueOf(String str) {
        return (u41) Enum.valueOf(u41.class, str);
    }

    public static u41[] values() {
        return (u41[]) f.clone();
    }
}
