package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class un1 implements xn1 {
    public final List a;
    public final List b;
    public final List c;

    public un1(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un1)) {
            return false;
        }
        un1 un1Var = (un1) obj;
        if (sn0.r(this.a, un1Var.a) && sn0.r(this.b, un1Var.b) && sn0.r(this.c, un1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Content(sounds=" + this.a + ", images=" + this.b + ", avatars=" + this.c + ")";
    }
}
