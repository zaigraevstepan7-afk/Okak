package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q01 {
    public static final q01 e;
    public static final q01 f;
    public static final /* synthetic */ q01[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [q01, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q01, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Width", 0);
        e = r0;
        ?? r1 = new Enum("Height", 1);
        f = r1;
        g = new q01[]{r0, r1};
    }

    public static q01 valueOf(String str) {
        return (q01) Enum.valueOf(q01.class, str);
    }

    public static q01[] values() {
        return (q01[]) g.clone();
    }
}
