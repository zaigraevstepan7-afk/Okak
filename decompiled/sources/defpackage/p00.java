package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p00 extends RuntimeException {
    public final hr e;

    public p00(hr hrVar) {
        this.e = hrVar;
        if (!hrVar.a()) {
            ArrayList C = qo.C(hrVar);
            int size = C.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
            for (int i = 0; i < size; i++) {
                stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((jr) C.get(i)).a, "SourceFile", 1);
            }
            setStackTrace(stackTraceElementArr);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        hr hrVar = this.e;
        if (hrVar.a()) {
            StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
            int i = 0;
            if (hrVar.a()) {
                vv0 v = xn.v();
                List list = hrVar.a;
                list.getClass();
                vz0 vz0Var = new vz0(list);
                int a = vz0Var.a();
                for (int i2 = 0; i2 < a; i2++) {
                    ((jr) vz0Var.get(i2)).getClass();
                }
                vv0 s = xn.s(v);
                s.getClass();
                vz0 vz0Var2 = new vz0(s);
                int a2 = vz0Var2.a();
                while (i < a2) {
                    String str = (String) vz0Var2.get(i);
                    sb.append("\tat ");
                    sb.append(str);
                    sb.append('\n');
                    i++;
                }
            } else {
                ArrayList C = qo.C(hrVar);
                int size = C.size();
                while (i < size) {
                    jr jrVar = (jr) C.get(i);
                    sb.append("\tat $$compose.m$");
                    sb.append(jrVar.a);
                    sb.append("(SourceFile:1)\n");
                    i++;
                }
            }
            return sb.toString();
        }
        return "Composition stack when thrown:";
    }
}
