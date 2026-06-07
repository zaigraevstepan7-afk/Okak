package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class PseudoTextElement extends Element {
    public PseudoTextElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }
}
