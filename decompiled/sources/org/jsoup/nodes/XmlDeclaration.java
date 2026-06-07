package org.jsoup.nodes;

import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class XmlDeclaration extends LeafNode {
    private final boolean isProcessingInstruction;

    public XmlDeclaration(String str, boolean z) {
        super(str);
        this.isProcessingInstruction = z;
    }

    private void getWholeDeclaration(Appendable appendable, Document.OutputSettings outputSettings) {
        Iterator<Attribute> it = attributes().iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (!key.equals(nodeName())) {
                appendable.append(' ');
                appendable.append(key);
                if (!value.isEmpty()) {
                    appendable.append("=\"");
                    Entities.escape(appendable, value, outputSettings, 2);
                    appendable.append(AbstractJsonLexerKt.STRING);
                }
            }
        }
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public XmlDeclaration mo283clone() {
        return (XmlDeclaration) super.mo283clone();
    }

    public String name() {
        return coreValue();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        CharSequence charSequence;
        Appendable append = appendable.append("<");
        String str = "?";
        if (!this.isProcessingInstruction) {
            charSequence = "?";
        } else {
            charSequence = "!";
        }
        append.append(charSequence).append(coreValue());
        getWholeDeclaration(appendable, outputSettings);
        if (this.isProcessingInstruction) {
            str = "!";
        }
        appendable.append(str).append(">");
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    public String getWholeDeclaration() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            getWholeDeclaration(borrowBuilder, new Document.OutputSettings());
            return StringUtil.releaseBuilder(borrowBuilder).trim();
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
