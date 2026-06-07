package org.jsoup.nodes;

import defpackage.y61;
import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Node;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class NodeIterator<T extends Node> implements Iterator<T> {
    private Node current;
    private Node currentParent;
    private T next;
    private Node previous;
    private Node root;
    private final Class<T> type;

    public NodeIterator(Node node, Class<T> cls) {
        Validate.notNull(node);
        Validate.notNull(cls);
        this.type = cls;
        restart(node);
    }

    private T findNextNode() {
        Node node = (T) this.current;
        do {
            if (node.childNodeSize() > 0) {
                node = (T) node.childNode(0);
            } else if (this.root.equals(node)) {
                node = (T) null;
            } else {
                if (node.nextSibling() != null) {
                    node = (T) node.nextSibling();
                }
                do {
                    node = node.parent();
                    if (node == null || this.root.equals(node)) {
                        return null;
                    }
                } while (node.nextSibling() == null);
                node = (T) node.nextSibling();
            }
            if (node == null) {
                return null;
            }
        } while (!this.type.isInstance(node));
        return (T) node;
    }

    public static NodeIterator<Node> from(Node node) {
        return new NodeIterator<>(node, Node.class);
    }

    private void maybeFindNext() {
        if (this.next != null) {
            return;
        }
        if (this.currentParent != null && !this.current.hasParent()) {
            this.current = this.previous;
        }
        this.next = findNextNode();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        maybeFindNext();
        if (this.next != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        maybeFindNext();
        T t = this.next;
        if (t != null) {
            this.previous = this.current;
            this.current = t;
            this.currentParent = t.parent();
            this.next = null;
            return t;
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.current.remove();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void restart(Node node) {
        if (this.type.isInstance(node)) {
            this.next = node;
        }
        this.current = node;
        this.previous = node;
        this.root = node;
        this.currentParent = node.parent();
    }
}
