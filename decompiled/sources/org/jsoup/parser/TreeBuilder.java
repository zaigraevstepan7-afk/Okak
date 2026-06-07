package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SharedConstants;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Range;
import org.jsoup.parser.Token;
import org.jsoup.select.NodeVisitor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class TreeBuilder {
    String baseUri;
    Token currentToken;
    Document doc;
    private final Token.EndTag end = new Token.EndTag(this);
    NodeVisitor nodeListener;
    protected Parser parser;
    CharacterReader reader;
    Map<String, Tag> seenTags;
    ParseSettings settings;
    ArrayList<Element> stack;
    private Token.StartTag start;
    Tokeniser tokeniser;
    boolean trackSourceRange;

    private void trackNodePosition(Node node, boolean z) {
        String str;
        if (this.trackSourceRange) {
            Token token = this.currentToken;
            int startPos = token.startPos();
            int endPos = token.endPos();
            if (node instanceof Element) {
                Element element = (Element) node;
                if (token.isEOF()) {
                    if (element.endSourceRange().isTracked()) {
                        return;
                    } else {
                        startPos = this.reader.pos();
                    }
                } else if (!z) {
                }
                endPos = startPos;
            }
            Range range = new Range(new Range.Position(startPos, this.reader.lineNumber(startPos), this.reader.columnNumber(startPos)), new Range.Position(endPos, this.reader.lineNumber(endPos), this.reader.columnNumber(endPos)));
            Attributes attributes = node.attributes();
            if (z) {
                str = SharedConstants.RangeKey;
            } else {
                str = SharedConstants.EndRangeKey;
            }
            attributes.userData(str, range);
        }
    }

    public void completeParse() {
        CharacterReader characterReader = this.reader;
        if (characterReader == null) {
            return;
        }
        characterReader.close();
        this.reader = null;
        this.tokeniser = null;
        this.stack = null;
        this.seenTags = null;
    }

    public abstract List<Node> completeParseFragment();

    public Element currentElement() {
        int size = this.stack.size();
        if (size > 0) {
            return this.stack.get(size - 1);
        }
        return this.doc;
    }

    public boolean currentElementIs(String str) {
        Element currentElement;
        if (this.stack.size() == 0 || (currentElement = currentElement()) == null || !currentElement.normalName().equals(str) || !currentElement.tag().namespace().equals(Parser.NamespaceHtml)) {
            return false;
        }
        return true;
    }

    public String defaultNamespace() {
        return Parser.NamespaceHtml;
    }

    public abstract ParseSettings defaultSettings();

    public void error(String str, Object... objArr) {
        ParseErrorList errors = this.parser.getErrors();
        if (errors.canAddError()) {
            errors.add(new ParseError(this.reader, str, objArr));
        }
    }

    public void initialiseParse(Reader reader, String str, Parser parser) {
        boolean z;
        Validate.notNullParam(reader, "input");
        Validate.notNullParam(str, "baseUri");
        Validate.notNull(parser);
        Document document = new Document(parser.defaultNamespace(), str);
        this.doc = document;
        document.parser(parser);
        this.parser = parser;
        this.settings = parser.settings();
        this.reader = new CharacterReader(reader);
        this.trackSourceRange = parser.isTrackPosition();
        CharacterReader characterReader = this.reader;
        if (!parser.isTrackErrors() && !this.trackSourceRange) {
            z = false;
        } else {
            z = true;
        }
        characterReader.trackNewlines(z);
        this.tokeniser = new Tokeniser(this);
        this.stack = new ArrayList<>(32);
        this.seenTags = new HashMap();
        Token.StartTag startTag = new Token.StartTag(this);
        this.start = startTag;
        this.currentToken = startTag;
        this.baseUri = str;
        onNodeInserted(this.doc);
    }

    public boolean isContentForTagData(String str) {
        return false;
    }

    public abstract TreeBuilder newInstance();

    public void nodeListener(NodeVisitor nodeVisitor) {
        this.nodeListener = nodeVisitor;
    }

    public void onNodeClosed(Node node) {
        trackNodePosition(node, false);
        NodeVisitor nodeVisitor = this.nodeListener;
        if (nodeVisitor != null) {
            nodeVisitor.tail(node, this.stack.size());
        }
    }

    public void onNodeInserted(Node node) {
        trackNodePosition(node, true);
        NodeVisitor nodeVisitor = this.nodeListener;
        if (nodeVisitor != null) {
            nodeVisitor.mo125head(node, this.stack.size());
        }
    }

    public Document parse(Reader reader, String str, Parser parser) {
        initialiseParse(reader, str, parser);
        runParser();
        return this.doc;
    }

    public List<Node> parseFragment(String str, Element element, String str2, Parser parser) {
        initialiseParse(new StringReader(str), str2, parser);
        initialiseParseFragment(element);
        runParser();
        return completeParseFragment();
    }

    public final Element pop() {
        Element remove = this.stack.remove(this.stack.size() - 1);
        onNodeClosed(remove);
        return remove;
    }

    public abstract boolean process(Token token);

    public boolean processEndTag(String str) {
        Token token = this.currentToken;
        Token.EndTag endTag = this.end;
        if (token == endTag) {
            return process(new Token.EndTag(this).name(str));
        }
        return process(endTag.reset().name(str));
    }

    public boolean processStartTag(String str) {
        Token.StartTag startTag = this.start;
        if (this.currentToken == startTag) {
            return process(new Token.StartTag(this).name(str));
        }
        return process(startTag.reset().name(str));
    }

    public final void push(Element element) {
        this.stack.add(element);
        onNodeInserted(element);
    }

    public void runParser() {
        do {
        } while (stepParser());
        completeParse();
    }

    public boolean stepParser() {
        if (this.currentToken.type == Token.TokenType.EOF) {
            ArrayList<Element> arrayList = this.stack;
            if (arrayList == null) {
                return false;
            }
            if (arrayList.isEmpty()) {
                onNodeClosed(this.doc);
                this.stack = null;
                return true;
            }
            pop();
            return true;
        }
        Token read = this.tokeniser.read();
        this.currentToken = read;
        process(read);
        read.reset();
        return true;
    }

    public Tag tagFor(String str, String str2, ParseSettings parseSettings) {
        Tag tag = this.seenTags.get(str);
        if (tag != null && tag.namespace().equals(str2)) {
            return tag;
        }
        Tag valueOf = Tag.valueOf(str, str2, parseSettings);
        this.seenTags.put(str, valueOf);
        return valueOf;
    }

    public void error(String str) {
        error(str, null);
    }

    public void initialiseParseFragment(Element element) {
    }

    public Tag tagFor(String str, ParseSettings parseSettings) {
        return tagFor(str, defaultNamespace(), parseSettings);
    }

    public boolean processStartTag(String str, Attributes attributes) {
        Token.StartTag startTag = this.start;
        if (this.currentToken == startTag) {
            return process(new Token.StartTag(this).nameAttr(str, attributes));
        }
        startTag.reset();
        startTag.nameAttr(str, attributes);
        return process(startTag);
    }

    public boolean currentElementIs(String str, String str2) {
        Element currentElement;
        return this.stack.size() != 0 && (currentElement = currentElement()) != null && currentElement.normalName().equals(str) && currentElement.tag().namespace().equals(str2);
    }
}
