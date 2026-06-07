package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h81 {
    public static final h81 e;
    public static final h81 f;
    public static final /* synthetic */ h81[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [h81, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h81, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Min", 0);
        e = r0;
        ?? r1 = new Enum("Max", 1);
        f = r1;
        g = new h81[]{r0, r1};
    }

    public static h81 valueOf(String str) {
        return (h81) Enum.valueOf(h81.class, str);
    }

    public static h81[] values() {
        return (h81[]) g.clone();
    }
}
