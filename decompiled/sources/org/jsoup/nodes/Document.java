package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Document extends Element {
    private static final Evaluator titleEval = new Evaluator.Tag("title");
    private Connection connection;
    private final String location;
    private OutputSettings outputSettings;
    private Parser parser;
    private QuirksMode quirksMode;
    private boolean updateMetaCharset;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str, String str2) {
        super(Tag.valueOf("#root", str, ParseSettings.htmlDefault), str2);
        this.outputSettings = new OutputSettings();
        this.quirksMode = QuirksMode.noQuirks;
        this.updateMetaCharset = false;
        this.location = str2;
        this.parser = Parser.htmlParser();
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        Element appendElement = document.appendElement("html");
        appendElement.appendElement("head");
        appendElement.appendElement("body");
        return document;
    }

    private void ensureMetaCharsetElement() {
        if (this.updateMetaCharset) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element selectFirst = selectFirst("meta[charset]");
                if (selectFirst != null) {
                    selectFirst.attr("charset", charset().displayName());
                } else {
                    head().appendElement("meta").attr("charset", charset().displayName());
                }
                select("meta[name=charset]").remove();
                return;
            }
            if (syntax == OutputSettings.Syntax.xml) {
                Node node = ensureChildNodes().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration xmlDeclaration = (XmlDeclaration) node;
                    if (xmlDeclaration.name().equals("xml")) {
                        xmlDeclaration.attr("encoding", charset().displayName());
                        if (xmlDeclaration.hasAttr("version")) {
                            xmlDeclaration.attr("version", "1.0");
                            return;
                        }
                        return;
                    }
                    XmlDeclaration xmlDeclaration2 = new XmlDeclaration("xml", false);
                    xmlDeclaration2.attr("version", "1.0");
                    xmlDeclaration2.attr("encoding", charset().displayName());
                    prependChild(xmlDeclaration2);
                    return;
                }
                XmlDeclaration xmlDeclaration3 = new XmlDeclaration("xml", false);
                xmlDeclaration3.attr("version", "1.0");
                xmlDeclaration3.attr("encoding", charset().displayName());
                prependChild(xmlDeclaration3);
            }
        }
    }

    private Element htmlEl() {
        for (Element firstElementChild = firstElementChild(); firstElementChild != null; firstElementChild = firstElementChild.nextElementSibling()) {
            if (firstElementChild.nameIs("html")) {
                return firstElementChild;
            }
        }
        return appendElement("html");
    }

    public Element body() {
        Element htmlEl = htmlEl();
        for (Element firstElementChild = htmlEl.firstElementChild(); firstElementChild != null; firstElementChild = firstElementChild.nextElementSibling()) {
            if (firstElementChild.nameIs("body") || firstElementChild.nameIs("frameset")) {
                return firstElementChild;
            }
        }
        return htmlEl.appendElement("body");
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.outputSettings.charset(charset);
        ensureMetaCharsetElement();
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Document mo283clone() {
        Document document = (Document) super.mo283clone();
        document.outputSettings = this.outputSettings.clone();
        return document;
    }

    public Connection connection() {
        Connection connection = this.connection;
        if (connection == null) {
            return Jsoup.newSession();
        }
        return connection;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str, this.parser.defaultNamespace(), ParseSettings.preserveCase), baseUri());
    }

    public DocumentType documentType() {
        for (Node node : this.childNodes) {
            if (node instanceof DocumentType) {
                return (DocumentType) node;
            }
            if (!(node instanceof LeafNode)) {
                return null;
            }
        }
        return null;
    }

    public FormElement expectForm(String str) {
        Iterator<Element> it = select(str).iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next instanceof FormElement) {
                return (FormElement) next;
            }
        }
        Validate.fail("No form elements matched the query '%s' in the document.", str);
        return null;
    }

    public List<FormElement> forms() {
        return select("form").forms();
    }

    public Element head() {
        Element htmlEl = htmlEl();
        for (Element firstElementChild = htmlEl.firstElementChild(); firstElementChild != null; firstElementChild = firstElementChild.nextElementSibling()) {
            if (firstElementChild.nameIs("head")) {
                return firstElementChild;
            }
        }
        return htmlEl.prependElement("head");
    }

    public String location() {
        return this.location;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public String nodeName() {
        return "#document";
    }

    @Override // org.jsoup.nodes.Node
    public String outerHtml() {
        return super.html();
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public Parser parser() {
        return this.parser;
    }

    public QuirksMode quirksMode() {
        return this.quirksMode;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public Document shallowClone() {
        Document document = new Document(tag().namespace(), baseUri());
        Attributes attributes = this.attributes;
        if (attributes != null) {
            document.attributes = attributes.clone();
        }
        document.outputSettings = this.outputSettings.clone();
        return document;
    }

    @Override // org.jsoup.nodes.Element
    public Element text(String str) {
        body().text(str);
        return this;
    }

    public void title(String str) {
        Validate.notNull(str);
        Element selectFirst = head().selectFirst(titleEval);
        if (selectFirst == null) {
            selectFirst = head().appendElement("title");
        }
        selectFirst.text(str);
    }

    public void updateMetaCharsetElement(boolean z) {
        this.updateMetaCharset = z;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class OutputSettings implements Cloneable {
        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        private Charset charset = DataUtil.UTF_8;
        private boolean prettyPrint = true;
        private boolean outline = false;
        private int indentAmount = 1;
        private int maxPaddingWidth = 30;
        private Syntax syntax = Syntax.html;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum Syntax {
            html,
            xml
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.charset.name());
                outputSettings.escapeMode = Entities.EscapeMode.valueOf(this.escapeMode.name());
                return outputSettings;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public Entities.EscapeMode escapeMode() {
            return this.escapeMode;
        }

        public OutputSettings indentAmount(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Validate.isTrue(z);
            this.indentAmount = i;
            return this;
        }

        public OutputSettings maxPaddingWidth(int i) {
            boolean z;
            if (i >= -1) {
                z = true;
            } else {
                z = false;
            }
            Validate.isTrue(z);
            this.maxPaddingWidth = i;
            return this;
        }

        public boolean outline() {
            return this.outline;
        }

        public boolean prettyPrint() {
            return this.prettyPrint;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.syntax = syntax;
            if (syntax == Syntax.xml) {
                escapeMode(Entities.EscapeMode.xhtml);
            }
            return this;
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.escapeMode = escapeMode;
            return this;
        }

        public OutputSettings outline(boolean z) {
            this.outline = z;
            return this;
        }

        public OutputSettings prettyPrint(boolean z) {
            this.prettyPrint = z;
            return this;
        }

        public OutputSettings charset(Charset charset) {
            this.charset = charset;
            return this;
        }

        public Charset charset() {
            return this.charset;
        }

        public int indentAmount() {
            return this.indentAmount;
        }

        public int maxPaddingWidth() {
            return this.maxPaddingWidth;
        }

        public Syntax syntax() {
            return this.syntax;
        }
    }

    public Document parser(Parser parser) {
        this.parser = parser;
        return this;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }

    public boolean updateMetaCharsetElement() {
        return this.updateMetaCharset;
    }

    public OutputSettings outputSettings() {
        return this.outputSettings;
    }

    public Document connection(Connection connection) {
        Validate.notNull(connection);
        this.connection = connection;
        return this;
    }

    public Charset charset() {
        return this.outputSettings.charset();
    }

    public String title() {
        Element selectFirst = head().selectFirst(titleEval);
        return selectFirst != null ? StringUtil.normaliseWhitespace(selectFirst.text()).trim() : "";
    }

    public Document(String str) {
        this(Parser.NamespaceHtml, str);
    }
}
