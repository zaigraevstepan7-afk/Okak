package kotlinx.serialization.json.internal;

import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u000f\u0010\u0018J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u000f\u0010\u001aJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u000f\u0010\u001cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u000f\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u000f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R*\u0010$\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010 ¨\u0006)"}, d2 = {"Lkotlinx/serialization/json/internal/Composer;", "", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;)V", "Lod2;", "indent", "()V", "unIndent", "nextItem", "nextItemIfNotFirst", "space", "", "v", "print", "(C)V", "", "(Ljava/lang/String;)V", "", "(F)V", "", "(D)V", "", "(B)V", "", "(S)V", "", "(I)V", "", "(J)V", "", "(Z)V", "value", "printQuoted", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writingFirst", "Z", "getWritingFirst", "()Z", "setWritingFirst", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class Composer {
    public final InternalJsonWriter writer;
    private boolean writingFirst;

    public Composer(InternalJsonWriter internalJsonWriter) {
        internalJsonWriter.getClass();
        this.writer = internalJsonWriter;
        this.writingFirst = true;
    }

    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public void indent() {
        this.writingFirst = true;
    }

    public void nextItem() {
        this.writingFirst = false;
    }

    public void nextItemIfNotFirst() {
        this.writingFirst = false;
    }

    public void print(float v) {
        this.writer.write(String.valueOf(v));
    }

    public void printQuoted(String value) {
        value.getClass();
        this.writer.writeQuoted(value);
    }

    public final void setWritingFirst(boolean z) {
        this.writingFirst = z;
    }

    public final void print(String v) {
        v.getClass();
        this.writer.write(v);
    }

    public final void print(char v) {
        this.writer.writeChar(v);
    }

    public void print(double v) {
        this.writer.write(String.valueOf(v));
    }

    public void print(byte v) {
        this.writer.writeLong(v);
    }

    public void print(short v) {
        this.writer.writeLong(v);
    }

    public void print(int v) {
        this.writer.writeLong(v);
    }

    public void print(long v) {
        this.writer.writeLong(v);
    }

    public void print(boolean v) {
        this.writer.write(String.valueOf(v));
    }

    public void space() {
    }

    public void unIndent() {
    }
}
