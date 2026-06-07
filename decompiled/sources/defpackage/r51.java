package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class r51 {
    public static final /* synthetic */ int i = 0;
    public final String e;
    public final u51 f;
    public w51 g;
    public final o12 h;

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [u51, java.lang.Object] */
    public r51(g71 g71Var) {
        g71Var.getClass();
        LinkedHashMap linkedHashMap = h71.b;
        this.e = hp.z(g71Var.getClass());
        ?? obj = new Object();
        obj.b = this;
        obj.c = new ArrayList();
        obj.d = new LinkedHashMap();
        this.f = obj;
        this.h = new o12();
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            if (bundle != null) {
                v.putAll(bundle);
                Iterator it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    entry.getValue().getClass();
                    se.s();
                    return null;
                }
            }
            return v;
        }
        Map.Entry entry2 = (Map.Entry) it.next();
        entry2.getValue().getClass();
        se.s();
        return null;
    }

    public final Map b() {
        return tz0.f0((LinkedHashMap) this.f.d);
    }

    public q51 c(ld ldVar) {
        boolean matches;
        Bundle bundle;
        boolean z;
        am1 am1Var;
        q4 c;
        u51 u51Var = this.f;
        LinkedHashMap linkedHashMap = (LinkedHashMap) u51Var.d;
        Uri uri = (Uri) ldVar.f;
        ArrayList arrayList = (ArrayList) u51Var.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        q51 q51Var = null;
        while (it.hasNext()) {
            p51 p51Var = (p51) it.next();
            p51Var.getClass();
            b52 b52Var = p51Var.d;
            if (((am1) b52Var.getValue()) == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                am1 am1Var2 = (am1) b52Var.getValue();
                am1Var2.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                matches = am1Var2.e.matcher(uri2).matches();
            }
            if (matches) {
                if (uri != null) {
                    bundle = p51Var.d(uri, linkedHashMap);
                } else {
                    bundle = null;
                }
                int b = p51Var.b(uri);
                String str = (String) ldVar.g;
                if (str != null && str.equals(null)) {
                    z = true;
                } else {
                    z = false;
                }
                if (bundle == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                        if (uri != null && (am1Var = (am1) b52Var.getValue()) != null && (c = am1Var.c(uri.toString())) != null) {
                            p51Var.e(c, v, linkedHashMap);
                            if (((Boolean) p51Var.e.getValue()).booleanValue()) {
                                p51Var.f(uri, v, linkedHashMap);
                            }
                        }
                        if (go.J(linkedHashMap, new n51(v, 1)).isEmpty()) {
                        }
                    }
                }
                q51 q51Var2 = new q51((r51) u51Var.b, bundle, p51Var.l, b, z);
                if (q51Var == null || q51Var2.compareTo(q51Var) > 0) {
                    q51Var = q51Var2;
                }
            }
        }
        return q51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Ld0
        L5:
            r1 = 0
            if (r11 == 0) goto Ld1
            boolean r2 = r11 instanceof defpackage.r51
            if (r2 != 0) goto Le
            goto Ld1
        Le:
            u51 r2 = r10.f
            java.lang.Object r3 = r2.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r51 r11 = (defpackage.r51) r11
            o12 r4 = r11.h
            u51 r5 = r11.f
            java.lang.Object r6 = r5.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r3 = defpackage.sn0.r(r3, r6)
            o12 r6 = r10.h
            int r7 = r6.e()
            int r8 = r4.e()
            if (r7 != r8) goto L5e
            p12 r7 = new p12
            r7.<init>(r6)
            kv1 r7 = defpackage.mv1.E(r7)
            ts r7 = (defpackage.ts) r7
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r6.b(r8)
            java.lang.Object r8 = r4.b(r8)
            boolean r8 = defpackage.sn0.r(r9, r8)
            if (r8 != 0) goto L3d
            goto L5e
        L5c:
            r4 = r0
            goto L5f
        L5e:
            r4 = r1
        L5f:
            java.util.Map r6 = r10.b()
            int r6 = r6.size()
            java.util.Map r7 = r11.b()
            int r7 = r7.size()
            if (r6 != r7) goto Lb5
            java.util.Map r10 = r10.b()
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r10.getClass()
            java.util.Iterator r10 = r10.iterator()
        L82:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto Lb3
            java.lang.Object r6 = r10.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map r7 = r11.b()
            java.lang.Object r8 = r6.getKey()
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto Lb5
            java.util.Map r7 = r11.b()
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r7 = r7.get(r8)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = defpackage.sn0.r(r7, r6)
            if (r6 == 0) goto Lb5
            goto L82
        Lb3:
            r10 = r0
            goto Lb6
        Lb5:
            r10 = r1
        Lb6:
            int r11 = r2.a
            int r6 = r5.a
            if (r11 != r6) goto Ld1
            java.lang.Object r11 = r2.e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r5.e
            java.lang.String r2 = (java.lang.String) r2
            boolean r11 = defpackage.sn0.r(r11, r2)
            if (r11 == 0) goto Ld1
            if (r3 == 0) goto Ld1
            if (r4 == 0) goto Ld1
            if (r10 == 0) goto Ld1
        Ld0:
            return r0
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2;
        boolean z;
        int i3;
        u51 u51Var = this.f;
        int i4 = u51Var.a * 31;
        String str = (String) u51Var.e;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i4 + i2;
        Iterator it = ((ArrayList) u51Var.c).iterator();
        while (it.hasNext()) {
            i5 = (((p51) it.next()).a.hashCode() + (i5 * 31)) * 961;
        }
        o12 o12Var = this.h;
        o12Var.getClass();
        if (o12Var.e() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (String str2 : b().keySet()) {
                int d = l90.d(i5 * 31, 31, str2);
                Object obj = b().get(str2);
                if (obj != null) {
                    i3 = obj.hashCode();
                } else {
                    i3 = 0;
                }
                i5 = d + i3;
            }
            return i5;
        }
        o12Var.f(0).getClass();
        se.s();
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        u51 u51Var = this.f;
        u51Var.getClass();
        sb.append(Integer.toHexString(u51Var.a));
        sb.append(")");
        String str = (String) u51Var.e;
        if (str != null && !i32.N(str)) {
            sb.append(" route=");
            sb.append((String) u51Var.e);
        }
        return sb.toString();
    }
}
