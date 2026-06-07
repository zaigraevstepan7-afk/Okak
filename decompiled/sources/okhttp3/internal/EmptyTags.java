package okhttp3.internal;

import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/Tags;", "<init>", "()V", "", "T", "Lto0;", "key", "value", "plus", "(Lto0;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lto0;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EmptyTags extends Tags {
    public static final EmptyTags INSTANCE = new EmptyTags();

    private EmptyTags() {
        super(null);
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(to0 key) {
        key.getClass();
        return null;
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(to0 key, T value) {
        key.getClass();
        if (value != null) {
            return new LinkedTags(key, value, this);
        }
        return this;
    }

    public String toString() {
        return "{}";
    }
}
