package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class Node implements Cloneable {
    static final List<Node> EmptyNodes = Collections.EMPTY_LIST;
    static final String EmptyString = "";
    Node parentNode;
    int siblingIndex;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class OuterHtmlVisitor implements NodeVisitor {
        private final Appendable accum;
        private final Document.OutputSettings out;

        public OuterHtmlVisitor(Appendable appendable, Document.OutputSettings outputSettings) {
            this.accum = appendable;
            this.out = outputSettings;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: head */
        public void mo125head(Node node, int i) {
            try {
                node.outerHtmlHead(this.accum, i, this.out);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i) {
            if (!node.nodeName().equals("#text")) {
                try {
                    node.outerHtmlTail(this.accum, i, this.out);
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            }
        }
    }

    private void addSiblingHtml(int i, String str) {
        Element element;
        Validate.notNull(str);
        Validate.notNull(this.parentNode);
        Node node = this.parentNode;
        if (node instanceof Element) {
            element = (Element) node;
        } else {
            element = null;
        }
        this.parentNode.addChildren(i, (Node[]) NodeUtils.parser(this).parseFragmentInput(str, element, baseUri()).toArray(new Node[0]));
    }

    private static Element getDeepChild(Element element) {
        Element firstElementChild = element.firstElementChild();
        while (true) {
            Element element2 = firstElementChild;
            Element element3 = element;
            element = element2;
            if (element != null) {
                firstElementChild = element.firstElementChild();
            } else {
                return element3;
            }
        }
    }

    private void reindexChildren(int i) {
        int childNodeSize = childNodeSize();
        if (childNodeSize != 0) {
            List<Node> ensureChildNodes = ensureChildNodes();
            while (i < childNodeSize) {
                ensureChildNodes.get(i).setSiblingIndex(i);
                i++;
            }
        }
    }

    public String absUrl(String str) {
        Validate.notEmpty(str);
        if (hasAttributes() && attributes().hasKeyIgnoreCase(str)) {
            return StringUtil.resolve(baseUri(), attributes().getIgnoreCase(str));
        }
        return "";
    }

    public void addChildren(int i, Node... nodeArr) {
        boolean z;
        Validate.notNull(nodeArr);
        if (nodeArr.length != 0) {
            List<Node> ensureChildNodes = ensureChildNodes();
            Node parent = nodeArr[0].parent();
            if (parent != null && parent.childNodeSize() == nodeArr.length) {
                List<Node> ensureChildNodes2 = parent.ensureChildNodes();
                int length = nodeArr.length;
                while (true) {
                    int i2 = length - 1;
                    if (length > 0) {
                        if (nodeArr[i2] != ensureChildNodes2.get(i2)) {
                            break;
                        } else {
                            length = i2;
                        }
                    } else {
                        if (childNodeSize() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        parent.empty();
                        ensureChildNodes.addAll(i, Arrays.asList(nodeArr));
                        int length2 = nodeArr.length;
                        while (true) {
                            int i3 = length2 - 1;
                            if (length2 <= 0) {
                                break;
                            }
                            nodeArr[i3].parentNode = this;
                            length2 = i3;
                        }
                        if (z && nodeArr[0].siblingIndex == 0) {
                            return;
                        }
                        reindexChildren(i);
                        return;
                    }
                }
            }
            Validate.noNullElements(nodeArr);
            for (Node node : nodeArr) {
                reparentChild(node);
            }
            ensureChildNodes.addAll(i, Arrays.asList(nodeArr));
            reindexChildren(i);
        }
    }

    public Node after(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        if (node.parentNode == this.parentNode) {
            node.remove();
        }
        this.parentNode.addChildren(this.siblingIndex + 1, node);
        return this;
    }

    public String attr(String str) {
        Validate.notNull(str);
        if (!hasAttributes()) {
            return "";
        }
        String ignoreCase = attributes().getIgnoreCase(str);
        if (ignoreCase.length() > 0) {
            return ignoreCase;
        }
        if (!str.startsWith("abs:")) {
            return "";
        }
        return absUrl(str.substring(4));
    }

    public abstract Attributes attributes();

    public int attributesSize() {
        if (hasAttributes()) {
            return attributes().size();
        }
        return 0;
    }

    public abstract String baseUri();

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        if (node.parentNode == this.parentNode) {
            node.remove();
        }
        this.parentNode.addChildren(this.siblingIndex, node);
        return this;
    }

    public Node childNode(int i) {
        return ensureChildNodes().get(i);
    }

    public abstract int childNodeSize();

    public List<Node> childNodes() {
        if (childNodeSize() == 0) {
            return EmptyNodes;
        }
        List<Node> ensureChildNodes = ensureChildNodes();
        ArrayList arrayList = new ArrayList(ensureChildNodes.size());
        arrayList.addAll(ensureChildNodes);
        return Collections.unmodifiableList(arrayList);
    }

    public Node[] childNodesAsArray() {
        return (Node[]) ensureChildNodes().toArray(new Node[0]);
    }

    public List<Node> childNodesCopy() {
        List<Node> ensureChildNodes = ensureChildNodes();
        ArrayList arrayList = new ArrayList(ensureChildNodes.size());
        Iterator<Node> it = ensureChildNodes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo283clone());
        }
        return arrayList;
    }

    public Node clearAttributes() {
        if (hasAttributes()) {
            Iterator<Attribute> it = attributes().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return this;
    }

    @Override // 
    /* renamed from: clone */
    public Node mo283clone() {
        Node doClone = doClone(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(doClone);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            int childNodeSize = node.childNodeSize();
            for (int i = 0; i < childNodeSize; i++) {
                List<Node> ensureChildNodes = node.ensureChildNodes();
                Node doClone2 = ensureChildNodes.get(i).doClone(node);
                ensureChildNodes.set(i, doClone2);
                linkedList.add(doClone2);
            }
        }
        return doClone;
    }

    public Node doClone(Node node) {
        int i;
        Document ownerDocument;
        try {
            Node node2 = (Node) super.clone();
            node2.parentNode = node;
            if (node == null) {
                i = 0;
            } else {
                i = this.siblingIndex;
            }
            node2.siblingIndex = i;
            if (node == null && !(this instanceof Document) && (ownerDocument = ownerDocument()) != null) {
                Document shallowClone = ownerDocument.shallowClone();
                node2.parentNode = shallowClone;
                shallowClone.ensureChildNodes().add(node2);
            }
            return node2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void doSetBaseUri(String str);

    public abstract Node empty();

    public abstract List<Node> ensureChildNodes();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public Node filter(NodeFilter nodeFilter) {
        Validate.notNull(nodeFilter);
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    public Node firstChild() {
        if (childNodeSize() == 0) {
            return null;
        }
        return ensureChildNodes().get(0);
    }

    public Node forEachNode(Consumer<? super Node> consumer) {
        Validate.notNull(consumer);
        nodeStream().forEach(consumer);
        return this;
    }

    public boolean hasAttr(String str) {
        Validate.notNull(str);
        if (!hasAttributes()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (attributes().hasKeyIgnoreCase(substring) && !absUrl(substring).isEmpty()) {
                return true;
            }
        }
        return attributes().hasKeyIgnoreCase(str);
    }

    public abstract boolean hasAttributes();

    public boolean hasParent() {
        if (this.parentNode != null) {
            return true;
        }
        return false;
    }

    public boolean hasSameValue(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return outerHtml().equals(((Node) obj).outerHtml());
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public <T extends Appendable> T html(T t) {
        outerHtml(t);
        return t;
    }

    public void indent(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append('\n').append(StringUtil.padding(outputSettings.indentAmount() * i, outputSettings.maxPaddingWidth()));
    }

    public final boolean isEffectivelyFirst() {
        int i = this.siblingIndex;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            Node previousSibling = previousSibling();
            if ((previousSibling instanceof TextNode) && ((TextNode) previousSibling).isBlank()) {
                return true;
            }
        }
        return false;
    }

    public Node lastChild() {
        int childNodeSize = childNodeSize();
        if (childNodeSize == 0) {
            return null;
        }
        return ensureChildNodes().get(childNodeSize - 1);
    }

    public boolean nameIs(String str) {
        return normalName().equals(str);
    }

    public Node nextSibling() {
        Node node = this.parentNode;
        if (node == null) {
            return null;
        }
        List<Node> ensureChildNodes = node.ensureChildNodes();
        int i = this.siblingIndex + 1;
        if (ensureChildNodes.size() <= i) {
            return null;
        }
        return ensureChildNodes.get(i);
    }

    public abstract String nodeName();

    public Stream<Node> nodeStream() {
        return NodeUtils.stream(this, Node.class);
    }

    public String normalName() {
        return nodeName();
    }

    public void outerHtml(Appendable appendable) {
        NodeTraversor.traverse(new OuterHtmlVisitor(appendable, NodeUtils.outputSettings(this)), this);
    }

    public abstract void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings);

    public abstract void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings);

    public Document ownerDocument() {
        Node root = root();
        if (root instanceof Document) {
            return (Document) root;
        }
        return null;
    }

    public Node parent() {
        return this.parentNode;
    }

    public boolean parentElementIs(String str, String str2) {
        Node node = this.parentNode;
        if (node != null && (node instanceof Element) && ((Element) node).elementIs(str, str2)) {
            return true;
        }
        return false;
    }

    public boolean parentNameIs(String str) {
        Node node = this.parentNode;
        if (node != null && node.normalName().equals(str)) {
            return true;
        }
        return false;
    }

    public final Node parentNode() {
        return this.parentNode;
    }

    public Node previousSibling() {
        Node node = this.parentNode;
        if (node == null || this.siblingIndex <= 0) {
            return null;
        }
        return node.ensureChildNodes().get(this.siblingIndex - 1);
    }

    public void remove() {
        Node node = this.parentNode;
        if (node != null) {
            node.removeChild(this);
        }
    }

    public Node removeAttr(String str) {
        Validate.notNull(str);
        if (hasAttributes()) {
            attributes().removeIgnoreCase(str);
        }
        return this;
    }

    public void removeChild(Node node) {
        boolean z;
        if (node.parentNode == this) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z);
        int i = node.siblingIndex;
        ensureChildNodes().remove(i);
        reindexChildren(i);
        node.parentNode = null;
    }

    public void reparentChild(Node node) {
        node.setParentNode(this);
    }

    public void replaceChild(Node node, Node node2) {
        boolean z;
        if (node.parentNode == this) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z);
        Validate.notNull(node2);
        if (node == node2) {
            return;
        }
        Node node3 = node2.parentNode;
        if (node3 != null) {
            node3.removeChild(node2);
        }
        int i = node.siblingIndex;
        ensureChildNodes().set(i, node2);
        node2.parentNode = this;
        node2.setSiblingIndex(i);
        node.parentNode = null;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        if (this.parentNode == null) {
            this.parentNode = node.parentNode;
        }
        Validate.notNull(this.parentNode);
        this.parentNode.replaceChild(this, node);
    }

    public Node root() {
        while (true) {
            Node node = this.parentNode;
            if (node != null) {
                this = node;
            } else {
                return this;
            }
        }
    }

    public void setBaseUri(String str) {
        Validate.notNull(str);
        doSetBaseUri(str);
    }

    public void setParentNode(Node node) {
        Validate.notNull(node);
        Node node2 = this.parentNode;
        if (node2 != null) {
            node2.removeChild(this);
        }
        this.parentNode = node;
    }

    public void setSiblingIndex(int i) {
        this.siblingIndex = i;
    }

    public Node shallowClone() {
        return doClone(null);
    }

    public int siblingIndex() {
        return this.siblingIndex;
    }

    public List<Node> siblingNodes() {
        Node node = this.parentNode;
        if (node == null) {
            return Collections.EMPTY_LIST;
        }
        List<Node> ensureChildNodes = node.ensureChildNodes();
        ArrayList arrayList = new ArrayList(ensureChildNodes.size() - 1);
        for (Node node2 : ensureChildNodes) {
            if (node2 != this) {
                arrayList.add(node2);
            }
        }
        return arrayList;
    }

    public Range sourceRange() {
        return Range.of(this, true);
    }

    public String toString() {
        return outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    public Node unwrap() {
        Validate.notNull(this.parentNode);
        Node firstChild = firstChild();
        this.parentNode.addChildren(this.siblingIndex, childNodesAsArray());
        remove();
        return firstChild;
    }

    public Node wrap(String str) {
        Element element;
        Validate.notEmpty(str);
        Node node = this.parentNode;
        if (node != null && (node instanceof Element)) {
            element = (Element) node;
        } else if (this instanceof Element) {
            element = (Element) this;
        } else {
            element = null;
        }
        List<Node> parseFragmentInput = NodeUtils.parser(this).parseFragmentInput(str, element, baseUri());
        Node node2 = parseFragmentInput.get(0);
        if (node2 instanceof Element) {
            Element element2 = (Element) node2;
            Element deepChild = getDeepChild(element2);
            Node node3 = this.parentNode;
            if (node3 != null) {
                node3.replaceChild(this, element2);
            }
            deepChild.addChildren(this);
            if (parseFragmentInput.size() > 0) {
                for (int i = 0; i < parseFragmentInput.size(); i++) {
                    Node node4 = parseFragmentInput.get(i);
                    if (element2 != node4) {
                        Node node5 = node4.parentNode;
                        if (node5 != null) {
                            node5.removeChild(node4);
                        }
                        element2.after(node4);
                    }
                }
            }
        }
        return this;
    }

    public <T extends Node> Stream<T> nodeStream(Class<T> cls) {
        return NodeUtils.stream(this, cls);
    }

    public String outerHtml() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        outerHtml(borrowBuilder);
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public void nodelistChanged() {
    }

    public Node before(String str) {
        addSiblingHtml(this.siblingIndex, str);
        return this;
    }

    public Node after(String str) {
        addSiblingHtml(this.siblingIndex + 1, str);
        return this;
    }

    public Node attr(String str, String str2) {
        attributes().putIgnoreCase(NodeUtils.parser(this).settings().normalizeAttribute(str), str2);
        return this;
    }

    public void addChildren(Node... nodeArr) {
        List<Node> ensureChildNodes = ensureChildNodes();
        for (Node node : nodeArr) {
            reparentChild(node);
            ensureChildNodes.add(node);
            node.setSiblingIndex(ensureChildNodes.size() - 1);
        }
    }
}
