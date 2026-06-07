package defpackage;

import com.topjohnwu.superuser.Shell;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sx0 extends q42 implements se0 {
    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        return new q42(2, vtVar);
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((sx0) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        String obj2;
        List list;
        io.K(obj);
        Shell.Result exec = Shell.cmd("pidof elixir_executable").exec();
        exec.getClass();
        if (exec.isSuccess()) {
            List<String> out = exec.getOut();
            out.getClass();
            String str = (String) wn.h0(out);
            if (str != null && (obj2 = i32.Y(str).toString()) != null) {
                Pattern compile = Pattern.compile("\\s+");
                compile.getClass();
                Matcher matcher = compile.matcher(obj2);
                if (!matcher.find()) {
                    list = xn.E(obj2.toString());
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    int i = 0;
                    do {
                        arrayList.add(obj2.subSequence(i, matcher.start()).toString());
                        i = matcher.end();
                    } while (matcher.find());
                    arrayList.add(obj2.subSequence(i, obj2.length()).toString());
                    list = arrayList;
                }
                return (String) wn.h0(list);
            }
            return null;
        }
        return null;
    }
}
