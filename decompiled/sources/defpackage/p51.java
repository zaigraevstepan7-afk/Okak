package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p51 {
    public static final am1 m = new am1("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final am1 n = new am1("\\{(.+?)\\}");
    public static final am1 o = new am1("http[s]?://");
    public static final am1 p = new am1(".*");
    public static final am1 q = new am1("([^/]*?|)");
    public static final am1 r = new am1("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final b52 d;
    public final b52 e;
    public final rr0 f;
    public boolean g;
    public final rr0 h;
    public final rr0 i;
    public final rr0 j;
    public final b52 k;
    public final boolean l;

    public p51(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.d = new b52(new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i2 = i;
                p51 p51Var = this.f;
                switch (i2) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i3 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i3) {
                                            String quote = Pattern.quote(str6.substring(i3, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i3 = a.l().f + 1;
                                    }
                                    if (i3 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i3));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.e = new b52(new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i22 = i2;
                p51 p51Var = this.f;
                switch (i22) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i3 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i3) {
                                            String quote = Pattern.quote(str6.substring(i3, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i3 = a.l().f + 1;
                                    }
                                    if (i3 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i3));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        de0 de0Var = new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i22 = i3;
                p51 p51Var = this.f;
                switch (i22) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i32 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i32) {
                                            String quote = Pattern.quote(str6.substring(i32, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = a.l().f + 1;
                                    }
                                    if (i32 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i32));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        };
        xt0 xt0Var = xt0.f;
        this.f = lo.O(xt0Var, de0Var);
        final int i4 = 3;
        this.h = lo.O(xt0Var, new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i22 = i4;
                p51 p51Var = this.f;
                switch (i22) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i32 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i32) {
                                            String quote = Pattern.quote(str6.substring(i32, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = a.l().f + 1;
                                    }
                                    if (i32 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i32));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.i = lo.O(xt0Var, new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i22 = i5;
                p51 p51Var = this.f;
                switch (i22) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i32 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i32) {
                                            String quote = Pattern.quote(str6.substring(i32, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = a.l().f + 1;
                                    }
                                    if (i32 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i32));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.j = lo.O(xt0Var, new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i22 = i6;
                p51 p51Var = this.f;
                switch (i22) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i32 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i32) {
                                            String quote = Pattern.quote(str6.substring(i32, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = a.l().f + 1;
                                    }
                                    if (i32 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i32));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.k = new b52(new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i22 = i7;
                p51 p51Var = this.f;
                switch (i22) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i32 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i32) {
                                            String quote = Pattern.quote(str6.substring(i32, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = a.l().f + 1;
                                    }
                                    if (i32 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i32));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new b52(new de0(this) { // from class: m51
            public final /* synthetic */ p51 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                List list;
                int i22 = i8;
                p51 p51Var = this.f;
                switch (i22) {
                    case 0:
                        String str2 = p51Var.c;
                        if (str2 == null) {
                            return null;
                        }
                        return new am1(str2, 0);
                    case 1:
                        String str3 = p51Var.a;
                        am1 am1Var = p51.r;
                        am1Var.getClass();
                        return Boolean.valueOf(am1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = p51Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() <= 1) {
                                    String str6 = (String) wn.h0(queryParameters);
                                    if (str6 == null) {
                                        p51Var.g = true;
                                        str6 = str5;
                                    }
                                    o51 o51Var = new o51();
                                    int i32 = 0;
                                    for (q4 a = am1.a(p51.n, str6); a != null; a = a.r()) {
                                        uz0 b = ((wz0) a.h).b(1);
                                        b.getClass();
                                        o51Var.b.add(b.a);
                                        if (a.l().e > i32) {
                                            String quote = Pattern.quote(str6.substring(i32, a.l().e));
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = a.l().f + 1;
                                    }
                                    if (i32 < str6.length()) {
                                        String quote2 = Pattern.quote(str6.substring(i32));
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    o51Var.a = p51.g(sb.toString());
                                    linkedHashMap.put(str5, o51Var);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = p51Var.a;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        p51.a(fragment, arrayList2, sb2);
                        return new xd1(arrayList2, sb2.toString());
                    case 4:
                        xd1 xd1Var = (xd1) p51Var.h.getValue();
                        if (xd1Var == null || (list = (List) xd1Var.e) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        xd1 xd1Var2 = (xd1) p51Var.h.getValue();
                        if (xd1Var2 == null) {
                            return null;
                        }
                        return (String) xd1Var2.f;
                    case 6:
                        String str8 = (String) p51Var.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        return new am1(str8, 0);
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.e.matcher(str).find()) {
            String pattern = o.e.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        q4 n2 = xn.n(matcher, 0, str);
        if (n2 != null) {
            a(str.substring(0, n2.l().e), arrayList, sb);
            if (!p.e.matcher(sb).find() && !q.e.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = g(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (q4 a = am1.a(n, str); a != null; a = a.r()) {
            uz0 b = ((wz0) a.h).b(1);
            b.getClass();
            arrayList.add(b.a);
            if (a.l().e > i) {
                String quote = Pattern.quote(str.substring(i, a.l().e));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = q.e.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = a.l().f + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static String g(String str) {
        if (i32.G(str, "\\Q", false) && i32.G(str, "\\E", false)) {
            return p32.B(str, ".*", "\\E.*\\Q");
        }
        if (i32.G(str, "\\.\\*", false)) {
            return p32.B(str, "\\.\\*", ".*");
        }
        return str;
    }

    public final int b(Uri uri) {
        if (uri != null) {
            List<String> pathSegments = uri.getPathSegments();
            Uri parse = Uri.parse(this.a);
            parse.getClass();
            List<String> pathSegments2 = parse.getPathSegments();
            pathSegments.getClass();
            pathSegments2.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : pathSegments) {
                if (pathSegments2.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet.size();
        }
        return 0;
    }

    public final ArrayList c() {
        Collection values = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            wn.d0(((o51) it.next()).b, arrayList);
        }
        return wn.q0((List) this.i.getValue(), wn.q0(arrayList, this.b));
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        q4 c;
        q4 c2;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        am1 am1Var = (am1) this.d.getValue();
        if (am1Var != null && (c = am1Var.c(uri.toString())) != null) {
            Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
            if (e(c, v, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, v, linkedHashMap))) {
                String fragment = uri.getFragment();
                am1 am1Var2 = (am1) this.k.getValue();
                if (am1Var2 != null && (c2 = am1Var2.c(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(yn.a0(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            String str2 = (String) obj;
                            uz0 b = ((wz0) c2.h).b(i2);
                            if (b != null) {
                                str = Uri.decode(b.a);
                                str.getClass();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            if (linkedHashMap.get(str2) == null) {
                                try {
                                    str2.getClass();
                                    v.putString(str2, str);
                                    arrayList.add(od2.a);
                                    i = i2;
                                } catch (IllegalArgumentException unused) {
                                }
                            } else {
                                se.s();
                                return null;
                            }
                        } else {
                            xn.U();
                            throw null;
                        }
                    }
                }
                if (go.J(linkedHashMap, new n51(v, 0)).isEmpty()) {
                    return v;
                }
            }
        }
        return null;
    }

    public final boolean e(q4 q4Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(yn.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                String str2 = (String) next;
                uz0 b = ((wz0) q4Var.h).b(i2);
                if (b != null) {
                    str = Uri.decode(b.a);
                    str.getClass();
                }
                if (str == null) {
                    str = "";
                }
                if (map.get(str2) == null) {
                    try {
                        str2.getClass();
                        bundle.putString(str2, str);
                        arrayList2.add(od2.a);
                        i = i2;
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                } else {
                    se.s();
                    return false;
                }
            } else {
                xn.U();
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p51)) {
            if (this.a.equals(((p51) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r19, android.os.Bundle r20, java.util.Map r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
