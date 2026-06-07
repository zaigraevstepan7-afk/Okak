package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ij1 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public ij1(long j, int i, int i2, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public static ij1 a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            ij1 ij1Var = new ij1(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return ij1Var;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ij1)) {
            ij1 ij1Var = (ij1) obj;
            if (this.b == ij1Var.b && this.c == ij1Var.c && this.a == ij1Var.a && this.d == ij1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.a), Long.valueOf(this.d));
    }
}
