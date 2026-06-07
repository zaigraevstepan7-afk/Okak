package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nm1 {
    public static final nm1 e;
    public static final /* synthetic */ nm1[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [nm1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [nm1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Restart", 0);
        e = r0;
        f = new nm1[]{r0, new Enum("Reverse", 1)};
    }

    public static nm1 valueOf(String str) {
        return (nm1) Enum.valueOf(nm1.class, str);
    }

    public static nm1[] values() {
        return (nm1[]) f.clone();
    }
}
