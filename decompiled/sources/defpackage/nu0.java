package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nu0 {
    public static final nu0 e;
    public static final nu0 f;
    public static final nu0 g;
    public static final nu0 h;
    public static final nu0 i;
    public static final /* synthetic */ nu0[] j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nu0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nu0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nu0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, nu0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, nu0] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        e = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        f = r1;
        ?? r2 = new Enum("CREATED", 2);
        g = r2;
        ?? r3 = new Enum("STARTED", 3);
        h = r3;
        ?? r4 = new Enum("RESUMED", 4);
        i = r4;
        j = new nu0[]{r0, r1, r2, r3, r4};
    }

    public static nu0 valueOf(String str) {
        return (nu0) Enum.valueOf(nu0.class, str);
    }

    public static nu0[] values() {
        return (nu0[]) j.clone();
    }
}
