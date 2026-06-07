package org.jsoup.helper;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@FunctionalInterface
/* loaded from: classes.dex */
public interface RequestAuthenticator {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Context {
        private final String realm;
        private final Authenticator.RequestorType type;
        private final URL url;

        public Context(URL url, Authenticator.RequestorType requestorType, String str) {
            this.url = url;
            this.type = requestorType;
            this.realm = str;
        }

        public PasswordAuthentication credentials(String str, String str2) {
            return new PasswordAuthentication(str, str2.toCharArray());
        }

        public boolean isProxy() {
            if (this.type == Authenticator.RequestorType.PROXY) {
                return true;
            }
            return false;
        }

        public boolean isServer() {
            if (this.type == Authenticator.RequestorType.SERVER) {
                return true;
            }
            return false;
        }

        public String realm() {
            return this.realm;
        }

        public Authenticator.RequestorType type() {
            return this.type;
        }

        public URL url() {
            return this.url;
        }
    }

    PasswordAuthentication authenticate(Context context);
}
