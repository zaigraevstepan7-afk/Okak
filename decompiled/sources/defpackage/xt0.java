package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xt0 {
    public static final xt0 e;
    public static final xt0 f;
    public static final /* synthetic */ xt0[] g;

    /* JADX INFO: Fake field, exist only in values array */
    xt0 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xt0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xt0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xt0] */
    static {
        ?? r0 = new Enum("SYNCHRONIZED", 0);
        ?? r1 = new Enum("PUBLICATION", 1);
        e = r1;
        ?? r2 = new Enum("NONE", 2);
        f = r2;
        g = new xt0[]{r0, r1, r2};
    }

    public static xt0 valueOf(String str) {
        return (xt0) Enum.valueOf(xt0.class, str);
    }

    public static xt0[] values() {
        return (xt0[]) g.clone();
    }
}
