package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class NodeTraversor {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static NodeFilter.FilterResult filter(NodeFilter nodeFilter, Node node) {
        Node node2 = node;
        int i = 0;
        while (node2 != null) {
            NodeFilter.FilterResult head = nodeFilter.head(node2, i);
            if (head == NodeFilter.FilterResult.STOP) {
                return head;
            }
            if (head == NodeFilter.FilterResult.CONTINUE && node2.childNodeSize() > 0) {
                node2 = node2.childNode(0);
                i++;
            } else {
                while (node2.nextSibling() == null && i > 0) {
                    NodeFilter.FilterResult filterResult = NodeFilter.FilterResult.CONTINUE;
                    if ((head == filterResult || head == NodeFilter.FilterResult.SKIP_CHILDREN) && (head = nodeFilter.tail(node2, i)) == NodeFilter.FilterResult.STOP) {
                        return head;
                    }
                    Node parentNode = node2.parentNode();
                    i--;
                    if (head == NodeFilter.FilterResult.REMOVE) {
                        node2.remove();
                    }
                    head = filterResult;
                    node2 = parentNode;
                }
                if ((head == NodeFilter.FilterResult.CONTINUE || head == NodeFilter.FilterResult.SKIP_CHILDREN) && (head = nodeFilter.tail(node2, i)) == NodeFilter.FilterResult.STOP) {
                    return head;
                }
                if (node2 == node) {
                    return head;
                }
                Node nextSibling = node2.nextSibling();
                if (head == NodeFilter.FilterResult.REMOVE) {
                    node2.remove();
                }
                node2 = nextSibling;
            }
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    public static void traverse(NodeVisitor nodeVisitor, Node node) {
        int i;
        Validate.notNull(nodeVisitor);
        Validate.notNull(node);
        Node node2 = node;
        int i2 = 0;
        while (node2 != null) {
            Node parentNode = node2.parentNode();
            if (parentNode != null) {
                i = parentNode.childNodeSize();
            } else {
                i = 0;
            }
            Node nextSibling = node2.nextSibling();
            nodeVisitor.mo125head(node2, i2);
            if (parentNode != null && !node2.hasParent()) {
                if (i == parentNode.childNodeSize()) {
                    node2 = parentNode.childNode(node2.siblingIndex());
                } else if (nextSibling == null) {
                    i2--;
                    node2 = parentNode;
                } else {
                    node2 = nextSibling;
                }
            }
            if (node2.childNodeSize() > 0) {
                node2 = node2.childNode(0);
                i2++;
            } else {
                while (node2.nextSibling() == null && i2 > 0) {
                    nodeVisitor.tail(node2, i2);
                    node2 = node2.parentNode();
                    i2--;
                }
                nodeVisitor.tail(node2, i2);
                if (node2 != node) {
                    node2 = node2.nextSibling();
                } else {
                    return;
                }
            }
        }
    }

    public static void traverse(NodeVisitor nodeVisitor, Elements elements) {
        Validate.notNull(nodeVisitor);
        Validate.notNull(elements);
        Iterator<Element> it = elements.iterator();
        while (it.hasNext()) {
            traverse(nodeVisitor, it.next());
        }
    }

    public static void filter(NodeFilter nodeFilter, Elements elements) {
        Validate.notNull(nodeFilter);
        Validate.notNull(elements);
        Iterator<Element> it = elements.iterator();
        while (it.hasNext() && filter(nodeFilter, it.next()) != NodeFilter.FilterResult.STOP) {
        }
    }
}
