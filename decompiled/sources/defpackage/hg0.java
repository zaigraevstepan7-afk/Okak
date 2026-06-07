package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hg0 {
    public static final hg0 e;
    public static final hg0 f;
    public static final hg0 g;
    public static final /* synthetic */ hg0[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [hg0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hg0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hg0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Cursor", 0);
        e = r0;
        ?? r1 = new Enum("SelectionStart", 1);
        f = r1;
        ?? r2 = new Enum("SelectionEnd", 2);
        g = r2;
        h = new hg0[]{r0, r1, r2};
    }

    public static hg0 valueOf(String str) {
        return (hg0) Enum.valueOf(hg0.class, str);
    }

    public static hg0[] values() {
        return (hg0[]) h.clone();
    }
}
