package org.jsoup.nodes;

import defpackage.l2;
import defpackage.l90;
import defpackage.m50;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Element extends Node {
    Attributes attributes;
    List<Node> childNodes;
    private WeakReference<List<Element>> shadowChildrenRef;
    private Tag tag;
    private static final List<Element> EmptyChildren = Collections.EMPTY_LIST;
    private static final Pattern ClassSplit = Pattern.compile("\\s+");
    private static final String BaseUriKey = Attributes.internalKey("baseUri");

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class NodeList extends ChangeNotifyingArrayList<Node> {
        private final Element owner;

        public NodeList(Element element, int i) {
            super(i);
            this.owner = element;
        }

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        public void onContentsChanged() {
            this.owner.nodelistChanged();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class TextAccumulator implements NodeVisitor {
        private final StringBuilder accum;

        public TextAccumulator(StringBuilder sb) {
            this.accum = sb;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: head */
        public void mo125head(Node node, int i) {
            if (node instanceof TextNode) {
                Element.appendNormalisedText(this.accum, (TextNode) node);
            } else if (node instanceof Element) {
                Element element = (Element) node;
                if (this.accum.length() > 0) {
                    if ((element.isBlock() || element.nameIs("br")) && !TextNode.lastCharIsWhitespace(this.accum)) {
                        this.accum.append(' ');
                    }
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                Node nextSibling = node.nextSibling();
                if (element.isBlock()) {
                    if (((nextSibling instanceof TextNode) || ((nextSibling instanceof Element) && !((Element) nextSibling).tag.formatAsBlock())) && !TextNode.lastCharIsWhitespace(this.accum)) {
                        this.accum.append(' ');
                    }
                }
            }
        }
    }

    public Element(Tag tag, String str, Attributes attributes) {
        Validate.notNull(tag);
        this.childNodes = Node.EmptyNodes;
        this.attributes = attributes;
        this.tag = tag;
        if (str != null) {
            setBaseUri(str);
        }
    }

    public static void appendNormalisedText(StringBuilder sb, TextNode textNode) {
        String wholeText = textNode.getWholeText();
        if (!preserveWhitespace(textNode.parentNode) && !(textNode instanceof CDataNode)) {
            StringUtil.appendNormalisedWhitespace(sb, wholeText, TextNode.lastCharIsWhitespace(sb));
        } else {
            sb.append(wholeText);
        }
    }

    private String cssSelectorComponent() {
        String replace = TokenQueue.escapeCssIdentifier(tagName()).replace("\\:", "|");
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        borrowBuilder.append(replace);
        String str = (String) classNames().stream().map(new m50(2)).collect(StringUtil.joining("."));
        if (!str.isEmpty()) {
            borrowBuilder.append('.');
            borrowBuilder.append(str);
        }
        if (parent() != null && !(parent() instanceof Document)) {
            borrowBuilder.insert(0, " > ");
            if (parent().select(borrowBuilder.toString()).size() > 1) {
                borrowBuilder.append(String.format(":nth-child(%d)", Integer.valueOf(elementSiblingIndex() + 1)));
            }
            return StringUtil.releaseBuilder(borrowBuilder);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    private <T> List<T> filterNodes(final Class<T> cls) {
        Stream<Node> stream = this.childNodes.stream();
        Objects.requireNonNull(cls);
        return (List) stream.filter(new Predicate() { // from class: k50
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((Node) obj);
            }
        }).map(new Function() { // from class: l50
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cls.cast((Node) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new m50(0)));
    }

    private static <E extends Element> int indexInList(Element element, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == element) {
                return i;
            }
        }
        return 0;
    }

    private boolean isFormatAsBlock(Document.OutputSettings outputSettings) {
        if (!this.tag.isBlock()) {
            if ((parent() == null || !parent().tag().formatAsBlock()) && !outputSettings.outline()) {
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean isInlineable(Document.OutputSettings outputSettings) {
        if (!this.tag.isInline()) {
            return false;
        }
        if ((parent() != null && !parent().isBlock()) || isEffectivelyFirst() || outputSettings.outline() || nameIs("br")) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void lambda$data$2(StringBuilder sb, Node node, int i) {
        if (node instanceof DataNode) {
            sb.append(((DataNode) node).getWholeData());
        } else if (node instanceof Comment) {
            sb.append(((Comment) node).getData());
        } else if (node instanceof CDataNode) {
            sb.append(((CDataNode) node).getWholeText());
        }
    }

    public static /* synthetic */ NodeFilter.FilterResult lambda$hasText$1(AtomicBoolean atomicBoolean, Node node, int i) {
        if ((node instanceof TextNode) && !((TextNode) node).isBlank()) {
            atomicBoolean.set(true);
            return NodeFilter.FilterResult.STOP;
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    public static /* synthetic */ String lambda$wholeTextOf$0(Node node) {
        if (node instanceof TextNode) {
            return ((TextNode) node).getWholeText();
        }
        if (node.nameIs("br")) {
            return "\n";
        }
        return "";
    }

    private Elements nextElementSiblings(boolean z) {
        Elements elements = new Elements();
        if (this.parentNode == null) {
            return elements;
        }
        elements.add(this);
        if (z) {
            return elements.nextAll();
        }
        return elements.prevAll();
    }

    private void ownText(StringBuilder sb) {
        for (int i = 0; i < childNodeSize(); i++) {
            Node node = this.childNodes.get(i);
            if (node instanceof TextNode) {
                appendNormalisedText(sb, (TextNode) node);
            } else if (node.nameIs("br") && !TextNode.lastCharIsWhitespace(sb)) {
                sb.append(" ");
            }
        }
    }

    public static boolean preserveWhitespace(Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            int i = 0;
            while (!element.tag.preserveWhitespace()) {
                element = element.parent();
                i++;
                if (i < 6 && element != null) {
                }
            }
            return true;
        }
        return false;
    }

    private static String searchUpForAttribute(Element element, String str) {
        while (element != null) {
            Attributes attributes = element.attributes;
            if (attributes != null && attributes.hasKey(str)) {
                return element.attributes.get(str);
            }
            element = element.parent();
        }
        return "";
    }

    private static String wholeTextOf(Stream<Node> stream) {
        return (String) stream.map(new m50(1)).collect(StringUtil.joining(""));
    }

    public Element addClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.add(str);
        classNames(classNames);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element after(String str) {
        return (Element) super.after(str);
    }

    public Element append(String str) {
        Validate.notNull(str);
        addChildren((Node[]) NodeUtils.parser(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]));
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        reparentChild(node);
        ensureChildNodes();
        this.childNodes.add(node);
        node.setSiblingIndex(this.childNodes.size() - 1);
        return this;
    }

    public Element appendChildren(Collection<? extends Node> collection) {
        insertChildren(-1, collection);
        return this;
    }

    public Element appendElement(String str, String str2) {
        Element element = new Element(Tag.valueOf(str, str2, NodeUtils.parser(this).settings()), baseUri());
        appendChild(element);
        return element;
    }

    public Element appendText(String str) {
        Validate.notNull(str);
        appendChild(new TextNode(str));
        return this;
    }

    public Element appendTo(Element element) {
        Validate.notNull(element);
        element.appendChild(this);
        return this;
    }

    public Element attr(String str, boolean z) {
        attributes().put(str, z);
        return this;
    }

    public Attribute attribute(String str) {
        if (hasAttributes()) {
            return attributes().attribute(str);
        }
        return null;
    }

    @Override // org.jsoup.nodes.Node
    public Attributes attributes() {
        if (this.attributes == null) {
            this.attributes = new Attributes();
        }
        return this.attributes;
    }

    @Override // org.jsoup.nodes.Node
    public String baseUri() {
        return searchUpForAttribute(this, BaseUriKey);
    }

    @Override // org.jsoup.nodes.Node
    public Element before(String str) {
        return (Element) super.before(str);
    }

    public Element child(int i) {
        return childElementsList().get(i);
    }

    public List<Element> childElementsList() {
        List<Element> list;
        if (childNodeSize() == 0) {
            return EmptyChildren;
        }
        WeakReference<List<Element>> weakReference = this.shadowChildrenRef;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.childNodes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Node node = this.childNodes.get(i);
            if (node instanceof Element) {
                arrayList.add((Element) node);
            }
        }
        this.shadowChildrenRef = new WeakReference<>(arrayList);
        return arrayList;
    }

    @Override // org.jsoup.nodes.Node
    public int childNodeSize() {
        return this.childNodes.size();
    }

    public Elements children() {
        return new Elements(childElementsList());
    }

    public int childrenSize() {
        return childElementsList().size();
    }

    public String className() {
        return attr("class").trim();
    }

    public Element classNames(Set<String> set) {
        Validate.notNull(set);
        if (set.isEmpty()) {
            attributes().remove("class");
            return this;
        }
        attributes().put("class", StringUtil.join(set, " "));
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element clearAttributes() {
        if (this.attributes != null) {
            super.clearAttributes();
            if (this.attributes.size() == 0) {
                this.attributes = null;
            }
        }
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public Element mo283clone() {
        return (Element) super.mo283clone();
    }

    public Element closest(Evaluator evaluator) {
        Validate.notNull(evaluator);
        Element root = root();
        while (!evaluator.lambda$asPredicate$0(root, this)) {
            this = this.parent();
            if (this == null) {
                return null;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r2.get(0) == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String cssSelector() {
        /*
            r5 = this;
            java.lang.String r0 = r5.id()
            int r0 = r0.length()
            r1 = 0
            if (r0 <= 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "#"
            r0.<init>(r2)
            java.lang.String r2 = r5.id()
            java.lang.String r2 = org.jsoup.parser.TokenQueue.escapeCssIdentifier(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            org.jsoup.nodes.Document r2 = r5.ownerDocument()
            if (r2 == 0) goto L38
            org.jsoup.select.Elements r2 = r2.select(r0)
            int r3 = r2.size()
            r4 = 1
            if (r3 != r4) goto L39
            java.lang.Object r2 = r2.get(r1)
            if (r2 != r5) goto L39
        L38:
            return r0
        L39:
            java.lang.StringBuilder r0 = org.jsoup.internal.StringUtil.borrowBuilder()
        L3d:
            if (r5 == 0) goto L4f
            boolean r2 = r5 instanceof org.jsoup.nodes.Document
            if (r2 != 0) goto L4f
            java.lang.String r2 = r5.cssSelectorComponent()
            r0.insert(r1, r2)
            org.jsoup.nodes.Element r5 = r5.parent()
            goto L3d
        L4f:
            java.lang.String r5 = org.jsoup.internal.StringUtil.releaseBuilder(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.cssSelector():java.lang.String");
    }

    public String data() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        traverse((NodeVisitor) new l2(borrowBuilder));
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public List<DataNode> dataNodes() {
        return filterNodes(DataNode.class);
    }

    public Map<String, String> dataset() {
        return attributes().dataset();
    }

    @Override // org.jsoup.nodes.Node
    public Element doClone(Node node) {
        Attributes attributes;
        Element element = (Element) super.doClone(node);
        Attributes attributes2 = this.attributes;
        if (attributes2 != null) {
            attributes = attributes2.clone();
        } else {
            attributes = null;
        }
        element.attributes = attributes;
        NodeList nodeList = new NodeList(element, this.childNodes.size());
        element.childNodes = nodeList;
        nodeList.addAll(this.childNodes);
        return element;
    }

    @Override // org.jsoup.nodes.Node
    public void doSetBaseUri(String str) {
        attributes().put(BaseUriKey, str);
    }

    public boolean elementIs(String str, String str2) {
        if (this.tag.normalName().equals(str) && this.tag.namespace().equals(str2)) {
            return true;
        }
        return false;
    }

    public int elementSiblingIndex() {
        if (parent() == null) {
            return 0;
        }
        return indexInList(this, parent().childElementsList());
    }

    @Override // org.jsoup.nodes.Node
    public Element empty() {
        Iterator<Node> it = this.childNodes.iterator();
        while (it.hasNext()) {
            it.next().parentNode = null;
        }
        this.childNodes.clear();
        return this;
    }

    public Range endSourceRange() {
        return Range.of(this, false);
    }

    @Override // org.jsoup.nodes.Node
    public List<Node> ensureChildNodes() {
        if (this.childNodes == Node.EmptyNodes) {
            this.childNodes = new NodeList(this, 4);
        }
        return this.childNodes;
    }

    public Element expectFirst(String str) {
        String str2;
        Element selectFirst = Selector.selectFirst(str, this);
        if (parent() != null) {
            str2 = "No elements matched the query '%s' on element '%s'.";
        } else {
            str2 = "No elements matched the query '%s' in the document.";
        }
        return (Element) Validate.ensureNotNull(selectFirst, str2, str, tagName());
    }

    @Override // org.jsoup.nodes.Node
    public Element filter(NodeFilter nodeFilter) {
        return (Element) super.filter(nodeFilter);
    }

    public Element firstElementChild() {
        for (Node firstChild = firstChild(); firstChild != null; firstChild = firstChild.nextSibling()) {
            if (firstChild instanceof Element) {
                return (Element) firstChild;
            }
        }
        return null;
    }

    public Element firstElementSibling() {
        if (parent() != null) {
            return parent().firstElementChild();
        }
        return this;
    }

    @Deprecated
    public Element forEach(Consumer<? super Element> consumer) {
        stream().forEach(consumer);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element forEachNode(Consumer<? super Node> consumer) {
        return (Element) super.forEachNode(consumer);
    }

    public Elements getAllElements() {
        return Collector.collect(new Evaluator.AllElements(), this);
    }

    public Element getElementById(String str) {
        Validate.notEmpty(str);
        Elements collect = Collector.collect(new Evaluator.Id(str), this);
        if (collect.size() > 0) {
            return collect.get(0);
        }
        return null;
    }

    public Elements getElementsByAttribute(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Attribute(str.trim()), this);
    }

    public Elements getElementsByAttributeStarting(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.AttributeStarting(str.trim()), this);
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValue(str, str2), this);
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueContaining(str, str2), this);
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueEnding(str, str2), this);
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
        try {
            return getElementsByAttributeValueMatching(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException(l90.l("Pattern syntax error: ", str2), e);
        }
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueNot(str, str2), this);
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueStarting(str, str2), this);
    }

    public Elements getElementsByClass(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Class(str), this);
    }

    public Elements getElementsByIndexEquals(int i) {
        return Collector.collect(new Evaluator.IndexEquals(i), this);
    }

    public Elements getElementsByIndexGreaterThan(int i) {
        return Collector.collect(new Evaluator.IndexGreaterThan(i), this);
    }

    public Elements getElementsByIndexLessThan(int i) {
        return Collector.collect(new Evaluator.IndexLessThan(i), this);
    }

    public Elements getElementsByTag(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Tag(Normalizer.normalize(str)), this);
    }

    public Elements getElementsContainingOwnText(String str) {
        return Collector.collect(new Evaluator.ContainsOwnText(str), this);
    }

    public Elements getElementsContainingText(String str) {
        return Collector.collect(new Evaluator.ContainsText(str), this);
    }

    public Elements getElementsMatchingOwnText(String str) {
        try {
            return getElementsMatchingOwnText(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException(l90.l("Pattern syntax error: ", str), e);
        }
    }

    public Elements getElementsMatchingText(String str) {
        try {
            return getElementsMatchingText(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException(l90.l("Pattern syntax error: ", str), e);
        }
    }

    @Override // org.jsoup.nodes.Node
    public boolean hasAttributes() {
        if (this.attributes != null) {
            return true;
        }
        return false;
    }

    public boolean hasChildNodes() {
        if (this.childNodes != Node.EmptyNodes) {
            return true;
        }
        return false;
    }

    public boolean hasClass(String str) {
        String str2;
        Attributes attributes = this.attributes;
        if (attributes == null) {
            return false;
        }
        String ignoreCase = attributes.getIgnoreCase("class");
        int length = ignoreCase.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(ignoreCase);
            }
            int i = 0;
            boolean z = false;
            int i2 = 0;
            while (i < length) {
                if (Character.isWhitespace(ignoreCase.charAt(i))) {
                    if (z) {
                        if (i - i2 == length2) {
                            str2 = str;
                            if (ignoreCase.regionMatches(true, i2, str2, 0, length2)) {
                                return true;
                            }
                        } else {
                            str2 = str;
                        }
                        z = false;
                    } else {
                        str2 = str;
                    }
                } else {
                    str2 = str;
                    if (!z) {
                        i2 = i;
                        z = true;
                    }
                }
                i++;
                str = str2;
            }
            String str3 = str;
            if (z && length - i2 == length2) {
                return ignoreCase.regionMatches(true, i2, str3, 0, length2);
            }
        }
        return false;
    }

    public boolean hasText() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        filter((NodeFilter) new l2(atomicBoolean));
        return atomicBoolean.get();
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        html((Element) borrowBuilder);
        String releaseBuilder = StringUtil.releaseBuilder(borrowBuilder);
        if (NodeUtils.outputSettings(this).prettyPrint()) {
            return releaseBuilder.trim();
        }
        return releaseBuilder;
    }

    public String id() {
        Attributes attributes = this.attributes;
        if (attributes != null) {
            return attributes.getIgnoreCase("id");
        }
        return "";
    }

    public Element insertChildren(int i, Collection<? extends Node> collection) {
        boolean z;
        Validate.notNull(collection, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i < 0) {
            i += childNodeSize + 1;
        }
        if (i >= 0 && i <= childNodeSize) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Insert position out of bounds.");
        addChildren(i, (Node[]) new ArrayList(collection).toArray(new Node[0]));
        return this;
    }

    public boolean is(String str) {
        return is(QueryParser.parse(str));
    }

    public boolean isBlock() {
        return this.tag.isBlock();
    }

    public Element lastElementChild() {
        for (Node lastChild = lastChild(); lastChild != null; lastChild = lastChild.previousSibling()) {
            if (lastChild instanceof Element) {
                return (Element) lastChild;
            }
        }
        return null;
    }

    public Element lastElementSibling() {
        if (parent() != null) {
            return parent().lastElementChild();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.jsoup.nodes.Element] */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.nodes.Node] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.jsoup.nodes.Node] */
    public Element nextElementSibling() {
        do {
            this = this.nextSibling();
            if (this == 0) {
                return null;
            }
        } while (!(this instanceof Element));
        return (Element) this;
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return this.tag.getName();
    }

    @Override // org.jsoup.nodes.Node
    public void nodelistChanged() {
        super.nodelistChanged();
        this.shadowChildrenRef = null;
    }

    @Override // org.jsoup.nodes.Node
    public String normalName() {
        return this.tag.normalName();
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        if (shouldIndent(outputSettings)) {
            if (appendable instanceof StringBuilder) {
                if (((StringBuilder) appendable).length() > 0) {
                    indent(appendable, i, outputSettings);
                }
            } else {
                indent(appendable, i, outputSettings);
            }
        }
        appendable.append('<').append(tagName());
        Attributes attributes = this.attributes;
        if (attributes != null) {
            attributes.html(appendable, outputSettings);
        }
        if (this.childNodes.isEmpty() && this.tag.isSelfClosing()) {
            if (outputSettings.syntax() == Document.OutputSettings.Syntax.html && this.tag.isEmpty()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        if (this.childNodes.isEmpty() && this.tag.isSelfClosing()) {
            return;
        }
        if (outputSettings.prettyPrint() && !this.childNodes.isEmpty() && ((this.tag.formatAsBlock() && !preserveWhitespace(this.parentNode)) || (outputSettings.outline() && (this.childNodes.size() > 1 || (this.childNodes.size() == 1 && (this.childNodes.get(0) instanceof Element)))))) {
            indent(appendable, i, outputSettings);
        }
        appendable.append("</").append(tagName()).append('>');
    }

    public Elements parents() {
        Elements elements = new Elements();
        for (Element parent = parent(); parent != null && !parent.nameIs("#root"); parent = parent.parent()) {
            elements.add(parent);
        }
        return elements;
    }

    public Element prepend(String str) {
        Validate.notNull(str);
        addChildren(0, (Node[]) NodeUtils.parser(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]));
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        addChildren(0, node);
        return this;
    }

    public Element prependChildren(Collection<? extends Node> collection) {
        insertChildren(0, collection);
        return this;
    }

    public Element prependElement(String str, String str2) {
        Element element = new Element(Tag.valueOf(str, str2, NodeUtils.parser(this).settings()), baseUri());
        prependChild(element);
        return element;
    }

    public Element prependText(String str) {
        Validate.notNull(str);
        prependChild(new TextNode(str));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.jsoup.nodes.Element] */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.nodes.Node] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.jsoup.nodes.Node] */
    public Element previousElementSibling() {
        do {
            this = this.previousSibling();
            if (this == 0) {
                return null;
            }
        } while (!(this instanceof Element));
        return (Element) this;
    }

    public Elements previousElementSiblings() {
        return nextElementSiblings(false);
    }

    @Override // org.jsoup.nodes.Node
    public Element removeAttr(String str) {
        return (Element) super.removeAttr(str);
    }

    public Element removeClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.remove(str);
        classNames(classNames);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element root() {
        return (Element) super.root();
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Element selectFirst(String str) {
        return Selector.selectFirst(str, this);
    }

    public Elements selectXpath(String str) {
        return new Elements((List<Element>) NodeUtils.selectXpath(str, this, Element.class));
    }

    @Override // org.jsoup.nodes.Node
    public Element shallowClone() {
        String baseUri = baseUri();
        Attributes attributes = null;
        if (baseUri.isEmpty()) {
            baseUri = null;
        }
        Tag tag = this.tag;
        Attributes attributes2 = this.attributes;
        if (attributes2 != null) {
            attributes = attributes2.clone();
        }
        return new Element(tag, baseUri, attributes);
    }

    public boolean shouldIndent(Document.OutputSettings outputSettings) {
        if (outputSettings.prettyPrint() && isFormatAsBlock(outputSettings) && !isInlineable(outputSettings) && !preserveWhitespace(this.parentNode)) {
            return true;
        }
        return false;
    }

    public Elements siblingElements() {
        if (this.parentNode == null) {
            return new Elements(0);
        }
        List<Element> childElementsList = parent().childElementsList();
        Elements elements = new Elements(childElementsList.size() - 1);
        for (Element element : childElementsList) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    public Stream<Element> stream() {
        return NodeUtils.stream(this, Element.class);
    }

    public Tag tag() {
        return this.tag;
    }

    public Element tagName(String str, String str2) {
        Validate.notEmptyParam(str, "tagName");
        Validate.notEmptyParam(str2, "namespace");
        this.tag = Tag.valueOf(str, str2, NodeUtils.parser(this).settings());
        return this;
    }

    public Element text(String str) {
        Validate.notNull(str);
        empty();
        Document ownerDocument = ownerDocument();
        if (ownerDocument != null && ownerDocument.parser().isContentForTagData(normalName())) {
            appendChild(new DataNode(str));
            return this;
        }
        appendChild(new TextNode(str));
        return this;
    }

    public List<TextNode> textNodes() {
        return filterNodes(TextNode.class);
    }

    public Element toggleClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        if (classNames.contains(str)) {
            classNames.remove(str);
        } else {
            classNames.add(str);
        }
        classNames(classNames);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element traverse(NodeVisitor nodeVisitor) {
        return (Element) super.traverse(nodeVisitor);
    }

    public String val() {
        if (elementIs("textarea", Parser.NamespaceHtml)) {
            return text();
        }
        return attr("value");
    }

    public String wholeOwnText() {
        return wholeTextOf(this.childNodes.stream());
    }

    public String wholeText() {
        return wholeTextOf(nodeStream());
    }

    @Override // org.jsoup.nodes.Node
    public Element wrap(String str) {
        return (Element) super.wrap(str);
    }

    @Override // org.jsoup.nodes.Node
    public final Element parent() {
        return (Element) this.parentNode;
    }

    public Elements select(Evaluator evaluator) {
        return Selector.select(evaluator, this);
    }

    public Element selectFirst(Evaluator evaluator) {
        return Collector.findFirst(evaluator, this);
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node forEachNode(Consumer consumer) {
        return forEachNode((Consumer<? super Node>) consumer);
    }

    @Override // org.jsoup.nodes.Node
    public Element attr(String str, String str2) {
        super.attr(str, str2);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element after(Node node) {
        return (Element) super.after(node);
    }

    @Override // org.jsoup.nodes.Node
    public Element before(Node node) {
        return (Element) super.before(node);
    }

    public boolean is(Evaluator evaluator) {
        return evaluator.lambda$asPredicate$0(root(), this);
    }

    public <T extends Node> List<T> selectXpath(String str, Class<T> cls) {
        return NodeUtils.selectXpath(str, this, cls);
    }

    public Element id(String str) {
        Validate.notNull(str);
        attr("id", str);
        return this;
    }

    public Element(String str) {
        this(Tag.valueOf(str, Parser.NamespaceHtml, ParseSettings.preserveCase), "", null);
    }

    public Element(String str, String str2) {
        this(Tag.valueOf(str, str2, ParseSettings.preserveCase), (String) null);
    }

    public Element(Tag tag, String str) {
        this(tag, str, null);
    }

    public Element closest(String str) {
        return closest(QueryParser.parse(str));
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
        return Collector.collect(new Evaluator.AttributeWithValueMatching(str, pattern), this);
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        return Collector.collect(new Evaluator.Matches(pattern), this);
    }

    public Element val(String str) {
        if (elementIs("textarea", Parser.NamespaceHtml)) {
            text(str);
            return this;
        }
        attr("value", str);
        return this;
    }

    public Element appendElement(String str) {
        return appendElement(str, this.tag.namespace());
    }

    public Elements nextElementSiblings() {
        return nextElementSiblings(true);
    }

    public Element prependElement(String str) {
        return prependElement(str, this.tag.namespace());
    }

    public Element tagName(String str) {
        return tagName(str, this.tag.namespace());
    }

    public String tagName() {
        return this.tag.getName();
    }

    @Override // org.jsoup.nodes.Node
    public <T extends Appendable> T html(T t) {
        int size = this.childNodes.size();
        for (int i = 0; i < size; i++) {
            this.childNodes.get(i).outerHtml(t);
        }
        return t;
    }

    public Element html(String str) {
        empty();
        append(str);
        return this;
    }

    public Set<String> classNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(ClassSplit.split(className())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    public Element insertChildren(int i, Node... nodeArr) {
        Validate.notNull(nodeArr, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i < 0) {
            i += childNodeSize + 1;
        }
        Validate.isTrue(i >= 0 && i <= childNodeSize, "Insert position out of bounds.");
        addChildren(i, nodeArr);
        return this;
    }

    public String text() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        NodeTraversor.traverse(new TextAccumulator(borrowBuilder), this);
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }

    public String ownText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        ownText(borrowBuilder);
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }
}
