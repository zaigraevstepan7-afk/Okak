package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pr1 {
    public static final pr1 e;
    public static final pr1 f;
    public static final pr1 g;
    public static final pr1 h;
    public static final pr1 i;
    public static final /* synthetic */ pr1[] j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pr1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pr1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pr1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pr1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pr1] */
    static {
        ?? r0 = new Enum("TopBar", 0);
        e = r0;
        ?? r1 = new Enum("MainContent", 1);
        f = r1;
        ?? r2 = new Enum("Snackbar", 2);
        g = r2;
        ?? r3 = new Enum("Fab", 3);
        h = r3;
        ?? r4 = new Enum("BottomBar", 4);
        i = r4;
        j = new pr1[]{r0, r1, r2, r3, r4};
    }

    public static pr1 valueOf(String str) {
        return (pr1) Enum.valueOf(pr1.class, str);
    }

    public static pr1[] values() {
        return (pr1[]) j.clone();
    }
}
