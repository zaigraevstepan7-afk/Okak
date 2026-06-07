package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class CDataNode extends TextNode {
    public CDataNode(String str) {
        super(str);
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    /* renamed from: clone */
    public CDataNode mo283clone() {
        return (CDataNode) super.mo283clone();
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public String nodeName() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append("<![CDATA[").append(getWholeText());
    }

    @Override // org.jsoup.nodes.TextNode, org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append("]]>");
    }

    @Override // org.jsoup.nodes.TextNode
    public String text() {
        return getWholeText();
    }
}
