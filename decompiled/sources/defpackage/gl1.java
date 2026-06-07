package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gl1 {
    public static final gl1 e;
    public static final gl1 f;
    public static final gl1 g;
    public static final gl1 h;
    public static final gl1 i;
    public static final gl1 j;
    public static final /* synthetic */ gl1[] k;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gl1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gl1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gl1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, gl1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, gl1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, gl1] */
    static {
        ?? r0 = new Enum("ShutDown", 0);
        e = r0;
        ?? r1 = new Enum("ShuttingDown", 1);
        f = r1;
        ?? r2 = new Enum("Inactive", 2);
        g = r2;
        ?? r3 = new Enum("InactivePendingWork", 3);
        h = r3;
        ?? r4 = new Enum("Idle", 4);
        i = r4;
        ?? r5 = new Enum("PendingWork", 5);
        j = r5;
        k = new gl1[]{r0, r1, r2, r3, r4, r5};
    }

    public static gl1 valueOf(String str) {
        return (gl1) Enum.valueOf(gl1.class, str);
    }

    public static gl1[] values() {
        return (gl1[]) k.clone();
    }
}
