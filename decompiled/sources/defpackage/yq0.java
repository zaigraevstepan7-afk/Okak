package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yq0 {
    public static final yq0 e;
    public static final yq0 f;
    public static final yq0 g;
    public static final /* synthetic */ yq0[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yq0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yq0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, yq0] */
    static {
        ?? r0 = new Enum("InMeasureBlock", 0);
        e = r0;
        ?? r1 = new Enum("InLayoutBlock", 1);
        f = r1;
        ?? r2 = new Enum("NotUsed", 2);
        g = r2;
        h = new yq0[]{r0, r1, r2};
    }

    public static yq0 valueOf(String str) {
        return (yq0) Enum.valueOf(yq0.class, str);
    }

    public static yq0[] values() {
        return (yq0[]) h.clone();
    }
}
