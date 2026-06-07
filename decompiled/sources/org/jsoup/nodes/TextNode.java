package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class TextNode extends LeafNode {
    public TextNode(String str) {
        super(str);
    }

    public static TextNode createFromEncoded(String str) {
        return new TextNode(Entities.unescape(str));
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ') {
            return true;
        }
        return false;
    }

    public static String normaliseWhitespace(String str) {
        return StringUtil.normaliseWhitespace(str);
    }

    public static String stripLeadingWhitespace(String str) {
        return str.replaceFirst("^\\s+", "");
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public TextNode mo283clone() {
        return (TextNode) super.mo283clone();
    }

    public String getWholeText() {
        return coreValue();
    }

    public boolean isBlank() {
        return StringUtil.isBlank(coreValue());
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#text";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        boolean z;
        Element element;
        boolean z2 = false;
        int i2 = 1;
        if (outputSettings.prettyPrint() && !Element.preserveWhitespace(this.parentNode)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Node node = this.parentNode;
            if (node instanceof Element) {
                element = (Element) node;
            } else {
                element = null;
            }
            if (element != null && (element.tag().isBlock() || element.tag().formatAsBlock())) {
                z2 = true;
            }
            if ((z2 && this.siblingIndex == 0) || (this.parentNode instanceof Document)) {
                i2 = 13;
            } else {
                i2 = 5;
            }
            if (z2 && nextSibling() == null) {
                i2 |= 16;
            }
            Node nextSibling = nextSibling();
            Node previousSibling = previousSibling();
            boolean isBlank = isBlank();
            if ((((nextSibling instanceof Element) && ((Element) nextSibling).shouldIndent(outputSettings)) || (((nextSibling instanceof TextNode) && ((TextNode) nextSibling).isBlank()) || ((previousSibling instanceof Element) && (((Element) previousSibling).isBlock() || previousSibling.nameIs("br"))))) && isBlank) {
                return;
            }
            if ((previousSibling == null && element != null && element.tag().formatAsBlock() && !isBlank) || ((outputSettings.outline() && siblingNodes().size() > 0 && !isBlank) || (previousSibling != null && previousSibling.nameIs("br")))) {
                indent(appendable, i, outputSettings);
            }
        }
        Entities.escape(appendable, coreValue(), outputSettings, i2);
    }

    public TextNode splitText(int i) {
        boolean z;
        boolean z2;
        String coreValue = coreValue();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Split offset must be not be negative");
        if (i < coreValue.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "Split offset must not be greater than current text length");
        String substring = coreValue.substring(0, i);
        String substring2 = coreValue.substring(i);
        text(substring);
        TextNode textNode = new TextNode(substring2);
        Node node = this.parentNode;
        if (node != null) {
            node.addChildren(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return StringUtil.normaliseWhitespace(getWholeText());
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    public TextNode text(String str) {
        coreValue(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
