package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qv {
    public static final qv e;
    public static final qv f;
    public static final qv g;
    public static final /* synthetic */ qv[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qv] */
    static {
        ?? r0 = new Enum("CROSSED", 0);
        e = r0;
        ?? r1 = new Enum("NOT_CROSSED", 1);
        f = r1;
        ?? r2 = new Enum("COLLAPSED", 2);
        g = r2;
        h = new qv[]{r0, r1, r2};
    }

    public static qv valueOf(String str) {
        return (qv) Enum.valueOf(qv.class, str);
    }

    public static qv[] values() {
        return (qv[]) h.clone();
    }
}
