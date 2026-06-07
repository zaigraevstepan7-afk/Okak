package okhttp3.internal.idn;

import defpackage.ok;
import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/idn/IdnaMappingTable;", "", "", "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "codePoint", "findSectionsIndex", "(I)I", "position", "limit", "findRangesOffset", "(III)I", "Lok;", "sink", "", "map", "(ILok;)Z", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class IdnaMappingTable {
    private final String mappings;
    private final String ranges;
    private final String sections;

    public IdnaMappingTable(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.sections = str;
        this.ranges = str2;
        this.mappings = str3;
    }

    private final int findRangesOffset(int codePoint, int position, int limit) {
        int i;
        int i2 = codePoint & 127;
        int i3 = limit - 1;
        while (true) {
            if (position <= i3) {
                i = (position + i3) / 2;
                int B = sn0.B(i2, this.ranges.charAt(i * 4));
                if (B < 0) {
                    i3 = i - 1;
                } else {
                    if (B <= 0) {
                        break;
                    }
                    position = i + 1;
                }
            } else {
                i = (-position) - 1;
                break;
            }
        }
        if (i >= 0) {
            return i * 4;
        }
        return ((-i) - 2) * 4;
    }

    private final int findSectionsIndex(int codePoint) {
        int i;
        int i2 = (codePoint & 2097024) >> 7;
        int length = (this.sections.length() / 4) - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= length) {
                i = (i3 + length) / 2;
                int B = sn0.B(i2, IdnaMappingTableKt.read14BitInt(this.sections, i * 4));
                if (B < 0) {
                    length = i - 1;
                } else {
                    if (B <= 0) {
                        break;
                    }
                    i3 = i + 1;
                }
            } else {
                i = (-i3) - 1;
                break;
            }
        }
        if (i >= 0) {
            return i * 4;
        }
        return ((-i) - 2) * 4;
    }

    public final String getMappings() {
        return this.mappings;
    }

    public final String getRanges() {
        return this.ranges;
    }

    public final String getSections() {
        return this.sections;
    }

    public final boolean map(int codePoint, ok sink) {
        int length;
        sink.getClass();
        int findSectionsIndex = findSectionsIndex(codePoint);
        int read14BitInt = IdnaMappingTableKt.read14BitInt(this.sections, findSectionsIndex + 2);
        if (findSectionsIndex + 4 < this.sections.length()) {
            length = IdnaMappingTableKt.read14BitInt(this.sections, findSectionsIndex + 6);
        } else {
            length = this.ranges.length() / 4;
        }
        int findRangesOffset = findRangesOffset(codePoint, read14BitInt, length);
        char charAt = this.ranges.charAt(findRangesOffset + 1);
        if (charAt >= 0 && charAt < '@') {
            int read14BitInt2 = IdnaMappingTableKt.read14BitInt(this.ranges, findRangesOffset + 2);
            sink.B(read14BitInt2, charAt + read14BitInt2, this.mappings);
            return true;
        }
        if ('@' <= charAt && charAt < 'P') {
            sink.f(codePoint - (this.ranges.charAt(findRangesOffset + 3) | (((charAt & 15) << 14) | (this.ranges.charAt(findRangesOffset + 2) << 7))));
            return true;
        }
        if ('P' <= charAt && charAt < '`') {
            sink.f(codePoint + (this.ranges.charAt(findRangesOffset + 3) | ((charAt & 15) << 14) | (this.ranges.charAt(findRangesOffset + 2) << 7)));
            return true;
        }
        if (charAt == 'w') {
            return true;
        }
        if (charAt == 'x') {
            sink.f(codePoint);
            return true;
        }
        if (charAt == 'y') {
            sink.f(codePoint);
            return false;
        }
        if (charAt == 'z') {
            sink.writeByte(this.ranges.charAt(findRangesOffset + 2));
            return true;
        }
        if (charAt == '{') {
            sink.writeByte(this.ranges.charAt(findRangesOffset + 2) | 128);
            return true;
        }
        if (charAt == '|') {
            sink.writeByte(this.ranges.charAt(findRangesOffset + 2));
            sink.writeByte(this.ranges.charAt(findRangesOffset + 3));
            return true;
        }
        if (charAt == '}') {
            sink.writeByte(this.ranges.charAt(findRangesOffset + 2) | 128);
            sink.writeByte(this.ranges.charAt(findRangesOffset + 3));
            return true;
        }
        if (charAt == '~') {
            sink.writeByte(this.ranges.charAt(findRangesOffset + 2));
            sink.writeByte(this.ranges.charAt(findRangesOffset + 3) | 128);
            return true;
        }
        if (charAt == 127) {
            sink.writeByte(this.ranges.charAt(findRangesOffset + 2) | 128);
            sink.writeByte(this.ranges.charAt(findRangesOffset + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + codePoint).toString());
    }
}
