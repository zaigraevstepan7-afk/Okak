package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.protobuf.DescriptorProtos;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e6 extends cq0 implements de0 {
    public static final e6 A;
    public static final e6 B;
    public static final e6 C;
    public static final e6 D;
    public static final e6 E;
    public static final e6 F;
    public static final e6 G;
    public static final e6 H;
    public static final e6 I;
    public static final e6 f;
    public static final e6 g;
    public static final e6 h;
    public static final e6 i;
    public static final e6 j;
    public static final e6 k;
    public static final e6 l;
    public static final e6 m;
    public static final e6 n;
    public static final e6 o;
    public static final e6 p;
    public static final e6 q;
    public static final e6 r;
    public static final e6 s;
    public static final e6 t;
    public static final e6 u;
    public static final e6 v;
    public static final e6 w;
    public static final e6 x;
    public static final e6 y;
    public static final e6 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 0;
        f = new e6(i2, 0);
        g = new e6(i2, 1);
        h = new e6(i2, 2);
        i = new e6(i2, 3);
        j = new e6(i2, 4);
        k = new e6(i2, 5);
        l = new e6(i2, 6);
        m = new e6(i2, 7);
        n = new e6(i2, 8);
        o = new e6(i2, 9);
        p = new e6(i2, 10);
        q = new e6(i2, 11);
        r = new e6(i2, 12);
        s = new e6(i2, 13);
        t = new e6(i2, 14);
        u = new e6(i2, 15);
        v = new e6(i2, 16);
        w = new e6(i2, 17);
        x = new e6(i2, 18);
        y = new e6(i2, 19);
        z = new e6(i2, 20);
        A = new e6(i2, 21);
        B = new e6(i2, 22);
        C = new e6(i2, 23);
        D = new e6(i2, 24);
        E = new e6(i2, 25);
        F = new e6(i2, 26);
        G = new e6(i2, 27);
        H = new e6(i2, 28);
        I = new e6(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.de0
    public final Object invoke() {
        l70 l70Var;
        xu v2;
        long j2;
        Choreographer choreographer;
        int i2 = 2;
        lp lpVar = null;
        Object[] objArr = 0;
        switch (this.e) {
            case 0:
                l6.b("LocalConfiguration");
                throw null;
            case 1:
                l6.b("LocalContext");
                throw null;
            case 2:
                l6.b("LocalImageVectorCache");
                throw null;
            case 3:
                l6.b("LocalResourceIdCache");
                throw null;
            case 4:
                l6.b("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    vy vyVar = k10.a;
                    mg0 mg0Var = gz0.a;
                    se0 eaVar = new ea(i2, objArr == true ? 1 : 0, 0);
                    Thread currentThread = Thread.currentThread();
                    g3 g3Var = g3.y;
                    zu zuVar = (zu) mg0Var.H(g3Var);
                    j60 j60Var = j60.e;
                    if (zuVar == null) {
                        l70Var = r92.a();
                        v2 = io.v(j60Var, go.M(mg0Var, l70Var), true);
                        vy vyVar2 = k10.a;
                        if (v2 != vyVar2 && v2.H(g3Var) == null) {
                            v2 = v2.G(vyVar2);
                        }
                    } else {
                        l70Var = (l70) r92.a.get();
                        v2 = io.v(j60Var, mg0Var, true);
                        vy vyVar3 = k10.a;
                        if (v2 != vyVar3 && v2.H(g3Var) == null) {
                            v2 = v2.G(vyVar3);
                        }
                    }
                    qi qiVar = new qi(v2, currentThread, l70Var);
                    qiVar.g0(jv.e, qiVar, eaVar);
                    l70 l70Var2 = qiVar.i;
                    if (l70Var2 != null) {
                        int i3 = l70.j;
                        l70Var2.U(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            if (l70Var2 != null) {
                                j2 = l70Var2.V();
                            } else {
                                j2 = Long.MAX_VALUE;
                            }
                            if (!qiVar.P()) {
                                LockSupport.parkNanos(qiVar, j2);
                            } else {
                                if (l70Var2 != null) {
                                    int i4 = l70.j;
                                    l70Var2.S(false);
                                }
                                Object G2 = d6.G(no0.e.get(qiVar));
                                if (G2 instanceof lp) {
                                    lpVar = (lp) G2;
                                }
                                if (lpVar == null) {
                                    choreographer = (Choreographer) G2;
                                } else {
                                    throw lpVar.a;
                                }
                            }
                        } catch (Throwable th) {
                            if (l70Var2 != null) {
                                int i5 = l70.j;
                                l70Var2.S(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    qiVar.u(interruptedException);
                    throw interruptedException;
                }
                ha haVar = new ha(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return go.M(haVar, haVar.p);
            case 10:
                return new ar0(2);
            case 11:
            case 12:
                return null;
            case 13:
                is.b("LocalAutofillManager");
                throw null;
            case 14:
                is.b("LocalAutofillTree");
                throw null;
            case 15:
                is.b("LocalClipboard");
                throw null;
            case 16:
                is.b("LocalClipboardManager");
                throw null;
            case 17:
                return Boolean.TRUE;
            case 18:
                is.b("LocalDensity");
                throw null;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                is.b("LocalFocusManager");
                throw null;
            case 20:
                is.b("LocalFontFamilyResolver");
                throw null;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                is.b("LocalFontLoader");
                throw null;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                is.b("LocalGraphicsContext");
                throw null;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                is.b("LocalHapticFeedback");
                throw null;
            case 24:
                is.b("LocalInputManager");
                throw null;
            case 25:
                is.b("LocalLayoutDirection");
                throw null;
            case 26:
                return null;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return Boolean.FALSE;
            case 28:
            default:
                return null;
        }
    }
}
