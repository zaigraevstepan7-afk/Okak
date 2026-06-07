package okhttp3.internal.publicsuffix;

import defpackage.bl;
import defpackage.bo;
import defpackage.i32;
import defpackage.kv1;
import defpackage.l60;
import defpackage.l90;
import defpackage.o40;
import defpackage.p40;
import defpackage.se;
import defpackage.sm;
import defpackage.sn0;
import defpackage.wn;
import defpackage.xl1;
import defpackage.xn;
import defpackage.xp1;
import defpackage.yq1;
import defpackage.yx;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "publicSuffixList", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "getEffectiveTldPlusOne", "", "domain", "splitDomain", "", "findMatchingRule", "domainLabels", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    private static final bl WILDCARD_LABEL;
    private static PublicSuffixDatabase instance;
    private final PublicSuffixList publicSuffixList;

    static {
        bl blVar = bl.h;
        WILDCARD_LABEL = new bl(Arrays.copyOf(new byte[]{42}, 1));
        PREVAILING_RULE = xn.E("*");
        instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
    }

    public PublicSuffixDatabase(PublicSuffixList publicSuffixList) {
        publicSuffixList.getClass();
        this.publicSuffixList = publicSuffixList;
    }

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String str;
        String str2;
        String str3;
        List<String> list;
        this.publicSuffixList.ensureLoaded();
        int size = domainLabels.size();
        bl[] blVarArr = new bl[size];
        for (int i = 0; i < size; i++) {
            bl blVar = bl.h;
            blVarArr[i] = xl1.p(domainLabels.get(i));
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 < size) {
                str2 = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), blVarArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            } else {
                str2 = null;
                break;
            }
        }
        if (size > 1) {
            bl[] blVarArr2 = (bl[]) blVarArr.clone();
            int length = blVarArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                blVarArr2[i3] = WILDCARD_LABEL;
                str3 = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), blVarArr2, i3);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                String binarySearch = INSTANCE.binarySearch(this.publicSuffixList.getExceptionBytes(), blVarArr, i5);
                if (binarySearch != null) {
                    str = binarySearch;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return i32.V("!".concat(str), new char[]{'.'});
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        List<String> list2 = l60.e;
        if (str2 != null) {
            list = i32.V(str2, new char[]{'.'});
        } else {
            list = list2;
        }
        if (str3 != null) {
            list2 = i32.V(str3, new char[]{'.'});
        }
        if (list.size() > list2.size()) {
            return list;
        }
        return list2;
    }

    private final List<String> splitDomain(String domain) {
        int i = 0;
        List<String> V = i32.V(domain, new char[]{'.'});
        if (sn0.r(wn.n0(V), "")) {
            int size = V.size() - 1;
            if (size < 0) {
                size = 0;
            }
            if (size >= 0) {
                if (size == 0) {
                    return l60.e;
                }
                if (size >= V.size()) {
                    return wn.A0(V);
                }
                if (size == 1) {
                    return xn.E(wn.g0(V));
                }
                ArrayList arrayList = new ArrayList(size);
                Iterator<T> it = V.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                    i++;
                    if (i == size) {
                        break;
                    }
                }
                return xn.H(arrayList);
            }
            se.e(l90.i("Requested element count ", size, " is less than zero."));
            return null;
        }
        return V;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        domain.getClass();
        String unicode = IDN.toUnicode(domain);
        unicode.getClass();
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        int i = 0;
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        int i2 = size - size2;
        List<String> splitDomain2 = splitDomain(domain);
        splitDomain2.getClass();
        kv1 boVar = new bo(splitDomain2, 0);
        if (i2 >= 0) {
            if (i2 != 0) {
                if (boVar instanceof p40) {
                    boVar = ((p40) boVar).a(i2);
                } else {
                    boVar = new o40(boVar, i2);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            for (Object obj : boVar) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ".");
                }
                xp1.g(sb, obj, null);
            }
            sb.append((CharSequence) "");
            return sb.toString();
        }
        se.e(l90.i("Requested element count ", i2, " is less than zero."));
        return null;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "Lbl;", "", "labels", "", "labelIndex", "", "binarySearch", "(Lbl;[Lbl;I)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "Lod2;", "resetForTests$okhttp", "resetForTests", "WILDCARD_LABEL", "Lbl;", "", "PREVAILING_RULE", "Ljava/util/List;", "", "EXCEPTION_MARKER", "C", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(bl blVar, bl[] blVarArr, int i) {
            int i2;
            int and;
            boolean z;
            int and2;
            int d = blVar.d();
            int i3 = 0;
            while (i3 < d) {
                int i4 = (i3 + d) / 2;
                while (i4 > -1 && blVar.i(i4) != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (blVar.i(i2) == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        and = _UtilCommonKt.and(blVarArr[i8].i(i9), 255);
                        z = z3;
                    }
                    and2 = and - _UtilCommonKt.and(blVar.i(i5 + i10), 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (blVarArr[i8].d() == i9) {
                        if (i8 == blVarArr.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    } else {
                        z2 = z;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int d2 = blVarArr[i8].d() - i9;
                        int length = blVarArr.length;
                        for (int i12 = i8 + 1; i12 < length; i12++) {
                            d2 += blVarArr[i12].d();
                        }
                        if (d2 >= i11) {
                            if (d2 <= i11) {
                                return blVar.o(i5, i7 + i5).n(sm.a);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                d = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public final void resetForTests$okhttp() {
            PublicSuffixDatabase.instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
        }

        private Companion() {
        }
    }
}
