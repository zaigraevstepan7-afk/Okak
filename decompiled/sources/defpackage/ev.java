package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ev {
    public static final ev e;
    public static final ev f;
    public static final ev g;
    public static final ev h;
    public static final ev i;
    public static final /* synthetic */ ev[] j;

    /* JADX WARN: Type inference failed for: r0v0, types: [ev, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ev, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ev, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ev, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ev, java.lang.Enum] */
    static {
        ?? r0 = new Enum("CPU_ACQUIRED", 0);
        e = r0;
        ?? r1 = new Enum("BLOCKING", 1);
        f = r1;
        ?? r2 = new Enum("PARKING", 2);
        g = r2;
        ?? r3 = new Enum("DORMANT", 3);
        h = r3;
        ?? r4 = new Enum("TERMINATED", 4);
        i = r4;
        j = new ev[]{r0, r1, r2, r3, r4};
    }

    public static ev valueOf(String str) {
        return (ev) Enum.valueOf(ev.class, str);
    }

    public static ev[] values() {
        return (ev[]) j.clone();
    }
}
