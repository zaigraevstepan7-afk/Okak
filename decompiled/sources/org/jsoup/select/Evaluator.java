package org.jsoup.select;

import defpackage.l90;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Evaluator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class Evaluator {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AllElements extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 10;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Attribute extends Evaluator {
        private final String key;

        public Attribute(String str) {
            this.key = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 2;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return element2.hasAttr(this.key);
        }

        public String toString() {
            return l90.m("[", this.key, "]");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AttributeStarting extends Evaluator {
        private final String keyPrefix;

        public AttributeStarting(String str) {
            Validate.notNull(str);
            this.keyPrefix = Normalizer.lowerCase(str);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 6;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            Iterator<org.jsoup.nodes.Attribute> it = element2.attributes().asList().iterator();
            while (it.hasNext()) {
                if (Normalizer.lowerCase(it.next().getKey()).startsWith(this.keyPrefix)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return l90.m("[^", this.keyPrefix, "]");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 3;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2.hasAttr(this.key) && this.value.equalsIgnoreCase(element2.attr(this.key).trim())) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "[" + this.key + "=" + this.value + "]";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 6;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2.hasAttr(this.key) && Normalizer.lowerCase(element2.attr(this.key)).contains(this.value)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "[" + this.key + "*=" + this.value + "]";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 4;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2.hasAttr(this.key) && Normalizer.lowerCase(element2.attr(this.key)).endsWith(this.value)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "[" + this.key + "$=" + this.value + "]";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AttributeWithValueMatching extends Evaluator {
        final String key;
        final Pattern pattern;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.key = Normalizer.normalize(str);
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 8;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2.hasAttr(this.key) && this.pattern.matcher(element2.attr(this.key)).find()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "[" + this.key + "~=" + this.pattern.toString() + "]";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 3;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return !this.value.equalsIgnoreCase(element2.attr(this.key));
        }

        public String toString() {
            return "[" + this.key + "!=" + this.value + "]";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 4;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2.hasAttr(this.key) && Normalizer.lowerCase(element2.attr(this.key)).startsWith(this.value)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "[" + this.key + "^=" + this.value + "]";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Class extends Evaluator {
        private final String className;

        public Class(String str) {
            this.className = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 6;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return element2.hasClass(this.className);
        }

        public String toString() {
            return l90.l(".", this.className);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ContainsData extends Evaluator {
        private final String searchText;

        public ContainsData(String str) {
            this.searchText = Normalizer.lowerCase(str);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return Normalizer.lowerCase(element2.data()).contains(this.searchText);
        }

        public String toString() {
            return l90.m(":containsData(", this.searchText, ")");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ContainsOwnText extends Evaluator {
        private final String searchText;

        public ContainsOwnText(String str) {
            this.searchText = Normalizer.lowerCase(StringUtil.normaliseWhitespace(str));
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return Normalizer.lowerCase(element2.ownText()).contains(this.searchText);
        }

        public String toString() {
            return l90.m(":containsOwn(", this.searchText, ")");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ContainsText extends Evaluator {
        private final String searchText;

        public ContainsText(String str) {
            this.searchText = Normalizer.lowerCase(StringUtil.normaliseWhitespace(str));
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 10;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return Normalizer.lowerCase(element2.text()).contains(this.searchText);
        }

        public String toString() {
            return l90.m(":contains(", this.searchText, ")");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ContainsWholeOwnText extends Evaluator {
        private final String searchText;

        public ContainsWholeOwnText(String str) {
            this.searchText = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return element2.wholeOwnText().contains(this.searchText);
        }

        public String toString() {
            return l90.m(":containsWholeOwnText(", this.searchText, ")");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ContainsWholeText extends Evaluator {
        private final String searchText;

        public ContainsWholeText(String str) {
            this.searchText = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 10;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return element2.wholeText().contains(this.searchText);
        }

        public String toString() {
            return l90.m(":containsWholeText(", this.searchText, ")");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Id extends Evaluator {
        private final String id;

        public Id(String str) {
            this.id = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 2;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return this.id.equals(element2.id());
        }

        public String toString() {
            return l90.l("#", this.id);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i) {
            super(i);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2.elementSiblingIndex() == this.index) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.index));
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class IndexEvaluator extends Evaluator {
        final int index;

        public IndexEvaluator(int i) {
            this.index = i;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i) {
            super(i);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2.elementSiblingIndex() > this.index) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.index));
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i) {
            super(i);
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element != element2 && element2.elementSiblingIndex() < this.index) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.index));
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsEmpty extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            for (Node firstChild = element2.firstChild(); firstChild != null; firstChild = firstChild.nextSibling()) {
                if (firstChild instanceof TextNode) {
                    if (!((TextNode) firstChild).isBlank()) {
                        return false;
                    }
                } else if (!(firstChild instanceof Comment) && !(firstChild instanceof XmlDeclaration) && !(firstChild instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsFirstChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document) && element2 == parent.firstElementChild()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":first-of-type";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsLastChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document) && element2 == parent.lastElementChild()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":last-of-type";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            return element2.elementSiblingIndex() + 1;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-child";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            if (element2.parent() == null) {
                return 0;
            }
            return element2.parent().childrenSize() - element2.elementSiblingIndex();
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-last-child";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            int i = 0;
            if (element2.parent() == null) {
                return 0;
            }
            for (Element element3 = element2; element3 != null; element3 = element3.nextElementSibling()) {
                if (element3.normalName().equals(element2.normalName())) {
                    i++;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-last-of-type";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null) {
                return 0;
            }
            int childNodeSize = parent.childNodeSize();
            int i = 0;
            for (int i2 = 0; i2 < childNodeSize; i2++) {
                Node childNode = parent.childNode(i2);
                if (childNode.normalName().equals(element2.normalName())) {
                    i++;
                }
                if (childNode == element2) {
                    return i;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-of-type";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsOnlyChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document) && element2.siblingElements().isEmpty()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsOnlyOfType extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document)) {
                int i = 0;
                for (Element firstElementChild = parent.firstElementChild(); firstElementChild != null; firstElementChild = firstElementChild.nextElementSibling()) {
                    if (firstElementChild.normalName().equals(element2.normalName())) {
                        i++;
                    }
                    if (i > 1) {
                        break;
                    }
                }
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class IsRoot extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 1;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.firstElementChild();
            }
            if (element2 == element) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":root";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class MatchText extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return -1;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2 instanceof PseudoTextElement) {
                return true;
            }
            for (TextNode textNode : element2.textNodes()) {
                PseudoTextElement pseudoTextElement = new PseudoTextElement(org.jsoup.parser.Tag.valueOf(element2.tagName(), element2.tag().namespace(), ParseSettings.preserveCase), element2.baseUri(), element2.attributes());
                textNode.replaceWith(pseudoTextElement);
                pseudoTextElement.appendChild(textNode);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Matches extends Evaluator {
        private final Pattern pattern;

        public Matches(Pattern pattern) {
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 8;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return this.pattern.matcher(element2.text()).find();
        }

        public String toString() {
            return ":matches(" + this.pattern + ")";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class MatchesOwn extends Evaluator {
        private final Pattern pattern;

        public MatchesOwn(Pattern pattern) {
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 7;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return this.pattern.matcher(element2.ownText()).find();
        }

        public String toString() {
            return ":matchesOwn(" + this.pattern + ")";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class MatchesWholeOwnText extends Evaluator {
        private final Pattern pattern;

        public MatchesWholeOwnText(Pattern pattern) {
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 7;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return this.pattern.matcher(element2.wholeOwnText()).find();
        }

        public String toString() {
            return ":matchesWholeOwnText(" + this.pattern + ")";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class MatchesWholeText extends Evaluator {
        private final Pattern pattern;

        public MatchesWholeText(Pattern pattern) {
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 8;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return this.pattern.matcher(element2.wholeText()).find();
        }

        public String toString() {
            return ":matchesWholeText(" + this.pattern + ")";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Tag extends Evaluator {
        private final String tagName;

        public Tag(String str) {
            this.tagName = str;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 1;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return element2.nameIs(this.tagName);
        }

        public String toString() {
            return this.tagName;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class TagEndsWith extends Evaluator {
        private final String tagName;

        public TagEndsWith(String str) {
            this.tagName = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return element2.normalName().endsWith(this.tagName);
        }

        public String toString() {
            return this.tagName;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class TagStartsWith extends Evaluator {
        private final String tagName;

        public TagStartsWith(String str) {
            this.tagName = str;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return element2.normalName().startsWith(this.tagName);
        }

        public String toString() {
            return this.tagName;
        }
    }

    public Predicate<Element> asPredicate(final Element element) {
        return new Predicate() { // from class: k70
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$asPredicate$0;
                lambda$asPredicate$0 = Evaluator.this.lambda$asPredicate$0(element, (Element) obj);
                return lambda$asPredicate$0;
            }
        };
    }

    public int cost() {
        return 5;
    }

    /* renamed from: matches, reason: merged with bridge method [inline-methods] */
    public abstract boolean lambda$asPredicate$0(Element element, Element element2);

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class CssNthEvaluator extends Evaluator {
        protected final int a;
        protected final int b;

        public CssNthEvaluator(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public abstract int calculatePosition(Element element, Element element2);

        public abstract String getPseudoClass();

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent != null && !(parent instanceof Document)) {
                int calculatePosition = calculatePosition(element, element2);
                int i = this.a;
                int i2 = this.b;
                if (i == 0) {
                    if (calculatePosition != i2) {
                        return false;
                    }
                    return true;
                }
                if ((calculatePosition - i2) * i >= 0 && (calculatePosition - i2) % i == 0) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            if (this.a == 0) {
                return String.format(":%s(%d)", getPseudoClass(), Integer.valueOf(this.b));
            }
            if (this.b == 0) {
                return String.format(":%s(%dn)", getPseudoClass(), Integer.valueOf(this.a));
            }
            return String.format(":%s(%dn%+d)", getPseudoClass(), Integer.valueOf(this.a), Integer.valueOf(this.b));
        }

        public CssNthEvaluator(int i) {
            this(0, i);
        }
    }

    public void reset() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class AttributeKeyPair extends Evaluator {
        final String key;
        final String value;

        public AttributeKeyPair(String str, String str2, boolean z) {
            boolean z2;
            String normalize;
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            this.key = Normalizer.normalize(str);
            if ((str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""))) {
                z2 = true;
            } else {
                z2 = false;
            }
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            if (z) {
                normalize = Normalizer.normalize(str2);
            } else {
                normalize = Normalizer.normalize(str2, z2);
            }
            this.value = normalize;
        }

        public AttributeKeyPair(String str, String str2) {
            this(str, str2, true);
        }
    }
}
