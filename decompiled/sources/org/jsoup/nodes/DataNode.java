package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class DataNode extends LeafNode {
    public DataNode(String str) {
        super(str);
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public DataNode mo283clone() {
        return (DataNode) super.mo283clone();
    }

    public String getWholeData() {
        return coreValue();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#data";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        String wholeData = getWholeData();
        if (outputSettings.syntax() == Document.OutputSettings.Syntax.xml && !wholeData.contains("<![CDATA[")) {
            if (parentNameIs("script")) {
                appendable.append("//<![CDATA[\n").append(wholeData).append("\n//]]>");
                return;
            } else if (parentNameIs("style")) {
                appendable.append("/*<![CDATA[*/\n").append(wholeData).append("\n/*]]>*/");
                return;
            } else {
                appendable.append("<![CDATA[").append(wholeData).append("]]>");
                return;
            }
        }
        appendable.append(getWholeData());
    }

    public DataNode setWholeData(String str) {
        coreValue(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
