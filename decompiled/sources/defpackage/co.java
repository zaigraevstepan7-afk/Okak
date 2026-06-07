package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class co {
    public static final long b = go.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        go.c(4282664004L);
        go.c(4287137928L);
        go.c(4291611852L);
        c = go.c(4294967295L);
        d = go.c(4294901760L);
        go.c(4278255360L);
        e = go.c(4278190335L);
        go.c(4294967040L);
        go.c(4278255615L);
        go.c(4294902015L);
        f = go.b(0);
        g = go.a(0.0f, 0.0f, 0.0f, 0.0f, so.u);
    }

    public /* synthetic */ co(long j) {
        this.a = j;
    }

    public static final long a(long j, po poVar) {
        rs rsVar;
        po f2 = f(j);
        int i = f2.c;
        int i2 = poVar.c;
        if ((i | i2) < 0) {
            rsVar = qo.y(f2, poVar);
        } else {
            p31 p31Var = ss.a;
            int i3 = i | (i2 << 6);
            Object b2 = p31Var.b(i3);
            if (b2 == null) {
                b2 = qo.y(f2, poVar);
                p31Var.i(i3, b2);
            }
            rsVar = (rs) b2;
        }
        return rsVar.a(j);
    }

    public static long b(long j, float f2) {
        return go.a(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float d(long j) {
        float A;
        float f2;
        if ((63 & j) == 0) {
            A = (float) yq1.A((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            A = (float) yq1.A((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return A / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) yq1.A((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - da0.a;
                if (i4 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        } else {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final po f(long j) {
        float[] fArr = so.a;
        return so.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) yq1.A((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - da0.a;
                if (i4 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        } else {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) yq1.A((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - da0.a;
                if (i4 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        } else {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        return "Color(" + h(j) + ", " + g(j) + ", " + e(j) + ", " + d(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof co) {
            if (this.a != ((co) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
