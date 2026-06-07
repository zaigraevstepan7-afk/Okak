package defpackage;

import android.graphics.drawable.Drawable;
import com.google.protobuf.DescriptorProtos;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.modules.SerializersModuleCollector;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class hh1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hh1(hh1 hh1Var, k kVar) {
        this.e = 19;
        this.f = hh1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        gu0 gu0Var;
        KSerializer contextual$lambda$0;
        int i = this.e;
        boolean z = true;
        int i2 = 0;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return PluginGeneratedSerialDescriptorKt.a((SerialDescriptor) obj2, ((Integer) obj).intValue());
            case 1:
                return PolymorphicSerializer.b((PolymorphicSerializer) obj2, (ClassSerialDescriptorBuilder) obj);
            case 2:
                ia0 ia0Var = (ia0) obj2;
                av1 av1Var = (av1) obj;
                if (ia0Var.invoke() > 0.0f) {
                    xu1.d(av1Var, new kj1(ia0Var.invoke(), new rn(0.0f, 1.0f)));
                }
                return od2.a;
            case 3:
                ((ds) obj2).z(obj);
                return od2.a;
            case 4:
                jl1 jl1Var = (jl1) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (jl1Var.c) {
                    try {
                        go0 go0Var = jl1Var.d;
                        if (go0Var != null) {
                            r22 r22Var = jl1Var.u;
                            gl1 gl1Var = gl1.f;
                            r22Var.getClass();
                            r22Var.k(null, gl1Var);
                            go0Var.c(cancellationException);
                            jl1Var.r = null;
                            go0Var.r(new fl1(i2, jl1Var, th));
                        } else {
                            jl1Var.e = cancellationException;
                            r22 r22Var2 = jl1Var.u;
                            gl1 gl1Var2 = gl1.e;
                            r22Var2.getClass();
                            r22Var2.k(null, gl1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return od2.a;
            case 5:
                ((ml1) obj2).a((h50) obj);
                return od2.a;
            case 6:
                oq1 oq1Var = ((mq1) obj2).g;
                if (oq1Var != null) {
                    z = oq1Var.c(obj);
                }
                return Boolean.valueOf(z);
            case 7:
                fs1 fs1Var = (fs1) obj2;
                float floatValue = ((Float) obj).floatValue();
                ge1 ge1Var = fs1Var.a;
                float g = ge1Var.g() + floatValue + fs1Var.f;
                float o = go.o(g, 0.0f, fs1Var.e.g());
                if (g != o) {
                    z = false;
                }
                float g2 = o - ge1Var.g();
                int round = Math.round(g2);
                ge1Var.h(ge1Var.g() + round);
                fs1Var.f = g2 - round;
                if (!z) {
                    floatValue = g2;
                }
                return Float.valueOf(floatValue);
            case 8:
                at1 at1Var = (at1) obj2;
                return new z81(at1Var.c(at1Var.k, ((z81) obj).a, at1Var.j));
            case 9:
                cy1 cy1Var = (cy1) obj2;
                qh1 qh1Var = (qh1) obj;
                long j = qh1Var.c;
                b82 b82Var = (b82) cy1Var.d;
                if (b82Var.k() && b82Var.n().a.f.length() != 0 && (gu0Var = b82Var.d) != null && gu0Var.d() != null) {
                    cy1Var.c(b82Var.n(), j, false, xl1.j);
                } else {
                    z = false;
                }
                if (z) {
                    qh1Var.a();
                }
                return od2.a;
            case 10:
                obj.getClass();
                return ((h2) obj2).invoke();
            case 11:
                contextual$lambda$0 = SerializersModuleCollector.contextual$lambda$0((KSerializer) obj2, (List) obj);
                return contextual$lambda$0;
            case 12:
                return Boolean.valueOf(sn0.r(((x80) obj).a, (pz1) obj2));
            case 13:
                j41 j41Var = (j41) obj2;
                if (obj instanceof v22) {
                    ((v22) obj).f(4);
                }
                j41Var.a(obj);
                return od2.a;
            case 14:
                c12 c12Var = (c12) obj2;
                synchronized (c12Var.g) {
                    b12 b12Var = c12Var.i;
                    b12Var.getClass();
                    Object obj3 = b12Var.b;
                    obj3.getClass();
                    int i3 = b12Var.d;
                    x31 x31Var = b12Var.c;
                    if (x31Var == null) {
                        x31Var = new x31();
                        b12Var.c = x31Var;
                        b12Var.f.m(obj3, x31Var);
                    }
                    b12Var.b(obj, i3, obj3, x31Var);
                }
                return od2.a;
            case 15:
                float floatValue2 = ((Float) obj).floatValue();
                r22 r22Var3 = ((c22) obj2).g;
                y12 y12Var = new y12(floatValue2);
                r22Var3.getClass();
                r22Var3.k(null, y12Var);
                return od2.a;
            case 16:
                fc fcVar = (fc) obj;
                ((se0) obj2).invoke(fcVar.e.getValue(), f2.A.b.invoke(fcVar.f));
                return od2.a;
            case 17:
                Drawable drawable = (Drawable) obj2;
                c40 c40Var = (c40) obj;
                tl h = c40Var.b0().h();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (c40Var.d() >> 32)), (int) Float.intBitsToFloat((int) (c40Var.d() & 4294967295L)));
                drawable.draw(v4.a(h));
                return od2.a;
            case 18:
                ((oe0) obj).invoke((f62) obj2);
                return od2.a;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                hh1 hh1Var = (hh1) obj2;
                ub2 ub2Var = (ub2) obj;
                if (ub2Var instanceof r2) {
                    hh1Var.invoke(((r2) ub2Var).s);
                    return Boolean.TRUE;
                }
                se.p("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 20:
                u72 u72Var = (u72) obj2;
                float floatValue3 = ((Float) obj).floatValue();
                fe1 fe1Var = u72Var.a;
                float g3 = fe1Var.g() + floatValue3;
                fe1 fe1Var2 = u72Var.b;
                if (g3 > fe1Var2.g()) {
                    floatValue3 = fe1Var2.g() - fe1Var.g();
                } else if (g3 < 0.0f) {
                    floatValue3 = -fe1Var.g();
                }
                fe1Var.h(fe1Var.g() + floatValue3);
                return Float.valueOf(floatValue3);
            default:
                return TripleSerializer.a((TripleSerializer) obj2, (ClassSerialDescriptorBuilder) obj);
        }
    }

    public /* synthetic */ hh1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
