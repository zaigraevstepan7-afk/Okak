package org.jsoup;

import java.io.IOException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class HttpStatusException extends IOException {
    private final int statusCode;
    private final String url;

    public HttpStatusException(String str, int i, String str2) {
        super(str + ". Status=" + i + ", URL=[" + str2 + "]");
        this.statusCode = i;
        this.url = str2;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }
}
