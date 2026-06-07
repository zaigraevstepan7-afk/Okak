package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sb1 {
    public static final sb1 e;
    public static final sb1 f;
    public static final /* synthetic */ sb1[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [sb1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sb1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        e = r0;
        ?? r1 = new Enum("Horizontal", 1);
        f = r1;
        g = new sb1[]{r0, r1};
    }

    public static sb1 valueOf(String str) {
        return (sb1) Enum.valueOf(sb1.class, str);
    }

    public static sb1[] values() {
        return (sb1[]) g.clone();
    }
}
