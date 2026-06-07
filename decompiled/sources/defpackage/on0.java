package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class on0 {
    public static final on0 e;
    public static final on0 f;
    public static final /* synthetic */ on0[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [on0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [on0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Min", 0);
        e = r0;
        ?? r1 = new Enum("Max", 1);
        f = r1;
        g = new on0[]{r0, r1};
    }

    public static on0 valueOf(String str) {
        return (on0) Enum.valueOf(on0.class, str);
    }

    public static on0[] values() {
        return (on0[]) g.clone();
    }
}
