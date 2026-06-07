package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nf1 {
    public static final nf1 e;
    public static final nf1 f;
    public static final nf1 g;
    public static final nf1 h;
    public static final nf1 i;
    public static final nf1 j;
    public static final nf1 k;
    public static final /* synthetic */ nf1[] l;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nf1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nf1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nf1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, nf1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, nf1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, nf1] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, nf1] */
    static {
        ?? r0 = new Enum("Invalid", 0);
        e = r0;
        ?? r1 = new Enum("Cancelled", 1);
        f = r1;
        ?? r2 = new Enum("InitialPending", 2);
        g = r2;
        ?? r3 = new Enum("RecomposePending", 3);
        h = r3;
        ?? r4 = new Enum("Recomposing", 4);
        i = r4;
        ?? r5 = new Enum("ApplyPending", 5);
        j = r5;
        ?? r6 = new Enum("Applied", 6);
        k = r6;
        l = new nf1[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static nf1 valueOf(String str) {
        return (nf1) Enum.valueOf(nf1.class, str);
    }

    public static nf1[] values() {
        return (nf1[]) l.clone();
    }
}
