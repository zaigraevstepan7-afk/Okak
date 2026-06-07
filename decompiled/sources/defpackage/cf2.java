package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cf2 {
    public static final cf2 e;
    public static final cf2 f;
    public static final /* synthetic */ cf2[] g;

    /* JADX INFO: Fake field, exist only in values array */
    cf2 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cf2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cf2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, cf2] */
    static {
        ?? r0 = new Enum("STRICT", 0);
        ?? r1 = new Enum("LOG", 1);
        e = r1;
        ?? r2 = new Enum("QUIET", 2);
        f = r2;
        g = new cf2[]{r0, r1, r2};
    }

    public static cf2 valueOf(String str) {
        return (cf2) Enum.valueOf(cf2.class, str);
    }

    public static cf2[] values() {
        return (cf2[]) g.clone();
    }
}
