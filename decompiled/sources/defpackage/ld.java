package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import com.elixir.loader.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ld implements g02, Converter {
    public static volatile ld i;
    public static final Object j = new Object();
    public final /* synthetic */ int e;
    public Object f;
    public Object g;
    public Object h;

    public ld(int i2) {
        this.e = i2;
        switch (i2) {
            case 4:
                this.f = new rg2(12);
                this.g = new rg2(12);
                this.h = new rg2(12);
                return;
            case 10:
                long[] jArr = sr1.a;
                this.f = new i41();
                return;
            case 14:
                this.f = new AtomicReference(fc2.D);
                this.g = new Object();
                return;
            case 16:
                this.f = new WeakHashMap();
                this.g = new WeakHashMap();
                this.h = new WeakHashMap();
                return;
            default:
                this.h = new wm1(13);
                return;
        }
    }

    public static ld j(Context context) {
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = new ld(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public void a(ar0 ar0Var, zn0 zn0Var) {
        rg2 rg2Var = (rg2) this.f;
        rg2 rg2Var2 = (rg2) this.g;
        rg2 rg2Var3 = (rg2) this.h;
        int ordinal = zn0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (ar0Var.m != null) {
                            rg2Var3.d(ar0Var);
                            return;
                        } else {
                            rg2Var2.d(ar0Var);
                            return;
                        }
                    }
                    se.m();
                    return;
                }
                if (ar0Var.m != null) {
                    rg2Var3.d(ar0Var);
                    return;
                } else {
                    rg2Var.d(ar0Var);
                    return;
                }
            }
            rg2Var2.d(ar0Var);
            rg2Var3.d(ar0Var);
            return;
        }
        rg2Var.d(ar0Var);
        rg2Var3.d(ar0Var);
    }

    public boolean b(ar0 ar0Var) {
        boolean z;
        boolean z2;
        if (ar0Var.m == null) {
            z = true;
        } else {
            z = false;
        }
        if (!((j12) ((rg2) this.f).f).contains(ar0Var) && !((j12) ((rg2) this.g).f).contains(ar0Var)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.g02
    public float c(float f, float f2) {
        return 0.0f;
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        ov1 ov1Var = (ov1) this.h;
        MediaType mediaType = (MediaType) this.f;
        SerializationStrategy serializationStrategy = (SerializationStrategy) this.g;
        ov1Var.getClass();
        mediaType.getClass();
        serializationStrategy.getClass();
        RequestBody create = RequestBody.create(mediaType, ((Json) ov1Var.f).encodeToString(serializationStrategy, obj));
        create.getClass();
        return create;
    }

    @Override // defpackage.g02
    public float d(float f) {
        n4 n4Var = (n4) this.f;
        float f2 = n4Var.f();
        Object e = mp0.e(n4Var.c(), f2, f, (oe0) this.g, (v3) this.h);
        if (!((Boolean) n4Var.a.invoke(e)).booleanValue()) {
            e = n4Var.h.getValue();
        }
        return n4Var.c().f(e) - f2;
    }

    public void e(Bundle bundle) {
        HashSet hashSet = (HashSet) this.g;
        String string = ((Context) this.h).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (fl0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object f(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.f;
        if (ab2.a()) {
            try {
                xq1.g(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    fl0 fl0Var = (fl0) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> dependencies = fl0Var.dependencies();
                    if (!dependencies.isEmpty()) {
                        for (Class cls2 : dependencies) {
                            if (!hashMap.containsKey(cls2)) {
                                f(cls2, hashSet);
                            }
                        }
                    }
                    obj = fl0Var.create((Context) this.h);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }

    public Object g() {
        long g = rp1.g();
        if (g == v92.a) {
            return this.h;
        }
        s92 s92Var = (s92) ((AtomicReference) this.f).get();
        int a = s92Var.a(g);
        if (a >= 0) {
            return s92Var.c[a];
        }
        return null;
    }

    public tl h() {
        return ((vl) this.h).e.c;
    }

    public ix0 i() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((wm1) this.h)) {
            try {
                ix0 ix0Var = (ix0) this.g;
                if (ix0Var != null && localeList == ((LocaleList) this.f)) {
                    return ix0Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new hx0(localeList.get(i2)));
                }
                ix0 ix0Var2 = new ix0(arrayList);
                this.f = localeList;
                this.g = ix0Var2;
                return ix0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long k() {
        return ((vl) this.h).e.d;
    }

    public boolean l(CharSequence charSequence, int i2, int i3, kc2 kc2Var) {
        int i4;
        if ((kc2Var.c & 3) == 0) {
            jy jyVar = (jy) this.h;
            a11 b = kc2Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.h).getShort(a + b.e);
            }
            jyVar.getClass();
            ThreadLocal threadLocal = jy.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = jyVar.a;
            String sb2 = sb.toString();
            int i5 = td1.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i6 = kc2Var.c & 4;
            if (hasGlyph) {
                i4 = i6 | 2;
            } else {
                i4 = i6 | 1;
            }
            kc2Var.c = i4;
        }
        if ((kc2Var.c & 3) != 2) {
            return false;
        }
        return true;
    }

    public boolean m() {
        boolean z;
        if (((j12) ((rg2) this.f).f).isEmpty() && ((j12) ((rg2) this.h).f).isEmpty() && ((j12) ((rg2) this.g).f).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public boolean n() {
        if (((o22) this.f).getValue() == this.h) {
            ld ldVar = (ld) this.g;
            if (ldVar == null || !ldVar.n()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void o(Activity activity, ui2 ui2Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.h;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            if (ui2Var.equals((ui2) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((vx1) ((ov1) this.f).f).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                ux1 ux1Var = (ux1) it.next();
                if (ux1Var.a.equals(activity)) {
                    ux1Var.c = ui2Var;
                    ux1Var.b.accept(ui2Var);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object p(CharSequence charSequence, int i2, int i3, int i4, boolean z, c60 c60Var) {
        int i5;
        c11 c11Var;
        char c;
        e60 e60Var = new e60((c11) ((q4) this.g).h);
        int codePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean z2 = true;
        int i7 = i2;
        loop0: while (true) {
            i5 = i7;
            while (i7 < i3 && i6 < i4 && z2) {
                SparseArray sparseArray = e60Var.c.a;
                if (sparseArray == null) {
                    c11Var = null;
                } else {
                    c11Var = (c11) sparseArray.get(codePointAt);
                }
                if (e60Var.a != 2) {
                    if (c11Var == null) {
                        e60Var.a();
                        c = 1;
                    } else {
                        e60Var.a = 2;
                        e60Var.c = c11Var;
                        e60Var.f = 1;
                        c = 2;
                    }
                } else {
                    if (c11Var != null) {
                        e60Var.c = c11Var;
                        e60Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            e60Var.a();
                        } else if (codePointAt != 65039) {
                            c11 c11Var2 = e60Var.c;
                            if (c11Var2.b != null) {
                                if (e60Var.f == 1) {
                                    if (e60Var.b()) {
                                        e60Var.d = e60Var.c;
                                        e60Var.a();
                                    } else {
                                        e60Var.a();
                                    }
                                } else {
                                    e60Var.d = c11Var2;
                                    e60Var.a();
                                }
                                c = 3;
                            } else {
                                e60Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                }
                e60Var.e = codePointAt;
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            if (z || !l(charSequence, i5, i7, e60Var.d.b)) {
                                z2 = c60Var.m(charSequence, i5, i7, e60Var.d.b);
                                i6++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i7;
                        if (charCount < i3) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i7 = charCount;
                    }
                } else {
                    i7 = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (i7 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i7);
                    }
                }
            }
        }
        if (e60Var.a == 2 && e60Var.c.b != null && ((e60Var.f > 1 || e60Var.b()) && i6 < i4 && z2 && (z || !l(charSequence, i5, i7, e60Var.c.b)))) {
            c60Var.m(charSequence, i5, i7, e60Var.c.b);
        }
        return c60Var.i();
    }

    public void q(Object obj) {
        long g = rp1.g();
        if (g == v92.a) {
            this.h = obj;
            return;
        }
        synchronized (this.g) {
            s92 s92Var = (s92) ((AtomicReference) this.f).get();
            int a = s92Var.a(g);
            if (a < 0) {
                ((AtomicReference) this.f).set(s92Var.b(obj, g));
            } else {
                s92Var.c[a] = obj;
            }
        }
    }

    public void r(tl tlVar) {
        ((vl) this.h).e.c = tlVar;
    }

    public void s(c00 c00Var) {
        ((vl) this.h).e.a = c00Var;
    }

    public void t(jq0 jq0Var) {
        ((vl) this.h).e.b = jq0Var;
    }

    public String toString() {
        switch (this.e) {
            case 8:
                String str = (String) this.h;
                String str2 = (String) this.g;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(long j2) {
        ((vl) this.h).e.d = j2;
    }

    public void v() {
        i41 i41Var = (i41) this.f;
        String str = (String) this.g;
        List list = (List) i41Var.k(str);
        if (list != null) {
            list.remove((de0) this.h);
        }
        if (list != null && !list.isEmpty()) {
            i41Var.m(str, list);
        }
    }

    public ld(MediaType mediaType, SerializationStrategy serializationStrategy, ov1 ov1Var) {
        this.e = 12;
        mediaType.getClass();
        serializationStrategy.getClass();
        ov1Var.getClass();
        this.f = mediaType;
        this.g = serializationStrategy;
        this.h = ov1Var;
    }

    public ld(el1 el1Var) {
        this.e = 9;
        this.f = new AtomicInteger(0);
        this.g = new qg();
        this.h = new j1(28, this, el1Var);
    }

    public /* synthetic */ ld(Object obj, Object obj2, Object obj3, int i2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    public ld(View view) {
        this.e = 6;
        this.f = view;
        this.g = lo.O(xt0.f, new s8(this, 4));
        this.h = new ov1(view);
    }

    public ld(vl vlVar) {
        this.e = 3;
        this.h = vlVar;
        this.f = new rg2(this, 5);
    }

    public ld(Context context) {
        this.e = 0;
        this.h = context.getApplicationContext();
        this.g = new HashSet();
        this.f = new HashMap();
    }

    public ld(q4 q4Var, xl1 xl1Var, jy jyVar, Set set) {
        this.e = 5;
        this.f = xl1Var;
        this.g = q4Var;
        this.h = jyVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            p(str, 0, str.length(), 1, true, new ad0(str, 4));
        }
    }

    public ld(nc2 nc2Var, ld ldVar) {
        this.e = 15;
        this.f = nc2Var;
        this.g = ldVar;
        this.h = nc2Var.e;
    }

    public ld(ov1 ov1Var) {
        this.e = 13;
        this.f = ov1Var;
        this.g = new ReentrantLock();
        this.h = new WeakHashMap();
    }
}
