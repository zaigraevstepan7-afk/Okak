package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jk {
    public static final jk e;
    public static final jk f;
    public static final jk g;
    public static final /* synthetic */ jk[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [jk, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jk, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jk, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SUSPEND", 0);
        e = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        f = r1;
        ?? r2 = new Enum("DROP_LATEST", 2);
        g = r2;
        h = new jk[]{r0, r1, r2};
    }

    public static jk valueOf(String str) {
        return (jk) Enum.valueOf(jk.class, str);
    }

    public static jk[] values() {
        return (jk[]) h.clone();
    }
}
