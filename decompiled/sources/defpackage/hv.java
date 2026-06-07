package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hv {
    public static final hv e;
    public static final hv f;
    public static final hv g;
    public static final /* synthetic */ hv[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hv] */
    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        e = r0;
        ?? r1 = new Enum("UNDECIDED", 1);
        f = r1;
        ?? r2 = new Enum("RESUMED", 2);
        g = r2;
        h = new hv[]{r0, r1, r2};
    }

    public static hv valueOf(String str) {
        return (hv) Enum.valueOf(hv.class, str);
    }

    public static hv[] values() {
        return (hv[]) h.clone();
    }
}
