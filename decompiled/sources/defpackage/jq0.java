package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jq0 {
    public static final jq0 e;
    public static final jq0 f;
    public static final /* synthetic */ jq0[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jq0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jq0] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        e = r0;
        ?? r1 = new Enum("Rtl", 1);
        f = r1;
        g = new jq0[]{r0, r1};
    }

    public static jq0 valueOf(String str) {
        return (jq0) Enum.valueOf(jq0.class, str);
    }

    public static jq0[] values() {
        return (jq0[]) g.clone();
    }
}
