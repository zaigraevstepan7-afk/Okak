package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ct1 {
    public static final ct1 e;
    public static final ct1 f;
    public static final /* synthetic */ ct1[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [ct1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ct1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ct1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Inherit", 0);
        e = r0;
        ?? r1 = new Enum("SecureOn", 1);
        f = r1;
        g = new ct1[]{r0, r1, new Enum("SecureOff", 2)};
    }

    public static ct1 valueOf(String str) {
        return (ct1) Enum.valueOf(ct1.class, str);
    }

    public static ct1[] values() {
        return (ct1[]) g.clone();
    }
}
