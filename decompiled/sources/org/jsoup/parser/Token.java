package org.jsoup.parser;

import defpackage.l90;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Range;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class Token {
    static final int Unset = -1;
    private int endPos;
    private int startPos;
    final TokenType type;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class CData extends Character {
        public CData(String str) {
            data(str);
        }

        @Override // org.jsoup.parser.Token.Character
        public String toString() {
            return l90.p(new StringBuilder("<![CDATA["), getData(), "]]>");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Character extends Token implements Cloneable {
        private String data;

        public Character() {
            super(TokenType.Character);
        }

        public Character clone() {
            try {
                return (Character) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public Character data(String str) {
            this.data = str;
            return this;
        }

        public String getData() {
            return this.data;
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            this.data = null;
            return this;
        }

        public String toString() {
            return getData();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Doctype extends Token {
        boolean forceQuirks;
        final StringBuilder name;
        String pubSysKey;
        final StringBuilder publicIdentifier;
        final StringBuilder systemIdentifier;

        public Doctype() {
            super(TokenType.Doctype);
            this.name = new StringBuilder();
            this.pubSysKey = null;
            this.publicIdentifier = new StringBuilder();
            this.systemIdentifier = new StringBuilder();
            this.forceQuirks = false;
        }

        public String getName() {
            return this.name.toString();
        }

        public String getPubSysKey() {
            return this.pubSysKey;
        }

        public String getPublicIdentifier() {
            return this.publicIdentifier.toString();
        }

        public String getSystemIdentifier() {
            return this.systemIdentifier.toString();
        }

        public boolean isForceQuirks() {
            return this.forceQuirks;
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            Token.reset(this.name);
            this.pubSysKey = null;
            Token.reset(this.publicIdentifier);
            Token.reset(this.systemIdentifier);
            this.forceQuirks = false;
            return this;
        }

        public String toString() {
            return l90.p(new StringBuilder("<!doctype "), getName(), ">");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class EOF extends Token {
        public EOF() {
            super(TokenType.EOF);
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            return this;
        }

        public String toString() {
            return "";
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class EndTag extends Tag {
        public EndTag(TreeBuilder treeBuilder) {
            super(TokenType.EndTag, treeBuilder);
        }

        @Override // org.jsoup.parser.Token.Tag
        public String toString() {
            return l90.p(new StringBuilder("</"), toStringName(), ">");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class StartTag extends Tag {
        public StartTag(TreeBuilder treeBuilder) {
            super(TokenType.StartTag, treeBuilder);
        }

        public StartTag nameAttr(String str, Attributes attributes) {
            this.tagName = str;
            this.attributes = attributes;
            this.normalName = ParseSettings.normalName(str);
            return this;
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        public Tag reset() {
            super.reset();
            this.attributes = null;
            return this;
        }

        @Override // org.jsoup.parser.Token.Tag
        public String toString() {
            String str;
            if (isSelfClosing()) {
                str = "/>";
            } else {
                str = ">";
            }
            if (hasAttributes() && this.attributes.size() > 0) {
                return "<" + toStringName() + " " + this.attributes.toString() + str;
            }
            return l90.p(new StringBuilder("<"), toStringName(), str);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    private Token(TokenType tokenType) {
        this.endPos = -1;
        this.type = tokenType;
    }

    public static void reset(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public final Character asCharacter() {
        return (Character) this;
    }

    public final Comment asComment() {
        return (Comment) this;
    }

    public final Doctype asDoctype() {
        return (Doctype) this;
    }

    public final EndTag asEndTag() {
        return (EndTag) this;
    }

    public final StartTag asStartTag() {
        return (StartTag) this;
    }

    public int endPos() {
        return this.endPos;
    }

    public final boolean isCData() {
        return this instanceof CData;
    }

    public final boolean isCharacter() {
        if (this.type == TokenType.Character) {
            return true;
        }
        return false;
    }

    public final boolean isComment() {
        if (this.type == TokenType.Comment) {
            return true;
        }
        return false;
    }

    public final boolean isDoctype() {
        if (this.type == TokenType.Doctype) {
            return true;
        }
        return false;
    }

    public final boolean isEOF() {
        if (this.type == TokenType.EOF) {
            return true;
        }
        return false;
    }

    public final boolean isEndTag() {
        if (this.type == TokenType.EndTag) {
            return true;
        }
        return false;
    }

    public final boolean isStartTag() {
        if (this.type == TokenType.StartTag) {
            return true;
        }
        return false;
    }

    public int startPos() {
        return this.startPos;
    }

    public String tokenType() {
        return getClass().getSimpleName();
    }

    public void endPos(int i) {
        this.endPos = i;
    }

    public void startPos(int i) {
        this.startPos = i;
    }

    public Token reset() {
        this.startPos = -1;
        this.endPos = -1;
        return this;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Comment extends Token {
        boolean bogus;
        private final StringBuilder data;
        private String dataS;

        public Comment() {
            super(TokenType.Comment);
            this.data = new StringBuilder();
            this.bogus = false;
        }

        private void ensureData() {
            String str = this.dataS;
            if (str != null) {
                this.data.append(str);
                this.dataS = null;
            }
        }

        public Comment append(String str) {
            ensureData();
            if (this.data.length() == 0) {
                this.dataS = str;
                return this;
            }
            this.data.append(str);
            return this;
        }

        public String getData() {
            String str = this.dataS;
            if (str != null) {
                return str;
            }
            return this.data.toString();
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            super.reset();
            Token.reset(this.data);
            this.dataS = null;
            this.bogus = false;
            return this;
        }

        public String toString() {
            return l90.p(new StringBuilder("<!--"), getData(), "-->");
        }

        public Comment append(char c) {
            ensureData();
            this.data.append(c);
            return this;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class Tag extends Token {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final int MaxAttributes = 512;
        private String attrName;
        int attrNameEnd;
        private final StringBuilder attrNameSb;
        int attrNameStart;
        int attrValEnd;
        int attrValStart;
        private String attrValue;
        private final StringBuilder attrValueSb;
        Attributes attributes;
        private boolean hasAttrName;
        private boolean hasAttrValue;
        private boolean hasEmptyAttrValue;
        protected String normalName;
        boolean selfClosing;
        protected String tagName;
        final boolean trackSource;
        final TreeBuilder treeBuilder;

        public Tag(TokenType tokenType, TreeBuilder treeBuilder) {
            super(tokenType);
            this.selfClosing = $assertionsDisabled;
            this.attrNameSb = new StringBuilder();
            this.hasAttrName = $assertionsDisabled;
            this.attrValueSb = new StringBuilder();
            this.hasAttrValue = $assertionsDisabled;
            this.hasEmptyAttrValue = $assertionsDisabled;
            this.treeBuilder = treeBuilder;
            this.trackSource = treeBuilder.trackSourceRange;
        }

        private void ensureAttrName(int i, int i2) {
            this.hasAttrName = true;
            String str = this.attrName;
            if (str != null) {
                this.attrNameSb.append(str);
                this.attrName = null;
            }
            if (this.trackSource) {
                int i3 = this.attrNameStart;
                if (i3 > -1) {
                    i = i3;
                }
                this.attrNameStart = i;
                this.attrNameEnd = i2;
            }
        }

        private void ensureAttrValue(int i, int i2) {
            this.hasAttrValue = true;
            String str = this.attrValue;
            if (str != null) {
                this.attrValueSb.append(str);
                this.attrValue = null;
            }
            if (this.trackSource) {
                int i3 = this.attrValStart;
                if (i3 > -1) {
                    i = i3;
                }
                this.attrValStart = i;
                this.attrValEnd = i2;
            }
        }

        private void resetPendingAttr() {
            Token.reset(this.attrNameSb);
            this.attrName = null;
            this.hasAttrName = $assertionsDisabled;
            Token.reset(this.attrValueSb);
            this.attrValue = null;
            this.hasEmptyAttrValue = $assertionsDisabled;
            this.hasAttrValue = $assertionsDisabled;
            if (this.trackSource) {
                this.attrValEnd = -1;
                this.attrValStart = -1;
                this.attrNameEnd = -1;
                this.attrNameStart = -1;
            }
        }

        private void trackAttributeRange(String str) {
            if (this.trackSource && isStartTag()) {
                TreeBuilder treeBuilder = asStartTag().treeBuilder;
                CharacterReader characterReader = treeBuilder.reader;
                if (!treeBuilder.settings.preserveAttributeCase()) {
                    str = Normalizer.lowerCase(str);
                }
                if (!this.attributes.sourceRange(str).nameRange().isTracked()) {
                    if (!this.hasAttrValue) {
                        int i = this.attrNameEnd;
                        this.attrValEnd = i;
                        this.attrValStart = i;
                    }
                    int i2 = this.attrNameStart;
                    Range.Position position = new Range.Position(i2, characterReader.lineNumber(i2), characterReader.columnNumber(this.attrNameStart));
                    int i3 = this.attrNameEnd;
                    Range range = new Range(position, new Range.Position(i3, characterReader.lineNumber(i3), characterReader.columnNumber(this.attrNameEnd)));
                    int i4 = this.attrValStart;
                    Range.Position position2 = new Range.Position(i4, characterReader.lineNumber(i4), characterReader.columnNumber(this.attrValStart));
                    int i5 = this.attrValEnd;
                    this.attributes.sourceRange(str, new Range.AttributeRange(range, new Range(position2, new Range.Position(i5, characterReader.lineNumber(i5), characterReader.columnNumber(this.attrValEnd)))));
                }
            }
        }

        public final void appendAttributeName(String str, int i, int i2) {
            String replace = str.replace((char) 0, (char) 65533);
            ensureAttrName(i, i2);
            if (this.attrNameSb.length() == 0) {
                this.attrName = replace;
            } else {
                this.attrNameSb.append(replace);
            }
        }

        public final void appendAttributeValue(String str, int i, int i2) {
            ensureAttrValue(i, i2);
            if (this.attrValueSb.length() == 0) {
                this.attrValue = str;
            } else {
                this.attrValueSb.append(str);
            }
        }

        public final void appendTagName(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            String str2 = this.tagName;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.tagName = replace;
            this.normalName = ParseSettings.normalName(replace);
        }

        public final void finaliseTag() {
            if (this.hasAttrName) {
                newAttribute();
            }
        }

        public final boolean hasAttribute(String str) {
            Attributes attributes = this.attributes;
            if (attributes != null && attributes.hasKey(str)) {
                return true;
            }
            return $assertionsDisabled;
        }

        public final boolean hasAttributeIgnoreCase(String str) {
            Attributes attributes = this.attributes;
            if (attributes != null && attributes.hasKeyIgnoreCase(str)) {
                return true;
            }
            return $assertionsDisabled;
        }

        public final boolean hasAttributes() {
            if (this.attributes != null) {
                return true;
            }
            return $assertionsDisabled;
        }

        public final boolean isSelfClosing() {
            return this.selfClosing;
        }

        public final String name() {
            boolean z;
            String str = this.tagName;
            if (str != null && str.length() != 0) {
                z = $assertionsDisabled;
            } else {
                z = true;
            }
            Validate.isFalse(z);
            return this.tagName;
        }

        public final void newAttribute() {
            String str;
            String str2;
            if (this.attributes == null) {
                this.attributes = new Attributes();
            }
            if (this.hasAttrName && this.attributes.size() < MaxAttributes) {
                if (this.attrNameSb.length() > 0) {
                    str = this.attrNameSb.toString();
                } else {
                    str = this.attrName;
                }
                String trim = str.trim();
                if (trim.length() > 0) {
                    if (this.hasAttrValue) {
                        if (this.attrValueSb.length() > 0) {
                            str2 = this.attrValueSb.toString();
                        } else {
                            str2 = this.attrValue;
                        }
                    } else if (this.hasEmptyAttrValue) {
                        str2 = "";
                    } else {
                        str2 = null;
                    }
                    this.attributes.add(trim, str2);
                    trackAttributeRange(trim);
                }
            }
            resetPendingAttr();
        }

        public final String normalName() {
            return this.normalName;
        }

        @Override // org.jsoup.parser.Token
        public Tag reset() {
            super.reset();
            this.tagName = null;
            this.normalName = null;
            this.selfClosing = $assertionsDisabled;
            this.attributes = null;
            resetPendingAttr();
            return this;
        }

        public final void setEmptyAttributeValue() {
            this.hasEmptyAttrValue = true;
        }

        public abstract String toString();

        public final String toStringName() {
            String str = this.tagName;
            if (str != null) {
                return str;
            }
            return "[unset]";
        }

        public final void appendAttributeValue(char c, int i, int i2) {
            ensureAttrValue(i, i2);
            this.attrValueSb.append(c);
        }

        public final Tag name(String str) {
            this.tagName = str;
            this.normalName = ParseSettings.normalName(str);
            return this;
        }

        public final void appendAttributeValue(int[] iArr, int i, int i2) {
            ensureAttrValue(i, i2);
            for (int i3 : iArr) {
                this.attrValueSb.appendCodePoint(i3);
            }
        }

        public final void appendTagName(char c) {
            appendTagName(String.valueOf(c));
        }

        public final void appendAttributeName(char c, int i, int i2) {
            ensureAttrName(i, i2);
            this.attrNameSb.append(c);
        }
    }
}
