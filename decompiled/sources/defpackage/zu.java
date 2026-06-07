package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class zu extends w implements vu {
    public static final yu f = new yu(g3.y, new p1(20));

    public zu() {
        super(g3.y);
    }

    @Override // defpackage.w, defpackage.xu
    public final vu H(wu wuVar) {
        vu vuVar;
        wuVar.getClass();
        if (wuVar instanceof yu) {
            yu yuVar = (yu) wuVar;
            wu wuVar2 = this.e;
            if ((wuVar2 == yuVar || yuVar.f == wuVar2) && (vuVar = (vu) yuVar.e.invoke(this)) != null) {
                return vuVar;
            }
        } else if (g3.y == wuVar) {
            return this;
        }
        return null;
    }

    public abstract void P(xu xuVar, Runnable runnable);

    public boolean Q(xu xuVar) {
        return !(this instanceof id2);
    }

    public zu R(int i) {
        io.o(i);
        return new dv0(this, i);
    }

    @Override // defpackage.w, defpackage.xu
    public final xu s(wu wuVar) {
        wuVar.getClass();
        if (wuVar instanceof yu) {
            yu yuVar = (yu) wuVar;
            wu wuVar2 = this.e;
            if (wuVar2 != yuVar && yuVar.f != wuVar2) {
                return this;
            }
            if (((vu) yuVar.e.invoke(this)) == null) {
                return this;
            }
        } else if (g3.y != wuVar) {
            return this;
        }
        return j60.e;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + rx.w(this);
    }
}
