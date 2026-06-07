package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zv {
    public static final zv e;
    public static final zv f;
    public static final zv g;
    public static final /* synthetic */ zv[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zv] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, zv] */
    static {
        ?? r0 = new Enum("None", 0);
        e = r0;
        ?? r1 = new Enum("Cancelled", 1);
        f = r1;
        ?? r2 = new Enum("Redirected", 2);
        g = r2;
        h = new zv[]{r0, r1, r2, new Enum("RedirectCancelled", 3)};
    }

    public static zv valueOf(String str) {
        return (zv) Enum.valueOf(zv.class, str);
    }

    public static zv[] values() {
        return (zv[]) h.clone();
    }
}
