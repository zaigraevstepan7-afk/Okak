package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class gl implements so0, Serializable {
    public static final Object NO_RECEIVER = fl.e;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient so0 reflected;
    private final String signature;

    public gl(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.so0
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.so0
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public so0 compute() {
        so0 so0Var = this.reflected;
        if (so0Var == null) {
            so0 computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return so0Var;
    }

    public abstract so0 computeReflected();

    @Override // defpackage.ro0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public vo0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            yl1.a.getClass();
            return new mc1(cls);
        }
        return yl1.a(cls);
    }

    @Override // defpackage.so0
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract so0 getReflected();

    @Override // defpackage.so0
    public fp0 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.so0
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.so0
    public hp0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.so0
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.so0
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.so0
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
