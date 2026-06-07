package okhttp3.internal.connection;

import defpackage.d12;
import defpackage.lo;
import defpackage.ok;
import defpackage.pk;
import defpackage.q4;
import defpackage.yq1;
import java.net.Socket;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/net/Socket;", "Lokhttp3/internal/connection/BufferedSocket;", "asBufferedSocket", "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;", "Ld12;", "(Ld12;)Lokhttp3/internal/connection/BufferedSocket;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class BufferedSocketKt {
    public static final BufferedSocket asBufferedSocket(Socket socket) {
        socket.getClass();
        return asBufferedSocket(new q4(socket));
    }

    public static final BufferedSocket asBufferedSocket(final d12 d12Var) {
        d12Var.getClass();
        return new BufferedSocket(d12Var) { // from class: okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1
            private final d12 delegate;
            private final ok sink;
            private final pk source;

            {
                this.delegate = d12Var;
                this.source = lo.l(d12Var.getSource());
                this.sink = lo.k(d12Var.getSink());
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.d12
            public void cancel() {
                this.delegate.cancel();
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.d12
            public ok getSink() {
                return this.sink;
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.d12
            public pk getSource() {
                return this.source;
            }
        };
    }
}
