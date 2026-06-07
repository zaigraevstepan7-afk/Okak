package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jg0 {
    public static final jg0 e;
    public static final jg0 f;
    public static final jg0 g;
    public static final /* synthetic */ jg0[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [jg0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jg0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jg0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("None", 0);
        e = r0;
        ?? r1 = new Enum("Selection", 1);
        f = r1;
        ?? r2 = new Enum("Cursor", 2);
        g = r2;
        h = new jg0[]{r0, r1, r2};
    }

    public static jg0 valueOf(String str) {
        return (jg0) Enum.valueOf(jg0.class, str);
    }

    public static jg0[] values() {
        return (jg0[]) h.clone();
    }
}
