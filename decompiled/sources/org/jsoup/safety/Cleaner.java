package org.jsoup.safety;

import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Cleaner {
    private final Safelist safelist;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public final class CleaningVisitor implements NodeVisitor {
        private Element destination;
        private int numDiscarded;
        private final Element root;

        private CleaningVisitor(Element element, Element element2) {
            this.numDiscarded = 0;
            this.root = element;
            this.destination = element2;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: head */
        public void mo125head(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (Cleaner.this.safelist.isSafeTag(element.normalName())) {
                    ElementMeta createSafeElement = Cleaner.this.createSafeElement(element);
                    Element element2 = createSafeElement.el;
                    this.destination.appendChild(element2);
                    this.numDiscarded += createSafeElement.numAttribsDiscarded;
                    this.destination = element2;
                    return;
                }
                if (node != this.root) {
                    this.numDiscarded++;
                    return;
                }
                return;
            }
            if (node instanceof TextNode) {
                this.destination.appendChild(new TextNode(((TextNode) node).getWholeText()));
            } else if ((node instanceof DataNode) && Cleaner.this.safelist.isSafeTag(node.parent().normalName())) {
                this.destination.appendChild(new DataNode(((DataNode) node).getWholeData()));
            } else {
                this.numDiscarded++;
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i) {
            if ((node instanceof Element) && Cleaner.this.safelist.isSafeTag(node.normalName())) {
                this.destination = this.destination.parent();
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ElementMeta {
        Element el;
        int numAttribsDiscarded;

        public ElementMeta(Element element, int i) {
            this.el = element;
            this.numAttribsDiscarded = i;
        }
    }

    public Cleaner(Safelist safelist) {
        Validate.notNull(safelist);
        this.safelist = safelist;
    }

    private int copySafeNodes(Element element, Element element2) {
        CleaningVisitor cleaningVisitor = new CleaningVisitor(element, element2);
        NodeTraversor.traverse(cleaningVisitor, element);
        return cleaningVisitor.numDiscarded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ElementMeta createSafeElement(Element element) {
        Element shallowClone = element.shallowClone();
        String tagName = element.tagName();
        Attributes attributes = shallowClone.attributes();
        shallowClone.clearAttributes();
        Iterator<Attribute> it = element.attributes().iterator();
        int i = 0;
        while (it.hasNext()) {
            Attribute next = it.next();
            if (this.safelist.isSafeAttribute(tagName, element, next)) {
                attributes.put(next);
            } else {
                i++;
            }
        }
        attributes.addAll(this.safelist.getEnforcedAttributes(tagName));
        shallowClone.attributes().addAll(attributes);
        return new ElementMeta(shallowClone, i);
    }

    public Document clean(Document document) {
        Validate.notNull(document);
        Document createShell = Document.createShell(document.baseUri());
        copySafeNodes(document.body(), createShell.body());
        createShell.outputSettings(document.outputSettings().clone());
        return createShell;
    }

    public boolean isValid(Document document) {
        Validate.notNull(document);
        if (copySafeNodes(document.body(), Document.createShell(document.baseUri()).body()) == 0 && document.head().childNodes().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isValidBodyHtml(String str) {
        Document createShell = Document.createShell("");
        Document createShell2 = Document.createShell("");
        ParseErrorList tracking = ParseErrorList.tracking(1);
        createShell2.body().insertChildren(0, Parser.parseFragment(str, createShell2.body(), "", tracking));
        if (copySafeNodes(createShell2.body(), createShell.body()) == 0 && tracking.isEmpty()) {
            return true;
        }
        return false;
    }
}
