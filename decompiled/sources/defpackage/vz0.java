package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vz0 extends b0 {
    public final /* synthetic */ int e = 1;
    public final Object f;

    public vz0(List list) {
        list.getClass();
        this.f = list;
    }

    @Override // defpackage.s
    public final int a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((Matcher) ((q4) obj).f).groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                String group = ((Matcher) ((q4) obj).f).group(i);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= xn.A(this)) {
                    return list.get(xn.A(this) - i);
                }
                StringBuilder q = l90.q("Element index ", i, " must be in range [");
                q.append(new ym0(0, xn.A(this), 1));
                q.append("].");
                throw new IndexOutOfBoundsException(q.toString());
        }
    }

    @Override // defpackage.b0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.b0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.e) {
            case 1:
                return new ko1(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.b0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.b0, java.util.List
    public ListIterator listIterator() {
        switch (this.e) {
            case 1:
                return new ko1(this, 0);
            default:
                return super.listIterator();
        }
    }

    public vz0(q4 q4Var) {
        this.f = q4Var;
    }

    @Override // defpackage.b0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.e) {
            case 1:
                return new ko1(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
