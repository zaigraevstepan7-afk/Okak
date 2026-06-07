package defpackage;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sl0 implements Converter, c60, ot1, pm0, e42, ql, ob1, g02, gr1 {
    public Object e;
    public Object f;

    public sl0(int i) {
        switch (i) {
            case 6:
                this.e = new ArrayList();
                float[] fArr = new float[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    fArr[i2] = Float.NaN;
                }
                this.f = fArr;
                return;
            case 16:
                this.e = new af2(0);
                this.f = new af2(0);
                return;
            case 18:
                this.e = new i41();
                this.f = new i41();
                return;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                this.e = new q41(new ar0[16]);
                return;
            case 25:
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                return;
            default:
                this.e = new i1(this);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void s(ar0 ar0Var) {
        if (ar0Var.R > 0) {
            if (ar0Var.K.d == wq0.i && !ar0Var.p() && !ar0Var.q() && !ar0Var.S && ar0Var.I()) {
                d21 d21Var = ar0Var.J.f;
                if ((d21Var.h & 256) != 0) {
                    while (d21Var != null) {
                        if ((d21Var.g & 256) != 0) {
                            rz rzVar = d21Var;
                            ?? r5 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof kf0) {
                                    kf0 kf0Var = (kf0) rzVar;
                                    kf0Var.U(hp.K(kf0Var, 256));
                                } else if ((rzVar.g & 256) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var2 = rzVar.t;
                                    int i = 0;
                                    rzVar = rzVar;
                                    r5 = r5;
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                rzVar = d21Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r5.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r5.b(d21Var2);
                                            }
                                        }
                                        d21Var2 = d21Var2.j;
                                        rzVar = rzVar;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                rzVar = hp.l(r5);
                            }
                        }
                        if ((d21Var.h & 256) == 0) {
                            break;
                        } else {
                            d21Var = d21Var.j;
                        }
                    }
                }
            }
            ar0Var.Q = false;
            q41 z = ar0Var.z();
            Object[] objArr = z.e;
            int i2 = z.g;
            for (int i3 = 0; i3 < i2; i3++) {
                s((ar0) objArr[i3]);
            }
        }
    }

    public void A() {
        if (((fk0) this.f) != null) {
            this.f = null;
            ((kn) this.e).Q0(true);
        }
    }

    public void B() {
        if (((br1) this.e).h) {
            nl1 nl1Var = (nl1) this.f;
            if (nl1Var == null) {
                nl1Var = new nl1(this);
            }
            this.f = nl1Var;
            try {
                fu0.class.getDeclaredConstructor(null);
                nl1 nl1Var2 = (nl1) this.f;
                if (nl1Var2 != null) {
                    nl1Var2.a.add(fu0.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + fu0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        se.p("Can not perform this action after onSaveInstanceState");
    }

    @Override // defpackage.gr1
    public Object a(Object obj) {
        return ((oe0) this.f).invoke(obj);
    }

    @Override // defpackage.e42
    public void b(d42 d42Var) {
        int i;
        x31 x31Var = (x31) this.f;
        x31Var.a();
        c41 c41Var = (c41) d42Var.f;
        Object[] objArr = c41Var.b;
        long[] jArr = c41Var.c;
        int i2 = c41Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object b = ((hs0) this.e).b(obj);
            int d = x31Var.d(b);
            if (d >= 0) {
                i = x31Var.c[d];
            } else {
                i = 0;
            }
            if (i == 7) {
                d42Var.remove(obj);
            } else {
                x31Var.g(i + 1, b);
            }
            i2 = i3;
        }
    }

    @Override // defpackage.g02
    public float c(float f, float f2) {
        uy uyVar = (uy) this.e;
        int p = uyVar.p();
        je1 je1Var = uyVar.p;
        int i = ((fd1) je1Var.getValue()).c + p;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = uyVar.e;
        if (f < 0.0f) {
            i2++;
        }
        int i3 = 0;
        int p2 = go.p(((int) (f2 / i)) + i2, 0, uyVar.o());
        uyVar.p();
        int i4 = ((fd1) je1Var.getValue()).c;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i5 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int abs = Math.abs((go.p(go.p(p2, i5, (int) j3), 0, uyVar.o()) - i2) * i) - i;
        if (abs >= 0) {
            i3 = abs;
        }
        if (i3 == 0) {
            return i3;
        }
        return Math.signum(f) * i3;
    }

    @Override // defpackage.ql
    public void cancel() {
        if (!((mf) this.f).compareAndSet(1, 1)) {
            ((qd) this.e).invoke();
        }
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        responseBody.getClass();
        ov1 ov1Var = (ov1) this.f;
        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) this.e;
        ov1Var.getClass();
        deserializationStrategy.getClass();
        String string = responseBody.string();
        string.getClass();
        return ((Json) ov1Var.f).decodeFromString(deserializationStrategy, string);
    }

    @Override // defpackage.g02
    public float d(float f) {
        uy uyVar = (uy) this.e;
        xl1 xl1Var = uyVar.n().n;
        List list = uyVar.n().a;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            m01 m01Var = (m01) list.get(i);
            xn.C(uyVar.n());
            int i2 = uyVar.n().f;
            int i3 = uyVar.n().d;
            int i4 = uyVar.n().b;
            int i5 = m01Var.j;
            uyVar.o();
            xl1Var.getClass();
            float f4 = i5 - 0.0f;
            if (f4 <= 0.0f && f4 > f2) {
                f2 = f4;
            }
            if (f4 >= 0.0f && f4 < f3) {
                f3 = f4;
            }
        }
        if (f2 == Float.NEGATIVE_INFINITY) {
            f2 = f3;
        }
        if (f3 == Float.POSITIVE_INFINITY) {
            f3 = f2;
        }
        if (!uyVar.c()) {
            if (lo.N(uyVar, f)) {
                f2 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
        }
        if (!uyVar.b()) {
            f2 = 0.0f;
            if (!lo.N(uyVar, f)) {
                f3 = 0.0f;
            }
        }
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f3);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float floatValue3 = ((Number) ((wc1) this.f).invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
            nl0.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
        }
        if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return floatValue3;
    }

    @Override // defpackage.e42
    public boolean e(Object obj, Object obj2) {
        hs0 hs0Var = (hs0) this.e;
        return sn0.r(hs0Var.b(obj), hs0Var.b(obj2));
    }

    @Override // defpackage.ot1
    public int f(int i) {
        TextPaint textPaint = (TextPaint) this.f;
        CharSequence charSequence = (CharSequence) this.e;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        if (textRunCursor == -1 || ((TextPaint) this.f).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // defpackage.ot1
    public int g(int i) {
        TextPaint textPaint = (TextPaint) this.f;
        CharSequence charSequence = (CharSequence) this.e;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        if (textRunCursor == -1 || ((TextPaint) this.f).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // defpackage.gr1
    public Object h(kq1 kq1Var, Object obj) {
        return ((se0) this.e).invoke(kq1Var, obj);
    }

    @Override // defpackage.c60
    public Object i() {
        return (qd2) this.e;
    }

    @Override // defpackage.ob1
    public List j(Integer num) {
        List j = ((ob1) this.e).j(null);
        jz1 jz1Var = (jz1) this.f;
        int i = jz1Var.v;
        if (i < 0) {
            return j;
        }
        return wn.q0(j, lo.m(jz1Var, num, i, Integer.valueOf(jz1Var.E(jz1Var.b, i))));
    }

    @Override // defpackage.ot1
    public int k(int i) {
        TextPaint textPaint = (TextPaint) this.f;
        CharSequence charSequence = (CharSequence) this.e;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // defpackage.ot1
    public int l(int i) {
        TextPaint textPaint = (TextPaint) this.f;
        CharSequence charSequence = (CharSequence) this.e;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.c60
    public boolean m(CharSequence charSequence, int i, int i2, kc2 kc2Var) {
        Spannable spannableString;
        if ((kc2Var.c & 4) > 0) {
            return true;
        }
        if (((qd2) this.e) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.e = new qd2(spannableString);
        }
        ((xl1) this.f).getClass();
        ((qd2) this.e).setSpan(new lc2(kc2Var), i, i2, 33);
        return true;
    }

    public boolean n(long j) {
        Object obj;
        List list = (List) ((sl0) this.f).e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (hp.v(((sh1) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        sh1 sh1Var = (sh1) obj;
        if (sh1Var == null) {
            return false;
        }
        return sh1Var.h;
    }

    public i82 o(List list) {
        h50 h50Var;
        Exception e;
        long a;
        h50 h50Var2;
        d92 d92Var = null;
        try {
            int size = list.size();
            int i = 0;
            h50Var = null;
            while (i < size) {
                try {
                    h50Var2 = (h50) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    h50Var2.a((i50) this.f);
                    i++;
                    h50Var = h50Var2;
                } catch (Exception e3) {
                    e = e3;
                    h50Var = h50Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((i50) this.f).a.b());
                    sb2.append(", composition=");
                    sb2.append(((i50) this.f).c());
                    sb2.append(", selection=");
                    i50 i50Var = (i50) this.f;
                    sb2.append((Object) d92.h(fr1.a(i50Var.b, i50Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    wn.l0(list, sb, new r(13, h50Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            i50 i50Var2 = (i50) this.f;
            i50Var2.getClass();
            rc rcVar = new rc(i50Var2.a.toString());
            i50 i50Var3 = (i50) this.f;
            long a2 = fr1.a(i50Var3.b, i50Var3.c);
            d92 d92Var2 = new d92(a2);
            if (!d92.g(((i82) this.e).b)) {
                d92Var = d92Var2;
            }
            if (d92Var != null) {
                a = d92Var.a;
            } else {
                a = fr1.a(d92.e(a2), d92.f(a2));
            }
            i82 i82Var = new i82(rcVar, a, ((i50) this.f).c());
            this.e = i82Var;
            return i82Var;
        } catch (Exception e4) {
            h50Var = null;
            e = e4;
        }
    }

    public void p(Enum r3, float f) {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.add(r3);
        if (((float[]) this.f).length < arrayList.size()) {
            this.f = Arrays.copyOf((float[]) this.f, arrayList.size() + 2);
        }
        ((float[]) this.f)[arrayList.size() - 1] = f;
    }

    public Bundle q(String str) {
        Bundle bundle;
        br1 br1Var = (br1) this.e;
        if (br1Var.g) {
            Bundle bundle2 = br1Var.f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = bundle2.getBundle(str);
                if (bundle == null) {
                    yq1.u(str);
                    throw null;
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                br1Var.f = null;
            }
            return bundle;
        }
        se.p("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:418:0x0873, code lost:
    
        if (r5 == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0149, code lost:
    
        if (defpackage.ru1.j(4, r6).isEmpty() != false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0852 A[LOOP:9: B:400:0x0835->B:409:0x0852, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0859 A[EDGE_INSN: B:410:0x0859->B:411:0x0859 BREAK  A[LOOP:9: B:400:0x0835->B:409:0x0852], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0a7f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0975  */
    /* JADX WARN: Type inference failed for: r2v87, types: [l60] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r47v2, types: [java.lang.Throwable, h1] */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r47v4 */
    /* JADX WARN: Type inference failed for: r7v90, types: [android.view.ViewParent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.h1 r(int r48) {
        /*
            Method dump skipped, instructions count: 3218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl0.r(int):h1");
    }

    public InputMethodManager t() {
        return (InputMethodManager) ((rr0) this.f).getValue();
    }

    @Override // defpackage.pm0
    public lm0 toInstant() {
        throw new IllegalArgumentException(((String) this.e) + " when parsing an Instant from \"" + fc2.K(64, (String) this.f) + AbstractJsonLexerKt.STRING);
    }

    public j01 u() {
        return (j01) ((je1) this.f).getValue();
    }

    public ar1 v() {
        ar1 ar1Var;
        br1 br1Var = (br1) this.e;
        synchronized (br1Var.c) {
            Iterator it = br1Var.d.entrySet().iterator();
            do {
                ar1Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ar1 ar1Var2 = (ar1) entry.getValue();
                if (sn0.r(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    ar1Var = ar1Var2;
                }
            } while (ar1Var == null);
        }
        return ar1Var;
    }

    public AutofillId w(long j) {
        return ((ContentCaptureSession) this.f).newAutofillId(((View) this.e).getAutofillId(), j);
    }

    public void x(Bundle bundle) {
        br1 br1Var = (br1) this.e;
        cr1 cr1Var = br1Var.a;
        if (!br1Var.e) {
            br1Var.a();
        }
        if (cr1Var.g().c.compareTo(nu0.h) < 0) {
            if (!br1Var.g) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    if (bundle3 != null) {
                        bundle2 = bundle3;
                    } else {
                        yq1.u("androidx.lifecycle.BundlableSavedStateRegistry.key");
                        throw null;
                    }
                }
                br1Var.f = bundle2;
                br1Var.g = true;
                return;
            }
            se.p("SavedStateRegistry was already restored.");
            return;
        }
        y61.i(cr1Var.g().c, "performRestore cannot be called when owner is ");
    }

    public void y(Bundle bundle) {
        br1 br1Var = (br1) this.e;
        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
        Bundle bundle2 = br1Var.f;
        if (bundle2 != null) {
            v.putAll(bundle2);
        }
        synchronized (br1Var.c) {
            for (Map.Entry entry : br1Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((ar1) entry.getValue()).a();
                str.getClass();
                v.putBundle(str, a);
            }
        }
        if (!v.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", v);
        }
    }

    public void z(String str, ar1 ar1Var) {
        ar1Var.getClass();
        br1 br1Var = (br1) this.e;
        synchronized (br1Var.c) {
            if (!br1Var.d.containsKey(str)) {
                br1Var.d.put(str, ar1Var);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public /* synthetic */ sl0(Object obj, View view) {
        this.f = obj;
        this.e = view;
    }

    public /* synthetic */ sl0(Object obj, Object obj2) {
        this.e = obj;
        this.f = obj2;
    }

    public sl0(br1 br1Var) {
        this.e = br1Var;
        this.f = new sl0((Object) br1Var);
    }

    public sl0(View view) {
        this.e = view;
        this.f = lo.O(xt0.f, new v3(this, 15));
    }

    public /* synthetic */ sl0(Object obj) {
        this.e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sl0(w5 w5Var) {
        this(2);
        this.f = w5Var;
    }
}
