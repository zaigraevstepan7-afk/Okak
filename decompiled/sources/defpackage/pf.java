package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pf {
    public static final pf e;
    public static final pf f;
    public static final pf g;
    public static final /* synthetic */ pf[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pf] */
    static {
        ?? r0 = new Enum("None", 0);
        e = r0;
        ?? r1 = new Enum("Paste", 1);
        f = r1;
        ?? r2 = new Enum("Manual", 2);
        g = r2;
        h = new pf[]{r0, r1, r2};
    }

    public static pf valueOf(String str) {
        return (pf) Enum.valueOf(pf.class, str);
    }

    public static pf[] values() {
        return (pf[]) h.clone();
    }
}
