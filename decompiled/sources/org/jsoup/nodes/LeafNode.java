package org.jsoup.nodes;

import java.util.List;
import org.jsoup.helper.Validate;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class LeafNode extends Node {
    Object value;

    public LeafNode(String str) {
        Validate.notNull(str);
        this.value = str;
    }

    private void ensureAttributes() {
        if (!hasAttributes()) {
            String str = (String) this.value;
            Attributes attributes = new Attributes();
            this.value = attributes;
            attributes.put(nodeName(), str);
        }
    }

    @Override // org.jsoup.nodes.Node
    public String absUrl(String str) {
        ensureAttributes();
        return super.absUrl(str);
    }

    @Override // org.jsoup.nodes.Node
    public String attr(String str) {
        if (!hasAttributes()) {
            if (nodeName().equals(str)) {
                return (String) this.value;
            }
            return "";
        }
        return super.attr(str);
    }

    @Override // org.jsoup.nodes.Node
    public final Attributes attributes() {
        ensureAttributes();
        return (Attributes) this.value;
    }

    @Override // org.jsoup.nodes.Node
    public String baseUri() {
        Node node = this.parentNode;
        if (node != null) {
            return node.baseUri();
        }
        return "";
    }

    @Override // org.jsoup.nodes.Node
    public int childNodeSize() {
        return 0;
    }

    public String coreValue() {
        return attr(nodeName());
    }

    @Override // org.jsoup.nodes.Node
    public LeafNode doClone(Node node) {
        LeafNode leafNode = (LeafNode) super.doClone(node);
        if (hasAttributes()) {
            leafNode.value = ((Attributes) this.value).clone();
        }
        return leafNode;
    }

    @Override // org.jsoup.nodes.Node
    public List<Node> ensureChildNodes() {
        return Node.EmptyNodes;
    }

    @Override // org.jsoup.nodes.Node
    public boolean hasAttr(String str) {
        ensureAttributes();
        return super.hasAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public final boolean hasAttributes() {
        return this.value instanceof Attributes;
    }

    @Override // org.jsoup.nodes.Node
    public Node removeAttr(String str) {
        ensureAttributes();
        return super.removeAttr(str);
    }

    public LeafNode() {
        this.value = "";
    }

    public void coreValue(String str) {
        attr(nodeName(), str);
    }

    @Override // org.jsoup.nodes.Node
    public Node empty() {
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Node attr(String str, String str2) {
        if (!hasAttributes() && str.equals(nodeName())) {
            this.value = str2;
            return this;
        }
        ensureAttributes();
        super.attr(str, str2);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public void doSetBaseUri(String str) {
    }
}
