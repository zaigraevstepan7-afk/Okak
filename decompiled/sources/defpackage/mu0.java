package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mu0 {
    private static final /* synthetic */ h70 $ENTRIES;
    private static final /* synthetic */ mu0[] $VALUES;
    public static final ku0 Companion;
    public static final mu0 ON_ANY;
    public static final mu0 ON_CREATE;
    public static final mu0 ON_DESTROY;
    public static final mu0 ON_PAUSE;
    public static final mu0 ON_RESUME;
    public static final mu0 ON_START;
    public static final mu0 ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mu0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ku0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mu0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mu0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mu0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, mu0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, mu0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, mu0] */
    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r2 = new Enum("ON_RESUME", 2);
        ON_RESUME = r2;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        mu0[] mu0VarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = mu0VarArr;
        $ENTRIES = new i70(mu0VarArr);
        Companion = new Object();
    }

    public static mu0 valueOf(String str) {
        return (mu0) Enum.valueOf(mu0.class, str);
    }

    public static mu0[] values() {
        return (mu0[]) $VALUES.clone();
    }

    public final nu0 a() {
        switch (lu0.a[ordinal()]) {
            case 1:
            case 2:
                return nu0.g;
            case 3:
            case 4:
                return nu0.h;
            case 5:
                return nu0.i;
            case 6:
                return nu0.e;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                se.m();
                return null;
        }
    }
}
