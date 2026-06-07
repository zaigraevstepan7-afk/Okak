package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class HtmlTreeBuilder extends TreeBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int MaxScopeSearchDepth = 100;
    private static final int maxQueueDepth = 256;
    private static final int maxUsedFormattingElements = 12;
    private boolean baseUriSetFromDoc;
    private Element contextElement;
    private Token.EndTag emptyEnd;
    private FormElement formElement;
    private ArrayList<Element> formattingElements;
    private boolean fosterInserts;
    private boolean fragmentParsing;
    private boolean framesetOk;
    private Element headElement;
    private HtmlTreeBuilderState originalState;
    private List<Token.Character> pendingTableCharacters;
    private final String[] specificScopeTarget = {null};
    private HtmlTreeBuilderState state;
    private ArrayList<HtmlTreeBuilderState> tmplInsertMode;
    static final String[] TagsSearchInScope = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] TagSearchList = {"ol", "ul"};
    static final String[] TagSearchButton = {"button"};
    static final String[] TagSearchTableScope = {"html", "table"};
    static final String[] TagSearchSelectScope = {"optgroup", "option"};
    static final String[] TagSearchEndTags = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    static final String[] TagThoroughSearchEndTags = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] TagSearchSpecial = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    static final String[] TagMathMlTextIntegration = {"mi", "mn", "mo", "ms", "mtext"};
    static final String[] TagSvgHtmlIntegration = {"desc", "foreignObject", "title"};

    private void clearStackToContext(String... strArr) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element element = this.stack.get(size);
            if (!Parser.NamespaceHtml.equals(element.tag().namespace()) || (!StringUtil.in(element.normalName(), strArr) && !element.nameIs("html"))) {
                pop();
            } else {
                return;
            }
        }
    }

    private void doInsertElement(Element element, Token token) {
        FormElement formElement;
        if (element.tag().isFormListed() && (formElement = this.formElement) != null) {
            formElement.addElement(element);
        }
        if (this.parser.getErrors().canAddError() && element.hasAttr("xmlns") && !element.attr("xmlns").equals(element.tag().namespace())) {
            error("Invalid xmlns attribute [%s] on tag [%s]", element.attr("xmlns"), element.tagName());
        }
        if (isFosterInserts() && StringUtil.inSorted(currentElement().normalName(), HtmlTreeBuilderState.Constants.InTableFoster)) {
            insertInFosterParent(element);
        } else {
            currentElement().appendChild(element);
        }
        push(element);
    }

    private boolean inSpecificScope(String[] strArr, String[] strArr2, String[] strArr3) {
        int i;
        int size = this.stack.size();
        int i2 = size - 1;
        if (i2 > 100) {
            i = size - 101;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            Element element = this.stack.get(i2);
            if (element.tag().namespace().equals(Parser.NamespaceHtml)) {
                String normalName = element.normalName();
                if (StringUtil.inSorted(normalName, strArr)) {
                    return true;
                }
                if (StringUtil.inSorted(normalName, strArr2)) {
                    return $assertionsDisabled;
                }
                if (strArr3 != null && StringUtil.inSorted(normalName, strArr3)) {
                    return $assertionsDisabled;
                }
            }
            i2--;
        }
        return $assertionsDisabled;
    }

    public static boolean isHtmlIntegration(Element element) {
        if (Parser.NamespaceMathml.equals(element.tag().namespace()) && element.nameIs("annotation-xml")) {
            String normalize = Normalizer.normalize(element.attr("encoding"));
            if (normalize.equals("text/html") || normalize.equals("application/xhtml+xml")) {
                return true;
            }
        }
        if (Parser.NamespaceSvg.equals(element.tag().namespace()) && StringUtil.in(element.tagName(), TagSvgHtmlIntegration)) {
            return true;
        }
        return $assertionsDisabled;
    }

    public static boolean isMathmlTextIntegration(Element element) {
        if (Parser.NamespaceMathml.equals(element.tag().namespace()) && StringUtil.inSorted(element.normalName(), TagMathMlTextIntegration)) {
            return true;
        }
        return $assertionsDisabled;
    }

    private static boolean isSameFormattingElement(Element element, Element element2) {
        if (element.normalName().equals(element2.normalName()) && element.attributes().equals(element2.attributes())) {
            return true;
        }
        return $assertionsDisabled;
    }

    public static boolean isSpecial(Element element) {
        return StringUtil.inSorted(element.normalName(), TagSearchSpecial);
    }

    private static boolean onStack(ArrayList<Element> arrayList, Element element) {
        int i;
        int size = arrayList.size();
        int i2 = size - 1;
        if (i2 >= maxQueueDepth) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            if (arrayList.get(i2) == element) {
                return true;
            }
            i2--;
        }
        return $assertionsDisabled;
    }

    private static void replaceInQueue(ArrayList<Element> arrayList, Element element, Element element2) {
        boolean z;
        int lastIndexOf = arrayList.lastIndexOf(element);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = $assertionsDisabled;
        }
        Validate.isTrue(z);
        arrayList.set(lastIndexOf, element2);
    }

    public Element aboveOnStack(Element element) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            if (this.stack.get(size) == element) {
                return this.stack.get(size - 1);
            }
        }
        return null;
    }

    public void addPendingTableCharacters(Token.Character character) {
        this.pendingTableCharacters.add(character.clone());
    }

    public void checkActiveFormattingElements(Element element) {
        int size = this.formattingElements.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            Element element2 = this.formattingElements.get(i3);
            if (element2 != null) {
                if (isSameFormattingElement(element, element2)) {
                    i2++;
                }
                if (i2 == 3) {
                    this.formattingElements.remove(i3);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void clearFormattingElementsToLastMarker() {
        while (!this.formattingElements.isEmpty() && removeLastFormattingElement() != null) {
        }
    }

    public void clearStackToTableBodyContext() {
        clearStackToContext("tbody", "tfoot", "thead", "template");
    }

    public void clearStackToTableContext() {
        clearStackToContext("table", "template");
    }

    public void clearStackToTableRowContext() {
        clearStackToContext("tr", "template");
    }

    public void closeElement(String str) {
        generateImpliedEndTags(str);
        if (!str.equals(currentElement().normalName())) {
            error(state());
        }
        popStackToClose(str);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public List<Node> completeParseFragment() {
        Element element = this.contextElement;
        if (element != null) {
            List<Node> siblingNodes = element.siblingNodes();
            if (!siblingNodes.isEmpty()) {
                this.contextElement.insertChildren(-1, siblingNodes);
            }
            return this.contextElement.childNodes();
        }
        return this.doc.childNodes();
    }

    public Element createElementFor(Token.StartTag startTag, String str, boolean z) {
        ParseSettings parseSettings;
        Attributes attributes = startTag.attributes;
        if (!z) {
            attributes = this.settings.normalizeAttributes(attributes);
        }
        if (attributes != null && !attributes.isEmpty() && attributes.deduplicate(this.settings) > 0) {
            error("Dropped duplicate attribute(s) in tag [%s]", startTag.normalName);
        }
        String str2 = startTag.tagName;
        if (z) {
            parseSettings = ParseSettings.preserveCase;
        } else {
            parseSettings = this.settings;
        }
        Tag tagFor = tagFor(str2, str, parseSettings);
        if (tagFor.normalName().equals("form")) {
            return new FormElement(tagFor, null, attributes);
        }
        return new Element(tagFor, null, attributes);
    }

    public HtmlTreeBuilderState currentTemplateMode() {
        if (this.tmplInsertMode.size() > 0) {
            return this.tmplInsertMode.get(r1.size() - 1);
        }
        return null;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public ParseSettings defaultSettings() {
        return ParseSettings.htmlDefault;
    }

    public void error(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.parser.getErrors().canAddError()) {
            this.parser.getErrors().add(new ParseError(this.reader, "Unexpected %s token [%s] when in state [%s]", this.currentToken.tokenType(), this.currentToken, htmlTreeBuilderState));
        }
    }

    public void framesetOk(boolean z) {
        this.framesetOk = z;
    }

    public void generateImpliedEndTags(boolean z) {
        String[] strArr;
        if (z) {
            strArr = TagThoroughSearchEndTags;
        } else {
            strArr = TagSearchEndTags;
        }
        while (Parser.NamespaceHtml.equals(currentElement().tag().namespace()) && StringUtil.inSorted(currentElement().normalName(), strArr)) {
            pop();
        }
    }

    public Element getActiveFormattingElement(String str) {
        for (int size = this.formattingElements.size() - 1; size >= 0; size--) {
            Element element = this.formattingElements.get(size);
            if (element != null) {
                if (element.nameIs(str)) {
                    return element;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public String getBaseUri() {
        return this.baseUri;
    }

    public Document getDocument() {
        return this.doc;
    }

    public FormElement getFormElement() {
        return this.formElement;
    }

    public Element getFromStack(String str) {
        int i;
        int size = this.stack.size();
        int i2 = size - 1;
        if (i2 >= maxQueueDepth) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            Element element = this.stack.get(i2);
            if (element.elementIs(str, Parser.NamespaceHtml)) {
                return element;
            }
            i2--;
        }
        return null;
    }

    public Element getHeadElement() {
        return this.headElement;
    }

    public List<Token.Character> getPendingTableCharacters() {
        return this.pendingTableCharacters;
    }

    public ArrayList<Element> getStack() {
        return this.stack;
    }

    public boolean inButtonScope(String str) {
        return inScope(str, TagSearchButton);
    }

    public boolean inListItemScope(String str) {
        return inScope(str, TagSearchList);
    }

    public boolean inScope(String[] strArr) {
        return inSpecificScope(strArr, TagsSearchInScope, (String[]) null);
    }

    public boolean inSelectScope(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            String normalName = this.stack.get(size).normalName();
            if (normalName.equals(str)) {
                return true;
            }
            if (!StringUtil.inSorted(normalName, TagSearchSelectScope)) {
                return $assertionsDisabled;
            }
        }
        Validate.fail("Should not be reachable");
        return $assertionsDisabled;
    }

    public boolean inTableScope(String str) {
        return inSpecificScope(str, TagSearchTableScope, (String[]) null);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void initialiseParse(Reader reader, String str, Parser parser) {
        super.initialiseParse(reader, str, parser);
        this.state = HtmlTreeBuilderState.Initial;
        this.originalState = null;
        this.baseUriSetFromDoc = $assertionsDisabled;
        this.headElement = null;
        this.formElement = null;
        this.contextElement = null;
        this.formattingElements = new ArrayList<>();
        this.tmplInsertMode = new ArrayList<>();
        this.pendingTableCharacters = new ArrayList();
        this.emptyEnd = new Token.EndTag(this);
        this.framesetOk = true;
        this.fosterInserts = $assertionsDisabled;
        this.fragmentParsing = $assertionsDisabled;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
    
        if (r1.equals("iframe") == false) goto L9;
     */
    @Override // org.jsoup.parser.TreeBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initialiseParseFragment(org.jsoup.nodes.Element r6) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.initialiseParseFragment(org.jsoup.nodes.Element):void");
    }

    public void insertCharacterNode(Token.Character character) {
        insertCharacterToElement(character, currentElement());
    }

    public void insertCharacterToElement(Token.Character character, Element element) {
        Node textNode;
        String normalName = element.normalName();
        String data = character.getData();
        if (character.isCData()) {
            textNode = new CDataNode(data);
        } else if (isContentForTagData(normalName)) {
            textNode = new DataNode(data);
        } else {
            textNode = new TextNode(data);
        }
        element.appendChild(textNode);
        onNodeInserted(textNode);
    }

    public void insertCommentNode(Token.Comment comment) {
        Comment comment2 = new Comment(comment.getData());
        currentElement().appendChild(comment2);
        onNodeInserted(comment2);
    }

    public Element insertElementFor(Token.StartTag startTag) {
        Element createElementFor = createElementFor(startTag, Parser.NamespaceHtml, $assertionsDisabled);
        doInsertElement(createElementFor, startTag);
        if (startTag.isSelfClosing()) {
            Tag tag = createElementFor.tag();
            if (tag.isKnownTag()) {
                if (!tag.isEmpty()) {
                    this.tokeniser.error("Tag [%s] cannot be self closing; not a void tag", tag.normalName());
                }
            } else {
                tag.setSelfClosing();
            }
            this.tokeniser.transition(TokeniserState.Data);
            this.tokeniser.emit(this.emptyEnd.reset().name(createElementFor.tagName()));
        }
        return createElementFor;
    }

    public Element insertEmptyElementFor(Token.StartTag startTag) {
        Element createElementFor = createElementFor(startTag, Parser.NamespaceHtml, $assertionsDisabled);
        doInsertElement(createElementFor, startTag);
        pop();
        return createElementFor;
    }

    public Element insertForeignElementFor(Token.StartTag startTag, String str) {
        Element createElementFor = createElementFor(startTag, str, true);
        doInsertElement(createElementFor, startTag);
        if (startTag.isSelfClosing()) {
            createElementFor.tag().setSelfClosing();
            pop();
        }
        return createElementFor;
    }

    public FormElement insertFormElement(Token.StartTag startTag, boolean z, boolean z2) {
        FormElement formElement = (FormElement) createElementFor(startTag, Parser.NamespaceHtml, $assertionsDisabled);
        if (z2) {
            if (!onStack("template")) {
                setFormElement(formElement);
            }
        } else {
            setFormElement(formElement);
        }
        doInsertElement(formElement, startTag);
        if (!z) {
            pop();
        }
        return formElement;
    }

    public void insertInFosterParent(Node node) {
        Element element;
        Element fromStack = getFromStack("table");
        boolean z = $assertionsDisabled;
        if (fromStack != null) {
            if (fromStack.parent() != null) {
                element = fromStack.parent();
                z = true;
            } else {
                element = aboveOnStack(fromStack);
            }
        } else {
            element = this.stack.get(0);
        }
        if (z) {
            Validate.notNull(fromStack);
            fromStack.before(node);
        } else {
            element.appendChild(node);
        }
    }

    public void insertMarkerToFormattingElements() {
        this.formattingElements.add(null);
    }

    public void insertOnStackAfter(Element element, Element element2) {
        boolean z;
        int lastIndexOf = this.stack.lastIndexOf(element);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = $assertionsDisabled;
        }
        Validate.isTrue(z);
        this.stack.add(lastIndexOf + 1, element2);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean isContentForTagData(String str) {
        if (!str.equals("script") && !str.equals("style")) {
            return $assertionsDisabled;
        }
        return true;
    }

    public boolean isFosterInserts() {
        return this.fosterInserts;
    }

    public boolean isFragmentParsing() {
        return this.fragmentParsing;
    }

    public boolean isInActiveFormattingElements(Element element) {
        return onStack(this.formattingElements, element);
    }

    public Element lastFormattingElement() {
        if (this.formattingElements.size() > 0) {
            return this.formattingElements.get(r1.size() - 1);
        }
        return null;
    }

    public void markInsertionMode() {
        this.originalState = this.state;
    }

    public void maybeSetBaseUri(Element element) {
        if (!this.baseUriSetFromDoc) {
            String absUrl = element.absUrl("href");
            if (absUrl.length() != 0) {
                this.baseUri = absUrl;
                this.baseUriSetFromDoc = true;
                this.doc.setBaseUri(absUrl);
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    public HtmlTreeBuilder newInstance() {
        return new HtmlTreeBuilder();
    }

    public boolean onStackNot(String[] strArr) {
        int i;
        int size = this.stack.size();
        int i2 = size - 1;
        if (i2 > 100) {
            i = size - 101;
        } else {
            i = 0;
        }
        while (i2 >= i) {
            if (!StringUtil.inSorted(this.stack.get(i2).normalName(), strArr)) {
                return true;
            }
            i2--;
        }
        return $assertionsDisabled;
    }

    public HtmlTreeBuilderState originalState() {
        return this.originalState;
    }

    public void popStackToClose(String... strArr) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element pop = pop();
            if (StringUtil.inSorted(pop.normalName(), strArr) && Parser.NamespaceHtml.equals(pop.tag().namespace())) {
                return;
            }
        }
    }

    public Element popStackToCloseAnyNamespace(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element pop = pop();
            if (pop.nameIs(str)) {
                return pop;
            }
        }
        return null;
    }

    public HtmlTreeBuilderState popTemplateMode() {
        if (this.tmplInsertMode.size() > 0) {
            return this.tmplInsertMode.remove(r1.size() - 1);
        }
        return null;
    }

    public int positionOfElement(Element element) {
        for (int i = 0; i < this.formattingElements.size(); i++) {
            if (element == this.formattingElements.get(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean process(Token token) {
        HtmlTreeBuilderState htmlTreeBuilderState;
        if (useCurrentOrForeignInsert(token)) {
            htmlTreeBuilderState = this.state;
        } else {
            htmlTreeBuilderState = HtmlTreeBuilderState.ForeignContent;
        }
        return htmlTreeBuilderState.process(token, this);
    }

    public void pushActiveFormattingElements(Element element) {
        checkActiveFormattingElements(element);
        this.formattingElements.add(element);
    }

    public void pushTemplateMode(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.tmplInsertMode.add(htmlTreeBuilderState);
    }

    public void pushWithBookmark(Element element, int i) {
        checkActiveFormattingElements(element);
        try {
            this.formattingElements.add(i, element);
        } catch (IndexOutOfBoundsException unused) {
            this.formattingElements.add(element);
        }
    }

    public void reconstructFormattingElements() {
        Element lastFormattingElement;
        if (this.stack.size() <= maxQueueDepth && (lastFormattingElement = lastFormattingElement()) != null && !onStack(lastFormattingElement)) {
            int size = this.formattingElements.size();
            int i = size - 12;
            if (i < 0) {
                i = 0;
            }
            boolean z = true;
            int i2 = size - 1;
            int i3 = i2;
            while (i3 != i) {
                i3--;
                lastFormattingElement = this.formattingElements.get(i3);
                if (lastFormattingElement == null || onStack(lastFormattingElement)) {
                    z = false;
                    break;
                }
            }
            while (true) {
                if (!z) {
                    i3++;
                    lastFormattingElement = this.formattingElements.get(i3);
                }
                Validate.notNull(lastFormattingElement);
                Element element = new Element(tagFor(lastFormattingElement.normalName(), this.settings), null, lastFormattingElement.attributes().clone());
                doInsertElement(element, null);
                this.formattingElements.set(i3, element);
                if (i3 != i2) {
                    z = false;
                } else {
                    return;
                }
            }
        }
    }

    public void removeFromActiveFormattingElements(Element element) {
        for (int size = this.formattingElements.size() - 1; size >= 0; size--) {
            if (this.formattingElements.get(size) == element) {
                this.formattingElements.remove(size);
                return;
            }
        }
    }

    public boolean removeFromStack(Element element) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            if (this.stack.get(size) == element) {
                this.stack.remove(size);
                onNodeClosed(element);
                return true;
            }
        }
        return $assertionsDisabled;
    }

    public Element removeLastFormattingElement() {
        int size = this.formattingElements.size();
        if (size > 0) {
            return this.formattingElements.remove(size - 1);
        }
        return null;
    }

    public void replaceActiveFormattingElement(Element element, Element element2) {
        replaceInQueue(this.formattingElements, element, element2);
    }

    public void replaceOnStack(Element element, Element element2) {
        replaceInQueue(this.stack, element, element2);
    }

    public void resetBody() {
        if (!onStack("body")) {
            this.stack.add(this.doc.body());
        }
        transition(HtmlTreeBuilderState.InBody);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0058. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x0116. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean resetInsertionMode() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode():boolean");
    }

    public void resetPendingTableCharacters() {
        this.pendingTableCharacters.clear();
    }

    public void setFormElement(FormElement formElement) {
        this.formElement = formElement;
    }

    public void setFosterInserts(boolean z) {
        this.fosterInserts = z;
    }

    public void setHeadElement(Element element) {
        this.headElement = element;
    }

    public HtmlTreeBuilderState state() {
        return this.state;
    }

    public int templateModeSize() {
        return this.tmplInsertMode.size();
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.currentToken + ", state=" + this.state + ", currentElement=" + currentElement() + AbstractJsonLexerKt.END_OBJ;
    }

    public void transition(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.state = htmlTreeBuilderState;
    }

    public boolean useCurrentOrForeignInsert(Token token) {
        if (this.stack.isEmpty()) {
            return true;
        }
        Element currentElement = currentElement();
        String namespace = currentElement.tag().namespace();
        if (Parser.NamespaceHtml.equals(namespace)) {
            return true;
        }
        if (isMathmlTextIntegration(currentElement) && ((token.isStartTag() && !"mglyph".equals(token.asStartTag().normalName) && !"malignmark".equals(token.asStartTag().normalName)) || token.isCharacter())) {
            return true;
        }
        if (Parser.NamespaceMathml.equals(namespace) && currentElement.nameIs("annotation-xml") && token.isStartTag() && "svg".equals(token.asStartTag().normalName)) {
            return true;
        }
        if (isHtmlIntegration(currentElement) && (token.isStartTag() || token.isCharacter())) {
            return true;
        }
        return token.isEOF();
    }

    public boolean framesetOk() {
        return this.framesetOk;
    }

    public boolean inScope(String str) {
        return inScope(str, null);
    }

    public boolean inScope(String str, String[] strArr) {
        return inSpecificScope(str, TagsSearchInScope, strArr);
    }

    public boolean process(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        return htmlTreeBuilderState.process(token, this);
    }

    public boolean onStack(String str) {
        if (getFromStack(str) != null) {
            return true;
        }
        return $assertionsDisabled;
    }

    public boolean onStack(Element element) {
        return onStack(this.stack, element);
    }

    public Element popStackToClose(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element pop = pop();
            if (pop.elementIs(str, Parser.NamespaceHtml)) {
                return pop;
            }
        }
        return null;
    }

    public void generateImpliedEndTags() {
        generateImpliedEndTags($assertionsDisabled);
    }

    public void generateImpliedEndTags(String str) {
        while (StringUtil.inSorted(currentElement().normalName(), TagSearchEndTags)) {
            if (str != null && currentElementIs(str)) {
                return;
            } else {
                pop();
            }
        }
    }

    private boolean inSpecificScope(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.specificScopeTarget;
        strArr3[0] = str;
        return inSpecificScope(strArr3, strArr, strArr2);
    }
}
