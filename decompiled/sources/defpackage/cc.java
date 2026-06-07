package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cc {
    public static final cc e;
    public static final cc f;
    public static final /* synthetic */ cc[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [cc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BoundReached", 0);
        e = r0;
        ?? r1 = new Enum("Finished", 1);
        f = r1;
        g = new cc[]{r0, r1};
    }

    public static cc valueOf(String str) {
        return (cc) Enum.valueOf(cc.class, str);
    }

    public static cc[] values() {
        return (cc[]) g.clone();
    }
}
