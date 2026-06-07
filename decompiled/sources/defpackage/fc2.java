package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.protobuf.DescriptorProtos;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.http2.Http2Connection;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class fc2 {
    public static final byte[] A;
    public static final sl0 B;
    public static final ad0 C;
    public static final s92 D;
    public static final no E;
    public static final float F;
    public static final u80 G;
    public static final float H = 24.0f;
    public static final float I = 24.0f;
    public static ij0 J;
    public static final ic a = new ic(Float.POSITIVE_INFINITY);
    public static final jc b = new jc(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final kc c = new kc(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final lc d = new lc(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ic e = new ic(Float.NEGATIVE_INFINITY);
    public static final jc f = new jc(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final kc g = new kc(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final lc h = new lc(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final nm i = new Object();
    public static final fq j = new fq(1121996006, false, new le(9));
    public static final ad0 k;
    public static final float l;
    public static final mw1 m;
    public static final float n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final d9 s;
    public static final StackTraceElement[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, nm] */
    static {
        new fq(2132285819, false, new le(10));
        int i2 = 5;
        k = new ad0("CLOSED", i2);
        l = 1.0f;
        m = mw1.i;
        n = 56.0f;
        o = new int[]{1, 10, 100, DescriptorProtos.Edition.EDITION_2023_VALUE, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
        p = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
        q = new int[]{3, 6};
        r = new int[]{1, 2, 4, 5, 7, 8};
        s = new d9(6);
        t = new StackTraceElement[0];
        u = new byte[]{48, 49, 53, 0};
        v = new byte[]{48, 49, 48, 0};
        w = new byte[]{48, 48, 57, 0};
        x = new byte[]{48, 48, 53, 0};
        y = new byte[]{48, 48, 49, 0};
        z = new byte[]{48, 48, 49, 0};
        A = new byte[]{48, 48, 50, 0};
        B = new sl0(new p11(12), new v51(18));
        C = new ad0("NO_VALUE", i2);
        D = new s92(0, new long[0], new Object[0]);
        E = no.m;
        F = 0.38f;
        G = new u80(0, 0);
    }

    public static final ij0 A() {
        ij0 ij0Var = J;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(9.0f, 16.17f);
        rg2Var.q(5.53f, 12.7f);
        rg2Var.i(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        rg2Var.i(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        rg2Var.r(4.18f, 4.18f);
        rg2Var.i(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        rg2Var.q(20.29f, 7.71f);
        rg2Var.i(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        rg2Var.i(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        rg2Var.q(9.0f, 16.17f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        J = b2;
        return b2;
    }

    public static final Object B(Object obj) {
        if (!(obj instanceof nm)) {
            return obj;
        }
        return null;
    }

    public static boolean C(int i2, Object obj) {
        int i3;
        if (obj instanceof af0) {
            if (obj instanceof cf0) {
                i3 = ((cf0) obj).getArity();
            } else if (obj instanceof de0) {
                i3 = 0;
            } else if (obj instanceof oe0) {
                i3 = 1;
            } else if (obj instanceof se0) {
                i3 = 2;
            } else if (obj instanceof te0) {
                i3 = 3;
            } else if (obj instanceof ue0) {
                i3 = 4;
            } else if (obj instanceof ve0) {
                i3 = 5;
            } else if (obj instanceof we0) {
                i3 = 6;
            } else if (obj instanceof xe0) {
                i3 = 7;
            } else if (obj instanceof ye0) {
                i3 = 8;
            } else if (obj instanceof ze0) {
                i3 = 9;
            } else if (obj instanceof ee0) {
                i3 = 10;
            } else if (obj instanceof fe0) {
                i3 = 11;
            } else if (obj instanceof he0) {
                i3 = 13;
            } else if (obj instanceof ie0) {
                i3 = 14;
            } else if (obj instanceof je0) {
                i3 = 15;
            } else if (obj instanceof ke0) {
                i3 = 16;
            } else if (obj instanceof le0) {
                i3 = 17;
            } else if (obj instanceof me0) {
                i3 = 18;
            } else if (obj instanceof ne0) {
                i3 = 19;
            } else if (obj instanceof pe0) {
                i3 = 20;
            } else if (obj instanceof qe0) {
                i3 = 21;
            } else {
                i3 = -1;
            }
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(long j2, int i2, int i3) {
        int j3 = us.j(j2);
        if (i2 <= us.h(j2) && j3 <= i2) {
            int i4 = us.i(j2);
            if (i3 <= us.g(j2) && i4 <= i3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final e21 E(oe0 oe0Var) {
        return new e91(oe0Var);
    }

    public static final sl0 F(String str, String str2, int i2, oe0 oe0Var) {
        char charAt = str.charAt(i2);
        if (((Boolean) oe0Var.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return G(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i2);
    }

    public static final sl0 G(String str, String str2) {
        return new sl0(str2 + " when parsing an Instant from \"" + K(64, str) + AbstractJsonLexerKt.STRING, str);
    }

    public static final int H(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static final long I(long j2, float f2) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static void J(Object obj, String str) {
        String name;
        if (obj == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        sn0.S(classCastException, fc2.class.getName());
        throw classCastException;
    }

    public static final String K(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final void L(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (!z2) {
            nl0.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of transformed text [0, " + i3 + AbstractJsonLexerKt.END_LIST);
        }
    }

    public static final void M(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (!z2) {
            nl0.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of original text [0, " + i3 + AbstractJsonLexerKt.END_LIST);
        }
    }

    public static ya a(float f2) {
        return new ya(Float.valueOf(f2), f2.A, Float.valueOf(0.01f), 8);
    }

    public static final u4 b(t7 t7Var) {
        Canvas canvas = v4.a;
        u4 u4Var = new u4();
        u4Var.a = new Canvas(sn0.s(t7Var));
        return u4Var;
    }

    public static final void c(h32 h32Var, ur urVar, int i2) {
        int i3;
        boolean z2;
        ur urVar2 = urVar;
        h32Var.getClass();
        urVar2.Y(-562297955);
        if (urVar2.f(h32Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i4 & 1, z2)) {
            b21 b21Var = b21.a;
            e21 O = sn0.O(hy1.b(b21Var, 1.0f), 0.0f, 0.0f, 0.0f, 32.0f, 7);
            yo a2 = wo.a(c01.g, g3.s, urVar2, 48);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, O);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, kr.f, a2);
            op1.q(urVar2, kr.e, l2);
            op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar2, kr.h);
            op1.q(urVar2, kr.d, Q);
            sn0.d(null, 0L, 0L, null, null, urVar2, 0);
            xp1.a(urVar2, hy1.c(b21Var, 24.0f));
            t82.b(h32Var.o(), null, ((mo) urVar2.j(oo.a)).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar2.j(rc2.a)).h, 0L, 0L, sd0.h, null, 0L, 0L, null, 16777211), urVar, 0, 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new sd(h32Var, i2, 13);
        }
    }

    public static final void d(final de0 de0Var, final de0 de0Var2, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        ur urVar2 = urVar;
        de0Var.getClass();
        de0Var2.getClass();
        urVar2.Y(-70414997);
        if (urVar2.h(de0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (urVar2.h(de0Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        final int i7 = 0;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i6 & 1, z2)) {
            final h32 c2 = jx0.c(urVar2);
            wl r2 = d6.r(((mo) urVar2.j(oo.a)).G, 0L, urVar, 14);
            urVar2 = urVar;
            yo a2 = wo.a(new pe(2.0f, true, new le(i7)), g3.r, urVar2, 6);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            b21 b21Var = b21.a;
            e21 Q = fp.Q(urVar2, b21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, kr.f, a2);
            op1.q(urVar2, kr.e, l2);
            op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar2, kr.h);
            op1.q(urVar2, kr.d, Q);
            rx.c(hy1.b(b21Var, 1.0f), lp1.b(24.0f, 24.0f, 4.0f, 4.0f), r2, null, go.N(723216211, new te0() { // from class: wx0
                @Override // defpackage.te0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    String str;
                    String str2;
                    boolean z4;
                    String str3;
                    String str4;
                    int i8 = i7;
                    od2 od2Var = od2.a;
                    h32 h32Var = c2;
                    switch (i8) {
                        case 0:
                            ur urVar3 = (ur) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((zo) obj).getClass();
                            if ((intValue & 17) != 16) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (urVar3.O(intValue & 1, z3)) {
                                switch (h32Var.a) {
                                    case 0:
                                        str = "Paste License Key";
                                        break;
                                    case 1:
                                        str = "Colar Chave de Licença";
                                        break;
                                    case 2:
                                        str = "Вставить ключ";
                                        break;
                                    case 3:
                                        str = "Вставити ключ";
                                        break;
                                    default:
                                        str = "粘贴许可证密钥";
                                        break;
                                }
                                String str5 = str;
                                switch (h32Var.a) {
                                    case 0:
                                        str2 = "From clipboard";
                                        break;
                                    case 1:
                                        str2 = "Da área de transferência";
                                        break;
                                    case 2:
                                        str2 = "Из буфера обмена";
                                        break;
                                    case 3:
                                        str2 = "З буфера обміну";
                                        break;
                                    default:
                                        str2 = "从剪贴板";
                                        break;
                                }
                                String str6 = str2;
                                ij0 ij0Var = io.a;
                                if (ij0Var == null) {
                                    hj0 hj0Var = new hj0("Outlined.ContentPaste", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i9 = me2.a;
                                    i12 i12Var = new i12(co.b);
                                    rg2 rg2Var = new rg2(21);
                                    rg2Var.s(19.0f, 2.0f);
                                    rg2Var.o(-4.18f);
                                    rg2Var.h(14.4f, 0.84f, 13.3f, 0.0f, 12.0f, 0.0f);
                                    rg2Var.v(9.6f, 0.84f, 9.18f, 2.0f);
                                    rg2Var.q(5.0f, 2.0f);
                                    rg2Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                    rg2Var.E(16.0f);
                                    rg2Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    rg2Var.o(14.0f);
                                    rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                    rg2Var.q(21.0f, 4.0f);
                                    rg2Var.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                    rg2Var.f();
                                    rg2Var.s(12.0f, 2.0f);
                                    rg2Var.i(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                                    rg2Var.w(-0.45f, 1.0f, -1.0f, 1.0f);
                                    rg2Var.w(-1.0f, -0.45f, -1.0f, -1.0f);
                                    rg2Var.w(0.45f, -1.0f, 1.0f, -1.0f);
                                    rg2Var.f();
                                    rg2Var.s(19.0f, 20.0f);
                                    rg2Var.q(5.0f, 20.0f);
                                    rg2Var.q(5.0f, 4.0f);
                                    rg2Var.o(2.0f);
                                    rg2Var.E(3.0f);
                                    rg2Var.o(10.0f);
                                    rg2Var.q(17.0f, 4.0f);
                                    rg2Var.o(2.0f);
                                    rg2Var.E(16.0f);
                                    rg2Var.f();
                                    hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                    ij0Var = hj0Var.b();
                                    io.a = ij0Var;
                                }
                                fc2.h(str5, str6, ij0Var, de0Var, urVar3, 0);
                            } else {
                                urVar3.R();
                            }
                            return od2Var;
                        default:
                            ur urVar4 = (ur) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((zo) obj).getClass();
                            if ((intValue2 & 17) != 16) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (urVar4.O(intValue2 & 1, z4)) {
                                switch (h32Var.a) {
                                    case 0:
                                        str3 = "Enter Manually";
                                        break;
                                    case 1:
                                        str3 = "Inserir Manualmente";
                                        break;
                                    case 2:
                                        str3 = "Ввести вручную";
                                        break;
                                    case 3:
                                        str3 = "Ввести вручну";
                                        break;
                                    default:
                                        str3 = "手动输入";
                                        break;
                                }
                                String str7 = str3;
                                switch (h32Var.a) {
                                    case 0:
                                        str4 = "Type the key yourself";
                                        break;
                                    case 1:
                                        str4 = "Digite a chave você mesmo";
                                        break;
                                    case 2:
                                        str4 = "Введите ключ самостоятельно";
                                        break;
                                    case 3:
                                        str4 = "Введіть ключ самостійно";
                                        break;
                                    default:
                                        str4 = "自己输入密钥";
                                        break;
                                }
                                String str8 = str4;
                                ij0 ij0Var2 = go.c;
                                if (ij0Var2 == null) {
                                    hj0 hj0Var2 = new hj0("Outlined.Keyboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i10 = me2.a;
                                    i12 i12Var2 = new i12(co.b);
                                    rg2 rg2Var2 = new rg2(21);
                                    ArrayList arrayList = (ArrayList) rg2Var2.f;
                                    rg2Var2.s(20.0f, 7.0f);
                                    rg2Var2.E(10.0f);
                                    rg2Var2.q(4.0f, 17.0f);
                                    rg2Var2.q(4.0f, 7.0f);
                                    rg2Var2.o(16.0f);
                                    arrayList.add(new df1(0.0f, -2.0f));
                                    rg2Var2.q(4.0f, 5.0f);
                                    rg2Var2.i(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                                    rg2Var2.q(2.0f, 17.0f);
                                    rg2Var2.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    rg2Var2.o(16.0f);
                                    rg2Var2.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                    rg2Var2.q(22.0f, 7.0f);
                                    rg2Var2.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(11.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(11.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(8.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(8.0f, 10.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(8.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(8.0f, 13.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(5.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(5.0f, 13.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(5.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(5.0f, 10.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(8.0f, 14.0f);
                                    rg2Var2.o(8.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(8.0f, 16.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(14.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(14.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(17.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(17.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    hj0.a(hj0Var2, arrayList, i12Var2);
                                    ij0Var2 = hj0Var2.b();
                                    go.c = ij0Var2;
                                }
                                fc2.h(str7, str8, ij0Var2, de0Var, urVar4, 0);
                            } else {
                                urVar4.R();
                            }
                            return od2Var;
                    }
                }
            }, urVar2), urVar2, 196614, 24);
            final int i8 = 1;
            rx.c(hy1.b(b21Var, 1.0f), lp1.b(4.0f, 4.0f, 24.0f, 24.0f), r2, null, go.N(-648748854, new te0() { // from class: wx0
                @Override // defpackage.te0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    String str;
                    String str2;
                    boolean z4;
                    String str3;
                    String str4;
                    int i82 = i8;
                    od2 od2Var = od2.a;
                    h32 h32Var = c2;
                    switch (i82) {
                        case 0:
                            ur urVar3 = (ur) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((zo) obj).getClass();
                            if ((intValue & 17) != 16) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (urVar3.O(intValue & 1, z3)) {
                                switch (h32Var.a) {
                                    case 0:
                                        str = "Paste License Key";
                                        break;
                                    case 1:
                                        str = "Colar Chave de Licença";
                                        break;
                                    case 2:
                                        str = "Вставить ключ";
                                        break;
                                    case 3:
                                        str = "Вставити ключ";
                                        break;
                                    default:
                                        str = "粘贴许可证密钥";
                                        break;
                                }
                                String str5 = str;
                                switch (h32Var.a) {
                                    case 0:
                                        str2 = "From clipboard";
                                        break;
                                    case 1:
                                        str2 = "Da área de transferência";
                                        break;
                                    case 2:
                                        str2 = "Из буфера обмена";
                                        break;
                                    case 3:
                                        str2 = "З буфера обміну";
                                        break;
                                    default:
                                        str2 = "从剪贴板";
                                        break;
                                }
                                String str6 = str2;
                                ij0 ij0Var = io.a;
                                if (ij0Var == null) {
                                    hj0 hj0Var = new hj0("Outlined.ContentPaste", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i9 = me2.a;
                                    i12 i12Var = new i12(co.b);
                                    rg2 rg2Var = new rg2(21);
                                    rg2Var.s(19.0f, 2.0f);
                                    rg2Var.o(-4.18f);
                                    rg2Var.h(14.4f, 0.84f, 13.3f, 0.0f, 12.0f, 0.0f);
                                    rg2Var.v(9.6f, 0.84f, 9.18f, 2.0f);
                                    rg2Var.q(5.0f, 2.0f);
                                    rg2Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                    rg2Var.E(16.0f);
                                    rg2Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    rg2Var.o(14.0f);
                                    rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                    rg2Var.q(21.0f, 4.0f);
                                    rg2Var.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                    rg2Var.f();
                                    rg2Var.s(12.0f, 2.0f);
                                    rg2Var.i(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                                    rg2Var.w(-0.45f, 1.0f, -1.0f, 1.0f);
                                    rg2Var.w(-1.0f, -0.45f, -1.0f, -1.0f);
                                    rg2Var.w(0.45f, -1.0f, 1.0f, -1.0f);
                                    rg2Var.f();
                                    rg2Var.s(19.0f, 20.0f);
                                    rg2Var.q(5.0f, 20.0f);
                                    rg2Var.q(5.0f, 4.0f);
                                    rg2Var.o(2.0f);
                                    rg2Var.E(3.0f);
                                    rg2Var.o(10.0f);
                                    rg2Var.q(17.0f, 4.0f);
                                    rg2Var.o(2.0f);
                                    rg2Var.E(16.0f);
                                    rg2Var.f();
                                    hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                    ij0Var = hj0Var.b();
                                    io.a = ij0Var;
                                }
                                fc2.h(str5, str6, ij0Var, de0Var2, urVar3, 0);
                            } else {
                                urVar3.R();
                            }
                            return od2Var;
                        default:
                            ur urVar4 = (ur) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((zo) obj).getClass();
                            if ((intValue2 & 17) != 16) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (urVar4.O(intValue2 & 1, z4)) {
                                switch (h32Var.a) {
                                    case 0:
                                        str3 = "Enter Manually";
                                        break;
                                    case 1:
                                        str3 = "Inserir Manualmente";
                                        break;
                                    case 2:
                                        str3 = "Ввести вручную";
                                        break;
                                    case 3:
                                        str3 = "Ввести вручну";
                                        break;
                                    default:
                                        str3 = "手动输入";
                                        break;
                                }
                                String str7 = str3;
                                switch (h32Var.a) {
                                    case 0:
                                        str4 = "Type the key yourself";
                                        break;
                                    case 1:
                                        str4 = "Digite a chave você mesmo";
                                        break;
                                    case 2:
                                        str4 = "Введите ключ самостоятельно";
                                        break;
                                    case 3:
                                        str4 = "Введіть ключ самостійно";
                                        break;
                                    default:
                                        str4 = "自己输入密钥";
                                        break;
                                }
                                String str8 = str4;
                                ij0 ij0Var2 = go.c;
                                if (ij0Var2 == null) {
                                    hj0 hj0Var2 = new hj0("Outlined.Keyboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i10 = me2.a;
                                    i12 i12Var2 = new i12(co.b);
                                    rg2 rg2Var2 = new rg2(21);
                                    ArrayList arrayList = (ArrayList) rg2Var2.f;
                                    rg2Var2.s(20.0f, 7.0f);
                                    rg2Var2.E(10.0f);
                                    rg2Var2.q(4.0f, 17.0f);
                                    rg2Var2.q(4.0f, 7.0f);
                                    rg2Var2.o(16.0f);
                                    arrayList.add(new df1(0.0f, -2.0f));
                                    rg2Var2.q(4.0f, 5.0f);
                                    rg2Var2.i(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                                    rg2Var2.q(2.0f, 17.0f);
                                    rg2Var2.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    rg2Var2.o(16.0f);
                                    rg2Var2.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                    rg2Var2.q(22.0f, 7.0f);
                                    rg2Var2.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(11.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(11.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(8.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(8.0f, 10.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(8.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(8.0f, 13.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(5.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(5.0f, 13.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(5.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(5.0f, 10.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(8.0f, 14.0f);
                                    rg2Var2.o(8.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.q(8.0f, 16.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(14.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(14.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(17.0f, 11.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    rg2Var2.s(17.0f, 8.0f);
                                    rg2Var2.o(2.0f);
                                    rg2Var2.E(2.0f);
                                    rg2Var2.o(-2.0f);
                                    rg2Var2.f();
                                    hj0.a(hj0Var2, arrayList, i12Var2);
                                    ij0Var2 = hj0Var2.b();
                                    go.c = ij0Var2;
                                }
                                fc2.h(str7, str8, ij0Var2, de0Var2, urVar4, 0);
                            } else {
                                urVar4.R();
                            }
                            return od2Var;
                    }
                }
            }, urVar2), urVar2, 196614, 24);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r3 = urVar2.r();
        if (r3 != null) {
            r3.d = new u2(de0Var, i2, 22, de0Var2);
        }
    }

    public static final void e(ag agVar, ur urVar, int i2) {
        int i3;
        boolean z2;
        agVar.getClass();
        urVar.Y(846962259);
        int i4 = 2;
        if (urVar.h(agVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i5 & 1, z2)) {
            h32 c2 = jx0.c(urVar);
            o41 q2 = lo.q(agVar.l, urVar);
            o41 q3 = lo.q(agVar.n, urVar);
            rx.c(null, lp1.a(16.0f), d6.r(co.b(((mo) urVar.j(oo.a)).H, 0.5f), 0L, urVar, 14), null, go.N(-227050811, new vx0(agVar, lo.q(agVar.p, urVar), q3, c2, q2), urVar), urVar, 221184, 9);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new yx0(agVar, i2, i4);
        }
    }

    public static final void f(final de0 de0Var, final ag agVar, ur urVar, final int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        o41 o41Var;
        boolean z4;
        ag agVar2;
        int i5;
        ur urVar2 = urVar;
        de0Var.getClass();
        agVar.getClass();
        urVar2.Y(682769507);
        if (urVar2.h(de0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar2.f(agVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        final int i8 = 0;
        if ((i7 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i7 & 1, z2)) {
            h32 c2 = jx0.c(urVar2);
            o41 q2 = lo.q(agVar.r, urVar2);
            Object L = urVar2.L();
            Object obj = or.a;
            if (L == obj) {
                L = bf.K(urVar2);
                urVar2.h0(L);
            }
            gv gvVar = (gv) L;
            ex1 f2 = x11.f(6, 2, urVar2);
            nn nnVar = (nn) urVar2.j(is.f);
            o41 q3 = lo.q(agVar.g, urVar2);
            o41 q4 = lo.q(agVar.x, urVar2);
            uf ufVar = (uf) q3.getValue();
            boolean f3 = urVar2.f(q3) | urVar2.f(q2);
            if ((i7 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = f3 | z3;
            Object L2 = urVar2.L();
            if (!z5 && L2 != obj) {
                o41Var = q2;
            } else {
                tb tbVar = new tb(de0Var, q3, q2, null, 2);
                o41Var = q2;
                urVar2.h0(tbVar);
                L2 = tbVar;
            }
            bf.i(urVar2, (se0) L2, ufVar);
            if (((Boolean) q4.getValue()).booleanValue()) {
                urVar2.X(-578029690);
                p90 p90Var = hy1.c;
                j01 d2 = hj.d(g3.j, false);
                int hashCode = Long.hashCode(urVar2.T);
                sf1 l2 = urVar2.l();
                e21 Q = fp.Q(urVar2, p90Var);
                lr.b.getClass();
                hs hsVar = kr.b;
                urVar2.a0();
                if (urVar2.S) {
                    urVar2.k(hsVar);
                } else {
                    urVar2.k0();
                }
                gb gbVar = kr.f;
                op1.q(urVar2, gbVar, d2);
                gb gbVar2 = kr.e;
                op1.q(urVar2, gbVar2, l2);
                Integer valueOf = Integer.valueOf(hashCode);
                gb gbVar3 = kr.g;
                op1.l(urVar2, valueOf, gbVar3);
                i5 i5Var = kr.h;
                op1.o(urVar2, i5Var);
                gb gbVar4 = kr.d;
                op1.q(urVar2, gbVar4, Q);
                yo a2 = wo.a(c01.g, g3.s, urVar2, 48);
                int hashCode2 = Long.hashCode(urVar2.T);
                sf1 l3 = urVar2.l();
                b21 b21Var = b21.a;
                e21 Q2 = fp.Q(urVar2, b21Var);
                urVar2.a0();
                if (urVar2.S) {
                    urVar2.k(hsVar);
                } else {
                    urVar2.k0();
                }
                op1.q(urVar2, gbVar, a2);
                op1.q(urVar2, gbVar2, l3);
                l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
                op1.q(urVar2, gbVar4, Q2);
                sn0.d(null, 0L, 0L, null, null, urVar, 0);
                xp1.a(urVar, hy1.c(b21Var, 24.0f));
                t82.b(c2.o(), null, ((mo) urVar.j(oo.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(rc2.a)).h, urVar, 0, 0, 131066);
                urVar.p(true);
                urVar.p(true);
                urVar.p(false);
                dl1 r2 = urVar.r();
                if (r2 != null) {
                    r2.d = new se0(de0Var, agVar, i2, i8) { // from class: ux0
                        public final /* synthetic */ int e;
                        public final /* synthetic */ de0 f;
                        public final /* synthetic */ ag g;

                        {
                            this.e = i8;
                        }

                        @Override // defpackage.se0
                        public final Object invoke(Object obj2, Object obj3) {
                            int i9 = this.e;
                            od2 od2Var = od2.a;
                            ag agVar3 = this.g;
                            de0 de0Var2 = this.f;
                            ur urVar3 = (ur) obj2;
                            ((Integer) obj3).getClass();
                            switch (i9) {
                                case 0:
                                    fc2.f(de0Var2, agVar3, urVar3, lo.b0(1));
                                    return od2Var;
                                default:
                                    fc2.f(de0Var2, agVar3, urVar3, lo.b0(1));
                                    return od2Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            urVar2.X(-577482881);
            urVar2.p(false);
            y22 y22Var = oo.a;
            long j2 = ((mo) urVar2.j(y22Var)).p;
            WeakHashMap weakHashMap = pi2.w;
            op1.b(null, null, null, null, null, 0, j2, 0L, wm1.j(urVar2).g, go.N(-402600140, new js0(c2, gvVar, nnVar, agVar, 1), urVar2), urVar2, FileSystemManager.MODE_READ_WRITE, 191);
            if (((pf) o41Var.getValue()) != pf.e) {
                urVar2.X(-575318771);
                long j3 = ((mo) urVar2.j(y22Var)).F;
                kp1 b2 = lp1.b(28.0f, 28.0f, 0.0f, 0.0f);
                if ((i7 & 112) != 32) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                Object L3 = urVar2.L();
                if (!z4 && L3 != obj) {
                    agVar2 = agVar;
                    i5 = 1;
                } else {
                    agVar2 = agVar;
                    i5 = 1;
                    L3 = new xx0(agVar2, i5);
                    urVar2.h0(L3);
                }
                x11.a((de0) L3, null, f2, 0.0f, false, b2, j3, 0L, 0L, null, new le(29), null, go.N(1204891699, new vx0(agVar2, gvVar, f2, de0Var, o41Var), urVar2), urVar, 0, 6042);
                urVar2 = urVar;
                urVar2.p(false);
            } else {
                urVar2.X(-574280705);
                urVar2.p(false);
            }
        } else {
            urVar2.R();
        }
        dl1 r3 = urVar2.r();
        if (r3 != null) {
            final int i9 = 1;
            r3.d = new se0(de0Var, agVar, i2, i9) { // from class: ux0
                public final /* synthetic */ int e;
                public final /* synthetic */ de0 f;
                public final /* synthetic */ ag g;

                {
                    this.e = i9;
                }

                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    int i92 = this.e;
                    od2 od2Var = od2.a;
                    ag agVar3 = this.g;
                    de0 de0Var2 = this.f;
                    ur urVar3 = (ur) obj2;
                    ((Integer) obj3).getClass();
                    switch (i92) {
                        case 0:
                            fc2.f(de0Var2, agVar3, urVar3, lo.b0(1));
                            return od2Var;
                        default:
                            fc2.f(de0Var2, agVar3, urVar3, lo.b0(1));
                            return od2Var;
                    }
                }
            };
        }
    }

    public static final void g(ag agVar, ur urVar, int i2) {
        int i3;
        boolean z2;
        agVar.getClass();
        urVar.Y(-213586626);
        if (urVar.h(agVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        int i5 = 1;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i4 & 1, z2)) {
            h32 c2 = jx0.c(urVar);
            o41 q2 = lo.q(agVar.t, urVar);
            o41 q3 = lo.q(agVar.i, urVar);
            o41 q4 = lo.q(agVar.j, urVar);
            Object L = urVar.L();
            Object obj = or.a;
            if (L == obj) {
                L = new oc0();
                urVar.h0(L);
            }
            oc0 oc0Var = (oc0) L;
            Integer valueOf = Integer.valueOf(((Number) q2.getValue()).intValue());
            boolean f2 = urVar.f(q2);
            Object L2 = urVar.L();
            if (f2 || L2 == obj) {
                L2 = new j(oc0Var, q2, null, 27);
                urVar.h0(L2);
            }
            bf.i(urVar, (se0) L2, valueOf);
            vn.g(Integer.valueOf(((Number) q2.getValue()).intValue()), null, null, "ManualStep", go.N(902449092, new vx0(agVar, oc0Var, q4, q3, c2), urVar), urVar, 27648, 6);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new yx0(agVar, i2, i5);
        }
    }

    public static final void h(String str, String str2, ij0 ij0Var, de0 de0Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        ur urVar2 = urVar;
        str.getClass();
        str2.getClass();
        de0Var.getClass();
        urVar2.Y(-1202242010);
        if (urVar2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (urVar2.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (urVar2.f(ij0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (urVar2.h(de0Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i10 & 1, z2)) {
            b21 b21Var = b21.a;
            e21 L = sn0.L(f2.s(hy1.b(b21Var, 1.0f), false, null, de0Var, 15), 20.0f, 16.0f);
            up1 a2 = tp1.a(c01.e, g3.p, urVar2, 48);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, L);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar2, gbVar, a2);
            gb gbVar2 = kr.e;
            op1.q(urVar2, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar2, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar2, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar2, gbVar4, Q);
            y22 y22Var = oo.a;
            ej0.a(ij0Var, str, hy1.f(b21Var, 24.0f), ((mo) urVar2.j(y22Var)).a, urVar2, ((i10 >> 6) & 14) | 384 | ((i10 << 3) & 112), 0);
            xp1.a(urVar2, hy1.j(b21Var, 16.0f));
            pr0 pr0Var = new pr0(1.0f, true);
            yo a3 = wo.a(c01.g, g3.r, urVar2, 0);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, pr0Var);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a3);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q2);
            y22 y22Var2 = rc2.a;
            t82.b(str, null, ((mo) urVar2.j(y22Var)).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar2.j(y22Var2)).h, 0L, 0L, sd0.h, null, 0L, 0L, null, 16777211), urVar, i10 & 14, 0, 131066);
            t82.b(str2, null, ((mo) urVar.j(y22Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).k, urVar, (i10 >> 3) & 14, 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
            ij0 ij0Var2 = d6.H;
            if (ij0Var2 == null) {
                hj0 hj0Var = new hj0("Rounded.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i11 = me2.a;
                i12 i12Var = new i12(co.b);
                rg2 rg2Var = new rg2(21);
                rg2Var.s(9.29f, 6.71f);
                rg2Var.i(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                rg2Var.q(13.17f, 12.0f);
                rg2Var.r(-3.88f, 3.88f);
                rg2Var.i(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                rg2Var.i(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                rg2Var.r(4.59f, -4.59f);
                rg2Var.i(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                rg2Var.q(10.7f, 6.7f);
                rg2Var.i(-0.38f, -0.38f, -1.02f, -0.38f, -1.41f, 0.01f);
                rg2Var.f();
                hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                ij0Var2 = hj0Var.b();
                d6.H = ij0Var2;
            }
            ej0.a(ij0Var2, null, hy1.f(b21Var, 20.0f), co.b(((mo) urVar2.j(y22Var)).s, 0.5f), urVar2, 432, 0);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new be(str, str2, ij0Var, de0Var, i2, 5);
        }
    }

    public static sw1 i(int i2, jk jkVar) {
        int i3;
        int i4 = 0;
        if ((i2 & 1) != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if ((i2 & 2) == 0) {
            i4 = 16;
        }
        if (i3 <= 0 && i4 <= 0 && jkVar != jk.e) {
            y61.q(jkVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new sw1(i3, i5, jkVar);
    }

    public static final f8 j() {
        return new f8(new Paint(7));
    }

    public static final void k(ag agVar, ur urVar, int i2) {
        int i3;
        boolean z2;
        ag agVar2;
        int i4;
        long j2;
        long j3;
        boolean z3;
        ur urVar2 = urVar;
        agVar.getClass();
        urVar2.Y(-107082835);
        if (urVar2.h(agVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i5 & 1, z2)) {
            h32 c2 = jx0.c(urVar2);
            o41 q2 = lo.q(agVar.i, urVar2);
            o41 q3 = lo.q(agVar.j, urVar2);
            yo a2 = wo.a(c01.g, g3.r, urVar2, 0);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            b21 b21Var = b21.a;
            e21 Q = fp.Q(urVar2, b21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, kr.f, a2);
            op1.q(urVar2, kr.e, l2);
            op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar2, kr.h);
            op1.q(urVar2, kr.d, Q);
            String str = (String) q2.getValue();
            e21 b2 = hy1.b(b21Var, 1.0f);
            kp1 a3 = lp1.a(16.0f);
            if (((String) q2.getValue()).length() > 0 && !((Boolean) q3.getValue()).booleanValue()) {
                urVar2.X(-890625884);
                j2 = ((mo) urVar2.j(oo.a)).w;
                urVar2.p(false);
            } else {
                urVar2.X(-890549438);
                j2 = ((mo) urVar2.j(oo.a)).A;
                urVar2.p(false);
            }
            long j4 = j2;
            if (((String) q2.getValue()).length() > 0 && !((Boolean) q3.getValue()).booleanValue()) {
                urVar2.X(-890397724);
                j3 = ((mo) urVar2.j(oo.a)).w;
                urVar2.p(false);
            } else {
                urVar2.X(-890321278);
                j3 = ((mo) urVar2.j(oo.a)).a;
                urVar2.p(false);
            }
            long j5 = j3;
            long j6 = co.g;
            c72 a4 = g3.i((mo) urVar2.j(oo.a), urVar2).a(j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, null, j5, j4, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6);
            Object L = urVar2.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = new mm0(16);
                urVar2.h0(L);
            }
            fp.h(str, (oe0) L, b2, false, true, null, go.N(-1429798115, new sd(c2, 8), urVar2), null, go.N(-762416225, new sd(c2, 9), urVar2), go.N(1718758368, new l1(c2, q3, q2, 6), urVar2), null, null, null, false, 0, 0, a3, a4, urVar, 907567536, 0, 2096296);
            urVar2 = urVar;
            xp1.a(urVar2, hy1.c(b21Var, 24.0f));
            int i6 = i5 & 14;
            agVar2 = agVar;
            e(agVar2, urVar2, 8 | i6);
            xp1.a(urVar2, hy1.c(b21Var, 32.0f));
            e21 c3 = hy1.c(hy1.b(b21Var, 1.0f), 56.0f);
            kp1 a5 = lp1.a(20.0f);
            boolean booleanValue = ((Boolean) q3.getValue()).booleanValue();
            if (i6 != 4 && !urVar2.h(agVar2)) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object L2 = urVar2.L();
            if (!z3 && L2 != xl1Var) {
                i4 = 0;
            } else {
                i4 = 0;
                L2 = new xx0(agVar2, i4);
                urVar2.h0(L2);
            }
            sn0.b((de0) L2, c3, booleanValue, a5, null, null, null, null, go.N(-1701824249, new gh0(c2, 7), urVar2), urVar2, 805306416, 496);
            urVar2.p(true);
        } else {
            agVar2 = agVar;
            i4 = 0;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new yx0(agVar2, i2, i4);
        }
    }

    public static final void l(ag agVar, de0 de0Var, de0 de0Var2, fq fqVar, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        String str;
        o41 o41Var;
        String str2;
        ur urVar2 = urVar;
        agVar.getClass();
        de0Var.getClass();
        de0Var2.getClass();
        urVar2.Y(-820321708);
        if (urVar2.h(agVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar2.h(de0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar2.h(de0Var2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i8 & 1, z2)) {
            h32 c2 = jx0.c(urVar2);
            o41 q2 = lo.q(agVar.g, urVar2);
            o41 q3 = lo.q(agVar.v, urVar2);
            uf ufVar = (uf) q2.getValue();
            boolean f2 = urVar2.f(q2);
            if ((i8 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | f2;
            Object L = urVar2.L();
            vt vtVar = null;
            if (z4 || L == or.a) {
                L = new xv(de0Var, q2, vtVar, 3);
                urVar2.h0(L);
            }
            bf.i(urVar2, (se0) L, ufVar);
            if (((uf) q2.getValue()) instanceof sf) {
                str = "loading";
            } else if (((Boolean) q3.getValue()).booleanValue()) {
                str = "unfreeze";
            } else if (!(((uf) q2.getValue()) instanceof qf)) {
                str = "form";
            } else {
                str = "error";
            }
            b21 b21Var = b21.a;
            e21 M = sn0.M(hy1.b(b21Var, 1.0f), 24.0f, 0.0f, 2);
            WeakHashMap weakHashMap = pi2.w;
            e21 O = sn0.O(sn0.X(M, new cv0(wm1.j(urVar2).g, 32)), 0.0f, 0.0f, 0.0f, 24.0f, 7);
            yo a2 = wo.a(c01.g, g3.s, urVar2, 48);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, O);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, kr.f, a2);
            op1.q(urVar2, kr.e, l2);
            op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar2, kr.h);
            op1.q(urVar2, kr.d, Q);
            if (str.equals("form")) {
                urVar2.X(-1099146726);
                switch (c2.a) {
                    case 0:
                        str2 = "Sign In";
                        break;
                    case 1:
                        str2 = "Entrar";
                        break;
                    case 2:
                        str2 = "Вход";
                        break;
                    case 3:
                        str2 = "Вхід";
                        break;
                    default:
                        str2 = "登录";
                        break;
                }
                String str3 = str2;
                o41Var = q2;
                t82.b(str3, sn0.O(b21Var, 0.0f, 8.0f, 0.0f, 24.0f, 5), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar2.j(rc2.a)).f, 0L, 0L, sd0.j, null, 0L, 0L, null, 16777211), urVar, 0, 0, 131068);
                urVar2 = urVar;
                urVar2.p(false);
            } else {
                o41Var = q2;
                urVar2.X(-1098903965);
                xp1.a(urVar2, hy1.c(b21Var, 32.0f));
                urVar2.p(false);
            }
            vn.g(str, null, mp0.P(300, 6, null), "SheetTransition", go.N(-512333280, new vx0(c2, agVar, de0Var2, fqVar, o41Var), urVar2), urVar2, 28032, 2);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new be(agVar, de0Var, de0Var2, fqVar, i2, 4);
        }
    }

    public static final void m(a32 a32Var, String str, String str2, String str3, String str4, de0 de0Var, de0 de0Var2, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        cc2 cc2Var;
        int i10;
        String str5 = str3;
        ur urVar2 = urVar;
        a32Var.getClass();
        str.getClass();
        str2.getClass();
        str5.getClass();
        str4.getClass();
        de0Var.getClass();
        de0Var2.getClass();
        urVar2.Y(2146203587);
        if ((i2 & 6) == 0) {
            if (urVar2.d(a32Var.ordinal())) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i2 | i10;
        } else {
            i3 = i2;
        }
        if (urVar2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i3 | i4;
        if (urVar2.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (urVar2.f(str5)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (urVar2.f(str4)) {
            i7 = 16384;
        } else {
            i7 = SharedConstants.DefaultBufferSize;
        }
        int i14 = i13 | i7;
        if (urVar2.h(de0Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        if (urVar2.h(de0Var2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((599187 & i16) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i16 & 1, z2)) {
            int ordinal = a32Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        urVar2.X(917364020);
                        urVar2.p(false);
                        cc2Var = new cc2(rp1.n(), new co(go.c(4294942720L)), new co(go.c(4294965473L)));
                    } else {
                        urVar2.X(917352711);
                        urVar2.p(false);
                        se.m();
                        return;
                    }
                } else {
                    urVar2.X(917359411);
                    urVar2.p(false);
                    ij0 ij0Var = mp0.C0;
                    if (ij0Var == null) {
                        hj0 hj0Var = new hj0("Rounded.AcUnit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i17 = me2.a;
                        i12 i12Var = new i12(co.b);
                        rg2 rg2Var = new rg2(21);
                        rg2Var.s(21.0f, 11.0f);
                        rg2Var.o(-3.17f);
                        rg2Var.r(2.54f, -2.54f);
                        rg2Var.i(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        rg2Var.i(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
                        rg2Var.q(15.0f, 11.0f);
                        rg2Var.o(-2.0f);
                        rg2Var.D(9.0f);
                        rg2Var.r(3.95f, -3.95f);
                        rg2Var.i(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
                        rg2Var.i(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        rg2Var.q(13.0f, 6.17f);
                        rg2Var.D(3.0f);
                        rg2Var.i(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        rg2Var.w(-1.0f, 0.45f, -1.0f, 1.0f);
                        rg2Var.E(3.17f);
                        rg2Var.q(8.46f, 3.63f);
                        rg2Var.i(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        rg2Var.i(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
                        rg2Var.q(11.0f, 9.0f);
                        rg2Var.E(2.0f);
                        rg2Var.n(9.0f);
                        rg2Var.q(5.05f, 7.05f);
                        rg2Var.i(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
                        rg2Var.i(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        rg2Var.q(6.17f, 11.0f);
                        rg2Var.n(3.0f);
                        rg2Var.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        rg2Var.w(0.45f, 1.0f, 1.0f, 1.0f);
                        rg2Var.o(3.17f);
                        rg2Var.r(-2.54f, 2.54f);
                        rg2Var.i(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        rg2Var.i(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
                        rg2Var.q(9.0f, 13.0f);
                        rg2Var.o(2.0f);
                        rg2Var.E(2.0f);
                        rg2Var.r(-3.95f, 3.95f);
                        rg2Var.i(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
                        rg2Var.i(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        rg2Var.q(11.0f, 17.83f);
                        rg2Var.D(21.0f);
                        rg2Var.i(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        rg2Var.w(1.0f, -0.45f, 1.0f, -1.0f);
                        rg2Var.E(-3.17f);
                        rg2Var.r(2.54f, 2.54f);
                        rg2Var.i(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        rg2Var.i(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
                        rg2Var.q(13.0f, 15.0f);
                        rg2Var.E(-2.0f);
                        rg2Var.o(2.0f);
                        rg2Var.r(3.95f, 3.95f);
                        rg2Var.i(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
                        rg2Var.i(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        rg2Var.q(17.83f, 13.0f);
                        rg2Var.n(21.0f);
                        rg2Var.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        rg2Var.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        rg2Var.f();
                        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                        ij0Var = hj0Var.b();
                        mp0.C0 = ij0Var;
                    }
                    cc2Var = new cc2(ij0Var, new co(go.c(4278235391L)), new co(go.c(4292998654L)));
                }
            } else {
                urVar2.X(917353719);
                ij0 y2 = io.y();
                y22 y22Var = oo.a;
                cc2Var = new cc2(y2, new co(((mo) urVar2.j(y22Var)).w), new co(((mo) urVar2.j(y22Var)).y));
                urVar2.p(false);
            }
            ij0 ij0Var2 = (ij0) cc2Var.e;
            long j2 = ((co) cc2Var.f).a;
            long j3 = ((co) cc2Var.g).a;
            b21 b21Var = b21.a;
            e21 b2 = hy1.b(b21Var, 1.0f);
            yo a2 = wo.a(c01.g, g3.s, urVar, 48);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l2 = urVar.l();
            e21 Q = fp.Q(urVar, b2);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar, gbVar, a2);
            gb gbVar2 = kr.e;
            op1.q(urVar, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar, gbVar4, Q);
            e21 f2 = hy1.f(b21Var, 72.0f);
            wc0 wc0Var = yz0.a;
            e21 k2 = f2.k(f2, j3, go.V(wc0.n(), urVar));
            j01 d2 = hj.d(g3.j, false);
            int hashCode2 = Long.hashCode(urVar.T);
            sf1 l3 = urVar.l();
            e21 Q2 = fp.Q(urVar, k2);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d2);
            op1.q(urVar, gbVar2, l3);
            l90.t(hashCode2, urVar, gbVar3, urVar, i5Var);
            op1.q(urVar, gbVar4, Q2);
            ej0.a(ij0Var2, str, hy1.f(b21Var, 32.0f), j2, urVar, (i16 & 112) | 384, 0);
            urVar.p(true);
            xp1.a(urVar, hy1.c(b21Var, 24.0f));
            y22 y22Var2 = rc2.a;
            t82.b(str, null, 0L, 0L, null, null, 0L, new b62(3), 0L, 0, false, 0, 0, k92.a(((pc2) urVar.j(y22Var2)).f, 0L, 0L, sd0.j, null, 0L, 0L, null, 16777211), urVar, (i16 >> 3) & 14, 0, 130046);
            xp1.a(urVar, hy1.c(b21Var, 8.0f));
            k92 k92Var = ((pc2) urVar.j(y22Var2)).j;
            y22 y22Var3 = oo.a;
            t82.b(str2, null, ((mo) urVar.j(y22Var3)).s, 0L, null, null, 0L, new b62(3), 0L, 0, false, 0, 0, k92Var, urVar, (i16 >> 6) & 14, 0, 130042);
            xp1.a(urVar, hy1.c(b21Var, 32.0f));
            e21 b3 = hy1.b(b21Var, 1.0f);
            int i18 = 0;
            up1 a3 = tp1.a(c01.e, g3.o, urVar, 0);
            int hashCode3 = Long.hashCode(urVar.T);
            sf1 l4 = urVar.l();
            e21 Q3 = fp.Q(urVar, b3);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, a3);
            op1.q(urVar, gbVar2, l4);
            l90.t(hashCode3, urVar, gbVar3, urVar, i5Var);
            op1.q(urVar, gbVar4, Q3);
            e21 c2 = hy1.c(vp1.a(), 52.0f);
            kp1 a4 = lp1.a(16.0f);
            rc1 rc1Var = sk.a;
            sn0.b(de0Var2, c2, false, a4, sk.a(((mo) urVar.j(y22Var3)).p, ((mo) urVar.j(y22Var3)).q, urVar, 12), sk.b(30), null, null, go.N(1900623033, new zx0(str4, i18), urVar), urVar, ((i16 >> 18) & 14) | FileSystemManager.MODE_READ_WRITE, 452);
            xp1.a(urVar, hy1.j(b21Var, 12.0f));
            str5 = str3;
            sn0.b(de0Var, hy1.c(vp1.a(), 52.0f), false, lp1.a(16.0f), sk.a(j2, 0L, urVar, 14), null, null, null, go.N(-1809207838, new zx0(str5, 1), urVar), urVar, ((i16 >> 15) & 14) | FileSystemManager.MODE_READ_WRITE, 484);
            urVar2 = urVar;
            urVar2.p(true);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new ay0(a32Var, str, str2, str5, str4, de0Var, de0Var2, i2);
        }
    }

    public static final int n(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final void o(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final void p(h1 h1Var, ru1 ru1Var) {
        mu1 mu1Var = ru1Var.d;
        i41 i41Var = mu1Var.e;
        Object g2 = mu1Var.e.g(vu1.y);
        if (g2 == null) {
            g2 = null;
        }
        ap1 ap1Var = (ap1) g2;
        if (f2.f(ru1Var)) {
            if (ap1Var == null || ap1Var.a != 8) {
                Object g3 = i41Var.g(lu1.y);
                if (g3 == null) {
                    g3 = null;
                }
                s0 s0Var = (s0) g3;
                if (s0Var != null) {
                    h1Var.a(new e1(null, R.id.accessibilityActionPageUp, s0Var.a, null));
                }
                Object g4 = i41Var.g(lu1.A);
                if (g4 == null) {
                    g4 = null;
                }
                s0 s0Var2 = (s0) g4;
                if (s0Var2 != null) {
                    h1Var.a(new e1(null, R.id.accessibilityActionPageDown, s0Var2.a, null));
                }
                Object g5 = i41Var.g(lu1.z);
                if (g5 == null) {
                    g5 = null;
                }
                s0 s0Var3 = (s0) g5;
                if (s0Var3 != null) {
                    h1Var.a(new e1(null, R.id.accessibilityActionPageLeft, s0Var3.a, null));
                }
                Object g6 = i41Var.g(lu1.B);
                if (g6 == null) {
                    g6 = null;
                }
                s0 s0Var4 = (s0) g6;
                if (s0Var4 != null) {
                    h1Var.a(new e1(null, R.id.accessibilityActionPageRight, s0Var4.a, null));
                }
            }
        }
    }

    public static List q(Object obj) {
        if ((obj instanceof xo0) && !(obj instanceof zo0)) {
            J(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            sn0.S(e2, fc2.class.getName());
            throw e2;
        }
    }

    public static Map r(Object obj) {
        if ((obj instanceof xo0) && !(obj instanceof ap0)) {
            J(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            sn0.S(e2, fc2.class.getName());
            throw e2;
        }
    }

    public static final e21 s(e21 e21Var, float f2, boolean z2) {
        return e21Var.d(new cf(f2, z2));
    }

    public static void t(int i2, Object obj) {
        if (obj != null && !C(i2, obj)) {
            J(obj, "kotlin.jvm.functions.Function" + i2);
            throw null;
        }
    }

    public static final void u(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                qo.g(th, th2);
            }
        }
    }

    public static final mc v(mc mcVar) {
        mc c2 = mcVar.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(i2, mcVar.a(i2));
        }
        return c2;
    }

    public static final db2 w(y61 y61Var, rc rcVar) {
        y61Var.getClass();
        int length = rcVar.f.length();
        int length2 = rcVar.f.length();
        int min = Math.min(length, 100);
        for (int i2 = 0; i2 < min; i2++) {
            L(i2, length2, i2);
        }
        L(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < min2; i3++) {
            M(i3, length, i3);
        }
        M(length2, length, length2);
        return new db2(rcVar, new u80(rcVar.f.length(), rcVar.f.length()));
    }

    public static final Object x(nt1 nt1Var, long j2, se0 se0Var) {
        while (true) {
            if (nt1Var.c >= j2 && !nt1Var.c()) {
                return nt1Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ns.a;
            Object obj = atomicReferenceFieldUpdater.get(nt1Var);
            ad0 ad0Var = k;
            if (obj == ad0Var) {
                return ad0Var;
            }
            nt1 nt1Var2 = (nt1) ((ns) obj);
            if (nt1Var2 == null) {
                nt1Var2 = (nt1) se0Var.invoke(Long.valueOf(nt1Var.c + 1), nt1Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(nt1Var, null, nt1Var2)) {
                    if (atomicReferenceFieldUpdater.get(nt1Var) != null) {
                        break;
                    }
                }
                if (nt1Var.c()) {
                    nt1Var.d();
                }
            }
            nt1Var = nt1Var2;
        }
    }

    public static final e21 y(e21 e21Var, oc0 oc0Var) {
        return e21Var.d(new pc0(oc0Var));
    }

    public static final void z(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }
}
