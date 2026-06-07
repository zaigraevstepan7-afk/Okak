package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class or0 {
    public static final or0 e;
    public static final /* synthetic */ or0[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, or0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, or0] */
    static {
        ?? r0 = new Enum("Horizontal", 0);
        e = r0;
        f = new or0[]{r0, new Enum("Vertical", 1)};
    }

    public static or0 valueOf(String str) {
        return (or0) Enum.valueOf(or0.class, str);
    }

    public static or0[] values() {
        return (or0[]) f.clone();
    }
}
