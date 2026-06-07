package org.jsoup.nodes;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jsoup.helper.Validate;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class NodeUtils {
    public static Document.OutputSettings outputSettings(Node node) {
        Document ownerDocument = node.ownerDocument();
        if (ownerDocument != null) {
            return ownerDocument.outputSettings();
        }
        return new Document("").outputSettings();
    }

    public static Parser parser(Node node) {
        Document ownerDocument = node.ownerDocument();
        if (ownerDocument != null) {
            return ownerDocument.parser();
        }
        return new Parser(new HtmlTreeBuilder());
    }

    public static <T extends Node> List<T> selectXpath(String str, Element element, Class<T> cls) {
        Validate.notEmpty(str);
        Validate.notNull(element);
        Validate.notNull(cls);
        W3CDom namespaceAware = new W3CDom().namespaceAware(false);
        return namespaceAware.sourceNodes(namespaceAware.selectXpath(str, namespaceAware.contextNode(namespaceAware.fromJsoup(element))), cls);
    }

    public static <T extends Node> Spliterator<T> spliterator(Iterator<T> it) {
        return Spliterators.spliteratorUnknownSize(it, 273);
    }

    public static <T extends Node> Stream<T> stream(Node node, Class<T> cls) {
        return StreamSupport.stream(spliterator(new NodeIterator(node, cls)), false);
    }
}
