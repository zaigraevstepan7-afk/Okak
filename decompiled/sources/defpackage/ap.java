package defpackage;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ap implements xu, Serializable {
    public final xu e;
    public final vu f;

    public ap(vu vuVar, xu xuVar) {
        xuVar.getClass();
        vuVar.getClass();
        this.e = xuVar;
        this.f = vuVar;
    }

    @Override // defpackage.xu
    public final xu G(xu xuVar) {
        xuVar.getClass();
        if (xuVar == j60.e) {
            return this;
        }
        return (xu) xuVar.p(new le(17), this);
    }

    @Override // defpackage.xu
    public final vu H(wu wuVar) {
        wuVar.getClass();
        while (true) {
            vu H = this.f.H(wuVar);
            if (H != null) {
                return H;
            }
            xu xuVar = this.e;
            if (xuVar instanceof ap) {
                this = (ap) xuVar;
            } else {
                return xuVar.H(wuVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof ap) {
                ap apVar = (ap) obj;
                int i = 2;
                ap apVar2 = apVar;
                int i2 = 2;
                while (true) {
                    xu xuVar = apVar2.e;
                    if (xuVar instanceof ap) {
                        apVar2 = (ap) xuVar;
                    } else {
                        apVar2 = null;
                    }
                    if (apVar2 == null) {
                        break;
                    }
                    i2++;
                }
                ap apVar3 = this;
                while (true) {
                    xu xuVar2 = apVar3.e;
                    if (xuVar2 instanceof ap) {
                        apVar3 = (ap) xuVar2;
                    } else {
                        apVar3 = null;
                    }
                    if (apVar3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        vu vuVar = this.f;
                        if (!sn0.r(apVar.H(vuVar.getKey()), vuVar)) {
                            z = false;
                            break;
                        }
                        xu xuVar3 = this.e;
                        if (xuVar3 instanceof ap) {
                            this = (ap) xuVar3;
                        } else {
                            xuVar3.getClass();
                            vu vuVar2 = (vu) xuVar3;
                            z = sn0.r(apVar.H(vuVar2.getKey()), vuVar2);
                            break;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + this.e.hashCode();
    }

    @Override // defpackage.xu
    public final Object p(se0 se0Var, Object obj) {
        return se0Var.invoke(this.e.p(se0Var, obj), this.f);
    }

    @Override // defpackage.xu
    public final xu s(wu wuVar) {
        wuVar.getClass();
        vu vuVar = this.f;
        vu H = vuVar.H(wuVar);
        xu xuVar = this.e;
        if (H != null) {
            return xuVar;
        }
        xu s = xuVar.s(wuVar);
        if (s == xuVar) {
            return this;
        }
        if (s == j60.e) {
            return vuVar;
        }
        return new ap(vuVar, s);
    }

    public final String toString() {
        return "[" + ((String) p(new le(1), "")) + AbstractJsonLexerKt.END_LIST;
    }
}
