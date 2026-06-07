package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xm1 extends n90 {
    public static final oe1 h;
    public final ClassLoader e;
    public final n90 f;
    public final b52 g;

    static {
        String str = oe1.f;
        h = wc0.k("/", false);
    }

    public xm1(ClassLoader classLoader) {
        n90 n90Var = n90.SYSTEM;
        n90Var.getClass();
        this.e = classLoader;
        this.f = n90Var;
        this.g = new b52(new vm1(this, 0));
    }

    public static String b(oe1 oe1Var) {
        oe1 oe1Var2 = h;
        return oe1Var2.e(oe1Var, true).d(oe1Var2).e.r();
    }

    @Override // defpackage.n90
    public final ey1 appendingSink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n90
    public final void atomicMove(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n90
    public final oe1 canonicalize(oe1 oe1Var) {
        oe1Var.getClass();
        return h.e(oe1Var, true);
    }

    @Override // defpackage.n90
    public final void createDirectory(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n90
    public final void createSymlink(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n90
    public final void delete(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n90
    public final List list(oe1 oe1Var) {
        oe1Var.getClass();
        String b = b(oe1Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (xd1 xd1Var : (List) this.g.getValue()) {
            n90 n90Var = (n90) xd1Var.e;
            oe1 oe1Var2 = (oe1) xd1Var.f;
            try {
                List list = n90Var.list(oe1Var2.f(b));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (wm1.d((oe1) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(yn.a0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(wm1.u((oe1) it.next(), oe1Var2));
                }
                wn.d0(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return wn.A0(linkedHashSet);
        }
        throw new FileNotFoundException(l90.h(oe1Var, "file not found: "));
    }

    @Override // defpackage.n90
    public final List listOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        String b = b(oe1Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.g.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            xd1 xd1Var = (xd1) it.next();
            n90 n90Var = (n90) xd1Var.e;
            oe1 oe1Var2 = (oe1) xd1Var.f;
            List listOrNull = n90Var.listOrNull(oe1Var2.f(b));
            if (listOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listOrNull) {
                    if (wm1.d((oe1) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(yn.a0(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(wm1.u((oe1) it2.next(), oe1Var2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                wn.d0(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return wn.A0(linkedHashSet);
    }

    @Override // defpackage.n90
    public final j90 metadataOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        if (wm1.d(oe1Var)) {
            String b = b(oe1Var);
            for (xd1 xd1Var : (List) this.g.getValue()) {
                j90 metadataOrNull = ((n90) xd1Var.e).metadataOrNull(((oe1) xd1Var.f).f(b));
                if (metadataOrNull != null) {
                    return metadataOrNull;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.n90
    public final i90 openReadOnly(oe1 oe1Var) {
        oe1Var.getClass();
        if (wm1.d(oe1Var)) {
            String b = b(oe1Var);
            Iterator it = ((List) this.g.getValue()).iterator();
            while (it.hasNext()) {
                xd1 xd1Var = (xd1) it.next();
                try {
                    return ((n90) xd1Var.e).openReadOnly(((oe1) xd1Var.f).f(b));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException(l90.h(oe1Var, "file not found: "));
        }
        throw new FileNotFoundException(l90.h(oe1Var, "file not found: "));
    }

    @Override // defpackage.n90
    public final i90 openReadWrite(oe1 oe1Var, boolean z, boolean z2) {
        oe1Var.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.n90
    public final ey1 sink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n90
    public final k12 source(oe1 oe1Var) {
        oe1Var.getClass();
        if (wm1.d(oe1Var)) {
            oe1 oe1Var2 = h;
            oe1Var2.getClass();
            URL resource = this.e.getResource(f.b(oe1Var2, oe1Var, false).d(oe1Var2).e.r());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                inputStream.getClass();
                return lo.W(inputStream);
            }
            throw new FileNotFoundException(l90.h(oe1Var, "file not found: "));
        }
        throw new FileNotFoundException(l90.h(oe1Var, "file not found: "));
    }
}
