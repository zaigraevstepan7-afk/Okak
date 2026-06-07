package org.jsoup.select;

import defpackage.m50;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Elements extends ArrayList<Element> {
    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }

    private <T extends Node> List<T> childNodesOfType(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            for (int i = 0; i < next.childNodeSize(); i++) {
                Node childNode = next.childNode(i);
                if (cls.isInstance(childNode)) {
                    arrayList.add(cls.cast(childNode));
                }
            }
        }
        return arrayList;
    }

    private Elements siblings(String str, boolean z, boolean z2) {
        Evaluator evaluator;
        Elements elements = new Elements();
        if (str != null) {
            evaluator = QueryParser.parse(str);
        } else {
            evaluator = null;
        }
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            do {
                if (z) {
                    next = next.nextElementSibling();
                } else {
                    next = next.previousElementSibling();
                }
                if (next != null) {
                    if (evaluator == null) {
                        elements.add(next);
                    } else if (next.is(evaluator)) {
                        elements.add(next);
                    }
                }
            } while (z2);
        }
        return elements;
    }

    public Elements addClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().addClass(str);
        }
        return this;
    }

    public Elements after(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().after(str);
        }
        return this;
    }

    public Elements append(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().append(str);
        }
        return this;
    }

    public String attr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.hasAttr(str)) {
                return next.attr(str);
            }
        }
        return "";
    }

    public Elements before(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().before(str);
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        remove();
        super.clear();
    }

    @Override // java.util.ArrayList
    public Elements clone() {
        Elements elements = new Elements(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            elements.add(it.next().mo283clone());
        }
        return elements;
    }

    public List<Comment> comments() {
        return childNodesOfType(Comment.class);
    }

    public List<DataNode> dataNodes() {
        return childNodesOfType(DataNode.class);
    }

    public List<String> eachAttr(String str) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.hasAttr(str)) {
                arrayList.add(next.attr(str));
            }
        }
        return arrayList;
    }

    public List<String> eachText() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.hasText()) {
                arrayList.add(next.text());
            }
        }
        return arrayList;
    }

    public Elements empty() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().empty();
        }
        return this;
    }

    public Elements eq(int i) {
        if (size() > i) {
            return new Elements(get(i));
        }
        return new Elements();
    }

    public Elements filter(NodeFilter nodeFilter) {
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    public Element first() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public List<FormElement> forms() {
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next instanceof FormElement) {
                arrayList.add((FormElement) next);
            }
        }
        return arrayList;
    }

    public boolean hasAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasAttr(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasClass(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasText()) {
                return true;
            }
        }
        return false;
    }

    public String html() {
        return (String) stream().map(new m50(3)).collect(StringUtil.joining("\n"));
    }

    public boolean is(String str) {
        Evaluator parse = QueryParser.parse(str);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().is(parse)) {
                return true;
            }
        }
        return false;
    }

    public Element last() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public Elements next() {
        return siblings(null, true, false);
    }

    public Elements nextAll() {
        return siblings(null, true, true);
    }

    public Elements not(String str) {
        return Selector.filterOut(this, Selector.select(str, this));
    }

    public String outerHtml() {
        return (String) stream().map(new m50(5)).collect(StringUtil.joining("\n"));
    }

    public Elements parents() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().parents());
        }
        return new Elements(linkedHashSet);
    }

    public Elements prepend(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().prepend(str);
        }
        return this;
    }

    public Elements prev() {
        return siblings(null, false, false);
    }

    public Elements prevAll() {
        return siblings(null, false, true);
    }

    public Elements remove() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    public Elements removeAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().removeAttr(str);
        }
        return this;
    }

    public Elements removeClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().removeClass(str);
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public boolean removeIf(Predicate<? super Element> predicate) {
        Iterator<Element> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.List
    public void replaceAll(UnaryOperator<Element> unaryOperator) {
        for (int i = 0; i < size(); i++) {
            set(i, (Element) unaryOperator.apply(get(i)));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<Element> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Element set(int i, Element element) {
        Validate.notNull(element);
        Element element2 = (Element) super.set(i, (int) element);
        element2.replaceWith(element);
        return element2;
    }

    public Elements tagName(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().tagName(str);
        }
        return this;
    }

    public String text() {
        return (String) stream().map(new m50(4)).collect(StringUtil.joining(" "));
    }

    public List<TextNode> textNodes() {
        return childNodesOfType(TextNode.class);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return outerHtml();
    }

    public Elements toggleClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().toggleClass(str);
        }
        return this;
    }

    public Elements traverse(NodeVisitor nodeVisitor) {
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    public Elements unwrap() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().unwrap();
        }
        return this;
    }

    public Elements val(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().val(str);
        }
        return this;
    }

    public Elements wrap(String str) {
        Validate.notEmpty(str);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().wrap(str);
        }
        return this;
    }

    public Elements nextAll(String str) {
        return siblings(str, true, true);
    }

    public Elements prev(String str) {
        return siblings(str, false, false);
    }

    public Elements(int i) {
        super(i);
    }

    public Elements next(String str) {
        return siblings(str, true, false);
    }

    public Elements prevAll(String str) {
        return siblings(str, false, true);
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements(List<Element> list) {
        super(list);
    }

    public Elements() {
    }

    public String val() {
        if (size() > 0) {
            return first().val();
        }
        return "";
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Element remove(int i) {
        Element element = (Element) super.remove(i);
        element.remove();
        return element;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = super.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Elements html(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().html(str);
        }
        return this;
    }

    public Elements attr(String str, String str2) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().attr(str, str2);
        }
        return this;
    }
}
