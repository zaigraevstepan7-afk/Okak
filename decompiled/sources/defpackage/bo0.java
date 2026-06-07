package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bo0 {
    public static final bo0 e;
    public static final bo0 f;
    public static final bo0 g;
    public static final bo0 h;
    public static final /* synthetic */ bo0[] i;

    /* JADX WARN: Type inference failed for: r0v0, types: [bo0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bo0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bo0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bo0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IGNORED", 0);
        e = r0;
        ?? r1 = new Enum("SCHEDULED", 1);
        f = r1;
        ?? r2 = new Enum("DEFERRED", 2);
        g = r2;
        ?? r3 = new Enum("IMMINENT", 3);
        h = r3;
        i = new bo0[]{r0, r1, r2, r3};
    }

    public static bo0 valueOf(String str) {
        return (bo0) Enum.valueOf(bo0.class, str);
    }

    public static bo0[] values() {
        return (bo0[]) i.clone();
    }
}
