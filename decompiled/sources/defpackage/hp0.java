package defpackage;

import org.jsoup.nodes.DocumentType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hp0 {
    public static final /* synthetic */ hp0[] e = {new Enum(DocumentType.PUBLIC_KEY, 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    hp0 EF5;

    public static hp0 valueOf(String str) {
        return (hp0) Enum.valueOf(hp0.class, str);
    }

    public static hp0[] values() {
        return (hp0[]) e.clone();
    }
}
