package org.jsoup.nodes;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class DocumentType extends LeafNode {
    private static final String Name = "#doctype";
    public static final String PUBLIC_KEY = "PUBLIC";
    private static final String PubSysKey = "pubSysKey";
    private static final String PublicId = "publicId";
    public static final String SYSTEM_KEY = "SYSTEM";
    private static final String SystemId = "systemId";

    public DocumentType(String str, String str2, String str3) {
        super(str);
        Validate.notNull(str2);
        Validate.notNull(str3);
        attr(Name, str);
        attr(PublicId, str2);
        attr(SystemId, str3);
        updatePubSyskey();
    }

    private boolean has(String str) {
        return !StringUtil.isBlank(attr(str));
    }

    private void updatePubSyskey() {
        if (has(PublicId)) {
            attr(PubSysKey, PUBLIC_KEY);
        } else if (has(SystemId)) {
            attr(PubSysKey, SYSTEM_KEY);
        }
    }

    public String name() {
        return attr(Name);
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return Name;
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        if (this.siblingIndex > 0 && outputSettings.prettyPrint()) {
            appendable.append('\n');
        }
        if (outputSettings.syntax() == Document.OutputSettings.Syntax.html && !has(PublicId) && !has(SystemId)) {
            appendable.append("<!doctype");
        } else {
            appendable.append("<!DOCTYPE");
        }
        if (has(Name)) {
            appendable.append(" ").append(attr(Name));
        }
        if (has(PubSysKey)) {
            appendable.append(" ").append(attr(PubSysKey));
        }
        if (has(PublicId)) {
            appendable.append(" \"").append(attr(PublicId)).append(AbstractJsonLexerKt.STRING);
        }
        if (has(SystemId)) {
            appendable.append(" \"").append(attr(SystemId)).append(AbstractJsonLexerKt.STRING);
        }
        appendable.append('>');
    }

    public String publicId() {
        return attr(PublicId);
    }

    public void setPubSysKey(String str) {
        if (str != null) {
            attr(PubSysKey, str);
        }
    }

    public String systemId() {
        return attr(SystemId);
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
