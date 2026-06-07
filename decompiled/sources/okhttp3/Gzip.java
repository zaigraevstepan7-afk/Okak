package okhttp3;

import defpackage.gg0;
import defpackage.k12;
import defpackage.pk;
import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.CompressionInterceptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lokhttp3/Gzip;", "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "<init>", "()V", "Lpk;", "compressedSource", "Lk12;", "decompress", "(Lpk;)Lk12;", "", "getEncoding", "()Ljava/lang/String;", "encoding", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Gzip implements CompressionInterceptor.DecompressionAlgorithm {
    public static final Gzip INSTANCE = new Gzip();

    private Gzip() {
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public k12 decompress(pk compressedSource) {
        compressedSource.getClass();
        return new gg0(compressedSource);
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public String getEncoding() {
        return "gzip";
    }
}
