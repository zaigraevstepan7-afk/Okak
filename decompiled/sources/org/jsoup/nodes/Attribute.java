package org.jsoup.nodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Range;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Attribute implements Map.Entry<String, String>, Cloneable {
    private String key;
    Attributes parent;
    private String val;
    private static final String[] booleanAttributes = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern xmlKeyReplace = Pattern.compile("[^-a-zA-Z0-9_:.]+");
    private static final Pattern htmlKeyReplace = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    public Attribute(String str, String str2, Attributes attributes) {
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        this.key = trim;
        this.val = str2;
        this.parent = attributes;
    }

    public static Attribute createFromEncoded(String str, String str2) {
        return new Attribute(str, Entities.unescape(str2, true), null);
    }

    public static String getValidKey(String str, Document.OutputSettings.Syntax syntax) {
        if (syntax == Document.OutputSettings.Syntax.xml && !isValidXmlKey(str)) {
            String replaceAll = xmlKeyReplace.matcher(str).replaceAll("_");
            if (!isValidXmlKey(replaceAll)) {
                return null;
            }
            return replaceAll;
        }
        if (syntax == Document.OutputSettings.Syntax.html && !isValidHtmlKey(str)) {
            String replaceAll2 = htmlKeyReplace.matcher(str).replaceAll("_");
            if (!isValidHtmlKey(replaceAll2)) {
                return null;
            }
            return replaceAll2;
        }
        return str;
    }

    public static void htmlNoValidate(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) {
        appendable.append(str);
        if (!shouldCollapseAttribute(str, str2, outputSettings)) {
            appendable.append("=\"");
            Entities.escape(appendable, Attributes.checkNotNull(str2), outputSettings, 2);
            appendable.append(AbstractJsonLexerKt.STRING);
        }
    }

    public static boolean isBooleanAttribute(String str) {
        if (Arrays.binarySearch(booleanAttributes, Normalizer.lowerCase(str)) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isDataAttribute(String str) {
        if (str.startsWith("data-") && str.length() > 5) {
            return true;
        }
        return false;
    }

    private static boolean isValidHtmlKey(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || ((charAt >= 127 && charAt <= 159) || charAt == ' ' || charAt == '\"' || charAt == '\'' || charAt == '/' || charAt == '=')) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidXmlKey(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_' && charAt != ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '-' && charAt2 != '_' && charAt2 != ':' && charAt2 != '.'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean shouldCollapseAttribute(String str, String str2, Document.OutputSettings outputSettings) {
        if (outputSettings.syntax() == Document.OutputSettings.Syntax.html) {
            if (str2 != null) {
                if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && isBooleanAttribute(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Attribute attribute = (Attribute) obj;
            if (Objects.equals(this.key, attribute.key) && Objects.equals(this.val, attribute.val)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        return Attributes.checkNotNull(this.val);
    }

    public boolean hasDeclaredValue() {
        if (this.val != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hash(this.key, this.val);
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            html(borrowBuilder, new Document("").outputSettings());
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public void setKey(String str) {
        int indexOfKey;
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        Attributes attributes = this.parent;
        if (attributes != null && (indexOfKey = attributes.indexOfKey(this.key)) != -1) {
            Attributes attributes2 = this.parent;
            String[] strArr = attributes2.keys;
            String str2 = strArr[indexOfKey];
            strArr[indexOfKey] = trim;
            Map<String, Range.AttributeRange> ranges = attributes2.getRanges();
            if (ranges != null) {
                ranges.put(trim, ranges.remove(str2));
            }
        }
        this.key = trim;
    }

    @Override // java.util.Map.Entry
    public String setValue(String str) {
        int indexOfKey;
        String str2 = this.val;
        Attributes attributes = this.parent;
        if (attributes != null && (indexOfKey = attributes.indexOfKey(this.key)) != -1) {
            str2 = this.parent.get(this.key);
            this.parent.vals[indexOfKey] = str;
        }
        this.val = str;
        return Attributes.checkNotNull(str2);
    }

    public Range.AttributeRange sourceRange() {
        Attributes attributes = this.parent;
        if (attributes == null) {
            return Range.AttributeRange.UntrackedAttr;
        }
        return attributes.sourceRange(this.key);
    }

    public String toString() {
        return html();
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.key;
    }

    public boolean isDataAttribute() {
        return isDataAttribute(this.key);
    }

    public Attribute(String str, String str2) {
        this(str, str2, null);
    }

    public void html(Appendable appendable, Document.OutputSettings outputSettings) {
        html(this.key, this.val, appendable, outputSettings);
    }

    public static void html(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) {
        String validKey = getValidKey(str, outputSettings.syntax());
        if (validKey == null) {
            return;
        }
        htmlNoValidate(validKey, str2, appendable, outputSettings);
    }

    public final boolean shouldCollapseAttribute(Document.OutputSettings outputSettings) {
        return shouldCollapseAttribute(this.key, this.val, outputSettings);
    }
}
