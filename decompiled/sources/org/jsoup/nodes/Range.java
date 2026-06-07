package org.jsoup.nodes;

import java.util.Objects;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Range {
    static final Range Untracked;
    private static final Position UntrackedPos;
    private final Position end;
    private final Position start;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class AttributeRange {
        static final AttributeRange UntrackedAttr;
        private final Range nameRange;
        private final Range valueRange;

        static {
            Range range = Range.Untracked;
            UntrackedAttr = new AttributeRange(range, range);
        }

        public AttributeRange(Range range, Range range2) {
            this.nameRange = range;
            this.valueRange = range2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AttributeRange attributeRange = (AttributeRange) obj;
            if (!this.nameRange.equals(attributeRange.nameRange)) {
                return false;
            }
            return this.valueRange.equals(attributeRange.valueRange);
        }

        public int hashCode() {
            return Objects.hash(this.nameRange, this.valueRange);
        }

        public Range nameRange() {
            return this.nameRange;
        }

        public String toString() {
            StringBuilder borrowBuilder = StringUtil.borrowBuilder();
            borrowBuilder.append(this.nameRange);
            borrowBuilder.append('=');
            borrowBuilder.append(this.valueRange);
            return StringUtil.releaseBuilder(borrowBuilder);
        }

        public Range valueRange() {
            return this.valueRange;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Position {
        private final int columnNumber;
        private final int lineNumber;
        private final int pos;

        public Position(int i, int i2, int i3) {
            this.pos = i;
            this.lineNumber = i2;
            this.columnNumber = i3;
        }

        public int columnNumber() {
            return this.columnNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Position position = (Position) obj;
                if (this.pos == position.pos && this.lineNumber == position.lineNumber && this.columnNumber == position.columnNumber) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.pos), Integer.valueOf(this.lineNumber), Integer.valueOf(this.columnNumber));
        }

        public boolean isTracked() {
            if (this != Range.UntrackedPos) {
                return true;
            }
            return false;
        }

        public int lineNumber() {
            return this.lineNumber;
        }

        public int pos() {
            return this.pos;
        }

        public String toString() {
            return this.lineNumber + "," + this.columnNumber + ":" + this.pos;
        }
    }

    static {
        Position position = new Position(-1, -1, -1);
        UntrackedPos = position;
        Untracked = new Range(position, position);
    }

    public Range(Position position, Position position2) {
        this.start = position;
        this.end = position2;
    }

    public static Range of(Node node, boolean z) {
        String str;
        if (z) {
            str = SharedConstants.RangeKey;
        } else {
            str = SharedConstants.EndRangeKey;
        }
        if (!node.hasAttributes()) {
            return Untracked;
        }
        Object userData = node.attributes().userData(str);
        if (userData != null) {
            return (Range) userData;
        }
        return Untracked;
    }

    public Position end() {
        return this.end;
    }

    public int endPos() {
        return this.end.pos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.start.equals(range.start)) {
            return false;
        }
        return this.end.equals(range.end);
    }

    public int hashCode() {
        return Objects.hash(this.start, this.end);
    }

    public boolean isImplicit() {
        if (!isTracked()) {
            return false;
        }
        return this.start.equals(this.end);
    }

    public boolean isTracked() {
        if (this != Untracked) {
            return true;
        }
        return false;
    }

    public Position start() {
        return this.start;
    }

    public int startPos() {
        return this.start.pos;
    }

    public String toString() {
        return this.start + "-" + this.end;
    }
}
