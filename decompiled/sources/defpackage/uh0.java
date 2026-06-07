package defpackage;

import com.elixir.loader.UserSettings;
import com.elixir.loader.data.api.releases.VersionResponse;
import com.google.protobuf.DescriptorProtos;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uh0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ bi0 f;

    public /* synthetic */ uh0(bi0 bi0Var, int i) {
        this.e = i;
        this.f = bi0Var;
    }

    @Override // defpackage.wa0
    public final Object b(Object obj, vt vtVar) {
        String str;
        Object obj2;
        Object value;
        int i = this.e;
        od2 od2Var = od2.a;
        bi0 bi0Var = this.f;
        switch (i) {
            case 0:
                String selectedRelease = ((UserSettings) obj).getSelectedRelease();
                r22 r22Var = bi0Var.k;
                if (selectedRelease.length() == 0) {
                    str = null;
                } else {
                    str = selectedRelease;
                }
                r22Var.j(str);
                boolean z = true;
                if (bi0Var.s != null && selectedRelease.length() > 0) {
                    r22 r22Var2 = bi0Var.m;
                    Boolean valueOf = Boolean.valueOf(!r7.equals(selectedRelease));
                    r22Var2.getClass();
                    r22Var2.k(null, valueOf);
                }
                r22 r22Var3 = bi0Var.o;
                List list = bi0Var.t;
                if (list != null) {
                    if (selectedRelease.length() == 0) {
                        Boolean bool = Boolean.FALSE;
                        r22Var3.getClass();
                        r22Var3.k(null, bool);
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (sn0.r(((VersionResponse) obj2).getVersion(), selectedRelease)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        VersionResponse versionResponse = (VersionResponse) obj2;
                        if (versionResponse == null || System.currentTimeMillis() - versionResponse.getUploadDate() <= 604800000) {
                            z = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z);
                        r22Var3.getClass();
                        r22Var3.k(null, valueOf2);
                    }
                }
                return od2Var;
            default:
                String str2 = (String) obj;
                r22 r22Var4 = bi0Var.i;
                do {
                    value = r22Var4.getValue();
                } while (!r22Var4.i(value, wn.y0(DescriptorProtos.Edition.EDITION_2023_VALUE, wn.r0((List) value, str2))));
                return od2Var;
        }
    }
}
