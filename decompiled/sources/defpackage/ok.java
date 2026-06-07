package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface ok extends ey1, WritableByteChannel {
    ok B(int i, int i2, String str);

    ok L(long j);

    hk a();

    ok f(int i);

    @Override // defpackage.ey1, java.io.Flushable
    void flush();

    long l(k12 k12Var);

    ok m();

    ok u(String str);

    ok w(bl blVar);

    ok write(byte[] bArr);

    ok write(byte[] bArr, int i, int i2);

    ok writeByte(int i);

    ok writeInt(int i);

    ok writeShort(int i);

    ok y(long j);
}
