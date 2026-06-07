package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ny1 {
    public static final ny1 e;
    public static final ny1 f;
    public static final /* synthetic */ ny1[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ny1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ny1] */
    static {
        ?? r0 = new Enum("THUMB", 0);
        e = r0;
        ?? r1 = new Enum("TRACK", 1);
        f = r1;
        g = new ny1[]{r0, r1};
    }

    public static ny1 valueOf(String str) {
        return (ny1) Enum.valueOf(ny1.class, str);
    }

    public static ny1[] values() {
        return (ny1[]) g.clone();
    }
}
