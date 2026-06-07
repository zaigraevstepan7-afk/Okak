package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class df0 extends gl implements cf0, wo0 {
    private final int arity;

    public df0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.gl
    public so0 computeReflected() {
        yl1.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof df0) {
            df0 df0Var = (df0) obj;
            if (getName().equals(df0Var.getName()) && getSignature().equals(df0Var.getSignature()) && sn0.r(getBoundReceiver(), df0Var.getBoundReceiver()) && sn0.r(getOwner(), df0Var.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof wo0)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // defpackage.cf0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.gl
    public wo0 getReflected() {
        so0 compute = compute();
        if (compute != this) {
            return (wo0) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // defpackage.wo0
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.wo0
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.wo0
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.wo0
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.wo0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        so0 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
