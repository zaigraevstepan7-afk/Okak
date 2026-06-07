package org.jsoup.parser;

import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ParseSettings {
    public static final ParseSettings htmlDefault = new ParseSettings(false, false);
    public static final ParseSettings preserveCase = new ParseSettings(true, true);
    private final boolean preserveAttributeCase;
    private final boolean preserveTagCase;

    public ParseSettings(boolean z, boolean z2) {
        this.preserveTagCase = z;
        this.preserveAttributeCase = z2;
    }

    public static String normalName(String str) {
        return Normalizer.lowerCase(str.trim());
    }

    public String normalizeAttribute(String str) {
        String trim = str.trim();
        if (!this.preserveAttributeCase) {
            return Normalizer.lowerCase(trim);
        }
        return trim;
    }

    public Attributes normalizeAttributes(Attributes attributes) {
        if (attributes != null && !this.preserveAttributeCase) {
            attributes.normalize();
        }
        return attributes;
    }

    public String normalizeTag(String str) {
        String trim = str.trim();
        if (!this.preserveTagCase) {
            return Normalizer.lowerCase(trim);
        }
        return trim;
    }

    public boolean preserveAttributeCase() {
        return this.preserveAttributeCase;
    }

    public boolean preserveTagCase() {
        return this.preserveTagCase;
    }

    public ParseSettings(ParseSettings parseSettings) {
        this(parseSettings.preserveTagCase, parseSettings.preserveAttributeCase);
    }
}
