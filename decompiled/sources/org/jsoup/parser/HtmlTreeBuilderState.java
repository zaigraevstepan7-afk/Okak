package org.jsoup.parser;

import com.google.protobuf.DescriptorProtos;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Range;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            } else if (token.isDoctype()) {
                Token.Doctype asDoctype = token.asDoctype();
                DocumentType documentType = new DocumentType(htmlTreeBuilder.settings.normalizeTag(asDoctype.getName()), asDoctype.getPublicIdentifier(), asDoctype.getSystemIdentifier());
                documentType.setPubSysKey(asDoctype.getPubSysKey());
                htmlTreeBuilder.getDocument().appendChild(documentType);
                htmlTreeBuilder.onNodeInserted(documentType);
                if (asDoctype.isForceQuirks() || !documentType.name().equals("html") || documentType.publicId().equalsIgnoreCase("HTML")) {
                    htmlTreeBuilder.getDocument().quirksMode(Document.QuirksMode.quirks);
                }
                htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
            } else {
                htmlTreeBuilder.getDocument().quirksMode(Document.QuirksMode.quirks);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
                return htmlTreeBuilder.process(token);
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.processStartTag("html");
            htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                htmlTreeBuilder.insertElementFor(token.asStartTag());
                htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
                return true;
            }
            if (token.isEndTag() && StringUtil.inSorted(token.asEndTag().normalName(), Constants.BeforeHtmlToHead)) {
                return anythingElse(token, htmlTreeBuilder);
            }
            if (token.isEndTag()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            return anythingElse(token, htmlTreeBuilder);
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return HtmlTreeBuilderState.InBody.process(token, htmlTreeBuilder);
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("head")) {
                htmlTreeBuilder.setHeadElement(htmlTreeBuilder.insertElementFor(token.asStartTag()));
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (token.isEndTag() && StringUtil.inSorted(token.asEndTag().normalName(), Constants.BeforeHtmlToHead)) {
                htmlTreeBuilder.processStartTag("head");
                return htmlTreeBuilder.process(token);
            }
            if (token.isEndTag()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.processStartTag("head");
            return htmlTreeBuilder.process(token);
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        private boolean anythingElse(Token token, TreeBuilder treeBuilder) {
            treeBuilder.processEndTag("head");
            return treeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            int i = AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        String normalName = token.asEndTag().normalName();
                        if (normalName.equals("head")) {
                            htmlTreeBuilder.pop();
                            htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterHead);
                        } else {
                            if (StringUtil.inSorted(normalName, Constants.InHeadEnd)) {
                                return anythingElse(token, htmlTreeBuilder);
                            }
                            if (normalName.equals("template")) {
                                if (!htmlTreeBuilder.onStack(normalName)) {
                                    htmlTreeBuilder.error(this);
                                } else {
                                    htmlTreeBuilder.generateImpliedEndTags(true);
                                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                                        htmlTreeBuilder.error(this);
                                    }
                                    htmlTreeBuilder.popStackToClose(normalName);
                                    htmlTreeBuilder.clearFormattingElementsToLastMarker();
                                    htmlTreeBuilder.popTemplateMode();
                                    htmlTreeBuilder.resetInsertionMode();
                                }
                            } else {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                        }
                    } else {
                        Token.StartTag asStartTag = token.asStartTag();
                        String normalName2 = asStartTag.normalName();
                        if (normalName2.equals("html")) {
                            return HtmlTreeBuilderState.InBody.process(token, htmlTreeBuilder);
                        }
                        if (StringUtil.inSorted(normalName2, Constants.InHeadEmpty)) {
                            Element insertEmptyElementFor = htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                            if (normalName2.equals("base") && insertEmptyElementFor.hasAttr("href")) {
                                htmlTreeBuilder.maybeSetBaseUri(insertEmptyElementFor);
                            }
                        } else if (normalName2.equals("meta")) {
                            htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                        } else if (normalName2.equals("title")) {
                            HtmlTreeBuilderState.handleRcData(asStartTag, htmlTreeBuilder);
                        } else if (StringUtil.inSorted(normalName2, Constants.InHeadRaw)) {
                            HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                        } else if (normalName2.equals("noscript")) {
                            htmlTreeBuilder.insertElementFor(asStartTag);
                            htmlTreeBuilder.transition(HtmlTreeBuilderState.InHeadNoscript);
                        } else if (normalName2.equals("script")) {
                            htmlTreeBuilder.tokeniser.transition(TokeniserState.ScriptData);
                            htmlTreeBuilder.markInsertionMode();
                            htmlTreeBuilder.transition(HtmlTreeBuilderState.Text);
                            htmlTreeBuilder.insertElementFor(asStartTag);
                        } else {
                            if (normalName2.equals("head")) {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            if (normalName2.equals("template")) {
                                htmlTreeBuilder.insertElementFor(asStartTag);
                                htmlTreeBuilder.insertMarkerToFormattingElements();
                                htmlTreeBuilder.framesetOk(false);
                                HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTemplate;
                                htmlTreeBuilder.transition(htmlTreeBuilderState);
                                htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState);
                            } else {
                                return anythingElse(token, htmlTreeBuilder);
                            }
                        }
                    }
                } else {
                    htmlTreeBuilder.error(this);
                    return false;
                }
            } else {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            }
            return true;
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.insertCharacterNode(new Token.Character().data(token.toString()));
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return true;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEndTag() && token.asEndTag().normalName().equals("noscript")) {
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (!HtmlTreeBuilderState.isWhitespace(token) && !token.isComment() && (!token.isStartTag() || !StringUtil.inSorted(token.asStartTag().normalName(), Constants.InHeadNoScriptHead))) {
                if (token.isEndTag() && token.asEndTag().normalName().equals("br")) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                if ((token.isStartTag() && StringUtil.inSorted(token.asStartTag().normalName(), Constants.InHeadNoscriptIgnore)) || token.isEndTag()) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                return anythingElse(token, htmlTreeBuilder);
            }
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.processStartTag("body");
            htmlTreeBuilder.framesetOk(true);
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return true;
            }
            if (token.isStartTag()) {
                Token.StartTag asStartTag = token.asStartTag();
                String normalName = asStartTag.normalName();
                if (normalName.equals("html")) {
                    return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                }
                if (normalName.equals("body")) {
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InBody);
                    return true;
                }
                if (normalName.equals("frameset")) {
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InFrameset);
                    return true;
                }
                if (StringUtil.inSorted(normalName, Constants.InBodyStartToHead)) {
                    htmlTreeBuilder.error(this);
                    Element headElement = htmlTreeBuilder.getHeadElement();
                    htmlTreeBuilder.push(headElement);
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    htmlTreeBuilder.removeFromStack(headElement);
                    return true;
                }
                if (normalName.equals("head")) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                anythingElse(token, htmlTreeBuilder);
                return true;
            }
            if (token.isEndTag()) {
                String normalName2 = token.asEndTag().normalName();
                if (StringUtil.inSorted(normalName2, Constants.AfterHeadBody)) {
                    anythingElse(token, htmlTreeBuilder);
                    return true;
                }
                if (normalName2.equals("template")) {
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    return true;
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            anythingElse(token, htmlTreeBuilder);
            return true;
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        private static final int MaxStackScan = 24;

        private boolean inBodyEndTag(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Token.EndTag asEndTag = token.asEndTag();
            String normalName = asEndTag.normalName();
            normalName.getClass();
            char c = 65535;
            switch (normalName.hashCode()) {
                case -1321546630:
                    if (normalName.equals("template")) {
                        c = 0;
                        break;
                    }
                    break;
                case 112:
                    if (normalName.equals("p")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3152:
                    if (normalName.equals("br")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3200:
                    if (normalName.equals("dd")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3216:
                    if (normalName.equals("dt")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3273:
                    if (normalName.equals("h1")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3274:
                    if (normalName.equals("h2")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3275:
                    if (normalName.equals("h3")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3276:
                    if (normalName.equals("h4")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3277:
                    if (normalName.equals("h5")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3278:
                    if (normalName.equals("h6")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3453:
                    if (normalName.equals("li")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3029410:
                    if (normalName.equals("body")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3148996:
                    if (normalName.equals("form")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 3213227:
                    if (normalName.equals("html")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3536714:
                    if (normalName.equals("span")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1869063452:
                    if (normalName.equals("sarcasm")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    return true;
                case 1:
                    if (!htmlTreeBuilder.inButtonScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processStartTag(normalName);
                        return htmlTreeBuilder.process(asEndTag);
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(normalName);
                    return true;
                case 2:
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.processStartTag("br");
                    return false;
                case 3:
                case 4:
                    if (!htmlTreeBuilder.inScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(normalName);
                    return true;
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                    String[] strArr = Constants.Headings;
                    if (!htmlTreeBuilder.inScope(strArr)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(strArr);
                    return true;
                case 11:
                    if (!htmlTreeBuilder.inListItemScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags(normalName);
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(normalName);
                    return true;
                case '\f':
                    if (!htmlTreeBuilder.inScope("body")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.onStackNot(Constants.InBodyEndOtherErrors)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.onNodeClosed(htmlTreeBuilder.getFromStack("body"));
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterBody);
                    return true;
                case '\r':
                    if (!htmlTreeBuilder.onStack("template")) {
                        FormElement formElement = htmlTreeBuilder.getFormElement();
                        htmlTreeBuilder.setFormElement(null);
                        if (formElement != null && htmlTreeBuilder.inScope(normalName)) {
                            htmlTreeBuilder.generateImpliedEndTags();
                            if (!htmlTreeBuilder.currentElementIs(normalName)) {
                                htmlTreeBuilder.error(this);
                            }
                            htmlTreeBuilder.removeFromStack(formElement);
                        } else {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                    } else {
                        if (!htmlTreeBuilder.inScope(normalName)) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.generateImpliedEndTags();
                        if (!htmlTreeBuilder.currentElementIs(normalName)) {
                            htmlTreeBuilder.error(this);
                        }
                        htmlTreeBuilder.popStackToClose(normalName);
                    }
                    return true;
                case 14:
                    if (!htmlTreeBuilder.onStack("body")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.onStackNot(Constants.InBodyEndOtherErrors)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterBody);
                    return htmlTreeBuilder.process(token);
                case 15:
                case 16:
                    return anyOtherEndTag(token, htmlTreeBuilder);
                default:
                    if (StringUtil.inSorted(normalName, Constants.InBodyEndAdoptionFormatters)) {
                        return inBodyEndTagAdoption(token, htmlTreeBuilder);
                    }
                    if (StringUtil.inSorted(normalName, Constants.InBodyEndClosers)) {
                        if (!htmlTreeBuilder.inScope(normalName)) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.generateImpliedEndTags();
                        if (!htmlTreeBuilder.currentElementIs(normalName)) {
                            htmlTreeBuilder.error(this);
                        }
                        htmlTreeBuilder.popStackToClose(normalName);
                    } else if (StringUtil.inSorted(normalName, Constants.InBodyStartApplets)) {
                        if (!htmlTreeBuilder.inScope("name")) {
                            if (!htmlTreeBuilder.inScope(normalName)) {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            htmlTreeBuilder.generateImpliedEndTags();
                            if (!htmlTreeBuilder.currentElementIs(normalName)) {
                                htmlTreeBuilder.error(this);
                            }
                            htmlTreeBuilder.popStackToClose(normalName);
                            htmlTreeBuilder.clearFormattingElementsToLastMarker();
                        }
                    } else {
                        return anyOtherEndTag(token, htmlTreeBuilder);
                    }
                    return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6, types: [int] */
        private boolean inBodyEndTagAdoption(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            String normalName = token.asEndTag().normalName();
            ArrayList<Element> stack = htmlTreeBuilder.getStack();
            boolean z = false;
            int i = 0;
            while (i < 8) {
                Element activeFormattingElement = htmlTreeBuilder.getActiveFormattingElement(normalName);
                if (activeFormattingElement == null) {
                    return anyOtherEndTag(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.onStack(activeFormattingElement)) {
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.removeFromActiveFormattingElements(activeFormattingElement);
                    return true;
                }
                if (!htmlTreeBuilder.inScope(activeFormattingElement.normalName())) {
                    htmlTreeBuilder.error(this);
                    return z;
                }
                if (htmlTreeBuilder.currentElement() != activeFormattingElement) {
                    htmlTreeBuilder.error(this);
                }
                int size = stack.size();
                Element element = null;
                int i2 = -1;
                boolean z2 = z;
                int i3 = 1;
                Element element2 = null;
                while (true) {
                    if (i3 >= size || i3 >= 64) {
                        break;
                    }
                    Element element3 = stack.get(i3);
                    if (element3 == activeFormattingElement) {
                        element2 = stack.get(i3 - 1);
                        i2 = htmlTreeBuilder.positionOfElement(element3);
                        z2 = true;
                    } else if (z2 && HtmlTreeBuilder.isSpecial(element3)) {
                        element = element3;
                        break;
                    }
                    i3++;
                }
                if (element == null) {
                    htmlTreeBuilder.popStackToClose(activeFormattingElement.normalName());
                    htmlTreeBuilder.removeFromActiveFormattingElements(activeFormattingElement);
                    return true;
                }
                Element element4 = element;
                Element element5 = element4;
                for (?? r8 = z; r8 < 3; r8++) {
                    if (htmlTreeBuilder.onStack(element4)) {
                        element4 = htmlTreeBuilder.aboveOnStack(element4);
                    }
                    if (!htmlTreeBuilder.isInActiveFormattingElements(element4)) {
                        htmlTreeBuilder.removeFromStack(element4);
                    } else {
                        if (element4 == activeFormattingElement) {
                            break;
                        }
                        Element element6 = new Element(htmlTreeBuilder.tagFor(element4.nodeName(), ParseSettings.preserveCase), htmlTreeBuilder.getBaseUri());
                        htmlTreeBuilder.replaceActiveFormattingElement(element4, element6);
                        htmlTreeBuilder.replaceOnStack(element4, element6);
                        if (element5 == element) {
                            i2 = htmlTreeBuilder.positionOfElement(element6) + 1;
                        }
                        if (element5.parent() != null) {
                            element5.remove();
                        }
                        element6.appendChild(element5);
                        element4 = element6;
                        element5 = element4;
                    }
                }
                if (element2 != null) {
                    if (StringUtil.inSorted(element2.normalName(), Constants.InBodyEndTableFosters)) {
                        if (element5.parent() != null) {
                            element5.remove();
                        }
                        htmlTreeBuilder.insertInFosterParent(element5);
                    } else {
                        if (element5.parent() != null) {
                            element5.remove();
                        }
                        element2.appendChild(element5);
                    }
                }
                Element element7 = new Element(activeFormattingElement.tag(), htmlTreeBuilder.getBaseUri());
                element7.attributes().addAll(activeFormattingElement.attributes());
                element7.appendChildren(element.childNodes());
                element.appendChild(element7);
                htmlTreeBuilder.removeFromActiveFormattingElements(activeFormattingElement);
                htmlTreeBuilder.pushWithBookmark(element7, i2);
                htmlTreeBuilder.removeFromStack(activeFormattingElement);
                htmlTreeBuilder.insertOnStackAfter(element, element7);
                i++;
                z = false;
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private boolean inBodyStartTag(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            char c;
            char c2;
            int i;
            String str;
            FormElement formElement;
            Token.StartTag asStartTag = token.asStartTag();
            String normalName = asStartTag.normalName();
            normalName.getClass();
            switch (normalName.hashCode()) {
                case -1644953643:
                    if (normalName.equals("frameset")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1377687758:
                    if (normalName.equals("button")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1191214428:
                    if (normalName.equals("iframe")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1134665583:
                    if (normalName.equals("keygen")) {
                        c2 = 3;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1010136971:
                    if (normalName.equals("option")) {
                        c2 = 4;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1003243718:
                    if (normalName.equals("textarea")) {
                        c2 = 5;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -906021636:
                    if (normalName.equals("select")) {
                        c2 = 6;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -891985998:
                    if (normalName.equals("strike")) {
                        c2 = 7;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -891980137:
                    if (normalName.equals("strong")) {
                        c2 = '\b';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case -80773204:
                    if (normalName.equals("optgroup")) {
                        c2 = '\t';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 97:
                    if (normalName.equals("a")) {
                        c2 = '\n';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 98:
                    if (normalName.equals("b")) {
                        c2 = 11;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 105:
                    if (normalName.equals("i")) {
                        c2 = '\f';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (normalName.equals("s")) {
                        c2 = '\r';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 117:
                    if (normalName.equals("u")) {
                        c2 = 14;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3152:
                    if (normalName.equals("br")) {
                        c2 = 15;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3200:
                    if (normalName.equals("dd")) {
                        c2 = 16;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3216:
                    if (normalName.equals("dt")) {
                        c2 = 17;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3240:
                    if (normalName.equals("em")) {
                        c2 = 18;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3273:
                    if (normalName.equals("h1")) {
                        c2 = 19;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3274:
                    if (normalName.equals("h2")) {
                        c2 = 20;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3275:
                    if (normalName.equals("h3")) {
                        c2 = 21;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3276:
                    if (normalName.equals("h4")) {
                        c2 = 22;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3277:
                    if (normalName.equals("h5")) {
                        c2 = 23;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3278:
                    if (normalName.equals("h6")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 3338:
                    if (normalName.equals("hr")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 3453:
                    if (normalName.equals("li")) {
                        c2 = 26;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3632:
                    if (normalName.equals("rb")) {
                        c2 = 27;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3646:
                    if (normalName.equals("rp")) {
                        c2 = 28;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3650:
                    if (normalName.equals("rt")) {
                        c2 = 29;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3712:
                    if (normalName.equals("tt")) {
                        c2 = 30;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 97536:
                    if (normalName.equals("big")) {
                        c2 = 31;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104387:
                    if (normalName.equals("img")) {
                        c2 = ' ';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111267:
                    if (normalName.equals("pre")) {
                        c2 = '!';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 113249:
                    if (normalName.equals("rtc")) {
                        c2 = AbstractJsonLexerKt.STRING;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 114276:
                    if (normalName.equals("svg")) {
                        c2 = '#';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 117511:
                    if (normalName.equals("wbr")) {
                        c2 = '$';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 118811:
                    if (normalName.equals("xmp")) {
                        c2 = '%';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3002509:
                    if (normalName.equals("area")) {
                        c2 = '&';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029410:
                    if (normalName.equals("body")) {
                        c2 = '\'';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3059181:
                    if (normalName.equals("code")) {
                        c2 = '(';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3148879:
                    if (normalName.equals("font")) {
                        c2 = ')';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3148996:
                    if (normalName.equals("form")) {
                        c2 = '*';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3213227:
                    if (normalName.equals("html")) {
                        c2 = '+';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3344136:
                    if (normalName.equals("math")) {
                        c2 = AbstractJsonLexerKt.COMMA;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3386833:
                    if (normalName.equals("nobr")) {
                        c2 = '-';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536714:
                    if (normalName.equals("span")) {
                        c2 = '.';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 96620249:
                    if (normalName.equals("embed")) {
                        c2 = '/';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 100313435:
                    if (normalName.equals("image")) {
                        c2 = '0';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 100358090:
                    if (normalName.equals("input")) {
                        c2 = '1';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109548807:
                    if (normalName.equals("small")) {
                        c2 = '2';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 110115790:
                    if (normalName.equals("table")) {
                        c2 = '3';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 181975684:
                    if (normalName.equals("listing")) {
                        c2 = '4';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1973234167:
                    if (normalName.equals("plaintext")) {
                        c2 = '5';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2091304424:
                    if (normalName.equals("isindex")) {
                        c2 = '6';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2115613112:
                    if (normalName.equals("noembed")) {
                        c2 = '7';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    htmlTreeBuilder.error(this);
                    ArrayList<Element> stack = htmlTreeBuilder.getStack();
                    if (stack.size() != 1) {
                        if ((stack.size() > 2 && !stack.get(1).nameIs("body")) || !htmlTreeBuilder.framesetOk()) {
                            return false;
                        }
                        Element element = stack.get(1);
                        if (element.parent() != null) {
                            element.remove();
                        }
                        while (stack.size() > 1) {
                            stack.remove(stack.size() - 1);
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.InFrameset);
                        return true;
                    }
                    return false;
                case 1:
                    if (htmlTreeBuilder.inButtonScope("button")) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processEndTag("button");
                        htmlTreeBuilder.process(asStartTag);
                    } else {
                        htmlTreeBuilder.reconstructFormattingElements();
                        htmlTreeBuilder.insertElementFor(asStartTag);
                        htmlTreeBuilder.framesetOk(false);
                    }
                    return true;
                case 2:
                    htmlTreeBuilder.framesetOk(false);
                    HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    return true;
                case 3:
                case 15:
                case ' ':
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case '&':
                case '/':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case 4:
                case '\t':
                    if (htmlTreeBuilder.currentElementIs("option")) {
                        htmlTreeBuilder.processEndTag("option");
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case 5:
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    if (!asStartTag.isSelfClosing()) {
                        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rcdata);
                        htmlTreeBuilder.markInsertionMode();
                        htmlTreeBuilder.framesetOk(false);
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.Text);
                    }
                    return true;
                case 6:
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    if (!asStartTag.selfClosing) {
                        HtmlTreeBuilderState state = htmlTreeBuilder.state();
                        if (!state.equals(HtmlTreeBuilderState.InTable) && !state.equals(HtmlTreeBuilderState.InCaption) && !state.equals(HtmlTreeBuilderState.InTableBody) && !state.equals(HtmlTreeBuilderState.InRow) && !state.equals(HtmlTreeBuilderState.InCell)) {
                            htmlTreeBuilder.transition(HtmlTreeBuilderState.InSelect);
                        } else {
                            htmlTreeBuilder.transition(HtmlTreeBuilderState.InSelectInTable);
                        }
                    }
                    return true;
                case 7:
                case '\b':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 18:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case '2':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.pushActiveFormattingElements(htmlTreeBuilder.insertElementFor(asStartTag));
                    return true;
                case '\n':
                    if (htmlTreeBuilder.getActiveFormattingElement("a") != null) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processEndTag("a");
                        Element fromStack = htmlTreeBuilder.getFromStack("a");
                        if (fromStack != null) {
                            htmlTreeBuilder.removeFromActiveFormattingElements(fromStack);
                            htmlTreeBuilder.removeFromStack(fromStack);
                        }
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.pushActiveFormattingElements(htmlTreeBuilder.insertElementFor(asStartTag));
                    return true;
                case 16:
                case 17:
                    htmlTreeBuilder.framesetOk(false);
                    ArrayList<Element> stack2 = htmlTreeBuilder.getStack();
                    int size = stack2.size();
                    int i2 = size - 1;
                    if (i2 >= MaxStackScan) {
                        i = size - 25;
                    } else {
                        i = 0;
                    }
                    while (true) {
                        if (i2 >= i) {
                            Element element2 = stack2.get(i2);
                            if (StringUtil.inSorted(element2.normalName(), Constants.DdDt)) {
                                htmlTreeBuilder.processEndTag(element2.normalName());
                            } else if (!HtmlTreeBuilder.isSpecial(element2) || StringUtil.inSorted(element2.normalName(), Constants.InBodyStartLiBreakers)) {
                                i2--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                case 20:
                case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                case MaxStackScan /* 24 */:
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    if (StringUtil.inSorted(htmlTreeBuilder.currentElement().normalName(), Constants.Headings)) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.pop();
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case 25:
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case 26:
                    htmlTreeBuilder.framesetOk(false);
                    ArrayList<Element> stack3 = htmlTreeBuilder.getStack();
                    int size2 = stack3.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            Element element3 = stack3.get(size2);
                            if (element3.nameIs("li")) {
                                htmlTreeBuilder.processEndTag("li");
                            } else if (!HtmlTreeBuilder.isSpecial(element3) || StringUtil.inSorted(element3.normalName(), Constants.InBodyStartLiBreakers)) {
                                size2--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case '\"':
                    if (htmlTreeBuilder.inScope("ruby")) {
                        htmlTreeBuilder.generateImpliedEndTags();
                        if (!htmlTreeBuilder.currentElementIs("ruby")) {
                            htmlTreeBuilder.error(this);
                        }
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case 28:
                case 29:
                    if (htmlTreeBuilder.inScope("ruby")) {
                        htmlTreeBuilder.generateImpliedEndTags("rtc");
                        if (!htmlTreeBuilder.currentElementIs("rtc") && !htmlTreeBuilder.currentElementIs("ruby")) {
                            htmlTreeBuilder.error(this);
                        }
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case '!':
                case '4':
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.reader.matchConsume("\n");
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertForeignElementFor(asStartTag, Parser.NamespaceSvg);
                    return true;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.framesetOk(false);
                    HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    return true;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    htmlTreeBuilder.error(this);
                    ArrayList<Element> stack4 = htmlTreeBuilder.getStack();
                    if (stack4.size() != 1) {
                        if ((stack4.size() > 2 && !stack4.get(1).nameIs("body")) || htmlTreeBuilder.onStack("template")) {
                            return false;
                        }
                        htmlTreeBuilder.framesetOk(false);
                        Element fromStack2 = htmlTreeBuilder.getFromStack("body");
                        if (fromStack2 != null) {
                            HtmlTreeBuilderState.mergeAttributes(asStartTag, fromStack2);
                        }
                        return true;
                    }
                    return false;
                case '*':
                    if (htmlTreeBuilder.getFormElement() != null && !htmlTreeBuilder.onStack("template")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.closeElement("p");
                    }
                    htmlTreeBuilder.insertFormElement(asStartTag, true, true);
                    return true;
                case '+':
                    htmlTreeBuilder.error(this);
                    if (htmlTreeBuilder.onStack("template")) {
                        return false;
                    }
                    if (htmlTreeBuilder.getStack().size() > 0) {
                        HtmlTreeBuilderState.mergeAttributes(asStartTag, htmlTreeBuilder.getStack().get(0));
                    }
                    return true;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertForeignElementFor(asStartTag, Parser.NamespaceMathml);
                    return true;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    htmlTreeBuilder.reconstructFormattingElements();
                    if (htmlTreeBuilder.inScope("nobr")) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.processEndTag("nobr");
                        htmlTreeBuilder.reconstructFormattingElements();
                    }
                    htmlTreeBuilder.pushActiveFormattingElements(htmlTreeBuilder.insertElementFor(asStartTag));
                    return true;
                case '.':
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case yq1.f /* 48 */:
                    if (htmlTreeBuilder.getFromStack("svg") == null) {
                        return htmlTreeBuilder.process(asStartTag.name("img"));
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    return true;
                case '1':
                    htmlTreeBuilder.reconstructFormattingElements();
                    if (!htmlTreeBuilder.insertEmptyElementFor(asStartTag).attr("type").equalsIgnoreCase("hidden")) {
                        htmlTreeBuilder.framesetOk(false);
                    }
                    return true;
                case '3':
                    if (htmlTreeBuilder.getDocument().quirksMode() != Document.QuirksMode.quirks && htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
                    return true;
                case '5':
                    if (htmlTreeBuilder.inButtonScope("p")) {
                        htmlTreeBuilder.processEndTag("p");
                    }
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.tokeniser.transition(TokeniserState.PLAINTEXT);
                    return true;
                case '6':
                    htmlTreeBuilder.error(this);
                    if (htmlTreeBuilder.getFormElement() != null) {
                        return false;
                    }
                    htmlTreeBuilder.processStartTag("form");
                    if (asStartTag.hasAttribute("action") && (formElement = htmlTreeBuilder.getFormElement()) != null && asStartTag.hasAttribute("action")) {
                        formElement.attributes().put("action", asStartTag.attributes.get("action"));
                    }
                    htmlTreeBuilder.processStartTag("hr");
                    htmlTreeBuilder.processStartTag("label");
                    if (asStartTag.hasAttribute("prompt")) {
                        str = asStartTag.attributes.get("prompt");
                    } else {
                        str = "This is a searchable index. Enter search keywords: ";
                    }
                    htmlTreeBuilder.process(new Token.Character().data(str));
                    Attributes attributes = new Attributes();
                    if (asStartTag.hasAttributes()) {
                        Iterator<Attribute> it = asStartTag.attributes.iterator();
                        while (it.hasNext()) {
                            Attribute next = it.next();
                            if (!StringUtil.inSorted(next.getKey(), Constants.InBodyStartInputAttribs)) {
                                attributes.put(next);
                            }
                        }
                    }
                    attributes.put("name", "isindex");
                    htmlTreeBuilder.processStartTag("input", attributes);
                    htmlTreeBuilder.processEndTag("label");
                    htmlTreeBuilder.processStartTag("hr");
                    htmlTreeBuilder.processEndTag("form");
                    return true;
                case '7':
                    HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    return true;
                default:
                    if (!Tag.isKnownTag(normalName)) {
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else if (StringUtil.inSorted(normalName, Constants.InBodyStartPClosers)) {
                        if (htmlTreeBuilder.inButtonScope("p")) {
                            htmlTreeBuilder.processEndTag("p");
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else {
                        if (StringUtil.inSorted(normalName, Constants.InBodyStartToHead)) {
                            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        }
                        if (StringUtil.inSorted(normalName, Constants.InBodyStartApplets)) {
                            htmlTreeBuilder.reconstructFormattingElements();
                            htmlTreeBuilder.insertElementFor(asStartTag);
                            htmlTreeBuilder.insertMarkerToFormattingElements();
                            htmlTreeBuilder.framesetOk(false);
                        } else if (StringUtil.inSorted(normalName, Constants.InBodyStartMedia)) {
                            htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                        } else {
                            if (StringUtil.inSorted(normalName, Constants.InBodyStartDrop)) {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            htmlTreeBuilder.reconstructFormattingElements();
                            htmlTreeBuilder.insertElementFor(asStartTag);
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean anyOtherEndTag(org.jsoup.parser.Token r7, org.jsoup.parser.HtmlTreeBuilder r8) {
            /*
                r6 = this;
                org.jsoup.parser.Token$EndTag r7 = r7.asEndTag()
                java.lang.String r7 = r7.normalName
                java.util.ArrayList r0 = r8.getStack()
                org.jsoup.nodes.Element r1 = r8.getFromStack(r7)
                r2 = 0
                if (r1 != 0) goto L15
                r8.error(r6)
                return r2
            L15:
                int r1 = r0.size()
                r3 = 1
                int r1 = r1 - r3
            L1b:
                if (r1 < 0) goto L46
                java.lang.Object r4 = r0.get(r1)
                org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
                boolean r5 = r4.nameIs(r7)
                if (r5 == 0) goto L39
                r8.generateImpliedEndTags(r7)
                boolean r0 = r8.currentElementIs(r7)
                if (r0 != 0) goto L35
                r8.error(r6)
            L35:
                r8.popStackToClose(r7)
                goto L46
            L39:
                boolean r4 = org.jsoup.parser.HtmlTreeBuilder.isSpecial(r4)
                if (r4 == 0) goto L43
                r8.error(r6)
                return r2
            L43:
                int r1 = r1 + (-1)
                goto L1b
            L46:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.AnonymousClass7.anyOtherEndTag(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
                case 1:
                    htmlTreeBuilder.insertCommentNode(token.asComment());
                    return true;
                case 2:
                    htmlTreeBuilder.error(this);
                    return false;
                case 3:
                    return inBodyStartTag(token, htmlTreeBuilder);
                case 4:
                    return inBodyEndTag(token, htmlTreeBuilder);
                case 5:
                    Token.Character asCharacter = token.asCharacter();
                    if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (htmlTreeBuilder.framesetOk() && HtmlTreeBuilderState.isWhitespace(asCharacter)) {
                        htmlTreeBuilder.reconstructFormattingElements();
                        htmlTreeBuilder.insertCharacterNode(asCharacter);
                        return true;
                    }
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                    htmlTreeBuilder.framesetOk(false);
                    return true;
                case 6:
                    if (htmlTreeBuilder.templateModeSize() > 0) {
                        return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTemplate);
                    }
                    if (htmlTreeBuilder.onStackNot(Constants.InBodyEndOtherErrors)) {
                        htmlTreeBuilder.error(this);
                        return true;
                    }
                    return true;
                default:
                    return true;
            }
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isCharacter()) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isEOF()) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
                return htmlTreeBuilder.process(token);
            }
            if (token.isEndTag()) {
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
                return true;
            }
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        public boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.setFosterInserts(true);
            htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            htmlTreeBuilder.setFosterInserts(false);
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isCharacter() && StringUtil.inSorted(htmlTreeBuilder.currentElement().normalName(), Constants.InTableFoster)) {
                htmlTreeBuilder.resetPendingTableCharacters();
                htmlTreeBuilder.markInsertionMode();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableText);
                return htmlTreeBuilder.process(token);
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag()) {
                Token.StartTag asStartTag = token.asStartTag();
                String normalName = asStartTag.normalName();
                if (normalName.equals("caption")) {
                    htmlTreeBuilder.clearStackToTableContext();
                    htmlTreeBuilder.insertMarkerToFormattingElements();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InCaption);
                } else if (normalName.equals("colgroup")) {
                    htmlTreeBuilder.clearStackToTableContext();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InColumnGroup);
                } else {
                    if (normalName.equals("col")) {
                        htmlTreeBuilder.clearStackToTableContext();
                        htmlTreeBuilder.processStartTag("colgroup");
                        return htmlTreeBuilder.process(token);
                    }
                    if (StringUtil.inSorted(normalName, Constants.InTableToBody)) {
                        htmlTreeBuilder.clearStackToTableContext();
                        htmlTreeBuilder.insertElementFor(asStartTag);
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                    } else {
                        if (StringUtil.inSorted(normalName, Constants.InTableAddBody)) {
                            htmlTreeBuilder.clearStackToTableContext();
                            htmlTreeBuilder.processStartTag("tbody");
                            return htmlTreeBuilder.process(token);
                        }
                        if (normalName.equals("table")) {
                            htmlTreeBuilder.error(this);
                            if (!htmlTreeBuilder.inTableScope(normalName)) {
                                return false;
                            }
                            htmlTreeBuilder.popStackToClose(normalName);
                            if (!htmlTreeBuilder.resetInsertionMode()) {
                                htmlTreeBuilder.insertElementFor(asStartTag);
                                return true;
                            }
                            return htmlTreeBuilder.process(token);
                        }
                        if (StringUtil.inSorted(normalName, Constants.InTableToHead)) {
                            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        }
                        if (normalName.equals("input")) {
                            if (asStartTag.hasAttributes() && asStartTag.attributes.get("type").equalsIgnoreCase("hidden")) {
                                htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                            } else {
                                return anythingElse(token, htmlTreeBuilder);
                            }
                        } else if (normalName.equals("form")) {
                            htmlTreeBuilder.error(this);
                            if (htmlTreeBuilder.getFormElement() != null || htmlTreeBuilder.onStack("template")) {
                                return false;
                            }
                            htmlTreeBuilder.insertFormElement(asStartTag, false, false);
                        } else {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                    }
                }
                return true;
            }
            if (token.isEndTag()) {
                String normalName2 = token.asEndTag().normalName();
                if (normalName2.equals("table")) {
                    if (!htmlTreeBuilder.inTableScope(normalName2)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.popStackToClose("table");
                    htmlTreeBuilder.resetInsertionMode();
                } else {
                    if (StringUtil.inSorted(normalName2, Constants.InTableEndErr)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (normalName2.equals("template")) {
                        htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    } else {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                }
                return true;
            }
            if (token.isEOF()) {
                if (htmlTreeBuilder.currentElementIs("html")) {
                    htmlTreeBuilder.error(this);
                }
                return true;
            }
            return anythingElse(token, htmlTreeBuilder);
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.type == Token.TokenType.Character) {
                Token.Character asCharacter = token.asCharacter();
                if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.addPendingTableCharacters(asCharacter);
                return true;
            }
            if (htmlTreeBuilder.getPendingTableCharacters().size() > 0) {
                Token token2 = htmlTreeBuilder.currentToken;
                for (Token.Character character : htmlTreeBuilder.getPendingTableCharacters()) {
                    htmlTreeBuilder.currentToken = character;
                    if (!HtmlTreeBuilderState.isWhitespace(character)) {
                        htmlTreeBuilder.error(this);
                        if (StringUtil.inSorted(htmlTreeBuilder.currentElement().normalName(), Constants.InTableFoster)) {
                            htmlTreeBuilder.setFosterInserts(true);
                            htmlTreeBuilder.process(character, HtmlTreeBuilderState.InBody);
                            htmlTreeBuilder.setFosterInserts(false);
                        } else {
                            htmlTreeBuilder.process(character, HtmlTreeBuilderState.InBody);
                        }
                    } else {
                        htmlTreeBuilder.insertCharacterNode(character);
                    }
                }
                htmlTreeBuilder.currentToken = token2;
                htmlTreeBuilder.resetPendingTableCharacters();
            }
            htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
            return htmlTreeBuilder.process(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isEndTag() && token.asEndTag().normalName().equals("caption")) {
                if (!htmlTreeBuilder.inTableScope("caption")) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags();
                if (!htmlTreeBuilder.currentElementIs("caption")) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose("caption");
                htmlTreeBuilder.clearFormattingElementsToLastMarker();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
                return true;
            }
            if ((token.isStartTag() && StringUtil.inSorted(token.asStartTag().normalName(), Constants.InCellCol)) || (token.isEndTag() && token.asEndTag().normalName().equals("table"))) {
                if (!htmlTreeBuilder.inTableScope("caption")) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags(false);
                if (!htmlTreeBuilder.currentElementIs("caption")) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose("caption");
                htmlTreeBuilder.clearFormattingElementsToLastMarker();
                HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
                htmlTreeBuilder.transition(htmlTreeBuilderState);
                htmlTreeBuilderState.process(token, htmlTreeBuilder);
                return true;
            }
            if (token.isEndTag() && StringUtil.inSorted(token.asEndTag().normalName(), Constants.InCaptionIgnore)) {
                htmlTreeBuilder.error(this);
                return false;
            }
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.currentElementIs("colgroup")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.pop();
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
            htmlTreeBuilder.process(token);
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
        
            if (r3.equals("html") == false) goto L37;
         */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean process(org.jsoup.parser.Token r10, org.jsoup.parser.HtmlTreeBuilder r11) {
            /*
                r9 = this;
                boolean r0 = org.jsoup.parser.HtmlTreeBuilderState.access$100(r10)
                r1 = 1
                if (r0 == 0) goto Lf
                org.jsoup.parser.Token$Character r9 = r10.asCharacter()
                r11.insertCharacterNode(r9)
                return r1
            Lf:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType
                org.jsoup.parser.Token$TokenType r2 = r10.type
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto Lc0
                r2 = 2
                if (r0 == r2) goto Lbc
                r3 = 3
                r4 = 0
                java.lang.String r5 = "template"
                java.lang.String r6 = "html"
                if (r0 == r3) goto L74
                r2 = 4
                if (r0 == r2) goto L3d
                r2 = 6
                if (r0 == r2) goto L31
                boolean r9 = r9.anythingElse(r10, r11)
                return r9
            L31:
                boolean r0 = r11.currentElementIs(r6)
                if (r0 == 0) goto L38
                return r1
            L38:
                boolean r9 = r9.anythingElse(r10, r11)
                return r9
            L3d:
                org.jsoup.parser.Token$EndTag r0 = r10.asEndTag()
                java.lang.String r0 = r0.normalName()
                r0.getClass()
                boolean r2 = r0.equals(r5)
                if (r2 != 0) goto L6e
                java.lang.String r2 = "colgroup"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L5b
                boolean r9 = r9.anythingElse(r10, r11)
                return r9
            L5b:
                boolean r10 = r11.currentElementIs(r0)
                if (r10 != 0) goto L65
                r11.error(r9)
                return r4
            L65:
                r11.pop()
                org.jsoup.parser.HtmlTreeBuilderState r9 = org.jsoup.parser.HtmlTreeBuilderState.InTable
                r11.transition(r9)
                goto Lc7
            L6e:
                org.jsoup.parser.HtmlTreeBuilderState r9 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                r11.process(r10, r9)
                goto Lc7
            L74:
                org.jsoup.parser.Token$StartTag r0 = r10.asStartTag()
                java.lang.String r3 = r0.normalName()
                r3.getClass()
                int r7 = r3.hashCode()
                r8 = -1
                switch(r7) {
                    case -1321546630: goto L9b;
                    case 98688: goto L90;
                    case 3213227: goto L89;
                    default: goto L87;
                }
            L87:
                r2 = r8
                goto La3
            L89:
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto La3
                goto L87
            L90:
                java.lang.String r2 = "col"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L99
                goto L87
            L99:
                r2 = r1
                goto La3
            L9b:
                boolean r2 = r3.equals(r5)
                if (r2 != 0) goto La2
                goto L87
            La2:
                r2 = r4
            La3:
                switch(r2) {
                    case 0: goto Lb6;
                    case 1: goto Lb2;
                    case 2: goto Lab;
                    default: goto La6;
                }
            La6:
                boolean r9 = r9.anythingElse(r10, r11)
                return r9
            Lab:
                org.jsoup.parser.HtmlTreeBuilderState r9 = org.jsoup.parser.HtmlTreeBuilderState.InBody
                boolean r9 = r11.process(r10, r9)
                return r9
            Lb2:
                r11.insertEmptyElementFor(r0)
                goto Lc7
            Lb6:
                org.jsoup.parser.HtmlTreeBuilderState r9 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                r11.process(r10, r9)
                goto Lc7
            Lbc:
                r11.error(r9)
                goto Lc7
            Lc0:
                org.jsoup.parser.Token$Comment r9 = r10.asComment()
                r11.insertCommentNode(r9)
            Lc7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.AnonymousClass12.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTable);
        }

        private boolean exitTableBody(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.inTableScope("tbody") && !htmlTreeBuilder.inTableScope("thead") && !htmlTreeBuilder.inScope("tfoot")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.clearStackToTableBodyContext();
            htmlTreeBuilder.processEndTag(htmlTreeBuilder.currentElement().normalName());
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i = AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i != 3) {
                if (i != 4) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                String normalName = token.asEndTag().normalName();
                if (StringUtil.inSorted(normalName, Constants.InTableEndIgnore)) {
                    if (!htmlTreeBuilder.inTableScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.clearStackToTableBodyContext();
                    htmlTreeBuilder.pop();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
                    return true;
                }
                if (normalName.equals("table")) {
                    return exitTableBody(token, htmlTreeBuilder);
                }
                if (StringUtil.inSorted(normalName, Constants.InTableBodyEndIgnore)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                return anythingElse(token, htmlTreeBuilder);
            }
            Token.StartTag asStartTag = token.asStartTag();
            String normalName2 = asStartTag.normalName();
            if (normalName2.equals("tr")) {
                htmlTreeBuilder.clearStackToTableBodyContext();
                htmlTreeBuilder.insertElementFor(asStartTag);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
                return true;
            }
            if (StringUtil.inSorted(normalName2, Constants.InCellNames)) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.processStartTag("tr");
                return htmlTreeBuilder.process(asStartTag);
            }
            if (StringUtil.inSorted(normalName2, Constants.InTableBodyExit)) {
                return exitTableBody(token, htmlTreeBuilder);
            }
            return anythingElse(token, htmlTreeBuilder);
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTable);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isStartTag()) {
                Token.StartTag asStartTag = token.asStartTag();
                String normalName = asStartTag.normalName();
                if (StringUtil.inSorted(normalName, Constants.InCellNames)) {
                    htmlTreeBuilder.clearStackToTableRowContext();
                    htmlTreeBuilder.insertElementFor(asStartTag);
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InCell);
                    htmlTreeBuilder.insertMarkerToFormattingElements();
                    return true;
                }
                if (StringUtil.inSorted(normalName, Constants.InRowMissing)) {
                    if (!htmlTreeBuilder.inTableScope("tr")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.clearStackToTableRowContext();
                    htmlTreeBuilder.pop();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                    return htmlTreeBuilder.process(token);
                }
                return anythingElse(token, htmlTreeBuilder);
            }
            if (token.isEndTag()) {
                String normalName2 = token.asEndTag().normalName();
                if (normalName2.equals("tr")) {
                    if (!htmlTreeBuilder.inTableScope(normalName2)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.clearStackToTableRowContext();
                    htmlTreeBuilder.pop();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                    return true;
                }
                if (normalName2.equals("table")) {
                    if (!htmlTreeBuilder.inTableScope("tr")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.clearStackToTableRowContext();
                    htmlTreeBuilder.pop();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                    return htmlTreeBuilder.process(token);
                }
                if (StringUtil.inSorted(normalName2, Constants.InTableToBody)) {
                    if (!htmlTreeBuilder.inTableScope(normalName2)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (!htmlTreeBuilder.inTableScope("tr")) {
                        return false;
                    }
                    htmlTreeBuilder.clearStackToTableRowContext();
                    htmlTreeBuilder.pop();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                    return htmlTreeBuilder.process(token);
                }
                if (StringUtil.inSorted(normalName2, Constants.InRowIgnore)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                return anythingElse(token, htmlTreeBuilder);
            }
            return anythingElse(token, htmlTreeBuilder);
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
        }

        private void closeCell(HtmlTreeBuilder htmlTreeBuilder) {
            if (htmlTreeBuilder.inTableScope("td")) {
                htmlTreeBuilder.processEndTag("td");
            } else {
                htmlTreeBuilder.processEndTag("th");
            }
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isEndTag()) {
                String normalName = token.asEndTag().normalName();
                if (StringUtil.inSorted(normalName, Constants.InCellNames)) {
                    if (!htmlTreeBuilder.inTableScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags();
                    if (!htmlTreeBuilder.currentElementIs(normalName)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(normalName);
                    htmlTreeBuilder.clearFormattingElementsToLastMarker();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (StringUtil.inSorted(normalName, Constants.InCellBody)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (StringUtil.inSorted(normalName, Constants.InCellTable)) {
                    if (!htmlTreeBuilder.inTableScope(normalName)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    closeCell(htmlTreeBuilder);
                    return htmlTreeBuilder.process(token);
                }
                return anythingElse(token, htmlTreeBuilder);
            }
            if (token.isStartTag() && StringUtil.inSorted(token.asStartTag().normalName(), Constants.InCellCol)) {
                if (!htmlTreeBuilder.inTableScope("td") && !htmlTreeBuilder.inTableScope("th")) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                closeCell(htmlTreeBuilder);
                return htmlTreeBuilder.process(token);
            }
            return anythingElse(token, htmlTreeBuilder);
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
                case 1:
                    htmlTreeBuilder.insertCommentNode(token.asComment());
                    return true;
                case 2:
                    htmlTreeBuilder.error(this);
                    return false;
                case 3:
                    Token.StartTag asStartTag = token.asStartTag();
                    String normalName = asStartTag.normalName();
                    if (normalName.equals("html")) {
                        return htmlTreeBuilder.process(asStartTag, HtmlTreeBuilderState.InBody);
                    }
                    if (normalName.equals("option")) {
                        if (htmlTreeBuilder.currentElementIs("option")) {
                            htmlTreeBuilder.processEndTag("option");
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else if (normalName.equals("optgroup")) {
                        if (htmlTreeBuilder.currentElementIs("option")) {
                            htmlTreeBuilder.processEndTag("option");
                        }
                        if (htmlTreeBuilder.currentElementIs("optgroup")) {
                            htmlTreeBuilder.processEndTag("optgroup");
                        }
                        htmlTreeBuilder.insertElementFor(asStartTag);
                    } else {
                        if (normalName.equals("select")) {
                            htmlTreeBuilder.error(this);
                            return htmlTreeBuilder.processEndTag("select");
                        }
                        if (StringUtil.inSorted(normalName, Constants.InSelectEnd)) {
                            htmlTreeBuilder.error(this);
                            if (!htmlTreeBuilder.inSelectScope("select")) {
                                return false;
                            }
                            htmlTreeBuilder.processEndTag("select");
                            return htmlTreeBuilder.process(asStartTag);
                        }
                        if (!normalName.equals("script") && !normalName.equals("template")) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    }
                    return true;
                case 4:
                    String normalName2 = token.asEndTag().normalName();
                    normalName2.getClass();
                    char c = 65535;
                    switch (normalName2.hashCode()) {
                        case -1321546630:
                            if (normalName2.equals("template")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (normalName2.equals("option")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (normalName2.equals("select")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (normalName2.equals("optgroup")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        case 1:
                            if (htmlTreeBuilder.currentElementIs("option")) {
                                htmlTreeBuilder.pop();
                            } else {
                                htmlTreeBuilder.error(this);
                            }
                            return true;
                        case 2:
                            if (!htmlTreeBuilder.inSelectScope(normalName2)) {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            htmlTreeBuilder.popStackToClose(normalName2);
                            htmlTreeBuilder.resetInsertionMode();
                            return true;
                        case 3:
                            if (htmlTreeBuilder.currentElementIs("option") && htmlTreeBuilder.aboveOnStack(htmlTreeBuilder.currentElement()) != null && htmlTreeBuilder.aboveOnStack(htmlTreeBuilder.currentElement()).nameIs("optgroup")) {
                                htmlTreeBuilder.processEndTag("option");
                            }
                            if (htmlTreeBuilder.currentElementIs("optgroup")) {
                                htmlTreeBuilder.pop();
                            } else {
                                htmlTreeBuilder.error(this);
                            }
                            return true;
                        default:
                            return anythingElse(token, htmlTreeBuilder);
                    }
                case 5:
                    Token.Character asCharacter = token.asCharacter();
                    if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                    return true;
                case 6:
                    if (!htmlTreeBuilder.currentElementIs("html")) {
                        htmlTreeBuilder.error(this);
                    }
                    return true;
                default:
                    return anythingElse(token, htmlTreeBuilder);
            }
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isStartTag() && StringUtil.inSorted(token.asStartTag().normalName(), Constants.InSelectTableEnd)) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.popStackToClose("select");
                htmlTreeBuilder.resetInsertionMode();
                return htmlTreeBuilder.process(token);
            }
            if (token.isEndTag() && StringUtil.inSorted(token.asEndTag().normalName(), Constants.InSelectTableEnd)) {
                htmlTreeBuilder.error(this);
                if (htmlTreeBuilder.inTableScope(token.asEndTag().normalName())) {
                    htmlTreeBuilder.popStackToClose("select");
                    htmlTreeBuilder.resetInsertionMode();
                    return htmlTreeBuilder.process(token);
                }
                return false;
            }
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InSelect);
        }
    },
    InTemplate { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            switch (AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                    return true;
                case 3:
                    String normalName = token.asStartTag().normalName();
                    if (StringUtil.inSorted(normalName, Constants.InTemplateToHead)) {
                        htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        return true;
                    }
                    if (StringUtil.inSorted(normalName, Constants.InTemplateToTable)) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState);
                        htmlTreeBuilder.transition(htmlTreeBuilderState);
                        return htmlTreeBuilder.process(token);
                    }
                    if (normalName.equals("col")) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InColumnGroup;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState2);
                        htmlTreeBuilder.transition(htmlTreeBuilderState2);
                        return htmlTreeBuilder.process(token);
                    }
                    if (normalName.equals("tr")) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState3 = HtmlTreeBuilderState.InTableBody;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState3);
                        htmlTreeBuilder.transition(htmlTreeBuilderState3);
                        return htmlTreeBuilder.process(token);
                    }
                    if (!normalName.equals("td") && !normalName.equals("th")) {
                        htmlTreeBuilder.popTemplateMode();
                        HtmlTreeBuilderState htmlTreeBuilderState4 = HtmlTreeBuilderState.InBody;
                        htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState4);
                        htmlTreeBuilder.transition(htmlTreeBuilderState4);
                        return htmlTreeBuilder.process(token);
                    }
                    htmlTreeBuilder.popTemplateMode();
                    HtmlTreeBuilderState htmlTreeBuilderState5 = HtmlTreeBuilderState.InRow;
                    htmlTreeBuilder.pushTemplateMode(htmlTreeBuilderState5);
                    htmlTreeBuilder.transition(htmlTreeBuilderState5);
                    return htmlTreeBuilder.process(token);
                case 4:
                    if (token.asEndTag().normalName().equals("template")) {
                        htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        return true;
                    }
                    htmlTreeBuilder.error(this);
                    return false;
                case 6:
                    if (!htmlTreeBuilder.onStack("template")) {
                        return true;
                    }
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.popStackToClose("template");
                    htmlTreeBuilder.clearFormattingElementsToLastMarker();
                    htmlTreeBuilder.popTemplateMode();
                    htmlTreeBuilder.resetInsertionMode();
                    if (htmlTreeBuilder.state() == HtmlTreeBuilderState.InTemplate || htmlTreeBuilder.templateModeSize() >= 12) {
                        return true;
                    }
                    return htmlTreeBuilder.process(token);
                default:
                    return true;
            }
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Element fromStack = htmlTreeBuilder.getFromStack("html");
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                if (fromStack != null) {
                    htmlTreeBuilder.insertCharacterToElement(token.asCharacter(), fromStack);
                    return true;
                }
                htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEndTag() && token.asEndTag().normalName().equals("html")) {
                if (htmlTreeBuilder.isFragmentParsing()) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (fromStack != null) {
                    htmlTreeBuilder.onNodeClosed(fromStack);
                }
                htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterAfterBody);
                return true;
            }
            if (token.isEOF()) {
                return true;
            }
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.resetBody();
            return htmlTreeBuilder.process(token);
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
            } else if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            } else {
                if (token.isDoctype()) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (token.isStartTag()) {
                    Token.StartTag asStartTag = token.asStartTag();
                    String normalName = asStartTag.normalName();
                    normalName.getClass();
                    char c = 65535;
                    switch (normalName.hashCode()) {
                        case -1644953643:
                            if (normalName.equals("frameset")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 3213227:
                            if (normalName.equals("html")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 97692013:
                            if (normalName.equals("frame")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1192721831:
                            if (normalName.equals("noframes")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            htmlTreeBuilder.insertElementFor(asStartTag);
                            break;
                        case 1:
                            return htmlTreeBuilder.process(asStartTag, HtmlTreeBuilderState.InBody);
                        case 2:
                            htmlTreeBuilder.insertEmptyElementFor(asStartTag);
                            break;
                        case 3:
                            return htmlTreeBuilder.process(asStartTag, HtmlTreeBuilderState.InHead);
                        default:
                            htmlTreeBuilder.error(this);
                            return false;
                    }
                } else if (token.isEndTag() && token.asEndTag().normalName().equals("frameset")) {
                    if (htmlTreeBuilder.currentElementIs("html")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.pop();
                    if (!htmlTreeBuilder.isFragmentParsing() && !htmlTreeBuilder.currentElementIs("frameset")) {
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterFrameset);
                    }
                } else if (token.isEOF()) {
                    if (!htmlTreeBuilder.currentElementIs("html")) {
                        htmlTreeBuilder.error(this);
                    }
                } else {
                    htmlTreeBuilder.error(this);
                    return false;
                }
            }
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insertCharacterNode(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEndTag() && token.asEndTag().normalName().equals("html")) {
                htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterAfterFrameset);
                return true;
            }
            if (token.isStartTag() && token.asStartTag().normalName().equals("noframes")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
            }
            if (token.isEOF()) {
                return true;
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (!token.isDoctype() && (!token.isStartTag() || !token.asStartTag().normalName().equals("html"))) {
                if (HtmlTreeBuilderState.isWhitespace(token)) {
                    htmlTreeBuilder.insertCharacterToElement(token.asCharacter(), htmlTreeBuilder.getDocument());
                    return true;
                }
                if (token.isEOF()) {
                    return true;
                }
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.resetBody();
                return htmlTreeBuilder.process(token);
            }
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isComment()) {
                htmlTreeBuilder.insertCommentNode(token.asComment());
                return true;
            }
            if (!token.isDoctype() && !HtmlTreeBuilderState.isWhitespace(token) && (!token.isStartTag() || !token.asStartTag().normalName().equals("html"))) {
                if (token.isEOF()) {
                    return true;
                }
                if (token.isStartTag() && token.asStartTag().normalName().equals("noframes")) {
                    return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.24
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i = AnonymousClass25.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Token.Character asCharacter = token.asCharacter();
                                if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                                    htmlTreeBuilder.error(this);
                                } else if (HtmlTreeBuilderState.isWhitespace(asCharacter)) {
                                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                                } else {
                                    htmlTreeBuilder.insertCharacterNode(asCharacter);
                                    htmlTreeBuilder.framesetOk(false);
                                }
                            }
                        } else {
                            Token.EndTag asEndTag = token.asEndTag();
                            if (!asEndTag.normalName.equals("br") && !asEndTag.normalName.equals("p")) {
                                if (asEndTag.normalName.equals("script") && htmlTreeBuilder.currentElementIs("script", Parser.NamespaceSvg)) {
                                    htmlTreeBuilder.pop();
                                    return true;
                                }
                                ArrayList<Element> stack = htmlTreeBuilder.getStack();
                                if (stack.isEmpty()) {
                                    Validate.wtf("Stack unexpectedly empty");
                                }
                                int size = stack.size() - 1;
                                Element element = stack.get(size);
                                if (!element.nameIs(asEndTag.normalName)) {
                                    htmlTreeBuilder.error(this);
                                }
                                while (size != 0) {
                                    if (element.nameIs(asEndTag.normalName)) {
                                        htmlTreeBuilder.popStackToCloseAnyNamespace(element.normalName());
                                        return true;
                                    }
                                    size--;
                                    element = stack.get(size);
                                    if (element.tag().namespace().equals(Parser.NamespaceHtml)) {
                                        return processAsHtml(token, htmlTreeBuilder);
                                    }
                                }
                            } else {
                                return processAsHtml(token, htmlTreeBuilder);
                            }
                        }
                    } else {
                        Token.StartTag asStartTag = token.asStartTag();
                        if (StringUtil.in(asStartTag.normalName, Constants.InForeignToHtml)) {
                            return processAsHtml(token, htmlTreeBuilder);
                        }
                        if (asStartTag.normalName.equals("font") && (asStartTag.hasAttributeIgnoreCase("color") || asStartTag.hasAttributeIgnoreCase("face") || asStartTag.hasAttributeIgnoreCase("size"))) {
                            return processAsHtml(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.insertForeignElementFor(asStartTag, htmlTreeBuilder.currentElement().tag().namespace());
                    }
                } else {
                    htmlTreeBuilder.error(this);
                }
            } else {
                htmlTreeBuilder.insertCommentNode(token.asComment());
            }
            return true;
        }

        public boolean processAsHtml(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.state().process(token, htmlTreeBuilder);
        }
    };

    private static final String nullString = String.valueOf((char) 0);

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: org.jsoup.parser.HtmlTreeBuilderState$25, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass25 {
        static final /* synthetic */ int[] $SwitchMap$org$jsoup$parser$Token$TokenType;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            $SwitchMap$org$jsoup$parser$Token$TokenType = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jsoup$parser$Token$TokenType[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Constants {
        static final String[] InHeadEmpty = {"base", "basefont", "bgsound", "command", "link"};
        static final String[] InHeadRaw = {"noframes", "style"};
        static final String[] InHeadEnd = {"body", "br", "html"};
        static final String[] AfterHeadBody = {"body", "br", "html"};
        static final String[] BeforeHtmlToHead = {"body", "br", "head", "html"};
        static final String[] InHeadNoScriptHead = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
        static final String[] InBodyStartToHead = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
        static final String[] InBodyStartPClosers = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        static final String[] Headings = {"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] InBodyStartLiBreakers = {"address", "div", "p"};
        static final String[] DdDt = {"dd", "dt"};
        static final String[] InBodyStartApplets = {"applet", "marquee", "object"};
        static final String[] InBodyStartMedia = {"param", "source", "track"};
        static final String[] InBodyStartInputAttribs = {"action", "name", "prompt"};
        static final String[] InBodyStartDrop = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InBodyEndClosers = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] InBodyEndOtherErrors = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InBodyEndAdoptionFormatters = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] InBodyEndTableFosters = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InTableToBody = {"tbody", "tfoot", "thead"};
        static final String[] InTableAddBody = {"td", "th", "tr"};
        static final String[] InTableToHead = {"script", "style", "template"};
        static final String[] InCellNames = {"td", "th"};
        static final String[] InCellBody = {"body", "caption", "col", "colgroup", "html"};
        static final String[] InCellTable = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InCellCol = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InTableEndErr = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InTableFoster = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InTableBodyExit = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        static final String[] InTableBodyEndIgnore = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        static final String[] InRowMissing = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        static final String[] InRowIgnore = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        static final String[] InSelectEnd = {"input", "keygen", "textarea"};
        static final String[] InSelectTableEnd = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InTableEndIgnore = {"tbody", "tfoot", "thead"};
        static final String[] InHeadNoscriptIgnore = {"head", "noscript"};
        static final String[] InCaptionIgnore = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InTemplateToHead = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
        static final String[] InTemplateToTable = {"caption", "colgroup", "tbody", "tfoot", "thead"};
        static final String[] InForeignToHtml = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRawtext(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rawtext);
        htmlTreeBuilder.markInsertionMode();
        htmlTreeBuilder.transition(Text);
        htmlTreeBuilder.insertElementFor(startTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRcData(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rcdata);
        htmlTreeBuilder.markInsertionMode();
        htmlTreeBuilder.transition(Text);
        htmlTreeBuilder.insertElementFor(startTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(Token token) {
        if (token.isCharacter()) {
            return StringUtil.isBlank(token.asCharacter().getData());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mergeAttributes(Token.StartTag startTag, Element element) {
        if (startTag.hasAttributes()) {
            Iterator<Attribute> it = startTag.attributes.iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                Attributes attributes = element.attributes();
                if (!attributes.hasKey(next.getKey())) {
                    Range.AttributeRange sourceRange = next.sourceRange();
                    attributes.put(next);
                    if (startTag.trackSource) {
                        attributes.sourceRange(next.getKey(), sourceRange);
                    }
                }
            }
        }
    }

    public abstract boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder);
}
