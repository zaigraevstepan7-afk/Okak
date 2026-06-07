package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class fm implements ff0 {
    public final xu e;
    public final int f;
    public final jk g;

    public fm(xu xuVar, int i, jk jkVar) {
        this.e = xuVar;
        this.f = i;
        this.g = jkVar;
    }

    @Override // defpackage.va0
    public Object a(wa0 wa0Var, vt vtVar) {
        Object u = fp.u(new l(wa0Var, this, null, 9), vtVar);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }

    public String b() {
        return null;
    }

    @Override // defpackage.ff0
    public final va0 c(xu xuVar, int i, jk jkVar) {
        xu xuVar2 = this.e;
        xu G = xuVar.G(xuVar2);
        jk jkVar2 = jk.e;
        jk jkVar3 = this.g;
        int i2 = this.f;
        if (jkVar == jkVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            jkVar = jkVar3;
        }
        if (sn0.r(G, xuVar2) && i == i2 && jkVar == jkVar3) {
            return this;
        }
        return e(G, i, jkVar);
    }

    public abstract Object d(dj1 dj1Var, vt vtVar);

    public abstract fm e(xu xuVar, int i, jk jkVar);

    public va0 f() {
        return null;
    }

    public dm g(gv gvVar) {
        int i = this.f;
        if (i == -3) {
            i = -2;
        }
        se0 jVar = new j(this, null, 8);
        dj1 dj1Var = new dj1(io.E(gvVar, this.e), sn0.c(i, 4, this.g));
        dj1Var.g0(jv.g, dj1Var, jVar);
        return dj1Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String b = b();
        if (b != null) {
            arrayList.add(b);
        }
        j60 j60Var = j60.e;
        xu xuVar = this.e;
        if (xuVar != j60Var) {
            arrayList.add("context=" + xuVar);
        }
        int i = this.f;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        jk jkVar = jk.e;
        jk jkVar2 = this.g;
        if (jkVar2 != jkVar) {
            arrayList.add("onBufferOverflow=" + jkVar2);
        }
        return getClass().getSimpleName() + AbstractJsonLexerKt.BEGIN_LIST + wn.m0(arrayList, ", ", null, null, null, 62) + AbstractJsonLexerKt.END_LIST;
    }
}
