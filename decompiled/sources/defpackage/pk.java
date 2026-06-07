package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface pk extends k12, ReadableByteChannel {
    boolean C(long j);

    long E(hk hkVar);

    String F();

    boolean I(long j, bl blVar);

    int J(qb1 qb1Var);

    void K(long j);

    long N();

    hk a();

    long d(long j, bl blVar);

    bl e(long j);

    byte[] h();

    InputStream inputStream();

    boolean j();

    long n();

    bl1 peek();

    String q(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    void v(hk hkVar, long j);

    String x(Charset charset);

    bl z();
}
