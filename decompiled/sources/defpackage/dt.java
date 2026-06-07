package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dt {
    public static final dt e;
    public static final dt f;
    public static final /* synthetic */ dt[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [dt, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dt, java.lang.Enum] */
    static {
        ?? r0 = new Enum("VIEW_APPEAR", 0);
        e = r0;
        ?? r1 = new Enum("VIEW_DISAPPEAR", 1);
        f = r1;
        g = new dt[]{r0, r1};
    }

    public static dt valueOf(String str) {
        return (dt) Enum.valueOf(dt.class, str);
    }

    public static dt[] values() {
        return (dt[]) g.clone();
    }
}
