package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xz1 {
    public static final xz1 e;
    public static final xz1 f;
    public static final /* synthetic */ xz1[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xz1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xz1] */
    static {
        ?? r0 = new Enum("Dismissed", 0);
        e = r0;
        ?? r1 = new Enum("ActionPerformed", 1);
        f = r1;
        g = new xz1[]{r0, r1};
    }

    public static xz1 valueOf(String str) {
        return (xz1) Enum.valueOf(xz1.class, str);
    }

    public static xz1[] values() {
        return (xz1[]) g.clone();
    }
}
