package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zn0 {
    public static final zn0 e;
    public static final zn0 f;
    public static final zn0 g;
    public static final zn0 h;
    public static final /* synthetic */ zn0[] i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zn0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zn0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zn0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, zn0] */
    static {
        ?? r0 = new Enum("LookaheadMeasurement", 0);
        e = r0;
        ?? r1 = new Enum("LookaheadPlacement", 1);
        f = r1;
        ?? r2 = new Enum("Measurement", 2);
        g = r2;
        ?? r3 = new Enum("Placement", 3);
        h = r3;
        i = new zn0[]{r0, r1, r2, r3};
    }

    public static zn0 valueOf(String str) {
        return (zn0) Enum.valueOf(zn0.class, str);
    }

    public static zn0[] values() {
        return (zn0[]) i.clone();
    }
}
