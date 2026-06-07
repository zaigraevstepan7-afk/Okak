package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tb2 {
    public static final tb2 e;
    public static final tb2 f;
    public static final tb2 g;
    public static final /* synthetic */ tb2[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tb2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tb2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tb2] */
    static {
        ?? r0 = new Enum("ContinueTraversal", 0);
        e = r0;
        ?? r1 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f = r1;
        ?? r2 = new Enum("CancelTraversal", 2);
        g = r2;
        h = new tb2[]{r0, r1, r2};
    }

    public static tb2 valueOf(String str) {
        return (tb2) Enum.valueOf(tb2.class, str);
    }

    public static tb2[] values() {
        return (tb2[]) h.clone();
    }
}
