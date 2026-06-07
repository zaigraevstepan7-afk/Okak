package org.jsoup.parser;

import defpackage.y61;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class StreamParser implements Closeable {
    private Document document;
    private final ElementIterator it;
    private final Parser parser;
    private boolean stopped;
    private final TreeBuilder treeBuilder;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public final class ElementIterator implements Iterator<Element>, NodeVisitor {
        private Element current;
        private final Queue<Element> emitQueue = new LinkedList();
        private Element next;
        private Element tail;

        public ElementIterator() {
        }

        private void maybeFindNext() {
            if (!StreamParser.this.stopped && this.next == null) {
                if (!this.emitQueue.isEmpty()) {
                    this.next = this.emitQueue.remove();
                    return;
                }
                while (StreamParser.this.treeBuilder.stepParser()) {
                    if (!this.emitQueue.isEmpty()) {
                        this.next = this.emitQueue.remove();
                        return;
                    }
                }
                StreamParser.this.stop();
                StreamParser.this.close();
                Element element = this.tail;
                if (element != null) {
                    this.next = element;
                    this.tail = null;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            maybeFindNext();
            if (this.next != null) {
                return true;
            }
            return false;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: head */
        public void mo125head(Node node, int i) {
            Element previousElementSibling;
            if ((node instanceof Element) && (previousElementSibling = ((Element) node).previousElementSibling()) != null) {
                this.emitQueue.add(previousElementSibling);
            }
        }

        @Override // java.util.Iterator
        public Element next() {
            maybeFindNext();
            Element element = this.next;
            if (element != null) {
                this.current = element;
                this.next = null;
                return element;
            }
            y61.c();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            Element element = this.current;
            if (element != null) {
                element.remove();
            } else {
                y61.c();
            }
        }

        public void reset() {
            this.emitQueue.clear();
            this.tail = null;
            this.next = null;
            this.current = null;
            StreamParser.this.stopped = false;
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                this.tail = element;
                Element lastElementChild = element.lastElementChild();
                if (lastElementChild != null) {
                    this.emitQueue.add(lastElementChild);
                }
            }
        }
    }

    public StreamParser(Parser parser) {
        ElementIterator elementIterator = new ElementIterator();
        this.it = elementIterator;
        this.stopped = false;
        this.parser = parser;
        TreeBuilder treeBuilder = parser.getTreeBuilder();
        this.treeBuilder = treeBuilder;
        treeBuilder.nodeListener(elementIterator);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.treeBuilder.completeParse();
    }

    public Document complete() {
        Document document = document();
        this.treeBuilder.runParser();
        return document;
    }

    public List<Node> completeFragment() {
        this.treeBuilder.runParser();
        return this.treeBuilder.completeParseFragment();
    }

    public Document document() {
        Document document = this.treeBuilder.doc;
        this.document = document;
        Validate.notNull(document, "Must run parse() before calling.");
        return this.document;
    }

    public Element expectFirst(String str) {
        return (Element) Validate.ensureNotNull(selectFirst(str), "No elements matched the query '%s' in the document.", str);
    }

    public Element expectNext(String str) {
        return (Element) Validate.ensureNotNull(selectNext(str), "No elements matched the query '%s' in the document.", str);
    }

    public Iterator<Element> iterator() {
        return this.it;
    }

    public StreamParser parse(Reader reader, String str) {
        close();
        this.it.reset();
        this.treeBuilder.initialiseParse(reader, str, this.parser);
        this.document = this.treeBuilder.doc;
        return this;
    }

    public StreamParser parseFragment(String str, Element element, String str2) {
        return parseFragment(new StringReader(str), element, str2);
    }

    public Element selectFirst(Evaluator evaluator) {
        Element selectFirst = document().selectFirst(evaluator);
        if (selectFirst != null) {
            return selectFirst;
        }
        return selectNext(evaluator);
    }

    public Element selectNext(Evaluator evaluator) {
        try {
            return stream().filter(evaluator.asPredicate(document())).findFirst().orElse(null);
        } catch (UncheckedIOException e) {
            throw e.getCause();
        }
    }

    public StreamParser stop() {
        this.stopped = true;
        return this;
    }

    public Stream<Element> stream() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(this.it, 273), false);
    }

    public StreamParser parseFragment(Reader reader, Element element, String str) {
        parse(reader, str);
        this.treeBuilder.initialiseParseFragment(element);
        return this;
    }

    public Element selectFirst(String str) {
        return selectFirst(QueryParser.parse(str));
    }

    public StreamParser parse(String str, String str2) {
        return parse(new StringReader(str), str2);
    }

    public Element selectNext(String str) {
        return selectNext(QueryParser.parse(str));
    }
}
