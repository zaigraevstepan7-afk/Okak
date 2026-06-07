package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sc0 {
    public static final sc0 e;
    public static final sc0 f;
    public static final sc0 g;
    public static final /* synthetic */ sc0[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [sc0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sc0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sc0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [sc0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Active", 0);
        e = r0;
        ?? r1 = new Enum("ActiveParent", 1);
        f = r1;
        ?? r2 = new Enum("Captured", 2);
        ?? r3 = new Enum("Inactive", 3);
        g = r3;
        h = new sc0[]{r0, r1, r2, r3};
    }

    public static sc0 valueOf(String str) {
        return (sc0) Enum.valueOf(sc0.class, str);
    }

    public static sc0[] values() {
        return (sc0[]) h.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        se.m();
                        return false;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
