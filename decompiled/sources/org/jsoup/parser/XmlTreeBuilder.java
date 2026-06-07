package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Token;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class XmlTreeBuilder extends TreeBuilder {
    private static final int maxQueueDepth = 256;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: org.jsoup.parser.XmlTreeBuilder$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jsoup$parser$Token$TokenType;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            $SwitchMap$org$jsoup$parser$Token$TokenType = iArr;
            try {
                iArr[Token.TokenType.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    public List<Node> completeParseFragment() {
        return this.doc.childNodes();
    }

    @Override // org.jsoup.parser.TreeBuilder
    public String defaultNamespace() {
        return Parser.NamespaceXml;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public ParseSettings defaultSettings() {
        return ParseSettings.preserveCase;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void initialiseParse(Reader reader, String str, Parser parser) {
        super.initialiseParse(reader, str, parser);
        this.doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml).escapeMode(Entities.EscapeMode.xhtml).prettyPrint(false);
    }

    public void insertCharacterFor(Token.Character character) {
        LeafNode textNode;
        String data = character.getData();
        if (character.isCData()) {
            textNode = new CDataNode(data);
        } else {
            textNode = new TextNode(data);
        }
        insertLeafNode(textNode);
    }

    public void insertCommentFor(Token.Comment comment) {
        XmlDeclaration asXmlDeclaration;
        Comment comment2 = new Comment(comment.getData());
        if (comment.bogus && comment2.isXmlDeclaration() && (asXmlDeclaration = comment2.asXmlDeclaration()) != null) {
            comment2 = asXmlDeclaration;
        }
        insertLeafNode(comment2);
    }

    public void insertDoctypeFor(Token.Doctype doctype) {
        DocumentType documentType = new DocumentType(this.settings.normalizeTag(doctype.getName()), doctype.getPublicIdentifier(), doctype.getSystemIdentifier());
        documentType.setPubSysKey(doctype.getPubSysKey());
        insertLeafNode(documentType);
    }

    public void insertElementFor(Token.StartTag startTag) {
        Tag tagFor = tagFor(startTag.name(), this.settings);
        Attributes attributes = startTag.attributes;
        if (attributes != null) {
            attributes.deduplicate(this.settings);
        }
        Element element = new Element(tagFor, null, this.settings.normalizeAttributes(startTag.attributes));
        currentElement().appendChild(element);
        push(element);
        if (startTag.isSelfClosing()) {
            tagFor.setSelfClosing();
            pop();
        }
    }

    public void insertLeafNode(LeafNode leafNode) {
        currentElement().appendChild(leafNode);
        onNodeInserted(leafNode);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public XmlTreeBuilder newInstance() {
        return new XmlTreeBuilder();
    }

    public Document parse(String str, String str2) {
        return parse(new StringReader(str), str2, new Parser(this));
    }

    public void popStackToClose(Token.EndTag endTag) {
        Element element;
        String normalizeTag = this.settings.normalizeTag(endTag.tagName);
        int size = this.stack.size();
        int i = size - 1 >= maxQueueDepth ? size - 257 : 0;
        int size2 = this.stack.size() - 1;
        while (true) {
            if (size2 >= i) {
                element = this.stack.get(size2);
                if (element.nodeName().equals(normalizeTag)) {
                    break;
                } else {
                    size2--;
                }
            } else {
                element = null;
                break;
            }
        }
        if (element != null) {
            for (int size3 = this.stack.size() - 1; size3 >= 0 && pop() != element; size3--) {
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean process(Token token) {
        this.currentToken = token;
        switch (AnonymousClass1.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
            case 1:
                insertElementFor(token.asStartTag());
                return true;
            case 2:
                popStackToClose(token.asEndTag());
                return true;
            case 3:
                insertCommentFor(token.asComment());
                return true;
            case 4:
                insertCharacterFor(token.asCharacter());
                return true;
            case 5:
                insertDoctypeFor(token.asDoctype());
                return true;
            case 6:
                return true;
            default:
                Validate.fail("Unexpected token type: " + token.type);
                return true;
        }
    }

    public Document parse(Reader reader, String str) {
        return parse(reader, str, new Parser(this));
    }
}
