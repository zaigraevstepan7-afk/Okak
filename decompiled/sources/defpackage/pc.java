package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pc implements Appendable {
    public final StringBuilder e = new StringBuilder(16);
    public final ArrayList f;

    public pc(rc rcVar) {
        new ArrayList();
        this.f = new ArrayList();
        new ArrayList();
        a(rcVar);
    }

    public final void a(rc rcVar) {
        StringBuilder sb = this.e;
        int length = sb.length();
        sb.append(rcVar.f);
        List list = rcVar.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                qc qcVar = (qc) list.get(i);
                Object obj = qcVar.a;
                this.f.add(new oc(qcVar.d, qcVar.b + length, qcVar.c + length, obj));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof rc;
        StringBuilder sb = this.e;
        if (z) {
            rc rcVar = (rc) charSequence;
            int length = sb.length();
            sb.append((CharSequence) rcVar.f, i, i2);
            List a = sc.a(rcVar, i, i2, null);
            if (a != null) {
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    qc qcVar = (qc) a.get(i3);
                    Object obj = qcVar.a;
                    this.f.add(new oc(qcVar.d, qcVar.b + length, qcVar.c + length, obj));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i2);
        return this;
    }

    public final rc b() {
        StringBuilder sb = this.e;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oc ocVar = (oc) arrayList.get(i);
            int length = sb.length();
            int i2 = ocVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                ll0.b("Item.end should be set first");
            }
            Object obj = ocVar.a;
            arrayList2.add(new qc(ocVar.d, ocVar.b, length, obj));
        }
        return new rc(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof rc) {
            a((rc) charSequence);
            return this;
        }
        this.e.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.e.append(c);
        return this;
    }
}
