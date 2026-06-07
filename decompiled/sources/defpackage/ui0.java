package defpackage;

import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ui0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Http2Connection f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ErrorCode h;

    public /* synthetic */ ui0(Http2Connection http2Connection, int i, ErrorCode errorCode, int i2) {
        this.e = i2;
        this.f = http2Connection;
        this.g = i;
        this.h = errorCode;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        ErrorCode errorCode = this.h;
        int i2 = this.g;
        Http2Connection http2Connection = this.f;
        switch (i) {
            case 0:
                return Http2Connection.r(http2Connection, i2, errorCode);
            default:
                return Http2Connection.c(http2Connection, i2, errorCode);
        }
    }
}
