package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d20 {
    public static final d20 e;
    public static final d20 f;
    public static final d20 g;
    public static final d20 h;
    public static final /* synthetic */ d20[] i;

    /* JADX WARN: Type inference failed for: r0v0, types: [d20, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d20, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d20, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [d20, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Up", 0);
        e = r0;
        ?? r1 = new Enum("Drag", 1);
        f = r1;
        ?? r2 = new Enum("Timeout", 2);
        g = r2;
        ?? r3 = new Enum("Cancel", 3);
        h = r3;
        i = new d20[]{r0, r1, r2, r3};
    }

    public static d20 valueOf(String str) {
        return (d20) Enum.valueOf(d20.class, str);
    }

    public static d20[] values() {
        return (d20[]) i.clone();
    }
}
