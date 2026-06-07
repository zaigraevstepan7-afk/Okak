package org.jsoup.select;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.StructuralEvaluator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class QueryParser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final List<Evaluator> evals = new ArrayList();
    private final String query;
    private final TokenQueue tq;
    private static final char[] Combinators = {AbstractJsonLexerKt.COMMA, '>', '+', '~', ' '};
    private static final String[] AttributeEvals = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern NTH_AB = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern NTH_B = Pattern.compile("([+-])?(\\d+)");

    private QueryParser(String str) {
        Validate.notEmpty(str);
        String trim = str.trim();
        this.query = trim;
        this.tq = new TokenQueue(trim);
    }

    private Evaluator byAttribute() {
        TokenQueue tokenQueue = new TokenQueue(this.tq.chompBalanced(AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST));
        String consumeToAny = tokenQueue.consumeToAny(AttributeEvals);
        Validate.notEmpty(consumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            if (consumeToAny.startsWith("^")) {
                return new Evaluator.AttributeStarting(consumeToAny.substring(1));
            }
            if (consumeToAny.equals("*")) {
                return new Evaluator.AttributeStarting("");
            }
            return new Evaluator.Attribute(consumeToAny);
        }
        if (tokenQueue.matchChomp("=")) {
            return new Evaluator.AttributeWithValue(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("!=")) {
            return new Evaluator.AttributeWithValueNot(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("^=")) {
            return new Evaluator.AttributeWithValueStarting(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("$=")) {
            return new Evaluator.AttributeWithValueEnding(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("*=")) {
            return new Evaluator.AttributeWithValueContaining(consumeToAny, tokenQueue.remainder());
        }
        if (tokenQueue.matchChomp("~=")) {
            return new Evaluator.AttributeWithValueMatching(consumeToAny, Pattern.compile(tokenQueue.remainder()));
        }
        throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.query, tokenQueue.remainder());
    }

    private Evaluator byClass() {
        String consumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        return new Evaluator.Class(consumeCssIdentifier.trim());
    }

    private Evaluator byId() {
        String consumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        return new Evaluator.Id(consumeCssIdentifier);
    }

    private Evaluator byTag() {
        String normalize = Normalizer.normalize(this.tq.consumeElementSelector());
        Validate.notEmpty(normalize);
        if (normalize.startsWith("*|")) {
            String substring = normalize.substring(2);
            return new CombiningEvaluator.Or(new Evaluator.Tag(substring), new Evaluator.TagEndsWith(":".concat(substring)));
        }
        if (normalize.endsWith("|*")) {
            return new Evaluator.TagStartsWith(normalize.substring(0, normalize.length() - 2).concat(":"));
        }
        if (normalize.contains("|")) {
            normalize = normalize.replace("|", ":");
        }
        return new Evaluator.Tag(normalize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void combinator(char r10) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.combinator(char):void");
    }

    private Evaluator consumeEvaluator() {
        if (this.tq.matchChomp("#")) {
            return byId();
        }
        if (this.tq.matchChomp(".")) {
            return byClass();
        }
        if (!this.tq.matchesWord() && !this.tq.matches("*|")) {
            if (this.tq.matches("[")) {
                return byAttribute();
            }
            if (this.tq.matchChomp("*")) {
                return new Evaluator.AllElements();
            }
            if (this.tq.matchChomp(":")) {
                return parsePseudoSelector();
            }
            throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.query, this.tq.remainder());
        }
        return byTag();
    }

    private int consumeIndex() {
        String trim = consumeParens().trim();
        Validate.isTrue(StringUtil.isNumeric(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private String consumeParens() {
        return this.tq.chompBalanced('(', ')');
    }

    private String consumeSubQuery() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        boolean z = false;
        while (!this.tq.isEmpty()) {
            if (this.tq.matchesAny(Combinators)) {
                if (z) {
                    break;
                }
                borrowBuilder.append(this.tq.consume());
            } else {
                if (this.tq.matches("(")) {
                    borrowBuilder.append("(");
                    borrowBuilder.append(this.tq.chompBalanced('(', ')'));
                    borrowBuilder.append(")");
                } else if (this.tq.matches("[")) {
                    borrowBuilder.append("[");
                    borrowBuilder.append(this.tq.chompBalanced(AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST));
                    borrowBuilder.append("]");
                } else {
                    boolean matches = this.tq.matches("\\");
                    TokenQueue tokenQueue = this.tq;
                    if (matches) {
                        borrowBuilder.append(tokenQueue.consume());
                        if (!this.tq.isEmpty()) {
                            borrowBuilder.append(this.tq.consume());
                        }
                    } else {
                        borrowBuilder.append(tokenQueue.consume());
                    }
                }
                z = true;
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    private Evaluator contains(boolean z) {
        String str;
        if (z) {
            str = ":containsOwn";
        } else {
            str = ":contains";
        }
        String unescape = TokenQueue.unescape(consumeParens());
        Validate.notEmpty(unescape, str.concat("(text) query must not be empty"));
        if (z) {
            return new Evaluator.ContainsOwnText(unescape);
        }
        return new Evaluator.ContainsText(unescape);
    }

    private Evaluator containsData() {
        String unescape = TokenQueue.unescape(consumeParens());
        Validate.notEmpty(unescape, ":containsData(text) query must not be empty");
        return new Evaluator.ContainsData(unescape);
    }

    private Evaluator containsWholeText(boolean z) {
        String str;
        if (z) {
            str = ":containsWholeOwnText";
        } else {
            str = ":containsWholeText";
        }
        String unescape = TokenQueue.unescape(consumeParens());
        Validate.notEmpty(unescape, str.concat("(text) query must not be empty"));
        if (z) {
            return new Evaluator.ContainsWholeOwnText(unescape);
        }
        return new Evaluator.ContainsWholeText(unescape);
    }

    private Evaluator cssNthChild(boolean z, boolean z2) {
        int i;
        String normalize = Normalizer.normalize(consumeParens());
        Matcher matcher = NTH_AB.matcher(normalize);
        Matcher matcher2 = NTH_B.matcher(normalize);
        int i2 = 2;
        int i3 = 1;
        if (!"odd".equals(normalize)) {
            if ("even".equals(normalize)) {
                i3 = 0;
            } else if (matcher.matches()) {
                if (matcher.group(3) != null) {
                    i = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                } else {
                    i = 1;
                }
                if (matcher.group(4) != null) {
                    i3 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                } else {
                    i3 = 0;
                }
                i2 = i;
            } else if (matcher2.matches()) {
                i3 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            } else {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", normalize);
            }
        }
        if (z2) {
            if (z) {
                return new Evaluator.IsNthLastOfType(i2, i3);
            }
            return new Evaluator.IsNthOfType(i2, i3);
        }
        if (z) {
            return new Evaluator.IsNthLastChild(i2, i3);
        }
        return new Evaluator.IsNthChild(i2, i3);
    }

    private Evaluator has() {
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, ":has(selector) sub-select must not be empty");
        return new StructuralEvaluator.Has(parse(consumeParens));
    }

    private Evaluator is() {
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, ":is(selector) sub-select must not be empty");
        return new StructuralEvaluator.Is(parse(consumeParens));
    }

    private Evaluator matches(boolean z) {
        String str;
        if (z) {
            str = ":matchesOwn";
        } else {
            str = ":matches";
        }
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, str.concat("(regex) query must not be empty"));
        if (z) {
            return new Evaluator.MatchesOwn(Pattern.compile(consumeParens));
        }
        return new Evaluator.Matches(Pattern.compile(consumeParens));
    }

    private Evaluator matchesWholeText(boolean z) {
        String str;
        if (z) {
            str = ":matchesWholeOwnText";
        } else {
            str = ":matchesWholeText";
        }
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, str.concat("(regex) query must not be empty"));
        if (z) {
            return new Evaluator.MatchesWholeOwnText(Pattern.compile(consumeParens));
        }
        return new Evaluator.MatchesWholeText(Pattern.compile(consumeParens));
    }

    private Evaluator not() {
        String consumeParens = consumeParens();
        Validate.notEmpty(consumeParens, ":not(selector) subselect must not be empty");
        return new StructuralEvaluator.Not(parse(consumeParens));
    }

    private Evaluator parsePseudoSelector() {
        String consumeCssIdentifier = this.tq.consumeCssIdentifier();
        consumeCssIdentifier.getClass();
        char c = 65535;
        switch (consumeCssIdentifier.hashCode()) {
            case -2141736343:
                if (consumeCssIdentifier.equals("containsData")) {
                    c = 0;
                    break;
                }
                break;
            case -2136991809:
                if (consumeCssIdentifier.equals("first-child")) {
                    c = 1;
                    break;
                }
                break;
            case -1939921007:
                if (consumeCssIdentifier.equals("matchesWholeText")) {
                    c = 2;
                    break;
                }
                break;
            case -1754914063:
                if (consumeCssIdentifier.equals("nth-child")) {
                    c = 3;
                    break;
                }
                break;
            case -1629748624:
                if (consumeCssIdentifier.equals("nth-last-child")) {
                    c = 4;
                    break;
                }
                break;
            case -947996741:
                if (consumeCssIdentifier.equals("only-child")) {
                    c = 5;
                    break;
                }
                break;
            case -897532411:
                if (consumeCssIdentifier.equals("nth-of-type")) {
                    c = 6;
                    break;
                }
                break;
            case -872629820:
                if (consumeCssIdentifier.equals("nth-last-of-type")) {
                    c = 7;
                    break;
                }
                break;
            case -567445985:
                if (consumeCssIdentifier.equals("contains")) {
                    c = '\b';
                    break;
                }
                break;
            case -55413797:
                if (consumeCssIdentifier.equals("containsWholeOwnText")) {
                    c = '\t';
                    break;
                }
                break;
            case 3244:
                if (consumeCssIdentifier.equals("eq")) {
                    c = '\n';
                    break;
                }
                break;
            case 3309:
                if (consumeCssIdentifier.equals("gt")) {
                    c = 11;
                    break;
                }
                break;
            case 3370:
                if (consumeCssIdentifier.equals("is")) {
                    c = '\f';
                    break;
                }
                break;
            case 3464:
                if (consumeCssIdentifier.equals("lt")) {
                    c = '\r';
                    break;
                }
                break;
            case 103066:
                if (consumeCssIdentifier.equals("has")) {
                    c = 14;
                    break;
                }
                break;
            case 109267:
                if (consumeCssIdentifier.equals("not")) {
                    c = 15;
                    break;
                }
                break;
            case 3506402:
                if (consumeCssIdentifier.equals("root")) {
                    c = 16;
                    break;
                }
                break;
            case 96634189:
                if (consumeCssIdentifier.equals("empty")) {
                    c = 17;
                    break;
                }
                break;
            case 208017639:
                if (consumeCssIdentifier.equals("containsOwn")) {
                    c = 18;
                    break;
                }
                break;
            case 614017170:
                if (consumeCssIdentifier.equals("matchText")) {
                    c = 19;
                    break;
                }
                break;
            case 835834661:
                if (consumeCssIdentifier.equals("last-child")) {
                    c = 20;
                    break;
                }
                break;
            case 840862003:
                if (consumeCssIdentifier.equals("matches")) {
                    c = 21;
                    break;
                }
                break;
            case 1255901423:
                if (consumeCssIdentifier.equals("matchesWholeOwnText")) {
                    c = 22;
                    break;
                }
                break;
            case 1292941139:
                if (consumeCssIdentifier.equals("first-of-type")) {
                    c = 23;
                    break;
                }
                break;
            case 1455900751:
                if (consumeCssIdentifier.equals("only-of-type")) {
                    c = 24;
                    break;
                }
                break;
            case 1870740819:
                if (consumeCssIdentifier.equals("matchesOwn")) {
                    c = 25;
                    break;
                }
                break;
            case 2014184485:
                if (consumeCssIdentifier.equals("containsWholeText")) {
                    c = 26;
                    break;
                }
                break;
            case 2025926969:
                if (consumeCssIdentifier.equals("last-of-type")) {
                    c = 27;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return containsData();
            case 1:
                return new Evaluator.IsFirstChild();
            case 2:
                return matchesWholeText(false);
            case 3:
                return cssNthChild(false, false);
            case 4:
                return cssNthChild(true, false);
            case 5:
                return new Evaluator.IsOnlyChild();
            case 6:
                return cssNthChild(false, true);
            case 7:
                return cssNthChild(true, true);
            case '\b':
                return contains(false);
            case '\t':
                return containsWholeText(true);
            case '\n':
                return new Evaluator.IndexEquals(consumeIndex());
            case 11:
                return new Evaluator.IndexGreaterThan(consumeIndex());
            case '\f':
                return is();
            case '\r':
                return new Evaluator.IndexLessThan(consumeIndex());
            case 14:
                return has();
            case 15:
                return not();
            case 16:
                return new Evaluator.IsRoot();
            case 17:
                return new Evaluator.IsEmpty();
            case 18:
                return contains(true);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return new Evaluator.MatchText();
            case 20:
                return new Evaluator.IsLastChild();
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return matches(false);
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return matchesWholeText(true);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new Evaluator.IsFirstOfType();
            case 24:
                return new Evaluator.IsOnlyOfType();
            case 25:
                return matches(true);
            case 26:
                return containsWholeText(false);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new Evaluator.IsLastOfType();
            default:
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.query, this.tq.remainder());
        }
    }

    public Evaluator parse() {
        this.tq.consumeWhitespace();
        boolean matchesAny = this.tq.matchesAny(Combinators);
        List<Evaluator> list = this.evals;
        if (matchesAny) {
            list.add(new StructuralEvaluator.Root());
            combinator(this.tq.consume());
        } else {
            list.add(consumeEvaluator());
        }
        while (!this.tq.isEmpty()) {
            boolean consumeWhitespace = this.tq.consumeWhitespace();
            if (this.tq.matchesAny(Combinators)) {
                combinator(this.tq.consume());
            } else if (consumeWhitespace) {
                combinator(' ');
            } else {
                this.evals.add(consumeEvaluator());
            }
        }
        int size = this.evals.size();
        List<Evaluator> list2 = this.evals;
        if (size == 1) {
            return list2.get(0);
        }
        return new CombiningEvaluator.And(list2);
    }

    public String toString() {
        return this.query;
    }

    public static Evaluator parse(String str) {
        try {
            return new QueryParser(str).parse();
        } catch (IllegalArgumentException e) {
            throw new Selector.SelectorParseException(e.getMessage());
        }
    }
}
