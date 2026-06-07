package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tb0 {
    public static final tb0 e;
    public static final /* synthetic */ tb0[] f;

    /* JADX INFO: Fake field, exist only in values array */
    tb0 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [tb0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tb0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tb0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [tb0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Visible", 0);
        ?? r1 = new Enum("Clip", 1);
        e = r1;
        f = new tb0[]{r0, r1, new Enum("ExpandIndicator", 2), new Enum("ExpandOrCollapseIndicator", 3)};
    }

    public static tb0 valueOf(String str) {
        return (tb0) Enum.valueOf(tb0.class, str);
    }

    public static tb0[] values() {
        return (tb0[]) f.clone();
    }
}
