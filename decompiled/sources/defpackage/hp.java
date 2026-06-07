package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class hp {
    public static ij0 a;

    public static final void A(rq0 rq0Var) {
        M(rq0Var).E();
    }

    public static final boolean B(long j) {
        if ((j & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean C(long j) {
        if ((j & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean D(ip1 ip1Var) {
        long j = ip1Var.e;
        if ((j >>> 32) == (4294967295L & j) && j == ip1Var.f && j == ip1Var.g && j == ip1Var.h) {
            return true;
        }
        return false;
    }

    public static o01 E(ua uaVar, np1 np1Var) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list2 = np1Var.a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            e90 e90Var = (e90) list2.get(i);
            List list3 = e90Var.a;
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((e90Var instanceof c90) && i2 == list3.size() / 2) {
                    arrayList2.add(new xd1(e90Var, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list3.get(i2));
            }
        }
        Float valueOf = Float.valueOf(0.0f);
        int a0 = yn.a0(arrayList, 9);
        if (a0 == 0) {
            list = xn.E(valueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(a0 + 1);
            arrayList3.add(valueOf);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                uv uvVar = (uv) it.next();
                float floatValue = valueOf.floatValue();
                float e = uaVar.e(uvVar);
                if (e >= 0.0f) {
                    valueOf = Float.valueOf(floatValue + e);
                    arrayList3.add(valueOf);
                } else {
                    se.h("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
            }
            list = arrayList3;
        }
        float floatValue2 = ((Number) wn.n0(list)).floatValue();
        m31 m31Var = new m31(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            m31Var.a(((Number) list.get(i3)).floatValue() / floatValue2);
        }
        vv0 v = xn.v();
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            int intValue = ((Number) ((xd1) arrayList2.get(i4)).f).intValue();
            v.add(new rj1((m31Var.b(intValue + 1) + m31Var.b(intValue)) / 2.0f, (e90) ((xd1) arrayList2.get(i4)).e));
        }
        return new o01(uaVar, xn.s(v), arrayList, m31Var);
    }

    public static final void H(jz1 jz1Var, ge geVar, int i) {
        while (true) {
            int i2 = jz1Var.v;
            if (i <= i2 || i >= jz1Var.u) {
                if (i2 == 0 && i == 0) {
                    return;
                }
                jz1Var.M();
                if (jz1Var.y(jz1Var.v)) {
                    geVar.i();
                }
                jz1Var.j();
            } else {
                return;
            }
        }
    }

    public static List I(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final void J(qz qzVar) {
        t4 t4Var;
        ar0 M = M(qzVar);
        if (!M.x && (t4Var = ((q5) dr0.a(M)).O) != null) {
            t4Var.h.a.h(M.f, new s4(t4Var, M));
        }
    }

    public static final e81 K(qz qzVar, int i) {
        e81 e81Var = ((d21) qzVar).e.l;
        e81Var.getClass();
        if (e81Var.V0() == qzVar && f81.g(i)) {
            e81 e81Var2 = e81Var.t;
            e81Var2.getClass();
            return e81Var2;
        }
        return e81Var;
    }

    public static final e81 L(qz qzVar) {
        if (!((d21) qzVar).e.r) {
            kl0.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        e81 K = K(qzVar, 2);
        if (!K.V0().r) {
            kl0.b("LayoutCoordinates is not attached.");
        }
        return K;
    }

    public static final ar0 M(qz qzVar) {
        e81 e81Var = ((d21) qzVar).e.l;
        if (e81Var != null) {
            return e81Var.s;
        }
        throw l90.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final jc1 N(qz qzVar) {
        jc1 jc1Var = M(qzVar).s;
        if (jc1Var != null) {
            return jc1Var;
        }
        throw l90.f("This node does not have an owner.");
    }

    public static final bn0 O(pl1 pl1Var) {
        return new bn0(Math.round(pl1Var.a), Math.round(pl1Var.b), Math.round(pl1Var.c), Math.round(pl1Var.d));
    }

    public static String P(File file) {
        int i;
        file.getClass();
        if (!file.exists()) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[SharedConstants.DefaultBufferSize];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                fileInputStream.close();
                byte[] digest = messageDigest.digest();
                digest.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                int i2 = 0;
                for (byte b : digest) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) "");
                    }
                    sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                }
                sb.append((CharSequence) "");
                return sb.toString();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fc2.u(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Log.w("ElixirLoader/".concat("HashUtils"), l90.l("sha256 failed for ", file.getPath()), e);
            return "";
        }
    }

    public static Bitmap Q(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (128 == bitmapDrawable.getBitmap().getWidth() && 128 == bitmapDrawable.getBitmap().getHeight()) {
                    return bitmapDrawable.getBitmap();
                }
                return Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), 128, 128, true);
            }
            se.h("bitmap is null");
            return null;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, 128, 128);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i, i2, i3, i4);
        return createBitmap;
    }

    public static final void R(List list, n8 n8Var) {
        int i;
        jf1 jf1Var;
        Path path;
        int i2;
        float f;
        int i3;
        jf1 jf1Var2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        n8 n8Var2 = n8Var;
        Path path2 = n8Var2.a;
        Path path3 = n8Var2.a;
        if (path2.getFillType() == Path.FillType.EVEN_ODD) {
            i = 1;
        } else {
            i = 0;
        }
        n8Var2.h();
        n8Var2.i(i);
        if (list2.isEmpty()) {
            jf1Var = re1.c;
        } else {
            jf1Var = (jf1) list2.get(0);
        }
        int size = list2.size();
        float f10 = 0.0f;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i4 < size) {
            jf1 jf1Var3 = (jf1) list2.get(i4);
            if (jf1Var3 instanceof re1) {
                path3.close();
                path = path3;
                i2 = size;
                f = f10;
                i3 = i4;
                jf1Var2 = jf1Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (jf1Var3 instanceof df1) {
                    df1 df1Var = (df1) jf1Var3;
                    float f17 = df1Var.c;
                    f13 += f17;
                    float f18 = df1Var.d;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i2 = size;
                    f = f10;
                    i3 = i4;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (jf1Var3 instanceof ve1) {
                        ve1 ve1Var = (ve1) jf1Var3;
                        float f19 = ve1Var.c;
                        float f20 = ve1Var.d;
                        n8Var2.e(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (jf1Var3 instanceof cf1) {
                            cf1 cf1Var = (cf1) jf1Var3;
                            float f21 = cf1Var.d;
                            float f22 = cf1Var.c;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (jf1Var3 instanceof ue1) {
                            ue1 ue1Var = (ue1) jf1Var3;
                            float f23 = ue1Var.d;
                            float f24 = ue1Var.c;
                            n8Var2.d(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (jf1Var3 instanceof bf1) {
                            float f25 = ((bf1) jf1Var3).c;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (jf1Var3 instanceof te1) {
                            float f26 = ((te1) jf1Var3).c;
                            n8Var2.d(f26, f14);
                            f13 = f26;
                        } else {
                            if (jf1Var3 instanceof hf1) {
                                f9 = ((hf1) jf1Var3).c;
                                path3.rLineTo(f10, f9);
                            } else if (jf1Var3 instanceof if1) {
                                float f27 = ((if1) jf1Var3).c;
                                n8Var2.d(f13, f27);
                                f14 = f27;
                            } else if (jf1Var3 instanceof af1) {
                                af1 af1Var = (af1) jf1Var3;
                                path3.rCubicTo(af1Var.c, af1Var.d, af1Var.e, af1Var.f, af1Var.g, af1Var.h);
                                f11 = af1Var.e + f13;
                                f12 = af1Var.f + f14;
                                f13 += af1Var.g;
                                f9 = af1Var.h;
                            } else {
                                if (jf1Var3 instanceof se1) {
                                    se1 se1Var = (se1) jf1Var3;
                                    path3.cubicTo(se1Var.c, se1Var.d, se1Var.e, se1Var.f, se1Var.g, se1Var.h);
                                    f11 = se1Var.e;
                                    f12 = se1Var.f;
                                    f5 = se1Var.g;
                                    f6 = se1Var.h;
                                } else if (jf1Var3 instanceof ff1) {
                                    if (jf1Var.a) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    ff1 ff1Var = (ff1) jf1Var3;
                                    path3.rCubicTo(f7, f8, ff1Var.c, ff1Var.d, ff1Var.e, ff1Var.f);
                                    f11 = ff1Var.c + f13;
                                    f12 = ff1Var.d + f14;
                                    f13 += ff1Var.e;
                                    f9 = ff1Var.f;
                                } else if (jf1Var3 instanceof xe1) {
                                    if (jf1Var.a) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    xe1 xe1Var = (xe1) jf1Var3;
                                    path3.cubicTo(f13, f14, xe1Var.c, xe1Var.d, xe1Var.e, xe1Var.f);
                                    f11 = xe1Var.c;
                                    f12 = xe1Var.d;
                                    f5 = xe1Var.e;
                                    f6 = xe1Var.f;
                                } else if (jf1Var3 instanceof ef1) {
                                    ef1 ef1Var = (ef1) jf1Var3;
                                    float f28 = ef1Var.f;
                                    float f29 = ef1Var.e;
                                    float f30 = ef1Var.d;
                                    float f31 = ef1Var.c;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (jf1Var3 instanceof we1) {
                                        we1 we1Var = (we1) jf1Var3;
                                        float f34 = we1Var.f;
                                        float f35 = we1Var.e;
                                        float f36 = we1Var.d;
                                        f4 = we1Var.c;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (jf1Var3 instanceof gf1) {
                                        if (jf1Var.b) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        gf1 gf1Var = (gf1) jf1Var3;
                                        float f37 = gf1Var.d;
                                        float f38 = gf1Var.c;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (jf1Var3 instanceof ye1) {
                                        if (jf1Var.b) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        ye1 ye1Var = (ye1) jf1Var3;
                                        float f40 = ye1Var.d;
                                        float f41 = ye1Var.c;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i2 = size;
                                        f = f10;
                                        i3 = i4;
                                        f12 = f14;
                                        jf1Var2 = jf1Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (jf1Var3 instanceof ze1) {
                                        ze1 ze1Var = (ze1) jf1Var3;
                                        float f42 = ze1Var.h + f13;
                                        float f43 = ze1Var.i + f14;
                                        i2 = size;
                                        f = 0.0f;
                                        path = path3;
                                        i3 = i4;
                                        t(n8Var, f13, f14, f42, f43, ze1Var.c, ze1Var.d, ze1Var.e, ze1Var.f, ze1Var.g);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        jf1Var2 = jf1Var3;
                                    } else {
                                        path = path3;
                                        i2 = size;
                                        f = f10;
                                        i3 = i4;
                                        if (jf1Var3 instanceof qe1) {
                                            qe1 qe1Var = (qe1) jf1Var3;
                                            float f44 = qe1Var.i;
                                            float f45 = qe1Var.h;
                                            jf1Var2 = jf1Var3;
                                            t(n8Var, f13, f14, f45, f44, qe1Var.c, qe1Var.d, qe1Var.e, qe1Var.f, qe1Var.g);
                                            f12 = f44;
                                            f14 = f12;
                                            f11 = f45;
                                            f13 = f11;
                                        } else {
                                            se.m();
                                            return;
                                        }
                                    }
                                    i2 = size;
                                    f = f10;
                                    i3 = i4;
                                    jf1Var2 = jf1Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i2 = size;
                    f = f10;
                    i3 = i4;
                }
                jf1Var2 = jf1Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            n8Var2 = n8Var;
            size = i2;
            path3 = path;
            jf1Var = jf1Var2;
            f10 = f;
        }
    }

    public static String S(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final void a(b82 b82Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        urVar.Y(2080741862);
        if ((i & 6) == 0) {
            if (urVar.h(b82Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = 1;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            fp.a(b82Var, fqVar, urVar, i2 & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new ep(b82Var, fqVar, i, i5);
        }
    }

    public static final bn0 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new bn0(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final void c(fq fqVar, ur urVar, int i) {
        boolean z;
        urVar.Y(-709502251);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i & 1, z)) {
            y22 y22Var = qq1.a;
            oq1 oq1Var = (oq1) urVar.j(y22Var);
            mq1 l = nq1.l(urVar);
            Object[] objArr = {oq1Var};
            sl0 sl0Var = new sl0(new le(26), new i(17, oq1Var, l));
            boolean h = urVar.h(oq1Var) | urVar.h(l);
            Object L = urVar.L();
            if (h || L == or.a) {
                L = new j1(23, oq1Var, l);
                urVar.h0(L);
            }
            vt0 vt0Var = (vt0) go.Q(objArr, sl0Var, (de0) L, urVar, 0);
            vn.b(y22Var.a(vt0Var), go.N(-412824043, new u2(19, fqVar, vt0Var), urVar), urVar, 56);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new bj0(fqVar, i, 4);
        }
    }

    public static final void d(de0 de0Var, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        urVar.Y(-1646555525);
        if ((i & 6) == 0) {
            if (urVar.h(de0Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            h((View) urVar.j(l6.f), (c00) urVar.j(is.h), de0Var, urVar, (i2 << 6) & 896);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new u6(de0Var, i, i4);
        }
    }

    public static final pl1 e(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new pl1(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final ip1 f(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new ip1(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final void g(is0 is0Var, Object obj, int i, Object obj2, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        urVar.Y(1439843069);
        if (urVar.f(is0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (urVar.f(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (urVar.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (urVar.f(obj2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i10 & 1, z)) {
            ((lq1) obj).b(obj2, go.N(980966366, new cq(i, is0Var, obj2), urVar), urVar, 48);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(is0Var, obj, i, obj2, i2);
        }
    }

    public static final void h(View view, c00 c00Var, de0 de0Var, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        urVar.Y(-1319522472);
        if ((i & 6) == 0) {
            if (urVar.h(view)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(c00Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (urVar.h(de0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            boolean h = urVar.h(view);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean z3 = h | z2;
            Object L = urVar.L();
            if (z3 || L == or.a) {
                L = new i(12, view, de0Var);
                urVar.h0(L);
            }
            bf.e(view, c00Var, (oe0) L, urVar);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(view, c00Var, de0Var, i, 6);
        }
    }

    public static final void i(q41 q41Var, d21 d21Var) {
        q41 z = M(d21Var).z();
        int i = z.g - 1;
        Object[] objArr = z.e;
        if (i < objArr.length) {
            while (i >= 0) {
                q41Var.b(((ar0) objArr[i]).J.f);
                i--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.y92 r4, defpackage.te0 r5, java.lang.Throwable r6, defpackage.wt r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ab0
            if (r0 == 0) goto L13
            r0 = r7
            ab0 r0 = (defpackage.ab0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ab0 r0 = new ab0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.e
            defpackage.io.K(r7)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r4 = move-exception
            goto L43
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L30:
            defpackage.io.K(r7)
            r0.e = r6     // Catch: java.lang.Throwable -> L27
            r0.g = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            hv r5 = defpackage.hv.e
            if (r4 != r5) goto L40
            return r5
        L40:
            od2 r4 = defpackage.od2.a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            defpackage.qo.g(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp.j(y92, te0, java.lang.Throwable, wt):java.lang.Object");
    }

    public static final boolean k(float f) {
        if (!Float.isNaN(f) && Math.abs(f) >= 0.5f) {
            return false;
        }
        return true;
    }

    public static final d21 l(q41 q41Var) {
        int i;
        if (q41Var != null && (i = q41Var.g) != 0) {
            return (d21) q41Var.k(i - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final rq0 n(d21 d21Var) {
        if ((d21Var.g & 2) != 0) {
            if (d21Var instanceof rq0) {
                return (rq0) d21Var;
            }
            if (d21Var instanceof rz) {
                d21 d21Var2 = ((rz) d21Var).t;
                while (d21Var2 != 0) {
                    if (d21Var2 instanceof rq0) {
                        return (rq0) d21Var2;
                    }
                    if ((d21Var2 instanceof rz) && (d21Var2.g & 2) != 0) {
                        d21Var2 = ((rz) d21Var2).t;
                    } else {
                        d21Var2 = d21Var2.j;
                    }
                }
            }
        }
        return null;
    }

    public static final int o(long j, long j2) {
        boolean C = C(j);
        if (C != C(j2)) {
            if (!C) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(w(j) - w(j2));
        if (Math.min(w(j), w(j2)) >= 0.0f && B(j) != B(j2)) {
            if (!B(j)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    public static int p(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void q(x51 x51Var, String str, fq fqVar) {
        h71 h71Var = x51Var.f;
        h71Var.getClass();
        x51Var.h.add(new xq((wq) h71Var.b(z(wq.class)), str, fqVar).a());
    }

    public static kg2 r(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    newInstance.getClass();
                    return (kg2) newInstance;
                } catch (IllegalAccessException e) {
                    se.k("Cannot create an instance of ", cls, e);
                    return null;
                } catch (InstantiationException e2) {
                    se.k("Cannot create an instance of ", cls, e2);
                    return null;
                }
            }
            throw new RuntimeException("Cannot create an instance of " + cls);
        } catch (NoSuchMethodException e3) {
            se.k("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object s(es esVar, xj1 xj1Var) {
        if (!((d21) esVar).e.r) {
            kl0.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        sf1 sf1Var = (sf1) M(esVar).F;
        sf1Var.getClass();
        return xn.M(sf1Var, xj1Var);
    }

    public static final void t(n8 n8Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 != 0.0d) {
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                t(n8Var, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d21);
            double d22 = d16 * sqrt2;
            double d23 = sqrt2 * d17;
            if (z == z2) {
                d8 = d18 - d23;
                d9 = d19 + d22;
            } else {
                d8 = d18 + d23;
                d9 = d19 - d22;
            }
            double atan2 = Math.atan2(d13 - d9, d12 - d8);
            double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
            if (atan22 >= 0.0d) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 != z3) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d24 = d8 * d10;
            double d25 = d9 * d6;
            double d26 = (d24 * cos) - (d25 * sin);
            double d27 = (d25 * cos) + (d24 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d11);
            double sin2 = Math.sin(d11);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d28 = -d10;
            double d29 = d28 * cos2;
            double d30 = d6 * sin2;
            double d31 = (d29 * sin3) - (d30 * cos3);
            double d32 = d28 * sin2;
            double d33 = d6 * cos2;
            double d34 = (cos3 * d33) + (sin3 * d32);
            double d35 = atan22 / ceil;
            double d36 = atan2;
            double d37 = d31;
            int i = 0;
            double d38 = d34;
            double d39 = d2;
            while (i < ceil) {
                double d40 = d36 + d35;
                double sin4 = Math.sin(d40);
                double cos4 = Math.cos(d40);
                int i2 = ceil;
                double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
                double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
                double d43 = (d29 * sin4) - (d30 * cos4);
                double d44 = (cos4 * d33) + (sin4 * d32);
                double d45 = d40 - d36;
                double tan = Math.tan(d45 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
                double d46 = d32;
                n8Var.a.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
                d35 = d35;
                sin2 = sin2;
                d26 = d26;
                d = d41;
                i++;
                d32 = d46;
                d36 = d40;
                d38 = d44;
                d37 = d43;
                ceil = i2;
                d39 = d42;
                d10 = d5;
            }
        }
    }

    public static final void u(c40 c40Var, long j, float f, float f2) {
        float f3 = f / 2.0f;
        float intBitsToFloat = (Float.intBitsToFloat((int) (c40Var.d() >> 32)) - f3) - f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c40Var.d() & 4294967295L)) / 2.0f;
        c40.q0(c40Var, j, f3, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 120);
    }

    public static final boolean v(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float w(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float x(Layout layout, int i, Paint paint) {
        int i2;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = y82.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = uj0.a[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float y(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = y82.a;
        if (layout.getEllipsisCount(i) > 0) {
            int i2 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i2 = uj0.a[paragraphAlignment.ordinal()];
                }
                if (i2 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static String z(Class cls) {
        LinkedHashMap linkedHashMap = h71.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            f71 f71Var = (f71) cls.getAnnotation(f71.class);
            if (f71Var != null) {
                str = f71Var.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                se.e("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
        }
        str.getClass();
        return str;
    }

    public abstract void F(Throwable th);

    public abstract void G(q4 q4Var);

    public abstract int m(int i, int i2, jq0 jq0Var);
}
