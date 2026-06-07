package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e12 extends kf {
    public final Socket a;

    public e12(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.kf
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.kf
    public final void timedOut() {
        Socket socket = this.a;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (zj2.a(e)) {
                zj2.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            zj2.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
