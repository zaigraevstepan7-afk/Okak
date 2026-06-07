package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i81 {
    public static final i81 e;
    public static final i81 f;
    public static final /* synthetic */ i81[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [i81, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [i81, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Width", 0);
        e = r0;
        ?? r1 = new Enum("Height", 1);
        f = r1;
        g = new i81[]{r0, r1};
    }

    public static i81 valueOf(String str) {
        return (i81) Enum.valueOf(i81.class, str);
    }

    public static i81[] values() {
        return (i81[]) g.clone();
    }
}
