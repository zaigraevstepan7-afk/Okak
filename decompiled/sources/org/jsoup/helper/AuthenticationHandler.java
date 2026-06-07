package org.jsoup.helper;

import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import org.jsoup.helper.RequestAuthenticator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class AuthenticationHandler extends Authenticator {
    static final int MaxAttempts = 5;
    static AuthShim handler;
    int attemptCount = 0;
    RequestAuthenticator auth;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface AuthShim {
        void enable(RequestAuthenticator requestAuthenticator, HttpURLConnection httpURLConnection);

        AuthenticationHandler get(AuthenticationHandler authenticationHandler);

        void remove();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class GlobalHandler implements AuthShim {
        static ThreadLocal<AuthenticationHandler> authenticators = new ThreadLocal<>();

        static {
            Authenticator.setDefault(new AuthenticationHandler());
        }

        @Override // org.jsoup.helper.AuthenticationHandler.AuthShim
        public void enable(RequestAuthenticator requestAuthenticator, HttpURLConnection httpURLConnection) {
            authenticators.set(new AuthenticationHandler(requestAuthenticator));
        }

        @Override // org.jsoup.helper.AuthenticationHandler.AuthShim
        public AuthenticationHandler get(AuthenticationHandler authenticationHandler) {
            return authenticators.get();
        }

        @Override // org.jsoup.helper.AuthenticationHandler.AuthShim
        public void remove() {
            authenticators.remove();
        }
    }

    static {
        try {
            handler = (AuthShim) Class.forName("org.jsoup.helper.RequestAuthHandler").getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            handler = new GlobalHandler();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public AuthenticationHandler(RequestAuthenticator requestAuthenticator) {
        this.auth = requestAuthenticator;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        AuthenticationHandler authenticationHandler = handler.get(this);
        if (authenticationHandler == null) {
            return null;
        }
        int i = authenticationHandler.attemptCount + 1;
        authenticationHandler.attemptCount = i;
        if (i > 5 || authenticationHandler.auth == null) {
            return null;
        }
        return authenticationHandler.auth.authenticate(new RequestAuthenticator.Context(getRequestingURL(), getRequestorType(), getRequestingPrompt()));
    }

    public AuthenticationHandler() {
    }
}
