package defpackage;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.elixir.loader.MainActivity;
import com.google.protobuf.DescriptorProtos;
import kotlinx.serialization.PolymorphicSerializer;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v3(f80 f80Var, f12 f12Var) {
        this.e = 11;
        this.f = f80Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        od2 sendDegradedPingLater$lambda$1;
        od2 writeOneFrame$lambda$0$0;
        od2 finishReader$lambda$0$0;
        od2 failWebSocket$lambda$0$0;
        int i = this.e;
        vt vtVar = null;
        od2 od2Var = od2.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return Float.valueOf(((c00) obj).W(125.0f));
            case 1:
                fp.I((g9) obj);
                return od2Var;
            case 2:
                return ((i62) obj).data();
            case 3:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new y(objArr);
            case 4:
                return (pl1) obj;
            case 5:
                return ConnectPlan.b((Handshake) obj);
            case 6:
                return ((gu0) obj).d();
            case 7:
                return new u72((sb1) obj, 0.0f);
            case 8:
                ((t62) obj).close();
                return od2Var;
            case 9:
                l40 l40Var = (l40) obj;
                c00 c00Var = (c00) l40Var.c.getValue();
                if (c00Var != null) {
                    dc2 dc2Var = u61.a;
                    return Float.valueOf(c00Var.W(400.0f));
                }
                y61.r("The density on DrawerState (", l40Var, ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?");
                return null;
            case 10:
                c22 c22Var = (c22) obj;
                rx.C(rx.x(c22Var), null, new a22(c22Var, vtVar, 1), 3);
                return od2Var;
            case 11:
                ((f80) obj).invoke();
                return Boolean.TRUE;
            case 12:
                return Float.valueOf(((mh0) ((sh0) obj)).a);
            case 13:
                sendDegradedPingLater$lambda$1 = Http2Connection.sendDegradedPingLater$lambda$1((Http2Connection) obj);
                return sendDegradedPingLater$lambda$1;
            case 14:
                return Float.valueOf(yq1.r(((gv) obj).A()));
            case 15:
                Object systemService = ((View) ((sl0) obj).e).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 16:
                return Integer.valueOf(((st0) obj).i().n);
            case 17:
                return new BaseInputConnection(((hu0) obj).a, false);
            case 18:
                ((i22) obj).c(null);
                return od2Var;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                int i2 = MainActivity.x;
                ((sl1) obj).e = false;
                return od2Var;
            case 20:
                ((k11) obj).i.invoke();
                return od2Var;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return (w21) fc2.B(((dm) obj).d());
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                f51 f51Var = ((d51) obj).l;
                if (f51Var.i) {
                    if (f51Var.j.c != nu0.e) {
                        return ((e51) wm1.i(f51Var.a, (pg2) f51Var.m.getValue(), 4).j(yl1.a(e51.class))).b;
                    }
                    se.p("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                se.p("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                return null;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new p51((String) obj);
            case 24:
                return new f20(lo.Q(24.0f, 16.0f, ((l72) obj).invoke()));
            case 25:
                return PolymorphicSerializer.a((PolymorphicSerializer) obj);
            case 26:
                float f = 1.0f;
                if (((ia0) obj).invoke() < 1.0f) {
                    f = 0.3f;
                }
                return Float.valueOf(f);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                writeOneFrame$lambda$0$0 = RealWebSocket.writeOneFrame$lambda$0$0((RealWebSocket) obj);
                return writeOneFrame$lambda$0$0;
            case 28:
                finishReader$lambda$0$0 = RealWebSocket.finishReader$lambda$0$0((WebSocketWriter) obj);
                return finishReader$lambda$0$0;
            default:
                failWebSocket$lambda$0$0 = RealWebSocket.failWebSocket$lambda$0$0((wl1) obj);
                return failWebSocket$lambda$0$0;
        }
    }

    public /* synthetic */ v3(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
