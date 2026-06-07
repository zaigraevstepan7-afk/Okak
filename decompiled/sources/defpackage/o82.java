package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o82 {
    public static final o82 e;
    public static final o82 f;
    public static final o82 g;
    public static final o82 h;
    public static final /* synthetic */ o82[] i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o82] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o82] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, o82] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, o82] */
    static {
        ?? r0 = new Enum("StartInput", 0);
        e = r0;
        ?? r1 = new Enum("StopInput", 1);
        f = r1;
        ?? r2 = new Enum("ShowKeyboard", 2);
        g = r2;
        ?? r3 = new Enum("HideKeyboard", 3);
        h = r3;
        i = new o82[]{r0, r1, r2, r3};
    }

    public static o82 valueOf(String str) {
        return (o82) Enum.valueOf(o82.class, str);
    }

    public static o82[] values() {
        return (o82[]) i.clone();
    }
}
