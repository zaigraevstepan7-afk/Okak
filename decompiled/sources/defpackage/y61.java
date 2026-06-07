package defpackage;

import java.io.IOException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class y61 implements b20, t12 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int e;

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(int i, long j) {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Object obj3) {
        throw new AssertionError("Thread " + obj + obj2 + obj3);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void k(String str, int i, int i2, int i3, Object obj) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ", size: ") + i3);
    }

    public static /* synthetic */ void l(String str, int i, int i2, Object obj) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void m(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void p(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void t(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // defpackage.t12
    public boolean a() {
        return false;
    }

    @Override // defpackage.b20
    public double b(double d) {
        return d;
    }
}
