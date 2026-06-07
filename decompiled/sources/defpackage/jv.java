package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jv {
    public static final jv e;
    public static final jv f;
    public static final jv g;
    public static final jv h;
    public static final /* synthetic */ jv[] i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jv] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, jv] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        e = r0;
        ?? r1 = new Enum("LAZY", 1);
        f = r1;
        ?? r2 = new Enum("ATOMIC", 2);
        g = r2;
        ?? r3 = new Enum("UNDISPATCHED", 3);
        h = r3;
        i = new jv[]{r0, r1, r2, r3};
    }

    public static jv valueOf(String str) {
        return (jv) Enum.valueOf(jv.class, str);
    }

    public static jv[] values() {
        return (jv[]) i.clone();
    }
}
